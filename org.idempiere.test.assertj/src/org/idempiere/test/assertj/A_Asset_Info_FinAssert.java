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
import org.compiere.model.X_A_Asset_Info_Fin;

/** Generated assertion class for A_Asset_Info_Fin
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class A_Asset_Info_FinAssert
	extends AbstractPOAssert<A_Asset_Info_FinAssert,X_A_Asset_Info_Fin>
{

    /** Standard Constructor */
    public A_Asset_Info_FinAssert (X_A_Asset_Info_Fin actual)
    {
      super (actual, A_Asset_Info_FinAssert.class);
    }


	public A_Asset_Info_FinAssert hasA_Asset_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_Info_FinAssert hasA_Asset_Info_Fin_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Info_Fin_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Info_Fin_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_Info_FinAssert hasA_Asset_Info_Fin_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Asset_Info_Fin_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Info_Fin_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_Info_FinAssert hasA_Contract_Date(Object expected)
	{
		isNotNull();
		dateAssert("A_Contract_Date", actual.getA_Contract_Date(), expected);
		return myself;
	}


	public A_Asset_Info_FinAssert hasA_Due_On(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Due_On();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Due_On: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_Info_FinAssert hasA_Expired_Date(Object expected)
	{
		isNotNull();
		dateAssert("A_Expired_Date", actual.getA_Expired_Date(), expected);
		return myself;
	}


	public A_Asset_Info_FinAssert hasA_Finance_Meth(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Finance_Meth();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Finance_Meth: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_Info_FinAssert hasA_Monthly_Payment(Object expected)
	{
		isNotNull();
		bdAssert("A_Monthly_Payment", actual.getA_Monthly_Payment(), expected);
		return myself;
	}


	public A_Asset_Info_FinAssert isA_Purchase_Option()
	{
		isNotNull();
		if (!actual.isA_Purchase_Option()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be A_Purchase_Option\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_Info_FinAssert isNotA_Purchase_Option()
	{
		isNotNull();
		if (actual.isA_Purchase_Option()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be A_Purchase_Option\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_Info_FinAssert hasA_Purchase_Option_Credit(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Purchase_Option_Credit();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Purchase_Option_Credit: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_Info_FinAssert hasA_Purchase_Option_Credit_Per(Object expected)
	{
		isNotNull();
		bdAssert("A_Purchase_Option_Credit_Per", actual.getA_Purchase_Option_Credit_Per(), expected);
		return myself;
	}


	public A_Asset_Info_FinAssert hasA_Purchase_Price(Object expected)
	{
		isNotNull();
		bdAssert("A_Purchase_Price", actual.getA_Purchase_Price(), expected);
		return myself;
	}


	public A_Asset_Info_FinAssert hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_Info_FinAssert isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_Info_FinAssert isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_Info_FinAssert hasTextMsg(String expected)
	{
		isNotNull();
		String actualField = actual.getTextMsg();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have TextMsg: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}