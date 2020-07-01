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
import org.compiere.model.X_S_TimeExpenseLine;

/** Generated assertion class for S_TimeExpenseLine
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class S_TimeExpenseLineAssert
	extends AbstractPOAssert<S_TimeExpenseLineAssert,X_S_TimeExpenseLine>
{

    /** Standard Constructor */
    public S_TimeExpenseLineAssert (X_S_TimeExpenseLine actual)
    {
      super (actual, S_TimeExpenseLineAssert.class);
    }


	public S_TimeExpenseLineAssert hasC_Activity_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Activity_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Activity_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_TimeExpenseLineAssert hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_TimeExpenseLineAssert hasC_Campaign_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Campaign_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Campaign_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_TimeExpenseLineAssert hasC_Currency_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Currency_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Currency_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_TimeExpenseLineAssert hasC_InvoiceLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_InvoiceLine_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_InvoiceLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_TimeExpenseLineAssert hasC_OrderLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_OrderLine_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_OrderLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_TimeExpenseLineAssert hasC_Project_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Project_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Project_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_TimeExpenseLineAssert hasC_ProjectPhase_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ProjectPhase_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_ProjectPhase_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_TimeExpenseLineAssert hasC_ProjectTask_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ProjectTask_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_ProjectTask_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_TimeExpenseLineAssert hasC_UOM_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_UOM_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_UOM_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_TimeExpenseLineAssert hasConvertedAmt(Object expected)
	{
		isNotNull();
		bdAssert("ConvertedAmt", actual.getConvertedAmt(), expected);
		return myself;
	}


	public S_TimeExpenseLineAssert hasDateExpense(Object expected)
	{
		isNotNull();
		dateAssert("DateExpense", actual.getDateExpense(), expected);
		return myself;
	}


	public S_TimeExpenseLineAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_TimeExpenseLineAssert hasExpenseAmt(Object expected)
	{
		isNotNull();
		bdAssert("ExpenseAmt", actual.getExpenseAmt(), expected);
		return myself;
	}


	public S_TimeExpenseLineAssert hasInvoicePrice(Object expected)
	{
		isNotNull();
		bdAssert("InvoicePrice", actual.getInvoicePrice(), expected);
		return myself;
	}


	public S_TimeExpenseLineAssert isInvoiced()
	{
		isNotNull();
		if (!actual.isInvoiced()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Invoiced\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public S_TimeExpenseLineAssert isNotInvoiced()
	{
		isNotNull();
		if (actual.isInvoiced()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Invoiced\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public S_TimeExpenseLineAssert isTimeReport()
	{
		isNotNull();
		if (!actual.isTimeReport()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be TimeReport\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public S_TimeExpenseLineAssert isNotTimeReport()
	{
		isNotNull();
		if (actual.isTimeReport()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be TimeReport\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public S_TimeExpenseLineAssert hasLine(int expected)
	{
		isNotNull();
		int actualField = actual.getLine();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Line: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_TimeExpenseLineAssert hasM_Product_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Product_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_TimeExpenseLineAssert hasNote(String expected)
	{
		isNotNull();
		String actualField = actual.getNote();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Note: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_TimeExpenseLineAssert hasPriceInvoiced(Object expected)
	{
		isNotNull();
		bdAssert("PriceInvoiced", actual.getPriceInvoiced(), expected);
		return myself;
	}


	public S_TimeExpenseLineAssert hasPriceReimbursed(Object expected)
	{
		isNotNull();
		bdAssert("PriceReimbursed", actual.getPriceReimbursed(), expected);
		return myself;
	}


	public S_TimeExpenseLineAssert isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public S_TimeExpenseLineAssert isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public S_TimeExpenseLineAssert hasQty(Object expected)
	{
		isNotNull();
		bdAssert("Qty", actual.getQty(), expected);
		return myself;
	}


	public S_TimeExpenseLineAssert hasQtyInvoiced(Object expected)
	{
		isNotNull();
		bdAssert("QtyInvoiced", actual.getQtyInvoiced(), expected);
		return myself;
	}


	public S_TimeExpenseLineAssert hasQtyReimbursed(Object expected)
	{
		isNotNull();
		bdAssert("QtyReimbursed", actual.getQtyReimbursed(), expected);
		return myself;
	}


	public S_TimeExpenseLineAssert hasS_ResourceAssignment_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getS_ResourceAssignment_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have S_ResourceAssignment_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_TimeExpenseLineAssert hasS_TimeExpense_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getS_TimeExpense_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have S_TimeExpense_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_TimeExpenseLineAssert hasS_TimeExpenseLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getS_TimeExpenseLine_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have S_TimeExpenseLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_TimeExpenseLineAssert hasS_TimeExpenseLine_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getS_TimeExpenseLine_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have S_TimeExpenseLine_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_TimeExpenseLineAssert hasS_TimeType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getS_TimeType_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have S_TimeType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}