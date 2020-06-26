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
import org.compiere.model.X_I_Inventory;

/** Generated assertion class for I_Inventory
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class I_InventoryAssert
	extends AbstractPOAssert<I_InventoryAssert,X_I_Inventory>
{

    /** Standard Constructor */
    public I_InventoryAssert (X_I_Inventory actual)
    {
      super (actual, I_InventoryAssert.class);
    }


	public I_InventoryAssert hasC_Charge_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Charge_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Charge_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_InventoryAssert hasC_DocType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_DocType_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_DocType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_InventoryAssert hasChargeName(String expected)
	{
		isNotNull();
		String actualField = actual.getChargeName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ChargeName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_InventoryAssert hasCurrentCostPrice(Object expected)
	{
		isNotNull();
		bdAssert("CurrentCostPrice", actual.getCurrentCostPrice(), expected);
		return myself;
	}


	public I_InventoryAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_InventoryAssert hasDocTypeName(String expected)
	{
		isNotNull();
		String actualField = actual.getDocTypeName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DocTypeName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_InventoryAssert hasI_ErrorMsg(String expected)
	{
		isNotNull();
		String actualField = actual.getI_ErrorMsg();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have I_ErrorMsg: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_InventoryAssert hasI_Inventory_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getI_Inventory_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have I_Inventory_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_InventoryAssert hasI_Inventory_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getI_Inventory_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have I_Inventory_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_InventoryAssert isI_IsImported()
	{
		isNotNull();
		if (!actual.isI_IsImported()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be I_IsImported\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public I_InventoryAssert isNotI_IsImported()
	{
		isNotNull();
		if (actual.isI_IsImported()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be I_IsImported\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public I_InventoryAssert hasLocatorValue(String expected)
	{
		isNotNull();
		String actualField = actual.getLocatorValue();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have LocatorValue: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_InventoryAssert hasLot(String expected)
	{
		isNotNull();
		String actualField = actual.getLot();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Lot: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_InventoryAssert hasM_CostingLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_CostingLine_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_CostingLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_InventoryAssert hasM_Inventory_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Inventory_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Inventory_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_InventoryAssert hasM_InventoryLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_InventoryLine_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_InventoryLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_InventoryAssert hasM_Locator_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Locator_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Locator_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_InventoryAssert hasM_Product_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Product_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_InventoryAssert hasM_Warehouse_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Warehouse_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Warehouse_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_InventoryAssert hasMovementDate(Object expected)
	{
		isNotNull();
		dateAssert("MovementDate", actual.getMovementDate(), expected);
		return myself;
	}


	public I_InventoryAssert isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public I_InventoryAssert isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public I_InventoryAssert hasQtyBook(Object expected)
	{
		isNotNull();
		bdAssert("QtyBook", actual.getQtyBook(), expected);
		return myself;
	}


	public I_InventoryAssert hasQtyCount(Object expected)
	{
		isNotNull();
		bdAssert("QtyCount", actual.getQtyCount(), expected);
		return myself;
	}


	public I_InventoryAssert hasQtyInternalUse(Object expected)
	{
		isNotNull();
		bdAssert("QtyInternalUse", actual.getQtyInternalUse(), expected);
		return myself;
	}


	public I_InventoryAssert hasSerNo(String expected)
	{
		isNotNull();
		String actualField = actual.getSerNo();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SerNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_InventoryAssert hasUPC(String expected)
	{
		isNotNull();
		String actualField = actual.getUPC();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have UPC: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_InventoryAssert hasValue(String expected)
	{
		isNotNull();
		String actualField = actual.getValue();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Value: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_InventoryAssert hasWarehouseValue(String expected)
	{
		isNotNull();
		String actualField = actual.getWarehouseValue();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have WarehouseValue: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_InventoryAssert hasX(String expected)
	{
		isNotNull();
		String actualField = actual.getX();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have X: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_InventoryAssert hasY(String expected)
	{
		isNotNull();
		String actualField = actual.getY();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Y: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_InventoryAssert hasZ(String expected)
	{
		isNotNull();
		String actualField = actual.getZ();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Z: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}