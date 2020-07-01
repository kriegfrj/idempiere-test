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
import org.compiere.model.X_C_PaymentTransaction;

/** Generated assertion class for C_PaymentTransaction
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_PaymentTransactionAssert
	extends AbstractPOAssert<C_PaymentTransactionAssert,X_C_PaymentTransaction>
{

    /** Standard Constructor */
    public C_PaymentTransactionAssert (X_C_PaymentTransaction actual)
    {
      super (actual, C_PaymentTransactionAssert.class);
    }


	public C_PaymentTransactionAssert hasA_City(String expected)
	{
		isNotNull();
		String actualField = actual.getA_City();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_City: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasA_Country(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Country();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Country: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasA_EMail(String expected)
	{
		isNotNull();
		String actualField = actual.getA_EMail();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_EMail: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasA_Ident_DL(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Ident_DL();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Ident_DL: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasA_Ident_SSN(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Ident_SSN();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Ident_SSN: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasA_Name(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Name();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasA_State(String expected)
	{
		isNotNull();
		String actualField = actual.getA_State();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_State: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasA_Street(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Street();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Street: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasA_Zip(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Zip();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Zip: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasAccountNo(String expected)
	{
		isNotNull();
		String actualField = actual.getAccountNo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AccountNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasAD_OrgTrx_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_OrgTrx_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_OrgTrx_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasC_Activity_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Activity_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Activity_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasC_BankAccount_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BankAccount_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BankAccount_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasC_BP_BankAccount_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BP_BankAccount_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BP_BankAccount_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasC_Campaign_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Campaign_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Campaign_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasC_CashBook_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_CashBook_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_CashBook_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasC_Charge_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Charge_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Charge_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasC_ConversionType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ConversionType_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_ConversionType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasC_Currency_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Currency_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Currency_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasC_Invoice_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Invoice_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Invoice_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasC_Order_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Order_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Order_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasC_Payment_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Payment_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Payment_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasC_PaymentBatch_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_PaymentBatch_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_PaymentBatch_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasC_PaymentProcessor_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_PaymentProcessor_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_PaymentProcessor_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasC_PaymentTransaction_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_PaymentTransaction_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_PaymentTransaction_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasC_PaymentTransaction_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_PaymentTransaction_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_PaymentTransaction_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasC_POSTenderType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_POSTenderType_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_POSTenderType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasC_Project_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Project_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Project_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasCheckNo(String expected)
	{
		isNotNull();
		String actualField = actual.getCheckNo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CheckNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasCreditCardExpMM(int expected)
	{
		isNotNull();
		int actualField = actual.getCreditCardExpMM();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CreditCardExpMM: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasCreditCardExpYY(int expected)
	{
		isNotNull();
		int actualField = actual.getCreditCardExpYY();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CreditCardExpYY: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasCreditCardNumber(String expected)
	{
		isNotNull();
		String actualField = actual.getCreditCardNumber();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CreditCardNumber: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasCreditCardType(String expected)
	{
		isNotNull();
		String actualField = actual.getCreditCardType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CreditCardType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasCreditCardVV(String expected)
	{
		isNotNull();
		String actualField = actual.getCreditCardVV();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CreditCardVV: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasCustomerAddressID(String expected)
	{
		isNotNull();
		String actualField = actual.getCustomerAddressID();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CustomerAddressID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasCustomerPaymentProfileID(String expected)
	{
		isNotNull();
		String actualField = actual.getCustomerPaymentProfileID();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CustomerPaymentProfileID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasCustomerProfileID(String expected)
	{
		isNotNull();
		String actualField = actual.getCustomerProfileID();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CustomerProfileID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasDateTrx(Object expected)
	{
		isNotNull();
		dateAssert("DateTrx", actual.getDateTrx(), expected);
		return myself;
	}


	public C_PaymentTransactionAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasIBAN(String expected)
	{
		isNotNull();
		String actualField = actual.getIBAN();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have IBAN: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert isApproved()
	{
		isNotNull();
		if (!actual.isApproved()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Approved\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentTransactionAssert isNotApproved()
	{
		isNotNull();
		if (actual.isApproved()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Approved\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentTransactionAssert isDelayedCapture()
	{
		isNotNull();
		if (!actual.isDelayedCapture()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DelayedCapture\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentTransactionAssert isNotDelayedCapture()
	{
		isNotNull();
		if (actual.isDelayedCapture()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DelayedCapture\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentTransactionAssert isOnline()
	{
		isNotNull();
		if (!actual.isOnline()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Online\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentTransactionAssert isNotOnline()
	{
		isNotNull();
		if (actual.isOnline()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Online\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentTransactionAssert isReceipt()
	{
		isNotNull();
		if (!actual.isReceipt()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Receipt\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentTransactionAssert isNotReceipt()
	{
		isNotNull();
		if (actual.isReceipt()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Receipt\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentTransactionAssert isSelfService()
	{
		isNotNull();
		if (!actual.isSelfService()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SelfService\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentTransactionAssert isNotSelfService()
	{
		isNotNull();
		if (actual.isSelfService()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SelfService\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentTransactionAssert isVoided()
	{
		isNotNull();
		if (!actual.isVoided()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Voided\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentTransactionAssert isNotVoided()
	{
		isNotNull();
		if (actual.isVoided()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Voided\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasMicr(String expected)
	{
		isNotNull();
		String actualField = actual.getMicr();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Micr: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasOrig_TrxID(String expected)
	{
		isNotNull();
		String actualField = actual.getOrig_TrxID();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Orig_TrxID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasPayAmt(Object expected)
	{
		isNotNull();
		bdAssert("PayAmt", actual.getPayAmt(), expected);
		return myself;
	}


	public C_PaymentTransactionAssert hasPONum(String expected)
	{
		isNotNull();
		String actualField = actual.getPONum();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PONum: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentTransactionAssert isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasR_AuthCode(String expected)
	{
		isNotNull();
		String actualField = actual.getR_AuthCode();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have R_AuthCode: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasR_AvsAddr(String expected)
	{
		isNotNull();
		String actualField = actual.getR_AvsAddr();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have R_AvsAddr: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasR_AvsZip(String expected)
	{
		isNotNull();
		String actualField = actual.getR_AvsZip();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have R_AvsZip: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert isR_CVV2Match()
	{
		isNotNull();
		if (!actual.isR_CVV2Match()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be R_CVV2Match\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentTransactionAssert isNotR_CVV2Match()
	{
		isNotNull();
		if (actual.isR_CVV2Match()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be R_CVV2Match\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasR_Info(String expected)
	{
		isNotNull();
		String actualField = actual.getR_Info();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have R_Info: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasR_PnRef(String expected)
	{
		isNotNull();
		String actualField = actual.getR_PnRef();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have R_PnRef: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasR_RespMsg(String expected)
	{
		isNotNull();
		String actualField = actual.getR_RespMsg();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have R_RespMsg: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasR_Result(String expected)
	{
		isNotNull();
		String actualField = actual.getR_Result();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have R_Result: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasR_VoidMsg(String expected)
	{
		isNotNull();
		String actualField = actual.getR_VoidMsg();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have R_VoidMsg: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasRef_PaymentTransaction_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getRef_PaymentTransaction_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Ref_PaymentTransaction_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasRoutingNo(String expected)
	{
		isNotNull();
		String actualField = actual.getRoutingNo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have RoutingNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasSwiftCode(String expected)
	{
		isNotNull();
		String actualField = actual.getSwiftCode();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have SwiftCode: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasTaxAmt(Object expected)
	{
		isNotNull();
		bdAssert("TaxAmt", actual.getTaxAmt(), expected);
		return myself;
	}


	public C_PaymentTransactionAssert hasTenderType(String expected)
	{
		isNotNull();
		String actualField = actual.getTenderType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have TenderType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasTrxType(String expected)
	{
		isNotNull();
		String actualField = actual.getTrxType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have TrxType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasUser1_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getUser1_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have User1_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasUser2_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getUser2_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have User2_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTransactionAssert hasVoiceAuthCode(String expected)
	{
		isNotNull();
		String actualField = actual.getVoiceAuthCode();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have VoiceAuthCode: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}