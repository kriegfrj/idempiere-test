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

import javax.annotation.Generated;
import org.assertj.core.util.Objects;
import org.compiere.model.X_C_DunningLevel;

/** Generated assertion class for C_DunningLevel
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_DunningLevelAssert
	extends AbstractPOAssert<C_DunningLevelAssert,X_C_DunningLevel>
{

    /** Standard Constructor */
    public C_DunningLevelAssert (X_C_DunningLevel actual)
    {
      super (actual, C_DunningLevelAssert.class);
    }


	public C_DunningLevelAssert hasC_Dunning_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Dunning_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Dunning_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DunningLevelAssert hasC_DunningLevel_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_DunningLevel_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_DunningLevel_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DunningLevelAssert hasC_DunningLevel_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_DunningLevel_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_DunningLevel_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DunningLevelAssert hasC_PaymentTerm_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_PaymentTerm_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_PaymentTerm_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DunningLevelAssert isChargeFee()
	{
		isNotNull();
		if (!actual.isChargeFee()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ChargeFee\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_DunningLevelAssert isNotChargeFee()
	{
		isNotNull();
		if (actual.isChargeFee()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ChargeFee\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_DunningLevelAssert isChargeInterest()
	{
		isNotNull();
		if (!actual.isChargeInterest()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ChargeInterest\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_DunningLevelAssert isNotChargeInterest()
	{
		isNotNull();
		if (actual.isChargeInterest()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ChargeInterest\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_DunningLevelAssert hasDaysAfterDue(Object expected)
	{
		isNotNull();
		bdAssert("DaysAfterDue", actual.getDaysAfterDue(), expected);
		return myself;
	}


	public C_DunningLevelAssert hasDaysBetweenDunning(int expected)
	{
		isNotNull();
		int actualField = actual.getDaysBetweenDunning();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DaysBetweenDunning: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DunningLevelAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DunningLevelAssert hasDunning_PrintFormat_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getDunning_PrintFormat_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Dunning_PrintFormat_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DunningLevelAssert hasFeeAmt(Object expected)
	{
		isNotNull();
		bdAssert("FeeAmt", actual.getFeeAmt(), expected);
		return myself;
	}


	public C_DunningLevelAssert hasInterestPercent(Object expected)
	{
		isNotNull();
		bdAssert("InterestPercent", actual.getInterestPercent(), expected);
		return myself;
	}


	public C_DunningLevelAssert hasInvoiceCollectionType(String expected)
	{
		isNotNull();
		String actualField = actual.getInvoiceCollectionType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have InvoiceCollectionType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DunningLevelAssert isSetCreditStop()
	{
		isNotNull();
		if (!actual.isSetCreditStop()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SetCreditStop\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_DunningLevelAssert isNotSetCreditStop()
	{
		isNotNull();
		if (actual.isSetCreditStop()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SetCreditStop\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_DunningLevelAssert isSetPaymentTerm()
	{
		isNotNull();
		if (!actual.isSetPaymentTerm()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SetPaymentTerm\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_DunningLevelAssert isNotSetPaymentTerm()
	{
		isNotNull();
		if (actual.isSetPaymentTerm()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SetPaymentTerm\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_DunningLevelAssert isShowAllDue()
	{
		isNotNull();
		if (!actual.isShowAllDue()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ShowAllDue\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_DunningLevelAssert isNotShowAllDue()
	{
		isNotNull();
		if (actual.isShowAllDue()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ShowAllDue\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_DunningLevelAssert isShowNotDue()
	{
		isNotNull();
		if (!actual.isShowNotDue()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ShowNotDue\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_DunningLevelAssert isNotShowNotDue()
	{
		isNotNull();
		if (actual.isShowNotDue()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ShowNotDue\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_DunningLevelAssert isStatement()
	{
		isNotNull();
		if (!actual.isStatement()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Statement\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_DunningLevelAssert isNotStatement()
	{
		isNotNull();
		if (actual.isStatement()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Statement\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_DunningLevelAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DunningLevelAssert hasNote(String expected)
	{
		isNotNull();
		String actualField = actual.getNote();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Note: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DunningLevelAssert hasPrintName(String expected)
	{
		isNotNull();
		String actualField = actual.getPrintName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PrintName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}