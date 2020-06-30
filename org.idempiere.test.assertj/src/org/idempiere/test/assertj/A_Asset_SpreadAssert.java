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

import javax.annotation.Generated;
import org.assertj.core.util.Objects;
import org.compiere.model.X_A_Asset_Spread;

/** Generated assertion class for A_Asset_Spread
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class A_Asset_SpreadAssert
	extends AbstractPOAssert<A_Asset_SpreadAssert,X_A_Asset_Spread>
{

    /** Standard Constructor */
    public A_Asset_SpreadAssert (X_A_Asset_Spread actual)
    {
      super (actual, A_Asset_SpreadAssert.class);
    }


	public A_Asset_SpreadAssert hasA_Asset_Spread_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Spread_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Asset_Spread_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_SpreadAssert hasA_Asset_Spread_Type(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Asset_Spread_Type();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Asset_Spread_Type: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_SpreadAssert hasA_Asset_Spread_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Asset_Spread_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Asset_Spread_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_SpreadAssert hasA_Period_1(Object expected)
	{
		isNotNull();
		bdAssert("A_Period_1", actual.getA_Period_1(), expected);
		return myself;
	}


	public A_Asset_SpreadAssert hasA_Period_10(Object expected)
	{
		isNotNull();
		bdAssert("A_Period_10", actual.getA_Period_10(), expected);
		return myself;
	}


	public A_Asset_SpreadAssert hasA_Period_11(Object expected)
	{
		isNotNull();
		bdAssert("A_Period_11", actual.getA_Period_11(), expected);
		return myself;
	}


	public A_Asset_SpreadAssert hasA_Period_12(Object expected)
	{
		isNotNull();
		bdAssert("A_Period_12", actual.getA_Period_12(), expected);
		return myself;
	}


	public A_Asset_SpreadAssert hasA_Period_13(Object expected)
	{
		isNotNull();
		bdAssert("A_Period_13", actual.getA_Period_13(), expected);
		return myself;
	}


	public A_Asset_SpreadAssert hasA_Period_14(Object expected)
	{
		isNotNull();
		bdAssert("A_Period_14", actual.getA_Period_14(), expected);
		return myself;
	}


	public A_Asset_SpreadAssert hasA_Period_2(Object expected)
	{
		isNotNull();
		bdAssert("A_Period_2", actual.getA_Period_2(), expected);
		return myself;
	}


	public A_Asset_SpreadAssert hasA_Period_3(Object expected)
	{
		isNotNull();
		bdAssert("A_Period_3", actual.getA_Period_3(), expected);
		return myself;
	}


	public A_Asset_SpreadAssert hasA_Period_4(Object expected)
	{
		isNotNull();
		bdAssert("A_Period_4", actual.getA_Period_4(), expected);
		return myself;
	}


	public A_Asset_SpreadAssert hasA_Period_5(Object expected)
	{
		isNotNull();
		bdAssert("A_Period_5", actual.getA_Period_5(), expected);
		return myself;
	}


	public A_Asset_SpreadAssert hasA_Period_6(Object expected)
	{
		isNotNull();
		bdAssert("A_Period_6", actual.getA_Period_6(), expected);
		return myself;
	}


	public A_Asset_SpreadAssert hasA_Period_7(Object expected)
	{
		isNotNull();
		bdAssert("A_Period_7", actual.getA_Period_7(), expected);
		return myself;
	}


	public A_Asset_SpreadAssert hasA_Period_8(Object expected)
	{
		isNotNull();
		bdAssert("A_Period_8", actual.getA_Period_8(), expected);
		return myself;
	}


	public A_Asset_SpreadAssert hasA_Period_9(Object expected)
	{
		isNotNull();
		bdAssert("A_Period_9", actual.getA_Period_9(), expected);
		return myself;
	}


	public A_Asset_SpreadAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}