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
import org.compiere.model.X_C_Currency;

/** Generated assertion class for C_Currency
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractC_CurrencyAssert<SELF extends AbstractC_CurrencyAssert<SELF, ACTUAL>, ACTUAL extends X_C_Currency>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractC_CurrencyAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasC_Currency_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Currency_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Currency_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Currency_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_Currency_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Currency_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasCostingPrecision(int expected)
	{
		isNotNull();
		int actualField = actual.getCostingPrecision();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CostingPrecision: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasCurSymbol(String expected)
	{
		isNotNull();
		String actualField = actual.getCurSymbol();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CurSymbol: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasEMUEntryDate(Object expected)
	{
		isNotNull();
		dateAssert("EMUEntryDate", actual.getEMUEntryDate(), expected);
		return myself;
	}


	public SELF hasEMURate(Object expected)
	{
		isNotNull();
		bdAssert("EMURate", actual.getEMURate(), expected);
		return myself;
	}


	public SELF isEMUMember()
	{
		isNotNull();
		if (!actual.isEMUMember()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be EMUMember\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotEMUMember()
	{
		isNotNull();
		if (actual.isEMUMember()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be EMUMember\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isEuro()
	{
		isNotNull();
		if (!actual.isEuro()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Euro\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotEuro()
	{
		isNotNull();
		if (actual.isEuro()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Euro\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasISO_Code(String expected)
	{
		isNotNull();
		String actualField = actual.getISO_Code();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ISO_Code: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasRoundOffFactor(Object expected)
	{
		isNotNull();
		bdAssert("RoundOffFactor", actual.getRoundOffFactor(), expected);
		return myself;
	}


	public SELF hasStdPrecision(int expected)
	{
		isNotNull();
		int actualField = actual.getStdPrecision();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have StdPrecision: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}