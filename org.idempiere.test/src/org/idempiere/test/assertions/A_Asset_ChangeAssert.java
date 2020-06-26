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
import org.compiere.model.X_A_Asset_Change;

/** Generated assertion class for A_Asset_Change
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class A_Asset_ChangeAssert
	extends AbstractPOAssert<A_Asset_ChangeAssert,X_A_Asset_Change>
{

    /** Standard Constructor */
    public A_Asset_ChangeAssert (X_A_Asset_Change actual)
    {
      super (actual, A_Asset_ChangeAssert.class);
    }


	public A_Asset_ChangeAssert hasA_Accumdepreciation_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Accumdepreciation_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Accumdepreciation_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasA_Asset_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Asset_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasA_Asset_Acct_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Acct_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Asset_Acct_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasA_Asset_Addition_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Addition_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Asset_Addition_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasA_Asset_Change_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Change_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Asset_Change_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasA_Asset_Change_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Asset_Change_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Asset_Change_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasA_Asset_CreateDate(Object expected)
	{
		isNotNull();
		dateAssert("A_Asset_CreateDate", actual.getA_Asset_CreateDate(), expected);
		return myself;
	}


	public A_Asset_ChangeAssert hasA_Asset_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Asset_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasA_Asset_Retirement_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Retirement_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Asset_Retirement_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasA_Asset_RevalDate(Object expected)
	{
		isNotNull();
		dateAssert("A_Asset_RevalDate", actual.getA_Asset_RevalDate(), expected);
		return myself;
	}


	public A_Asset_ChangeAssert hasA_Asset_Spread_Type(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Spread_Type();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Asset_Spread_Type: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasA_Depreciation_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Depreciation_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Depreciation_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasA_Depreciation_Calc_Type(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Depreciation_Calc_Type();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Depreciation_Calc_Type: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasA_Depreciation_Manual_Amount(Object expected)
	{
		isNotNull();
		bdAssert("A_Depreciation_Manual_Amount", actual.getA_Depreciation_Manual_Amount(), expected);
		return myself;
	}


	public A_Asset_ChangeAssert hasA_Depreciation_Manual_Period(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Depreciation_Manual_Period();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Depreciation_Manual_Period: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasA_Depreciation_Table_Header_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Depreciation_Table_Header_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Depreciation_Table_Header_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasA_Depreciation_Variable_Perc(Object expected)
	{
		isNotNull();
		bdAssert("A_Depreciation_Variable_Perc", actual.getA_Depreciation_Variable_Perc(), expected);
		return myself;
	}


	public A_Asset_ChangeAssert hasA_Disposal_Loss(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Disposal_Loss();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Disposal_Loss: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasA_Disposal_Loss_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Disposal_Loss_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Disposal_Loss_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasA_Disposal_Revenue(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Disposal_Revenue();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Disposal_Revenue: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasA_Disposal_Revenue_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Disposal_Revenue_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Disposal_Revenue_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasA_Parent_Asset_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Parent_Asset_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Parent_Asset_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasA_Period_End(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Period_End();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Period_End: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasA_Period_Start(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Period_Start();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Period_Start: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasA_QTY_Current(Object expected)
	{
		isNotNull();
		bdAssert("A_QTY_Current", actual.getA_QTY_Current(), expected);
		return myself;
	}


	public A_Asset_ChangeAssert hasA_QTY_Original(Object expected)
	{
		isNotNull();
		bdAssert("A_QTY_Original", actual.getA_QTY_Original(), expected);
		return myself;
	}


	public A_Asset_ChangeAssert hasA_Reval_Accumdep_Offset_Cur(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Reval_Accumdep_Offset_Cur();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Reval_Accumdep_Offset_Cur: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasA_Reval_Accumdep_Offset_Prior(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Reval_Accumdep_Offset_Prior();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Reval_Accumdep_Offset_Prior: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasA_Reval_Adep_Offset_Cur_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Reval_Adep_Offset_Cur_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Reval_Adep_Offset_Cur_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasA_Reval_Adep_Offset_Prior_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Reval_Adep_Offset_Prior_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Reval_Adep_Offset_Prior_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasA_Reval_Cal_Method(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Reval_Cal_Method();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Reval_Cal_Method: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasA_Reval_Cost_Offset(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Reval_Cost_Offset();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Reval_Cost_Offset: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasA_Reval_Cost_Offset_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Reval_Cost_Offset_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Reval_Cost_Offset_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasA_Reval_Cost_Offset_Prior(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Reval_Cost_Offset_Prior();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Reval_Cost_Offset_Prior: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasA_Reval_Cost_Offset_Prior_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Reval_Cost_Offset_Prior_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Reval_Cost_Offset_Prior_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasA_Reval_Depexp_Offset(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Reval_Depexp_Offset();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Reval_Depexp_Offset: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasA_Reval_Depexp_Offset_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Reval_Depexp_Offset_Acct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Reval_Depexp_Offset_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasA_Salvage_Value(Object expected)
	{
		isNotNull();
		bdAssert("A_Salvage_Value", actual.getA_Salvage_Value(), expected);
		return myself;
	}


	public A_Asset_ChangeAssert hasA_Split_Percent(Object expected)
	{
		isNotNull();
		bdAssert("A_Split_Percent", actual.getA_Split_Percent(), expected);
		return myself;
	}


	public A_Asset_ChangeAssert hasAD_User_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_User_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_User_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasAssetAccumDepreciationAmt(Object expected)
	{
		isNotNull();
		bdAssert("AssetAccumDepreciationAmt", actual.getAssetAccumDepreciationAmt(), expected);
		return myself;
	}


	public A_Asset_ChangeAssert hasAssetBookValueAmt(Object expected)
	{
		isNotNull();
		bdAssert("AssetBookValueAmt", actual.getAssetBookValueAmt(), expected);
		return myself;
	}


	public A_Asset_ChangeAssert hasAssetDepreciationDate(Object expected)
	{
		isNotNull();
		dateAssert("AssetDepreciationDate", actual.getAssetDepreciationDate(), expected);
		return myself;
	}


	public A_Asset_ChangeAssert hasAssetDisposalDate(Object expected)
	{
		isNotNull();
		dateAssert("AssetDisposalDate", actual.getAssetDisposalDate(), expected);
		return myself;
	}


	public A_Asset_ChangeAssert hasAssetMarketValueAmt(Object expected)
	{
		isNotNull();
		bdAssert("AssetMarketValueAmt", actual.getAssetMarketValueAmt(), expected);
		return myself;
	}


	public A_Asset_ChangeAssert hasAssetServiceDate(Object expected)
	{
		isNotNull();
		dateAssert("AssetServiceDate", actual.getAssetServiceDate(), expected);
		return myself;
	}


	public A_Asset_ChangeAssert hasAssetValueAmt(Object expected)
	{
		isNotNull();
		bdAssert("AssetValueAmt", actual.getAssetValueAmt(), expected);
		return myself;
	}


	public A_Asset_ChangeAssert hasC_AcctSchema_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_AcctSchema_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_AcctSchema_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasC_BPartner_Location_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_Location_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BPartner_Location_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasC_Location_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Location_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Location_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasC_ValidCombination_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ValidCombination_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_ValidCombination_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasChangeAmt(Object expected)
	{
		isNotNull();
		bdAssert("ChangeAmt", actual.getChangeAmt(), expected);
		return myself;
	}


	public A_Asset_ChangeAssert hasChangeDate(Object expected)
	{
		isNotNull();
		dateAssert("ChangeDate", actual.getChangeDate(), expected);
		return myself;
	}


	public A_Asset_ChangeAssert hasChangeType(String expected)
	{
		isNotNull();
		String actualField = actual.getChangeType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ChangeType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasConventionType(int expected)
	{
		isNotNull();
		int actualField = actual.getConventionType();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ConventionType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasDateAcct(Object expected)
	{
		isNotNull();
		dateAssert("DateAcct", actual.getDateAcct(), expected);
		return myself;
	}


	public A_Asset_ChangeAssert hasDepreciationType(int expected)
	{
		isNotNull();
		int actualField = actual.getDepreciationType();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DepreciationType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert isDepreciated()
	{
		isNotNull();
		if (!actual.isDepreciated()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Depreciated\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_ChangeAssert isNotDepreciated()
	{
		isNotNull();
		if (actual.isDepreciated()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Depreciated\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_ChangeAssert isDisposed()
	{
		isNotNull();
		if (!actual.isDisposed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Disposed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_ChangeAssert isNotDisposed()
	{
		isNotNull();
		if (actual.isDisposed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Disposed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_ChangeAssert isFullyDepreciated()
	{
		isNotNull();
		if (!actual.isFullyDepreciated()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be FullyDepreciated\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_ChangeAssert isNotFullyDepreciated()
	{
		isNotNull();
		if (actual.isFullyDepreciated()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be FullyDepreciated\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_ChangeAssert isInPosession()
	{
		isNotNull();
		if (!actual.isInPosession()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be InPosession\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_ChangeAssert isNotInPosession()
	{
		isNotNull();
		if (actual.isInPosession()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be InPosession\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_ChangeAssert isOwned()
	{
		isNotNull();
		if (!actual.isOwned()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Owned\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_ChangeAssert isNotOwned()
	{
		isNotNull();
		if (actual.isOwned()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Owned\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasLifeUseUnits(int expected)
	{
		isNotNull();
		int actualField = actual.getLifeUseUnits();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have LifeUseUnits: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasLot(String expected)
	{
		isNotNull();
		String actualField = actual.getLot();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Lot: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasPostingType(String expected)
	{
		isNotNull();
		String actualField = actual.getPostingType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PostingType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasSerNo(String expected)
	{
		isNotNull();
		String actualField = actual.getSerNo();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SerNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasTextDetails(String expected)
	{
		isNotNull();
		String actualField = actual.getTextDetails();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have TextDetails: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasUseLifeMonths(int expected)
	{
		isNotNull();
		int actualField = actual.getUseLifeMonths();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have UseLifeMonths: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasUseLifeYears(int expected)
	{
		isNotNull();
		int actualField = actual.getUseLifeYears();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have UseLifeYears: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasUseUnits(int expected)
	{
		isNotNull();
		int actualField = actual.getUseUnits();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have UseUnits: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ChangeAssert hasVersionNo(String expected)
	{
		isNotNull();
		String actualField = actual.getVersionNo();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have VersionNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}