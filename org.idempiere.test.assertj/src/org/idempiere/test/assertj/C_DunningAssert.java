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
import org.compiere.model.X_C_Dunning;

/** Generated assertion class for C_Dunning
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_DunningAssert
	extends AbstractPOAssert<C_DunningAssert,X_C_Dunning>
{

    /** Standard Constructor */
    public C_DunningAssert (X_C_Dunning actual)
    {
      super (actual, C_DunningAssert.class);
    }


	public C_DunningAssert hasC_Dunning_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Dunning_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Dunning_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DunningAssert hasC_Dunning_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_Dunning_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Dunning_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DunningAssert isCreateLevelsSequentially()
	{
		isNotNull();
		if (!actual.isCreateLevelsSequentially()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CreateLevelsSequentially\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_DunningAssert isNotCreateLevelsSequentially()
	{
		isNotNull();
		if (actual.isCreateLevelsSequentially()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CreateLevelsSequentially\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_DunningAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DunningAssert isDefault()
	{
		isNotNull();
		if (!actual.isDefault()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Default\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_DunningAssert isNotDefault()
	{
		isNotNull();
		if (actual.isDefault()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Default\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_DunningAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DunningAssert isSendDunningLetter()
	{
		isNotNull();
		if (!actual.isSendDunningLetter()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SendDunningLetter\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_DunningAssert isNotSendDunningLetter()
	{
		isNotNull();
		if (actual.isSendDunningLetter()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SendDunningLetter\nbut it was",
				getPODescription());
		}
		return myself;
	}
}