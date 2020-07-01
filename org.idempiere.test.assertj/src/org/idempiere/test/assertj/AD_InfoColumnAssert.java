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
import org.compiere.model.X_AD_InfoColumn;

/** Generated assertion class for AD_InfoColumn
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_InfoColumnAssert
	extends AbstractPOAssert<AD_InfoColumnAssert,X_AD_InfoColumn>
{

    /** Standard Constructor */
    public AD_InfoColumnAssert (X_AD_InfoColumn actual)
    {
      super (actual, AD_InfoColumnAssert.class);
    }


	public AD_InfoColumnAssert hasAD_Element_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Element_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Element_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_InfoColumnAssert hasAD_InfoColumn_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_InfoColumn_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_InfoColumn_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_InfoColumnAssert hasAD_InfoColumn_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_InfoColumn_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_InfoColumn_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_InfoColumnAssert hasAD_InfoWindow_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_InfoWindow_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_InfoWindow_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_InfoColumnAssert hasAD_Reference_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Reference_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Reference_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_InfoColumnAssert hasAD_Reference_Value_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Reference_Value_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Reference_Value_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_InfoColumnAssert hasAD_Val_Rule_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Val_Rule_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Val_Rule_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_InfoColumnAssert hasColumnName(String expected)
	{
		isNotNull();
		String actualField = actual.getColumnName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ColumnName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_InfoColumnAssert hasDefaultValue(String expected)
	{
		isNotNull();
		String actualField = actual.getDefaultValue();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DefaultValue: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_InfoColumnAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_InfoColumnAssert hasDisplayLogic(String expected)
	{
		isNotNull();
		String actualField = actual.getDisplayLogic();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DisplayLogic: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_InfoColumnAssert hasEntityType(String expected)
	{
		isNotNull();
		String actualField = actual.getEntityType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have EntityType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_InfoColumnAssert hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_InfoColumnAssert hasInputFieldValidation(String expected)
	{
		isNotNull();
		String actualField = actual.getInputFieldValidation();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have InputFieldValidation: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_InfoColumnAssert isCentrallyMaintained()
	{
		isNotNull();
		if (!actual.isCentrallyMaintained()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CentrallyMaintained\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_InfoColumnAssert isNotCentrallyMaintained()
	{
		isNotNull();
		if (actual.isCentrallyMaintained()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CentrallyMaintained\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_InfoColumnAssert isDisplayed()
	{
		isNotNull();
		if (!actual.isDisplayed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Displayed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_InfoColumnAssert isNotDisplayed()
	{
		isNotNull();
		if (actual.isDisplayed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Displayed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_InfoColumnAssert isIdentifier()
	{
		isNotNull();
		if (!actual.isIdentifier()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Identifier\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_InfoColumnAssert isNotIdentifier()
	{
		isNotNull();
		if (actual.isIdentifier()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Identifier\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_InfoColumnAssert isKey()
	{
		isNotNull();
		if (!actual.isKey()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Key\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_InfoColumnAssert isNotKey()
	{
		isNotNull();
		if (actual.isKey()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Key\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_InfoColumnAssert isMandatory()
	{
		isNotNull();
		if (!actual.isMandatory()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Mandatory\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_InfoColumnAssert isNotMandatory()
	{
		isNotNull();
		if (actual.isMandatory()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Mandatory\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_InfoColumnAssert isQueryCriteria()
	{
		isNotNull();
		if (!actual.isQueryCriteria()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be QueryCriteria\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_InfoColumnAssert isNotQueryCriteria()
	{
		isNotNull();
		if (actual.isQueryCriteria()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be QueryCriteria\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_InfoColumnAssert isReadOnly()
	{
		isNotNull();
		if (!actual.isReadOnly()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ReadOnly\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_InfoColumnAssert isNotReadOnly()
	{
		isNotNull();
		if (actual.isReadOnly()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ReadOnly\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_InfoColumnAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_InfoColumnAssert hasPlaceholder(String expected)
	{
		isNotNull();
		String actualField = actual.getPlaceholder();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Placeholder: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_InfoColumnAssert hasQueryFunction(String expected)
	{
		isNotNull();
		String actualField = actual.getQueryFunction();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have QueryFunction: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_InfoColumnAssert hasQueryOperator(String expected)
	{
		isNotNull();
		String actualField = actual.getQueryOperator();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have QueryOperator: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_InfoColumnAssert hasSelectClause(String expected)
	{
		isNotNull();
		String actualField = actual.getSelectClause();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have SelectClause: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_InfoColumnAssert hasSeqNo(int expected)
	{
		isNotNull();
		int actualField = actual.getSeqNo();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have SeqNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_InfoColumnAssert hasSeqNoSelection(int expected)
	{
		isNotNull();
		int actualField = actual.getSeqNoSelection();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have SeqNoSelection: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}