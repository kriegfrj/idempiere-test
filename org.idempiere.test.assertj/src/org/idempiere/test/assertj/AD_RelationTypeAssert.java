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
import org.compiere.model.X_AD_RelationType;

/** Generated assertion class for AD_RelationType
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_RelationTypeAssert
	extends AbstractPOAssert<AD_RelationTypeAssert,X_AD_RelationType>
{

    /** Standard Constructor */
    public AD_RelationTypeAssert (X_AD_RelationType actual)
    {
      super (actual, AD_RelationTypeAssert.class);
    }


	public AD_RelationTypeAssert hasAD_Reference_Source_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Reference_Source_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Reference_Source_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_RelationTypeAssert hasAD_Reference_Target_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Reference_Target_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Reference_Target_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_RelationTypeAssert hasAD_RelationType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_RelationType_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_RelationType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_RelationTypeAssert hasAD_RelationType_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_RelationType_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_RelationType_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_RelationTypeAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_RelationTypeAssert isDirected()
	{
		isNotNull();
		if (!actual.isDirected()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Directed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_RelationTypeAssert isNotDirected()
	{
		isNotNull();
		if (actual.isDirected()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Directed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_RelationTypeAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_RelationTypeAssert hasRole_Source(String expected)
	{
		isNotNull();
		String actualField = actual.getRole_Source();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Role_Source: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_RelationTypeAssert hasRole_Target(String expected)
	{
		isNotNull();
		String actualField = actual.getRole_Target();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Role_Target: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_RelationTypeAssert hasType(String expected)
	{
		isNotNull();
		String actualField = actual.getType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Type: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}