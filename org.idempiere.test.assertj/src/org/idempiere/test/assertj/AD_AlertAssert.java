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
import org.compiere.model.X_AD_Alert;

/** Generated assertion class for AD_Alert
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_AlertAssert
	extends AbstractPOAssert<AD_AlertAssert,X_AD_Alert>
{

    /** Standard Constructor */
    public AD_AlertAssert (X_AD_Alert actual)
    {
      super (actual, AD_AlertAssert.class);
    }


	public AD_AlertAssert hasAD_Alert_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Alert_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Alert_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_AlertAssert hasAD_Alert_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Alert_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Alert_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_AlertAssert hasAD_AlertProcessor_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_AlertProcessor_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_AlertProcessor_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_AlertAssert hasAlertMessage(String expected)
	{
		isNotNull();
		String actualField = actual.getAlertMessage();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AlertMessage: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_AlertAssert hasAlertSubject(String expected)
	{
		isNotNull();
		String actualField = actual.getAlertSubject();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AlertSubject: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_AlertAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_AlertAssert isEnforceClientSecurity()
	{
		isNotNull();
		if (!actual.isEnforceClientSecurity()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be EnforceClientSecurity\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_AlertAssert isNotEnforceClientSecurity()
	{
		isNotNull();
		if (actual.isEnforceClientSecurity()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be EnforceClientSecurity\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_AlertAssert isEnforceRoleSecurity()
	{
		isNotNull();
		if (!actual.isEnforceRoleSecurity()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be EnforceRoleSecurity\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_AlertAssert isNotEnforceRoleSecurity()
	{
		isNotNull();
		if (actual.isEnforceRoleSecurity()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be EnforceRoleSecurity\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_AlertAssert hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_AlertAssert isValid()
	{
		isNotNull();
		if (!actual.isValid()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Valid\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_AlertAssert isNotValid()
	{
		isNotNull();
		if (actual.isValid()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Valid\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_AlertAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}