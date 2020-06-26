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
import org.compiere.model.X_AD_OrgInfo;

/** Generated assertion class for AD_OrgInfo
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_OrgInfoAssert
	extends AbstractPOAssert<AD_OrgInfoAssert,X_AD_OrgInfo>
{

    /** Standard Constructor */
    public AD_OrgInfoAssert (X_AD_OrgInfo actual)
    {
      super (actual, AD_OrgInfoAssert.class);
    }


	public AD_OrgInfoAssert hasAD_OrgInfo_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_OrgInfo_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_OrgInfo_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_OrgInfoAssert hasAD_OrgType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_OrgType_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_OrgType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_OrgInfoAssert hasC_Calendar_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Calendar_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Calendar_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_OrgInfoAssert hasC_Location_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Location_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Location_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_OrgInfoAssert hasDropShip_Warehouse_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getDropShip_Warehouse_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DropShip_Warehouse_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_OrgInfoAssert hasDUNS(String expected)
	{
		isNotNull();
		String actualField = actual.getDUNS();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DUNS: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_OrgInfoAssert hasEMail(String expected)
	{
		isNotNull();
		String actualField = actual.getEMail();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have EMail: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_OrgInfoAssert hasFax(String expected)
	{
		isNotNull();
		String actualField = actual.getFax();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Fax: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_OrgInfoAssert hasLogo_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getLogo_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Logo_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_OrgInfoAssert hasM_Warehouse_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Warehouse_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Warehouse_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_OrgInfoAssert hasParent_Org_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getParent_Org_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Parent_Org_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_OrgInfoAssert hasPhone(String expected)
	{
		isNotNull();
		String actualField = actual.getPhone();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Phone: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_OrgInfoAssert hasPhone2(String expected)
	{
		isNotNull();
		String actualField = actual.getPhone2();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Phone2: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_OrgInfoAssert hasReceiptFooterMsg(String expected)
	{
		isNotNull();
		String actualField = actual.getReceiptFooterMsg();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ReceiptFooterMsg: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_OrgInfoAssert hasSupervisor_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getSupervisor_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Supervisor_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_OrgInfoAssert hasTaxID(String expected)
	{
		isNotNull();
		String actualField = actual.getTaxID();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have TaxID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_OrgInfoAssert hasTransferBank_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getTransferBank_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have TransferBank_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_OrgInfoAssert hasTransferCashBook_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getTransferCashBook_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have TransferCashBook_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}