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
import org.compiere.model.X_B_Bid;

/** Generated assertion class for B_Bid
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class B_BidAssert
	extends AbstractPOAssert<B_BidAssert,X_B_Bid>
{

    /** Standard Constructor */
    public B_BidAssert (X_B_Bid actual)
    {
      super (actual, B_BidAssert.class);
    }


	public B_BidAssert hasAD_User_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_User_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_User_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public B_BidAssert hasB_Bid_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getB_Bid_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have B_Bid_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public B_BidAssert hasB_Bid_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getB_Bid_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have B_Bid_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public B_BidAssert hasB_BuyerFunds_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getB_BuyerFunds_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have B_BuyerFunds_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public B_BidAssert hasB_Topic_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getB_Topic_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have B_Topic_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public B_BidAssert isWillingToCommit()
	{
		isNotNull();
		if (!actual.isWillingToCommit()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be WillingToCommit\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public B_BidAssert isNotWillingToCommit()
	{
		isNotNull();
		if (actual.isWillingToCommit()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be WillingToCommit\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public B_BidAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public B_BidAssert hasPrivateNote(String expected)
	{
		isNotNull();
		String actualField = actual.getPrivateNote();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PrivateNote: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public B_BidAssert hasTextMsg(String expected)
	{
		isNotNull();
		String actualField = actual.getTextMsg();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have TextMsg: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}