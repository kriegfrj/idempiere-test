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
import org.compiere.model.X_AD_Role;

/** Generated assertion class for AD_Role
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_RoleAssert
	extends AbstractPOAssert<AD_RoleAssert,X_AD_Role>
{

    /** Standard Constructor */
    public AD_RoleAssert (X_AD_Role actual)
    {
      super (actual, AD_RoleAssert.class);
    }


	public AD_RoleAssert hasAD_Role_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Role_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Role_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_RoleAssert hasAD_Role_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Role_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Role_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_RoleAssert hasAD_Tree_Menu_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Tree_Menu_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Tree_Menu_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_RoleAssert hasAD_Tree_Org_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Tree_Org_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Tree_Org_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_RoleAssert isAllow_Info_Account()
	{
		isNotNull();
		if (!actual.isAllow_Info_Account()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Allow_Info_Account\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isNotAllow_Info_Account()
	{
		isNotNull();
		if (actual.isAllow_Info_Account()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Allow_Info_Account\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isAllow_Info_Asset()
	{
		isNotNull();
		if (!actual.isAllow_Info_Asset()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Allow_Info_Asset\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isNotAllow_Info_Asset()
	{
		isNotNull();
		if (actual.isAllow_Info_Asset()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Allow_Info_Asset\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isAllow_Info_BPartner()
	{
		isNotNull();
		if (!actual.isAllow_Info_BPartner()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Allow_Info_BPartner\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isNotAllow_Info_BPartner()
	{
		isNotNull();
		if (actual.isAllow_Info_BPartner()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Allow_Info_BPartner\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isAllow_Info_InOut()
	{
		isNotNull();
		if (!actual.isAllow_Info_InOut()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Allow_Info_InOut\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isNotAllow_Info_InOut()
	{
		isNotNull();
		if (actual.isAllow_Info_InOut()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Allow_Info_InOut\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isAllow_Info_Invoice()
	{
		isNotNull();
		if (!actual.isAllow_Info_Invoice()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Allow_Info_Invoice\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isNotAllow_Info_Invoice()
	{
		isNotNull();
		if (actual.isAllow_Info_Invoice()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Allow_Info_Invoice\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isAllow_Info_Order()
	{
		isNotNull();
		if (!actual.isAllow_Info_Order()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Allow_Info_Order\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isNotAllow_Info_Order()
	{
		isNotNull();
		if (actual.isAllow_Info_Order()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Allow_Info_Order\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isAllow_Info_Payment()
	{
		isNotNull();
		if (!actual.isAllow_Info_Payment()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Allow_Info_Payment\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isNotAllow_Info_Payment()
	{
		isNotNull();
		if (actual.isAllow_Info_Payment()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Allow_Info_Payment\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isAllow_Info_Product()
	{
		isNotNull();
		if (!actual.isAllow_Info_Product()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Allow_Info_Product\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isNotAllow_Info_Product()
	{
		isNotNull();
		if (actual.isAllow_Info_Product()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Allow_Info_Product\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isAllow_Info_Resource()
	{
		isNotNull();
		if (!actual.isAllow_Info_Resource()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Allow_Info_Resource\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isNotAllow_Info_Resource()
	{
		isNotNull();
		if (actual.isAllow_Info_Resource()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Allow_Info_Resource\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isAllow_Info_Schedule()
	{
		isNotNull();
		if (!actual.isAllow_Info_Schedule()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Allow_Info_Schedule\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isNotAllow_Info_Schedule()
	{
		isNotNull();
		if (actual.isAllow_Info_Schedule()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Allow_Info_Schedule\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert hasAmtApproval(Object expected)
	{
		isNotNull();
		bdAssert("AmtApproval", actual.getAmtApproval(), expected);
		return myself;
	}


	public AD_RoleAssert hasAmtApprovalAccum(Object expected)
	{
		isNotNull();
		bdAssert("AmtApprovalAccum", actual.getAmtApprovalAccum(), expected);
		return myself;
	}


	public AD_RoleAssert hasC_Currency_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Currency_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Currency_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_RoleAssert hasConfirmQueryRecords(int expected)
	{
		isNotNull();
		int actualField = actual.getConfirmQueryRecords();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ConfirmQueryRecords: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_RoleAssert hasDaysApprovalAccum(int expected)
	{
		isNotNull();
		int actualField = actual.getDaysApprovalAccum();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DaysApprovalAccum: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_RoleAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_RoleAssert isAccessAdvanced()
	{
		isNotNull();
		if (!actual.isAccessAdvanced()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AccessAdvanced\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isNotAccessAdvanced()
	{
		isNotNull();
		if (actual.isAccessAdvanced()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AccessAdvanced\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isAccessAllOrgs()
	{
		isNotNull();
		if (!actual.isAccessAllOrgs()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AccessAllOrgs\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isNotAccessAllOrgs()
	{
		isNotNull();
		if (actual.isAccessAllOrgs()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AccessAllOrgs\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isCanApproveOwnDoc()
	{
		isNotNull();
		if (!actual.isCanApproveOwnDoc()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CanApproveOwnDoc\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isNotCanApproveOwnDoc()
	{
		isNotNull();
		if (actual.isCanApproveOwnDoc()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CanApproveOwnDoc\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isCanExport()
	{
		isNotNull();
		if (!actual.isCanExport()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CanExport\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isNotCanExport()
	{
		isNotNull();
		if (actual.isCanExport()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CanExport\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isCanReport()
	{
		isNotNull();
		if (!actual.isCanReport()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CanReport\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isNotCanReport()
	{
		isNotNull();
		if (actual.isCanReport()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CanReport\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isChangeLog()
	{
		isNotNull();
		if (!actual.isChangeLog()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ChangeLog\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isNotChangeLog()
	{
		isNotNull();
		if (actual.isChangeLog()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ChangeLog\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isDiscountAllowedOnTotal()
	{
		isNotNull();
		if (!actual.isDiscountAllowedOnTotal()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DiscountAllowedOnTotal\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isNotDiscountAllowedOnTotal()
	{
		isNotNull();
		if (actual.isDiscountAllowedOnTotal()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DiscountAllowedOnTotal\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isDiscountUptoLimitPrice()
	{
		isNotNull();
		if (!actual.isDiscountUptoLimitPrice()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DiscountUptoLimitPrice\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isNotDiscountUptoLimitPrice()
	{
		isNotNull();
		if (actual.isDiscountUptoLimitPrice()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DiscountUptoLimitPrice\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isManual()
	{
		isNotNull();
		if (!actual.isManual()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Manual\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isNotManual()
	{
		isNotNull();
		if (actual.isManual()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Manual\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isMasterRole()
	{
		isNotNull();
		if (!actual.isMasterRole()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be MasterRole\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isNotMasterRole()
	{
		isNotNull();
		if (actual.isMasterRole()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be MasterRole\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isMenuAutoExpand()
	{
		isNotNull();
		if (!actual.isMenuAutoExpand()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be MenuAutoExpand\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isNotMenuAutoExpand()
	{
		isNotNull();
		if (actual.isMenuAutoExpand()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be MenuAutoExpand\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isPersonalAccess()
	{
		isNotNull();
		if (!actual.isPersonalAccess()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PersonalAccess\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isNotPersonalAccess()
	{
		isNotNull();
		if (actual.isPersonalAccess()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PersonalAccess\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isPersonalLock()
	{
		isNotNull();
		if (!actual.isPersonalLock()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PersonalLock\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isNotPersonalLock()
	{
		isNotNull();
		if (actual.isPersonalLock()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PersonalLock\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isShowAcct()
	{
		isNotNull();
		if (!actual.isShowAcct()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ShowAcct\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isNotShowAcct()
	{
		isNotNull();
		if (actual.isShowAcct()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ShowAcct\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isUseUserOrgAccess()
	{
		isNotNull();
		if (!actual.isUseUserOrgAccess()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be UseUserOrgAccess\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isNotUseUserOrgAccess()
	{
		isNotNull();
		if (actual.isUseUserOrgAccess()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be UseUserOrgAccess\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert hasMaxQueryRecords(int expected)
	{
		isNotNull();
		int actualField = actual.getMaxQueryRecords();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have MaxQueryRecords: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_RoleAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_RoleAssert isOverwritePriceLimit()
	{
		isNotNull();
		if (!actual.isOverwritePriceLimit()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OverwritePriceLimit\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert isNotOverwritePriceLimit()
	{
		isNotNull();
		if (actual.isOverwritePriceLimit()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OverwritePriceLimit\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_RoleAssert hasPreferenceType(String expected)
	{
		isNotNull();
		String actualField = actual.getPreferenceType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PreferenceType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_RoleAssert hasSupervisor_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getSupervisor_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Supervisor_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_RoleAssert hasUserDiscount(Object expected)
	{
		isNotNull();
		bdAssert("UserDiscount", actual.getUserDiscount(), expected);
		return myself;
	}


	public AD_RoleAssert hasUserLevel(String expected)
	{
		isNotNull();
		String actualField = actual.getUserLevel();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have UserLevel: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}