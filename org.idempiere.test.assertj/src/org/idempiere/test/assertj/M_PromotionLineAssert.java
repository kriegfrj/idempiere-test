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
import org.compiere.model.X_M_PromotionLine;

/** Generated assertion class for M_PromotionLine
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class M_PromotionLineAssert
	extends AbstractPOAssert<M_PromotionLineAssert,X_M_PromotionLine>
{

    /** Standard Constructor */
    public M_PromotionLineAssert (X_M_PromotionLine actual)
    {
      super (actual, M_PromotionLineAssert.class);
    }


	public M_PromotionLineAssert isMandatoryPL()
	{
		isNotNull();
		if (!actual.isMandatoryPL()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be MandatoryPL\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_PromotionLineAssert isNotMandatoryPL()
	{
		isNotNull();
		if (actual.isMandatoryPL()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be MandatoryPL\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_PromotionLineAssert hasM_Promotion_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Promotion_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Promotion_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PromotionLineAssert hasM_PromotionGroup_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_PromotionGroup_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_PromotionGroup_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PromotionLineAssert hasM_PromotionLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_PromotionLine_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_PromotionLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PromotionLineAssert hasM_PromotionLine_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getM_PromotionLine_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_PromotionLine_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PromotionLineAssert hasMinimumAmt(Object expected)
	{
		isNotNull();
		bdAssert("MinimumAmt", actual.getMinimumAmt(), expected);
		return myself;
	}

}