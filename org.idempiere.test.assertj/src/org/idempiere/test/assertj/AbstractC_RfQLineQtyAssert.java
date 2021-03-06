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
import org.compiere.model.X_C_RfQLineQty;

/** Generated assertion class for C_RfQLineQty
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractC_RfQLineQtyAssert<SELF extends AbstractC_RfQLineQtyAssert<SELF, ACTUAL>, ACTUAL extends X_C_RfQLineQty>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractC_RfQLineQtyAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasBenchmarkPrice(Object expected)
	{
		isNotNull();
		bdAssert("BenchmarkPrice", actual.getBenchmarkPrice(), expected);
		return myself;
	}


	public SELF hasBestResponseAmt(Object expected)
	{
		isNotNull();
		bdAssert("BestResponseAmt", actual.getBestResponseAmt(), expected);
		return myself;
	}


	public SELF hasC_RfQLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_RfQLine_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_RfQLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_RfQLineQty_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_RfQLineQty_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_RfQLineQty_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_RfQLineQty_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_RfQLineQty_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_RfQLineQty_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_UOM_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_UOM_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_UOM_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isOfferQty()
	{
		isNotNull();
		if (!actual.isOfferQty()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OfferQty\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotOfferQty()
	{
		isNotNull();
		if (actual.isOfferQty()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OfferQty\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isPurchaseQty()
	{
		isNotNull();
		if (!actual.isPurchaseQty()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PurchaseQty\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPurchaseQty()
	{
		isNotNull();
		if (actual.isPurchaseQty()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PurchaseQty\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isRfQQty()
	{
		isNotNull();
		if (!actual.isRfQQty()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be RfQQty\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotRfQQty()
	{
		isNotNull();
		if (actual.isRfQQty()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be RfQQty\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasMargin(Object expected)
	{
		isNotNull();
		bdAssert("Margin", actual.getMargin(), expected);
		return myself;
	}


	public SELF hasOfferAmt(Object expected)
	{
		isNotNull();
		bdAssert("OfferAmt", actual.getOfferAmt(), expected);
		return myself;
	}


	public SELF hasQty(Object expected)
	{
		isNotNull();
		bdAssert("Qty", actual.getQty(), expected);
		return myself;
	}

}