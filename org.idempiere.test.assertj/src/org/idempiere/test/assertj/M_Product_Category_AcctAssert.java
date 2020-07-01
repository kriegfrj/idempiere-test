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
import org.compiere.model.X_M_Product_Category_Acct;

/** Generated assertion class for M_Product_Category_Acct
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class M_Product_Category_AcctAssert
	extends AbstractPOAssert<M_Product_Category_AcctAssert,X_M_Product_Category_Acct>
{

    /** Standard Constructor */
    public M_Product_Category_AcctAssert (X_M_Product_Category_Acct actual)
    {
      super (actual, M_Product_Category_AcctAssert.class);
    }


	public M_Product_Category_AcctAssert hasC_AcctSchema_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_AcctSchema_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_AcctSchema_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_Product_Category_AcctAssert hasCostingLevel(String expected)
	{
		isNotNull();
		String actualField = actual.getCostingLevel();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CostingLevel: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_Product_Category_AcctAssert hasCostingMethod(String expected)
	{
		isNotNull();
		String actualField = actual.getCostingMethod();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CostingMethod: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_Product_Category_AcctAssert hasM_Product_Category_Acct_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getM_Product_Category_Acct_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Product_Category_Acct_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_Product_Category_AcctAssert hasM_Product_Category_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_Category_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Product_Category_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_Product_Category_AcctAssert hasP_Asset_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getP_Asset_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have P_Asset_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_Product_Category_AcctAssert hasP_AverageCostVariance_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getP_AverageCostVariance_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have P_AverageCostVariance_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_Product_Category_AcctAssert hasP_COGS_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getP_COGS_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have P_COGS_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_Product_Category_AcctAssert hasP_CostAdjustment_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getP_CostAdjustment_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have P_CostAdjustment_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_Product_Category_AcctAssert hasP_Expense_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getP_Expense_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have P_Expense_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_Product_Category_AcctAssert hasP_InventoryClearing_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getP_InventoryClearing_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have P_InventoryClearing_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_Product_Category_AcctAssert hasP_InvoicePriceVariance_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getP_InvoicePriceVariance_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have P_InvoicePriceVariance_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_Product_Category_AcctAssert hasP_LandedCostClearing_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getP_LandedCostClearing_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have P_LandedCostClearing_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_Product_Category_AcctAssert hasP_PurchasePriceVariance_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getP_PurchasePriceVariance_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have P_PurchasePriceVariance_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_Product_Category_AcctAssert hasP_Revenue_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getP_Revenue_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have P_Revenue_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_Product_Category_AcctAssert hasP_TradeDiscountGrant_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getP_TradeDiscountGrant_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have P_TradeDiscountGrant_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_Product_Category_AcctAssert hasP_TradeDiscountRec_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getP_TradeDiscountRec_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have P_TradeDiscountRec_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}