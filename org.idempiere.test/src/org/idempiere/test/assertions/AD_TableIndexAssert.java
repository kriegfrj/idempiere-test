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
import org.compiere.model.X_AD_TableIndex;

/** Generated assertion class for AD_TableIndex
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_TableIndexAssert
	extends AbstractPOAssert<AD_TableIndexAssert,X_AD_TableIndex>
{

    /** Standard Constructor */
    public AD_TableIndexAssert (X_AD_TableIndex actual)
    {
      super (actual, AD_TableIndexAssert.class);
    }


	public AD_TableIndexAssert hasAD_Message_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Message_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Message_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_TableIndexAssert hasAD_Table_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Table_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Table_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_TableIndexAssert hasAD_TableIndex_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_TableIndex_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_TableIndex_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_TableIndexAssert hasAD_TableIndex_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_TableIndex_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_TableIndex_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_TableIndexAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_TableIndexAssert hasEntityType(String expected)
	{
		isNotNull();
		String actualField = actual.getEntityType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have EntityType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_TableIndexAssert hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_TableIndexAssert isCreateConstraint()
	{
		isNotNull();
		if (!actual.isCreateConstraint()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CreateConstraint\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_TableIndexAssert isNotCreateConstraint()
	{
		isNotNull();
		if (actual.isCreateConstraint()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CreateConstraint\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_TableIndexAssert isKey()
	{
		isNotNull();
		if (!actual.isKey()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Key\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_TableIndexAssert isNotKey()
	{
		isNotNull();
		if (actual.isKey()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Key\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_TableIndexAssert isUnique()
	{
		isNotNull();
		if (!actual.isUnique()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Unique\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_TableIndexAssert isNotUnique()
	{
		isNotNull();
		if (actual.isUnique()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Unique\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_TableIndexAssert hasName(String expected)
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