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
import org.compiere.model.X_C_ElementValue;

/** Generated assertion class for C_ElementValue
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_ElementValueAssert
	extends AbstractPOAssert<C_ElementValueAssert,X_C_ElementValue>
{

    /** Standard Constructor */
    public C_ElementValueAssert (X_C_ElementValue actual)
    {
      super (actual, C_ElementValueAssert.class);
    }


	public C_ElementValueAssert hasAccountSign(String expected)
	{
		isNotNull();
		String actualField = actual.getAccountSign();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AccountSign: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_ElementValueAssert hasAccountType(String expected)
	{
		isNotNull();
		String actualField = actual.getAccountType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AccountType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_ElementValueAssert hasBPartnerType(String expected)
	{
		isNotNull();
		String actualField = actual.getBPartnerType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have BPartnerType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_ElementValueAssert hasC_BankAccount_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BankAccount_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BankAccount_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_ElementValueAssert hasC_Currency_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Currency_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Currency_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_ElementValueAssert hasC_Element_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Element_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Element_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_ElementValueAssert hasC_ElementValue_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ElementValue_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_ElementValue_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_ElementValueAssert hasC_ElementValue_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_ElementValue_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_ElementValue_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_ElementValueAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_ElementValueAssert isBankAccount()
	{
		isNotNull();
		if (!actual.isBankAccount()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be BankAccount\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_ElementValueAssert isNotBankAccount()
	{
		isNotNull();
		if (actual.isBankAccount()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be BankAccount\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_ElementValueAssert isDetailBPartner()
	{
		isNotNull();
		if (!actual.isDetailBPartner()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DetailBPartner\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_ElementValueAssert isNotDetailBPartner()
	{
		isNotNull();
		if (actual.isDetailBPartner()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DetailBPartner\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_ElementValueAssert isDetailProduct()
	{
		isNotNull();
		if (!actual.isDetailProduct()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DetailProduct\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_ElementValueAssert isNotDetailProduct()
	{
		isNotNull();
		if (actual.isDetailProduct()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DetailProduct\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_ElementValueAssert isDocControlled()
	{
		isNotNull();
		if (!actual.isDocControlled()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DocControlled\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_ElementValueAssert isNotDocControlled()
	{
		isNotNull();
		if (actual.isDocControlled()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DocControlled\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_ElementValueAssert isForeignCurrency()
	{
		isNotNull();
		if (!actual.isForeignCurrency()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ForeignCurrency\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_ElementValueAssert isNotForeignCurrency()
	{
		isNotNull();
		if (actual.isForeignCurrency()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ForeignCurrency\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_ElementValueAssert isSummary()
	{
		isNotNull();
		if (!actual.isSummary()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Summary\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_ElementValueAssert isNotSummary()
	{
		isNotNull();
		if (actual.isSummary()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Summary\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_ElementValueAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_ElementValueAssert isPostActual()
	{
		isNotNull();
		if (!actual.isPostActual()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PostActual\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_ElementValueAssert isNotPostActual()
	{
		isNotNull();
		if (actual.isPostActual()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PostActual\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_ElementValueAssert isPostBudget()
	{
		isNotNull();
		if (!actual.isPostBudget()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PostBudget\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_ElementValueAssert isNotPostBudget()
	{
		isNotNull();
		if (actual.isPostBudget()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PostBudget\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_ElementValueAssert isPostEncumbrance()
	{
		isNotNull();
		if (!actual.isPostEncumbrance()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PostEncumbrance\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_ElementValueAssert isNotPostEncumbrance()
	{
		isNotNull();
		if (actual.isPostEncumbrance()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PostEncumbrance\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_ElementValueAssert isPostStatistical()
	{
		isNotNull();
		if (!actual.isPostStatistical()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PostStatistical\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_ElementValueAssert isNotPostStatistical()
	{
		isNotNull();
		if (actual.isPostStatistical()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PostStatistical\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_ElementValueAssert hasValidFrom(Object expected)
	{
		isNotNull();
		dateAssert("ValidFrom", actual.getValidFrom(), expected);
		return myself;
	}


	public C_ElementValueAssert hasValidTo(Object expected)
	{
		isNotNull();
		dateAssert("ValidTo", actual.getValidTo(), expected);
		return myself;
	}


	public C_ElementValueAssert hasValue(String expected)
	{
		isNotNull();
		String actualField = actual.getValue();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Value: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}