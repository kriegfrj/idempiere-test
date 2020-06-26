/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Assertion Class - DO NOT CHANGE */
package org.idempiere.test.assertions;

import javax.annotation.Generated;
import org.assertj.core.util.Objects;
import org.compiere.model.X_C_BankStatementLine;

/** Generated assertion class for C_BankStatementLine
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_BankStatementLineAssert
	extends AbstractPOAssert<C_BankStatementLineAssert,X_C_BankStatementLine>
{

    /** Standard Constructor */
    public C_BankStatementLineAssert (X_C_BankStatementLine actual)
    {
      super (actual, C_BankStatementLineAssert.class);
    }


	public C_BankStatementLineAssert hasC_BankStatement_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BankStatement_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BankStatement_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BankStatementLineAssert hasC_BankStatementLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BankStatementLine_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BankStatementLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BankStatementLineAssert hasC_BankStatementLine_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_BankStatementLine_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BankStatementLine_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BankStatementLineAssert hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BankStatementLineAssert hasC_Charge_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Charge_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Charge_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BankStatementLineAssert hasC_Currency_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Currency_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Currency_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BankStatementLineAssert hasC_Invoice_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Invoice_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Invoice_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BankStatementLineAssert hasC_Payment_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Payment_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Payment_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BankStatementLineAssert hasChargeAmt(Object expected)
	{
		isNotNull();
		bdAssert("ChargeAmt", actual.getChargeAmt(), expected);
		return myself;
	}


	public C_BankStatementLineAssert hasDateAcct(Object expected)
	{
		isNotNull();
		dateAssert("DateAcct", actual.getDateAcct(), expected);
		return myself;
	}


	public C_BankStatementLineAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BankStatementLineAssert hasEftAmt(Object expected)
	{
		isNotNull();
		bdAssert("EftAmt", actual.getEftAmt(), expected);
		return myself;
	}


	public C_BankStatementLineAssert hasEftCheckNo(String expected)
	{
		isNotNull();
		String actualField = actual.getEftCheckNo();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have EftCheckNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BankStatementLineAssert hasEftCurrency(String expected)
	{
		isNotNull();
		String actualField = actual.getEftCurrency();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have EftCurrency: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BankStatementLineAssert hasEftMemo(String expected)
	{
		isNotNull();
		String actualField = actual.getEftMemo();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have EftMemo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BankStatementLineAssert hasEftPayee(String expected)
	{
		isNotNull();
		String actualField = actual.getEftPayee();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have EftPayee: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BankStatementLineAssert hasEftPayeeAccount(String expected)
	{
		isNotNull();
		String actualField = actual.getEftPayeeAccount();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have EftPayeeAccount: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BankStatementLineAssert hasEftReference(String expected)
	{
		isNotNull();
		String actualField = actual.getEftReference();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have EftReference: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BankStatementLineAssert hasEftStatementLineDate(Object expected)
	{
		isNotNull();
		dateAssert("EftStatementLineDate", actual.getEftStatementLineDate(), expected);
		return myself;
	}


	public C_BankStatementLineAssert hasEftTrxID(String expected)
	{
		isNotNull();
		String actualField = actual.getEftTrxID();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have EftTrxID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BankStatementLineAssert hasEftTrxType(String expected)
	{
		isNotNull();
		String actualField = actual.getEftTrxType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have EftTrxType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BankStatementLineAssert hasEftValutaDate(Object expected)
	{
		isNotNull();
		dateAssert("EftValutaDate", actual.getEftValutaDate(), expected);
		return myself;
	}


	public C_BankStatementLineAssert hasInterestAmt(Object expected)
	{
		isNotNull();
		bdAssert("InterestAmt", actual.getInterestAmt(), expected);
		return myself;
	}


	public C_BankStatementLineAssert isManual()
	{
		isNotNull();
		if (!actual.isManual()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Manual\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BankStatementLineAssert isNotManual()
	{
		isNotNull();
		if (actual.isManual()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Manual\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BankStatementLineAssert isReversal()
	{
		isNotNull();
		if (!actual.isReversal()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Reversal\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BankStatementLineAssert isNotReversal()
	{
		isNotNull();
		if (actual.isReversal()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Reversal\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BankStatementLineAssert hasLine(int expected)
	{
		isNotNull();
		int actualField = actual.getLine();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Line: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BankStatementLineAssert hasMemo(String expected)
	{
		isNotNull();
		String actualField = actual.getMemo();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Memo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BankStatementLineAssert isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BankStatementLineAssert isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BankStatementLineAssert hasReferenceNo(String expected)
	{
		isNotNull();
		String actualField = actual.getReferenceNo();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ReferenceNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BankStatementLineAssert hasStatementLineDate(Object expected)
	{
		isNotNull();
		dateAssert("StatementLineDate", actual.getStatementLineDate(), expected);
		return myself;
	}


	public C_BankStatementLineAssert hasStmtAmt(Object expected)
	{
		isNotNull();
		bdAssert("StmtAmt", actual.getStmtAmt(), expected);
		return myself;
	}


	public C_BankStatementLineAssert hasTrxAmt(Object expected)
	{
		isNotNull();
		bdAssert("TrxAmt", actual.getTrxAmt(), expected);
		return myself;
	}


	public C_BankStatementLineAssert hasValutaDate(Object expected)
	{
		isNotNull();
		dateAssert("ValutaDate", actual.getValutaDate(), expected);
		return myself;
	}

}