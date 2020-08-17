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
import org.compiere.model.X_C_PaySelectionLine;

/** Generated assertion class for C_PaySelectionLine
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractC_PaySelectionLineAssert<SELF extends AbstractC_PaySelectionLineAssert<SELF, ACTUAL>, ACTUAL extends X_C_PaySelectionLine>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractC_PaySelectionLineAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasC_Invoice_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Invoice_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Invoice_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_PaySelection_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_PaySelection_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_PaySelection_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_PaySelectionCheck_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_PaySelectionCheck_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_PaySelectionCheck_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_PaySelectionLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_PaySelectionLine_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_PaySelectionLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_PaySelectionLine_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_PaySelectionLine_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_PaySelectionLine_UU: <%s>\nbut it was: <%s>",
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

	public SELF hasDifferenceAmt(Object expected)
	{
		isNotNull();
		bdAssert("DifferenceAmt", actual.getDifferenceAmt(), expected);
		return myself;
	}


	public SELF hasDiscountAmt(Object expected)
	{
		isNotNull();
		bdAssert("DiscountAmt", actual.getDiscountAmt(), expected);
		return myself;
	}


	public SELF isManual()
	{
		isNotNull();
		if (!actual.isManual()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Manual\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotManual()
	{
		isNotNull();
		if (actual.isManual()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Manual\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSOTrx()
	{
		isNotNull();
		if (!actual.isSOTrx()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SOTrx\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSOTrx()
	{
		isNotNull();
		if (actual.isSOTrx()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SOTrx\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasLine(int expected)
	{
		isNotNull();
		int actualField = actual.getLine();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Line: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasOpenAmt(Object expected)
	{
		isNotNull();
		bdAssert("OpenAmt", actual.getOpenAmt(), expected);
		return myself;
	}


	public SELF hasPayAmt(Object expected)
	{
		isNotNull();
		bdAssert("PayAmt", actual.getPayAmt(), expected);
		return myself;
	}


	public SELF hasPaymentRule(String expected)
	{
		isNotNull();
		String actualField = actual.getPaymentRule();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PaymentRule: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasWriteOffAmt(Object expected)
	{
		isNotNull();
		bdAssert("WriteOffAmt", actual.getWriteOffAmt(), expected);
		return myself;
	}

}