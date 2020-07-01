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
package org.idempiere.test.assertj;

import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_C_BankStatement;

/** Generated assertion class for C_BankStatement
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_BankStatementAssert
	extends AbstractPOAssert<C_BankStatementAssert,X_C_BankStatement>
{

    /** Standard Constructor */
    public C_BankStatementAssert (X_C_BankStatement actual)
    {
      super (actual, C_BankStatementAssert.class);
    }


	public C_BankStatementAssert hasBeginningBalance(Object expected)
	{
		isNotNull();
		bdAssert("BeginningBalance", actual.getBeginningBalance(), expected);
		return myself;
	}


	public C_BankStatementAssert hasC_BankAccount_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BankAccount_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BankAccount_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BankStatementAssert hasC_BankStatement_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BankStatement_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BankStatement_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BankStatementAssert hasC_BankStatement_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_BankStatement_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BankStatement_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BankStatementAssert hasDateAcct(Object expected)
	{
		isNotNull();
		dateAssert("DateAcct", actual.getDateAcct(), expected);
		return myself;
	}


	public C_BankStatementAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BankStatementAssert hasDocStatus(String expected)
	{
		isNotNull();
		String actualField = actual.getDocStatus();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DocStatus: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BankStatementAssert hasEftStatementDate(Object expected)
	{
		isNotNull();
		dateAssert("EftStatementDate", actual.getEftStatementDate(), expected);
		return myself;
	}


	public C_BankStatementAssert hasEftStatementReference(String expected)
	{
		isNotNull();
		String actualField = actual.getEftStatementReference();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have EftStatementReference: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BankStatementAssert hasEndingBalance(Object expected)
	{
		isNotNull();
		bdAssert("EndingBalance", actual.getEndingBalance(), expected);
		return myself;
	}


	public C_BankStatementAssert isApproved()
	{
		isNotNull();
		if (!actual.isApproved()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Approved\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BankStatementAssert isNotApproved()
	{
		isNotNull();
		if (actual.isApproved()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Approved\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BankStatementAssert isManual()
	{
		isNotNull();
		if (!actual.isManual()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Manual\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BankStatementAssert isNotManual()
	{
		isNotNull();
		if (actual.isManual()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Manual\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BankStatementAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BankStatementAssert isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BankStatementAssert isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BankStatementAssert hasProcessedOn(Object expected)
	{
		isNotNull();
		bdAssert("ProcessedOn", actual.getProcessedOn(), expected);
		return myself;
	}


	public C_BankStatementAssert isProcessing()
	{
		isNotNull();
		if (!actual.isProcessing()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processing\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BankStatementAssert isNotProcessing()
	{
		isNotNull();
		if (actual.isProcessing()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processing\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BankStatementAssert hasStatementDate(Object expected)
	{
		isNotNull();
		dateAssert("StatementDate", actual.getStatementDate(), expected);
		return myself;
	}


	public C_BankStatementAssert hasStatementDifference(Object expected)
	{
		isNotNull();
		bdAssert("StatementDifference", actual.getStatementDifference(), expected);
		return myself;
	}

}