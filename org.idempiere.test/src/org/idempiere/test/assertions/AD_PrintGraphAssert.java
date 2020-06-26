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
import org.compiere.model.X_AD_PrintGraph;

/** Generated assertion class for AD_PrintGraph
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_PrintGraphAssert
	extends AbstractPOAssert<AD_PrintGraphAssert,X_AD_PrintGraph>
{

    /** Standard Constructor */
    public AD_PrintGraphAssert (X_AD_PrintGraph actual)
    {
      super (actual, AD_PrintGraphAssert.class);
    }


	public AD_PrintGraphAssert hasAD_PrintFormat_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PrintFormat_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_PrintFormat_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintGraphAssert hasAD_PrintGraph_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PrintGraph_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_PrintGraph_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintGraphAssert hasAD_PrintGraph_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_PrintGraph_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_PrintGraph_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintGraphAssert hasData_PrintFormatItem_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getData_PrintFormatItem_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Data_PrintFormatItem_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintGraphAssert hasData1_PrintFormatItem_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getData1_PrintFormatItem_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Data1_PrintFormatItem_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintGraphAssert hasData2_PrintFormatItem_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getData2_PrintFormatItem_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Data2_PrintFormatItem_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintGraphAssert hasData3_PrintFormatItem_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getData3_PrintFormatItem_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Data3_PrintFormatItem_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintGraphAssert hasData4_PrintFormatItem_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getData4_PrintFormatItem_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Data4_PrintFormatItem_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintGraphAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintGraphAssert hasDescription_PrintFormatItem_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getDescription_PrintFormatItem_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description_PrintFormatItem_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintGraphAssert hasGraphType(String expected)
	{
		isNotNull();
		String actualField = actual.getGraphType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have GraphType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintGraphAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}