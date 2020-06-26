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
import org.compiere.model.X_C_Charge_Acct;

/** Generated assertion class for C_Charge_Acct
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_Charge_AcctAssert
	extends AbstractPOAssert<C_Charge_AcctAssert,X_C_Charge_Acct>
{

    /** Standard Constructor */
    public C_Charge_AcctAssert (X_C_Charge_Acct actual)
    {
      super (actual, C_Charge_AcctAssert.class);
    }


	public C_Charge_AcctAssert hasC_AcctSchema_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_AcctSchema_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_AcctSchema_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_Charge_AcctAssert hasC_Charge_Acct_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_Charge_Acct_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Charge_Acct_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_Charge_AcctAssert hasC_Charge_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Charge_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Charge_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_Charge_AcctAssert hasCh_Expense_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getCh_Expense_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Ch_Expense_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}