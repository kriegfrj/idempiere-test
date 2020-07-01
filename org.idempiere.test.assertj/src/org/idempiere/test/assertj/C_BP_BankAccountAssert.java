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

import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_C_BP_BankAccount;

/** Generated assertion class for C_BP_BankAccount
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_BP_BankAccountAssert
	extends AbstractPOAssert<C_BP_BankAccountAssert,X_C_BP_BankAccount>
{

    /** Standard Constructor */
    public C_BP_BankAccountAssert (X_C_BP_BankAccount actual)
    {
      super (actual, C_BP_BankAccountAssert.class);
    }


	public C_BP_BankAccountAssert hasA_City(String expected)
	{
		isNotNull();
		String actualField = actual.getA_City();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_City: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_BankAccountAssert hasA_Country(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Country();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Country: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_BankAccountAssert hasA_EMail(String expected)
	{
		isNotNull();
		String actualField = actual.getA_EMail();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_EMail: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_BankAccountAssert hasA_Ident_DL(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Ident_DL();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Ident_DL: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_BankAccountAssert hasA_Ident_SSN(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Ident_SSN();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Ident_SSN: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_BankAccountAssert hasA_Name(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Name();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_BankAccountAssert hasA_State(String expected)
	{
		isNotNull();
		String actualField = actual.getA_State();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_State: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_BankAccountAssert hasA_Street(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Street();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Street: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_BankAccountAssert hasA_Zip(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Zip();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Zip: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_BankAccountAssert hasAccountNo(String expected)
	{
		isNotNull();
		String actualField = actual.getAccountNo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AccountNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_BankAccountAssert hasAD_User_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_User_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_User_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_BankAccountAssert hasBankAccountType(String expected)
	{
		isNotNull();
		String actualField = actual.getBankAccountType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have BankAccountType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_BankAccountAssert hasBPBankAcctUse(String expected)
	{
		isNotNull();
		String actualField = actual.getBPBankAcctUse();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have BPBankAcctUse: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_BankAccountAssert hasC_Bank_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Bank_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Bank_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_BankAccountAssert hasC_BP_BankAccount_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BP_BankAccount_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BP_BankAccount_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_BankAccountAssert hasC_BP_BankAccount_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_BP_BankAccount_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BP_BankAccount_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_BankAccountAssert hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_BankAccountAssert hasC_PaymentProcessor_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_PaymentProcessor_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_PaymentProcessor_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_BankAccountAssert hasCreditCardExpMM(int expected)
	{
		isNotNull();
		int actualField = actual.getCreditCardExpMM();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CreditCardExpMM: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_BankAccountAssert hasCreditCardExpYY(int expected)
	{
		isNotNull();
		int actualField = actual.getCreditCardExpYY();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CreditCardExpYY: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_BankAccountAssert hasCreditCardNumber(String expected)
	{
		isNotNull();
		String actualField = actual.getCreditCardNumber();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CreditCardNumber: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_BankAccountAssert hasCreditCardType(String expected)
	{
		isNotNull();
		String actualField = actual.getCreditCardType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CreditCardType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_BankAccountAssert hasCreditCardVV(String expected)
	{
		isNotNull();
		String actualField = actual.getCreditCardVV();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CreditCardVV: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_BankAccountAssert hasCustomerPaymentProfileID(String expected)
	{
		isNotNull();
		String actualField = actual.getCustomerPaymentProfileID();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CustomerPaymentProfileID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_BankAccountAssert hasIBAN(String expected)
	{
		isNotNull();
		String actualField = actual.getIBAN();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have IBAN: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_BankAccountAssert isACH()
	{
		isNotNull();
		if (!actual.isACH()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ACH\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BP_BankAccountAssert isNotACH()
	{
		isNotNull();
		if (actual.isACH()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ACH\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BP_BankAccountAssert hasR_AvsAddr(String expected)
	{
		isNotNull();
		String actualField = actual.getR_AvsAddr();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have R_AvsAddr: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_BankAccountAssert hasR_AvsZip(String expected)
	{
		isNotNull();
		String actualField = actual.getR_AvsZip();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have R_AvsZip: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_BankAccountAssert hasRoutingNo(String expected)
	{
		isNotNull();
		String actualField = actual.getRoutingNo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have RoutingNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}