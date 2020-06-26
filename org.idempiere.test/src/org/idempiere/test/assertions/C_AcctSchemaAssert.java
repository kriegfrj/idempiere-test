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
import org.compiere.model.X_C_AcctSchema;

/** Generated assertion class for C_AcctSchema
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_AcctSchemaAssert
	extends AbstractPOAssert<C_AcctSchemaAssert,X_C_AcctSchema>
{

    /** Standard Constructor */
    public C_AcctSchemaAssert (X_C_AcctSchema actual)
    {
      super (actual, C_AcctSchemaAssert.class);
    }


	public C_AcctSchemaAssert hasAD_OrgOnly_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_OrgOnly_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_OrgOnly_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchemaAssert isAutoPeriodControl()
	{
		isNotNull();
		if (!actual.isAutoPeriodControl()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AutoPeriodControl\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_AcctSchemaAssert isNotAutoPeriodControl()
	{
		isNotNull();
		if (actual.isAutoPeriodControl()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AutoPeriodControl\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_AcctSchemaAssert hasC_AcctSchema_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_AcctSchema_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_AcctSchema_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchemaAssert hasC_AcctSchema_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_AcctSchema_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_AcctSchema_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchemaAssert hasC_Currency_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Currency_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Currency_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchemaAssert hasC_Period_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Period_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Period_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchemaAssert hasCommitmentType(String expected)
	{
		isNotNull();
		String actualField = actual.getCommitmentType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CommitmentType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchemaAssert hasCostingLevel(String expected)
	{
		isNotNull();
		String actualField = actual.getCostingLevel();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CostingLevel: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchemaAssert hasCostingMethod(String expected)
	{
		isNotNull();
		String actualField = actual.getCostingMethod();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CostingMethod: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchemaAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchemaAssert hasGAAP(String expected)
	{
		isNotNull();
		String actualField = actual.getGAAP();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have GAAP: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchemaAssert isHasAlias()
	{
		isNotNull();
		if (!actual.isHasAlias()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be HasAlias\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_AcctSchemaAssert isNotHasAlias()
	{
		isNotNull();
		if (actual.isHasAlias()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be HasAlias\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_AcctSchemaAssert isHasCombination()
	{
		isNotNull();
		if (!actual.isHasCombination()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be HasCombination\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_AcctSchemaAssert isNotHasCombination()
	{
		isNotNull();
		if (actual.isHasCombination()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be HasCombination\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_AcctSchemaAssert isAccrual()
	{
		isNotNull();
		if (!actual.isAccrual()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Accrual\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_AcctSchemaAssert isNotAccrual()
	{
		isNotNull();
		if (actual.isAccrual()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Accrual\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_AcctSchemaAssert isAdjustCOGS()
	{
		isNotNull();
		if (!actual.isAdjustCOGS()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AdjustCOGS\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_AcctSchemaAssert isNotAdjustCOGS()
	{
		isNotNull();
		if (actual.isAdjustCOGS()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AdjustCOGS\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_AcctSchemaAssert isAllowNegativePosting()
	{
		isNotNull();
		if (!actual.isAllowNegativePosting()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AllowNegativePosting\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_AcctSchemaAssert isNotAllowNegativePosting()
	{
		isNotNull();
		if (actual.isAllowNegativePosting()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AllowNegativePosting\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_AcctSchemaAssert isDiscountCorrectsTax()
	{
		isNotNull();
		if (!actual.isDiscountCorrectsTax()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DiscountCorrectsTax\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_AcctSchemaAssert isNotDiscountCorrectsTax()
	{
		isNotNull();
		if (actual.isDiscountCorrectsTax()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DiscountCorrectsTax\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_AcctSchemaAssert isExplicitCostAdjustment()
	{
		isNotNull();
		if (!actual.isExplicitCostAdjustment()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ExplicitCostAdjustment\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_AcctSchemaAssert isNotExplicitCostAdjustment()
	{
		isNotNull();
		if (actual.isExplicitCostAdjustment()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ExplicitCostAdjustment\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_AcctSchemaAssert isPostIfClearingEqual()
	{
		isNotNull();
		if (!actual.isPostIfClearingEqual()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PostIfClearingEqual\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_AcctSchemaAssert isNotPostIfClearingEqual()
	{
		isNotNull();
		if (actual.isPostIfClearingEqual()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PostIfClearingEqual\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_AcctSchemaAssert isPostServices()
	{
		isNotNull();
		if (!actual.isPostServices()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PostServices\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_AcctSchemaAssert isNotPostServices()
	{
		isNotNull();
		if (actual.isPostServices()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PostServices\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_AcctSchemaAssert isTradeDiscountPosted()
	{
		isNotNull();
		if (!actual.isTradeDiscountPosted()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be TradeDiscountPosted\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_AcctSchemaAssert isNotTradeDiscountPosted()
	{
		isNotNull();
		if (actual.isTradeDiscountPosted()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be TradeDiscountPosted\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_AcctSchemaAssert hasM_CostType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_CostType_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_CostType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchemaAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchemaAssert hasPeriod_OpenFuture(int expected)
	{
		isNotNull();
		int actualField = actual.getPeriod_OpenFuture();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Period_OpenFuture: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchemaAssert hasPeriod_OpenHistory(int expected)
	{
		isNotNull();
		int actualField = actual.getPeriod_OpenHistory();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Period_OpenHistory: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchemaAssert hasSeparator(String expected)
	{
		isNotNull();
		String actualField = actual.getSeparator();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Separator: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_AcctSchemaAssert hasTaxCorrectionType(String expected)
	{
		isNotNull();
		String actualField = actual.getTaxCorrectionType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have TaxCorrectionType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}