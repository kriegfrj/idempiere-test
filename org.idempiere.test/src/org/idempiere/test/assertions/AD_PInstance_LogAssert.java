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
import org.compiere.model.X_AD_PInstance_Log;

/** Generated assertion class for AD_PInstance_Log
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_PInstance_LogAssert
	extends AbstractPOAssert<AD_PInstance_LogAssert,X_AD_PInstance_Log>
{

    /** Standard Constructor */
    public AD_PInstance_LogAssert (X_AD_PInstance_Log actual)
    {
      super (actual, AD_PInstance_LogAssert.class);
    }


	public AD_PInstance_LogAssert hasAD_PInstance_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PInstance_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_PInstance_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PInstance_LogAssert hasAD_PInstance_Log_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_PInstance_Log_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_PInstance_Log_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PInstance_LogAssert hasAD_Table_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Table_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Table_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PInstance_LogAssert hasLog_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getLog_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Log_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PInstance_LogAssert hasP_Date(Object expected)
	{
		isNotNull();
		dateAssert("P_Date", actual.getP_Date(), expected);
		return myself;
	}


	public AD_PInstance_LogAssert hasP_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getP_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have P_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PInstance_LogAssert hasP_Msg(String expected)
	{
		isNotNull();
		String actualField = actual.getP_Msg();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have P_Msg: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PInstance_LogAssert hasP_Number(Object expected)
	{
		isNotNull();
		bdAssert("P_Number", actual.getP_Number(), expected);
		return myself;
	}

}