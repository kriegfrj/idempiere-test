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
import org.compiere.model.X_C_RfQResponse;

/** Generated assertion class for C_RfQResponse
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractC_RfQResponseAssert<SELF extends AbstractC_RfQResponseAssert<SELF, ACTUAL>, ACTUAL extends X_C_RfQResponse>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractC_RfQResponseAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAD_User_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_User_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_User_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
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

	public SELF hasC_BPartner_Location_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_Location_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BPartner_Location_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
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

	public SELF hasC_Order_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Order_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Order_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_RfQ_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_RfQ_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_RfQ_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_RfQResponse_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_RfQResponse_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_RfQResponse_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_RfQResponse_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_RfQResponse_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_RfQResponse_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasDateInvited(Object expected)
	{
		isNotNull();
		dateAssert("DateInvited", actual.getDateInvited(), expected);
		return myself;
	}


	public SELF hasDateResponse(Object expected)
	{
		isNotNull();
		dateAssert("DateResponse", actual.getDateResponse(), expected);
		return myself;
	}


	public SELF hasDateWorkComplete(Object expected)
	{
		isNotNull();
		dateAssert("DateWorkComplete", actual.getDateWorkComplete(), expected);
		return myself;
	}


	public SELF hasDateWorkStart(Object expected)
	{
		isNotNull();
		dateAssert("DateWorkStart", actual.getDateWorkStart(), expected);
		return myself;
	}


	public SELF hasDeliveryDays(int expected)
	{
		isNotNull();
		int actualField = actual.getDeliveryDays();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DeliveryDays: <%s>\nbut it was: <%s>",
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

	public SELF hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isComplete()
	{
		isNotNull();
		if (!actual.isComplete()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Complete\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotComplete()
	{
		isNotNull();
		if (actual.isComplete()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Complete\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSelectedWinner()
	{
		isNotNull();
		if (!actual.isSelectedWinner()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SelectedWinner\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSelectedWinner()
	{
		isNotNull();
		if (actual.isSelectedWinner()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SelectedWinner\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSelfService()
	{
		isNotNull();
		if (!actual.isSelfService()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SelfService\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSelfService()
	{
		isNotNull();
		if (actual.isSelfService()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SelfService\nbut it was",
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

	public SELF hasPrice(Object expected)
	{
		isNotNull();
		bdAssert("Price", actual.getPrice(), expected);
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

	public SELF hasRanking(int expected)
	{
		isNotNull();
		int actualField = actual.getRanking();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Ranking: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}