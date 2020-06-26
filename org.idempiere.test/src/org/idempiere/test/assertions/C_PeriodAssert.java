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
import org.compiere.model.X_C_Period;

/** Generated assertion class for C_Period
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_PeriodAssert
	extends AbstractPOAssert<C_PeriodAssert,X_C_Period>
{

    /** Standard Constructor */
    public C_PeriodAssert (X_C_Period actual)
    {
      super (actual, C_PeriodAssert.class);
    }


	public C_PeriodAssert hasC_Period_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Period_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Period_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PeriodAssert hasC_Period_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_Period_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Period_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PeriodAssert hasC_Year_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Year_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Year_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PeriodAssert hasEndDate(Object expected)
	{
		isNotNull();
		dateAssert("EndDate", actual.getEndDate(), expected);
		return myself;
	}


	public C_PeriodAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PeriodAssert hasPeriodNo(int expected)
	{
		isNotNull();
		int actualField = actual.getPeriodNo();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PeriodNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PeriodAssert hasPeriodType(String expected)
	{
		isNotNull();
		String actualField = actual.getPeriodType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PeriodType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PeriodAssert hasStartDate(Object expected)
	{
		isNotNull();
		dateAssert("StartDate", actual.getStartDate(), expected);
		return myself;
	}

}