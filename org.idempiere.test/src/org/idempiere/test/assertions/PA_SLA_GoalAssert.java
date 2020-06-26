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
import org.compiere.model.X_PA_SLA_Goal;

/** Generated assertion class for PA_SLA_Goal
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class PA_SLA_GoalAssert
	extends AbstractPOAssert<PA_SLA_GoalAssert,X_PA_SLA_Goal>
{

    /** Standard Constructor */
    public PA_SLA_GoalAssert (X_PA_SLA_Goal actual)
    {
      super (actual, PA_SLA_GoalAssert.class);
    }


	public PA_SLA_GoalAssert hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_SLA_GoalAssert hasDateLastRun(Object expected)
	{
		isNotNull();
		dateAssert("DateLastRun", actual.getDateLastRun(), expected);
		return myself;
	}


	public PA_SLA_GoalAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_SLA_GoalAssert hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_SLA_GoalAssert hasMeasureActual(Object expected)
	{
		isNotNull();
		bdAssert("MeasureActual", actual.getMeasureActual(), expected);
		return myself;
	}


	public PA_SLA_GoalAssert hasMeasureTarget(Object expected)
	{
		isNotNull();
		bdAssert("MeasureTarget", actual.getMeasureTarget(), expected);
		return myself;
	}


	public PA_SLA_GoalAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_SLA_GoalAssert hasPA_SLA_Criteria_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPA_SLA_Criteria_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PA_SLA_Criteria_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_SLA_GoalAssert hasPA_SLA_Goal_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPA_SLA_Goal_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PA_SLA_Goal_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_SLA_GoalAssert hasPA_SLA_Goal_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getPA_SLA_Goal_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PA_SLA_Goal_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_SLA_GoalAssert isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_SLA_GoalAssert isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_SLA_GoalAssert hasValidFrom(Object expected)
	{
		isNotNull();
		dateAssert("ValidFrom", actual.getValidFrom(), expected);
		return myself;
	}


	public PA_SLA_GoalAssert hasValidTo(Object expected)
	{
		isNotNull();
		dateAssert("ValidTo", actual.getValidTo(), expected);
		return myself;
	}

}