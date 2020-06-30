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
import org.compiere.model.X_M_DiscountSchemaLine;

/** Generated assertion class for M_DiscountSchemaLine
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class M_DiscountSchemaLineAssert
	extends AbstractPOAssert<M_DiscountSchemaLineAssert,X_M_DiscountSchemaLine>
{

    /** Standard Constructor */
    public M_DiscountSchemaLineAssert (X_M_DiscountSchemaLine actual)
    {
      super (actual, M_DiscountSchemaLineAssert.class);
    }


	public M_DiscountSchemaLineAssert hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_DiscountSchemaLineAssert hasC_ConversionType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ConversionType_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_ConversionType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_DiscountSchemaLineAssert hasClassification(String expected)
	{
		isNotNull();
		String actualField = actual.getClassification();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Classification: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_DiscountSchemaLineAssert hasConversionDate(Object expected)
	{
		isNotNull();
		dateAssert("ConversionDate", actual.getConversionDate(), expected);
		return myself;
	}


	public M_DiscountSchemaLineAssert hasGroup1(String expected)
	{
		isNotNull();
		String actualField = actual.getGroup1();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Group1: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_DiscountSchemaLineAssert hasGroup2(String expected)
	{
		isNotNull();
		String actualField = actual.getGroup2();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Group2: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_DiscountSchemaLineAssert hasLimit_AddAmt(Object expected)
	{
		isNotNull();
		bdAssert("Limit_AddAmt", actual.getLimit_AddAmt(), expected);
		return myself;
	}


	public M_DiscountSchemaLineAssert hasLimit_Base(String expected)
	{
		isNotNull();
		String actualField = actual.getLimit_Base();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Limit_Base: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_DiscountSchemaLineAssert hasLimit_Discount(Object expected)
	{
		isNotNull();
		bdAssert("Limit_Discount", actual.getLimit_Discount(), expected);
		return myself;
	}


	public M_DiscountSchemaLineAssert hasLimit_Fixed(Object expected)
	{
		isNotNull();
		bdAssert("Limit_Fixed", actual.getLimit_Fixed(), expected);
		return myself;
	}


	public M_DiscountSchemaLineAssert hasLimit_MaxAmt(Object expected)
	{
		isNotNull();
		bdAssert("Limit_MaxAmt", actual.getLimit_MaxAmt(), expected);
		return myself;
	}


	public M_DiscountSchemaLineAssert hasLimit_MinAmt(Object expected)
	{
		isNotNull();
		bdAssert("Limit_MinAmt", actual.getLimit_MinAmt(), expected);
		return myself;
	}


	public M_DiscountSchemaLineAssert hasLimit_Rounding(String expected)
	{
		isNotNull();
		String actualField = actual.getLimit_Rounding();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Limit_Rounding: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_DiscountSchemaLineAssert hasList_AddAmt(Object expected)
	{
		isNotNull();
		bdAssert("List_AddAmt", actual.getList_AddAmt(), expected);
		return myself;
	}


	public M_DiscountSchemaLineAssert hasList_Base(String expected)
	{
		isNotNull();
		String actualField = actual.getList_Base();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have List_Base: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_DiscountSchemaLineAssert hasList_Discount(Object expected)
	{
		isNotNull();
		bdAssert("List_Discount", actual.getList_Discount(), expected);
		return myself;
	}


	public M_DiscountSchemaLineAssert hasList_Fixed(Object expected)
	{
		isNotNull();
		bdAssert("List_Fixed", actual.getList_Fixed(), expected);
		return myself;
	}


	public M_DiscountSchemaLineAssert hasList_MaxAmt(Object expected)
	{
		isNotNull();
		bdAssert("List_MaxAmt", actual.getList_MaxAmt(), expected);
		return myself;
	}


	public M_DiscountSchemaLineAssert hasList_MinAmt(Object expected)
	{
		isNotNull();
		bdAssert("List_MinAmt", actual.getList_MinAmt(), expected);
		return myself;
	}


	public M_DiscountSchemaLineAssert hasList_Rounding(String expected)
	{
		isNotNull();
		String actualField = actual.getList_Rounding();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have List_Rounding: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_DiscountSchemaLineAssert hasM_DiscountSchema_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_DiscountSchema_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_DiscountSchema_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_DiscountSchemaLineAssert hasM_DiscountSchemaLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_DiscountSchemaLine_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_DiscountSchemaLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_DiscountSchemaLineAssert hasM_DiscountSchemaLine_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getM_DiscountSchemaLine_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_DiscountSchemaLine_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_DiscountSchemaLineAssert hasM_Product_Category_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_Category_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Product_Category_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_DiscountSchemaLineAssert hasM_Product_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Product_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_DiscountSchemaLineAssert hasSeqNo(int expected)
	{
		isNotNull();
		int actualField = actual.getSeqNo();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SeqNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_DiscountSchemaLineAssert hasStd_AddAmt(Object expected)
	{
		isNotNull();
		bdAssert("Std_AddAmt", actual.getStd_AddAmt(), expected);
		return myself;
	}


	public M_DiscountSchemaLineAssert hasStd_Base(String expected)
	{
		isNotNull();
		String actualField = actual.getStd_Base();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Std_Base: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_DiscountSchemaLineAssert hasStd_Discount(Object expected)
	{
		isNotNull();
		bdAssert("Std_Discount", actual.getStd_Discount(), expected);
		return myself;
	}


	public M_DiscountSchemaLineAssert hasStd_Fixed(Object expected)
	{
		isNotNull();
		bdAssert("Std_Fixed", actual.getStd_Fixed(), expected);
		return myself;
	}


	public M_DiscountSchemaLineAssert hasStd_MaxAmt(Object expected)
	{
		isNotNull();
		bdAssert("Std_MaxAmt", actual.getStd_MaxAmt(), expected);
		return myself;
	}


	public M_DiscountSchemaLineAssert hasStd_MinAmt(Object expected)
	{
		isNotNull();
		bdAssert("Std_MinAmt", actual.getStd_MinAmt(), expected);
		return myself;
	}


	public M_DiscountSchemaLineAssert hasStd_Rounding(String expected)
	{
		isNotNull();
		String actualField = actual.getStd_Rounding();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Std_Rounding: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}