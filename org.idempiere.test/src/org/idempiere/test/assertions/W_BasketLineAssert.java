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
import org.compiere.model.X_W_BasketLine;

/** Generated assertion class for W_BasketLine
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class W_BasketLineAssert
	extends AbstractPOAssert<W_BasketLineAssert,X_W_BasketLine>
{

    /** Standard Constructor */
    public W_BasketLineAssert (X_W_BasketLine actual)
    {
      super (actual, W_BasketLineAssert.class);
    }


	public W_BasketLineAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public W_BasketLineAssert hasLine(int expected)
	{
		isNotNull();
		int actualField = actual.getLine();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Line: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public W_BasketLineAssert hasM_Product_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Product_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public W_BasketLineAssert hasPrice(Object expected)
	{
		isNotNull();
		bdAssert("Price", actual.getPrice(), expected);
		return myself;
	}


	public W_BasketLineAssert hasProduct(String expected)
	{
		isNotNull();
		String actualField = actual.getProduct();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Product: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public W_BasketLineAssert hasQty(Object expected)
	{
		isNotNull();
		bdAssert("Qty", actual.getQty(), expected);
		return myself;
	}


	public W_BasketLineAssert hasW_Basket_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getW_Basket_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have W_Basket_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public W_BasketLineAssert hasW_BasketLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getW_BasketLine_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have W_BasketLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public W_BasketLineAssert hasW_BasketLine_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getW_BasketLine_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have W_BasketLine_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}