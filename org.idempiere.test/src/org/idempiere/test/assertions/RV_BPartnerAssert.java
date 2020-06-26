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
import org.compiere.model.X_RV_BPartner;

/** Generated assertion class for RV_BPartner
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class RV_BPartnerAssert
	extends AbstractPOAssert<RV_BPartnerAssert,X_RV_BPartner>
{

    /** Standard Constructor */
    public RV_BPartnerAssert (X_RV_BPartner actual)
    {
      super (actual, RV_BPartnerAssert.class);
    }


	public RV_BPartnerAssert hasAcqusitionCost(Object expected)
	{
		isNotNull();
		bdAssert("AcqusitionCost", actual.getAcqusitionCost(), expected);
		return myself;
	}


	public RV_BPartnerAssert hasActualLifeTimeValue(Object expected)
	{
		isNotNull();
		bdAssert("ActualLifeTimeValue", actual.getActualLifeTimeValue(), expected);
		return myself;
	}


	public RV_BPartnerAssert hasAD_Language(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Language();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Language: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasAD_OrgBP_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_OrgBP_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_OrgBP_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasAD_OrgTrx_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_OrgTrx_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_OrgTrx_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasAD_User_AD_Org_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_User_AD_Org_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_User_AD_Org_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasAD_User_C_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_User_C_BPartner_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_User_C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasAD_User_C_BPartner_Location_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_User_C_BPartner_Location_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_User_C_BPartner_Location_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasad_user_created(Object expected)
	{
		isNotNull();
		dateAssert("ad_user_created", actual.getad_user_created(), expected);
		return myself;
	}


	public RV_BPartnerAssert hasAD_User_CreatedBy(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_User_CreatedBy();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_User_CreatedBy: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasAD_User_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_User_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_User_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert isad_user_isactive()
	{
		isNotNull();
		if (!actual.isad_user_isactive()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ad_user_isactive\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert isNotad_user_isactive()
	{
		isNotNull();
		if (actual.isad_user_isactive()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ad_user_isactive\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert hasad_user_updated(Object expected)
	{
		isNotNull();
		dateAssert("ad_user_updated", actual.getad_user_updated(), expected);
		return myself;
	}


	public RV_BPartnerAssert hasAD_User_UpdatedBy(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_User_UpdatedBy();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_User_UpdatedBy: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasad_user_value(String expected)
	{
		isNotNull();
		String actualField = actual.getad_user_value();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ad_user_value: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasAddress1(String expected)
	{
		isNotNull();
		String actualField = actual.getAddress1();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Address1: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasAddress2(String expected)
	{
		isNotNull();
		String actualField = actual.getAddress2();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Address2: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasAddress3(String expected)
	{
		isNotNull();
		String actualField = actual.getAddress3();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Address3: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasAddress4(String expected)
	{
		isNotNull();
		String actualField = actual.getAddress4();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Address4: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasBirthday(Object expected)
	{
		isNotNull();
		dateAssert("Birthday", actual.getBirthday(), expected);
		return myself;
	}


	public RV_BPartnerAssert hasBPartner_Parent_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getBPartner_Parent_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have BPartner_Parent_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasBPContactGreeting(int expected)
	{
		isNotNull();
		int actualField = actual.getBPContactGreeting();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have BPContactGreeting: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasC_BP_C_TaxGroup_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BP_C_TaxGroup_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BP_C_TaxGroup_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasc_bp_dunninggrace(Object expected)
	{
		isNotNull();
		dateAssert("c_bp_dunninggrace", actual.getc_bp_dunninggrace(), expected);
		return myself;
	}


	public RV_BPartnerAssert hasC_BP_Group_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BP_Group_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BP_Group_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert isc_bp_ismanufacturer()
	{
		isNotNull();
		if (!actual.isc_bp_ismanufacturer()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be c_bp_ismanufacturer\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert isNotc_bp_ismanufacturer()
	{
		isNotNull();
		if (actual.isc_bp_ismanufacturer()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be c_bp_ismanufacturer\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert isc_bp_ispotaxexempt()
	{
		isNotNull();
		if (!actual.isc_bp_ispotaxexempt()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be c_bp_ispotaxexempt\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert isNotc_bp_ispotaxexempt()
	{
		isNotNull();
		if (actual.isc_bp_ispotaxexempt()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be c_bp_ispotaxexempt\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert hasC_BP_Location_AD_Org_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BP_Location_AD_Org_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BP_Location_AD_Org_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasC_BP_Location_C_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BP_Location_C_BPartner_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BP_Location_C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasC_BP_Location_C_Location_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BP_Location_C_Location_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BP_Location_C_Location_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasc_bp_location_created(Object expected)
	{
		isNotNull();
		dateAssert("c_bp_location_created", actual.getc_bp_location_created(), expected);
		return myself;
	}


	public RV_BPartnerAssert hasC_BP_Location_CreatedBy(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BP_Location_CreatedBy();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BP_Location_CreatedBy: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasc_bp_location_fax(String expected)
	{
		isNotNull();
		String actualField = actual.getc_bp_location_fax();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have c_bp_location_fax: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert isc_bp_location_isactive()
	{
		isNotNull();
		if (!actual.isc_bp_location_isactive()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be c_bp_location_isactive\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert isNotc_bp_location_isactive()
	{
		isNotNull();
		if (actual.isc_bp_location_isactive()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be c_bp_location_isactive\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert isc_bp_location_isbillto()
	{
		isNotNull();
		if (!actual.isc_bp_location_isbillto()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be c_bp_location_isbillto\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert isNotc_bp_location_isbillto()
	{
		isNotNull();
		if (actual.isc_bp_location_isbillto()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be c_bp_location_isbillto\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert hasc_bp_location_isdn(String expected)
	{
		isNotNull();
		String actualField = actual.getc_bp_location_isdn();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have c_bp_location_isdn: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert isc_bp_location_ispayfrom()
	{
		isNotNull();
		if (!actual.isc_bp_location_ispayfrom()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be c_bp_location_ispayfrom\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert isNotc_bp_location_ispayfrom()
	{
		isNotNull();
		if (actual.isc_bp_location_ispayfrom()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be c_bp_location_ispayfrom\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert isc_bp_location_isremitto()
	{
		isNotNull();
		if (!actual.isc_bp_location_isremitto()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be c_bp_location_isremitto\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert isNotc_bp_location_isremitto()
	{
		isNotNull();
		if (actual.isc_bp_location_isremitto()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be c_bp_location_isremitto\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert isc_bp_location_isshipto()
	{
		isNotNull();
		if (!actual.isc_bp_location_isshipto()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be c_bp_location_isshipto\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert isNotc_bp_location_isshipto()
	{
		isNotNull();
		if (actual.isc_bp_location_isshipto()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be c_bp_location_isshipto\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert hasc_bp_location_name(String expected)
	{
		isNotNull();
		String actualField = actual.getc_bp_location_name();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have c_bp_location_name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasc_bp_location_phone(String expected)
	{
		isNotNull();
		String actualField = actual.getc_bp_location_phone();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have c_bp_location_phone: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasc_bp_location_phone2(String expected)
	{
		isNotNull();
		String actualField = actual.getc_bp_location_phone2();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have c_bp_location_phone2: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasC_BP_Location_SalesRegion_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BP_Location_SalesRegion_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BP_Location_SalesRegion_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasc_bp_location_updated(Object expected)
	{
		isNotNull();
		dateAssert("c_bp_location_updated", actual.getc_bp_location_updated(), expected);
		return myself;
	}


	public RV_BPartnerAssert hasC_BP_Location_UpdatedBy(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BP_Location_UpdatedBy();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BP_Location_UpdatedBy: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasC_BP_Logo_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BP_Logo_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BP_Logo_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasC_BPartner_Location_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_Location_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BPartner_Location_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasC_City_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_City_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_City_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasc_country_ad_language(String expected)
	{
		isNotNull();
		String actualField = actual.getc_country_ad_language();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have c_country_ad_language: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasC_Country_C_Currency_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Country_C_Currency_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Country_C_Currency_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasc_country_description(String expected)
	{
		isNotNull();
		String actualField = actual.getc_country_description();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have c_country_description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasC_Country_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Country_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Country_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert isc_country_isactive()
	{
		isNotNull();
		if (!actual.isc_country_isactive()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be c_country_isactive\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert isNotc_country_isactive()
	{
		isNotNull();
		if (actual.isc_country_isactive()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be c_country_isactive\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert hasC_Dunning_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Dunning_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Dunning_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasC_Greeting_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Greeting_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Greeting_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasC_InvoiceSchedule_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_InvoiceSchedule_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_InvoiceSchedule_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasC_Location_AD_Org_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Location_AD_Org_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Location_AD_Org_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasc_location_created(Object expected)
	{
		isNotNull();
		dateAssert("c_location_created", actual.getc_location_created(), expected);
		return myself;
	}


	public RV_BPartnerAssert hasC_Location_CreatedBy(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Location_CreatedBy();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Location_CreatedBy: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasC_Location_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Location_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Location_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert isc_location_isactive()
	{
		isNotNull();
		if (!actual.isc_location_isactive()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be c_location_isactive\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert isNotc_location_isactive()
	{
		isNotNull();
		if (actual.isc_location_isactive()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be c_location_isactive\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert hasc_location_updated(Object expected)
	{
		isNotNull();
		dateAssert("c_location_updated", actual.getc_location_updated(), expected);
		return myself;
	}


	public RV_BPartnerAssert hasC_Location_UpdatedBy(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Location_UpdatedBy();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Location_UpdatedBy: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasC_PaymentTerm_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_PaymentTerm_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_PaymentTerm_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasC_Region_AD_Org_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Region_AD_Org_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Region_AD_Org_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasC_Region_C_Country_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Region_C_Country_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Region_C_Country_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasc_region_description(String expected)
	{
		isNotNull();
		String actualField = actual.getc_region_description();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have c_region_description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasC_Region_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Region_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Region_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert isc_region_isactive()
	{
		isNotNull();
		if (!actual.isc_region_isactive()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be c_region_isactive\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert isNotc_region_isactive()
	{
		isNotNull();
		if (actual.isc_region_isactive()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be c_region_isactive\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert hasCity(String expected)
	{
		isNotNull();
		String actualField = actual.getCity();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have City: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasComments(String expected)
	{
		isNotNull();
		String actualField = actual.getComments();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Comments: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasContactDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getContactDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ContactDescription: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasContactName(String expected)
	{
		isNotNull();
		String actualField = actual.getContactName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ContactName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasCountryCode(String expected)
	{
		isNotNull();
		String actualField = actual.getCountryCode();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CountryCode: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasCountryName(String expected)
	{
		isNotNull();
		String actualField = actual.getCountryName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CountryName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasDeliveryRule(String expected)
	{
		isNotNull();
		String actualField = actual.getDeliveryRule();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DeliveryRule: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasDeliveryViaRule(String expected)
	{
		isNotNull();
		String actualField = actual.getDeliveryViaRule();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DeliveryViaRule: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasDocumentCopies(int expected)
	{
		isNotNull();
		int actualField = actual.getDocumentCopies();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DocumentCopies: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasDUNS(String expected)
	{
		isNotNull();
		String actualField = actual.getDUNS();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DUNS: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasEMail(String expected)
	{
		isNotNull();
		String actualField = actual.getEMail();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have EMail: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasEMailUser(String expected)
	{
		isNotNull();
		String actualField = actual.getEMailUser();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have EMailUser: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasEMailVerify(String expected)
	{
		isNotNull();
		String actualField = actual.getEMailVerify();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have EMailVerify: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasEMailVerifyDate(Object expected)
	{
		isNotNull();
		dateAssert("EMailVerifyDate", actual.getEMailVerifyDate(), expected);
		return myself;
	}


	public RV_BPartnerAssert hasFax(String expected)
	{
		isNotNull();
		String actualField = actual.getFax();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Fax: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasFirstSale(Object expected)
	{
		isNotNull();
		dateAssert("FirstSale", actual.getFirstSale(), expected);
		return myself;
	}


	public RV_BPartnerAssert hasFlatDiscount(Object expected)
	{
		isNotNull();
		bdAssert("FlatDiscount", actual.getFlatDiscount(), expected);
		return myself;
	}


	public RV_BPartnerAssert hasFreightCostRule(String expected)
	{
		isNotNull();
		String actualField = actual.getFreightCostRule();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have FreightCostRule: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasInvoice_PrintFormat_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getInvoice_PrintFormat_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Invoice_PrintFormat_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasInvoiceRule(String expected)
	{
		isNotNull();
		String actualField = actual.getInvoiceRule();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have InvoiceRule: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert isCustomer()
	{
		isNotNull();
		if (!actual.isCustomer()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Customer\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert isNotCustomer()
	{
		isNotNull();
		if (actual.isCustomer()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Customer\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert isDefault()
	{
		isNotNull();
		if (!actual.isDefault()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Default\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert isNotDefault()
	{
		isNotNull();
		if (actual.isDefault()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Default\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert isDiscountPrinted()
	{
		isNotNull();
		if (!actual.isDiscountPrinted()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DiscountPrinted\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert isNotDiscountPrinted()
	{
		isNotNull();
		if (actual.isDiscountPrinted()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DiscountPrinted\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert isEmployee()
	{
		isNotNull();
		if (!actual.isEmployee()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Employee\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert isNotEmployee()
	{
		isNotNull();
		if (actual.isEmployee()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Employee\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert isOneTime()
	{
		isNotNull();
		if (!actual.isOneTime()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OneTime\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert isNotOneTime()
	{
		isNotNull();
		if (actual.isOneTime()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OneTime\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert isProspect()
	{
		isNotNull();
		if (!actual.isProspect()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Prospect\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert isNotProspect()
	{
		isNotNull();
		if (actual.isProspect()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Prospect\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert isSalesRep()
	{
		isNotNull();
		if (!actual.isSalesRep()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SalesRep\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert isNotSalesRep()
	{
		isNotNull();
		if (actual.isSalesRep()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SalesRep\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert isSummary()
	{
		isNotNull();
		if (!actual.isSummary()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Summary\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert isNotSummary()
	{
		isNotNull();
		if (actual.isSummary()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Summary\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert isTaxExempt()
	{
		isNotNull();
		if (!actual.isTaxExempt()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be TaxExempt\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert isNotTaxExempt()
	{
		isNotNull();
		if (actual.isTaxExempt()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be TaxExempt\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert isVendor()
	{
		isNotNull();
		if (!actual.isVendor()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Vendor\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert isNotVendor()
	{
		isNotNull();
		if (actual.isVendor()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Vendor\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert hasLastContact(Object expected)
	{
		isNotNull();
		dateAssert("LastContact", actual.getLastContact(), expected);
		return myself;
	}


	public RV_BPartnerAssert hasLastResult(String expected)
	{
		isNotNull();
		String actualField = actual.getLastResult();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have LastResult: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert isLDAPUser()
	{
		isNotNull();
		if (!actual.isLDAPUser()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be LDAPUser\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert isNotLDAPUser()
	{
		isNotNull();
		if (actual.isLDAPUser()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be LDAPUser\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert hasM_DiscountSchema_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_DiscountSchema_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_DiscountSchema_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasM_PriceList_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_PriceList_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_PriceList_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasNAICS(String expected)
	{
		isNotNull();
		String actualField = actual.getNAICS();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have NAICS: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasName2(String expected)
	{
		isNotNull();
		String actualField = actual.getName2();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name2: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasNotificationType(String expected)
	{
		isNotNull();
		String actualField = actual.getNotificationType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have NotificationType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasNumberEmployees(int expected)
	{
		isNotNull();
		int actualField = actual.getNumberEmployees();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have NumberEmployees: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasPaymentRule(String expected)
	{
		isNotNull();
		String actualField = actual.getPaymentRule();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PaymentRule: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasPaymentRulePO(String expected)
	{
		isNotNull();
		String actualField = actual.getPaymentRulePO();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PaymentRulePO: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasPhone(String expected)
	{
		isNotNull();
		String actualField = actual.getPhone();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Phone: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasPhone2(String expected)
	{
		isNotNull();
		String actualField = actual.getPhone2();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Phone2: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasPO_DiscountSchema_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPO_DiscountSchema_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PO_DiscountSchema_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasPO_PaymentTerm_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPO_PaymentTerm_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PO_PaymentTerm_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasPO_PriceList_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPO_PriceList_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PO_PriceList_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasPOReference(String expected)
	{
		isNotNull();
		String actualField = actual.getPOReference();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have POReference: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasPostal(String expected)
	{
		isNotNull();
		String actualField = actual.getPostal();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Postal: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasPostal_Add(String expected)
	{
		isNotNull();
		String actualField = actual.getPostal_Add();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Postal_Add: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasPotentialLifeTimeValue(Object expected)
	{
		isNotNull();
		bdAssert("PotentialLifeTimeValue", actual.getPotentialLifeTimeValue(), expected);
		return myself;
	}


	public RV_BPartnerAssert hasRating(String expected)
	{
		isNotNull();
		String actualField = actual.getRating();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Rating: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasReferenceNo(String expected)
	{
		isNotNull();
		String actualField = actual.getReferenceNo();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ReferenceNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasRegionName(String expected)
	{
		isNotNull();
		String actualField = actual.getRegionName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have RegionName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasSalesRep_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getSalesRep_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SalesRep_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasSalesVolume(Object expected)
	{
		isNotNull();
		bdAssert("SalesVolume", actual.getSalesVolume(), expected);
		return myself;
	}


	public RV_BPartnerAssert isSendEMail()
	{
		isNotNull();
		if (!actual.isSendEMail()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SendEMail\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert isNotSendEMail()
	{
		isNotNull();
		if (actual.isSendEMail()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SendEMail\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public RV_BPartnerAssert hasShareOfCustomer(int expected)
	{
		isNotNull();
		int actualField = actual.getShareOfCustomer();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ShareOfCustomer: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasShelfLifeMinPct(int expected)
	{
		isNotNull();
		int actualField = actual.getShelfLifeMinPct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ShelfLifeMinPct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasSO_CreditAvailable(Object expected)
	{
		isNotNull();
		bdAssert("SO_CreditAvailable", actual.getSO_CreditAvailable(), expected);
		return myself;
	}


	public RV_BPartnerAssert hasSO_CreditLimit(Object expected)
	{
		isNotNull();
		bdAssert("SO_CreditLimit", actual.getSO_CreditLimit(), expected);
		return myself;
	}


	public RV_BPartnerAssert hasSO_CreditUsed(Object expected)
	{
		isNotNull();
		bdAssert("SO_CreditUsed", actual.getSO_CreditUsed(), expected);
		return myself;
	}


	public RV_BPartnerAssert hasSO_Description(String expected)
	{
		isNotNull();
		String actualField = actual.getSO_Description();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SO_Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasSOCreditStatus(String expected)
	{
		isNotNull();
		String actualField = actual.getSOCreditStatus();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SOCreditStatus: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasSupervisor_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getSupervisor_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Supervisor_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasTaxID(String expected)
	{
		isNotNull();
		String actualField = actual.getTaxID();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have TaxID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasTitle(String expected)
	{
		isNotNull();
		String actualField = actual.getTitle();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Title: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasTotalOpenBalance(Object expected)
	{
		isNotNull();
		bdAssert("TotalOpenBalance", actual.getTotalOpenBalance(), expected);
		return myself;
	}


	public RV_BPartnerAssert hasURL(String expected)
	{
		isNotNull();
		String actualField = actual.getURL();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have URL: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public RV_BPartnerAssert hasValue(String expected)
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