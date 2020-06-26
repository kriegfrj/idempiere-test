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
import org.compiere.model.X_AD_Field;

/** Generated assertion class for AD_Field
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_FieldAssert
	extends AbstractPOAssert<AD_FieldAssert,X_AD_Field>
{

    /** Standard Constructor */
    public AD_FieldAssert (X_AD_Field actual)
    {
      super (actual, AD_FieldAssert.class);
    }


	public AD_FieldAssert hasAD_Column_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Column_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Column_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_FieldAssert hasAD_Field_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Field_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Field_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_FieldAssert hasAD_Field_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Field_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Field_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_FieldAssert hasAD_FieldGroup_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_FieldGroup_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_FieldGroup_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_FieldAssert hasAD_FieldStyle_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_FieldStyle_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_FieldStyle_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_FieldAssert hasAD_LabelStyle_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_LabelStyle_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_LabelStyle_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_FieldAssert hasAD_Reference_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Reference_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Reference_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_FieldAssert hasAD_Reference_Value_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Reference_Value_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Reference_Value_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_FieldAssert hasAD_Tab_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Tab_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Tab_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_FieldAssert hasAD_Val_Rule_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Val_Rule_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Val_Rule_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_FieldAssert hasColumnSpan(int expected)
	{
		isNotNull();
		int actualField = actual.getColumnSpan();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ColumnSpan: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_FieldAssert hasDefaultValue(String expected)
	{
		isNotNull();
		String actualField = actual.getDefaultValue();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DefaultValue: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_FieldAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_FieldAssert hasDisplayLength(int expected)
	{
		isNotNull();
		int actualField = actual.getDisplayLength();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DisplayLength: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_FieldAssert hasDisplayLogic(String expected)
	{
		isNotNull();
		String actualField = actual.getDisplayLogic();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DisplayLogic: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_FieldAssert hasEntityType(String expected)
	{
		isNotNull();
		String actualField = actual.getEntityType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have EntityType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_FieldAssert hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_FieldAssert hasIncluded_Tab_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getIncluded_Tab_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Included_Tab_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_FieldAssert isAdvancedField()
	{
		isNotNull();
		if (!actual.isAdvancedField()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AdvancedField\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_FieldAssert isNotAdvancedField()
	{
		isNotNull();
		if (actual.isAdvancedField()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AdvancedField\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_FieldAssert hasIsAllowCopy(String expected)
	{
		isNotNull();
		String actualField = actual.getIsAllowCopy();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have IsAllowCopy: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_FieldAssert hasIsAlwaysUpdateable(String expected)
	{
		isNotNull();
		String actualField = actual.getIsAlwaysUpdateable();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have IsAlwaysUpdateable: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_FieldAssert isCentrallyMaintained()
	{
		isNotNull();
		if (!actual.isCentrallyMaintained()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CentrallyMaintained\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_FieldAssert isNotCentrallyMaintained()
	{
		isNotNull();
		if (actual.isCentrallyMaintained()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CentrallyMaintained\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_FieldAssert isDefaultFocus()
	{
		isNotNull();
		if (!actual.isDefaultFocus()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DefaultFocus\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_FieldAssert isNotDefaultFocus()
	{
		isNotNull();
		if (actual.isDefaultFocus()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DefaultFocus\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_FieldAssert isDisplayed()
	{
		isNotNull();
		if (!actual.isDisplayed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Displayed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_FieldAssert isNotDisplayed()
	{
		isNotNull();
		if (actual.isDisplayed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Displayed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_FieldAssert isDisplayedGrid()
	{
		isNotNull();
		if (!actual.isDisplayedGrid()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DisplayedGrid\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_FieldAssert isNotDisplayedGrid()
	{
		isNotNull();
		if (actual.isDisplayedGrid()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DisplayedGrid\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_FieldAssert isEncrypted()
	{
		isNotNull();
		if (!actual.isEncrypted()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Encrypted\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_FieldAssert isNotEncrypted()
	{
		isNotNull();
		if (actual.isEncrypted()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Encrypted\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_FieldAssert isFieldOnly()
	{
		isNotNull();
		if (!actual.isFieldOnly()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be FieldOnly\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_FieldAssert isNotFieldOnly()
	{
		isNotNull();
		if (actual.isFieldOnly()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be FieldOnly\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_FieldAssert isHeading()
	{
		isNotNull();
		if (!actual.isHeading()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Heading\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_FieldAssert isNotHeading()
	{
		isNotNull();
		if (actual.isHeading()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Heading\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_FieldAssert hasIsMandatory(String expected)
	{
		isNotNull();
		String actualField = actual.getIsMandatory();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have IsMandatory: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_FieldAssert isQuickEntry()
	{
		isNotNull();
		if (!actual.isQuickEntry()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be QuickEntry\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_FieldAssert isNotQuickEntry()
	{
		isNotNull();
		if (actual.isQuickEntry()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be QuickEntry\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_FieldAssert isReadOnly()
	{
		isNotNull();
		if (!actual.isReadOnly()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ReadOnly\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_FieldAssert isNotReadOnly()
	{
		isNotNull();
		if (actual.isReadOnly()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ReadOnly\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_FieldAssert isSameLine()
	{
		isNotNull();
		if (!actual.isSameLine()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SameLine\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_FieldAssert isNotSameLine()
	{
		isNotNull();
		if (actual.isSameLine()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SameLine\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_FieldAssert hasIsToolbarButton(String expected)
	{
		isNotNull();
		String actualField = actual.getIsToolbarButton();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have IsToolbarButton: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_FieldAssert hasIsUpdateable(String expected)
	{
		isNotNull();
		String actualField = actual.getIsUpdateable();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have IsUpdateable: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_FieldAssert hasMandatoryLogic(String expected)
	{
		isNotNull();
		String actualField = actual.getMandatoryLogic();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have MandatoryLogic: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_FieldAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_FieldAssert hasNumLines(int expected)
	{
		isNotNull();
		int actualField = actual.getNumLines();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have NumLines: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_FieldAssert hasObscureType(String expected)
	{
		isNotNull();
		String actualField = actual.getObscureType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ObscureType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_FieldAssert hasPlaceholder(String expected)
	{
		isNotNull();
		String actualField = actual.getPlaceholder();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Placeholder: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_FieldAssert hasReadOnlyLogic(String expected)
	{
		isNotNull();
		String actualField = actual.getReadOnlyLogic();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ReadOnlyLogic: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_FieldAssert hasSeqNo(int expected)
	{
		isNotNull();
		int actualField = actual.getSeqNo();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SeqNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_FieldAssert hasSeqNoGrid(int expected)
	{
		isNotNull();
		int actualField = actual.getSeqNoGrid();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SeqNoGrid: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_FieldAssert hasSortNo(Object expected)
	{
		isNotNull();
		bdAssert("SortNo", actual.getSortNo(), expected);
		return myself;
	}


	public AD_FieldAssert hasVFormat(String expected)
	{
		isNotNull();
		String actualField = actual.getVFormat();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have VFormat: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_FieldAssert hasXPosition(int expected)
	{
		isNotNull();
		int actualField = actual.getXPosition();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have XPosition: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}