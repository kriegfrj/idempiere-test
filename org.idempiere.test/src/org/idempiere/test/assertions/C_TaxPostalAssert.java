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
import org.compiere.model.X_C_TaxPostal;

/** Generated assertion class for C_TaxPostal
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_TaxPostalAssert
	extends AbstractPOAssert<C_TaxPostalAssert,X_C_TaxPostal>
{

    /** Standard Constructor */
    public C_TaxPostalAssert (X_C_TaxPostal actual)
    {
      super (actual, C_TaxPostalAssert.class);
    }


	public C_TaxPostalAssert hasC_Tax_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Tax_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Tax_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_TaxPostalAssert hasC_TaxPostal_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_TaxPostal_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_TaxPostal_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_TaxPostalAssert hasC_TaxPostal_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_TaxPostal_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_TaxPostal_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_TaxPostalAssert hasPostal(String expected)
	{
		isNotNull();
		String actualField = actual.getPostal();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Postal: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_TaxPostalAssert hasPostal_To(String expected)
	{
		isNotNull();
		String actualField = actual.getPostal_To();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Postal_To: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}