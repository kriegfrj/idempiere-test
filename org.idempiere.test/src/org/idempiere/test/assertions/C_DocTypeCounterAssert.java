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
import org.compiere.model.X_C_DocTypeCounter;

/** Generated assertion class for C_DocTypeCounter
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_DocTypeCounterAssert
	extends AbstractPOAssert<C_DocTypeCounterAssert,X_C_DocTypeCounter>
{

    /** Standard Constructor */
    public C_DocTypeCounterAssert (X_C_DocTypeCounter actual)
    {
      super (actual, C_DocTypeCounterAssert.class);
    }


	public C_DocTypeCounterAssert hasC_DocType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_DocType_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_DocType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DocTypeCounterAssert hasC_DocTypeCounter_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_DocTypeCounter_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_DocTypeCounter_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DocTypeCounterAssert hasC_DocTypeCounter_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_DocTypeCounter_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_DocTypeCounter_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DocTypeCounterAssert hasCounter_C_DocType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getCounter_C_DocType_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Counter_C_DocType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DocTypeCounterAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DocTypeCounterAssert hasDocAction(String expected)
	{
		isNotNull();
		String actualField = actual.getDocAction();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DocAction: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DocTypeCounterAssert isCreateCounter()
	{
		isNotNull();
		if (!actual.isCreateCounter()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CreateCounter\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_DocTypeCounterAssert isNotCreateCounter()
	{
		isNotNull();
		if (actual.isCreateCounter()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CreateCounter\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_DocTypeCounterAssert isValid()
	{
		isNotNull();
		if (!actual.isValid()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Valid\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_DocTypeCounterAssert isNotValid()
	{
		isNotNull();
		if (actual.isValid()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Valid\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_DocTypeCounterAssert hasName(String expected)
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