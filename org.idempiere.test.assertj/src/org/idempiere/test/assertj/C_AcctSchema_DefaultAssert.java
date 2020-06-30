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
import org.compiere.model.X_C_AcctSchema_Default;

/** Generated assertion class for C_AcctSchema_Default
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_AcctSchema_DefaultAssert
	extends AbstractPOAssert<C_AcctSchema_DefaultAssert,X_C_AcctSchema_Default>
{

    /** Standard Constructor */
    public C_AcctSchema_DefaultAssert (X_C_AcctSchema_Default actual)
    {
      super (actual, C_AcctSchema_DefaultAssert.class);
    }


	public C_AcctSchema_DefaultAssert hasB_Asset_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getB_Asset_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have B_Asset_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasB_InterestExp_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getB_InterestExp_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have B_InterestExp_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasB_InterestRev_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getB_InterestRev_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have B_InterestRev_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasB_InTransit_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getB_InTransit_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have B_InTransit_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasB_PaymentSelect_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getB_PaymentSelect_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have B_PaymentSelect_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasB_UnallocatedCash_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getB_UnallocatedCash_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have B_UnallocatedCash_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasC_AcctSchema_Default_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_AcctSchema_Default_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_AcctSchema_Default_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasC_AcctSchema_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_AcctSchema_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_AcctSchema_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasC_Prepayment_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Prepayment_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Prepayment_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasC_Receivable_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Receivable_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Receivable_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasC_Receivable_Services_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Receivable_Services_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Receivable_Services_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasCB_Asset_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getCB_Asset_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CB_Asset_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasCB_CashTransfer_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getCB_CashTransfer_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CB_CashTransfer_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasCB_Differences_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getCB_Differences_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CB_Differences_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasCB_Expense_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getCB_Expense_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CB_Expense_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasCB_Receipt_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getCB_Receipt_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CB_Receipt_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasCh_Expense_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getCh_Expense_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Ch_Expense_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasNotInvoicedReceipts_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getNotInvoicedReceipts_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have NotInvoicedReceipts_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasP_Asset_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getP_Asset_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have P_Asset_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasP_AverageCostVariance_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getP_AverageCostVariance_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have P_AverageCostVariance_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasP_COGS_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getP_COGS_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have P_COGS_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasP_CostAdjustment_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getP_CostAdjustment_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have P_CostAdjustment_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasP_Expense_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getP_Expense_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have P_Expense_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasP_InventoryClearing_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getP_InventoryClearing_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have P_InventoryClearing_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasP_InvoicePriceVariance_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getP_InvoicePriceVariance_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have P_InvoicePriceVariance_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasP_LandedCostClearing_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getP_LandedCostClearing_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have P_LandedCostClearing_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasP_PurchasePriceVariance_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getP_PurchasePriceVariance_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have P_PurchasePriceVariance_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasP_RateVariance_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getP_RateVariance_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have P_RateVariance_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasP_Revenue_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getP_Revenue_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have P_Revenue_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasP_TradeDiscountGrant_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getP_TradeDiscountGrant_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have P_TradeDiscountGrant_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasP_TradeDiscountRec_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getP_TradeDiscountRec_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have P_TradeDiscountRec_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasPayDiscount_Exp_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getPayDiscount_Exp_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PayDiscount_Exp_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasPayDiscount_Rev_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getPayDiscount_Rev_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PayDiscount_Rev_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasPJ_Asset_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getPJ_Asset_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PJ_Asset_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasPJ_WIP_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getPJ_WIP_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PJ_WIP_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasRealizedGain_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getRealizedGain_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have RealizedGain_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasRealizedLoss_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getRealizedLoss_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have RealizedLoss_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasT_Credit_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getT_Credit_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have T_Credit_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasT_Due_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getT_Due_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have T_Due_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasT_Expense_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getT_Expense_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have T_Expense_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasUnEarnedRevenue_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getUnEarnedRevenue_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have UnEarnedRevenue_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasUnrealizedGain_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getUnrealizedGain_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have UnrealizedGain_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasUnrealizedLoss_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getUnrealizedLoss_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have UnrealizedLoss_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasV_Liability_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getV_Liability_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have V_Liability_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasV_Liability_Services_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getV_Liability_Services_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have V_Liability_Services_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasV_Prepayment_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getV_Prepayment_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have V_Prepayment_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasW_Differences_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getW_Differences_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have W_Differences_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchema_DefaultAssert hasWriteOff_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getWriteOff_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have WriteOff_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}