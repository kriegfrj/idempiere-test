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
import org.compiere.model.X_I_PriceList;

/** Generated assertion class for I_PriceList
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class I_PriceListAssert
	extends AbstractPOAssert<I_PriceListAssert,X_I_PriceList>
{

    /** Standard Constructor */
    public I_PriceListAssert (X_I_PriceList actual)
    {
      super (actual, I_PriceListAssert.class);
    }


	public I_PriceListAssert hasBPartner_Value(String expected)
	{
		isNotNull();
		String actualField = actual.getBPartner_Value();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have BPartner_Value: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_PriceListAssert hasBreakValue(Object expected)
	{
		isNotNull();
		bdAssert("BreakValue", actual.getBreakValue(), expected);
		return myself;
	}


	public I_PriceListAssert hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_PriceListAssert hasC_Currency_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Currency_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Currency_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_PriceListAssert hasC_UOM_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_UOM_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_UOM_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_PriceListAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_PriceListAssert isEnforcePriceLimit()
	{
		isNotNull();
		if (!actual.isEnforcePriceLimit()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be EnforcePriceLimit\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public I_PriceListAssert isNotEnforcePriceLimit()
	{
		isNotNull();
		if (actual.isEnforcePriceLimit()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be EnforcePriceLimit\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public I_PriceListAssert hasI_ErrorMsg(String expected)
	{
		isNotNull();
		String actualField = actual.getI_ErrorMsg();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have I_ErrorMsg: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_PriceListAssert isI_IsImported()
	{
		isNotNull();
		if (!actual.isI_IsImported()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be I_IsImported\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public I_PriceListAssert isNotI_IsImported()
	{
		isNotNull();
		if (actual.isI_IsImported()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be I_IsImported\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public I_PriceListAssert hasI_PriceList_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getI_PriceList_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have I_PriceList_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_PriceListAssert hasI_PriceList_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getI_PriceList_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have I_PriceList_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_PriceListAssert hasISO_Code(String expected)
	{
		isNotNull();
		String actualField = actual.getISO_Code();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ISO_Code: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_PriceListAssert isSOPriceList()
	{
		isNotNull();
		if (!actual.isSOPriceList()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SOPriceList\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public I_PriceListAssert isNotSOPriceList()
	{
		isNotNull();
		if (actual.isSOPriceList()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SOPriceList\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public I_PriceListAssert isTaxIncluded()
	{
		isNotNull();
		if (!actual.isTaxIncluded()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be TaxIncluded\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public I_PriceListAssert isNotTaxIncluded()
	{
		isNotNull();
		if (actual.isTaxIncluded()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be TaxIncluded\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public I_PriceListAssert hasM_PriceList_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_PriceList_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_PriceList_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_PriceListAssert hasM_PriceList_Version_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_PriceList_Version_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_PriceList_Version_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_PriceListAssert hasM_Product_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Product_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_PriceListAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_PriceListAssert hasPriceLimit(Object expected)
	{
		isNotNull();
		bdAssert("PriceLimit", actual.getPriceLimit(), expected);
		return myself;
	}


	public I_PriceListAssert hasPriceList(Object expected)
	{
		isNotNull();
		bdAssert("PriceList", actual.getPriceList(), expected);
		return myself;
	}


	public I_PriceListAssert hasPricePrecision(int expected)
	{
		isNotNull();
		int actualField = actual.getPricePrecision();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PricePrecision: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_PriceListAssert hasPriceStd(Object expected)
	{
		isNotNull();
		bdAssert("PriceStd", actual.getPriceStd(), expected);
		return myself;
	}


	public I_PriceListAssert isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public I_PriceListAssert isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public I_PriceListAssert hasProductValue(String expected)
	{
		isNotNull();
		String actualField = actual.getProductValue();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ProductValue: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_PriceListAssert hasValidFrom(Object expected)
	{
		isNotNull();
		dateAssert("ValidFrom", actual.getValidFrom(), expected);
		return myself;
	}


	public I_PriceListAssert hasX12DE355(String expected)
	{
		isNotNull();
		String actualField = actual.getX12DE355();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have X12DE355: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}