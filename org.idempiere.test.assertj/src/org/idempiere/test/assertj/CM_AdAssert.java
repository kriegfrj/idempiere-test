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
import org.compiere.model.X_CM_Ad;

/** Generated assertion class for CM_Ad
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class CM_AdAssert
	extends AbstractPOAssert<CM_AdAssert,X_CM_Ad>
{

    /** Standard Constructor */
    public CM_AdAssert (X_CM_Ad actual)
    {
      super (actual, CM_AdAssert.class);
    }


	public CM_AdAssert hasActualClick(int expected)
	{
		isNotNull();
		int actualField = actual.getActualClick();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ActualClick: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_AdAssert hasActualImpression(int expected)
	{
		isNotNull();
		int actualField = actual.getActualImpression();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ActualImpression: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_AdAssert hasCM_Ad_Cat_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getCM_Ad_Cat_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CM_Ad_Cat_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_AdAssert hasCM_Ad_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getCM_Ad_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CM_Ad_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_AdAssert hasCM_Ad_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getCM_Ad_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CM_Ad_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_AdAssert hasCM_Media_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getCM_Media_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CM_Media_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_AdAssert hasContentHTML(String expected)
	{
		isNotNull();
		String actualField = actual.getContentHTML();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ContentHTML: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_AdAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_AdAssert hasEndDate(Object expected)
	{
		isNotNull();
		dateAssert("EndDate", actual.getEndDate(), expected);
		return myself;
	}


	public CM_AdAssert hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_AdAssert isAdFlag()
	{
		isNotNull();
		if (!actual.isAdFlag()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AdFlag\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public CM_AdAssert isNotAdFlag()
	{
		isNotNull();
		if (actual.isAdFlag()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AdFlag\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public CM_AdAssert isLogged()
	{
		isNotNull();
		if (!actual.isLogged()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Logged\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public CM_AdAssert isNotLogged()
	{
		isNotNull();
		if (actual.isLogged()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Logged\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public CM_AdAssert hasMaxClick(int expected)
	{
		isNotNull();
		int actualField = actual.getMaxClick();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have MaxClick: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_AdAssert hasMaxImpression(int expected)
	{
		isNotNull();
		int actualField = actual.getMaxImpression();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have MaxImpression: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_AdAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_AdAssert hasStartDate(Object expected)
	{
		isNotNull();
		dateAssert("StartDate", actual.getStartDate(), expected);
		return myself;
	}


	public CM_AdAssert hasStartImpression(int expected)
	{
		isNotNull();
		int actualField = actual.getStartImpression();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have StartImpression: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_AdAssert hasTarget_Frame(String expected)
	{
		isNotNull();
		String actualField = actual.getTarget_Frame();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Target_Frame: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_AdAssert hasTargetURL(String expected)
	{
		isNotNull();
		String actualField = actual.getTargetURL();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have TargetURL: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}