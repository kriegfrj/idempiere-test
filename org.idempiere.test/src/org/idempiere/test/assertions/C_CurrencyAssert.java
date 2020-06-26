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
import org.compiere.model.X_C_Currency;

/** Generated assertion class for C_Currency
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_CurrencyAssert
	extends AbstractPOAssert<C_CurrencyAssert,X_C_Currency>
{

    /** Standard Constructor */
    public C_CurrencyAssert (X_C_Currency actual)
    {
      super (actual, C_CurrencyAssert.class);
    }


	public C_CurrencyAssert hasC_Currency_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Currency_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Currency_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CurrencyAssert hasC_Currency_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_Currency_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Currency_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CurrencyAssert hasCostingPrecision(int expected)
	{
		isNotNull();
		int actualField = actual.getCostingPrecision();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CostingPrecision: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CurrencyAssert hasCurSymbol(String expected)
	{
		isNotNull();
		String actualField = actual.getCurSymbol();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CurSymbol: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CurrencyAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CurrencyAssert hasEMUEntryDate(Object expected)
	{
		isNotNull();
		dateAssert("EMUEntryDate", actual.getEMUEntryDate(), expected);
		return myself;
	}


	public C_CurrencyAssert hasEMURate(Object expected)
	{
		isNotNull();
		bdAssert("EMURate", actual.getEMURate(), expected);
		return myself;
	}


	public C_CurrencyAssert isEMUMember()
	{
		isNotNull();
		if (!actual.isEMUMember()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be EMUMember\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_CurrencyAssert isNotEMUMember()
	{
		isNotNull();
		if (actual.isEMUMember()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be EMUMember\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_CurrencyAssert isEuro()
	{
		isNotNull();
		if (!actual.isEuro()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Euro\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_CurrencyAssert isNotEuro()
	{
		isNotNull();
		if (actual.isEuro()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Euro\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_CurrencyAssert hasISO_Code(String expected)
	{
		isNotNull();
		String actualField = actual.getISO_Code();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ISO_Code: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CurrencyAssert hasRoundOffFactor(Object expected)
	{
		isNotNull();
		bdAssert("RoundOffFactor", actual.getRoundOffFactor(), expected);
		return myself;
	}


	public C_CurrencyAssert hasStdPrecision(int expected)
	{
		isNotNull();
		int actualField = actual.getStdPrecision();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have StdPrecision: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}