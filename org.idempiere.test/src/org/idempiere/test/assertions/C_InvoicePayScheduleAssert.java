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
import org.compiere.model.X_C_InvoicePaySchedule;

/** Generated assertion class for C_InvoicePaySchedule
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_InvoicePayScheduleAssert
	extends AbstractPOAssert<C_InvoicePayScheduleAssert,X_C_InvoicePaySchedule>
{

    /** Standard Constructor */
    public C_InvoicePayScheduleAssert (X_C_InvoicePaySchedule actual)
    {
      super (actual, C_InvoicePayScheduleAssert.class);
    }


	public C_InvoicePayScheduleAssert hasC_Invoice_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Invoice_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Invoice_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_InvoicePayScheduleAssert hasC_InvoicePaySchedule_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_InvoicePaySchedule_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_InvoicePaySchedule_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_InvoicePayScheduleAssert hasC_InvoicePaySchedule_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_InvoicePaySchedule_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_InvoicePaySchedule_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_InvoicePayScheduleAssert hasC_PaySchedule_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_PaySchedule_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_PaySchedule_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_InvoicePayScheduleAssert hasDiscountAmt(Object expected)
	{
		isNotNull();
		bdAssert("DiscountAmt", actual.getDiscountAmt(), expected);
		return myself;
	}


	public C_InvoicePayScheduleAssert hasDiscountDate(Object expected)
	{
		isNotNull();
		dateAssert("DiscountDate", actual.getDiscountDate(), expected);
		return myself;
	}


	public C_InvoicePayScheduleAssert hasDueAmt(Object expected)
	{
		isNotNull();
		bdAssert("DueAmt", actual.getDueAmt(), expected);
		return myself;
	}


	public C_InvoicePayScheduleAssert hasDueDate(Object expected)
	{
		isNotNull();
		dateAssert("DueDate", actual.getDueDate(), expected);
		return myself;
	}


	public C_InvoicePayScheduleAssert isValid()
	{
		isNotNull();
		if (!actual.isValid()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Valid\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_InvoicePayScheduleAssert isNotValid()
	{
		isNotNull();
		if (actual.isValid()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Valid\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_InvoicePayScheduleAssert isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_InvoicePayScheduleAssert isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}
}