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
import org.compiere.model.X_PA_Goal;

/** Generated assertion class for PA_Goal
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class PA_GoalAssert
	extends AbstractPOAssert<PA_GoalAssert,X_PA_Goal>
{

    /** Standard Constructor */
    public PA_GoalAssert (X_PA_Goal actual)
    {
      super (actual, PA_GoalAssert.class);
    }


	public PA_GoalAssert hasAD_Role_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Role_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Role_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_GoalAssert hasAD_User_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_User_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_User_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_GoalAssert hasChartType(String expected)
	{
		isNotNull();
		String actualField = actual.getChartType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ChartType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_GoalAssert hasDateFrom(Object expected)
	{
		isNotNull();
		dateAssert("DateFrom", actual.getDateFrom(), expected);
		return myself;
	}


	public PA_GoalAssert hasDateLastRun(Object expected)
	{
		isNotNull();
		dateAssert("DateLastRun", actual.getDateLastRun(), expected);
		return myself;
	}


	public PA_GoalAssert hasDateTo(Object expected)
	{
		isNotNull();
		dateAssert("DateTo", actual.getDateTo(), expected);
		return myself;
	}


	public PA_GoalAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_GoalAssert hasGoalPerformance(Object expected)
	{
		isNotNull();
		bdAssert("GoalPerformance", actual.getGoalPerformance(), expected);
		return myself;
	}


	public PA_GoalAssert isSummary()
	{
		isNotNull();
		if (!actual.isSummary()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Summary\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_GoalAssert isNotSummary()
	{
		isNotNull();
		if (actual.isSummary()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Summary\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_GoalAssert hasMeasureActual(Object expected)
	{
		isNotNull();
		bdAssert("MeasureActual", actual.getMeasureActual(), expected);
		return myself;
	}


	public PA_GoalAssert hasMeasureDisplay(String expected)
	{
		isNotNull();
		String actualField = actual.getMeasureDisplay();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have MeasureDisplay: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_GoalAssert hasMeasureScope(String expected)
	{
		isNotNull();
		String actualField = actual.getMeasureScope();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have MeasureScope: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_GoalAssert hasMeasureTarget(Object expected)
	{
		isNotNull();
		bdAssert("MeasureTarget", actual.getMeasureTarget(), expected);
		return myself;
	}


	public PA_GoalAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_GoalAssert hasNote(String expected)
	{
		isNotNull();
		String actualField = actual.getNote();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Note: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_GoalAssert hasPA_ColorSchema_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPA_ColorSchema_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PA_ColorSchema_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_GoalAssert hasPA_Goal_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPA_Goal_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PA_Goal_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_GoalAssert hasPA_Goal_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getPA_Goal_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PA_Goal_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_GoalAssert hasPA_GoalParent_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPA_GoalParent_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PA_GoalParent_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_GoalAssert hasPA_Measure_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPA_Measure_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PA_Measure_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_GoalAssert hasRelativeWeight(Object expected)
	{
		isNotNull();
		bdAssert("RelativeWeight", actual.getRelativeWeight(), expected);
		return myself;
	}


	public PA_GoalAssert hasSeqNo(int expected)
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