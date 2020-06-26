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
import org.compiere.model.X_GL_JournalBatch;

/** Generated assertion class for GL_JournalBatch
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class GL_JournalBatchAssert
	extends AbstractPOAssert<GL_JournalBatchAssert,X_GL_JournalBatch>
{

    /** Standard Constructor */
    public GL_JournalBatchAssert (X_GL_JournalBatch actual)
    {
      super (actual, GL_JournalBatchAssert.class);
    }


	public GL_JournalBatchAssert hasC_Currency_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Currency_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Currency_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalBatchAssert hasC_DocType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_DocType_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_DocType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalBatchAssert hasC_Period_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Period_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Period_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalBatchAssert hasControlAmt(Object expected)
	{
		isNotNull();
		bdAssert("ControlAmt", actual.getControlAmt(), expected);
		return myself;
	}


	public GL_JournalBatchAssert hasDateAcct(Object expected)
	{
		isNotNull();
		dateAssert("DateAcct", actual.getDateAcct(), expected);
		return myself;
	}


	public GL_JournalBatchAssert hasDateDoc(Object expected)
	{
		isNotNull();
		dateAssert("DateDoc", actual.getDateDoc(), expected);
		return myself;
	}


	public GL_JournalBatchAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalBatchAssert hasDocStatus(String expected)
	{
		isNotNull();
		String actualField = actual.getDocStatus();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DocStatus: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalBatchAssert hasDocumentNo(String expected)
	{
		isNotNull();
		String actualField = actual.getDocumentNo();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DocumentNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalBatchAssert hasGL_Category_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getGL_Category_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have GL_Category_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalBatchAssert hasGL_JournalBatch_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getGL_JournalBatch_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have GL_JournalBatch_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalBatchAssert hasGL_JournalBatch_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getGL_JournalBatch_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have GL_JournalBatch_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalBatchAssert isApproved()
	{
		isNotNull();
		if (!actual.isApproved()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Approved\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public GL_JournalBatchAssert isNotApproved()
	{
		isNotNull();
		if (actual.isApproved()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Approved\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public GL_JournalBatchAssert hasPostingType(String expected)
	{
		isNotNull();
		String actualField = actual.getPostingType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PostingType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalBatchAssert isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public GL_JournalBatchAssert isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public GL_JournalBatchAssert hasReversal_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getReversal_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Reversal_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalBatchAssert hasTotalCr(Object expected)
	{
		isNotNull();
		bdAssert("TotalCr", actual.getTotalCr(), expected);
		return myself;
	}


	public GL_JournalBatchAssert hasTotalDr(Object expected)
	{
		isNotNull();
		bdAssert("TotalDr", actual.getTotalDr(), expected);
		return myself;
	}

}