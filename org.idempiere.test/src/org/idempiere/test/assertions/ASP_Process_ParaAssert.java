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
import org.compiere.model.X_ASP_Process_Para;

/** Generated assertion class for ASP_Process_Para
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class ASP_Process_ParaAssert
	extends AbstractPOAssert<ASP_Process_ParaAssert,X_ASP_Process_Para>
{

    /** Standard Constructor */
    public ASP_Process_ParaAssert (X_ASP_Process_Para actual)
    {
      super (actual, ASP_Process_ParaAssert.class);
    }


	public ASP_Process_ParaAssert hasAD_Process_Para_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Process_Para_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Process_Para_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public ASP_Process_ParaAssert hasASP_Process_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getASP_Process_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ASP_Process_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public ASP_Process_ParaAssert hasASP_Process_Para_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getASP_Process_Para_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ASP_Process_Para_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public ASP_Process_ParaAssert hasASP_Process_Para_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getASP_Process_Para_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ASP_Process_Para_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public ASP_Process_ParaAssert hasASP_Status(String expected)
	{
		isNotNull();
		String actualField = actual.getASP_Status();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ASP_Status: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}