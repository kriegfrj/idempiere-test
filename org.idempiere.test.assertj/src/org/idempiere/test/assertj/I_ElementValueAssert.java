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
import org.compiere.model.X_I_ElementValue;

/** Generated assertion class for I_ElementValue
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class I_ElementValueAssert
	extends AbstractPOAssert<I_ElementValueAssert,X_I_ElementValue>
{

    /** Standard Constructor */
    public I_ElementValueAssert (X_I_ElementValue actual)
    {
      super (actual, I_ElementValueAssert.class);
    }


	public I_ElementValueAssert hasAccountSign(String expected)
	{
		isNotNull();
		String actualField = actual.getAccountSign();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AccountSign: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_ElementValueAssert hasAccountType(String expected)
	{
		isNotNull();
		String actualField = actual.getAccountType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AccountType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_ElementValueAssert hasAD_Column_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Column_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Column_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_ElementValueAssert hasC_Element_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Element_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Element_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_ElementValueAssert hasC_ElementValue_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ElementValue_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_ElementValue_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_ElementValueAssert hasDefault_Account(String expected)
	{
		isNotNull();
		String actualField = actual.getDefault_Account();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Default_Account: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_ElementValueAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_ElementValueAssert hasElementName(String expected)
	{
		isNotNull();
		String actualField = actual.getElementName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ElementName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_ElementValueAssert hasI_ElementValue_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getI_ElementValue_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have I_ElementValue_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_ElementValueAssert hasI_ElementValue_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getI_ElementValue_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have I_ElementValue_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_ElementValueAssert hasI_ErrorMsg(String expected)
	{
		isNotNull();
		String actualField = actual.getI_ErrorMsg();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have I_ErrorMsg: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_ElementValueAssert isI_IsImported()
	{
		isNotNull();
		if (!actual.isI_IsImported()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be I_IsImported\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public I_ElementValueAssert isNotI_IsImported()
	{
		isNotNull();
		if (actual.isI_IsImported()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be I_IsImported\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public I_ElementValueAssert isDocControlled()
	{
		isNotNull();
		if (!actual.isDocControlled()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DocControlled\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public I_ElementValueAssert isNotDocControlled()
	{
		isNotNull();
		if (actual.isDocControlled()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DocControlled\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public I_ElementValueAssert isSummary()
	{
		isNotNull();
		if (!actual.isSummary()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Summary\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public I_ElementValueAssert isNotSummary()
	{
		isNotNull();
		if (actual.isSummary()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Summary\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public I_ElementValueAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_ElementValueAssert hasParentElementValue_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getParentElementValue_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ParentElementValue_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_ElementValueAssert hasParentValue(String expected)
	{
		isNotNull();
		String actualField = actual.getParentValue();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ParentValue: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_ElementValueAssert isPostActual()
	{
		isNotNull();
		if (!actual.isPostActual()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PostActual\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public I_ElementValueAssert isNotPostActual()
	{
		isNotNull();
		if (actual.isPostActual()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PostActual\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public I_ElementValueAssert isPostBudget()
	{
		isNotNull();
		if (!actual.isPostBudget()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PostBudget\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public I_ElementValueAssert isNotPostBudget()
	{
		isNotNull();
		if (actual.isPostBudget()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PostBudget\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public I_ElementValueAssert isPostEncumbrance()
	{
		isNotNull();
		if (!actual.isPostEncumbrance()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PostEncumbrance\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public I_ElementValueAssert isNotPostEncumbrance()
	{
		isNotNull();
		if (actual.isPostEncumbrance()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PostEncumbrance\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public I_ElementValueAssert isPostStatistical()
	{
		isNotNull();
		if (!actual.isPostStatistical()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PostStatistical\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public I_ElementValueAssert isNotPostStatistical()
	{
		isNotNull();
		if (actual.isPostStatistical()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PostStatistical\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public I_ElementValueAssert isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public I_ElementValueAssert isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public I_ElementValueAssert hasValue(String expected)
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