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
import org.compiere.model.X_RV_WarehousePrice;

/** Generated assertion class for RV_WarehousePrice
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class RV_WarehousePriceAssert
	extends AbstractPOAssert<RV_WarehousePriceAssert,X_RV_WarehousePrice>
{

    /** Standard Constructor */
    public RV_WarehousePriceAssert (X_RV_WarehousePrice actual)
    {
      super (actual, RV_WarehousePriceAssert.class);
    }


	public RV_WarehousePriceAssert hasC_UOM_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_UOM_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_UOM_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_WarehousePriceAssert isInstanceAttribute()
	{
		isNotNull();
		if (!actual.isInstanceAttribute()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be InstanceAttribute\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public RV_WarehousePriceAssert isNotInstanceAttribute()
	{
		isNotNull();
		if (actual.isInstanceAttribute()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be InstanceAttribute\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public RV_WarehousePriceAssert hasM_PriceList_Version_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_PriceList_Version_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_PriceList_Version_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_WarehousePriceAssert hasM_Product_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Product_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_WarehousePriceAssert hasM_Warehouse_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Warehouse_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Warehouse_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_WarehousePriceAssert hasMargin(Object expected)
	{
		isNotNull();
		bdAssert("Margin", actual.getMargin(), expected);
		return myself;
	}


	public RV_WarehousePriceAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_WarehousePriceAssert hasPriceLimit(Object expected)
	{
		isNotNull();
		bdAssert("PriceLimit", actual.getPriceLimit(), expected);
		return myself;
	}


	public RV_WarehousePriceAssert hasPriceList(Object expected)
	{
		isNotNull();
		bdAssert("PriceList", actual.getPriceList(), expected);
		return myself;
	}


	public RV_WarehousePriceAssert hasPriceStd(Object expected)
	{
		isNotNull();
		bdAssert("PriceStd", actual.getPriceStd(), expected);
		return myself;
	}


	public RV_WarehousePriceAssert hasQtyAvailable(Object expected)
	{
		isNotNull();
		bdAssert("QtyAvailable", actual.getQtyAvailable(), expected);
		return myself;
	}


	public RV_WarehousePriceAssert hasQtyOnHand(Object expected)
	{
		isNotNull();
		bdAssert("QtyOnHand", actual.getQtyOnHand(), expected);
		return myself;
	}


	public RV_WarehousePriceAssert hasQtyOrdered(Object expected)
	{
		isNotNull();
		bdAssert("QtyOrdered", actual.getQtyOrdered(), expected);
		return myself;
	}


	public RV_WarehousePriceAssert hasQtyReserved(Object expected)
	{
		isNotNull();
		bdAssert("QtyReserved", actual.getQtyReserved(), expected);
		return myself;
	}


	public RV_WarehousePriceAssert hasSKU(String expected)
	{
		isNotNull();
		String actualField = actual.getSKU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SKU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_WarehousePriceAssert hasUOMSymbol(String expected)
	{
		isNotNull();
		String actualField = actual.getUOMSymbol();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have UOMSymbol: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_WarehousePriceAssert hasUPC(String expected)
	{
		isNotNull();
		String actualField = actual.getUPC();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have UPC: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_WarehousePriceAssert hasValue(String expected)
	{
		isNotNull();
		String actualField = actual.getValue();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Value: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_WarehousePriceAssert hasWarehouseName(String expected)
	{
		isNotNull();
		String actualField = actual.getWarehouseName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have WarehouseName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}