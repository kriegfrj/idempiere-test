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
import org.compiere.model.X_C_BPartner;

/** Generated assertion class for C_BPartner
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_BPartnerAssert
	extends AbstractPOAssert<C_BPartnerAssert,X_C_BPartner>
{

    /** Standard Constructor */
    public C_BPartnerAssert (X_C_BPartner actual)
    {
      super (actual, C_BPartnerAssert.class);
    }


	public C_BPartnerAssert hasAcqusitionCost(Object expected)
	{
		isNotNull();
		bdAssert("AcqusitionCost", actual.getAcqusitionCost(), expected);
		return myself;
	}


	public C_BPartnerAssert hasActualLifeTimeValue(Object expected)
	{
		isNotNull();
		bdAssert("ActualLifeTimeValue", actual.getActualLifeTimeValue(), expected);
		return myself;
	}


	public C_BPartnerAssert hasAD_Language(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Language();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Language: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert hasBPartner_Parent_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getBPartner_Parent_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have BPartner_Parent_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert hasC_BP_Group_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BP_Group_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BP_Group_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert hasC_BPartner_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_BPartner_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BPartner_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert hasC_Dunning_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Dunning_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Dunning_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert hasC_Greeting_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Greeting_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Greeting_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert hasC_InvoiceSchedule_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_InvoiceSchedule_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_InvoiceSchedule_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert hasC_PaymentTerm_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_PaymentTerm_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_PaymentTerm_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert hasC_TaxGroup_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_TaxGroup_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_TaxGroup_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert hasCustomerProfileID(String expected)
	{
		isNotNull();
		String actualField = actual.getCustomerProfileID();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CustomerProfileID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert hasDefault1099Box_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getDefault1099Box_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Default1099Box_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert hasDeliveryRule(String expected)
	{
		isNotNull();
		String actualField = actual.getDeliveryRule();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DeliveryRule: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert hasDeliveryViaRule(String expected)
	{
		isNotNull();
		String actualField = actual.getDeliveryViaRule();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DeliveryViaRule: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert hasDocumentCopies(int expected)
	{
		isNotNull();
		int actualField = actual.getDocumentCopies();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DocumentCopies: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert hasDunningGrace(Object expected)
	{
		isNotNull();
		dateAssert("DunningGrace", actual.getDunningGrace(), expected);
		return myself;
	}


	public C_BPartnerAssert hasDUNS(String expected)
	{
		isNotNull();
		String actualField = actual.getDUNS();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DUNS: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert hasFirstSale(Object expected)
	{
		isNotNull();
		dateAssert("FirstSale", actual.getFirstSale(), expected);
		return myself;
	}


	public C_BPartnerAssert hasFlatDiscount(Object expected)
	{
		isNotNull();
		bdAssert("FlatDiscount", actual.getFlatDiscount(), expected);
		return myself;
	}


	public C_BPartnerAssert hasFreightCostRule(String expected)
	{
		isNotNull();
		String actualField = actual.getFreightCostRule();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have FreightCostRule: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert hasInvoice_PrintFormat_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getInvoice_PrintFormat_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Invoice_PrintFormat_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert hasInvoiceRule(String expected)
	{
		isNotNull();
		String actualField = actual.getInvoiceRule();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have InvoiceRule: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert is1099Vendor()
	{
		isNotNull();
		if (!actual.is1099Vendor()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be 1099Vendor\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BPartnerAssert isNot1099Vendor()
	{
		isNotNull();
		if (actual.is1099Vendor()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be 1099Vendor\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BPartnerAssert isCustomer()
	{
		isNotNull();
		if (!actual.isCustomer()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Customer\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BPartnerAssert isNotCustomer()
	{
		isNotNull();
		if (actual.isCustomer()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Customer\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BPartnerAssert isDiscountPrinted()
	{
		isNotNull();
		if (!actual.isDiscountPrinted()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DiscountPrinted\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BPartnerAssert isNotDiscountPrinted()
	{
		isNotNull();
		if (actual.isDiscountPrinted()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DiscountPrinted\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BPartnerAssert isEmployee()
	{
		isNotNull();
		if (!actual.isEmployee()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Employee\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BPartnerAssert isNotEmployee()
	{
		isNotNull();
		if (actual.isEmployee()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Employee\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BPartnerAssert isManufacturer()
	{
		isNotNull();
		if (!actual.isManufacturer()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Manufacturer\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BPartnerAssert isNotManufacturer()
	{
		isNotNull();
		if (actual.isManufacturer()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Manufacturer\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BPartnerAssert isOneTime()
	{
		isNotNull();
		if (!actual.isOneTime()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OneTime\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BPartnerAssert isNotOneTime()
	{
		isNotNull();
		if (actual.isOneTime()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OneTime\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BPartnerAssert isPOTaxExempt()
	{
		isNotNull();
		if (!actual.isPOTaxExempt()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be POTaxExempt\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BPartnerAssert isNotPOTaxExempt()
	{
		isNotNull();
		if (actual.isPOTaxExempt()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be POTaxExempt\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BPartnerAssert isProspect()
	{
		isNotNull();
		if (!actual.isProspect()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Prospect\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BPartnerAssert isNotProspect()
	{
		isNotNull();
		if (actual.isProspect()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Prospect\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BPartnerAssert isSalesRep()
	{
		isNotNull();
		if (!actual.isSalesRep()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SalesRep\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BPartnerAssert isNotSalesRep()
	{
		isNotNull();
		if (actual.isSalesRep()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SalesRep\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BPartnerAssert isSummary()
	{
		isNotNull();
		if (!actual.isSummary()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Summary\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BPartnerAssert isNotSummary()
	{
		isNotNull();
		if (actual.isSummary()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Summary\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BPartnerAssert isTaxExempt()
	{
		isNotNull();
		if (!actual.isTaxExempt()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be TaxExempt\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BPartnerAssert isNotTaxExempt()
	{
		isNotNull();
		if (actual.isTaxExempt()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be TaxExempt\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BPartnerAssert isVendor()
	{
		isNotNull();
		if (!actual.isVendor()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Vendor\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BPartnerAssert isNotVendor()
	{
		isNotNull();
		if (actual.isVendor()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Vendor\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BPartnerAssert hasLogo_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getLogo_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Logo_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert hasM_DiscountSchema_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_DiscountSchema_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_DiscountSchema_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert hasM_PriceList_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_PriceList_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_PriceList_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert hasNAICS(String expected)
	{
		isNotNull();
		String actualField = actual.getNAICS();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have NAICS: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert hasName2(String expected)
	{
		isNotNull();
		String actualField = actual.getName2();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name2: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert hasNumberEmployees(int expected)
	{
		isNotNull();
		int actualField = actual.getNumberEmployees();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have NumberEmployees: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert hasPaymentRule(String expected)
	{
		isNotNull();
		String actualField = actual.getPaymentRule();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PaymentRule: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert hasPaymentRulePO(String expected)
	{
		isNotNull();
		String actualField = actual.getPaymentRulePO();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PaymentRulePO: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert hasPO_DiscountSchema_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPO_DiscountSchema_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PO_DiscountSchema_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert hasPO_PaymentTerm_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPO_PaymentTerm_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PO_PaymentTerm_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert hasPO_PriceList_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPO_PriceList_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PO_PriceList_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert hasPOReference(String expected)
	{
		isNotNull();
		String actualField = actual.getPOReference();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have POReference: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert hasPotentialLifeTimeValue(Object expected)
	{
		isNotNull();
		bdAssert("PotentialLifeTimeValue", actual.getPotentialLifeTimeValue(), expected);
		return myself;
	}


	public C_BPartnerAssert hasRating(String expected)
	{
		isNotNull();
		String actualField = actual.getRating();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Rating: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert hasReferenceNo(String expected)
	{
		isNotNull();
		String actualField = actual.getReferenceNo();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ReferenceNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert hasSalesRep_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getSalesRep_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SalesRep_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert hasSalesVolume(int expected)
	{
		isNotNull();
		int actualField = actual.getSalesVolume();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SalesVolume: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert isSendEMail()
	{
		isNotNull();
		if (!actual.isSendEMail()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SendEMail\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BPartnerAssert isNotSendEMail()
	{
		isNotNull();
		if (actual.isSendEMail()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SendEMail\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BPartnerAssert hasShareOfCustomer(int expected)
	{
		isNotNull();
		int actualField = actual.getShareOfCustomer();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ShareOfCustomer: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert hasShelfLifeMinPct(int expected)
	{
		isNotNull();
		int actualField = actual.getShelfLifeMinPct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ShelfLifeMinPct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert hasSO_CreditLimit(Object expected)
	{
		isNotNull();
		bdAssert("SO_CreditLimit", actual.getSO_CreditLimit(), expected);
		return myself;
	}


	public C_BPartnerAssert hasSO_CreditUsed(Object expected)
	{
		isNotNull();
		bdAssert("SO_CreditUsed", actual.getSO_CreditUsed(), expected);
		return myself;
	}


	public C_BPartnerAssert hasSO_Description(String expected)
	{
		isNotNull();
		String actualField = actual.getSO_Description();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SO_Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert hasSOCreditStatus(String expected)
	{
		isNotNull();
		String actualField = actual.getSOCreditStatus();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SOCreditStatus: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert hasTaxID(String expected)
	{
		isNotNull();
		String actualField = actual.getTaxID();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have TaxID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert hasTotalOpenBalance(Object expected)
	{
		isNotNull();
		bdAssert("TotalOpenBalance", actual.getTotalOpenBalance(), expected);
		return myself;
	}


	public C_BPartnerAssert hasURL(String expected)
	{
		isNotNull();
		String actualField = actual.getURL();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have URL: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartnerAssert hasValue(String expected)
	{
		isNotNull();
		String actualField = actual.getValue();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Value: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}