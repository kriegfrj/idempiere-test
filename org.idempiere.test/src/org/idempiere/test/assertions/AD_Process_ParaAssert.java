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
import org.compiere.model.X_AD_Process_Para;

/** Generated assertion class for AD_Process_Para
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_Process_ParaAssert
	extends AbstractPOAssert<AD_Process_ParaAssert,X_AD_Process_Para>
{

    /** Standard Constructor */
    public AD_Process_ParaAssert (X_AD_Process_Para actual)
    {
      super (actual, AD_Process_ParaAssert.class);
    }


	public AD_Process_ParaAssert hasAD_Element_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Element_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Element_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Process_ParaAssert hasAD_Process_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Process_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Process_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Process_ParaAssert hasAD_Process_Para_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Process_Para_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Process_Para_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Process_ParaAssert hasAD_Process_Para_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Process_Para_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Process_Para_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Process_ParaAssert hasAD_Reference_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Reference_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Reference_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Process_ParaAssert hasAD_Reference_Value_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Reference_Value_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Reference_Value_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Process_ParaAssert hasAD_Val_Rule_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Val_Rule_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Val_Rule_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Process_ParaAssert hasColumnName(String expected)
	{
		isNotNull();
		String actualField = actual.getColumnName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ColumnName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Process_ParaAssert hasDefaultValue(String expected)
	{
		isNotNull();
		String actualField = actual.getDefaultValue();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DefaultValue: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Process_ParaAssert hasDefaultValue2(String expected)
	{
		isNotNull();
		String actualField = actual.getDefaultValue2();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DefaultValue2: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Process_ParaAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Process_ParaAssert hasDisplayLogic(String expected)
	{
		isNotNull();
		String actualField = actual.getDisplayLogic();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DisplayLogic: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Process_ParaAssert hasEntityType(String expected)
	{
		isNotNull();
		String actualField = actual.getEntityType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have EntityType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Process_ParaAssert hasFieldLength(int expected)
	{
		isNotNull();
		int actualField = actual.getFieldLength();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have FieldLength: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Process_ParaAssert hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Process_ParaAssert isCentrallyMaintained()
	{
		isNotNull();
		if (!actual.isCentrallyMaintained()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CentrallyMaintained\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_Process_ParaAssert isNotCentrallyMaintained()
	{
		isNotNull();
		if (actual.isCentrallyMaintained()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CentrallyMaintained\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_Process_ParaAssert isEncrypted()
	{
		isNotNull();
		if (!actual.isEncrypted()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Encrypted\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_Process_ParaAssert isNotEncrypted()
	{
		isNotNull();
		if (actual.isEncrypted()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Encrypted\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_Process_ParaAssert isMandatory()
	{
		isNotNull();
		if (!actual.isMandatory()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Mandatory\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_Process_ParaAssert isNotMandatory()
	{
		isNotNull();
		if (actual.isMandatory()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Mandatory\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_Process_ParaAssert isRange()
	{
		isNotNull();
		if (!actual.isRange()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Range\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_Process_ParaAssert isNotRange()
	{
		isNotNull();
		if (actual.isRange()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Range\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_Process_ParaAssert hasMandatoryLogic(String expected)
	{
		isNotNull();
		String actualField = actual.getMandatoryLogic();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have MandatoryLogic: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Process_ParaAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Process_ParaAssert hasPlaceholder(String expected)
	{
		isNotNull();
		String actualField = actual.getPlaceholder();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Placeholder: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Process_ParaAssert hasPlaceholder2(String expected)
	{
		isNotNull();
		String actualField = actual.getPlaceholder2();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Placeholder2: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Process_ParaAssert hasReadOnlyLogic(String expected)
	{
		isNotNull();
		String actualField = actual.getReadOnlyLogic();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ReadOnlyLogic: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Process_ParaAssert hasSeqNo(int expected)
	{
		isNotNull();
		int actualField = actual.getSeqNo();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SeqNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Process_ParaAssert hasValueMax(String expected)
	{
		isNotNull();
		String actualField = actual.getValueMax();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ValueMax: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Process_ParaAssert hasValueMin(String expected)
	{
		isNotNull();
		String actualField = actual.getValueMin();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ValueMin: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Process_ParaAssert hasVFormat(String expected)
	{
		isNotNull();
		String actualField = actual.getVFormat();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have VFormat: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}