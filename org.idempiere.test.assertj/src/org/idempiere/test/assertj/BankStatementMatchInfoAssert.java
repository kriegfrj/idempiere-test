package org.idempiere.test.assertj;

import org.compiere.impexp.BankStatementMatchInfo;

public class BankStatementMatchInfoAssert
	extends AbstractIDAssert<BankStatementMatchInfoAssert, BankStatementMatchInfo> {

	public BankStatementMatchInfoAssert(BankStatementMatchInfo actual) {
		super(actual, BankStatementMatchInfoAssert.class);
	}

	protected String getDescription() {
		return "BankStatementMatchInfo";
	}
	
	public BankStatementMatchInfoAssert isMatched()
	{
		isNotNull();
		if (!actual.isMatched()) {
			failWithMessage("\nExpecting BankStatementMatchInfo to be Matched\nbut it was not");
		}
		return myself;
	}

	public BankStatementMatchInfoAssert isNotMatched()
	{
		isNotNull();
		if (!actual.isMatched()) {
			failWithMessage("\nExpecting BankStatementMatchInfo to not be Matched\nbut it was");
		}
		return myself;
	}

	public BankStatementMatchInfoAssert hasC_BPartner_ID(int expected) {
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting BankStatementMatchInfo:\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				expected, actualField);
		}
		return myself;
	}
	
	public BankStatementMatchInfoAssert hasC_Payment_ID(int expected) {
		isNotNull();
		int actualField = actual.getC_Payment_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting BankStatementMatchInfo:\n to have C_Payment_ID: <%s>\nbut it was: <%s>",
				expected, actualField);
		}
		return myself;
	}
	
	public BankStatementMatchInfoAssert hasC_Invoice_ID(int expected) {
		isNotNull();
		int actualField = actual.getC_Invoice_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting BankStatementMatchInfo:\n to have C_Invoice_ID: <%s>\nbut it was: <%s>",
				expected, actualField);
		}
		return myself;
	}
}
