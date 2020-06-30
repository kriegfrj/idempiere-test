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
import org.compiere.model.X_AD_User;

/** Generated assertion class for AD_User
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_UserAssert
	extends AbstractPOAssert<AD_UserAssert,X_AD_User>
{

    /** Standard Constructor */
    public AD_UserAssert (X_AD_User actual)
    {
      super (actual, AD_UserAssert.class);
    }


	public AD_UserAssert hasAD_Image_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Image_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Image_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserAssert hasAD_OrgTrx_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_OrgTrx_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_OrgTrx_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserAssert hasAD_User_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_User_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_User_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserAssert hasAD_User_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_User_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_User_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserAssert hasAnswer(String expected)
	{
		isNotNull();
		String actualField = actual.getAnswer();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Answer: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserAssert hasBirthday(Object expected)
	{
		isNotNull();
		dateAssert("Birthday", actual.getBirthday(), expected);
		return myself;
	}


	public AD_UserAssert hasBP_Location_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getBP_Location_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have BP_Location_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserAssert hasBPName(String expected)
	{
		isNotNull();
		String actualField = actual.getBPName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have BPName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserAssert hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserAssert hasC_BPartner_Location_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_Location_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BPartner_Location_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserAssert hasC_Campaign_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Campaign_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Campaign_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserAssert hasC_Greeting_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Greeting_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Greeting_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserAssert hasC_Job_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Job_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Job_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserAssert hasC_Location_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Location_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Location_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserAssert hasComments(String expected)
	{
		isNotNull();
		String actualField = actual.getComments();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Comments: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserAssert hasDateAccountLocked(Object expected)
	{
		isNotNull();
		dateAssert("DateAccountLocked", actual.getDateAccountLocked(), expected);
		return myself;
	}


	public AD_UserAssert hasDateLastLogin(Object expected)
	{
		isNotNull();
		dateAssert("DateLastLogin", actual.getDateLastLogin(), expected);
		return myself;
	}


	public AD_UserAssert hasDatePasswordChanged(Object expected)
	{
		isNotNull();
		dateAssert("DatePasswordChanged", actual.getDatePasswordChanged(), expected);
		return myself;
	}


	public AD_UserAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserAssert hasEMail(String expected)
	{
		isNotNull();
		String actualField = actual.getEMail();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have EMail: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserAssert hasEMailUser(String expected)
	{
		isNotNull();
		String actualField = actual.getEMailUser();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have EMailUser: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserAssert hasEMailUserPW(String expected)
	{
		isNotNull();
		String actualField = actual.getEMailUserPW();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have EMailUserPW: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserAssert hasEMailVerify(String expected)
	{
		isNotNull();
		String actualField = actual.getEMailVerify();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have EMailVerify: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserAssert hasEMailVerifyDate(Object expected)
	{
		isNotNull();
		dateAssert("EMailVerifyDate", actual.getEMailVerifyDate(), expected);
		return myself;
	}


	public AD_UserAssert hasFailedLoginCount(int expected)
	{
		isNotNull();
		int actualField = actual.getFailedLoginCount();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have FailedLoginCount: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserAssert hasFax(String expected)
	{
		isNotNull();
		String actualField = actual.getFax();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Fax: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserAssert isAddMailTextAutomatically()
	{
		isNotNull();
		if (!actual.isAddMailTextAutomatically()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AddMailTextAutomatically\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_UserAssert isNotAddMailTextAutomatically()
	{
		isNotNull();
		if (actual.isAddMailTextAutomatically()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AddMailTextAutomatically\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_UserAssert isExpired()
	{
		isNotNull();
		if (!actual.isExpired()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Expired\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_UserAssert isNotExpired()
	{
		isNotNull();
		if (actual.isExpired()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Expired\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_UserAssert isFullBPAccess()
	{
		isNotNull();
		if (!actual.isFullBPAccess()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be FullBPAccess\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_UserAssert isNotFullBPAccess()
	{
		isNotNull();
		if (actual.isFullBPAccess()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be FullBPAccess\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_UserAssert isInPayroll()
	{
		isNotNull();
		if (!actual.isInPayroll()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be InPayroll\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_UserAssert isNotInPayroll()
	{
		isNotNull();
		if (actual.isInPayroll()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be InPayroll\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_UserAssert isLocked()
	{
		isNotNull();
		if (!actual.isLocked()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Locked\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_UserAssert isNotLocked()
	{
		isNotNull();
		if (actual.isLocked()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Locked\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_UserAssert hasIsMenuAutoExpand(String expected)
	{
		isNotNull();
		String actualField = actual.getIsMenuAutoExpand();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have IsMenuAutoExpand: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserAssert isNoPasswordReset()
	{
		isNotNull();
		if (!actual.isNoPasswordReset()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be NoPasswordReset\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_UserAssert isNotNoPasswordReset()
	{
		isNotNull();
		if (actual.isNoPasswordReset()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be NoPasswordReset\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_UserAssert isSalesLead()
	{
		isNotNull();
		if (!actual.isSalesLead()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SalesLead\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_UserAssert isNotSalesLead()
	{
		isNotNull();
		if (actual.isSalesLead()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SalesLead\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_UserAssert hasLastContact(Object expected)
	{
		isNotNull();
		dateAssert("LastContact", actual.getLastContact(), expected);
		return myself;
	}


	public AD_UserAssert hasLastResult(String expected)
	{
		isNotNull();
		String actualField = actual.getLastResult();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have LastResult: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserAssert hasLDAPUser(String expected)
	{
		isNotNull();
		String actualField = actual.getLDAPUser();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have LDAPUser: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserAssert hasLeadSource(String expected)
	{
		isNotNull();
		String actualField = actual.getLeadSource();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have LeadSource: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserAssert hasLeadSourceDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getLeadSourceDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have LeadSourceDescription: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserAssert hasLeadStatus(String expected)
	{
		isNotNull();
		String actualField = actual.getLeadStatus();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have LeadStatus: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserAssert hasLeadStatusDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getLeadStatusDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have LeadStatusDescription: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserAssert hasNotificationType(String expected)
	{
		isNotNull();
		String actualField = actual.getNotificationType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have NotificationType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserAssert hasPassword(String expected)
	{
		isNotNull();
		String actualField = actual.getPassword();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Password: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserAssert hasPhone(String expected)
	{
		isNotNull();
		String actualField = actual.getPhone();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Phone: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserAssert hasPhone2(String expected)
	{
		isNotNull();
		String actualField = actual.getPhone2();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Phone2: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserAssert hasR_DefaultMailText_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getR_DefaultMailText_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have R_DefaultMailText_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserAssert hasSalesRep_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getSalesRep_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SalesRep_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserAssert hasSalt(String expected)
	{
		isNotNull();
		String actualField = actual.getSalt();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Salt: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserAssert hasSecurityQuestion(String expected)
	{
		isNotNull();
		String actualField = actual.getSecurityQuestion();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SecurityQuestion: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserAssert hasSupervisor_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getSupervisor_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Supervisor_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserAssert hasTitle(String expected)
	{
		isNotNull();
		String actualField = actual.getTitle();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Title: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserAssert hasUserPIN(String expected)
	{
		isNotNull();
		String actualField = actual.getUserPIN();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have UserPIN: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserAssert hasValue(String expected)
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