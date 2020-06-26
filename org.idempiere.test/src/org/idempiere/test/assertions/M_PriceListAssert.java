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
import org.compiere.model.X_M_PriceList;

/** Generated assertion class for M_PriceList
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class M_PriceListAssert
	extends AbstractPOAssert<M_PriceListAssert,X_M_PriceList>
{

    /** Standard Constructor */
    public M_PriceListAssert (X_M_PriceList actual)
    {
      super (actual, M_PriceListAssert.class);
    }


	public M_PriceListAssert hasBasePriceList_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getBasePriceList_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have BasePriceList_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PriceListAssert hasC_Currency_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Currency_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Currency_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PriceListAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PriceListAssert isEnforcePriceLimit()
	{
		isNotNull();
		if (!actual.isEnforcePriceLimit()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be EnforcePriceLimit\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_PriceListAssert isNotEnforcePriceLimit()
	{
		isNotNull();
		if (actual.isEnforcePriceLimit()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be EnforcePriceLimit\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_PriceListAssert isDefault()
	{
		isNotNull();
		if (!actual.isDefault()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Default\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_PriceListAssert isNotDefault()
	{
		isNotNull();
		if (actual.isDefault()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Default\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_PriceListAssert isMandatory()
	{
		isNotNull();
		if (!actual.isMandatory()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Mandatory\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_PriceListAssert isNotMandatory()
	{
		isNotNull();
		if (actual.isMandatory()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Mandatory\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_PriceListAssert isPresentForProduct()
	{
		isNotNull();
		if (!actual.isPresentForProduct()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PresentForProduct\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_PriceListAssert isNotPresentForProduct()
	{
		isNotNull();
		if (actual.isPresentForProduct()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PresentForProduct\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_PriceListAssert isSOPriceList()
	{
		isNotNull();
		if (!actual.isSOPriceList()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SOPriceList\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_PriceListAssert isNotSOPriceList()
	{
		isNotNull();
		if (actual.isSOPriceList()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SOPriceList\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_PriceListAssert isTaxIncluded()
	{
		isNotNull();
		if (!actual.isTaxIncluded()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be TaxIncluded\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_PriceListAssert isNotTaxIncluded()
	{
		isNotNull();
		if (actual.isTaxIncluded()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be TaxIncluded\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_PriceListAssert hasM_PriceList_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_PriceList_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_PriceList_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PriceListAssert hasM_PriceList_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getM_PriceList_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_PriceList_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PriceListAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PriceListAssert hasPricePrecision(int expected)
	{
		isNotNull();
		int actualField = actual.getPricePrecision();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PricePrecision: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}