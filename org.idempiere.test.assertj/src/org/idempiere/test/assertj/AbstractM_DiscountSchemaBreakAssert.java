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
import org.compiere.model.X_M_DiscountSchemaBreak;

/** Generated assertion class for M_DiscountSchemaBreak
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractM_DiscountSchemaBreakAssert<SELF extends AbstractM_DiscountSchemaBreakAssert<SELF, ACTUAL>, ACTUAL extends X_M_DiscountSchemaBreak>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractM_DiscountSchemaBreakAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasBreakDiscount(Object expected)
	{
		isNotNull();
		bdAssert("BreakDiscount", actual.getBreakDiscount(), expected);
		return myself;
	}


	public SELF hasBreakValue(Object expected)
	{
		isNotNull();
		bdAssert("BreakValue", actual.getBreakValue(), expected);
		return myself;
	}


	public SELF isBPartnerFlatDiscount()
	{
		isNotNull();
		if (!actual.isBPartnerFlatDiscount()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be BPartnerFlatDiscount\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotBPartnerFlatDiscount()
	{
		isNotNull();
		if (actual.isBPartnerFlatDiscount()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be BPartnerFlatDiscount\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasM_DiscountSchema_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_DiscountSchema_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_DiscountSchema_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_DiscountSchemaBreak_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_DiscountSchemaBreak_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_DiscountSchemaBreak_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_DiscountSchemaBreak_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getM_DiscountSchemaBreak_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_DiscountSchemaBreak_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_Product_Category_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_Category_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Product_Category_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_Product_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Product_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasSeqNo(int expected)
	{
		isNotNull();
		int actualField = actual.getSeqNo();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have SeqNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}