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
import org.compiere.model.X_M_DiscountSchema;

/** Generated assertion class for M_DiscountSchema
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class M_DiscountSchemaAssert
	extends AbstractPOAssert<M_DiscountSchemaAssert,X_M_DiscountSchema>
{

    /** Standard Constructor */
    public M_DiscountSchemaAssert (X_M_DiscountSchema actual)
    {
      super (actual, M_DiscountSchemaAssert.class);
    }


	public M_DiscountSchemaAssert hasCumulativeLevel(String expected)
	{
		isNotNull();
		String actualField = actual.getCumulativeLevel();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CumulativeLevel: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_DiscountSchemaAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_DiscountSchemaAssert hasDiscountType(String expected)
	{
		isNotNull();
		String actualField = actual.getDiscountType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DiscountType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_DiscountSchemaAssert hasFlatDiscount(Object expected)
	{
		isNotNull();
		bdAssert("FlatDiscount", actual.getFlatDiscount(), expected);
		return myself;
	}


	public M_DiscountSchemaAssert isBPartnerFlatDiscount()
	{
		isNotNull();
		if (!actual.isBPartnerFlatDiscount()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be BPartnerFlatDiscount\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_DiscountSchemaAssert isNotBPartnerFlatDiscount()
	{
		isNotNull();
		if (actual.isBPartnerFlatDiscount()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be BPartnerFlatDiscount\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_DiscountSchemaAssert isQuantityBased()
	{
		isNotNull();
		if (!actual.isQuantityBased()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be QuantityBased\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_DiscountSchemaAssert isNotQuantityBased()
	{
		isNotNull();
		if (actual.isQuantityBased()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be QuantityBased\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_DiscountSchemaAssert hasM_DiscountSchema_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_DiscountSchema_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_DiscountSchema_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_DiscountSchemaAssert hasM_DiscountSchema_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getM_DiscountSchema_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_DiscountSchema_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_DiscountSchemaAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_DiscountSchemaAssert hasScript(String expected)
	{
		isNotNull();
		String actualField = actual.getScript();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Script: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_DiscountSchemaAssert hasValidFrom(Object expected)
	{
		isNotNull();
		dateAssert("ValidFrom", actual.getValidFrom(), expected);
		return myself;
	}

}