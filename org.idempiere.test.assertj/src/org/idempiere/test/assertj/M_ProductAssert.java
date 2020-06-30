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
import org.compiere.model.X_M_Product;

/** Generated assertion class for M_Product
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class M_ProductAssert
	extends AbstractPOAssert<M_ProductAssert,X_M_Product>
{

    /** Standard Constructor */
    public M_ProductAssert (X_M_Product actual)
    {
      super (actual, M_ProductAssert.class);
    }


	public M_ProductAssert hasC_RevenueRecognition_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_RevenueRecognition_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_RevenueRecognition_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductAssert hasC_SubscriptionType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_SubscriptionType_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_SubscriptionType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductAssert hasC_TaxCategory_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_TaxCategory_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_TaxCategory_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductAssert hasC_UOM_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_UOM_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_UOM_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductAssert hasClassification(String expected)
	{
		isNotNull();
		String actualField = actual.getClassification();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Classification: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductAssert hasDescriptionURL(String expected)
	{
		isNotNull();
		String actualField = actual.getDescriptionURL();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DescriptionURL: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductAssert isDiscontinued()
	{
		isNotNull();
		if (!actual.isDiscontinued()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Discontinued\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_ProductAssert isNotDiscontinued()
	{
		isNotNull();
		if (actual.isDiscontinued()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Discontinued\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_ProductAssert hasDiscontinuedAt(Object expected)
	{
		isNotNull();
		dateAssert("DiscontinuedAt", actual.getDiscontinuedAt(), expected);
		return myself;
	}


	public M_ProductAssert hasDocumentNote(String expected)
	{
		isNotNull();
		String actualField = actual.getDocumentNote();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DocumentNote: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductAssert hasGroup1(String expected)
	{
		isNotNull();
		String actualField = actual.getGroup1();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Group1: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductAssert hasGroup2(String expected)
	{
		isNotNull();
		String actualField = actual.getGroup2();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Group2: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductAssert hasGuaranteeDays(int expected)
	{
		isNotNull();
		int actualField = actual.getGuaranteeDays();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have GuaranteeDays: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductAssert hasGuaranteeDaysMin(int expected)
	{
		isNotNull();
		int actualField = actual.getGuaranteeDaysMin();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have GuaranteeDaysMin: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductAssert hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductAssert hasImageURL(String expected)
	{
		isNotNull();
		String actualField = actual.getImageURL();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ImageURL: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductAssert isBOM()
	{
		isNotNull();
		if (!actual.isBOM()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be BOM\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_ProductAssert isNotBOM()
	{
		isNotNull();
		if (actual.isBOM()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be BOM\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_ProductAssert isDropShip()
	{
		isNotNull();
		if (!actual.isDropShip()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DropShip\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_ProductAssert isNotDropShip()
	{
		isNotNull();
		if (actual.isDropShip()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DropShip\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_ProductAssert isExcludeAutoDelivery()
	{
		isNotNull();
		if (!actual.isExcludeAutoDelivery()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ExcludeAutoDelivery\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_ProductAssert isNotExcludeAutoDelivery()
	{
		isNotNull();
		if (actual.isExcludeAutoDelivery()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ExcludeAutoDelivery\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_ProductAssert isInvoicePrintDetails()
	{
		isNotNull();
		if (!actual.isInvoicePrintDetails()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be InvoicePrintDetails\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_ProductAssert isNotInvoicePrintDetails()
	{
		isNotNull();
		if (actual.isInvoicePrintDetails()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be InvoicePrintDetails\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_ProductAssert isKanban()
	{
		isNotNull();
		if (!actual.isKanban()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Kanban\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_ProductAssert isNotKanban()
	{
		isNotNull();
		if (actual.isKanban()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Kanban\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_ProductAssert isManufactured()
	{
		isNotNull();
		if (!actual.isManufactured()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Manufactured\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_ProductAssert isNotManufactured()
	{
		isNotNull();
		if (actual.isManufactured()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Manufactured\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_ProductAssert isOwnBox()
	{
		isNotNull();
		if (!actual.isOwnBox()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OwnBox\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_ProductAssert isNotOwnBox()
	{
		isNotNull();
		if (actual.isOwnBox()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OwnBox\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_ProductAssert isPhantom()
	{
		isNotNull();
		if (!actual.isPhantom()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Phantom\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_ProductAssert isNotPhantom()
	{
		isNotNull();
		if (actual.isPhantom()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Phantom\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_ProductAssert isPickListPrintDetails()
	{
		isNotNull();
		if (!actual.isPickListPrintDetails()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PickListPrintDetails\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_ProductAssert isNotPickListPrintDetails()
	{
		isNotNull();
		if (actual.isPickListPrintDetails()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PickListPrintDetails\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_ProductAssert isPurchased()
	{
		isNotNull();
		if (!actual.isPurchased()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Purchased\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_ProductAssert isNotPurchased()
	{
		isNotNull();
		if (actual.isPurchased()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Purchased\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_ProductAssert isSelfService()
	{
		isNotNull();
		if (!actual.isSelfService()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SelfService\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_ProductAssert isNotSelfService()
	{
		isNotNull();
		if (actual.isSelfService()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SelfService\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_ProductAssert isSold()
	{
		isNotNull();
		if (!actual.isSold()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Sold\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_ProductAssert isNotSold()
	{
		isNotNull();
		if (actual.isSold()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Sold\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_ProductAssert isStocked()
	{
		isNotNull();
		if (!actual.isStocked()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Stocked\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_ProductAssert isNotStocked()
	{
		isNotNull();
		if (actual.isStocked()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Stocked\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_ProductAssert isSummary()
	{
		isNotNull();
		if (!actual.isSummary()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Summary\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_ProductAssert isNotSummary()
	{
		isNotNull();
		if (actual.isSummary()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Summary\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_ProductAssert isVerified()
	{
		isNotNull();
		if (!actual.isVerified()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Verified\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_ProductAssert isNotVerified()
	{
		isNotNull();
		if (actual.isVerified()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Verified\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_ProductAssert isWebStoreFeatured()
	{
		isNotNull();
		if (!actual.isWebStoreFeatured()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be WebStoreFeatured\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_ProductAssert isNotWebStoreFeatured()
	{
		isNotNull();
		if (actual.isWebStoreFeatured()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be WebStoreFeatured\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_ProductAssert hasLowLevel(int expected)
	{
		isNotNull();
		int actualField = actual.getLowLevel();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have LowLevel: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductAssert hasM_AttributeSet_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_AttributeSet_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_AttributeSet_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductAssert hasM_AttributeSetInstance_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_AttributeSetInstance_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_AttributeSetInstance_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductAssert hasM_FreightCategory_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_FreightCategory_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_FreightCategory_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductAssert hasM_Locator_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Locator_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Locator_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductAssert hasM_PartType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_PartType_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_PartType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductAssert hasM_Product_Category_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_Category_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Product_Category_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductAssert hasM_Product_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Product_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductAssert hasM_Product_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getM_Product_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Product_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductAssert hasProductType(String expected)
	{
		isNotNull();
		String actualField = actual.getProductType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ProductType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductAssert hasR_MailText_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getR_MailText_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have R_MailText_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductAssert hasS_ExpenseType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getS_ExpenseType_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have S_ExpenseType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductAssert hasS_Resource_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getS_Resource_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have S_Resource_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductAssert hasSalesRep_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getSalesRep_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SalesRep_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductAssert hasShelfDepth(int expected)
	{
		isNotNull();
		int actualField = actual.getShelfDepth();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ShelfDepth: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductAssert hasShelfHeight(Object expected)
	{
		isNotNull();
		bdAssert("ShelfHeight", actual.getShelfHeight(), expected);
		return myself;
	}


	public M_ProductAssert hasShelfWidth(int expected)
	{
		isNotNull();
		int actualField = actual.getShelfWidth();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ShelfWidth: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductAssert hasSKU(String expected)
	{
		isNotNull();
		String actualField = actual.getSKU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SKU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductAssert hasUnitsPerPack(int expected)
	{
		isNotNull();
		int actualField = actual.getUnitsPerPack();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have UnitsPerPack: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductAssert hasUnitsPerPallet(Object expected)
	{
		isNotNull();
		bdAssert("UnitsPerPallet", actual.getUnitsPerPallet(), expected);
		return myself;
	}


	public M_ProductAssert hasUPC(String expected)
	{
		isNotNull();
		String actualField = actual.getUPC();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have UPC: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductAssert hasValue(String expected)
	{
		isNotNull();
		String actualField = actual.getValue();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Value: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductAssert hasVersionNo(String expected)
	{
		isNotNull();
		String actualField = actual.getVersionNo();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have VersionNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductAssert hasVolume(Object expected)
	{
		isNotNull();
		bdAssert("Volume", actual.getVolume(), expected);
		return myself;
	}


	public M_ProductAssert hasWeight(Object expected)
	{
		isNotNull();
		bdAssert("Weight", actual.getWeight(), expected);
		return myself;
	}

}