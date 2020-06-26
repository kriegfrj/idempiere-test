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
import org.compiere.model.X_AD_WF_ProcessData;

/** Generated assertion class for AD_WF_ProcessData
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_WF_ProcessDataAssert
	extends AbstractPOAssert<AD_WF_ProcessDataAssert,X_AD_WF_ProcessData>
{

    /** Standard Constructor */
    public AD_WF_ProcessDataAssert (X_AD_WF_ProcessData actual)
    {
      super (actual, AD_WF_ProcessDataAssert.class);
    }


	public AD_WF_ProcessDataAssert hasAD_WF_Process_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_WF_Process_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_WF_Process_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WF_ProcessDataAssert hasAD_WF_ProcessData_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_WF_ProcessData_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_WF_ProcessData_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WF_ProcessDataAssert hasAD_WF_ProcessData_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_WF_ProcessData_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_WF_ProcessData_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WF_ProcessDataAssert hasAttributeName(String expected)
	{
		isNotNull();
		String actualField = actual.getAttributeName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AttributeName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WF_ProcessDataAssert hasAttributeValue(String expected)
	{
		isNotNull();
		String actualField = actual.getAttributeValue();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AttributeValue: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}