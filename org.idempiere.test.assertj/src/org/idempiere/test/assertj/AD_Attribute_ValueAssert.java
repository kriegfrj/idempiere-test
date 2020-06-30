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
import org.compiere.model.X_AD_Attribute_Value;

/** Generated assertion class for AD_Attribute_Value
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_Attribute_ValueAssert
	extends AbstractPOAssert<AD_Attribute_ValueAssert,X_AD_Attribute_Value>
{

    /** Standard Constructor */
    public AD_Attribute_ValueAssert (X_AD_Attribute_Value actual)
    {
      super (actual, AD_Attribute_ValueAssert.class);
    }


	public AD_Attribute_ValueAssert hasAD_Attribute_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Attribute_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Attribute_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Attribute_ValueAssert hasAD_Attribute_Value_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Attribute_Value_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Attribute_Value_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Attribute_ValueAssert hasV_Date(Object expected)
	{
		isNotNull();
		dateAssert("V_Date", actual.getV_Date(), expected);
		return myself;
	}


	public AD_Attribute_ValueAssert hasV_Number(String expected)
	{
		isNotNull();
		String actualField = actual.getV_Number();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have V_Number: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Attribute_ValueAssert hasV_String(String expected)
	{
		isNotNull();
		String actualField = actual.getV_String();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have V_String: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}