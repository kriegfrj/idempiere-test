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
import org.compiere.model.X_GL_JournalLine;

/** Generated assertion class for GL_JournalLine
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class GL_JournalLineAssert
	extends AbstractPOAssert<GL_JournalLineAssert,X_GL_JournalLine>
{

    /** Standard Constructor */
    public GL_JournalLineAssert (X_GL_JournalLine actual)
    {
      super (actual, GL_JournalLineAssert.class);
    }


	public GL_JournalLineAssert hasA_Asset_Group_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Group_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Asset_Group_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalLineAssert hasA_Asset_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Asset_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalLineAssert isA_CreateAsset()
	{
		isNotNull();
		if (!actual.isA_CreateAsset()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be A_CreateAsset\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public GL_JournalLineAssert isNotA_CreateAsset()
	{
		isNotNull();
		if (actual.isA_CreateAsset()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be A_CreateAsset\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public GL_JournalLineAssert isA_Processed()
	{
		isNotNull();
		if (!actual.isA_Processed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be A_Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public GL_JournalLineAssert isNotA_Processed()
	{
		isNotNull();
		if (actual.isA_Processed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be A_Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public GL_JournalLineAssert hasAccount_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAccount_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Account_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalLineAssert hasAD_OrgTrx_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_OrgTrx_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_OrgTrx_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalLineAssert hasAlias_ValidCombination_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAlias_ValidCombination_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Alias_ValidCombination_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalLineAssert hasAmtAcctCr(Object expected)
	{
		isNotNull();
		bdAssert("AmtAcctCr", actual.getAmtAcctCr(), expected);
		return myself;
	}


	public GL_JournalLineAssert hasAmtAcctDr(Object expected)
	{
		isNotNull();
		bdAssert("AmtAcctDr", actual.getAmtAcctDr(), expected);
		return myself;
	}


	public GL_JournalLineAssert hasAmtSourceCr(Object expected)
	{
		isNotNull();
		bdAssert("AmtSourceCr", actual.getAmtSourceCr(), expected);
		return myself;
	}


	public GL_JournalLineAssert hasAmtSourceDr(Object expected)
	{
		isNotNull();
		bdAssert("AmtSourceDr", actual.getAmtSourceDr(), expected);
		return myself;
	}


	public GL_JournalLineAssert hasC_Activity_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Activity_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Activity_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalLineAssert hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalLineAssert hasC_Campaign_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Campaign_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Campaign_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalLineAssert hasC_ConversionType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ConversionType_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_ConversionType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalLineAssert hasC_Currency_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Currency_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Currency_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalLineAssert hasC_LocFrom_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_LocFrom_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_LocFrom_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalLineAssert hasC_LocTo_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_LocTo_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_LocTo_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalLineAssert hasC_Project_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Project_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Project_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalLineAssert hasC_SalesRegion_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_SalesRegion_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_SalesRegion_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalLineAssert hasC_SubAcct_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_SubAcct_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_SubAcct_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalLineAssert hasC_UOM_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_UOM_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_UOM_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalLineAssert hasC_ValidCombination_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ValidCombination_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_ValidCombination_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalLineAssert hasCurrencyRate(Object expected)
	{
		isNotNull();
		bdAssert("CurrencyRate", actual.getCurrencyRate(), expected);
		return myself;
	}


	public GL_JournalLineAssert hasDateAcct(Object expected)
	{
		isNotNull();
		dateAssert("DateAcct", actual.getDateAcct(), expected);
		return myself;
	}


	public GL_JournalLineAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalLineAssert hasGL_Journal_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getGL_Journal_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have GL_Journal_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalLineAssert hasGL_JournalLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getGL_JournalLine_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have GL_JournalLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalLineAssert hasGL_JournalLine_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getGL_JournalLine_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have GL_JournalLine_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalLineAssert isGenerated()
	{
		isNotNull();
		if (!actual.isGenerated()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Generated\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public GL_JournalLineAssert isNotGenerated()
	{
		isNotNull();
		if (actual.isGenerated()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Generated\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public GL_JournalLineAssert hasLine(int expected)
	{
		isNotNull();
		int actualField = actual.getLine();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Line: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalLineAssert hasM_Product_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Product_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalLineAssert isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public GL_JournalLineAssert isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public GL_JournalLineAssert hasQty(Object expected)
	{
		isNotNull();
		bdAssert("Qty", actual.getQty(), expected);
		return myself;
	}


	public GL_JournalLineAssert hasUser1_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getUser1_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have User1_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalLineAssert hasUser2_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getUser2_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have User2_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}