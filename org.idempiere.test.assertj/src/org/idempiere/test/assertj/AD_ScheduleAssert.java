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
import org.compiere.model.X_AD_Schedule;

/** Generated assertion class for AD_Schedule
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_ScheduleAssert
	extends AbstractPOAssert<AD_ScheduleAssert,X_AD_Schedule>
{

    /** Standard Constructor */
    public AD_ScheduleAssert (X_AD_Schedule actual)
    {
      super (actual, AD_ScheduleAssert.class);
    }


	public AD_ScheduleAssert hasAD_Schedule_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Schedule_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Schedule_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ScheduleAssert hasAD_Schedule_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Schedule_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Schedule_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ScheduleAssert hasCronPattern(String expected)
	{
		isNotNull();
		String actualField = actual.getCronPattern();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CronPattern: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ScheduleAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ScheduleAssert hasFrequency(int expected)
	{
		isNotNull();
		int actualField = actual.getFrequency();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Frequency: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ScheduleAssert hasFrequencyType(String expected)
	{
		isNotNull();
		String actualField = actual.getFrequencyType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have FrequencyType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ScheduleAssert isIgnoreProcessingTime()
	{
		isNotNull();
		if (!actual.isIgnoreProcessingTime()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IgnoreProcessingTime\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_ScheduleAssert isNotIgnoreProcessingTime()
	{
		isNotNull();
		if (actual.isIgnoreProcessingTime()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IgnoreProcessingTime\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_ScheduleAssert isSystemSchedule()
	{
		isNotNull();
		if (!actual.isSystemSchedule()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SystemSchedule\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_ScheduleAssert isNotSystemSchedule()
	{
		isNotNull();
		if (actual.isSystemSchedule()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SystemSchedule\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_ScheduleAssert hasMonthDay(int expected)
	{
		isNotNull();
		int actualField = actual.getMonthDay();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have MonthDay: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ScheduleAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ScheduleAssert hasRunOnlyOnIP(String expected)
	{
		isNotNull();
		String actualField = actual.getRunOnlyOnIP();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have RunOnlyOnIP: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ScheduleAssert hasScheduleType(String expected)
	{
		isNotNull();
		String actualField = actual.getScheduleType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ScheduleType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ScheduleAssert hasWeekDay(String expected)
	{
		isNotNull();
		String actualField = actual.getWeekDay();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have WeekDay: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}