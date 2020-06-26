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
import org.compiere.model.X_Fact_Acct_Summary;

/** Generated assertion class for Fact_Acct_Summary
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class Fact_Acct_SummaryAssert
	extends AbstractPOAssert<Fact_Acct_SummaryAssert,X_Fact_Acct_Summary>
{

    /** Standard Constructor */
    public Fact_Acct_SummaryAssert (X_Fact_Acct_Summary actual)
    {
      super (actual, Fact_Acct_SummaryAssert.class);
    }


	public Fact_Acct_SummaryAssert hasAccount_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAccount_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Account_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public Fact_Acct_SummaryAssert hasAD_OrgTrx_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_OrgTrx_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_OrgTrx_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public Fact_Acct_SummaryAssert hasAmtAcctCr(Object expected)
	{
		isNotNull();
		bdAssert("AmtAcctCr", actual.getAmtAcctCr(), expected);
		return myself;
	}


	public Fact_Acct_SummaryAssert hasAmtAcctDr(Object expected)
	{
		isNotNull();
		bdAssert("AmtAcctDr", actual.getAmtAcctDr(), expected);
		return myself;
	}


	public Fact_Acct_SummaryAssert hasC_AcctSchema_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_AcctSchema_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_AcctSchema_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public Fact_Acct_SummaryAssert hasC_Activity_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Activity_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Activity_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public Fact_Acct_SummaryAssert hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public Fact_Acct_SummaryAssert hasC_Campaign_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Campaign_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Campaign_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public Fact_Acct_SummaryAssert hasC_LocFrom_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_LocFrom_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_LocFrom_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public Fact_Acct_SummaryAssert hasC_LocTo_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_LocTo_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_LocTo_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public Fact_Acct_SummaryAssert hasC_Period_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Period_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Period_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public Fact_Acct_SummaryAssert hasC_Project_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Project_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Project_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public Fact_Acct_SummaryAssert hasC_ProjectPhase_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ProjectPhase_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_ProjectPhase_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public Fact_Acct_SummaryAssert hasC_ProjectTask_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ProjectTask_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_ProjectTask_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public Fact_Acct_SummaryAssert hasC_SalesRegion_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_SalesRegion_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_SalesRegion_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public Fact_Acct_SummaryAssert hasC_SubAcct_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_SubAcct_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_SubAcct_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public Fact_Acct_SummaryAssert hasDateAcct(Object expected)
	{
		isNotNull();
		dateAssert("DateAcct", actual.getDateAcct(), expected);
		return myself;
	}


	public Fact_Acct_SummaryAssert hasFact_Acct_Summary_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getFact_Acct_Summary_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Fact_Acct_Summary_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public Fact_Acct_SummaryAssert hasGL_Budget_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getGL_Budget_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have GL_Budget_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public Fact_Acct_SummaryAssert hasM_Product_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Product_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public Fact_Acct_SummaryAssert hasPA_ReportCube_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPA_ReportCube_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PA_ReportCube_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public Fact_Acct_SummaryAssert isPostingType()
	{
		isNotNull();
		if (!actual.isPostingType()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PostingType\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public Fact_Acct_SummaryAssert isNotPostingType()
	{
		isNotNull();
		if (actual.isPostingType()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PostingType\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public Fact_Acct_SummaryAssert hasQty(Object expected)
	{
		isNotNull();
		bdAssert("Qty", actual.getQty(), expected);
		return myself;
	}


	public Fact_Acct_SummaryAssert hasUser1_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getUser1_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have User1_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public Fact_Acct_SummaryAssert hasUser2_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getUser2_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have User2_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public Fact_Acct_SummaryAssert hasUserElement1_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getUserElement1_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have UserElement1_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public Fact_Acct_SummaryAssert hasUserElement2_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getUserElement2_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have UserElement2_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}