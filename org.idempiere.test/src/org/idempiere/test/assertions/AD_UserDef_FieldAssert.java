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
import org.compiere.model.X_AD_UserDef_Field;

/** Generated assertion class for AD_UserDef_Field
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_UserDef_FieldAssert
	extends AbstractPOAssert<AD_UserDef_FieldAssert,X_AD_UserDef_Field>
{

    /** Standard Constructor */
    public AD_UserDef_FieldAssert (X_AD_UserDef_Field actual)
    {
      super (actual, AD_UserDef_FieldAssert.class);
    }


	public AD_UserDef_FieldAssert hasAD_Field_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Field_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Field_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserDef_FieldAssert hasAD_FieldStyle_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_FieldStyle_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_FieldStyle_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserDef_FieldAssert hasAD_LabelStyle_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_LabelStyle_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_LabelStyle_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserDef_FieldAssert hasAD_Reference_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Reference_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Reference_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserDef_FieldAssert hasAD_Reference_Value_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Reference_Value_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Reference_Value_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserDef_FieldAssert hasAD_UserDef_Field_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_UserDef_Field_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_UserDef_Field_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserDef_FieldAssert hasAD_UserDef_Field_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_UserDef_Field_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_UserDef_Field_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserDef_FieldAssert hasAD_UserDef_Tab_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_UserDef_Tab_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_UserDef_Tab_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserDef_FieldAssert hasAD_Val_Rule_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Val_Rule_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Val_Rule_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserDef_FieldAssert hasColumnSpan(int expected)
	{
		isNotNull();
		int actualField = actual.getColumnSpan();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ColumnSpan: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserDef_FieldAssert hasDefaultValue(String expected)
	{
		isNotNull();
		String actualField = actual.getDefaultValue();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DefaultValue: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserDef_FieldAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserDef_FieldAssert hasDisplayLength(int expected)
	{
		isNotNull();
		int actualField = actual.getDisplayLength();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DisplayLength: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserDef_FieldAssert hasDisplayLogic(String expected)
	{
		isNotNull();
		String actualField = actual.getDisplayLogic();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DisplayLogic: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserDef_FieldAssert hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserDef_FieldAssert hasIsAlwaysUpdateable(String expected)
	{
		isNotNull();
		String actualField = actual.getIsAlwaysUpdateable();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have IsAlwaysUpdateable: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserDef_FieldAssert hasIsDisplayed(String expected)
	{
		isNotNull();
		String actualField = actual.getIsDisplayed();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have IsDisplayed: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserDef_FieldAssert hasIsMandatory(String expected)
	{
		isNotNull();
		String actualField = actual.getIsMandatory();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have IsMandatory: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserDef_FieldAssert hasIsReadOnly(String expected)
	{
		isNotNull();
		String actualField = actual.getIsReadOnly();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have IsReadOnly: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserDef_FieldAssert hasIsSameLine(String expected)
	{
		isNotNull();
		String actualField = actual.getIsSameLine();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have IsSameLine: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserDef_FieldAssert hasIsToolbarButton(String expected)
	{
		isNotNull();
		String actualField = actual.getIsToolbarButton();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have IsToolbarButton: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserDef_FieldAssert hasIsUpdateable(String expected)
	{
		isNotNull();
		String actualField = actual.getIsUpdateable();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have IsUpdateable: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserDef_FieldAssert hasMandatoryLogic(String expected)
	{
		isNotNull();
		String actualField = actual.getMandatoryLogic();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have MandatoryLogic: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserDef_FieldAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserDef_FieldAssert hasNumLines(int expected)
	{
		isNotNull();
		int actualField = actual.getNumLines();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have NumLines: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserDef_FieldAssert hasPA_DashboardContent_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPA_DashboardContent_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PA_DashboardContent_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserDef_FieldAssert hasPlaceholder(String expected)
	{
		isNotNull();
		String actualField = actual.getPlaceholder();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Placeholder: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserDef_FieldAssert hasReadOnlyLogic(String expected)
	{
		isNotNull();
		String actualField = actual.getReadOnlyLogic();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ReadOnlyLogic: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserDef_FieldAssert hasSeqNo(int expected)
	{
		isNotNull();
		int actualField = actual.getSeqNo();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SeqNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserDef_FieldAssert hasSortNo(int expected)
	{
		isNotNull();
		int actualField = actual.getSortNo();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SortNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserDef_FieldAssert hasVFormat(String expected)
	{
		isNotNull();
		String actualField = actual.getVFormat();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have VFormat: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserDef_FieldAssert hasXPosition(int expected)
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