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
import org.compiere.model.X_C_RfQResponseLineQty;

/** Generated assertion class for C_RfQResponseLineQty
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_RfQResponseLineQtyAssert
	extends AbstractPOAssert<C_RfQResponseLineQtyAssert,X_C_RfQResponseLineQty>
{

    /** Standard Constructor */
    public C_RfQResponseLineQtyAssert (X_C_RfQResponseLineQty actual)
    {
      super (actual, C_RfQResponseLineQtyAssert.class);
    }


	public C_RfQResponseLineQtyAssert hasC_RfQLineQty_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_RfQLineQty_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_RfQLineQty_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RfQResponseLineQtyAssert hasC_RfQResponseLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_RfQResponseLine_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_RfQResponseLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RfQResponseLineQtyAssert hasC_RfQResponseLineQty_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_RfQResponseLineQty_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_RfQResponseLineQty_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RfQResponseLineQtyAssert hasC_RfQResponseLineQty_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_RfQResponseLineQty_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_RfQResponseLineQty_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RfQResponseLineQtyAssert hasDiscount(Object expected)
	{
		isNotNull();
		bdAssert("Discount", actual.getDiscount(), expected);
		return myself;
	}


	public C_RfQResponseLineQtyAssert hasPrice(Object expected)
	{
		isNotNull();
		bdAssert("Price", actual.getPrice(), expected);
		return myself;
	}


	public C_RfQResponseLineQtyAssert hasRanking(int expected)
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