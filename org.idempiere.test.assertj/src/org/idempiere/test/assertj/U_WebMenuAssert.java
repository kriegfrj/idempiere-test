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
import org.compiere.model.X_U_WebMenu;

/** Generated assertion class for U_WebMenu
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class U_WebMenuAssert
	extends AbstractPOAssert<U_WebMenuAssert,X_U_WebMenu>
{

    /** Standard Constructor */
    public U_WebMenuAssert (X_U_WebMenu actual)
    {
      super (actual, U_WebMenuAssert.class);
    }


	public U_WebMenuAssert hasCategory(String expected)
	{
		isNotNull();
		String actualField = actual.getCategory();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Category: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public U_WebMenuAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public U_WebMenuAssert isHasSubMenu()
	{
		isNotNull();
		if (!actual.isHasSubMenu()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be HasSubMenu\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public U_WebMenuAssert isNotHasSubMenu()
	{
		isNotNull();
		if (actual.isHasSubMenu()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be HasSubMenu\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public U_WebMenuAssert hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public U_WebMenuAssert hasImageLink(String expected)
	{
		isNotNull();
		String actualField = actual.getImageLink();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ImageLink: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public U_WebMenuAssert hasMenuLink(String expected)
	{
		isNotNull();
		String actualField = actual.getMenuLink();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have MenuLink: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public U_WebMenuAssert hasModule(String expected)
	{
		isNotNull();
		String actualField = actual.getModule();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Module: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public U_WebMenuAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public U_WebMenuAssert hasParentMenu_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getParentMenu_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ParentMenu_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public U_WebMenuAssert hasPosition(String expected)
	{
		isNotNull();
		String actualField = actual.getPosition();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Position: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public U_WebMenuAssert hasSequence(Object expected)
	{
		isNotNull();
		bdAssert("Sequence", actual.getSequence(), expected);
		return myself;
	}


	public U_WebMenuAssert hasU_WebMenu_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getU_WebMenu_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have U_WebMenu_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public U_WebMenuAssert hasU_WebMenu_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getU_WebMenu_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have U_WebMenu_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}