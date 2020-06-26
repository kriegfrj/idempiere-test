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
import org.compiere.model.X_C_PaymentProcessor;

/** Generated assertion class for C_PaymentProcessor
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_PaymentProcessorAssert
	extends AbstractPOAssert<C_PaymentProcessorAssert,X_C_PaymentProcessor>
{

    /** Standard Constructor */
    public C_PaymentProcessorAssert (X_C_PaymentProcessor actual)
    {
      super (actual, C_PaymentProcessorAssert.class);
    }


	public C_PaymentProcessorAssert isAcceptAMEX()
	{
		isNotNull();
		if (!actual.isAcceptAMEX()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AcceptAMEX\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentProcessorAssert isNotAcceptAMEX()
	{
		isNotNull();
		if (actual.isAcceptAMEX()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AcceptAMEX\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentProcessorAssert isAcceptATM()
	{
		isNotNull();
		if (!actual.isAcceptATM()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AcceptATM\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentProcessorAssert isNotAcceptATM()
	{
		isNotNull();
		if (actual.isAcceptATM()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AcceptATM\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentProcessorAssert isAcceptCheck()
	{
		isNotNull();
		if (!actual.isAcceptCheck()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AcceptCheck\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentProcessorAssert isNotAcceptCheck()
	{
		isNotNull();
		if (actual.isAcceptCheck()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AcceptCheck\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentProcessorAssert isAcceptCorporate()
	{
		isNotNull();
		if (!actual.isAcceptCorporate()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AcceptCorporate\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentProcessorAssert isNotAcceptCorporate()
	{
		isNotNull();
		if (actual.isAcceptCorporate()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AcceptCorporate\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentProcessorAssert isAcceptDiners()
	{
		isNotNull();
		if (!actual.isAcceptDiners()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AcceptDiners\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentProcessorAssert isNotAcceptDiners()
	{
		isNotNull();
		if (actual.isAcceptDiners()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AcceptDiners\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentProcessorAssert isAcceptDirectDebit()
	{
		isNotNull();
		if (!actual.isAcceptDirectDebit()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AcceptDirectDebit\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentProcessorAssert isNotAcceptDirectDebit()
	{
		isNotNull();
		if (actual.isAcceptDirectDebit()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AcceptDirectDebit\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentProcessorAssert isAcceptDirectDeposit()
	{
		isNotNull();
		if (!actual.isAcceptDirectDeposit()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AcceptDirectDeposit\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentProcessorAssert isNotAcceptDirectDeposit()
	{
		isNotNull();
		if (actual.isAcceptDirectDeposit()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AcceptDirectDeposit\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentProcessorAssert isAcceptDiscover()
	{
		isNotNull();
		if (!actual.isAcceptDiscover()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AcceptDiscover\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentProcessorAssert isNotAcceptDiscover()
	{
		isNotNull();
		if (actual.isAcceptDiscover()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AcceptDiscover\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentProcessorAssert isAcceptMC()
	{
		isNotNull();
		if (!actual.isAcceptMC()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AcceptMC\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentProcessorAssert isNotAcceptMC()
	{
		isNotNull();
		if (actual.isAcceptMC()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AcceptMC\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentProcessorAssert isAcceptVisa()
	{
		isNotNull();
		if (!actual.isAcceptVisa()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AcceptVisa\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentProcessorAssert isNotAcceptVisa()
	{
		isNotNull();
		if (actual.isAcceptVisa()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AcceptVisa\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentProcessorAssert hasAD_Sequence_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Sequence_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Sequence_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentProcessorAssert hasC_BankAccount_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BankAccount_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BankAccount_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentProcessorAssert hasC_Currency_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Currency_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Currency_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentProcessorAssert hasC_PaymentProcessor_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_PaymentProcessor_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_PaymentProcessor_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentProcessorAssert hasC_PaymentProcessor_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_PaymentProcessor_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_PaymentProcessor_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentProcessorAssert hasCommission(Object expected)
	{
		isNotNull();
		bdAssert("Commission", actual.getCommission(), expected);
		return myself;
	}


	public C_PaymentProcessorAssert hasCostPerTrx(Object expected)
	{
		isNotNull();
		bdAssert("CostPerTrx", actual.getCostPerTrx(), expected);
		return myself;
	}


	public C_PaymentProcessorAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentProcessorAssert hasHostAddress(String expected)
	{
		isNotNull();
		String actualField = actual.getHostAddress();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have HostAddress: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentProcessorAssert hasHostPort(int expected)
	{
		isNotNull();
		int actualField = actual.getHostPort();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have HostPort: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentProcessorAssert hasMinimumAmt(Object expected)
	{
		isNotNull();
		bdAssert("MinimumAmt", actual.getMinimumAmt(), expected);
		return myself;
	}


	public C_PaymentProcessorAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentProcessorAssert hasPayProcessorClass(String expected)
	{
		isNotNull();
		String actualField = actual.getPayProcessorClass();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PayProcessorClass: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentProcessorAssert hasProxyAddress(String expected)
	{
		isNotNull();
		String actualField = actual.getProxyAddress();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ProxyAddress: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentProcessorAssert hasProxyLogon(String expected)
	{
		isNotNull();
		String actualField = actual.getProxyLogon();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ProxyLogon: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentProcessorAssert hasProxyPassword(String expected)
	{
		isNotNull();
		String actualField = actual.getProxyPassword();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ProxyPassword: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentProcessorAssert hasProxyPort(int expected)
	{
		isNotNull();
		int actualField = actual.getProxyPort();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ProxyPort: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentProcessorAssert isRequireVV()
	{
		isNotNull();
		if (!actual.isRequireVV()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be RequireVV\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentProcessorAssert isNotRequireVV()
	{
		isNotNull();
		if (actual.isRequireVV()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be RequireVV\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentProcessorAssert hasTrxType(String expected)
	{
		isNotNull();
		String actualField = actual.getTrxType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have TrxType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}