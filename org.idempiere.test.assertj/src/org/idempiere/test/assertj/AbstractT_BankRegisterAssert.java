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
import org.compiere.model.X_T_BankRegister;

/** Generated assertion class for T_BankRegister
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractT_BankRegisterAssert<SELF extends AbstractT_BankRegisterAssert<SELF, ACTUAL>, ACTUAL extends X_T_BankRegister>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractT_BankRegisterAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAccount(String expected)
	{
		isNotNull();
		String actualField = actual.getAccount();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Account: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_PInstance_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PInstance_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_PInstance_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAmtAcctCr(Object expected)
	{
		isNotNull();
		bdAssert("AmtAcctCr", actual.getAmtAcctCr(), expected);
		return myself;
	}


	public SELF hasAmtAcctDr(Object expected)
	{
		isNotNull();
		bdAssert("AmtAcctDr", actual.getAmtAcctDr(), expected);
		return myself;
	}


	public SELF hasBalance(Object expected)
	{
		isNotNull();
		bdAssert("Balance", actual.getBalance(), expected);
		return myself;
	}


	public SELF hasBankName(String expected)
	{
		isNotNull();
		String actualField = actual.getBankName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have BankName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasBPartner(String expected)
	{
		isNotNull();
		String actualField = actual.getBPartner();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have BPartner: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Bank_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Bank_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Bank_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasDateAcct(Object expected)
	{
		isNotNull();
		dateAssert("DateAcct", actual.getDateAcct(), expected);
		return myself;
	}


	public SELF hasDocumentNo(String expected)
	{
		isNotNull();
		String actualField = actual.getDocumentNo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DocumentNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasT_BankRegister_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getT_BankRegister_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have T_BankRegister_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}