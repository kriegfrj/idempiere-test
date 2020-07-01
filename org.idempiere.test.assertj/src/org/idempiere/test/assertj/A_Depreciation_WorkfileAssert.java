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
import org.compiere.model.X_A_Depreciation_Workfile;

/** Generated assertion class for A_Depreciation_Workfile
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class A_Depreciation_WorkfileAssert
	extends AbstractPOAssert<A_Depreciation_WorkfileAssert,X_A_Depreciation_Workfile>
{

    /** Standard Constructor */
    public A_Depreciation_WorkfileAssert (X_A_Depreciation_Workfile actual)
    {
      super (actual, A_Depreciation_WorkfileAssert.class);
    }


	public A_Depreciation_WorkfileAssert hasA_Accumulated_Depr(Object expected)
	{
		isNotNull();
		bdAssert("A_Accumulated_Depr", actual.getA_Accumulated_Depr(), expected);
		return myself;
	}


	public A_Depreciation_WorkfileAssert hasA_Accumulated_Depr_F(Object expected)
	{
		isNotNull();
		bdAssert("A_Accumulated_Depr_F", actual.getA_Accumulated_Depr_F(), expected);
		return myself;
	}


	public A_Depreciation_WorkfileAssert hasA_Asset_Cost(Object expected)
	{
		isNotNull();
		bdAssert("A_Asset_Cost", actual.getA_Asset_Cost(), expected);
		return myself;
	}


	public A_Depreciation_WorkfileAssert hasA_Asset_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Depreciation_WorkfileAssert hasA_Asset_Life_Current_Year(Object expected)
	{
		isNotNull();
		bdAssert("A_Asset_Life_Current_Year", actual.getA_Asset_Life_Current_Year(), expected);
		return myself;
	}


	public A_Depreciation_WorkfileAssert hasA_Asset_Life_Years(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Life_Years();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Life_Years: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Depreciation_WorkfileAssert hasA_Asset_Life_Years_F(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Life_Years_F();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Life_Years_F: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Depreciation_WorkfileAssert hasA_Asset_Remaining(Object expected)
	{
		isNotNull();
		bdAssert("A_Asset_Remaining", actual.getA_Asset_Remaining(), expected);
		return myself;
	}


	public A_Depreciation_WorkfileAssert hasA_Asset_Remaining_F(Object expected)
	{
		isNotNull();
		bdAssert("A_Asset_Remaining_F", actual.getA_Asset_Remaining_F(), expected);
		return myself;
	}


	public A_Depreciation_WorkfileAssert hasA_Base_Amount(Object expected)
	{
		isNotNull();
		bdAssert("A_Base_Amount", actual.getA_Base_Amount(), expected);
		return myself;
	}


	public A_Depreciation_WorkfileAssert hasA_Calc_Accumulated_Depr(Object expected)
	{
		isNotNull();
		bdAssert("A_Calc_Accumulated_Depr", actual.getA_Calc_Accumulated_Depr(), expected);
		return myself;
	}


	public A_Depreciation_WorkfileAssert hasA_Curr_Dep_Exp(Object expected)
	{
		isNotNull();
		bdAssert("A_Curr_Dep_Exp", actual.getA_Curr_Dep_Exp(), expected);
		return myself;
	}


	public A_Depreciation_WorkfileAssert hasA_Current_Period(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Current_Period();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Current_Period: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Depreciation_WorkfileAssert hasA_Depreciation_Workfile_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Depreciation_Workfile_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Depreciation_Workfile_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Depreciation_WorkfileAssert hasA_Depreciation_Workfile_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Depreciation_Workfile_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Depreciation_Workfile_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Depreciation_WorkfileAssert hasA_Expense_SL(Object expected)
	{
		isNotNull();
		bdAssert("A_Expense_SL", actual.getA_Expense_SL(), expected);
		return myself;
	}


	public A_Depreciation_WorkfileAssert hasA_Expense_SL_F(Object expected)
	{
		isNotNull();
		bdAssert("A_Expense_SL_F", actual.getA_Expense_SL_F(), expected);
		return myself;
	}


	public A_Depreciation_WorkfileAssert hasA_FundingMode_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_FundingMode_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_FundingMode_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Depreciation_WorkfileAssert hasA_Life_Period(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Life_Period();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Life_Period: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Depreciation_WorkfileAssert hasA_Life_Period_F(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Life_Period_F();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Life_Period_F: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Depreciation_WorkfileAssert hasA_Life_Period_Max(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Life_Period_Max();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Life_Period_Max: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Depreciation_WorkfileAssert hasA_Life_Period_Min(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Life_Period_Min();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Life_Period_Min: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Depreciation_WorkfileAssert hasA_Period_Forecast(Object expected)
	{
		isNotNull();
		bdAssert("A_Period_Forecast", actual.getA_Period_Forecast(), expected);
		return myself;
	}


	public A_Depreciation_WorkfileAssert hasA_Period_Posted(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Period_Posted();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Period_Posted: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Depreciation_WorkfileAssert hasA_Prior_Year_Accumulated_Depr(Object expected)
	{
		isNotNull();
		bdAssert("A_Prior_Year_Accumulated_Depr", actual.getA_Prior_Year_Accumulated_Depr(), expected);
		return myself;
	}


	public A_Depreciation_WorkfileAssert hasA_QTY_Current(Object expected)
	{
		isNotNull();
		bdAssert("A_QTY_Current", actual.getA_QTY_Current(), expected);
		return myself;
	}


	public A_Depreciation_WorkfileAssert hasA_Salvage_Value(Object expected)
	{
		isNotNull();
		bdAssert("A_Salvage_Value", actual.getA_Salvage_Value(), expected);
		return myself;
	}


	public A_Depreciation_WorkfileAssert hasA_Tip_Finantare(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Tip_Finantare();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Tip_Finantare: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Depreciation_WorkfileAssert hasA_Valoare_Cofinantare(Object expected)
	{
		isNotNull();
		bdAssert("A_Valoare_Cofinantare", actual.getA_Valoare_Cofinantare(), expected);
		return myself;
	}


	public A_Depreciation_WorkfileAssert hasA_Valoare_Tert(Object expected)
	{
		isNotNull();
		bdAssert("A_Valoare_Tert", actual.getA_Valoare_Tert(), expected);
		return myself;
	}


	public A_Depreciation_WorkfileAssert hasAssetDepreciationDate(Object expected)
	{
		isNotNull();
		dateAssert("AssetDepreciationDate", actual.getAssetDepreciationDate(), expected);
		return myself;
	}


	public A_Depreciation_WorkfileAssert hasDateAcct(Object expected)
	{
		isNotNull();
		dateAssert("DateAcct", actual.getDateAcct(), expected);
		return myself;
	}


	public A_Depreciation_WorkfileAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Depreciation_WorkfileAssert isDepreciated()
	{
		isNotNull();
		if (!actual.isDepreciated()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Depreciated\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public A_Depreciation_WorkfileAssert isNotDepreciated()
	{
		isNotNull();
		if (actual.isDepreciated()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Depreciated\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public A_Depreciation_WorkfileAssert hasPostingType(String expected)
	{
		isNotNull();
		String actualField = actual.getPostingType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PostingType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Depreciation_WorkfileAssert isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public A_Depreciation_WorkfileAssert isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public A_Depreciation_WorkfileAssert hasUseLifeMonths(int expected)
	{
		isNotNull();
		int actualField = actual.getUseLifeMonths();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have UseLifeMonths: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Depreciation_WorkfileAssert hasUseLifeMonths_F(int expected)
	{
		isNotNull();
		int actualField = actual.getUseLifeMonths_F();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have UseLifeMonths_F: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Depreciation_WorkfileAssert hasUseLifeYears(int expected)
	{
		isNotNull();
		int actualField = actual.getUseLifeYears();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have UseLifeYears: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Depreciation_WorkfileAssert hasUseLifeYears_F(int expected)
	{
		isNotNull();
		int actualField = actual.getUseLifeYears_F();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have UseLifeYears_F: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}