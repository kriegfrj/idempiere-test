package org.idempiere.test.junit5;

import static org.osgi.test.common.inject.FieldInjector.assertFieldIsOfType;
import static org.osgi.test.common.inject.FieldInjector.assertParameterIsOfType;
import static org.osgi.test.common.inject.FieldInjector.findAnnotatedFields;
import static org.osgi.test.common.inject.FieldInjector.findAnnotatedNonStaticFields;
import static org.osgi.test.common.inject.FieldInjector.setField;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.List;

import org.idempiere.test.common.annotation.InjectIDempiereEnv;
import org.idempiere.test.common.env.IDempiereEnv;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionConfigurationException;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ExtensionContext.Namespace;
import org.junit.jupiter.api.extension.ExtensionContext.Store;
import org.junit.jupiter.api.extension.ExtensionContext.Store.CloseableResource;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;
import org.junit.platform.commons.util.ExceptionUtils;

public class IDempiereEnvExtension
		implements BeforeAllCallback, BeforeEachCallback, AfterEachCallback, ParameterResolver {

	private static final Object IDEMPIERE_ENV_KEY = "idempiere.env";

	@Override
	public void beforeAll(ExtensionContext extensionContext) throws Exception {
		List<Field> fields = findAnnotatedFields(extensionContext.getRequiredTestClass(), InjectIDempiereEnv.class,
				m -> Modifier.isStatic(m.getModifiers()));

		fields.forEach(field -> {
			assertFieldIsOfType(field, IDempiereEnv.class, InjectIDempiereEnv.class,
					ExtensionConfigurationException::new);
			InjectIDempiereEnv parameters = field.getAnnotation(InjectIDempiereEnv.class);
			setField(field, null, getIDempiereEnvOrComputeIfAbsent(extensionContext, parameters));
		});
	}

	private static class CloseableEnv implements CloseableResource {

		private final IDempiereEnv env;

		public CloseableEnv(ExtensionContext extensionContext, InjectIDempiereEnv parameters) {
			System.err.println("parentEnv: " + extensionContext.getParent().get().getTestClass());
			IDempiereEnv parentEnv = extensionContext.getParent().filter(context -> context.getTestClass().isPresent())
					.map(IDempiereEnvExtension::getIDempiereEnv).map(CloseableEnv::getEnv).orElse(null);
			System.err.println("Setting clientId: " + parameters.clientId());
			env = IDempiereEnv.newEnv().withParameters(parameters).withParent(parentEnv).build();
			try {
				env.before();
			} catch (Exception e) {
				throw ExceptionUtils.throwAsUncheckedException(e);
			}
		}

		@Override
		public void close() throws Exception {
			env.close();
		}

		public IDempiereEnv getEnv() {
			return env;
		}

	}

	static Store getStore(ExtensionContext extensionContext) {
		System.err.println("extension: " + extensionContext.getDisplayName() + ", " + extensionContext.getUniqueId());
		return extensionContext.getStore(Namespace.create(IDempiereEnvExtension.class, extensionContext.getUniqueId()));
	}

	@Override
	public void beforeEach(ExtensionContext context) throws Exception {
		List<Field> fields;
		for (Object instance : context.getRequiredTestInstances().getAllInstances()) {
			final Class<?> testClass = instance.getClass();
			fields = findAnnotatedNonStaticFields(testClass, InjectIDempiereEnv.class);

			fields.forEach(field -> {
				assertFieldIsOfType(field, IDempiereEnv.class, InjectIDempiereEnv.class,
						ExtensionConfigurationException::new);
				System.err.println("Injecting: " + field.getName() + ", " + field);
				InjectIDempiereEnv parameters = field.getAnnotation(InjectIDempiereEnv.class);
				IDempiereEnv env = getIDempiereEnvOrComputeIfAbsent(context, parameters);
				System.err.println("Injecting: " + field.getName() + ", " + field + ", env: " + env + ", parent: " + env.getParentEnv());
				setField(field, instance, getIDempiereEnvOrComputeIfAbsent(context, parameters));
			});
		}
	}

	@Override
	public void afterEach(ExtensionContext context) throws Exception {
		cleanup(context);
//		env.getEnv().getSoftly().assertAll();
	}

	public IDempiereEnv getIDempiereEnvOrComputeIfAbsent(ExtensionContext extensionContext,
			InjectIDempiereEnv parameters) {
		return getStore(extensionContext).getOrComputeIfAbsent(IDEMPIERE_ENV_KEY,
				key -> new CloseableEnv(extensionContext, parameters), CloseableEnv.class).getEnv();
	}

	private static CloseableEnv getIDempiereEnv(ExtensionContext extensionContext) {
		return getStore(extensionContext).get(IDEMPIERE_ENV_KEY, CloseableEnv.class);
	}

	public static void cleanup(ExtensionContext extensionContext) throws Exception {
		CloseableEnv closeableEnv = getIDempiereEnv(extensionContext);
		if (closeableEnv != null) {
			closeableEnv.close();
		}
	}

	@Override
	public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext)
			throws ParameterResolutionException {
		if (!parameterContext.isAnnotated(InjectIDempiereEnv.class)) {
			return false;
		}
		assertParameterIsOfType(parameterContext.getParameter().getType(), IDempiereEnv.class, InjectIDempiereEnv.class,
				ParameterResolutionException::new);
		return true;
	}

	@Override
	public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext)
			throws ParameterResolutionException {
		Class<?> parameterType = parameterContext.getParameter().getType();
		System.err.println("parameterType: " + parameterType);
		System.err.println("parameterHaje: " + parameterContext.getParameter().getName());

		if (parameterContext.isAnnotated(InjectIDempiereEnv.class)) {
			System.err.println("parameterHaje: " + parameterContext.getParameter().getName());
			assertParameterIsOfType(parameterType, IDempiereEnv.class, InjectIDempiereEnv.class,
					ParameterResolutionException::new);
			InjectIDempiereEnv parameters = parameterContext.findAnnotation(InjectIDempiereEnv.class).orElseThrow(() -> new ParameterResolutionException(parameterContext.getParameter().getName() + " was missing @InjectIDempiereEnv"));
			return getIDempiereEnvOrComputeIfAbsent(extensionContext, parameters);
		}

		throw new ExtensionConfigurationException("No parameter types known to IDempiereEnvExtension were found");
	}
}
