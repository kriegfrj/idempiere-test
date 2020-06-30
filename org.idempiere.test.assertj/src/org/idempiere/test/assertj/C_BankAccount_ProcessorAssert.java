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
import org.compiere.model.X_C_BankAccount_Processor;

/** Generated assertion class for C_BankAccount_Processor
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_BankAccount_ProcessorAssert
	extends AbstractPOAssert<C_BankAccount_ProcessorAssert,X_C_BankAccount_Processor>
{

    /** Standard Constructor */
    public C_BankAccount_ProcessorAssert (X_C_BankAccount_Processor actual)
    {
      super (actual, C_BankAccount_ProcessorAssert.class);
    }


	public C_BankAccount_ProcessorAssert isAcceptAMEX()
	{
		isNotNull();
		if (!actual.isAcceptAMEX()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AcceptAMEX\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert isNotAcceptAMEX()
	{
		isNotNull();
		if (actual.isAcceptAMEX()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AcceptAMEX\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert isAcceptATM()
	{
		isNotNull();
		if (!actual.isAcceptATM()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AcceptATM\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert isNotAcceptATM()
	{
		isNotNull();
		if (actual.isAcceptATM()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AcceptATM\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert isAcceptCheck()
	{
		isNotNull();
		if (!actual.isAcceptCheck()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AcceptCheck\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert isNotAcceptCheck()
	{
		isNotNull();
		if (actual.isAcceptCheck()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AcceptCheck\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert isAcceptCorporate()
	{
		isNotNull();
		if (!actual.isAcceptCorporate()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AcceptCorporate\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert isNotAcceptCorporate()
	{
		isNotNull();
		if (actual.isAcceptCorporate()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AcceptCorporate\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert isAcceptDiners()
	{
		isNotNull();
		if (!actual.isAcceptDiners()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AcceptDiners\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert isNotAcceptDiners()
	{
		isNotNull();
		if (actual.isAcceptDiners()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AcceptDiners\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert isAcceptDirectDebit()
	{
		isNotNull();
		if (!actual.isAcceptDirectDebit()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AcceptDirectDebit\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert isNotAcceptDirectDebit()
	{
		isNotNull();
		if (actual.isAcceptDirectDebit()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AcceptDirectDebit\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert isAcceptDirectDeposit()
	{
		isNotNull();
		if (!actual.isAcceptDirectDeposit()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AcceptDirectDeposit\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert isNotAcceptDirectDeposit()
	{
		isNotNull();
		if (actual.isAcceptDirectDeposit()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AcceptDirectDeposit\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert isAcceptDiscover()
	{
		isNotNull();
		if (!actual.isAcceptDiscover()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AcceptDiscover\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert isNotAcceptDiscover()
	{
		isNotNull();
		if (actual.isAcceptDiscover()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AcceptDiscover\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert isAcceptMC()
	{
		isNotNull();
		if (!actual.isAcceptMC()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AcceptMC\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert isNotAcceptMC()
	{
		isNotNull();
		if (actual.isAcceptMC()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AcceptMC\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert isAcceptVisa()
	{
		isNotNull();
		if (!actual.isAcceptVisa()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AcceptVisa\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert isNotAcceptVisa()
	{
		isNotNull();
		if (actual.isAcceptVisa()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AcceptVisa\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert hasC_BankAccount_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BankAccount_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BankAccount_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert hasC_BankAccount_Processor_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_BankAccount_Processor_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BankAccount_Processor_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert hasC_Currency_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Currency_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Currency_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert hasC_PaymentProcessor_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_PaymentProcessor_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_PaymentProcessor_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert isPPAcceptAMEX()
	{
		isNotNull();
		if (!actual.isPPAcceptAMEX()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PPAcceptAMEX\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert isNotPPAcceptAMEX()
	{
		isNotNull();
		if (actual.isPPAcceptAMEX()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PPAcceptAMEX\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert isPPAcceptATM()
	{
		isNotNull();
		if (!actual.isPPAcceptATM()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PPAcceptATM\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert isNotPPAcceptATM()
	{
		isNotNull();
		if (actual.isPPAcceptATM()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PPAcceptATM\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert isPPAcceptCheck()
	{
		isNotNull();
		if (!actual.isPPAcceptCheck()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PPAcceptCheck\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert isNotPPAcceptCheck()
	{
		isNotNull();
		if (actual.isPPAcceptCheck()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PPAcceptCheck\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert isPPAcceptCorporate()
	{
		isNotNull();
		if (!actual.isPPAcceptCorporate()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PPAcceptCorporate\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert isNotPPAcceptCorporate()
	{
		isNotNull();
		if (actual.isPPAcceptCorporate()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PPAcceptCorporate\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert isPPAcceptDiners()
	{
		isNotNull();
		if (!actual.isPPAcceptDiners()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PPAcceptDiners\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert isNotPPAcceptDiners()
	{
		isNotNull();
		if (actual.isPPAcceptDiners()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PPAcceptDiners\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert isPPAcceptDirectDebit()
	{
		isNotNull();
		if (!actual.isPPAcceptDirectDebit()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PPAcceptDirectDebit\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert isNotPPAcceptDirectDebit()
	{
		isNotNull();
		if (actual.isPPAcceptDirectDebit()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PPAcceptDirectDebit\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert isPPAcceptDirectDeposit()
	{
		isNotNull();
		if (!actual.isPPAcceptDirectDeposit()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PPAcceptDirectDeposit\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert isNotPPAcceptDirectDeposit()
	{
		isNotNull();
		if (actual.isPPAcceptDirectDeposit()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PPAcceptDirectDeposit\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert isPPAcceptDiscover()
	{
		isNotNull();
		if (!actual.isPPAcceptDiscover()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PPAcceptDiscover\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert isNotPPAcceptDiscover()
	{
		isNotNull();
		if (actual.isPPAcceptDiscover()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PPAcceptDiscover\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert isPPAcceptMC()
	{
		isNotNull();
		if (!actual.isPPAcceptMC()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PPAcceptMC\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert isNotPPAcceptMC()
	{
		isNotNull();
		if (actual.isPPAcceptMC()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PPAcceptMC\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert isPPAcceptVisa()
	{
		isNotNull();
		if (!actual.isPPAcceptVisa()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PPAcceptVisa\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert isNotPPAcceptVisa()
	{
		isNotNull();
		if (actual.isPPAcceptVisa()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PPAcceptVisa\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert hasMinimumAmt(Object expected)
	{
		isNotNull();
		bdAssert("MinimumAmt", actual.getMinimumAmt(), expected);
		return myself;
	}


	public C_BankAccount_ProcessorAssert hasPartnerID(String expected)
	{
		isNotNull();
		String actualField = actual.getPartnerID();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PartnerID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert hasPassword(String expected)
	{
		isNotNull();
		String actualField = actual.getPassword();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Password: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert isRequireVV()
	{
		isNotNull();
		if (!actual.isRequireVV()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be RequireVV\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert isNotRequireVV()
	{
		isNotNull();
		if (actual.isRequireVV()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be RequireVV\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert hasUserID(String expected)
	{
		isNotNull();
		String actualField = actual.getUserID();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have UserID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BankAccount_ProcessorAssert hasVendorID(String expected)
	{
		isNotNull();
		String actualField = actual.getVendorID();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have VendorID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}