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
import org.compiere.model.X_M_PerpetualInv;

/** Generated assertion class for M_PerpetualInv
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class M_PerpetualInvAssert
	extends AbstractPOAssert<M_PerpetualInvAssert,X_M_PerpetualInv>
{

    /** Standard Constructor */
    public M_PerpetualInvAssert (X_M_PerpetualInv actual)
    {
      super (actual, M_PerpetualInvAssert.class);
    }


	public M_PerpetualInvAssert isCountHighMovement()
	{
		isNotNull();
		if (!actual.isCountHighMovement()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CountHighMovement\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_PerpetualInvAssert isNotCountHighMovement()
	{
		isNotNull();
		if (actual.isCountHighMovement()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CountHighMovement\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_PerpetualInvAssert hasDateLastRun(Object expected)
	{
		isNotNull();
		dateAssert("DateLastRun", actual.getDateLastRun(), expected);
		return myself;
	}


	public M_PerpetualInvAssert hasDateNextRun(Object expected)
	{
		isNotNull();
		dateAssert("DateNextRun", actual.getDateNextRun(), expected);
		return myself;
	}


	public M_PerpetualInvAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PerpetualInvAssert hasM_PerpetualInv_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_PerpetualInv_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_PerpetualInv_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PerpetualInvAssert hasM_PerpetualInv_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getM_PerpetualInv_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_PerpetualInv_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PerpetualInvAssert hasM_Product_Category_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_Category_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Product_Category_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PerpetualInvAssert hasM_Warehouse_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Warehouse_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Warehouse_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PerpetualInvAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PerpetualInvAssert hasNoInventoryCount(int expected)
	{
		isNotNull();
		int actualField = actual.getNoInventoryCount();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have NoInventoryCount: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PerpetualInvAssert hasNoProductCount(int expected)
	{
		isNotNull();
		int actualField = actual.getNoProductCount();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have NoProductCount: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PerpetualInvAssert hasNumberOfRuns(int expected)
	{
		isNotNull();
		int actualField = actual.getNumberOfRuns();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have NumberOfRuns: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}