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
import org.compiere.model.X_C_CommissionAmt;

/** Generated assertion class for C_CommissionAmt
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_CommissionAmtAssert
	extends AbstractPOAssert<C_CommissionAmtAssert,X_C_CommissionAmt>
{

    /** Standard Constructor */
    public C_CommissionAmtAssert (X_C_CommissionAmt actual)
    {
      super (actual, C_CommissionAmtAssert.class);
    }


	public C_CommissionAmtAssert hasActualQty(Object expected)
	{
		isNotNull();
		bdAssert("ActualQty", actual.getActualQty(), expected);
		return myself;
	}


	public C_CommissionAmtAssert hasC_CommissionAmt_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_CommissionAmt_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_CommissionAmt_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CommissionAmtAssert hasC_CommissionAmt_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_CommissionAmt_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_CommissionAmt_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CommissionAmtAssert hasC_CommissionLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_CommissionLine_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_CommissionLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CommissionAmtAssert hasC_CommissionRun_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_CommissionRun_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_CommissionRun_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CommissionAmtAssert hasCommissionAmt(Object expected)
	{
		isNotNull();
		bdAssert("CommissionAmt", actual.getCommissionAmt(), expected);
		return myself;
	}


	public C_CommissionAmtAssert hasConvertedAmt(Object expected)
	{
		isNotNull();
		bdAssert("ConvertedAmt", actual.getConvertedAmt(), expected);
		return myself;
	}

}