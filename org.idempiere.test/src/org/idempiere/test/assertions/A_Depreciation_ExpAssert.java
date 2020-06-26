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
import org.compiere.model.X_A_Depreciation_Exp;

/** Generated assertion class for A_Depreciation_Exp
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class A_Depreciation_ExpAssert
	extends AbstractPOAssert<A_Depreciation_ExpAssert,X_A_Depreciation_Exp>
{

    /** Standard Constructor */
    public A_Depreciation_ExpAssert (X_A_Depreciation_Exp actual)
    {
      super (actual, A_Depreciation_ExpAssert.class);
    }


	public A_Depreciation_ExpAssert hasA_Account_Number_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Account_Number_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Account_Number_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Depreciation_ExpAssert hasA_Accumulated_Depr(Object expected)
	{
		isNotNull();
		bdAssert("A_Accumulated_Depr", actual.getA_Accumulated_Depr(), expected);
		return myself;
	}


	public A_Depreciation_ExpAssert hasA_Accumulated_Depr_Delta(Object expected)
	{
		isNotNull();
		bdAssert("A_Accumulated_Depr_Delta", actual.getA_Accumulated_Depr_Delta(), expected);
		return myself;
	}


	public A_Depreciation_ExpAssert hasA_Accumulated_Depr_F(Object expected)
	{
		isNotNull();
		bdAssert("A_Accumulated_Depr_F", actual.getA_Accumulated_Depr_F(), expected);
		return myself;
	}


	public A_Depreciation_ExpAssert hasA_Accumulated_Depr_F_Delta(Object expected)
	{
		isNotNull();
		bdAssert("A_Accumulated_Depr_F_Delta", actual.getA_Accumulated_Depr_F_Delta(), expected);
		return myself;
	}


	public A_Depreciation_ExpAssert hasA_Asset_Addition_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Addition_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Asset_Addition_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Depreciation_ExpAssert hasA_Asset_Cost(Object expected)
	{
		isNotNull();
		bdAssert("A_Asset_Cost", actual.getA_Asset_Cost(), expected);
		return myself;
	}


	public A_Depreciation_ExpAssert hasA_Asset_Cost_Delta(Object expected)
	{
		isNotNull();
		bdAssert("A_Asset_Cost_Delta", actual.getA_Asset_Cost_Delta(), expected);
		return myself;
	}


	public A_Depreciation_ExpAssert hasA_Asset_Disposed_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Disposed_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Asset_Disposed_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Depreciation_ExpAssert hasA_Asset_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Asset_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Depreciation_ExpAssert hasA_Asset_Remaining(Object expected)
	{
		isNotNull();
		bdAssert("A_Asset_Remaining", actual.getA_Asset_Remaining(), expected);
		return myself;
	}


	public A_Depreciation_ExpAssert hasA_Asset_Remaining_F(Object expected)
	{
		isNotNull();
		bdAssert("A_Asset_Remaining_F", actual.getA_Asset_Remaining_F(), expected);
		return myself;
	}


	public A_Depreciation_ExpAssert hasA_Depreciation_Entry_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Depreciation_Entry_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Depreciation_Entry_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Depreciation_ExpAssert hasA_Depreciation_Exp_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Depreciation_Exp_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Depreciation_Exp_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Depreciation_ExpAssert hasA_Depreciation_Exp_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Depreciation_Exp_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Depreciation_Exp_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Depreciation_ExpAssert hasA_Entry_Type(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Entry_Type();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Entry_Type: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Depreciation_ExpAssert hasA_Period(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Period();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Period: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Depreciation_ExpAssert hasCR_Account_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getCR_Account_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CR_Account_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Depreciation_ExpAssert hasDateAcct(Object expected)
	{
		isNotNull();
		dateAssert("DateAcct", actual.getDateAcct(), expected);
		return myself;
	}


	public A_Depreciation_ExpAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Depreciation_ExpAssert hasDR_Account_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getDR_Account_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DR_Account_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Depreciation_ExpAssert hasExpense(Object expected)
	{
		isNotNull();
		bdAssert("Expense", actual.getExpense(), expected);
		return myself;
	}


	public A_Depreciation_ExpAssert hasExpense_F(Object expected)
	{
		isNotNull();
		bdAssert("Expense_F", actual.getExpense_F(), expected);
		return myself;
	}


	public A_Depreciation_ExpAssert hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Depreciation_ExpAssert isDepreciated()
	{
		isNotNull();
		if (!actual.isDepreciated()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Depreciated\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public A_Depreciation_ExpAssert isNotDepreciated()
	{
		isNotNull();
		if (actual.isDepreciated()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Depreciated\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public A_Depreciation_ExpAssert hasPostingType(String expected)
	{
		isNotNull();
		String actualField = actual.getPostingType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PostingType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Depreciation_ExpAssert isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public A_Depreciation_ExpAssert isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public A_Depreciation_ExpAssert hasUseLifeMonths(int expected)
	{
		isNotNull();
		int actualField = actual.getUseLifeMonths();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have UseLifeMonths: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Depreciation_ExpAssert hasUseLifeMonths_F(int expected)
	{
		isNotNull();
		int actualField = actual.getUseLifeMonths_F();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have UseLifeMonths_F: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}