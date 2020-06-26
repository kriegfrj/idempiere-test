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
import org.compiere.model.X_C_RfQ;

/** Generated assertion class for C_RfQ
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_RfQAssert
	extends AbstractPOAssert<C_RfQAssert,X_C_RfQ>
{

    /** Standard Constructor */
    public C_RfQAssert (X_C_RfQ actual)
    {
      super (actual, C_RfQAssert.class);
    }


	public C_RfQAssert hasAD_User_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_User_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_User_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RfQAssert hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RfQAssert hasC_BPartner_Location_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_Location_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BPartner_Location_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RfQAssert hasC_Currency_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Currency_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Currency_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RfQAssert hasC_Order_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Order_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Order_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RfQAssert hasC_RfQ_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_RfQ_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_RfQ_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RfQAssert hasC_RfQ_Topic_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_RfQ_Topic_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_RfQ_Topic_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RfQAssert hasC_RfQ_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_RfQ_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_RfQ_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RfQAssert hasDateResponse(Object expected)
	{
		isNotNull();
		dateAssert("DateResponse", actual.getDateResponse(), expected);
		return myself;
	}


	public C_RfQAssert hasDateWorkComplete(Object expected)
	{
		isNotNull();
		dateAssert("DateWorkComplete", actual.getDateWorkComplete(), expected);
		return myself;
	}


	public C_RfQAssert hasDateWorkStart(Object expected)
	{
		isNotNull();
		dateAssert("DateWorkStart", actual.getDateWorkStart(), expected);
		return myself;
	}


	public C_RfQAssert hasDeliveryDays(int expected)
	{
		isNotNull();
		int actualField = actual.getDeliveryDays();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DeliveryDays: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RfQAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RfQAssert hasDocumentNo(String expected)
	{
		isNotNull();
		String actualField = actual.getDocumentNo();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DocumentNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RfQAssert hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RfQAssert isInvitedVendorsOnly()
	{
		isNotNull();
		if (!actual.isInvitedVendorsOnly()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be InvitedVendorsOnly\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_RfQAssert isNotInvitedVendorsOnly()
	{
		isNotNull();
		if (actual.isInvitedVendorsOnly()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be InvitedVendorsOnly\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_RfQAssert isQuoteAllQty()
	{
		isNotNull();
		if (!actual.isQuoteAllQty()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be QuoteAllQty\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_RfQAssert isNotQuoteAllQty()
	{
		isNotNull();
		if (actual.isQuoteAllQty()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be QuoteAllQty\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_RfQAssert isQuoteTotalAmt()
	{
		isNotNull();
		if (!actual.isQuoteTotalAmt()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be QuoteTotalAmt\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_RfQAssert isNotQuoteTotalAmt()
	{
		isNotNull();
		if (actual.isQuoteTotalAmt()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be QuoteTotalAmt\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_RfQAssert isRfQResponseAccepted()
	{
		isNotNull();
		if (!actual.isRfQResponseAccepted()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be RfQResponseAccepted\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_RfQAssert isNotRfQResponseAccepted()
	{
		isNotNull();
		if (actual.isRfQResponseAccepted()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be RfQResponseAccepted\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_RfQAssert isSelfService()
	{
		isNotNull();
		if (!actual.isSelfService()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SelfService\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_RfQAssert isNotSelfService()
	{
		isNotNull();
		if (actual.isSelfService()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SelfService\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_RfQAssert hasMargin(Object expected)
	{
		isNotNull();
		bdAssert("Margin", actual.getMargin(), expected);
		return myself;
	}


	public C_RfQAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RfQAssert isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_RfQAssert isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_RfQAssert hasQuoteType(String expected)
	{
		isNotNull();
		String actualField = actual.getQuoteType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have QuoteType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RfQAssert hasSalesRep_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getSalesRep_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SalesRep_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}