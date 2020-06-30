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
import org.compiere.model.X_T_BOM_Indented;

/** Generated assertion class for T_BOM_Indented
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class T_BOM_IndentedAssert
	extends AbstractPOAssert<T_BOM_IndentedAssert,X_T_BOM_Indented>
{

    /** Standard Constructor */
    public T_BOM_IndentedAssert (X_T_BOM_Indented actual)
    {
      super (actual, T_BOM_IndentedAssert.class);
    }


	public T_BOM_IndentedAssert hasAD_PInstance_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PInstance_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_PInstance_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_BOM_IndentedAssert hasC_AcctSchema_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_AcctSchema_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_AcctSchema_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_BOM_IndentedAssert hasCost(Object expected)
	{
		isNotNull();
		bdAssert("Cost", actual.getCost(), expected);
		return myself;
	}


	public T_BOM_IndentedAssert hasCostFuture(Object expected)
	{
		isNotNull();
		bdAssert("CostFuture", actual.getCostFuture(), expected);
		return myself;
	}


	public T_BOM_IndentedAssert hasCurrentCostPrice(Object expected)
	{
		isNotNull();
		bdAssert("CurrentCostPrice", actual.getCurrentCostPrice(), expected);
		return myself;
	}


	public T_BOM_IndentedAssert hasCurrentCostPriceLL(Object expected)
	{
		isNotNull();
		bdAssert("CurrentCostPriceLL", actual.getCurrentCostPriceLL(), expected);
		return myself;
	}


	public T_BOM_IndentedAssert hasFutureCostPrice(Object expected)
	{
		isNotNull();
		bdAssert("FutureCostPrice", actual.getFutureCostPrice(), expected);
		return myself;
	}


	public T_BOM_IndentedAssert hasFutureCostPriceLL(Object expected)
	{
		isNotNull();
		bdAssert("FutureCostPriceLL", actual.getFutureCostPriceLL(), expected);
		return myself;
	}


	public T_BOM_IndentedAssert hasLevelNo(int expected)
	{
		isNotNull();
		int actualField = actual.getLevelNo();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have LevelNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_BOM_IndentedAssert hasLevels(String expected)
	{
		isNotNull();
		String actualField = actual.getLevels();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Levels: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_BOM_IndentedAssert hasM_CostElement_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_CostElement_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_CostElement_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_BOM_IndentedAssert hasM_Product_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Product_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_BOM_IndentedAssert hasQty(Object expected)
	{
		isNotNull();
		bdAssert("Qty", actual.getQty(), expected);
		return myself;
	}


	public T_BOM_IndentedAssert hasQtyBOM(Object expected)
	{
		isNotNull();
		bdAssert("QtyBOM", actual.getQtyBOM(), expected);
		return myself;
	}


	public T_BOM_IndentedAssert hasSel_Product_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getSel_Product_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Sel_Product_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_BOM_IndentedAssert hasSeqNo(int expected)
	{
		isNotNull();
		int actualField = actual.getSeqNo();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SeqNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_BOM_IndentedAssert hasT_BOM_Indented_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getT_BOM_Indented_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have T_BOM_Indented_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_BOM_IndentedAssert hasT_BOM_Indented_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getT_BOM_Indented_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have T_BOM_Indented_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}