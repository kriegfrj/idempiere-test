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
import org.compiere.model.X_PA_Achievement;

/** Generated assertion class for PA_Achievement
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class PA_AchievementAssert
	extends AbstractPOAssert<PA_AchievementAssert,X_PA_Achievement>
{

    /** Standard Constructor */
    public PA_AchievementAssert (X_PA_Achievement actual)
    {
      super (actual, PA_AchievementAssert.class);
    }


	public PA_AchievementAssert hasDateDoc(Object expected)
	{
		isNotNull();
		dateAssert("DateDoc", actual.getDateDoc(), expected);
		return myself;
	}


	public PA_AchievementAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_AchievementAssert isAchieved()
	{
		isNotNull();
		if (!actual.isAchieved()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Achieved\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_AchievementAssert isNotAchieved()
	{
		isNotNull();
		if (actual.isAchieved()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Achieved\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_AchievementAssert hasManualActual(Object expected)
	{
		isNotNull();
		bdAssert("ManualActual", actual.getManualActual(), expected);
		return myself;
	}


	public PA_AchievementAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_AchievementAssert hasNote(String expected)
	{
		isNotNull();
		String actualField = actual.getNote();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Note: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_AchievementAssert hasPA_Achievement_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPA_Achievement_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PA_Achievement_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_AchievementAssert hasPA_Achievement_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getPA_Achievement_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PA_Achievement_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_AchievementAssert hasPA_Measure_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPA_Measure_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PA_Measure_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_AchievementAssert hasSeqNo(int expected)
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