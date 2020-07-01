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
import org.compiere.model.X_I_Asset;

/** Generated assertion class for I_Asset
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class I_AssetAssert
	extends AbstractPOAssert<I_AssetAssert,X_I_Asset>
{

    /** Standard Constructor */
    public I_AssetAssert (X_I_Asset actual)
    {
      super (actual, I_AssetAssert.class);
    }


	public I_AssetAssert hasA_Accumdepreciation_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Accumdepreciation_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Accumdepreciation_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasA_Accumulated_Depr(Object expected)
	{
		isNotNull();
		bdAssert("A_Accumulated_Depr", actual.getA_Accumulated_Depr(), expected);
		return myself;
	}


	public I_AssetAssert hasA_Asset_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasA_Asset_Cost(Object expected)
	{
		isNotNull();
		bdAssert("A_Asset_Cost", actual.getA_Asset_Cost(), expected);
		return myself;
	}


	public I_AssetAssert hasA_Asset_Group_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Group_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Group_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasA_Asset_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasA_Asset_Life_Current_Year(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Life_Current_Year();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Life_Current_Year: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasA_Asset_Life_Years(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Life_Years();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Life_Years: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasA_Asset_Spread_Type(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Spread_Type();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Spread_Type: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasA_Base_Amount(Object expected)
	{
		isNotNull();
		bdAssert("A_Base_Amount", actual.getA_Base_Amount(), expected);
		return myself;
	}


	public I_AssetAssert hasA_Calc_Accumulated_Depr(Object expected)
	{
		isNotNull();
		bdAssert("A_Calc_Accumulated_Depr", actual.getA_Calc_Accumulated_Depr(), expected);
		return myself;
	}


	public I_AssetAssert hasA_Curr_Dep_Exp(Object expected)
	{
		isNotNull();
		bdAssert("A_Curr_Dep_Exp", actual.getA_Curr_Dep_Exp(), expected);
		return myself;
	}


	public I_AssetAssert hasA_Current_Period(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Current_Period();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Current_Period: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasA_Depreciation_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Depreciation_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Depreciation_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasA_Depreciation_Calc_Type(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Depreciation_Calc_Type();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Depreciation_Calc_Type: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasA_Depreciation_Manual_Amount(Object expected)
	{
		isNotNull();
		bdAssert("A_Depreciation_Manual_Amount", actual.getA_Depreciation_Manual_Amount(), expected);
		return myself;
	}


	public I_AssetAssert hasA_Depreciation_Manual_Period(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Depreciation_Manual_Period();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Depreciation_Manual_Period: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasA_Depreciation_Table_Header_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Depreciation_Table_Header_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Depreciation_Table_Header_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasA_Depreciation_Variable_Perc(Object expected)
	{
		isNotNull();
		bdAssert("A_Depreciation_Variable_Perc", actual.getA_Depreciation_Variable_Perc(), expected);
		return myself;
	}


	public I_AssetAssert hasA_Disposal_Loss(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Disposal_Loss();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Disposal_Loss: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasA_Disposal_Revenue(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Disposal_Revenue();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Disposal_Revenue: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasA_Life_Period(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Life_Period();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Life_Period: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasA_Parent_Asset_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Parent_Asset_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Parent_Asset_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasA_Period_End(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Period_End();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Period_End: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasA_Period_Posted(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Period_Posted();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Period_Posted: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasA_Period_Start(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Period_Start();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Period_Start: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasA_Prior_Year_Accumulated_Depr(Object expected)
	{
		isNotNull();
		bdAssert("A_Prior_Year_Accumulated_Depr", actual.getA_Prior_Year_Accumulated_Depr(), expected);
		return myself;
	}


	public I_AssetAssert hasA_QTY_Current(int expected)
	{
		isNotNull();
		int actualField = actual.getA_QTY_Current();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_QTY_Current: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasA_QTY_Original(int expected)
	{
		isNotNull();
		int actualField = actual.getA_QTY_Original();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_QTY_Original: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasA_Reval_Accumdep_Offset_Cur(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Reval_Accumdep_Offset_Cur();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Reval_Accumdep_Offset_Cur: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasA_Reval_Accumdep_Offset_Prior(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Reval_Accumdep_Offset_Prior();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Reval_Accumdep_Offset_Prior: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasA_Reval_Cal_Method(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Reval_Cal_Method();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Reval_Cal_Method: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasA_Reval_Cost_Offset(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Reval_Cost_Offset();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Reval_Cost_Offset: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasA_Reval_Cost_Offset_Prior(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Reval_Cost_Offset_Prior();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Reval_Cost_Offset_Prior: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasA_Reval_Depexp_Offset(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Reval_Depexp_Offset();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Reval_Depexp_Offset: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasA_Salvage_Value(Object expected)
	{
		isNotNull();
		bdAssert("A_Salvage_Value", actual.getA_Salvage_Value(), expected);
		return myself;
	}


	public I_AssetAssert hasA_Split_Percent(Object expected)
	{
		isNotNull();
		bdAssert("A_Split_Percent", actual.getA_Split_Percent(), expected);
		return myself;
	}


	public I_AssetAssert hasAD_User_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_User_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_User_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasAssetDepreciationDate(Object expected)
	{
		isNotNull();
		dateAssert("AssetDepreciationDate", actual.getAssetDepreciationDate(), expected);
		return myself;
	}


	public I_AssetAssert hasAssetDisposalDate(Object expected)
	{
		isNotNull();
		dateAssert("AssetDisposalDate", actual.getAssetDisposalDate(), expected);
		return myself;
	}


	public I_AssetAssert hasAssetMarketValueAmt(Object expected)
	{
		isNotNull();
		bdAssert("AssetMarketValueAmt", actual.getAssetMarketValueAmt(), expected);
		return myself;
	}


	public I_AssetAssert hasAssetServiceDate(Object expected)
	{
		isNotNull();
		dateAssert("AssetServiceDate", actual.getAssetServiceDate(), expected);
		return myself;
	}


	public I_AssetAssert hasC_AcctSchema_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_AcctSchema_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_AcctSchema_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasC_BPartner_Location_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_Location_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BPartner_Location_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasC_Location_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Location_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Location_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasConventionType(int expected)
	{
		isNotNull();
		int actualField = actual.getConventionType();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ConventionType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasDepreciationType(int expected)
	{
		isNotNull();
		int actualField = actual.getDepreciationType();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DepreciationType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasGuaranteeDate(Object expected)
	{
		isNotNull();
		dateAssert("GuaranteeDate", actual.getGuaranteeDate(), expected);
		return myself;
	}


	public I_AssetAssert hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasI_Asset_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getI_Asset_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have I_Asset_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasI_Asset_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getI_Asset_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have I_Asset_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasI_ErrorMsg(String expected)
	{
		isNotNull();
		String actualField = actual.getI_ErrorMsg();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have I_ErrorMsg: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert isI_IsImported()
	{
		isNotNull();
		if (!actual.isI_IsImported()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be I_IsImported\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public I_AssetAssert isNotI_IsImported()
	{
		isNotNull();
		if (actual.isI_IsImported()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be I_IsImported\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public I_AssetAssert isDepreciated()
	{
		isNotNull();
		if (!actual.isDepreciated()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Depreciated\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public I_AssetAssert isNotDepreciated()
	{
		isNotNull();
		if (actual.isDepreciated()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Depreciated\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public I_AssetAssert isDisposed()
	{
		isNotNull();
		if (!actual.isDisposed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Disposed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public I_AssetAssert isNotDisposed()
	{
		isNotNull();
		if (actual.isDisposed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Disposed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public I_AssetAssert isFullyDepreciated()
	{
		isNotNull();
		if (!actual.isFullyDepreciated()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be FullyDepreciated\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public I_AssetAssert isNotFullyDepreciated()
	{
		isNotNull();
		if (actual.isFullyDepreciated()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be FullyDepreciated\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public I_AssetAssert isInPosession()
	{
		isNotNull();
		if (!actual.isInPosession()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be InPosession\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public I_AssetAssert isNotInPosession()
	{
		isNotNull();
		if (actual.isInPosession()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be InPosession\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public I_AssetAssert isOwned()
	{
		isNotNull();
		if (!actual.isOwned()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Owned\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public I_AssetAssert isNotOwned()
	{
		isNotNull();
		if (actual.isOwned()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Owned\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public I_AssetAssert hasLifeUseUnits(int expected)
	{
		isNotNull();
		int actualField = actual.getLifeUseUnits();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have LifeUseUnits: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasLocationComment(String expected)
	{
		isNotNull();
		String actualField = actual.getLocationComment();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have LocationComment: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasLot(String expected)
	{
		isNotNull();
		String actualField = actual.getLot();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Lot: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasM_AttributeSetInstance_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_AttributeSetInstance_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_AttributeSetInstance_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasM_Locator_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Locator_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Locator_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasM_Product_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Product_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasPostingType(String expected)
	{
		isNotNull();
		String actualField = actual.getPostingType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PostingType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public I_AssetAssert isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public I_AssetAssert hasSerNo(String expected)
	{
		isNotNull();
		String actualField = actual.getSerNo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have SerNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasUseLifeMonths(int expected)
	{
		isNotNull();
		int actualField = actual.getUseLifeMonths();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have UseLifeMonths: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasUseLifeYears(int expected)
	{
		isNotNull();
		int actualField = actual.getUseLifeYears();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have UseLifeYears: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasUseUnits(int expected)
	{
		isNotNull();
		int actualField = actual.getUseUnits();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have UseUnits: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasValue(String expected)
	{
		isNotNull();
		String actualField = actual.getValue();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Value: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_AssetAssert hasVersionNo(String expected)
	{
		isNotNull();
		String actualField = actual.getVersionNo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have VersionNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}