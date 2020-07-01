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
import org.compiere.model.X_M_InOutConfirm;

/** Generated assertion class for M_InOutConfirm
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class M_InOutConfirmAssert
	extends AbstractPOAssert<M_InOutConfirmAssert,X_M_InOutConfirm>
{

    /** Standard Constructor */
    public M_InOutConfirmAssert (X_M_InOutConfirm actual)
    {
      super (actual, M_InOutConfirmAssert.class);
    }


	public M_InOutConfirmAssert hasApprovalAmt(Object expected)
	{
		isNotNull();
		bdAssert("ApprovalAmt", actual.getApprovalAmt(), expected);
		return myself;
	}


	public M_InOutConfirmAssert hasC_Invoice_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Invoice_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Invoice_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_InOutConfirmAssert hasConfirmationNo(String expected)
	{
		isNotNull();
		String actualField = actual.getConfirmationNo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ConfirmationNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_InOutConfirmAssert hasConfirmType(String expected)
	{
		isNotNull();
		String actualField = actual.getConfirmType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ConfirmType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_InOutConfirmAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_InOutConfirmAssert hasDocStatus(String expected)
	{
		isNotNull();
		String actualField = actual.getDocStatus();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DocStatus: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_InOutConfirmAssert hasDocumentNo(String expected)
	{
		isNotNull();
		String actualField = actual.getDocumentNo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DocumentNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_InOutConfirmAssert isApproved()
	{
		isNotNull();
		if (!actual.isApproved()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Approved\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_InOutConfirmAssert isNotApproved()
	{
		isNotNull();
		if (actual.isApproved()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Approved\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_InOutConfirmAssert isCancelled()
	{
		isNotNull();
		if (!actual.isCancelled()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Cancelled\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_InOutConfirmAssert isNotCancelled()
	{
		isNotNull();
		if (actual.isCancelled()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Cancelled\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_InOutConfirmAssert isInDispute()
	{
		isNotNull();
		if (!actual.isInDispute()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be InDispute\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_InOutConfirmAssert isNotInDispute()
	{
		isNotNull();
		if (actual.isInDispute()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be InDispute\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_InOutConfirmAssert hasM_InOut_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_InOut_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_InOut_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_InOutConfirmAssert hasM_InOutConfirm_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_InOutConfirm_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_InOutConfirm_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_InOutConfirmAssert hasM_InOutConfirm_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getM_InOutConfirm_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_InOutConfirm_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_InOutConfirmAssert hasM_Inventory_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Inventory_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Inventory_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_InOutConfirmAssert isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_InOutConfirmAssert isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_InOutConfirmAssert isProcessing()
	{
		isNotNull();
		if (!actual.isProcessing()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processing\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_InOutConfirmAssert isNotProcessing()
	{
		isNotNull();
		if (actual.isProcessing()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processing\nbut it was",
				getPODescription());
		}
		return myself;
	}
}