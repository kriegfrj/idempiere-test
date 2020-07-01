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
import org.compiere.model.X_A_Asset_Disposed;

/** Generated assertion class for A_Asset_Disposed
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class A_Asset_DisposedAssert
	extends AbstractPOAssert<A_Asset_DisposedAssert,X_A_Asset_Disposed>
{

    /** Standard Constructor */
    public A_Asset_DisposedAssert (X_A_Asset_Disposed actual)
    {
      super (actual, A_Asset_DisposedAssert.class);
    }


	public A_Asset_DisposedAssert hasA_Accumulated_Depr(Object expected)
	{
		isNotNull();
		bdAssert("A_Accumulated_Depr", actual.getA_Accumulated_Depr(), expected);
		return myself;
	}


	public A_Asset_DisposedAssert hasA_Accumulated_Depr_Delta(Object expected)
	{
		isNotNull();
		bdAssert("A_Accumulated_Depr_Delta", actual.getA_Accumulated_Depr_Delta(), expected);
		return myself;
	}


	public A_Asset_DisposedAssert hasA_Activation_Method(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Activation_Method();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Activation_Method: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_DisposedAssert hasA_Asset_Cost(Object expected)
	{
		isNotNull();
		bdAssert("A_Asset_Cost", actual.getA_Asset_Cost(), expected);
		return myself;
	}


	public A_Asset_DisposedAssert hasA_Asset_Disposed_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Disposed_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Disposed_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_DisposedAssert hasA_Asset_Disposed_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Asset_Disposed_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Disposed_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_DisposedAssert hasA_Asset_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_DisposedAssert hasA_Asset_Status(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Asset_Status();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Status: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_DisposedAssert hasA_Asset_Trade_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Trade_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Trade_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_DisposedAssert hasA_Disposal_Amt(Object expected)
	{
		isNotNull();
		bdAssert("A_Disposal_Amt", actual.getA_Disposal_Amt(), expected);
		return myself;
	}


	public A_Asset_DisposedAssert hasA_Disposed_Date(Object expected)
	{
		isNotNull();
		dateAssert("A_Disposed_Date", actual.getA_Disposed_Date(), expected);
		return myself;
	}


	public A_Asset_DisposedAssert hasA_Disposed_Method(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Disposed_Method();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Disposed_Method: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_DisposedAssert hasA_Disposed_Reason(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Disposed_Reason();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Disposed_Reason: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_DisposedAssert hasA_Proceeds(Object expected)
	{
		isNotNull();
		bdAssert("A_Proceeds", actual.getA_Proceeds(), expected);
		return myself;
	}


	public A_Asset_DisposedAssert hasC_DocType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_DocType_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_DocType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_DisposedAssert hasC_Invoice_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Invoice_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Invoice_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_DisposedAssert hasC_InvoiceLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_InvoiceLine_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_InvoiceLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_DisposedAssert hasC_Period_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Period_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Period_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_DisposedAssert hasDateAcct(Object expected)
	{
		isNotNull();
		dateAssert("DateAcct", actual.getDateAcct(), expected);
		return myself;
	}


	public A_Asset_DisposedAssert hasDateDoc(Object expected)
	{
		isNotNull();
		dateAssert("DateDoc", actual.getDateDoc(), expected);
		return myself;
	}


	public A_Asset_DisposedAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_DisposedAssert hasDocStatus(String expected)
	{
		isNotNull();
		String actualField = actual.getDocStatus();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DocStatus: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_DisposedAssert hasDocumentNo(String expected)
	{
		isNotNull();
		String actualField = actual.getDocumentNo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DocumentNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_DisposedAssert hasExpense(Object expected)
	{
		isNotNull();
		bdAssert("Expense", actual.getExpense(), expected);
		return myself;
	}


	public A_Asset_DisposedAssert isApproved()
	{
		isNotNull();
		if (!actual.isApproved()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Approved\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_DisposedAssert isNotApproved()
	{
		isNotNull();
		if (actual.isApproved()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Approved\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_DisposedAssert isDisposed()
	{
		isNotNull();
		if (!actual.isDisposed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Disposed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_DisposedAssert isNotDisposed()
	{
		isNotNull();
		if (actual.isDisposed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Disposed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_DisposedAssert hasPostingType(String expected)
	{
		isNotNull();
		String actualField = actual.getPostingType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PostingType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_DisposedAssert isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_DisposedAssert isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_DisposedAssert hasProcessedOn(Object expected)
	{
		isNotNull();
		bdAssert("ProcessedOn", actual.getProcessedOn(), expected);
		return myself;
	}

}