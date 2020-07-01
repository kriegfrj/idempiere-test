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
import org.compiere.model.X_C_PaymentTerm;

/** Generated assertion class for C_PaymentTerm
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_PaymentTermAssert
	extends AbstractPOAssert<C_PaymentTermAssert,X_C_PaymentTerm>
{

    /** Standard Constructor */
    public C_PaymentTermAssert (X_C_PaymentTerm actual)
    {
      super (actual, C_PaymentTermAssert.class);
    }


	public C_PaymentTermAssert isAfterDelivery()
	{
		isNotNull();
		if (!actual.isAfterDelivery()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AfterDelivery\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentTermAssert isNotAfterDelivery()
	{
		isNotNull();
		if (actual.isAfterDelivery()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AfterDelivery\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentTermAssert hasC_PaymentTerm_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_PaymentTerm_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_PaymentTerm_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTermAssert hasC_PaymentTerm_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_PaymentTerm_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_PaymentTerm_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTermAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTermAssert hasDiscount(Object expected)
	{
		isNotNull();
		bdAssert("Discount", actual.getDiscount(), expected);
		return myself;
	}


	public C_PaymentTermAssert hasDiscount2(Object expected)
	{
		isNotNull();
		bdAssert("Discount2", actual.getDiscount2(), expected);
		return myself;
	}


	public C_PaymentTermAssert hasDiscountDays(int expected)
	{
		isNotNull();
		int actualField = actual.getDiscountDays();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DiscountDays: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTermAssert hasDiscountDays2(int expected)
	{
		isNotNull();
		int actualField = actual.getDiscountDays2();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DiscountDays2: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTermAssert hasDocumentNote(String expected)
	{
		isNotNull();
		String actualField = actual.getDocumentNote();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DocumentNote: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTermAssert hasFixMonthCutoff(int expected)
	{
		isNotNull();
		int actualField = actual.getFixMonthCutoff();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have FixMonthCutoff: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTermAssert hasFixMonthDay(int expected)
	{
		isNotNull();
		int actualField = actual.getFixMonthDay();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have FixMonthDay: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTermAssert hasFixMonthOffset(int expected)
	{
		isNotNull();
		int actualField = actual.getFixMonthOffset();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have FixMonthOffset: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTermAssert hasGraceDays(int expected)
	{
		isNotNull();
		int actualField = actual.getGraceDays();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have GraceDays: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTermAssert isDefault()
	{
		isNotNull();
		if (!actual.isDefault()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Default\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentTermAssert isNotDefault()
	{
		isNotNull();
		if (actual.isDefault()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Default\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentTermAssert isDueFixed()
	{
		isNotNull();
		if (!actual.isDueFixed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DueFixed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentTermAssert isNotDueFixed()
	{
		isNotNull();
		if (actual.isDueFixed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DueFixed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentTermAssert isNextBusinessDay()
	{
		isNotNull();
		if (!actual.isNextBusinessDay()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be NextBusinessDay\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentTermAssert isNotNextBusinessDay()
	{
		isNotNull();
		if (actual.isNextBusinessDay()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be NextBusinessDay\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentTermAssert isValid()
	{
		isNotNull();
		if (!actual.isValid()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Valid\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentTermAssert isNotValid()
	{
		isNotNull();
		if (actual.isValid()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Valid\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_PaymentTermAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTermAssert hasNetDay(String expected)
	{
		isNotNull();
		String actualField = actual.getNetDay();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have NetDay: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTermAssert hasNetDays(int expected)
	{
		isNotNull();
		int actualField = actual.getNetDays();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have NetDays: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTermAssert hasPaymentTermUsage(String expected)
	{
		isNotNull();
		String actualField = actual.getPaymentTermUsage();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PaymentTermUsage: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentTermAssert hasValue(String expected)
	{
		isNotNull();
		String actualField = actual.getValue();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Value: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}