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
import org.compiere.model.X_C_BankAccount_Acct;

/** Generated assertion class for C_BankAccount_Acct
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_BankAccount_AcctAssert
	extends AbstractPOAssert<C_BankAccount_AcctAssert,X_C_BankAccount_Acct>
{

    /** Standard Constructor */
    public C_BankAccount_AcctAssert (X_C_BankAccount_Acct actual)
    {
      super (actual, C_BankAccount_AcctAssert.class);
    }


	public C_BankAccount_AcctAssert hasB_Asset_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getB_Asset_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have B_Asset_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BankAccount_AcctAssert hasB_InterestExp_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getB_InterestExp_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have B_InterestExp_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BankAccount_AcctAssert hasB_InterestRev_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getB_InterestRev_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have B_InterestRev_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BankAccount_AcctAssert hasB_InTransit_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getB_InTransit_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have B_InTransit_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BankAccount_AcctAssert hasB_PaymentSelect_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getB_PaymentSelect_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have B_PaymentSelect_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BankAccount_AcctAssert hasB_UnallocatedCash_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getB_UnallocatedCash_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have B_UnallocatedCash_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BankAccount_AcctAssert hasC_AcctSchema_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_AcctSchema_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_AcctSchema_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BankAccount_AcctAssert hasC_BankAccount_Acct_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_BankAccount_Acct_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BankAccount_Acct_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BankAccount_AcctAssert hasC_BankAccount_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BankAccount_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BankAccount_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}