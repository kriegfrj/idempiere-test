package org.idempiere.test.junit5.test;

import org.idempiere.test.common.annotation.InjectIDempiereEnv;
import org.idempiere.test.common.env.IDempiereEnv;

public class IDempiereEnvExtension_HierarchicalTest {

	@InjectIDempiereEnv
	static IDempiereEnv ENV;
	
}
