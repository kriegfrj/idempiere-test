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
import org.compiere.model.X_C_InvoiceSchedule;

/** Generated assertion class for C_InvoiceSchedule
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_InvoiceScheduleAssert
	extends AbstractPOAssert<C_InvoiceScheduleAssert,X_C_InvoiceSchedule>
{

    /** Standard Constructor */
    public C_InvoiceScheduleAssert (X_C_InvoiceSchedule actual)
    {
      super (actual, C_InvoiceScheduleAssert.class);
    }


	public C_InvoiceScheduleAssert hasAmt(Object expected)
	{
		isNotNull();
		bdAssert("Amt", actual.getAmt(), expected);
		return myself;
	}


	public C_InvoiceScheduleAssert hasC_InvoiceSchedule_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_InvoiceSchedule_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_InvoiceSchedule_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_InvoiceScheduleAssert hasC_InvoiceSchedule_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_InvoiceSchedule_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_InvoiceSchedule_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_InvoiceScheduleAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_InvoiceScheduleAssert isEvenInvoiceWeek()
	{
		isNotNull();
		if (!actual.isEvenInvoiceWeek()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be EvenInvoiceWeek\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_InvoiceScheduleAssert isNotEvenInvoiceWeek()
	{
		isNotNull();
		if (actual.isEvenInvoiceWeek()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be EvenInvoiceWeek\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_InvoiceScheduleAssert hasInvoiceDay(int expected)
	{
		isNotNull();
		int actualField = actual.getInvoiceDay();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have InvoiceDay: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_InvoiceScheduleAssert hasInvoiceDayCutoff(int expected)
	{
		isNotNull();
		int actualField = actual.getInvoiceDayCutoff();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have InvoiceDayCutoff: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_InvoiceScheduleAssert hasInvoiceFrequency(String expected)
	{
		isNotNull();
		String actualField = actual.getInvoiceFrequency();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have InvoiceFrequency: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_InvoiceScheduleAssert hasInvoiceWeekDay(String expected)
	{
		isNotNull();
		String actualField = actual.getInvoiceWeekDay();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have InvoiceWeekDay: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_InvoiceScheduleAssert hasInvoiceWeekDayCutoff(String expected)
	{
		isNotNull();
		String actualField = actual.getInvoiceWeekDayCutoff();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have InvoiceWeekDayCutoff: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_InvoiceScheduleAssert isAmount()
	{
		isNotNull();
		if (!actual.isAmount()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Amount\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_InvoiceScheduleAssert isNotAmount()
	{
		isNotNull();
		if (actual.isAmount()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Amount\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_InvoiceScheduleAssert isDefault()
	{
		isNotNull();
		if (!actual.isDefault()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Default\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_InvoiceScheduleAssert isNotDefault()
	{
		isNotNull();
		if (actual.isDefault()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Default\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_InvoiceScheduleAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}