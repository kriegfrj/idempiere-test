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
import org.compiere.model.X_C_CountryGroupCountry;

/** Generated assertion class for C_CountryGroupCountry
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_CountryGroupCountryAssert
	extends AbstractPOAssert<C_CountryGroupCountryAssert,X_C_CountryGroupCountry>
{

    /** Standard Constructor */
    public C_CountryGroupCountryAssert (X_C_CountryGroupCountry actual)
    {
      super (actual, C_CountryGroupCountryAssert.class);
    }


	public C_CountryGroupCountryAssert hasC_Country_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Country_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Country_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CountryGroupCountryAssert hasC_CountryGroup_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_CountryGroup_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_CountryGroup_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CountryGroupCountryAssert hasC_CountryGroupCountry_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_CountryGroupCountry_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_CountryGroupCountry_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CountryGroupCountryAssert hasC_CountryGroupCountry_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_CountryGroupCountry_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_CountryGroupCountry_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CountryGroupCountryAssert hasDateFrom(Object expected)
	{
		isNotNull();
		dateAssert("DateFrom", actual.getDateFrom(), expected);
		return myself;
	}


	public C_CountryGroupCountryAssert hasDateTo(Object expected)
	{
		isNotNull();
		dateAssert("DateTo", actual.getDateTo(), expected);
		return myself;
	}

}