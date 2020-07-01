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
import org.compiere.model.X_M_Product_PO;

/** Generated assertion class for M_Product_PO
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractM_Product_POAssert<SELF extends AbstractM_Product_POAssert<SELF, ACTUAL>, ACTUAL extends X_M_Product_PO>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractM_Product_POAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Currency_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Currency_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Currency_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_UOM_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_UOM_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_UOM_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasCostPerOrder(Object expected)
	{
		isNotNull();
		bdAssert("CostPerOrder", actual.getCostPerOrder(), expected);
		return myself;
	}


	public SELF hasDeliveryTime_Actual(int expected)
	{
		isNotNull();
		int actualField = actual.getDeliveryTime_Actual();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DeliveryTime_Actual: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasDeliveryTime_Promised(int expected)
	{
		isNotNull();
		int actualField = actual.getDeliveryTime_Promised();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DeliveryTime_Promised: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isDiscontinued()
	{
		isNotNull();
		if (!actual.isDiscontinued()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Discontinued\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotDiscontinued()
	{
		isNotNull();
		if (actual.isDiscontinued()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Discontinued\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasDiscontinuedAt(Object expected)
	{
		isNotNull();
		dateAssert("DiscontinuedAt", actual.getDiscontinuedAt(), expected);
		return myself;
	}


	public SELF isCurrentVendor()
	{
		isNotNull();
		if (!actual.isCurrentVendor()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CurrentVendor\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotCurrentVendor()
	{
		isNotNull();
		if (actual.isCurrentVendor()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CurrentVendor\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasM_Product_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Product_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_Product_PO_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getM_Product_PO_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Product_PO_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasManufacturer(String expected)
	{
		isNotNull();
		String actualField = actual.getManufacturer();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Manufacturer: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasOrder_Min(Object expected)
	{
		isNotNull();
		bdAssert("Order_Min", actual.getOrder_Min(), expected);
		return myself;
	}


	public SELF hasOrder_Pack(Object expected)
	{
		isNotNull();
		bdAssert("Order_Pack", actual.getOrder_Pack(), expected);
		return myself;
	}


	public SELF hasPriceEffective(Object expected)
	{
		isNotNull();
		dateAssert("PriceEffective", actual.getPriceEffective(), expected);
		return myself;
	}


	public SELF hasPriceLastInv(Object expected)
	{
		isNotNull();
		bdAssert("PriceLastInv", actual.getPriceLastInv(), expected);
		return myself;
	}


	public SELF hasPriceLastPO(Object expected)
	{
		isNotNull();
		bdAssert("PriceLastPO", actual.getPriceLastPO(), expected);
		return myself;
	}


	public SELF hasPriceList(Object expected)
	{
		isNotNull();
		bdAssert("PriceList", actual.getPriceList(), expected);
		return myself;
	}


	public SELF hasPricePO(Object expected)
	{
		isNotNull();
		bdAssert("PricePO", actual.getPricePO(), expected);
		return myself;
	}


	public SELF hasQualityRating(int expected)
	{
		isNotNull();
		int actualField = actual.getQualityRating();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have QualityRating: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasRoyaltyAmt(Object expected)
	{
		isNotNull();
		bdAssert("RoyaltyAmt", actual.getRoyaltyAmt(), expected);
		return myself;
	}


	public SELF hasUPC(String expected)
	{
		isNotNull();
		String actualField = actual.getUPC();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have UPC: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasVendorCategory(String expected)
	{
		isNotNull();
		String actualField = actual.getVendorCategory();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have VendorCategory: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasVendorProductNo(String expected)
	{
		isNotNull();
		String actualField = actual.getVendorProductNo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have VendorProductNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}