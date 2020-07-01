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
import org.compiere.model.X_C_Subscription;

/** Generated assertion class for C_Subscription
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_SubscriptionAssert
	extends AbstractPOAssert<C_SubscriptionAssert,X_C_Subscription>
{

    /** Standard Constructor */
    public C_SubscriptionAssert (X_C_Subscription actual)
    {
      super (actual, C_SubscriptionAssert.class);
    }


	public C_SubscriptionAssert hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_SubscriptionAssert hasC_Subscription_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Subscription_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Subscription_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_SubscriptionAssert hasC_Subscription_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_Subscription_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Subscription_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_SubscriptionAssert hasC_SubscriptionType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_SubscriptionType_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_SubscriptionType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_SubscriptionAssert isDue()
	{
		isNotNull();
		if (!actual.isDue()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Due\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_SubscriptionAssert isNotDue()
	{
		isNotNull();
		if (actual.isDue()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Due\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_SubscriptionAssert hasM_Product_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Product_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_SubscriptionAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_SubscriptionAssert hasPaidUntilDate(Object expected)
	{
		isNotNull();
		dateAssert("PaidUntilDate", actual.getPaidUntilDate(), expected);
		return myself;
	}


	public C_SubscriptionAssert hasRenewalDate(Object expected)
	{
		isNotNull();
		dateAssert("RenewalDate", actual.getRenewalDate(), expected);
		return myself;
	}


	public C_SubscriptionAssert hasStartDate(Object expected)
	{
		isNotNull();
		dateAssert("StartDate", actual.getStartDate(), expected);
		return myself;
	}

}