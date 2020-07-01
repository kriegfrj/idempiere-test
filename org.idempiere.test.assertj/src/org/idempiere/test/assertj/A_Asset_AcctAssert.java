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
import org.compiere.model.X_A_Asset_Acct;

/** Generated assertion class for A_Asset_Acct
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class A_Asset_AcctAssert
	extends AbstractPOAssert<A_Asset_AcctAssert,X_A_Asset_Acct>
{

    /** Standard Constructor */
    public A_Asset_AcctAssert (X_A_Asset_Acct actual)
    {
      super (actual, A_Asset_AcctAssert.class);
    }


	public A_Asset_AcctAssert hasA_Accumdepreciation_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Accumdepreciation_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Accumdepreciation_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AcctAssert hasA_Asset_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AcctAssert hasA_Asset_Acct_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Acct_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Acct_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AcctAssert hasA_Asset_Acct_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Asset_Acct_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Acct_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AcctAssert hasA_Asset_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AcctAssert hasA_Asset_Spread_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Spread_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Spread_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AcctAssert hasA_Depreciation_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Depreciation_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Depreciation_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AcctAssert hasA_Depreciation_Conv_F_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Depreciation_Conv_F_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Depreciation_Conv_F_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AcctAssert hasA_Depreciation_Conv_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Depreciation_Conv_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Depreciation_Conv_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AcctAssert hasA_Depreciation_F_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Depreciation_F_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Depreciation_F_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AcctAssert hasA_Depreciation_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Depreciation_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Depreciation_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AcctAssert hasA_Depreciation_Manual_Amount(Object expected)
	{
		isNotNull();
		bdAssert("A_Depreciation_Manual_Amount", actual.getA_Depreciation_Manual_Amount(), expected);
		return myself;
	}


	public A_Asset_AcctAssert hasA_Depreciation_Manual_Period(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Depreciation_Manual_Period();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Depreciation_Manual_Period: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AcctAssert hasA_Depreciation_Method_F_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Depreciation_Method_F_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Depreciation_Method_F_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AcctAssert hasA_Depreciation_Method_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Depreciation_Method_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Depreciation_Method_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AcctAssert hasA_Depreciation_Table_Header_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Depreciation_Table_Header_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Depreciation_Table_Header_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AcctAssert hasA_Depreciation_Variable_Perc(Object expected)
	{
		isNotNull();
		bdAssert("A_Depreciation_Variable_Perc", actual.getA_Depreciation_Variable_Perc(), expected);
		return myself;
	}


	public A_Asset_AcctAssert hasA_Depreciation_Variable_Perc_F(Object expected)
	{
		isNotNull();
		bdAssert("A_Depreciation_Variable_Perc_F", actual.getA_Depreciation_Variable_Perc_F(), expected);
		return myself;
	}


	public A_Asset_AcctAssert hasA_Disposal_Gain(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Disposal_Gain();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Disposal_Gain: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AcctAssert hasA_Disposal_Gain_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Disposal_Gain_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Disposal_Gain_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AcctAssert hasA_Disposal_Loss(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Disposal_Loss();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Disposal_Loss: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AcctAssert hasA_Disposal_Loss_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Disposal_Loss_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Disposal_Loss_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AcctAssert hasA_Disposal_Revenue(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Disposal_Revenue();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Disposal_Revenue: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AcctAssert hasA_Disposal_Revenue_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Disposal_Revenue_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Disposal_Revenue_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AcctAssert hasA_Period_End(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Period_End();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Period_End: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AcctAssert hasA_Period_Start(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Period_Start();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Period_Start: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AcctAssert hasA_Reval_Accumdep_Offset_Cur(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Reval_Accumdep_Offset_Cur();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Reval_Accumdep_Offset_Cur: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AcctAssert hasA_Reval_Accumdep_Offset_Prior(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Reval_Accumdep_Offset_Prior();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Reval_Accumdep_Offset_Prior: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AcctAssert hasA_Reval_Adep_Offset_Cur_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Reval_Adep_Offset_Cur_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Reval_Adep_Offset_Cur_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AcctAssert hasA_Reval_Adep_Offset_Prior_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Reval_Adep_Offset_Prior_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Reval_Adep_Offset_Prior_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AcctAssert hasA_Reval_Cal_Method(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Reval_Cal_Method();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Reval_Cal_Method: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AcctAssert hasA_Reval_Cost_Offset(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Reval_Cost_Offset();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Reval_Cost_Offset: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AcctAssert hasA_Reval_Cost_Offset_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Reval_Cost_Offset_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Reval_Cost_Offset_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AcctAssert hasA_Reval_Cost_Offset_Prior(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Reval_Cost_Offset_Prior();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Reval_Cost_Offset_Prior: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AcctAssert hasA_Reval_Cost_Offset_Prior_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Reval_Cost_Offset_Prior_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Reval_Cost_Offset_Prior_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AcctAssert hasA_Reval_Depexp_Offset(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Reval_Depexp_Offset();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Reval_Depexp_Offset: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AcctAssert hasA_Reval_Depexp_Offset_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Reval_Depexp_Offset_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Reval_Depexp_Offset_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AcctAssert hasA_Salvage_Value(Object expected)
	{
		isNotNull();
		bdAssert("A_Salvage_Value", actual.getA_Salvage_Value(), expected);
		return myself;
	}


	public A_Asset_AcctAssert hasA_Split_Percent(Object expected)
	{
		isNotNull();
		bdAssert("A_Split_Percent", actual.getA_Split_Percent(), expected);
		return myself;
	}


	public A_Asset_AcctAssert hasC_AcctSchema_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_AcctSchema_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_AcctSchema_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AcctAssert hasPostingType(String expected)
	{
		isNotNull();
		String actualField = actual.getPostingType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PostingType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AcctAssert isProcessing()
	{
		isNotNull();
		if (!actual.isProcessing()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processing\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_AcctAssert isNotProcessing()
	{
		isNotNull();
		if (actual.isProcessing()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processing\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_AcctAssert hasValidFrom(Object expected)
	{
		isNotNull();
		dateAssert("ValidFrom", actual.getValidFrom(), expected);
		return myself;
	}

}