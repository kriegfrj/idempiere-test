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
import org.compiere.model.X_C_BP_Group_Acct;

/** Generated assertion class for C_BP_Group_Acct
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_BP_Group_AcctAssert
	extends AbstractPOAssert<C_BP_Group_AcctAssert,X_C_BP_Group_Acct>
{

    /** Standard Constructor */
    public C_BP_Group_AcctAssert (X_C_BP_Group_Acct actual)
    {
      super (actual, C_BP_Group_AcctAssert.class);
    }


	public C_BP_Group_AcctAssert hasC_AcctSchema_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_AcctSchema_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_AcctSchema_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_Group_AcctAssert hasC_BP_Group_Acct_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_BP_Group_Acct_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BP_Group_Acct_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_Group_AcctAssert hasC_BP_Group_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BP_Group_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BP_Group_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_Group_AcctAssert hasC_Prepayment_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Prepayment_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Prepayment_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_Group_AcctAssert hasC_Receivable_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Receivable_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Receivable_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_Group_AcctAssert hasC_Receivable_Services_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Receivable_Services_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Receivable_Services_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_Group_AcctAssert hasNotInvoicedReceipts_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getNotInvoicedReceipts_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have NotInvoicedReceipts_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_Group_AcctAssert hasPayDiscount_Exp_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getPayDiscount_Exp_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PayDiscount_Exp_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_Group_AcctAssert hasPayDiscount_Rev_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getPayDiscount_Rev_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PayDiscount_Rev_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_Group_AcctAssert hasUnEarnedRevenue_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getUnEarnedRevenue_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have UnEarnedRevenue_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_Group_AcctAssert hasV_Liability_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getV_Liability_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have V_Liability_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_Group_AcctAssert hasV_Liability_Services_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getV_Liability_Services_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have V_Liability_Services_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_Group_AcctAssert hasV_Prepayment_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getV_Prepayment_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have V_Prepayment_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_Group_AcctAssert hasWriteOff_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getWriteOff_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have WriteOff_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}