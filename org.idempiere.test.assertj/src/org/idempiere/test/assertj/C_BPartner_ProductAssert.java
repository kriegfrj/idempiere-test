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
import org.compiere.model.X_C_BPartner_Product;

/** Generated assertion class for C_BPartner_Product
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_BPartner_ProductAssert
	extends AbstractPOAssert<C_BPartner_ProductAssert,X_C_BPartner_Product>
{

    /** Standard Constructor */
    public C_BPartner_ProductAssert (X_C_BPartner_Product actual)
    {
      super (actual, C_BPartner_ProductAssert.class);
    }


	public C_BPartner_ProductAssert hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartner_ProductAssert hasC_BPartner_Product_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_BPartner_Product_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BPartner_Product_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartner_ProductAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartner_ProductAssert isManufacturer()
	{
		isNotNull();
		if (!actual.isManufacturer()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Manufacturer\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BPartner_ProductAssert isNotManufacturer()
	{
		isNotNull();
		if (actual.isManufacturer()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Manufacturer\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BPartner_ProductAssert hasM_Product_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Product_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartner_ProductAssert hasManufacturer(String expected)
	{
		isNotNull();
		String actualField = actual.getManufacturer();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Manufacturer: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartner_ProductAssert hasQualityRating(Object expected)
	{
		isNotNull();
		bdAssert("QualityRating", actual.getQualityRating(), expected);
		return myself;
	}


	public C_BPartner_ProductAssert hasShelfLifeMinDays(int expected)
	{
		isNotNull();
		int actualField = actual.getShelfLifeMinDays();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ShelfLifeMinDays: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartner_ProductAssert hasShelfLifeMinPct(int expected)
	{
		isNotNull();
		int actualField = actual.getShelfLifeMinPct();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ShelfLifeMinPct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartner_ProductAssert hasVendorCategory(String expected)
	{
		isNotNull();
		String actualField = actual.getVendorCategory();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have VendorCategory: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BPartner_ProductAssert hasVendorProductNo(String expected)
	{
		isNotNull();
		String actualField = actual.getVendorProductNo();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have VendorProductNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}