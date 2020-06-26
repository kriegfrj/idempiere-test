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
import org.compiere.model.X_C_RfQResponse;

/** Generated assertion class for C_RfQResponse
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_RfQResponseAssert
	extends AbstractPOAssert<C_RfQResponseAssert,X_C_RfQResponse>
{

    /** Standard Constructor */
    public C_RfQResponseAssert (X_C_RfQResponse actual)
    {
      super (actual, C_RfQResponseAssert.class);
    }


	public C_RfQResponseAssert hasAD_User_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_User_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_User_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RfQResponseAssert hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RfQResponseAssert hasC_BPartner_Location_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_Location_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BPartner_Location_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RfQResponseAssert hasC_Currency_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Currency_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Currency_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RfQResponseAssert hasC_Order_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Order_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Order_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RfQResponseAssert hasC_RfQ_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_RfQ_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_RfQ_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RfQResponseAssert hasC_RfQResponse_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_RfQResponse_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_RfQResponse_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RfQResponseAssert hasC_RfQResponse_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_RfQResponse_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_RfQResponse_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RfQResponseAssert hasDateInvited(Object expected)
	{
		isNotNull();
		dateAssert("DateInvited", actual.getDateInvited(), expected);
		return myself;
	}


	public C_RfQResponseAssert hasDateResponse(Object expected)
	{
		isNotNull();
		dateAssert("DateResponse", actual.getDateResponse(), expected);
		return myself;
	}


	public C_RfQResponseAssert hasDateWorkComplete(Object expected)
	{
		isNotNull();
		dateAssert("DateWorkComplete", actual.getDateWorkComplete(), expected);
		return myself;
	}


	public C_RfQResponseAssert hasDateWorkStart(Object expected)
	{
		isNotNull();
		dateAssert("DateWorkStart", actual.getDateWorkStart(), expected);
		return myself;
	}


	public C_RfQResponseAssert hasDeliveryDays(int expected)
	{
		isNotNull();
		int actualField = actual.getDeliveryDays();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DeliveryDays: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RfQResponseAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RfQResponseAssert hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RfQResponseAssert isComplete()
	{
		isNotNull();
		if (!actual.isComplete()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Complete\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_RfQResponseAssert isNotComplete()
	{
		isNotNull();
		if (actual.isComplete()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Complete\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_RfQResponseAssert isSelectedWinner()
	{
		isNotNull();
		if (!actual.isSelectedWinner()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SelectedWinner\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_RfQResponseAssert isNotSelectedWinner()
	{
		isNotNull();
		if (actual.isSelectedWinner()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SelectedWinner\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_RfQResponseAssert isSelfService()
	{
		isNotNull();
		if (!actual.isSelfService()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SelfService\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_RfQResponseAssert isNotSelfService()
	{
		isNotNull();
		if (actual.isSelfService()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SelfService\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_RfQResponseAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RfQResponseAssert hasPrice(Object expected)
	{
		isNotNull();
		bdAssert("Price", actual.getPrice(), expected);
		return myself;
	}


	public C_RfQResponseAssert isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_RfQResponseAssert isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_RfQResponseAssert hasRanking(int expected)
	{
		isNotNull();
		int actualField = actual.getRanking();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Ranking: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}