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
import org.compiere.model.X_ASP_Tab;

/** Generated assertion class for ASP_Tab
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class ASP_TabAssert
	extends AbstractPOAssert<ASP_TabAssert,X_ASP_Tab>
{

    /** Standard Constructor */
    public ASP_TabAssert (X_ASP_Tab actual)
    {
      super (actual, ASP_TabAssert.class);
    }


	public ASP_TabAssert hasAD_Tab_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Tab_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Tab_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public ASP_TabAssert isAllFields()
	{
		isNotNull();
		if (!actual.isAllFields()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AllFields\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public ASP_TabAssert isNotAllFields()
	{
		isNotNull();
		if (actual.isAllFields()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AllFields\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public ASP_TabAssert hasASP_Status(String expected)
	{
		isNotNull();
		String actualField = actual.getASP_Status();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ASP_Status: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public ASP_TabAssert hasASP_Tab_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getASP_Tab_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ASP_Tab_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public ASP_TabAssert hasASP_Tab_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getASP_Tab_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ASP_Tab_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public ASP_TabAssert hasASP_Window_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getASP_Window_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ASP_Window_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}