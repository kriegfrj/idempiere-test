package org.idempiere.test.junit4;

import java.sql.Timestamp;

import org.assertj.core.api.SoftAssertions;
import org.idempiere.test.IDempiereEnv;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.MultipleFailureException;
import org.junit.runners.model.Statement;

public class IDempiereEnvRule extends IDempiereEnv implements TestRule {

	IDempiereEnv.Builder builder;

	public IDempiereEnvRule() {
		this(null);
	}
	
	public IDempiereEnvRule(IDempiereEnv parent) {
		this(parent, null);
	}
	
	public IDempiereEnvRule(IDempiereEnv parent, SoftAssertions softly) {
		super(11, 11, 100, 102, 103, new Timestamp(System.currentTimeMillis()), true, parent, softly);
	}
//		super(parent, softly);
//	}
//	
//	public IDempiereEnvRule(boolean autoRollback) {
//		this(11, 11, 100, 102, 103, new Timestamp(System.currentTimeMillis()), autoRollback);
//	}
//		
//	public IDempiereEnvRule(int clientId, int orgId, int userId, int roleId, int warehouseId, Timestamp date) {
//		this(clientId, orgId, userId, roleId, warehouseId, date, true);
//	}
//	
	public IDempiereEnvRule(int clientId,
			int orgId,
			int userId,
			int roleId,
			int warehouseId,
			Timestamp date,
			boolean autoRollback) {
		super(clientId, orgId, userId, roleId, warehouseId, date, autoRollback, null, null);
	}

	
	@Override
	public Statement apply(final Statement base, final Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
            	setClassName(description.getClassName());
            	setName(description.getMethodName());

                before();
                try {
                	base.evaluate();
                	if (softly != null) {
                		MultipleFailureException.assertEmpty(softly.errorsCollected());
                	}
                } finally {
                	close();
                }
            }
        };
	}
}
