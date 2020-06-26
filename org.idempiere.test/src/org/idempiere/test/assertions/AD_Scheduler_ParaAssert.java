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
import org.compiere.model.X_AD_Scheduler_Para;

/** Generated assertion class for AD_Scheduler_Para
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_Scheduler_ParaAssert
	extends AbstractPOAssert<AD_Scheduler_ParaAssert,X_AD_Scheduler_Para>
{

    /** Standard Constructor */
    public AD_Scheduler_ParaAssert (X_AD_Scheduler_Para actual)
    {
      super (actual, AD_Scheduler_ParaAssert.class);
    }


	public AD_Scheduler_ParaAssert hasAD_Process_Para_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Process_Para_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Process_Para_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Scheduler_ParaAssert hasAD_Scheduler_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Scheduler_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Scheduler_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Scheduler_ParaAssert hasAD_Scheduler_Para_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Scheduler_Para_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Scheduler_Para_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Scheduler_ParaAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Scheduler_ParaAssert hasParameterDefault(String expected)
	{
		isNotNull();
		String actualField = actual.getParameterDefault();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ParameterDefault: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Scheduler_ParaAssert hasParameterToDefault(String expected)
	{
		isNotNull();
		String actualField = actual.getParameterToDefault();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ParameterToDefault: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}