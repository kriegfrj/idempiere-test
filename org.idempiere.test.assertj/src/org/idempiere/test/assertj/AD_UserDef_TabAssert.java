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
import org.compiere.model.X_AD_UserDef_Tab;

/** Generated assertion class for AD_UserDef_Tab
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_UserDef_TabAssert
	extends AbstractPOAssert<AD_UserDef_TabAssert,X_AD_UserDef_Tab>
{

    /** Standard Constructor */
    public AD_UserDef_TabAssert (X_AD_UserDef_Tab actual)
    {
      super (actual, AD_UserDef_TabAssert.class);
    }


	public AD_UserDef_TabAssert hasAD_Tab_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Tab_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Tab_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserDef_TabAssert hasAD_UserDef_Tab_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_UserDef_Tab_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_UserDef_Tab_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserDef_TabAssert hasAD_UserDef_Tab_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_UserDef_Tab_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_UserDef_Tab_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserDef_TabAssert hasAD_UserDef_Win_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_UserDef_Win_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_UserDef_Win_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserDef_TabAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserDef_TabAssert hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserDef_TabAssert isMultiRowOnly()
	{
		isNotNull();
		if (!actual.isMultiRowOnly()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be MultiRowOnly\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_UserDef_TabAssert isNotMultiRowOnly()
	{
		isNotNull();
		if (actual.isMultiRowOnly()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be MultiRowOnly\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_UserDef_TabAssert isReadOnly()
	{
		isNotNull();
		if (!actual.isReadOnly()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ReadOnly\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_UserDef_TabAssert isNotReadOnly()
	{
		isNotNull();
		if (actual.isReadOnly()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ReadOnly\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_UserDef_TabAssert isSingleRow()
	{
		isNotNull();
		if (!actual.isSingleRow()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SingleRow\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_UserDef_TabAssert isNotSingleRow()
	{
		isNotNull();
		if (actual.isSingleRow()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SingleRow\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_UserDef_TabAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserDef_TabAssert hasReadOnlyLogic(String expected)
	{
		isNotNull();
		String actualField = actual.getReadOnlyLogic();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ReadOnlyLogic: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}