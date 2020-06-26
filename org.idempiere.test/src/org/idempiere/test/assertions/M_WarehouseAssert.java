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
import org.compiere.model.X_M_Warehouse;

/** Generated assertion class for M_Warehouse
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class M_WarehouseAssert
	extends AbstractPOAssert<M_WarehouseAssert,X_M_Warehouse>
{

    /** Standard Constructor */
    public M_WarehouseAssert (X_M_Warehouse actual)
    {
      super (actual, M_WarehouseAssert.class);
    }


	public M_WarehouseAssert hasC_Location_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Location_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Location_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_WarehouseAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_WarehouseAssert isDisallowNegativeInv()
	{
		isNotNull();
		if (!actual.isDisallowNegativeInv()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DisallowNegativeInv\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_WarehouseAssert isNotDisallowNegativeInv()
	{
		isNotNull();
		if (actual.isDisallowNegativeInv()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DisallowNegativeInv\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_WarehouseAssert isInTransit()
	{
		isNotNull();
		if (!actual.isInTransit()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be InTransit\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_WarehouseAssert isNotInTransit()
	{
		isNotNull();
		if (actual.isInTransit()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be InTransit\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_WarehouseAssert hasM_ReserveLocator_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_ReserveLocator_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_ReserveLocator_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_WarehouseAssert hasM_Warehouse_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Warehouse_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Warehouse_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_WarehouseAssert hasM_Warehouse_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getM_Warehouse_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Warehouse_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_WarehouseAssert hasM_WarehouseSource_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_WarehouseSource_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_WarehouseSource_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_WarehouseAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_WarehouseAssert hasReplenishmentClass(String expected)
	{
		isNotNull();
		String actualField = actual.getReplenishmentClass();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ReplenishmentClass: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_WarehouseAssert hasSeparator(String expected)
	{
		isNotNull();
		String actualField = actual.getSeparator();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Separator: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_WarehouseAssert hasValue(String expected)
	{
		isNotNull();
		String actualField = actual.getValue();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Value: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}