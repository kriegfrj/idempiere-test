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
import org.compiere.model.X_M_ProductPriceVendorBreak;

/** Generated assertion class for M_ProductPriceVendorBreak
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class M_ProductPriceVendorBreakAssert
	extends AbstractPOAssert<M_ProductPriceVendorBreakAssert,X_M_ProductPriceVendorBreak>
{

    /** Standard Constructor */
    public M_ProductPriceVendorBreakAssert (X_M_ProductPriceVendorBreak actual)
    {
      super (actual, M_ProductPriceVendorBreakAssert.class);
    }


	public M_ProductPriceVendorBreakAssert hasBreakValue(Object expected)
	{
		isNotNull();
		bdAssert("BreakValue", actual.getBreakValue(), expected);
		return myself;
	}


	public M_ProductPriceVendorBreakAssert hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductPriceVendorBreakAssert hasM_PriceList_Version_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_PriceList_Version_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_PriceList_Version_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductPriceVendorBreakAssert hasM_Product_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Product_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductPriceVendorBreakAssert hasM_ProductPriceVendorBreak_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_ProductPriceVendorBreak_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_ProductPriceVendorBreak_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductPriceVendorBreakAssert hasM_ProductPriceVendorBreak_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getM_ProductPriceVendorBreak_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_ProductPriceVendorBreak_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductPriceVendorBreakAssert hasPriceLimit(Object expected)
	{
		isNotNull();
		bdAssert("PriceLimit", actual.getPriceLimit(), expected);
		return myself;
	}


	public M_ProductPriceVendorBreakAssert hasPriceList(Object expected)
	{
		isNotNull();
		bdAssert("PriceList", actual.getPriceList(), expected);
		return myself;
	}


	public M_ProductPriceVendorBreakAssert hasPriceStd(Object expected)
	{
		isNotNull();
		bdAssert("PriceStd", actual.getPriceStd(), expected);
		return myself;
	}

}