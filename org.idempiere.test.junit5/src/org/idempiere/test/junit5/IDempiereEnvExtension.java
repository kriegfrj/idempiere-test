package org.idempiere.test.junit5;

import static org.junit.platform.commons.support.HierarchyTraversalMode.TOP_DOWN;
import static org.junit.platform.commons.support.ReflectionSupport.findFields;
import static org.junit.platform.commons.util.ReflectionUtils.isPrivate;
import static org.junit.platform.commons.util.ReflectionUtils.makeAccessible;

import java.lang.reflect.Field;

import org.idempiere.test.common.env.IDempiereEnv;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionConfigurationException;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ExtensionContext.Namespace;
import org.junit.platform.commons.util.ExceptionUtils;

public class IDempiereEnvExtension implements BeforeEachCallback, AfterEachCallback {

	private static final Namespace IDEMPIERE_ENV_EXTENSION_NAMESPACE = Namespace.create(IDempiereEnvExtension.class);
	
	private final IDempiereEnv.Builder builder;
	
	public IDempiereEnvExtension(IDempiereEnv.Builder builder) {
		this.builder = builder;
	}
	
	private void assertValidFieldCandidate(Field field) {
		if (isPrivate(field)) {
			throw new ExtensionConfigurationException("@IDempiereEnvParameter field [" + field + "] must not be private.");
		}
	}
	
	private void injectFields(ExtensionContext extensionContext, Object testInstance, IDempiereEnv instance) {
		findFields(extensionContext.getRequiredTestClass(), x -> IDempiereEnv.class.isAssignableFrom(x.getType()), TOP_DOWN)
			.forEach(field -> {
				assertValidFieldCandidate(field);
				if (!field.getType()
					.equals(IDempiereEnv.class)) {
					throw new ExtensionConfigurationException("@IDempiereEnvParameter field must be of type " + IDempiereEnv.class.getCanonicalName() + ", was " + field.getType().getCanonicalName());
				}
				try {
					makeAccessible(field).set(testInstance, instance);
				} catch (Throwable t) {
					ExceptionUtils.throwAsUncheckedException(t);
				}
			});
	}

	private class CloseableEnv implements ExtensionContext.Store.CloseableResource {

		private final IDempiereEnv env;
		
		public CloseableEnv(IDempiereEnv env) throws Exception {
			this.env = env;
			env.before();
		}
		
		@Override
		public void close() throws Throwable {
			env.close();
		}

		public IDempiereEnv getEnv() {
			return env;
		}
		
	}
	
	private CloseableEnv build(Class<CloseableEnv> k) {
		try {
			return new CloseableEnv(builder.build());
		} catch (Exception e) {
			throw ExceptionUtils.throwAsUncheckedException(e);
		}
	}
	
	@Override
	public void beforeEach(ExtensionContext context) throws Exception {
		CloseableEnv env = context.getStore(IDEMPIERE_ENV_EXTENSION_NAMESPACE).getOrComputeIfAbsent(CloseableEnv.class, this::build, CloseableEnv.class);
		injectFields(context, context.getRequiredTestInstance(), env.getEnv());
	}
	
	@Override
	public void afterEach(ExtensionContext context) throws Exception {
		CloseableEnv env = context.getStore(IDEMPIERE_ENV_EXTENSION_NAMESPACE).getOrComputeIfAbsent(CloseableEnv.class, this::build, CloseableEnv.class);
		env.getEnv().getSoftly().assertAll();
	}
}
