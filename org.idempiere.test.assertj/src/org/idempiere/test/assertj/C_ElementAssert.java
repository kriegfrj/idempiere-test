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
import org.compiere.model.X_C_Element;

/** Generated assertion class for C_Element
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_ElementAssert
	extends AbstractPOAssert<C_ElementAssert,X_C_Element>
{

    /** Standard Constructor */
    public C_ElementAssert (X_C_Element actual)
    {
      super (actual, C_ElementAssert.class);
    }


	public C_ElementAssert hasAD_Tree_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Tree_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Tree_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_ElementAssert hasC_Element_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Element_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Element_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_ElementAssert hasC_Element_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_Element_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Element_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_ElementAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_ElementAssert hasElementType(String expected)
	{
		isNotNull();
		String actualField = actual.getElementType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ElementType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_ElementAssert isBalancing()
	{
		isNotNull();
		if (!actual.isBalancing()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Balancing\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_ElementAssert isNotBalancing()
	{
		isNotNull();
		if (actual.isBalancing()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Balancing\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_ElementAssert isNaturalAccount()
	{
		isNotNull();
		if (!actual.isNaturalAccount()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be NaturalAccount\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_ElementAssert isNotNaturalAccount()
	{
		isNotNull();
		if (actual.isNaturalAccount()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be NaturalAccount\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_ElementAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_ElementAssert hasVFormat(String expected)
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