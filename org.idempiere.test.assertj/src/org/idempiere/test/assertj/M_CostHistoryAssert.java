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
import org.compiere.model.X_M_CostHistory;

/** Generated assertion class for M_CostHistory
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class M_CostHistoryAssert
	extends AbstractPOAssert<M_CostHistoryAssert,X_M_CostHistory>
{

    /** Standard Constructor */
    public M_CostHistoryAssert (X_M_CostHistory actual)
    {
      super (actual, M_CostHistoryAssert.class);
    }


	public M_CostHistoryAssert hasM_AttributeSetInstance_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_AttributeSetInstance_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_AttributeSetInstance_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_CostHistoryAssert hasM_CostDetail_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_CostDetail_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_CostDetail_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_CostHistoryAssert hasM_CostElement_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_CostElement_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_CostElement_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_CostHistoryAssert hasM_CostHistory_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_CostHistory_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_CostHistory_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_CostHistoryAssert hasM_CostHistory_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getM_CostHistory_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_CostHistory_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_CostHistoryAssert hasM_CostType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_CostType_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_CostType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_CostHistoryAssert hasNewCAmt(Object expected)
	{
		isNotNull();
		bdAssert("NewCAmt", actual.getNewCAmt(), expected);
		return myself;
	}


	public M_CostHistoryAssert hasNewCostPrice(Object expected)
	{
		isNotNull();
		bdAssert("NewCostPrice", actual.getNewCostPrice(), expected);
		return myself;
	}


	public M_CostHistoryAssert hasNewCQty(Object expected)
	{
		isNotNull();
		bdAssert("NewCQty", actual.getNewCQty(), expected);
		return myself;
	}


	public M_CostHistoryAssert hasNewQty(Object expected)
	{
		isNotNull();
		bdAssert("NewQty", actual.getNewQty(), expected);
		return myself;
	}


	public M_CostHistoryAssert hasOldCAmt(Object expected)
	{
		isNotNull();
		bdAssert("OldCAmt", actual.getOldCAmt(), expected);
		return myself;
	}


	public M_CostHistoryAssert hasOldCostPrice(Object expected)
	{
		isNotNull();
		bdAssert("OldCostPrice", actual.getOldCostPrice(), expected);
		return myself;
	}


	public M_CostHistoryAssert hasOldCQty(Object expected)
	{
		isNotNull();
		bdAssert("OldCQty", actual.getOldCQty(), expected);
		return myself;
	}


	public M_CostHistoryAssert hasOldQty(Object expected)
	{
		isNotNull();
		bdAssert("OldQty", actual.getOldQty(), expected);
		return myself;
	}

}