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
import org.compiere.model.X_A_Asset_Info_Ins;

/** Generated assertion class for A_Asset_Info_Ins
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class A_Asset_Info_InsAssert
	extends AbstractPOAssert<A_Asset_Info_InsAssert,X_A_Asset_Info_Ins>
{

    /** Standard Constructor */
    public A_Asset_Info_InsAssert (X_A_Asset_Info_Ins actual)
    {
      super (actual, A_Asset_Info_InsAssert.class);
    }


	public A_Asset_Info_InsAssert hasA_Asset_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_Info_InsAssert hasA_Asset_Info_Ins_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Info_Ins_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Info_Ins_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_Info_InsAssert hasA_Asset_Info_Ins_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Asset_Info_Ins_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Info_Ins_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_Info_InsAssert hasA_Ins_Premium(Object expected)
	{
		isNotNull();
		bdAssert("A_Ins_Premium", actual.getA_Ins_Premium(), expected);
		return myself;
	}


	public A_Asset_Info_InsAssert hasA_Ins_Value(Object expected)
	{
		isNotNull();
		bdAssert("A_Ins_Value", actual.getA_Ins_Value(), expected);
		return myself;
	}


	public A_Asset_Info_InsAssert hasA_Insurance_Co(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Insurance_Co();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Insurance_Co: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_Info_InsAssert hasA_Policy_No(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Policy_No();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Policy_No: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_Info_InsAssert hasA_Renewal_Date(Object expected)
	{
		isNotNull();
		dateAssert("A_Renewal_Date", actual.getA_Renewal_Date(), expected);
		return myself;
	}


	public A_Asset_Info_InsAssert hasA_Replace_Cost(Object expected)
	{
		isNotNull();
		bdAssert("A_Replace_Cost", actual.getA_Replace_Cost(), expected);
		return myself;
	}


	public A_Asset_Info_InsAssert hasText(String expected)
	{
		isNotNull();
		String actualField = actual.getText();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Text: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}