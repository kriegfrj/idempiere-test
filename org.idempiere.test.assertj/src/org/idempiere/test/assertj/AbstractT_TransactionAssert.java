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
import org.compiere.model.X_T_Transaction;

/** Generated assertion class for T_Transaction
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractT_TransactionAssert<SELF extends AbstractT_TransactionAssert<SELF, ACTUAL>, ACTUAL extends X_T_Transaction>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractT_TransactionAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAD_PInstance_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PInstance_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_PInstance_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Project_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Project_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Project_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_ProjectIssue_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ProjectIssue_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_ProjectIssue_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_AttributeSetInstance_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_AttributeSetInstance_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_AttributeSetInstance_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_InOut_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_InOut_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_InOut_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_InOutLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_InOutLine_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_InOutLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_Inventory_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Inventory_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Inventory_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_InventoryLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_InventoryLine_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_InventoryLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_Locator_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Locator_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Locator_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_Movement_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Movement_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Movement_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_MovementLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_MovementLine_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_MovementLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
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

	public SELF hasM_Production_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Production_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Production_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_ProductionLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_ProductionLine_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_ProductionLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_Transaction_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Transaction_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Transaction_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasMovementDate(Object expected)
	{
		isNotNull();
		dateAssert("MovementDate", actual.getMovementDate(), expected);
		return myself;
	}


	public SELF hasMovementQty(Object expected)
	{
		isNotNull();
		bdAssert("MovementQty", actual.getMovementQty(), expected);
		return myself;
	}


	public SELF hasMovementType(String expected)
	{
		isNotNull();
		String actualField = actual.getMovementType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have MovementType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasSearch_InOut_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getSearch_InOut_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Search_InOut_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasSearch_Invoice_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getSearch_Invoice_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Search_Invoice_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasSearch_Order_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getSearch_Order_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Search_Order_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasT_Transaction_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getT_Transaction_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have T_Transaction_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}