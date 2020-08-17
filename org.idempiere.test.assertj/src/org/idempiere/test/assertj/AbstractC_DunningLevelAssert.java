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
import org.compiere.model.X_C_DunningLevel;

/** Generated assertion class for C_DunningLevel
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractC_DunningLevelAssert<SELF extends AbstractC_DunningLevelAssert<SELF, ACTUAL>, ACTUAL extends X_C_DunningLevel>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractC_DunningLevelAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasC_Dunning_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Dunning_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Dunning_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_DunningLevel_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_DunningLevel_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_DunningLevel_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_DunningLevel_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_DunningLevel_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_DunningLevel_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_PaymentTerm_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_PaymentTerm_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_PaymentTerm_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isChargeFee()
	{
		isNotNull();
		if (!actual.isChargeFee()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ChargeFee\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotChargeFee()
	{
		isNotNull();
		if (actual.isChargeFee()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ChargeFee\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isChargeInterest()
	{
		isNotNull();
		if (!actual.isChargeInterest()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ChargeInterest\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotChargeInterest()
	{
		isNotNull();
		if (actual.isChargeInterest()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ChargeInterest\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasDaysAfterDue(Object expected)
	{
		isNotNull();
		bdAssert("DaysAfterDue", actual.getDaysAfterDue(), expected);
		return myself;
	}


	public SELF hasDaysBetweenDunning(int expected)
	{
		isNotNull();
		int actualField = actual.getDaysBetweenDunning();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DaysBetweenDunning: <%s>\nbut it was: <%s>",
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

	public SELF hasDunning_PrintFormat_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getDunning_PrintFormat_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Dunning_PrintFormat_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasFeeAmt(Object expected)
	{
		isNotNull();
		bdAssert("FeeAmt", actual.getFeeAmt(), expected);
		return myself;
	}


	public SELF hasInterestPercent(Object expected)
	{
		isNotNull();
		bdAssert("InterestPercent", actual.getInterestPercent(), expected);
		return myself;
	}


	public SELF hasInvoiceCollectionType(String expected)
	{
		isNotNull();
		String actualField = actual.getInvoiceCollectionType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have InvoiceCollectionType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isSetCreditStop()
	{
		isNotNull();
		if (!actual.isSetCreditStop()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SetCreditStop\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSetCreditStop()
	{
		isNotNull();
		if (actual.isSetCreditStop()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SetCreditStop\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSetPaymentTerm()
	{
		isNotNull();
		if (!actual.isSetPaymentTerm()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SetPaymentTerm\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSetPaymentTerm()
	{
		isNotNull();
		if (actual.isSetPaymentTerm()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SetPaymentTerm\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isShowAllDue()
	{
		isNotNull();
		if (!actual.isShowAllDue()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ShowAllDue\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotShowAllDue()
	{
		isNotNull();
		if (actual.isShowAllDue()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ShowAllDue\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isShowNotDue()
	{
		isNotNull();
		if (!actual.isShowNotDue()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ShowNotDue\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotShowNotDue()
	{
		isNotNull();
		if (actual.isShowNotDue()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ShowNotDue\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isStatement()
	{
		isNotNull();
		if (!actual.isStatement()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Statement\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotStatement()
	{
		isNotNull();
		if (actual.isStatement()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Statement\nbut it was",
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

	public SELF hasNote(String expected)
	{
		isNotNull();
		String actualField = actual.getNote();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Note: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPrintName(String expected)
	{
		isNotNull();
		String actualField = actual.getPrintName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PrintName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}