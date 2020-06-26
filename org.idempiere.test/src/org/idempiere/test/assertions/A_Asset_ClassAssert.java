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
import org.compiere.model.X_A_Asset_Class;

/** Generated assertion class for A_Asset_Class
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class A_Asset_ClassAssert
	extends AbstractPOAssert<A_Asset_ClassAssert,X_A_Asset_Class>
{

    /** Standard Constructor */
    public A_Asset_ClassAssert (X_A_Asset_Class actual)
    {
      super (actual, A_Asset_ClassAssert.class);
    }


	public A_Asset_ClassAssert hasA_Asset_Class_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Class_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Asset_Class_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ClassAssert hasA_Asset_Class_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Asset_Class_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Asset_Class_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ClassAssert hasA_Life_Period_2004(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Life_Period_2004();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Life_Period_2004: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ClassAssert hasA_Life_Period_Max(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Life_Period_Max();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Life_Period_Max: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ClassAssert hasA_Life_Period_Min(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Life_Period_Min();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Life_Period_Min: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ClassAssert hasA_Value_2004(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Value_2004();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Value_2004: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ClassAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ClassAssert hasMFX_Clasa(int expected)
	{
		isNotNull();
		int actualField = actual.getMFX_Clasa();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have MFX_Clasa: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ClassAssert hasMFX_Grupa(int expected)
	{
		isNotNull();
		int actualField = actual.getMFX_Grupa();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have MFX_Grupa: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ClassAssert hasMFX_SubClasa(int expected)
	{
		isNotNull();
		int actualField = actual.getMFX_SubClasa();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have MFX_SubClasa: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ClassAssert hasMFX_SubGrupa(int expected)
	{
		isNotNull();
		int actualField = actual.getMFX_SubGrupa();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have MFX_SubGrupa: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ClassAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_ClassAssert hasValue(String expected)
	{
		isNotNull();
		String actualField = actual.getValue();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Value: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}