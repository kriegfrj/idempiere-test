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
import org.compiere.model.X_PA_ColorSchema;

/** Generated assertion class for PA_ColorSchema
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class PA_ColorSchemaAssert
	extends AbstractPOAssert<PA_ColorSchemaAssert,X_PA_ColorSchema>
{

    /** Standard Constructor */
    public PA_ColorSchemaAssert (X_PA_ColorSchema actual)
    {
      super (actual, PA_ColorSchemaAssert.class);
    }


	public PA_ColorSchemaAssert hasAD_PrintColor1_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PrintColor1_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_PrintColor1_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ColorSchemaAssert hasAD_PrintColor2_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PrintColor2_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_PrintColor2_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ColorSchemaAssert hasAD_PrintColor3_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PrintColor3_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_PrintColor3_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ColorSchemaAssert hasAD_PrintColor4_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PrintColor4_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_PrintColor4_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ColorSchemaAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ColorSchemaAssert hasEntityType(String expected)
	{
		isNotNull();
		String actualField = actual.getEntityType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have EntityType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ColorSchemaAssert hasMark1Percent(int expected)
	{
		isNotNull();
		int actualField = actual.getMark1Percent();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Mark1Percent: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ColorSchemaAssert hasMark2Percent(int expected)
	{
		isNotNull();
		int actualField = actual.getMark2Percent();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Mark2Percent: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ColorSchemaAssert hasMark3Percent(int expected)
	{
		isNotNull();
		int actualField = actual.getMark3Percent();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Mark3Percent: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ColorSchemaAssert hasMark4Percent(int expected)
	{
		isNotNull();
		int actualField = actual.getMark4Percent();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Mark4Percent: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ColorSchemaAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ColorSchemaAssert hasPA_ColorSchema_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPA_ColorSchema_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PA_ColorSchema_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ColorSchemaAssert hasPA_ColorSchema_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getPA_ColorSchema_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PA_ColorSchema_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}