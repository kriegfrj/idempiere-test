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
import org.compiere.model.X_PA_SLA_Criteria;

/** Generated assertion class for PA_SLA_Criteria
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class PA_SLA_CriteriaAssert
	extends AbstractPOAssert<PA_SLA_CriteriaAssert,X_PA_SLA_Criteria>
{

    /** Standard Constructor */
    public PA_SLA_CriteriaAssert (X_PA_SLA_Criteria actual)
    {
      super (actual, PA_SLA_CriteriaAssert.class);
    }


	public PA_SLA_CriteriaAssert hasClassname(String expected)
	{
		isNotNull();
		String actualField = actual.getClassname();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Classname: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_SLA_CriteriaAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_SLA_CriteriaAssert hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_SLA_CriteriaAssert isManual()
	{
		isNotNull();
		if (!actual.isManual()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Manual\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_SLA_CriteriaAssert isNotManual()
	{
		isNotNull();
		if (actual.isManual()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Manual\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_SLA_CriteriaAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_SLA_CriteriaAssert hasPA_SLA_Criteria_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPA_SLA_Criteria_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PA_SLA_Criteria_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_SLA_CriteriaAssert hasPA_SLA_Criteria_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getPA_SLA_Criteria_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PA_SLA_Criteria_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}