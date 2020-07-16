package org.idempiere.test.junit5;

import static org.osgi.test.common.inject.FieldInjector.assertFieldIsOfType;
import static org.osgi.test.common.inject.FieldInjector.assertParameterIsOfType;
import static org.osgi.test.common.inject.FieldInjector.findAnnotatedFields;
import static org.osgi.test.common.inject.FieldInjector.findAnnotatedNonStaticFields;
import static org.osgi.test.common.inject.FieldInjector.setField;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Optional;

import org.assertj.core.api.SoftAssertionsProvider;
import org.assertj.core.api.junit.jupiter.SoftAssertionsExtension;
import org.idempiere.test.common.annotation.InjectIDempiereEnv;
import org.idempiere.test.common.env.IDempiereEnv;
import org.junit.jupiter.api.extension.AfterAllCallback;
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
import org.junit.platform.engine.UniqueId;

public class IDempiereEnvExtension
		implements BeforeAllCallback, BeforeEachCallback, AfterAllCallback, AfterEachCallback, ParameterResolver {

	private static final Object IDEMPIERE_ENV_KEY = "idempiere.env";

	@Override
	public void beforeAll(ExtensionContext extensionContext) throws Exception {
		if (extensionContext.getTestInstance().isPresent()) {
			beforeEach(extensionContext);
		} else {
			List<Field> fields = findAnnotatedFields(extensionContext.getRequiredTestClass(), InjectIDempiereEnv.class,
					m -> Modifier.isStatic(m.getModifiers()));

			fields.forEach(field -> {
				assertFieldIsOfType(field, IDempiereEnv.class, InjectIDempiereEnv.class,
						ExtensionConfigurationException::new);
				InjectIDempiereEnv parameters = field.getAnnotation(InjectIDempiereEnv.class);
				setField(field, null, getIDempiereEnvOrComputeIfAbsent(extensionContext, parameters));
			});
		}
	}

	private static final Namespace SOFT_ASSERTIONS_EXTENSION_NAMESPACE = Namespace
			.create(SoftAssertionsExtension.class);

	private static class CloseableEnv implements CloseableResource {

		private final IDempiereEnv env;

		public CloseableEnv(ExtensionContext extensionContext, InjectIDempiereEnv parameters) {
			Optional<ExtensionContext> current = extensionContext.getParent();
			CloseableEnv parentCloseableEnv = null;
			while (current.isPresent()) {
				parentCloseableEnv = getIDempiereEnv(current.get());
				if (parentCloseableEnv != null) {
					break;
				}
				current = current.get().getParent();
			}
			IDempiereEnv parentEnv = parentCloseableEnv == null ? null : parentCloseableEnv.getEnv();
			SoftAssertionsProvider provider = extensionContext.getStore(SOFT_ASSERTIONS_EXTENSION_NAMESPACE)
					.get(SoftAssertionsProvider.class, SoftAssertionsProvider.class);

			env = IDempiereEnv.newEnv().withParameters(parameters).withParent(parentEnv).withSoftAssertions(provider)
					.withClassName(extensionContext.getTestClass().map(Class::getName).orElse(null))
					.withMethodName(extensionContext.getTestMethod().map(Method::getName).orElse(null))
					.build();
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
				InjectIDempiereEnv parameters = field.getAnnotation(InjectIDempiereEnv.class);
				setField(field, instance, getIDempiereEnvOrComputeIfAbsent(context, parameters));
			});
		}
	}

	@Override
	public void afterEach(ExtensionContext context) throws Exception {
		cleanup(context);
	}

	@Override
	public void afterAll(ExtensionContext context) throws Exception {
		cleanup(context);
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

		if (parameterContext.isAnnotated(InjectIDempiereEnv.class)) {
			assertParameterIsOfType(parameterType, IDempiereEnv.class, InjectIDempiereEnv.class,
					ParameterResolutionException::new);
			InjectIDempiereEnv parameters = parameterContext.findAnnotation(InjectIDempiereEnv.class)
					.orElseThrow(() -> new ParameterResolutionException(
							parameterContext.getParameter().getName() + " was missing @InjectIDempiereEnv"));
			return getIDempiereEnvOrComputeIfAbsent(extensionContext, parameters);
		}

		throw new ExtensionConfigurationException("No parameter types known to IDempiereEnvExtension were found");
	}
}
