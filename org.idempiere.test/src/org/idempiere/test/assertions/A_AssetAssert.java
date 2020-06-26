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
import org.compiere.model.X_A_Asset;

/** Generated assertion class for A_Asset
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class A_AssetAssert
	extends AbstractPOAssert<A_AssetAssert,X_A_Asset>
{

    /** Standard Constructor */
    public A_AssetAssert (X_A_Asset actual)
    {
      super (actual, A_AssetAssert.class);
    }


	public A_AssetAssert hasA_Asset_Action(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Asset_Action();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Asset_Action: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_AssetAssert hasA_Asset_Class_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Class_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Asset_Class_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_AssetAssert hasA_Asset_CreateDate(Object expected)
	{
		isNotNull();
		dateAssert("A_Asset_CreateDate", actual.getA_Asset_CreateDate(), expected);
		return myself;
	}


	public A_AssetAssert hasA_Asset_Group_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Group_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Asset_Group_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_AssetAssert hasA_Asset_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Asset_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_AssetAssert hasA_Asset_RevalDate(Object expected)
	{
		isNotNull();
		dateAssert("A_Asset_RevalDate", actual.getA_Asset_RevalDate(), expected);
		return myself;
	}


	public A_AssetAssert hasA_Asset_Status(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Asset_Status();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Asset_Status: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_AssetAssert hasA_Asset_Type_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Type_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Asset_Type_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_AssetAssert hasA_Asset_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Asset_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Asset_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_AssetAssert hasA_AssetType(String expected)
	{
		isNotNull();
		String actualField = actual.getA_AssetType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_AssetType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_AssetAssert hasA_Parent_Asset_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Parent_Asset_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Parent_Asset_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_AssetAssert hasA_QTY_Current(Object expected)
	{
		isNotNull();
		bdAssert("A_QTY_Current", actual.getA_QTY_Current(), expected);
		return myself;
	}


	public A_AssetAssert hasA_QTY_Original(Object expected)
	{
		isNotNull();
		bdAssert("A_QTY_Original", actual.getA_QTY_Original(), expected);
		return myself;
	}


	public A_AssetAssert hasAD_User_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_User_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_User_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_AssetAssert hasAssetActivationDate(Object expected)
	{
		isNotNull();
		dateAssert("AssetActivationDate", actual.getAssetActivationDate(), expected);
		return myself;
	}


	public A_AssetAssert hasAssetDepreciationDate(Object expected)
	{
		isNotNull();
		dateAssert("AssetDepreciationDate", actual.getAssetDepreciationDate(), expected);
		return myself;
	}


	public A_AssetAssert hasAssetDisposalDate(Object expected)
	{
		isNotNull();
		dateAssert("AssetDisposalDate", actual.getAssetDisposalDate(), expected);
		return myself;
	}


	public A_AssetAssert hasAssetServiceDate(Object expected)
	{
		isNotNull();
		dateAssert("AssetServiceDate", actual.getAssetServiceDate(), expected);
		return myself;
	}


	public A_AssetAssert hasC_Activity_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Activity_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Activity_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_AssetAssert hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_AssetAssert hasC_BPartner_Location_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_Location_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BPartner_Location_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_AssetAssert hasC_BPartnerSR_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartnerSR_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BPartnerSR_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_AssetAssert hasC_Location_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Location_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Location_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_AssetAssert hasC_Project_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Project_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Project_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_AssetAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_AssetAssert hasGuaranteeDate(Object expected)
	{
		isNotNull();
		dateAssert("GuaranteeDate", actual.getGuaranteeDate(), expected);
		return myself;
	}


	public A_AssetAssert hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_AssetAssert hasInventoryNo(String expected)
	{
		isNotNull();
		String actualField = actual.getInventoryNo();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have InventoryNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_AssetAssert isDepreciated()
	{
		isNotNull();
		if (!actual.isDepreciated()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Depreciated\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public A_AssetAssert isNotDepreciated()
	{
		isNotNull();
		if (actual.isDepreciated()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Depreciated\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public A_AssetAssert isDisposed()
	{
		isNotNull();
		if (!actual.isDisposed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Disposed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public A_AssetAssert isNotDisposed()
	{
		isNotNull();
		if (actual.isDisposed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Disposed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public A_AssetAssert isFullyDepreciated()
	{
		isNotNull();
		if (!actual.isFullyDepreciated()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be FullyDepreciated\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public A_AssetAssert isNotFullyDepreciated()
	{
		isNotNull();
		if (actual.isFullyDepreciated()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be FullyDepreciated\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public A_AssetAssert isInPosession()
	{
		isNotNull();
		if (!actual.isInPosession()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be InPosession\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public A_AssetAssert isNotInPosession()
	{
		isNotNull();
		if (actual.isInPosession()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be InPosession\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public A_AssetAssert isOwned()
	{
		isNotNull();
		if (!actual.isOwned()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Owned\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public A_AssetAssert isNotOwned()
	{
		isNotNull();
		if (actual.isOwned()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Owned\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public A_AssetAssert hasLastMaintenanceDate(Object expected)
	{
		isNotNull();
		dateAssert("LastMaintenanceDate", actual.getLastMaintenanceDate(), expected);
		return myself;
	}


	public A_AssetAssert hasLastMaintenanceNote(String expected)
	{
		isNotNull();
		String actualField = actual.getLastMaintenanceNote();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have LastMaintenanceNote: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_AssetAssert hasLastMaintenanceUnit(int expected)
	{
		isNotNull();
		int actualField = actual.getLastMaintenanceUnit();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have LastMaintenanceUnit: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_AssetAssert hasLease_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getLease_BPartner_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Lease_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_AssetAssert hasLeaseTerminationDate(Object expected)
	{
		isNotNull();
		dateAssert("LeaseTerminationDate", actual.getLeaseTerminationDate(), expected);
		return myself;
	}


	public A_AssetAssert hasLifeUseUnits(int expected)
	{
		isNotNull();
		int actualField = actual.getLifeUseUnits();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have LifeUseUnits: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_AssetAssert hasLocationComment(String expected)
	{
		isNotNull();
		String actualField = actual.getLocationComment();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have LocationComment: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_AssetAssert hasLot(String expected)
	{
		isNotNull();
		String actualField = actual.getLot();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Lot: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_AssetAssert hasM_AttributeSetInstance_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_AttributeSetInstance_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_AttributeSetInstance_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_AssetAssert hasM_InOutLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_InOutLine_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_InOutLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_AssetAssert hasM_Locator_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Locator_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Locator_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_AssetAssert hasM_Product_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Product_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_AssetAssert hasManufacturedYear(int expected)
	{
		isNotNull();
		int actualField = actual.getManufacturedYear();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ManufacturedYear: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_AssetAssert hasManufacturer(String expected)
	{
		isNotNull();
		String actualField = actual.getManufacturer();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Manufacturer: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_AssetAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_AssetAssert hasNextMaintenenceDate(Object expected)
	{
		isNotNull();
		dateAssert("NextMaintenenceDate", actual.getNextMaintenenceDate(), expected);
		return myself;
	}


	public A_AssetAssert hasNextMaintenenceUnit(int expected)
	{
		isNotNull();
		int actualField = actual.getNextMaintenenceUnit();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have NextMaintenenceUnit: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_AssetAssert isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public A_AssetAssert isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public A_AssetAssert isProcessing()
	{
		isNotNull();
		if (!actual.isProcessing()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processing\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public A_AssetAssert isNotProcessing()
	{
		isNotNull();
		if (actual.isProcessing()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processing\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public A_AssetAssert hasQty(Object expected)
	{
		isNotNull();
		bdAssert("Qty", actual.getQty(), expected);
		return myself;
	}


	public A_AssetAssert hasSerNo(String expected)
	{
		isNotNull();
		String actualField = actual.getSerNo();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SerNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_AssetAssert hasUseLifeMonths(int expected)
	{
		isNotNull();
		int actualField = actual.getUseLifeMonths();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have UseLifeMonths: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_AssetAssert hasUseLifeYears(int expected)
	{
		isNotNull();
		int actualField = actual.getUseLifeYears();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have UseLifeYears: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_AssetAssert hasUseUnits(int expected)
	{
		isNotNull();
		int actualField = actual.getUseUnits();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have UseUnits: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_AssetAssert hasValue(String expected)
	{
		isNotNull();
		String actualField = actual.getValue();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Value: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_AssetAssert hasVersionNo(String expected)
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