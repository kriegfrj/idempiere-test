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
import org.compiere.model.X_AD_ToolBarButton;

/** Generated assertion class for AD_ToolBarButton
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_ToolBarButtonAssert
	extends AbstractPOAssert<AD_ToolBarButtonAssert,X_AD_ToolBarButton>
{

    /** Standard Constructor */
    public AD_ToolBarButtonAssert (X_AD_ToolBarButton actual)
    {
      super (actual, AD_ToolBarButtonAssert.class);
    }


	public AD_ToolBarButtonAssert hasAction(String expected)
	{
		isNotNull();
		String actualField = actual.getAction();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Action: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ToolBarButtonAssert hasActionClassName(String expected)
	{
		isNotNull();
		String actualField = actual.getActionClassName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ActionClassName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ToolBarButtonAssert hasActionName(String expected)
	{
		isNotNull();
		String actualField = actual.getActionName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ActionName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ToolBarButtonAssert hasAD_Process_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Process_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Process_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ToolBarButtonAssert hasAD_Tab_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Tab_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Tab_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ToolBarButtonAssert hasAD_ToolBarButton_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_ToolBarButton_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_ToolBarButton_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ToolBarButtonAssert hasAD_ToolBarButton_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_ToolBarButton_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_ToolBarButton_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ToolBarButtonAssert hasComponentName(String expected)
	{
		isNotNull();
		String actualField = actual.getComponentName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ComponentName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ToolBarButtonAssert hasDisplayLogic(String expected)
	{
		isNotNull();
		String actualField = actual.getDisplayLogic();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DisplayLogic: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ToolBarButtonAssert isAddSeparator()
	{
		isNotNull();
		if (!actual.isAddSeparator()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AddSeparator\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_ToolBarButtonAssert isNotAddSeparator()
	{
		isNotNull();
		if (actual.isAddSeparator()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AddSeparator\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_ToolBarButtonAssert isAdvancedButton()
	{
		isNotNull();
		if (!actual.isAdvancedButton()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AdvancedButton\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_ToolBarButtonAssert isNotAdvancedButton()
	{
		isNotNull();
		if (actual.isAdvancedButton()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AdvancedButton\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_ToolBarButtonAssert isCustomization()
	{
		isNotNull();
		if (!actual.isCustomization()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Customization\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_ToolBarButtonAssert isNotCustomization()
	{
		isNotNull();
		if (actual.isCustomization()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Customization\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_ToolBarButtonAssert hasKeyStroke_KeyCode(int expected)
	{
		isNotNull();
		int actualField = actual.getKeyStroke_KeyCode();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have KeyStroke_KeyCode: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ToolBarButtonAssert hasKeyStroke_Modifiers(int expected)
	{
		isNotNull();
		int actualField = actual.getKeyStroke_Modifiers();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have KeyStroke_Modifiers: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ToolBarButtonAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ToolBarButtonAssert hasSeqNo(int expected)
	{
		isNotNull();
		int actualField = actual.getSeqNo();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SeqNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}