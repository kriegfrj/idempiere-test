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
import org.compiere.model.X_AD_Package_Imp_Proc;

/** Generated assertion class for AD_Package_Imp_Proc
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_Package_Imp_ProcAssert
	extends AbstractPOAssert<AD_Package_Imp_ProcAssert,X_AD_Package_Imp_Proc>
{

    /** Standard Constructor */
    public AD_Package_Imp_ProcAssert (X_AD_Package_Imp_Proc actual)
    {
      super (actual, AD_Package_Imp_ProcAssert.class);
    }


	public AD_Package_Imp_ProcAssert isAD_Override_Dict()
	{
		isNotNull();
		if (!actual.isAD_Override_Dict()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AD_Override_Dict\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_Package_Imp_ProcAssert isNotAD_Override_Dict()
	{
		isNotNull();
		if (actual.isAD_Override_Dict()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AD_Override_Dict\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_Package_Imp_ProcAssert hasAD_Package_Dir(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Package_Dir();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Package_Dir: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Package_Imp_ProcAssert hasAD_Package_Imp_Proc_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Package_Imp_Proc_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Package_Imp_Proc_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Package_Imp_ProcAssert hasAD_Package_Imp_Proc_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Package_Imp_Proc_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Package_Imp_Proc_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Package_Imp_ProcAssert hasAD_Package_Source(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Package_Source();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Package_Source: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Package_Imp_ProcAssert hasAD_Package_Source_Type(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Package_Source_Type();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Package_Source_Type: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Package_Imp_ProcAssert hasDateProcessed(Object expected)
	{
		isNotNull();
		dateAssert("DateProcessed", actual.getDateProcessed(), expected);
		return myself;
	}


	public AD_Package_Imp_ProcAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Package_Imp_ProcAssert hasP_Msg(String expected)
	{
		isNotNull();
		String actualField = actual.getP_Msg();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have P_Msg: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}