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
import org.compiere.model.X_A_Asset_Split;

/** Generated assertion class for A_Asset_Split
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class A_Asset_SplitAssert
	extends AbstractPOAssert<A_Asset_SplitAssert,X_A_Asset_Split>
{

    /** Standard Constructor */
    public A_Asset_SplitAssert (X_A_Asset_Split actual)
    {
      super (actual, A_Asset_SplitAssert.class);
    }


	public A_Asset_SplitAssert hasA_Amount_Split(Object expected)
	{
		isNotNull();
		bdAssert("A_Amount_Split", actual.getA_Amount_Split(), expected);
		return myself;
	}


	public A_Asset_SplitAssert hasA_Asset_Acct_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Acct_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Asset_Acct_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_SplitAssert hasA_Asset_Cost(Object expected)
	{
		isNotNull();
		bdAssert("A_Asset_Cost", actual.getA_Asset_Cost(), expected);
		return myself;
	}


	public A_Asset_SplitAssert hasA_Asset_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Asset_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_SplitAssert hasA_Asset_ID_To(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_ID_To();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Asset_ID_To: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_SplitAssert hasA_Asset_Split_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Split_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Asset_Split_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_SplitAssert hasA_Asset_Split_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Asset_Split_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Asset_Split_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_SplitAssert hasA_Depreciation_Workfile_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Depreciation_Workfile_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Depreciation_Workfile_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_SplitAssert hasA_Percent_Original(Object expected)
	{
		isNotNull();
		bdAssert("A_Percent_Original", actual.getA_Percent_Original(), expected);
		return myself;
	}


	public A_Asset_SplitAssert hasA_Percent_Split(Object expected)
	{
		isNotNull();
		bdAssert("A_Percent_Split", actual.getA_Percent_Split(), expected);
		return myself;
	}


	public A_Asset_SplitAssert hasA_QTY_Current(Object expected)
	{
		isNotNull();
		bdAssert("A_QTY_Current", actual.getA_QTY_Current(), expected);
		return myself;
	}


	public A_Asset_SplitAssert hasA_QTY_Split(Object expected)
	{
		isNotNull();
		bdAssert("A_QTY_Split", actual.getA_QTY_Split(), expected);
		return myself;
	}


	public A_Asset_SplitAssert hasA_Split_Type(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Split_Type();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Split_Type: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_SplitAssert isA_Transfer_Balance_IS()
	{
		isNotNull();
		if (!actual.isA_Transfer_Balance_IS()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be A_Transfer_Balance_IS\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_SplitAssert isNotA_Transfer_Balance_IS()
	{
		isNotNull();
		if (actual.isA_Transfer_Balance_IS()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be A_Transfer_Balance_IS\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_SplitAssert hasC_Period_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Period_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Period_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_SplitAssert hasDateAcct(Object expected)
	{
		isNotNull();
		dateAssert("DateAcct", actual.getDateAcct(), expected);
		return myself;
	}


	public A_Asset_SplitAssert hasPostingType(String expected)
	{
		isNotNull();
		String actualField = actual.getPostingType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PostingType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_SplitAssert isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_SplitAssert isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}
}