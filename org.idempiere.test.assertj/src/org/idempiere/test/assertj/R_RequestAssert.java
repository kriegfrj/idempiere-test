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
import org.compiere.model.X_R_Request;

/** Generated assertion class for R_Request
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class R_RequestAssert
	extends AbstractPOAssert<R_RequestAssert,X_R_Request>
{

    /** Standard Constructor */
    public R_RequestAssert (X_R_Request actual)
    {
      super (actual, R_RequestAssert.class);
    }


	public R_RequestAssert hasA_Asset_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestAssert hasAD_Role_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Role_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Role_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestAssert hasAD_Table_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Table_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Table_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestAssert hasAD_User_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_User_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_User_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestAssert hasC_Activity_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Activity_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Activity_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestAssert hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestAssert hasC_Campaign_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Campaign_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Campaign_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestAssert hasC_Invoice_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Invoice_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Invoice_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestAssert hasC_InvoiceRequest_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_InvoiceRequest_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_InvoiceRequest_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestAssert hasC_Order_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Order_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Order_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestAssert hasC_Payment_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Payment_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Payment_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestAssert hasC_Project_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Project_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Project_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestAssert hasCloseDate(Object expected)
	{
		isNotNull();
		dateAssert("CloseDate", actual.getCloseDate(), expected);
		return myself;
	}


	public R_RequestAssert hasConfidentialType(String expected)
	{
		isNotNull();
		String actualField = actual.getConfidentialType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ConfidentialType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestAssert hasConfidentialTypeEntry(String expected)
	{
		isNotNull();
		String actualField = actual.getConfidentialTypeEntry();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ConfidentialTypeEntry: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestAssert hasDateCompletePlan(Object expected)
	{
		isNotNull();
		dateAssert("DateCompletePlan", actual.getDateCompletePlan(), expected);
		return myself;
	}


	public R_RequestAssert hasDateLastAction(Object expected)
	{
		isNotNull();
		dateAssert("DateLastAction", actual.getDateLastAction(), expected);
		return myself;
	}


	public R_RequestAssert hasDateLastAlert(Object expected)
	{
		isNotNull();
		dateAssert("DateLastAlert", actual.getDateLastAlert(), expected);
		return myself;
	}


	public R_RequestAssert hasDateNextAction(Object expected)
	{
		isNotNull();
		dateAssert("DateNextAction", actual.getDateNextAction(), expected);
		return myself;
	}


	public R_RequestAssert hasDateStartPlan(Object expected)
	{
		isNotNull();
		dateAssert("DateStartPlan", actual.getDateStartPlan(), expected);
		return myself;
	}


	public R_RequestAssert hasDocumentNo(String expected)
	{
		isNotNull();
		String actualField = actual.getDocumentNo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DocumentNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestAssert hasDueType(String expected)
	{
		isNotNull();
		String actualField = actual.getDueType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DueType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestAssert hasEndTime(Object expected)
	{
		isNotNull();
		dateAssert("EndTime", actual.getEndTime(), expected);
		return myself;
	}


	public R_RequestAssert isEscalated()
	{
		isNotNull();
		if (!actual.isEscalated()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Escalated\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public R_RequestAssert isNotEscalated()
	{
		isNotNull();
		if (actual.isEscalated()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Escalated\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public R_RequestAssert isInvoiced()
	{
		isNotNull();
		if (!actual.isInvoiced()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Invoiced\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public R_RequestAssert isNotInvoiced()
	{
		isNotNull();
		if (actual.isInvoiced()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Invoiced\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public R_RequestAssert isSelfService()
	{
		isNotNull();
		if (!actual.isSelfService()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SelfService\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public R_RequestAssert isNotSelfService()
	{
		isNotNull();
		if (actual.isSelfService()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SelfService\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public R_RequestAssert hasLastResult(String expected)
	{
		isNotNull();
		String actualField = actual.getLastResult();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have LastResult: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestAssert hasM_ChangeRequest_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_ChangeRequest_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_ChangeRequest_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestAssert hasM_FixChangeNotice_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_FixChangeNotice_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_FixChangeNotice_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestAssert hasM_InOut_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_InOut_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_InOut_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestAssert hasM_Product_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Product_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestAssert hasM_ProductSpent_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_ProductSpent_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_ProductSpent_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestAssert hasM_RMA_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_RMA_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_RMA_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestAssert hasNextAction(String expected)
	{
		isNotNull();
		String actualField = actual.getNextAction();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have NextAction: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestAssert hasPriority(String expected)
	{
		isNotNull();
		String actualField = actual.getPriority();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Priority: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestAssert hasPriorityUser(String expected)
	{
		isNotNull();
		String actualField = actual.getPriorityUser();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PriorityUser: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestAssert isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public R_RequestAssert isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public R_RequestAssert hasQtyInvoiced(Object expected)
	{
		isNotNull();
		bdAssert("QtyInvoiced", actual.getQtyInvoiced(), expected);
		return myself;
	}


	public R_RequestAssert hasQtyPlan(Object expected)
	{
		isNotNull();
		bdAssert("QtyPlan", actual.getQtyPlan(), expected);
		return myself;
	}


	public R_RequestAssert hasQtySpent(Object expected)
	{
		isNotNull();
		bdAssert("QtySpent", actual.getQtySpent(), expected);
		return myself;
	}


	public R_RequestAssert hasR_Category_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getR_Category_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have R_Category_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestAssert hasR_Group_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getR_Group_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have R_Group_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestAssert hasR_MailText_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getR_MailText_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have R_MailText_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestAssert hasR_Request_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getR_Request_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have R_Request_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestAssert hasR_Request_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getR_Request_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have R_Request_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestAssert hasR_RequestRelated_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getR_RequestRelated_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have R_RequestRelated_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestAssert hasR_RequestType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getR_RequestType_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have R_RequestType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestAssert hasR_Resolution_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getR_Resolution_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have R_Resolution_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestAssert hasR_StandardResponse_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getR_StandardResponse_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have R_StandardResponse_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestAssert hasR_Status_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getR_Status_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have R_Status_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestAssert hasRequestAmt(Object expected)
	{
		isNotNull();
		bdAssert("RequestAmt", actual.getRequestAmt(), expected);
		return myself;
	}


	public R_RequestAssert hasResult(String expected)
	{
		isNotNull();
		String actualField = actual.getResult();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Result: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestAssert hasSalesRep_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getSalesRep_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have SalesRep_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestAssert hasStartDate(Object expected)
	{
		isNotNull();
		dateAssert("StartDate", actual.getStartDate(), expected);
		return myself;
	}


	public R_RequestAssert hasStartTime(Object expected)
	{
		isNotNull();
		dateAssert("StartTime", actual.getStartTime(), expected);
		return myself;
	}


	public R_RequestAssert hasSummary(String expected)
	{
		isNotNull();
		String actualField = actual.getSummary();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Summary: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestAssert hasTaskStatus(String expected)
	{
		isNotNull();
		String actualField = actual.getTaskStatus();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have TaskStatus: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}