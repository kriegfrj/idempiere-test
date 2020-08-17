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
import org.compiere.model.X_C_Charge;

/** Generated assertion class for C_Charge
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractC_ChargeAssert<SELF extends AbstractC_ChargeAssert<SELF, ACTUAL>, ACTUAL extends X_C_Charge>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractC_ChargeAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Charge_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Charge_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Charge_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Charge_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_Charge_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Charge_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_ChargeType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ChargeType_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_ChargeType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_TaxCategory_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_TaxCategory_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_TaxCategory_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasChargeAmt(Object expected)
	{
		isNotNull();
		bdAssert("ChargeAmt", actual.getChargeAmt(), expected);
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

	public SELF isSameCurrency()
	{
		isNotNull();
		if (!actual.isSameCurrency()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SameCurrency\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSameCurrency()
	{
		isNotNull();
		if (actual.isSameCurrency()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SameCurrency\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSameTax()
	{
		isNotNull();
		if (!actual.isSameTax()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SameTax\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSameTax()
	{
		isNotNull();
		if (actual.isSameTax()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SameTax\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isTaxIncluded()
	{
		isNotNull();
		if (!actual.isTaxIncluded()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be TaxIncluded\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotTaxIncluded()
	{
		isNotNull();
		if (actual.isTaxIncluded()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be TaxIncluded\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}