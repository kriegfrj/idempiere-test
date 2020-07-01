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
import org.compiere.model.X_WS_WebServiceFieldInput;

/** Generated assertion class for WS_WebServiceFieldInput
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class WS_WebServiceFieldInputAssert
	extends AbstractPOAssert<WS_WebServiceFieldInputAssert,X_WS_WebServiceFieldInput>
{

    /** Standard Constructor */
    public WS_WebServiceFieldInputAssert (X_WS_WebServiceFieldInput actual)
    {
      super (actual, WS_WebServiceFieldInputAssert.class);
    }


	public WS_WebServiceFieldInputAssert hasAD_Column_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Column_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Column_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public WS_WebServiceFieldInputAssert hasAD_Reference_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Reference_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Reference_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public WS_WebServiceFieldInputAssert hasAD_Reference_Value_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Reference_Value_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Reference_Value_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public WS_WebServiceFieldInputAssert hasColumnName(String expected)
	{
		isNotNull();
		String actualField = actual.getColumnName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ColumnName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public WS_WebServiceFieldInputAssert hasIdentifierLogic(String expected)
	{
		isNotNull();
		String actualField = actual.getIdentifierLogic();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have IdentifierLogic: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public WS_WebServiceFieldInputAssert isIdentifier()
	{
		isNotNull();
		if (!actual.isIdentifier()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Identifier\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public WS_WebServiceFieldInputAssert isNotIdentifier()
	{
		isNotNull();
		if (actual.isIdentifier()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Identifier\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public WS_WebServiceFieldInputAssert isNullIdentifier()
	{
		isNotNull();
		if (!actual.isNullIdentifier()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be NullIdentifier\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public WS_WebServiceFieldInputAssert isNotNullIdentifier()
	{
		isNotNull();
		if (actual.isNullIdentifier()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be NullIdentifier\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public WS_WebServiceFieldInputAssert hasWS_WebServiceFieldInput_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getWS_WebServiceFieldInput_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have WS_WebServiceFieldInput_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public WS_WebServiceFieldInputAssert hasWS_WebServiceFieldInput_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getWS_WebServiceFieldInput_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have WS_WebServiceFieldInput_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public WS_WebServiceFieldInputAssert hasWS_WebServiceType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getWS_WebServiceType_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have WS_WebServiceType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}