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

import javax.annotation.Generated;
import org.assertj.core.util.Objects;
import org.compiere.model.X_C_RevenueRecognition_Plan;

/** Generated assertion class for C_RevenueRecognition_Plan
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_RevenueRecognition_PlanAssert
	extends AbstractPOAssert<C_RevenueRecognition_PlanAssert,X_C_RevenueRecognition_Plan>
{

    /** Standard Constructor */
    public C_RevenueRecognition_PlanAssert (X_C_RevenueRecognition_Plan actual)
    {
      super (actual, C_RevenueRecognition_PlanAssert.class);
    }


	public C_RevenueRecognition_PlanAssert hasC_AcctSchema_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_AcctSchema_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_AcctSchema_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RevenueRecognition_PlanAssert hasC_Currency_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Currency_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Currency_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RevenueRecognition_PlanAssert hasC_InvoiceLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_InvoiceLine_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_InvoiceLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RevenueRecognition_PlanAssert hasC_RevenueRecognition_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_RevenueRecognition_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_RevenueRecognition_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RevenueRecognition_PlanAssert hasC_RevenueRecognition_Plan_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_RevenueRecognition_Plan_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_RevenueRecognition_Plan_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RevenueRecognition_PlanAssert hasC_RevenueRecognition_Plan_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_RevenueRecognition_Plan_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_RevenueRecognition_Plan_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RevenueRecognition_PlanAssert hasP_Revenue_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getP_Revenue_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have P_Revenue_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RevenueRecognition_PlanAssert hasRecognizedAmt(Object expected)
	{
		isNotNull();
		bdAssert("RecognizedAmt", actual.getRecognizedAmt(), expected);
		return myself;
	}


	public C_RevenueRecognition_PlanAssert hasTotalAmt(Object expected)
	{
		isNotNull();
		bdAssert("TotalAmt", actual.getTotalAmt(), expected);
		return myself;
	}


	public C_RevenueRecognition_PlanAssert hasUnEarnedRevenue_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getUnEarnedRevenue_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have UnEarnedRevenue_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}