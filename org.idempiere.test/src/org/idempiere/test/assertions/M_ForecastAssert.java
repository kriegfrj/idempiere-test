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
import org.compiere.model.X_M_Forecast;

/** Generated assertion class for M_Forecast
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class M_ForecastAssert
	extends AbstractPOAssert<M_ForecastAssert,X_M_Forecast>
{

    /** Standard Constructor */
    public M_ForecastAssert (X_M_Forecast actual)
    {
      super (actual, M_ForecastAssert.class);
    }


	public M_ForecastAssert hasC_Calendar_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Calendar_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Calendar_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ForecastAssert hasC_Year_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Year_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Year_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ForecastAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ForecastAssert hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ForecastAssert isDefault()
	{
		isNotNull();
		if (!actual.isDefault()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Default\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_ForecastAssert isNotDefault()
	{
		isNotNull();
		if (actual.isDefault()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Default\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_ForecastAssert hasM_Forecast_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Forecast_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Forecast_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ForecastAssert hasM_Forecast_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getM_Forecast_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Forecast_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ForecastAssert hasM_PriceList_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_PriceList_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_PriceList_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ForecastAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}