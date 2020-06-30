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
import org.compiere.model.X_M_Product_PO;

/** Generated assertion class for M_Product_PO
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class M_Product_POAssert
	extends AbstractPOAssert<M_Product_POAssert,X_M_Product_PO>
{

    /** Standard Constructor */
    public M_Product_POAssert (X_M_Product_PO actual)
    {
      super (actual, M_Product_POAssert.class);
    }


	public M_Product_POAssert hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_Product_POAssert hasC_Currency_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Currency_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Currency_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_Product_POAssert hasC_UOM_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_UOM_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_UOM_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_Product_POAssert hasCostPerOrder(Object expected)
	{
		isNotNull();
		bdAssert("CostPerOrder", actual.getCostPerOrder(), expected);
		return myself;
	}


	public M_Product_POAssert hasDeliveryTime_Actual(int expected)
	{
		isNotNull();
		int actualField = actual.getDeliveryTime_Actual();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DeliveryTime_Actual: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_Product_POAssert hasDeliveryTime_Promised(int expected)
	{
		isNotNull();
		int actualField = actual.getDeliveryTime_Promised();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DeliveryTime_Promised: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_Product_POAssert isDiscontinued()
	{
		isNotNull();
		if (!actual.isDiscontinued()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Discontinued\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_Product_POAssert isNotDiscontinued()
	{
		isNotNull();
		if (actual.isDiscontinued()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Discontinued\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_Product_POAssert hasDiscontinuedAt(Object expected)
	{
		isNotNull();
		dateAssert("DiscontinuedAt", actual.getDiscontinuedAt(), expected);
		return myself;
	}


	public M_Product_POAssert isCurrentVendor()
	{
		isNotNull();
		if (!actual.isCurrentVendor()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CurrentVendor\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_Product_POAssert isNotCurrentVendor()
	{
		isNotNull();
		if (actual.isCurrentVendor()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CurrentVendor\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_Product_POAssert hasM_Product_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Product_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_Product_POAssert hasM_Product_PO_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getM_Product_PO_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Product_PO_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_Product_POAssert hasManufacturer(String expected)
	{
		isNotNull();
		String actualField = actual.getManufacturer();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Manufacturer: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_Product_POAssert hasOrder_Min(Object expected)
	{
		isNotNull();
		bdAssert("Order_Min", actual.getOrder_Min(), expected);
		return myself;
	}


	public M_Product_POAssert hasOrder_Pack(Object expected)
	{
		isNotNull();
		bdAssert("Order_Pack", actual.getOrder_Pack(), expected);
		return myself;
	}


	public M_Product_POAssert hasPriceEffective(Object expected)
	{
		isNotNull();
		dateAssert("PriceEffective", actual.getPriceEffective(), expected);
		return myself;
	}


	public M_Product_POAssert hasPriceLastInv(Object expected)
	{
		isNotNull();
		bdAssert("PriceLastInv", actual.getPriceLastInv(), expected);
		return myself;
	}


	public M_Product_POAssert hasPriceLastPO(Object expected)
	{
		isNotNull();
		bdAssert("PriceLastPO", actual.getPriceLastPO(), expected);
		return myself;
	}


	public M_Product_POAssert hasPriceList(Object expected)
	{
		isNotNull();
		bdAssert("PriceList", actual.getPriceList(), expected);
		return myself;
	}


	public M_Product_POAssert hasPricePO(Object expected)
	{
		isNotNull();
		bdAssert("PricePO", actual.getPricePO(), expected);
		return myself;
	}


	public M_Product_POAssert hasQualityRating(int expected)
	{
		isNotNull();
		int actualField = actual.getQualityRating();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have QualityRating: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_Product_POAssert hasRoyaltyAmt(Object expected)
	{
		isNotNull();
		bdAssert("RoyaltyAmt", actual.getRoyaltyAmt(), expected);
		return myself;
	}


	public M_Product_POAssert hasUPC(String expected)
	{
		isNotNull();
		String actualField = actual.getUPC();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have UPC: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_Product_POAssert hasVendorCategory(String expected)
	{
		isNotNull();
		String actualField = actual.getVendorCategory();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have VendorCategory: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_Product_POAssert hasVendorProductNo(String expected)
	{
		isNotNull();
		String actualField = actual.getVendorProductNo();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have VendorProductNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}