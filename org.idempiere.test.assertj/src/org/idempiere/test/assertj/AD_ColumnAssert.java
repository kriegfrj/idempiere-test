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
import org.compiere.model.X_AD_Column;

/** Generated assertion class for AD_Column
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_ColumnAssert
	extends AbstractPOAssert<AD_ColumnAssert,X_AD_Column>
{

    /** Standard Constructor */
    public AD_ColumnAssert (X_AD_Column actual)
    {
      super (actual, AD_ColumnAssert.class);
    }


	public AD_ColumnAssert hasAD_Chart_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Chart_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Chart_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColumnAssert hasAD_Column_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Column_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Column_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColumnAssert hasAD_Column_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Column_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Column_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColumnAssert hasAD_Element_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Element_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Element_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColumnAssert hasAD_Process_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Process_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Process_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColumnAssert hasAD_Reference_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Reference_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Reference_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColumnAssert hasAD_Reference_Value_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Reference_Value_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Reference_Value_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColumnAssert hasAD_Table_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Table_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Table_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColumnAssert hasAD_Val_Rule_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Val_Rule_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Val_Rule_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColumnAssert hasCallout(String expected)
	{
		isNotNull();
		String actualField = actual.getCallout();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Callout: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColumnAssert hasColumnName(String expected)
	{
		isNotNull();
		String actualField = actual.getColumnName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ColumnName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColumnAssert hasColumnSQL(String expected)
	{
		isNotNull();
		String actualField = actual.getColumnSQL();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ColumnSQL: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColumnAssert hasDefaultValue(String expected)
	{
		isNotNull();
		String actualField = actual.getDefaultValue();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DefaultValue: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColumnAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColumnAssert hasEntityType(String expected)
	{
		isNotNull();
		String actualField = actual.getEntityType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have EntityType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColumnAssert hasFieldLength(int expected)
	{
		isNotNull();
		int actualField = actual.getFieldLength();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have FieldLength: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColumnAssert hasFKConstraintName(String expected)
	{
		isNotNull();
		String actualField = actual.getFKConstraintName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have FKConstraintName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColumnAssert hasFKConstraintType(String expected)
	{
		isNotNull();
		String actualField = actual.getFKConstraintType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have FKConstraintType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColumnAssert hasFormatPattern(String expected)
	{
		isNotNull();
		String actualField = actual.getFormatPattern();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have FormatPattern: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColumnAssert hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColumnAssert isAllowCopy()
	{
		isNotNull();
		if (!actual.isAllowCopy()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AllowCopy\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_ColumnAssert isNotAllowCopy()
	{
		isNotNull();
		if (actual.isAllowCopy()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AllowCopy\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_ColumnAssert isAllowLogging()
	{
		isNotNull();
		if (!actual.isAllowLogging()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AllowLogging\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_ColumnAssert isNotAllowLogging()
	{
		isNotNull();
		if (actual.isAllowLogging()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AllowLogging\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_ColumnAssert isAlwaysUpdateable()
	{
		isNotNull();
		if (!actual.isAlwaysUpdateable()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AlwaysUpdateable\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_ColumnAssert isNotAlwaysUpdateable()
	{
		isNotNull();
		if (actual.isAlwaysUpdateable()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AlwaysUpdateable\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_ColumnAssert isAutocomplete()
	{
		isNotNull();
		if (!actual.isAutocomplete()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Autocomplete\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_ColumnAssert isNotAutocomplete()
	{
		isNotNull();
		if (actual.isAutocomplete()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Autocomplete\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_ColumnAssert isHtml()
	{
		isNotNull();
		if (!actual.isHtml()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Html\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_ColumnAssert isNotHtml()
	{
		isNotNull();
		if (actual.isHtml()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Html\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_ColumnAssert isIdentifier()
	{
		isNotNull();
		if (!actual.isIdentifier()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Identifier\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_ColumnAssert isNotIdentifier()
	{
		isNotNull();
		if (actual.isIdentifier()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Identifier\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_ColumnAssert isKey()
	{
		isNotNull();
		if (!actual.isKey()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Key\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_ColumnAssert isNotKey()
	{
		isNotNull();
		if (actual.isKey()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Key\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_ColumnAssert isMandatory()
	{
		isNotNull();
		if (!actual.isMandatory()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Mandatory\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_ColumnAssert isNotMandatory()
	{
		isNotNull();
		if (actual.isMandatory()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Mandatory\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_ColumnAssert isParent()
	{
		isNotNull();
		if (!actual.isParent()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Parent\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_ColumnAssert isNotParent()
	{
		isNotNull();
		if (actual.isParent()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Parent\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_ColumnAssert isSecure()
	{
		isNotNull();
		if (!actual.isSecure()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Secure\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_ColumnAssert isNotSecure()
	{
		isNotNull();
		if (actual.isSecure()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Secure\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_ColumnAssert isSelectionColumn()
	{
		isNotNull();
		if (!actual.isSelectionColumn()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SelectionColumn\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_ColumnAssert isNotSelectionColumn()
	{
		isNotNull();
		if (actual.isSelectionColumn()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SelectionColumn\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_ColumnAssert hasIsToolbarButton(String expected)
	{
		isNotNull();
		String actualField = actual.getIsToolbarButton();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have IsToolbarButton: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColumnAssert isTranslated()
	{
		isNotNull();
		if (!actual.isTranslated()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Translated\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_ColumnAssert isNotTranslated()
	{
		isNotNull();
		if (actual.isTranslated()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Translated\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_ColumnAssert isUpdateable()
	{
		isNotNull();
		if (!actual.isUpdateable()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Updateable\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_ColumnAssert isNotUpdateable()
	{
		isNotNull();
		if (actual.isUpdateable()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Updateable\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_ColumnAssert hasMandatoryLogic(String expected)
	{
		isNotNull();
		String actualField = actual.getMandatoryLogic();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have MandatoryLogic: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColumnAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColumnAssert hasPA_DashboardContent_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPA_DashboardContent_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PA_DashboardContent_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColumnAssert hasPlaceholder(String expected)
	{
		isNotNull();
		String actualField = actual.getPlaceholder();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Placeholder: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColumnAssert hasReadOnlyLogic(String expected)
	{
		isNotNull();
		String actualField = actual.getReadOnlyLogic();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ReadOnlyLogic: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColumnAssert hasSeqNo(int expected)
	{
		isNotNull();
		int actualField = actual.getSeqNo();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have SeqNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColumnAssert hasSeqNoSelection(int expected)
	{
		isNotNull();
		int actualField = actual.getSeqNoSelection();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have SeqNoSelection: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColumnAssert hasValueMax(String expected)
	{
		isNotNull();
		String actualField = actual.getValueMax();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ValueMax: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColumnAssert hasValueMin(String expected)
	{
		isNotNull();
		String actualField = actual.getValueMin();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ValueMin: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColumnAssert hasVersion(Object expected)
	{
		isNotNull();
		bdAssert("Version", actual.getVersion(), expected);
		return myself;
	}


	public AD_ColumnAssert hasVFormat(String expected)
	{
		isNotNull();
		String actualField = actual.getVFormat();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have VFormat: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}