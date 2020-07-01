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
import org.compiere.model.X_C_DunningRunLine;

/** Generated assertion class for C_DunningRunLine
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_DunningRunLineAssert
	extends AbstractPOAssert<C_DunningRunLineAssert,X_C_DunningRunLine>
{

    /** Standard Constructor */
    public C_DunningRunLineAssert (X_C_DunningRunLine actual)
    {
      super (actual, C_DunningRunLineAssert.class);
    }


	public C_DunningRunLineAssert hasAmt(Object expected)
	{
		isNotNull();
		bdAssert("Amt", actual.getAmt(), expected);
		return myself;
	}


	public C_DunningRunLineAssert hasC_DunningRunEntry_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_DunningRunEntry_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_DunningRunEntry_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DunningRunLineAssert hasC_DunningRunLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_DunningRunLine_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_DunningRunLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DunningRunLineAssert hasC_DunningRunLine_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_DunningRunLine_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_DunningRunLine_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DunningRunLineAssert hasC_Invoice_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Invoice_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Invoice_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DunningRunLineAssert hasC_InvoicePaySchedule_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_InvoicePaySchedule_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_InvoicePaySchedule_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DunningRunLineAssert hasC_Payment_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Payment_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Payment_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DunningRunLineAssert hasConvertedAmt(Object expected)
	{
		isNotNull();
		bdAssert("ConvertedAmt", actual.getConvertedAmt(), expected);
		return myself;
	}


	public C_DunningRunLineAssert hasDaysDue(int expected)
	{
		isNotNull();
		int actualField = actual.getDaysDue();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DaysDue: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DunningRunLineAssert hasFeeAmt(Object expected)
	{
		isNotNull();
		bdAssert("FeeAmt", actual.getFeeAmt(), expected);
		return myself;
	}


	public C_DunningRunLineAssert hasInterestAmt(Object expected)
	{
		isNotNull();
		bdAssert("InterestAmt", actual.getInterestAmt(), expected);
		return myself;
	}


	public C_DunningRunLineAssert isInDispute()
	{
		isNotNull();
		if (!actual.isInDispute()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be InDispute\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_DunningRunLineAssert isNotInDispute()
	{
		isNotNull();
		if (actual.isInDispute()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be InDispute\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_DunningRunLineAssert hasOpenAmt(Object expected)
	{
		isNotNull();
		bdAssert("OpenAmt", actual.getOpenAmt(), expected);
		return myself;
	}


	public C_DunningRunLineAssert isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_DunningRunLineAssert isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_DunningRunLineAssert hasTimesDunned(int expected)
	{
		isNotNull();
		int actualField = actual.getTimesDunned();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have TimesDunned: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DunningRunLineAssert hasTotalAmt(Object expected)
	{
		isNotNull();
		bdAssert("TotalAmt", actual.getTotalAmt(), expected);
		return myself;
	}

}