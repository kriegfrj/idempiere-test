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
import org.compiere.model.X_AD_Chart;

/** Generated assertion class for AD_Chart
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_ChartAssert
	extends AbstractPOAssert<AD_ChartAssert,X_AD_Chart>
{

    /** Standard Constructor */
    public AD_ChartAssert (X_AD_Chart actual)
    {
      super (actual, AD_ChartAssert.class);
    }


	public AD_ChartAssert hasAD_Chart_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Chart_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Chart_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ChartAssert hasAD_Chart_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Chart_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Chart_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ChartAssert hasChartOrientation(String expected)
	{
		isNotNull();
		String actualField = actual.getChartOrientation();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ChartOrientation: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ChartAssert hasChartType(String expected)
	{
		isNotNull();
		String actualField = actual.getChartType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ChartType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ChartAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ChartAssert hasDomainLabel(String expected)
	{
		isNotNull();
		String actualField = actual.getDomainLabel();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DomainLabel: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ChartAssert hasEntityType(String expected)
	{
		isNotNull();
		String actualField = actual.getEntityType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have EntityType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ChartAssert isDisplayLegend()
	{
		isNotNull();
		if (!actual.isDisplayLegend()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DisplayLegend\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_ChartAssert isNotDisplayLegend()
	{
		isNotNull();
		if (actual.isDisplayLegend()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DisplayLegend\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_ChartAssert isTimeSeries()
	{
		isNotNull();
		if (!actual.isTimeSeries()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be TimeSeries\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_ChartAssert isNotTimeSeries()
	{
		isNotNull();
		if (actual.isTimeSeries()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be TimeSeries\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_ChartAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ChartAssert hasRangeLabel(String expected)
	{
		isNotNull();
		String actualField = actual.getRangeLabel();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have RangeLabel: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ChartAssert hasTimeScope(int expected)
	{
		isNotNull();
		int actualField = actual.getTimeScope();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have TimeScope: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ChartAssert hasTimeUnit(String expected)
	{
		isNotNull();
		String actualField = actual.getTimeUnit();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have TimeUnit: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ChartAssert hasWinHeight(int expected)
	{
		isNotNull();
		int actualField = actual.getWinHeight();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have WinHeight: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}