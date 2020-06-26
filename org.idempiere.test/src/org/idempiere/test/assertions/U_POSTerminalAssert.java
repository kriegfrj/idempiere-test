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
import org.compiere.model.X_U_POSTerminal;

/** Generated assertion class for U_POSTerminal
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class U_POSTerminalAssert
	extends AbstractPOAssert<U_POSTerminalAssert,X_U_POSTerminal>
{

    /** Standard Constructor */
    public U_POSTerminalAssert (X_U_POSTerminal actual)
    {
      super (actual, U_POSTerminalAssert.class);
    }


	public U_POSTerminalAssert isAutoLock()
	{
		isNotNull();
		if (!actual.isAutoLock()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AutoLock\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public U_POSTerminalAssert isNotAutoLock()
	{
		isNotNull();
		if (actual.isAutoLock()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AutoLock\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public U_POSTerminalAssert hasC_CashBook_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_CashBook_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_CashBook_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public U_POSTerminalAssert hasC_CashBPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_CashBPartner_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_CashBPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public U_POSTerminalAssert hasC_TemplateBPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_TemplateBPartner_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_TemplateBPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public U_POSTerminalAssert hasCard_BankAccount_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getCard_BankAccount_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Card_BankAccount_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public U_POSTerminalAssert hasCardTransferBankAccount_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getCardTransferBankAccount_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CardTransferBankAccount_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public U_POSTerminalAssert hasCardTransferCashBook_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getCardTransferCashBook_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CardTransferCashBook_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public U_POSTerminalAssert hasCardTransferType(String expected)
	{
		isNotNull();
		String actualField = actual.getCardTransferType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CardTransferType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public U_POSTerminalAssert hasCashBookTransferType(String expected)
	{
		isNotNull();
		String actualField = actual.getCashBookTransferType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CashBookTransferType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public U_POSTerminalAssert hasCashTransferBankAccount_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getCashTransferBankAccount_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CashTransferBankAccount_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public U_POSTerminalAssert hasCashTransferCashBook_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getCashTransferCashBook_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CashTransferCashBook_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public U_POSTerminalAssert hasCheck_BankAccount_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getCheck_BankAccount_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Check_BankAccount_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public U_POSTerminalAssert hasCheckTransferBankAccount_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getCheckTransferBankAccount_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CheckTransferBankAccount_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public U_POSTerminalAssert hasCheckTransferCashBook_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getCheckTransferCashBook_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CheckTransferCashBook_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public U_POSTerminalAssert hasCheckTransferType(String expected)
	{
		isNotNull();
		String actualField = actual.getCheckTransferType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CheckTransferType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public U_POSTerminalAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public U_POSTerminalAssert hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public U_POSTerminalAssert hasLastLockTime(Object expected)
	{
		isNotNull();
		dateAssert("LastLockTime", actual.getLastLockTime(), expected);
		return myself;
	}


	public U_POSTerminalAssert isLocked()
	{
		isNotNull();
		if (!actual.isLocked()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Locked\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public U_POSTerminalAssert isNotLocked()
	{
		isNotNull();
		if (actual.isLocked()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Locked\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public U_POSTerminalAssert hasLockTime(int expected)
	{
		isNotNull();
		int actualField = actual.getLockTime();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have LockTime: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public U_POSTerminalAssert hasM_Warehouse_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Warehouse_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Warehouse_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public U_POSTerminalAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public U_POSTerminalAssert hasPO_PriceList_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPO_PriceList_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PO_PriceList_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public U_POSTerminalAssert hasPrinterName(String expected)
	{
		isNotNull();
		String actualField = actual.getPrinterName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PrinterName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public U_POSTerminalAssert hasSalesRep_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getSalesRep_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SalesRep_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public U_POSTerminalAssert hasSO_PriceList_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getSO_PriceList_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SO_PriceList_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public U_POSTerminalAssert hasU_POSTerminal_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getU_POSTerminal_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have U_POSTerminal_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public U_POSTerminalAssert hasU_POSTerminal_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getU_POSTerminal_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have U_POSTerminal_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public U_POSTerminalAssert hasUnlockingTime(Object expected)
	{
		isNotNull();
		dateAssert("UnlockingTime", actual.getUnlockingTime(), expected);
		return myself;
	}


	public U_POSTerminalAssert hasValue(String expected)
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