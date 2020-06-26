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
import org.compiere.model.X_A_Asset_Addition;

/** Generated assertion class for A_Asset_Addition
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class A_Asset_AdditionAssert
	extends AbstractPOAssert<A_Asset_AdditionAssert,X_A_Asset_Addition>
{

    /** Standard Constructor */
    public A_Asset_AdditionAssert (X_A_Asset_Addition actual)
    {
      super (actual, A_Asset_AdditionAssert.class);
    }


	public A_Asset_AdditionAssert hasA_Accumulated_Depr(Object expected)
	{
		isNotNull();
		bdAssert("A_Accumulated_Depr", actual.getA_Accumulated_Depr(), expected);
		return myself;
	}


	public A_Asset_AdditionAssert isA_Accumulated_Depr_Adjust()
	{
		isNotNull();
		if (!actual.isA_Accumulated_Depr_Adjust()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be A_Accumulated_Depr_Adjust\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_AdditionAssert isNotA_Accumulated_Depr_Adjust()
	{
		isNotNull();
		if (actual.isA_Accumulated_Depr_Adjust()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be A_Accumulated_Depr_Adjust\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_AdditionAssert hasA_Accumulated_Depr_F(Object expected)
	{
		isNotNull();
		bdAssert("A_Accumulated_Depr_F", actual.getA_Accumulated_Depr_F(), expected);
		return myself;
	}


	public A_Asset_AdditionAssert hasA_Asset_Addition_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Addition_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Asset_Addition_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AdditionAssert hasA_Asset_Addition_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Asset_Addition_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Asset_Addition_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AdditionAssert hasA_Asset_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Asset_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AdditionAssert hasA_CapvsExp(String expected)
	{
		isNotNull();
		String actualField = actual.getA_CapvsExp();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_CapvsExp: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AdditionAssert isA_CreateAsset()
	{
		isNotNull();
		if (!actual.isA_CreateAsset()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be A_CreateAsset\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_AdditionAssert isNotA_CreateAsset()
	{
		isNotNull();
		if (actual.isA_CreateAsset()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be A_CreateAsset\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_AdditionAssert hasA_Life_Period_Max(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Life_Period_Max();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Life_Period_Max: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AdditionAssert hasA_Life_Period_Min(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Life_Period_Min();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Life_Period_Min: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AdditionAssert hasA_Period_Start(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Period_Start();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Period_Start: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AdditionAssert hasA_QTY_Current(Object expected)
	{
		isNotNull();
		bdAssert("A_QTY_Current", actual.getA_QTY_Current(), expected);
		return myself;
	}


	public A_Asset_AdditionAssert hasA_Salvage_Value(Object expected)
	{
		isNotNull();
		bdAssert("A_Salvage_Value", actual.getA_Salvage_Value(), expected);
		return myself;
	}


	public A_Asset_AdditionAssert hasA_SourceType(String expected)
	{
		isNotNull();
		String actualField = actual.getA_SourceType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_SourceType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AdditionAssert hasAssetAmtEntered(Object expected)
	{
		isNotNull();
		bdAssert("AssetAmtEntered", actual.getAssetAmtEntered(), expected);
		return myself;
	}


	public A_Asset_AdditionAssert hasAssetSourceAmt(Object expected)
	{
		isNotNull();
		bdAssert("AssetSourceAmt", actual.getAssetSourceAmt(), expected);
		return myself;
	}


	public A_Asset_AdditionAssert hasAssetValueAmt(Object expected)
	{
		isNotNull();
		bdAssert("AssetValueAmt", actual.getAssetValueAmt(), expected);
		return myself;
	}


	public A_Asset_AdditionAssert hasC_Charge_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Charge_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Charge_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AdditionAssert hasC_ConversionType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ConversionType_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_ConversionType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AdditionAssert hasC_Currency_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Currency_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Currency_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AdditionAssert hasC_DocType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_DocType_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_DocType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AdditionAssert hasC_Invoice_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Invoice_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Invoice_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AdditionAssert hasC_InvoiceLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_InvoiceLine_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_InvoiceLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AdditionAssert hasC_Project_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Project_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Project_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AdditionAssert hasCurrencyRate(Object expected)
	{
		isNotNull();
		bdAssert("CurrencyRate", actual.getCurrencyRate(), expected);
		return myself;
	}


	public A_Asset_AdditionAssert hasDateAcct(Object expected)
	{
		isNotNull();
		dateAssert("DateAcct", actual.getDateAcct(), expected);
		return myself;
	}


	public A_Asset_AdditionAssert hasDateDoc(Object expected)
	{
		isNotNull();
		dateAssert("DateDoc", actual.getDateDoc(), expected);
		return myself;
	}


	public A_Asset_AdditionAssert hasDeltaUseLifeYears(int expected)
	{
		isNotNull();
		int actualField = actual.getDeltaUseLifeYears();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DeltaUseLifeYears: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AdditionAssert hasDeltaUseLifeYears_F(int expected)
	{
		isNotNull();
		int actualField = actual.getDeltaUseLifeYears_F();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DeltaUseLifeYears_F: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AdditionAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AdditionAssert hasDocStatus(String expected)
	{
		isNotNull();
		String actualField = actual.getDocStatus();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DocStatus: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AdditionAssert hasDocumentNo(String expected)
	{
		isNotNull();
		String actualField = actual.getDocumentNo();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DocumentNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AdditionAssert hasGL_JournalBatch_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getGL_JournalBatch_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have GL_JournalBatch_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AdditionAssert hasI_FixedAsset_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getI_FixedAsset_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have I_FixedAsset_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AdditionAssert isApproved()
	{
		isNotNull();
		if (!actual.isApproved()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Approved\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_AdditionAssert isNotApproved()
	{
		isNotNull();
		if (actual.isApproved()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Approved\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_AdditionAssert hasLine(int expected)
	{
		isNotNull();
		int actualField = actual.getLine();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Line: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AdditionAssert hasM_AttributeSetInstance_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_AttributeSetInstance_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_AttributeSetInstance_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AdditionAssert hasM_InOutLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_InOutLine_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_InOutLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AdditionAssert hasM_Locator_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Locator_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Locator_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AdditionAssert hasM_MatchInv_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_MatchInv_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_MatchInv_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AdditionAssert hasM_Product_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Product_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AdditionAssert hasPostingType(String expected)
	{
		isNotNull();
		String actualField = actual.getPostingType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PostingType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_AdditionAssert isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_AdditionAssert isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_AdditionAssert hasProcessedOn(Object expected)
	{
		isNotNull();
		bdAssert("ProcessedOn", actual.getProcessedOn(), expected);
		return myself;
	}


	public A_Asset_AdditionAssert isProcessing()
	{
		isNotNull();
		if (!actual.isProcessing()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processing\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_AdditionAssert isNotProcessing()
	{
		isNotNull();
		if (actual.isProcessing()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processing\nbut it was",
				getPODescription());
		}
		return myself;
	}
}