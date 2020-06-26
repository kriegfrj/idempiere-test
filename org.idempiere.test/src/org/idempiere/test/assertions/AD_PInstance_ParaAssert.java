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
import org.compiere.model.X_AD_PInstance_Para;

/** Generated assertion class for AD_PInstance_Para
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_PInstance_ParaAssert
	extends AbstractPOAssert<AD_PInstance_ParaAssert,X_AD_PInstance_Para>
{

    /** Standard Constructor */
    public AD_PInstance_ParaAssert (X_AD_PInstance_Para actual)
    {
      super (actual, AD_PInstance_ParaAssert.class);
    }


	public AD_PInstance_ParaAssert hasAD_PInstance_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PInstance_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_PInstance_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PInstance_ParaAssert hasAD_PInstance_Para_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_PInstance_Para_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_PInstance_Para_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PInstance_ParaAssert hasInfo(String expected)
	{
		isNotNull();
		String actualField = actual.getInfo();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Info: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PInstance_ParaAssert hasInfo_To(String expected)
	{
		isNotNull();
		String actualField = actual.getInfo_To();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Info_To: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PInstance_ParaAssert hasP_Date(Object expected)
	{
		isNotNull();
		dateAssert("P_Date", actual.getP_Date(), expected);
		return myself;
	}


	public AD_PInstance_ParaAssert hasP_Date_To(Object expected)
	{
		isNotNull();
		dateAssert("P_Date_To", actual.getP_Date_To(), expected);
		return myself;
	}


	public AD_PInstance_ParaAssert hasP_Number(Object expected)
	{
		isNotNull();
		bdAssert("P_Number", actual.getP_Number(), expected);
		return myself;
	}


	public AD_PInstance_ParaAssert hasP_Number_To(Object expected)
	{
		isNotNull();
		bdAssert("P_Number_To", actual.getP_Number_To(), expected);
		return myself;
	}


	public AD_PInstance_ParaAssert hasP_String(String expected)
	{
		isNotNull();
		String actualField = actual.getP_String();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have P_String: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PInstance_ParaAssert hasP_String_To(String expected)
	{
		isNotNull();
		String actualField = actual.getP_String_To();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have P_String_To: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PInstance_ParaAssert hasParameterName(String expected)
	{
		isNotNull();
		String actualField = actual.getParameterName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ParameterName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PInstance_ParaAssert hasSeqNo(int expected)
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