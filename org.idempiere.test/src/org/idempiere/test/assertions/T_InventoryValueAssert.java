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
import org.compiere.model.X_T_InventoryValue;

/** Generated assertion class for T_InventoryValue
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class T_InventoryValueAssert
	extends AbstractPOAssert<T_InventoryValueAssert,X_T_InventoryValue>
{

    /** Standard Constructor */
    public T_InventoryValueAssert (X_T_InventoryValue actual)
    {
      super (actual, T_InventoryValueAssert.class);
    }


	public T_InventoryValueAssert hasAD_PInstance_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PInstance_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_PInstance_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_InventoryValueAssert hasC_Currency_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Currency_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Currency_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_InventoryValueAssert hasCost(Object expected)
	{
		isNotNull();
		bdAssert("Cost", actual.getCost(), expected);
		return myself;
	}


	public T_InventoryValueAssert hasCostAmt(Object expected)
	{
		isNotNull();
		bdAssert("CostAmt", actual.getCostAmt(), expected);
		return myself;
	}


	public T_InventoryValueAssert hasCostStandard(Object expected)
	{
		isNotNull();
		bdAssert("CostStandard", actual.getCostStandard(), expected);
		return myself;
	}


	public T_InventoryValueAssert hasCostStandardAmt(Object expected)
	{
		isNotNull();
		bdAssert("CostStandardAmt", actual.getCostStandardAmt(), expected);
		return myself;
	}


	public T_InventoryValueAssert hasDateValue(Object expected)
	{
		isNotNull();
		dateAssert("DateValue", actual.getDateValue(), expected);
		return myself;
	}


	public T_InventoryValueAssert hasM_AttributeSetInstance_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_AttributeSetInstance_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_AttributeSetInstance_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_InventoryValueAssert hasM_CostElement_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_CostElement_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_CostElement_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_InventoryValueAssert hasM_PriceList_Version_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_PriceList_Version_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_PriceList_Version_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_InventoryValueAssert hasM_Product_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Product_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_InventoryValueAssert hasM_Warehouse_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Warehouse_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Warehouse_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_InventoryValueAssert hasPriceLimit(Object expected)
	{
		isNotNull();
		bdAssert("PriceLimit", actual.getPriceLimit(), expected);
		return myself;
	}


	public T_InventoryValueAssert hasPriceLimitAmt(Object expected)
	{
		isNotNull();
		bdAssert("PriceLimitAmt", actual.getPriceLimitAmt(), expected);
		return myself;
	}


	public T_InventoryValueAssert hasPriceList(Object expected)
	{
		isNotNull();
		bdAssert("PriceList", actual.getPriceList(), expected);
		return myself;
	}


	public T_InventoryValueAssert hasPriceListAmt(Object expected)
	{
		isNotNull();
		bdAssert("PriceListAmt", actual.getPriceListAmt(), expected);
		return myself;
	}


	public T_InventoryValueAssert hasPricePO(Object expected)
	{
		isNotNull();
		bdAssert("PricePO", actual.getPricePO(), expected);
		return myself;
	}


	public T_InventoryValueAssert hasPricePOAmt(Object expected)
	{
		isNotNull();
		bdAssert("PricePOAmt", actual.getPricePOAmt(), expected);
		return myself;
	}


	public T_InventoryValueAssert hasPriceStd(Object expected)
	{
		isNotNull();
		bdAssert("PriceStd", actual.getPriceStd(), expected);
		return myself;
	}


	public T_InventoryValueAssert hasPriceStdAmt(Object expected)
	{
		isNotNull();
		bdAssert("PriceStdAmt", actual.getPriceStdAmt(), expected);
		return myself;
	}


	public T_InventoryValueAssert hasQtyOnHand(Object expected)
	{
		isNotNull();
		bdAssert("QtyOnHand", actual.getQtyOnHand(), expected);
		return myself;
	}


	public T_InventoryValueAssert hasT_InventoryValue_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getT_InventoryValue_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have T_InventoryValue_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}