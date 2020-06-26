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
import org.compiere.model.X_AD_ClientInfo;

/** Generated assertion class for AD_ClientInfo
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_ClientInfoAssert
	extends AbstractPOAssert<AD_ClientInfoAssert,X_AD_ClientInfo>
{

    /** Standard Constructor */
    public AD_ClientInfoAssert (X_AD_ClientInfo actual)
    {
      super (actual, AD_ClientInfoAssert.class);
    }


	public AD_ClientInfoAssert hasAD_ClientInfo_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_ClientInfo_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_ClientInfo_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ClientInfoAssert hasAD_StorageProvider_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_StorageProvider_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_StorageProvider_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ClientInfoAssert hasAD_Tree_Activity_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Tree_Activity_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Tree_Activity_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ClientInfoAssert hasAD_Tree_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Tree_BPartner_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Tree_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ClientInfoAssert hasAD_Tree_Campaign_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Tree_Campaign_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Tree_Campaign_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ClientInfoAssert hasAD_Tree_Menu_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Tree_Menu_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Tree_Menu_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ClientInfoAssert hasAD_Tree_Org_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Tree_Org_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Tree_Org_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ClientInfoAssert hasAD_Tree_Product_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Tree_Product_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Tree_Product_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ClientInfoAssert hasAD_Tree_Project_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Tree_Project_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Tree_Project_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ClientInfoAssert hasAD_Tree_SalesRegion_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Tree_SalesRegion_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Tree_SalesRegion_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ClientInfoAssert hasC_AcctSchema1_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_AcctSchema1_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_AcctSchema1_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ClientInfoAssert hasC_BPartnerCashTrx_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartnerCashTrx_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BPartnerCashTrx_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ClientInfoAssert hasC_Calendar_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Calendar_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Calendar_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ClientInfoAssert hasC_ChargeFreight_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ChargeFreight_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_ChargeFreight_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ClientInfoAssert hasC_UOM_Length_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_UOM_Length_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_UOM_Length_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ClientInfoAssert hasC_UOM_Time_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_UOM_Time_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_UOM_Time_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ClientInfoAssert hasC_UOM_Volume_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_UOM_Volume_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_UOM_Volume_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ClientInfoAssert hasC_UOM_Weight_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_UOM_Weight_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_UOM_Weight_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ClientInfoAssert hasFY_StartDate(Object expected)
	{
		isNotNull();
		dateAssert("FY_StartDate", actual.getFY_StartDate(), expected);
		return myself;
	}


	public AD_ClientInfoAssert isConfirmOnDocClose()
	{
		isNotNull();
		if (!actual.isConfirmOnDocClose()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ConfirmOnDocClose\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_ClientInfoAssert isNotConfirmOnDocClose()
	{
		isNotNull();
		if (actual.isConfirmOnDocClose()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ConfirmOnDocClose\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_ClientInfoAssert isConfirmOnDocVoid()
	{
		isNotNull();
		if (!actual.isConfirmOnDocVoid()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ConfirmOnDocVoid\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_ClientInfoAssert isNotConfirmOnDocVoid()
	{
		isNotNull();
		if (actual.isConfirmOnDocVoid()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ConfirmOnDocVoid\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_ClientInfoAssert isDiscountLineAmt()
	{
		isNotNull();
		if (!actual.isDiscountLineAmt()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DiscountLineAmt\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_ClientInfoAssert isNotDiscountLineAmt()
	{
		isNotNull();
		if (actual.isDiscountLineAmt()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DiscountLineAmt\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_ClientInfoAssert hasKeepLogDays(int expected)
	{
		isNotNull();
		int actualField = actual.getKeepLogDays();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have KeepLogDays: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ClientInfoAssert hasLogo_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getLogo_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Logo_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ClientInfoAssert hasLogoReport_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getLogoReport_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have LogoReport_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ClientInfoAssert hasLogoWeb_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getLogoWeb_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have LogoWeb_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ClientInfoAssert hasM_ProductFreight_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_ProductFreight_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_ProductFreight_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ClientInfoAssert hasStorageArchive_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getStorageArchive_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have StorageArchive_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}