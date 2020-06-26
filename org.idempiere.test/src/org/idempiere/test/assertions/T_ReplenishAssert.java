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
import org.compiere.model.X_T_Replenish;

/** Generated assertion class for T_Replenish
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class T_ReplenishAssert
	extends AbstractPOAssert<T_ReplenishAssert,X_T_Replenish>
{

    /** Standard Constructor */
    public T_ReplenishAssert (X_T_Replenish actual)
    {
      super (actual, T_ReplenishAssert.class);
    }


	public T_ReplenishAssert hasAD_PInstance_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PInstance_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_PInstance_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_ReplenishAssert hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_ReplenishAssert hasC_DocType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_DocType_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_DocType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_ReplenishAssert hasLevel_Max(Object expected)
	{
		isNotNull();
		bdAssert("Level_Max", actual.getLevel_Max(), expected);
		return myself;
	}


	public T_ReplenishAssert hasLevel_Min(Object expected)
	{
		isNotNull();
		bdAssert("Level_Min", actual.getLevel_Min(), expected);
		return myself;
	}


	public T_ReplenishAssert hasM_Product_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Product_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_ReplenishAssert hasM_Warehouse_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Warehouse_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Warehouse_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_ReplenishAssert hasM_WarehouseSource_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_WarehouseSource_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_WarehouseSource_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_ReplenishAssert hasOrder_Min(Object expected)
	{
		isNotNull();
		bdAssert("Order_Min", actual.getOrder_Min(), expected);
		return myself;
	}


	public T_ReplenishAssert hasOrder_Pack(Object expected)
	{
		isNotNull();
		bdAssert("Order_Pack", actual.getOrder_Pack(), expected);
		return myself;
	}


	public T_ReplenishAssert hasQtyOnHand(Object expected)
	{
		isNotNull();
		bdAssert("QtyOnHand", actual.getQtyOnHand(), expected);
		return myself;
	}


	public T_ReplenishAssert hasQtyOrdered(Object expected)
	{
		isNotNull();
		bdAssert("QtyOrdered", actual.getQtyOrdered(), expected);
		return myself;
	}


	public T_ReplenishAssert hasQtyReserved(Object expected)
	{
		isNotNull();
		bdAssert("QtyReserved", actual.getQtyReserved(), expected);
		return myself;
	}


	public T_ReplenishAssert hasQtyToOrder(Object expected)
	{
		isNotNull();
		bdAssert("QtyToOrder", actual.getQtyToOrder(), expected);
		return myself;
	}


	public T_ReplenishAssert hasReplenishmentCreate(String expected)
	{
		isNotNull();
		String actualField = actual.getReplenishmentCreate();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ReplenishmentCreate: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_ReplenishAssert hasReplenishType(String expected)
	{
		isNotNull();
		String actualField = actual.getReplenishType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ReplenishType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_ReplenishAssert hasT_Replenish_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getT_Replenish_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have T_Replenish_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}