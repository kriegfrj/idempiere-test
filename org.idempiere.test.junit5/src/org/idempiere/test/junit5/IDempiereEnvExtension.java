package org.idempiere.test.junit5;

import static org.osgi.test.common.inject.FieldInjector.assertFieldIsOfType;
import static org.osgi.test.common.inject.FieldInjector.assertParameterIsOfType;
import static org.osgi.test.common.inject.FieldInjector.findAnnotatedFields;
import static org.osgi.test.common.inject.FieldInjector.findAnnotatedNonStaticFields;
import static org.osgi.test.common.inject.FieldInjector.setField;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.List;

import org.idempiere.test.common.annotation.IDempiereEnvParameter;
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

public class IDempiereEnvExtension implements BeforeAllCallback, BeforeEachCallback, AfterEachCallback, ParameterResolver {

	private static final Object IDEMPIERE_ENV_KEY = "idempiere.env";
	
	private final IDempiereEnv.Builder builder;
	
	public IDempiereEnvExtension() {
		this.builder = new IDempiereEnv.Builder();
	}
	
	public IDempiereEnvExtension(IDempiereEnv.Builder builder) {
		this.builder = builder;
	}

	@Override
	public void beforeAll(ExtensionContext extensionContext) throws Exception {
		List<Field> fields = findAnnotatedFields(extensionContext.getRequiredTestClass(), IDempiereEnvParameter.class,
			m -> Modifier.isStatic(m.getModifiers()));

		fields.forEach(field -> {
			assertFieldIsOfType(field, IDempiereEnv.class, IDempiereEnvParameter.class,
					ExtensionConfigurationException::new);
			setField(field, null, getIDempiereEnvOrComputeIfAbsent(extensionContext));
		});
	}

	private class CloseableEnv implements CloseableResource {

		private final IDempiereEnv env;
		
		public CloseableEnv(ExtensionContext extensionContext) {
			IDempiereEnv parentEnv = extensionContext.getParent()
					.filter(context -> context.getTestClass()
						.isPresent())
					.map(IDempiereEnvExtension::getIDempiereEnv)
					.map(CloseableEnv::getEnv)
					.orElse(null);
			builder.withParent(parentEnv);
			this.env = builder.build();
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
		return extensionContext
			.getStore(Namespace.create(IDempiereEnvExtension.class, extensionContext.getUniqueId()));
	}
	
	@Override
	public void beforeEach(ExtensionContext context) throws Exception {
		List<Field> fields;
		for (Object instance : context.getRequiredTestInstances()
			.getAllInstances()) {
			final Class<?> testClass = instance.getClass();
			fields = findAnnotatedNonStaticFields(testClass, IDempiereEnvParameter.class);

			fields.forEach(field -> {
				assertFieldIsOfType(field, IDempiereEnv.class, IDempiereEnvParameter.class,
					ExtensionConfigurationException::new);
				setField(field, instance, getIDempiereEnvOrComputeIfAbsent(context));
			});
		}
	}
	
	@Override
	public void afterEach(ExtensionContext context) throws Exception {
		cleanup(context);
//		env.getEnv().getSoftly().assertAll();
	}
	
	public IDempiereEnv getIDempiereEnvOrComputeIfAbsent(ExtensionContext extensionContext) {
		return getStore(extensionContext)
			.getOrComputeIfAbsent(IDEMPIERE_ENV_KEY,
				key -> new CloseableEnv(extensionContext),
				CloseableEnv.class)
			.getEnv();
	}
	
	private static CloseableEnv getIDempiereEnv(ExtensionContext extensionContext) {
		return getStore(extensionContext)
			.get(IDEMPIERE_ENV_KEY,	CloseableEnv.class);
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
		if (!parameterContext.isAnnotated(IDempiereEnvParameter.class)) {
			return false;
		}
		assertParameterIsOfType(parameterContext.getParameter().getType(), IDempiereEnv.class, IDempiereEnvParameter.class, ParameterResolutionException::new);
		return true;
	}

	@Override
	public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext)
			throws ParameterResolutionException {
		// TODO Auto-generated method stub
		return null;
	}
}
