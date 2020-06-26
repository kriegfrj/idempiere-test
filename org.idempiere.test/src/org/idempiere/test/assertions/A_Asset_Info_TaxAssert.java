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
import org.compiere.model.X_A_Asset_Info_Tax;

/** Generated assertion class for A_Asset_Info_Tax
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class A_Asset_Info_TaxAssert
	extends AbstractPOAssert<A_Asset_Info_TaxAssert,X_A_Asset_Info_Tax>
{

    /** Standard Constructor */
    public A_Asset_Info_TaxAssert (X_A_Asset_Info_Tax actual)
    {
      super (actual, A_Asset_Info_TaxAssert.class);
    }


	public A_Asset_Info_TaxAssert hasA_Asset_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Asset_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_Info_TaxAssert hasA_Asset_Info_Tax_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Info_Tax_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Asset_Info_Tax_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_Info_TaxAssert hasA_Asset_Info_Tax_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Asset_Info_Tax_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Asset_Info_Tax_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_Info_TaxAssert hasA_Finance_Meth(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Finance_Meth();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Finance_Meth: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_Info_TaxAssert hasA_Investment_CR(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Investment_CR();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Investment_CR: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_Info_TaxAssert isA_New_Used()
	{
		isNotNull();
		if (!actual.isA_New_Used()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be A_New_Used\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_Info_TaxAssert isNotA_New_Used()
	{
		isNotNull();
		if (actual.isA_New_Used()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be A_New_Used\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_Info_TaxAssert hasA_State(String expected)
	{
		isNotNull();
		String actualField = actual.getA_State();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_State: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_Info_TaxAssert hasA_Tax_Entity(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Tax_Entity();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Tax_Entity: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_Info_TaxAssert hasTextMsg(String expected)
	{
		isNotNull();
		String actualField = actual.getTextMsg();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have TextMsg: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}