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
import org.compiere.model.X_W_Store;

/** Generated assertion class for W_Store
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class W_StoreAssert
	extends AbstractPOAssert<W_StoreAssert,X_W_Store>
{

    /** Standard Constructor */
    public W_StoreAssert (X_W_Store actual)
    {
      super (actual, W_StoreAssert.class);
    }


	public W_StoreAssert hasC_PaymentTerm_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_PaymentTerm_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_PaymentTerm_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public W_StoreAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public W_StoreAssert hasEMailFooter(String expected)
	{
		isNotNull();
		String actualField = actual.getEMailFooter();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have EMailFooter: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public W_StoreAssert hasEMailHeader(String expected)
	{
		isNotNull();
		String actualField = actual.getEMailHeader();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have EMailHeader: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public W_StoreAssert hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public W_StoreAssert isDefault()
	{
		isNotNull();
		if (!actual.isDefault()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Default\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public W_StoreAssert isNotDefault()
	{
		isNotNull();
		if (actual.isDefault()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Default\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public W_StoreAssert isMenuAssets()
	{
		isNotNull();
		if (!actual.isMenuAssets()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be MenuAssets\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public W_StoreAssert isNotMenuAssets()
	{
		isNotNull();
		if (actual.isMenuAssets()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be MenuAssets\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public W_StoreAssert isMenuContact()
	{
		isNotNull();
		if (!actual.isMenuContact()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be MenuContact\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public W_StoreAssert isNotMenuContact()
	{
		isNotNull();
		if (actual.isMenuContact()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be MenuContact\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public W_StoreAssert isMenuInterests()
	{
		isNotNull();
		if (!actual.isMenuInterests()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be MenuInterests\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public W_StoreAssert isNotMenuInterests()
	{
		isNotNull();
		if (actual.isMenuInterests()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be MenuInterests\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public W_StoreAssert isMenuInvoices()
	{
		isNotNull();
		if (!actual.isMenuInvoices()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be MenuInvoices\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public W_StoreAssert isNotMenuInvoices()
	{
		isNotNull();
		if (actual.isMenuInvoices()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be MenuInvoices\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public W_StoreAssert isMenuOrders()
	{
		isNotNull();
		if (!actual.isMenuOrders()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be MenuOrders\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public W_StoreAssert isNotMenuOrders()
	{
		isNotNull();
		if (actual.isMenuOrders()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be MenuOrders\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public W_StoreAssert isMenuPayments()
	{
		isNotNull();
		if (!actual.isMenuPayments()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be MenuPayments\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public W_StoreAssert isNotMenuPayments()
	{
		isNotNull();
		if (actual.isMenuPayments()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be MenuPayments\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public W_StoreAssert isMenuRegistrations()
	{
		isNotNull();
		if (!actual.isMenuRegistrations()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be MenuRegistrations\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public W_StoreAssert isNotMenuRegistrations()
	{
		isNotNull();
		if (actual.isMenuRegistrations()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be MenuRegistrations\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public W_StoreAssert isMenuRequests()
	{
		isNotNull();
		if (!actual.isMenuRequests()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be MenuRequests\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public W_StoreAssert isNotMenuRequests()
	{
		isNotNull();
		if (actual.isMenuRequests()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be MenuRequests\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public W_StoreAssert isMenuRfQs()
	{
		isNotNull();
		if (!actual.isMenuRfQs()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be MenuRfQs\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public W_StoreAssert isNotMenuRfQs()
	{
		isNotNull();
		if (actual.isMenuRfQs()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be MenuRfQs\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public W_StoreAssert isMenuShipments()
	{
		isNotNull();
		if (!actual.isMenuShipments()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be MenuShipments\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public W_StoreAssert isNotMenuShipments()
	{
		isNotNull();
		if (actual.isMenuShipments()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be MenuShipments\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public W_StoreAssert hasM_PriceList_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_PriceList_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_PriceList_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public W_StoreAssert hasM_Warehouse_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Warehouse_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Warehouse_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public W_StoreAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public W_StoreAssert hasSalesRep_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getSalesRep_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SalesRep_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public W_StoreAssert hasStylesheet(String expected)
	{
		isNotNull();
		String actualField = actual.getStylesheet();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Stylesheet: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public W_StoreAssert hasURL(String expected)
	{
		isNotNull();
		String actualField = actual.getURL();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have URL: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public W_StoreAssert hasW_Store_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getW_Store_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have W_Store_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public W_StoreAssert hasW_Store_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getW_Store_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have W_Store_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public W_StoreAssert hasWebContext(String expected)
	{
		isNotNull();
		String actualField = actual.getWebContext();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have WebContext: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public W_StoreAssert hasWebInfo(String expected)
	{
		isNotNull();
		String actualField = actual.getWebInfo();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have WebInfo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public W_StoreAssert hasWebOrderEMail(String expected)
	{
		isNotNull();
		String actualField = actual.getWebOrderEMail();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have WebOrderEMail: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public W_StoreAssert hasWebParam1(String expected)
	{
		isNotNull();
		String actualField = actual.getWebParam1();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have WebParam1: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public W_StoreAssert hasWebParam2(String expected)
	{
		isNotNull();
		String actualField = actual.getWebParam2();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have WebParam2: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public W_StoreAssert hasWebParam3(String expected)
	{
		isNotNull();
		String actualField = actual.getWebParam3();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have WebParam3: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public W_StoreAssert hasWebParam4(String expected)
	{
		isNotNull();
		String actualField = actual.getWebParam4();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have WebParam4: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public W_StoreAssert hasWebParam5(String expected)
	{
		isNotNull();
		String actualField = actual.getWebParam5();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have WebParam5: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public W_StoreAssert hasWebParam6(String expected)
	{
		isNotNull();
		String actualField = actual.getWebParam6();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have WebParam6: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public W_StoreAssert hasWStoreEMail(String expected)
	{
		isNotNull();
		String actualField = actual.getWStoreEMail();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have WStoreEMail: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public W_StoreAssert hasWStoreUser(String expected)
	{
		isNotNull();
		String actualField = actual.getWStoreUser();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have WStoreUser: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public W_StoreAssert hasWStoreUserPW(String expected)
	{
		isNotNull();
		String actualField = actual.getWStoreUserPW();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have WStoreUserPW: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}