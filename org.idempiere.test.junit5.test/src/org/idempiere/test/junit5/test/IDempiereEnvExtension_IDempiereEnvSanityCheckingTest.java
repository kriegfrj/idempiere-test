package org.idempiere.test.junit5.test;

import static org.idempiere.test.junit5.testutils.TestKitUtils.assertThatTest;

import org.idempiere.test.common.annotation.IDempiereEnvParameter;
import org.idempiere.test.common.env.IDempiereEnv;
import org.idempiere.test.junit5.IDempiereEnvExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionConfigurationException;
import org.junit.jupiter.api.extension.ParameterResolutionException;

public class IDempiereEnvExtension_IDempiereEnvSanityCheckingTest {

	@ExtendWith(IDempiereEnvExtension.class)
	static class TestBase {
		@Test
		void myTest() {}
	}

	@ExtendWith(IDempiereEnvExtension.class)
	static class IncorrectParameterType {
		@Test
		void myParameterTest(@IDempiereEnvParameter String param) {}
	}

	@Test
	void annotatedParameter_withIncorrectType_throwsException() {
		assertThatTest(IncorrectParameterType.class).isInstanceOf(ParameterResolutionException.class)
			.hasMessageEndingWith(
				"Can only resolve @IDempiereEnvParameter parameter of type org.idempiere.test.common.env.IDempiereEnv but was: java.lang.String");
	}

	static class IncorrectFieldType extends TestBase {

		@IDempiereEnvParameter
		String myField;

		@Override
		@Test
		void myTest() {}
	}

	@Test
	void annotatedField_withIncorrectType_throwsException() {
		assertThatTest(IncorrectFieldType.class).isInstanceOf(ExtensionConfigurationException.class)
			.hasMessage(
				"[myField] Can only resolve @IDempiereEnvParameter field of type org.idempiere.test.common.env.IDempiereEnv but was: java.lang.String");
	}

	static class IncorrectStaticFieldType extends TestBase {

		@IDempiereEnvParameter
		static String myStaticField;

		@Override
		@Test
		void myTest() {}
	}

	@Test
	void annotatedStaticField_withIncorrectType_throwsException() {
		assertThatTest(IncorrectStaticFieldType.class).isInstanceOf(ExtensionConfigurationException.class)
			.hasMessage(
				"[myStaticField] Can only resolve @IDempiereEnvParameter field of type org.idempiere.test.common.env.IDempiereEnv but was: java.lang.String");
	}

	static class FinalStaticField extends TestBase {
		@IDempiereEnvParameter
		static final IDempiereEnv bc = null;

		@Override
		@Test
		void myTest() {}
	}

	@Test
	void annotatedStaticField_thatIsFinal_throwsException() {
		assertThatTest(FinalStaticField.class).isInstanceOf(ExtensionConfigurationException.class)
			.hasMessageMatching("@IDempiereEnvParameter field \\[bc\\] must not be .*final.*");
	}

	static class FinalField extends TestBase {
		@IDempiereEnvParameter
		final IDempiereEnv bc = null;

		@Override
		@Test
		void myTest() {}
	}

	@Test
	void annotatedField_thatIsFinal_throwsException() {
		assertThatTest(FinalField.class).isInstanceOf(ExtensionConfigurationException.class)
			.hasMessageMatching("@IDempiereEnvParameter field \\[bc\\] must not be .*final.*");
	}

	static class PrivateField extends TestBase {
		@IDempiereEnvParameter
		private IDempiereEnv bc = null;

		@Override
		@Test
		void myTest() {}
	}

	@Test
	void annotatedField_thatIsPrivate_throwsException() {
		assertThatTest(PrivateField.class).isInstanceOf(ExtensionConfigurationException.class)
			.hasMessageMatching("@IDempiereEnvParameter field \\[bc\\] must not be .*private.*");
	}

	static class StaticPrivateField extends TestBase {
		@IDempiereEnvParameter
		static private IDempiereEnv bc = null;

		@Override
		@Test
		void myTest() {}
	}

	@Test
	void annotatedStaticField_thatIsPrivate_throwsException() {
		assertThatTest(StaticPrivateField.class).isInstanceOf(ExtensionConfigurationException.class)
			.hasMessageMatching("@IDempiereEnvParameter field \\[bc\\] must not be .*private.*");
	}
}
