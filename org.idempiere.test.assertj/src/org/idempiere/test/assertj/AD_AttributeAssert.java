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
import org.compiere.model.X_AD_Attribute;

/** Generated assertion class for AD_Attribute
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_AttributeAssert
	extends AbstractPOAssert<AD_AttributeAssert,X_AD_Attribute>
{

    /** Standard Constructor */
    public AD_AttributeAssert (X_AD_Attribute actual)
    {
      super (actual, AD_AttributeAssert.class);
    }


	public AD_AttributeAssert hasAD_Attribute_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Attribute_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Attribute_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_AttributeAssert hasAD_Attribute_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Attribute_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Attribute_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_AttributeAssert hasAD_Reference_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Reference_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Reference_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_AttributeAssert hasAD_Reference_Value_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Reference_Value_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Reference_Value_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_AttributeAssert hasAD_Table_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Table_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Table_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_AttributeAssert hasAD_Val_Rule_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Val_Rule_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Val_Rule_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_AttributeAssert hasCallout(String expected)
	{
		isNotNull();
		String actualField = actual.getCallout();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Callout: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_AttributeAssert hasDefaultValue(String expected)
	{
		isNotNull();
		String actualField = actual.getDefaultValue();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DefaultValue: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_AttributeAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_AttributeAssert hasDisplayLength(int expected)
	{
		isNotNull();
		int actualField = actual.getDisplayLength();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DisplayLength: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_AttributeAssert hasDisplayLogic(String expected)
	{
		isNotNull();
		String actualField = actual.getDisplayLogic();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DisplayLogic: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_AttributeAssert hasFieldLength(int expected)
	{
		isNotNull();
		int actualField = actual.getFieldLength();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have FieldLength: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_AttributeAssert hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_AttributeAssert isEncrypted()
	{
		isNotNull();
		if (!actual.isEncrypted()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Encrypted\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_AttributeAssert isNotEncrypted()
	{
		isNotNull();
		if (actual.isEncrypted()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Encrypted\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_AttributeAssert isFieldOnly()
	{
		isNotNull();
		if (!actual.isFieldOnly()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be FieldOnly\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_AttributeAssert isNotFieldOnly()
	{
		isNotNull();
		if (actual.isFieldOnly()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be FieldOnly\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_AttributeAssert isHeading()
	{
		isNotNull();
		if (!actual.isHeading()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Heading\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_AttributeAssert isNotHeading()
	{
		isNotNull();
		if (actual.isHeading()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Heading\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_AttributeAssert isMandatory()
	{
		isNotNull();
		if (!actual.isMandatory()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Mandatory\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_AttributeAssert isNotMandatory()
	{
		isNotNull();
		if (actual.isMandatory()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Mandatory\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_AttributeAssert isReadOnly()
	{
		isNotNull();
		if (!actual.isReadOnly()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ReadOnly\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_AttributeAssert isNotReadOnly()
	{
		isNotNull();
		if (actual.isReadOnly()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ReadOnly\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_AttributeAssert isSameLine()
	{
		isNotNull();
		if (!actual.isSameLine()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SameLine\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_AttributeAssert isNotSameLine()
	{
		isNotNull();
		if (actual.isSameLine()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SameLine\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_AttributeAssert isUpdateable()
	{
		isNotNull();
		if (!actual.isUpdateable()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Updateable\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_AttributeAssert isNotUpdateable()
	{
		isNotNull();
		if (actual.isUpdateable()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Updateable\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_AttributeAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_AttributeAssert hasSeqNo(int expected)
	{
		isNotNull();
		int actualField = actual.getSeqNo();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have SeqNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_AttributeAssert hasValueMax(String expected)
	{
		isNotNull();
		String actualField = actual.getValueMax();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ValueMax: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_AttributeAssert hasValueMin(String expected)
	{
		isNotNull();
		String actualField = actual.getValueMin();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ValueMin: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_AttributeAssert hasVFormat(String expected)
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