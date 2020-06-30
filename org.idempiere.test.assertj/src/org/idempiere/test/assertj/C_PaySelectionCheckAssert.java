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
import org.compiere.model.X_C_PaySelectionCheck;

/** Generated assertion class for C_PaySelectionCheck
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_PaySelectionCheckAssert
	extends AbstractPOAssert<C_PaySelectionCheckAssert,X_C_PaySelectionCheck>
{

    /** Standard Constructor */
    public C_PaySelectionCheckAssert (X_C_PaySelectionCheck actual)
    {
      super (actual, C_PaySelectionCheckAssert.class);
    }


	public C_PaySelectionCheckAssert hasC_BP_BankAccount_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BP_BankAccount_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BP_BankAccount_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaySelectionCheckAssert hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaySelectionCheckAssert hasC_Payment_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Payment_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Payment_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaySelectionCheckAssert hasC_PaySelection_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_PaySelection_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_PaySelection_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaySelectionCheckAssert hasC_PaySelectionCheck_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_PaySelectionCheck_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_PaySelectionCheck_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaySelectionCheckAssert hasC_PaySelectionCheck_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_PaySelectionCheck_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_PaySelectionCheck_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaySelectionCheckAssert hasDiscountAmt(Object expected)
	{
		isNotNull();
		bdAssert("DiscountAmt", actual.getDiscountAmt(), expected);
		return myself;
	}


	public C_PaySelectionCheckAssert hasDocumentNo(String expected)
	{
		isNotNull();
		String actualField = actual.getDocumentNo();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DocumentNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaySelectionCheckAssert isGeneratedDraft()
	{
		isNotNull();
		if (!actual.isGeneratedDraft()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be GeneratedDraft\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_PaySelectionCheckAssert isNotGeneratedDraft()
	{
		isNotNull();
		if (actual.isGeneratedDraft()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be GeneratedDraft\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_PaySelectionCheckAssert isPrinted()
	{
		isNotNull();
		if (!actual.isPrinted()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Printed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_PaySelectionCheckAssert isNotPrinted()
	{
		isNotNull();
		if (actual.isPrinted()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Printed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_PaySelectionCheckAssert isReceipt()
	{
		isNotNull();
		if (!actual.isReceipt()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Receipt\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_PaySelectionCheckAssert isNotReceipt()
	{
		isNotNull();
		if (actual.isReceipt()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Receipt\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_PaySelectionCheckAssert hasPayAmt(Object expected)
	{
		isNotNull();
		bdAssert("PayAmt", actual.getPayAmt(), expected);
		return myself;
	}


	public C_PaySelectionCheckAssert hasPaymentRule(String expected)
	{
		isNotNull();
		String actualField = actual.getPaymentRule();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PaymentRule: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaySelectionCheckAssert isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_PaySelectionCheckAssert isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_PaySelectionCheckAssert hasQty(int expected)
	{
		isNotNull();
		int actualField = actual.getQty();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Qty: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaySelectionCheckAssert hasWriteOffAmt(Object expected)
	{
		isNotNull();
		bdAssert("WriteOffAmt", actual.getWriteOffAmt(), expected);
		return myself;
	}

}