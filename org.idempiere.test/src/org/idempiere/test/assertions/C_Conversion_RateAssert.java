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
import org.compiere.model.X_C_Conversion_Rate;

/** Generated assertion class for C_Conversion_Rate
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_Conversion_RateAssert
	extends AbstractPOAssert<C_Conversion_RateAssert,X_C_Conversion_Rate>
{

    /** Standard Constructor */
    public C_Conversion_RateAssert (X_C_Conversion_Rate actual)
    {
      super (actual, C_Conversion_RateAssert.class);
    }


	public C_Conversion_RateAssert hasC_Conversion_Rate_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Conversion_Rate_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Conversion_Rate_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_Conversion_RateAssert hasC_Conversion_Rate_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_Conversion_Rate_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Conversion_Rate_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_Conversion_RateAssert hasC_ConversionType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ConversionType_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_ConversionType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_Conversion_RateAssert hasC_Currency_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Currency_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Currency_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_Conversion_RateAssert hasC_Currency_ID_To(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Currency_ID_To();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Currency_ID_To: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_Conversion_RateAssert hasDivideRate(Object expected)
	{
		isNotNull();
		bdAssert("DivideRate", actual.getDivideRate(), expected);
		return myself;
	}


	public C_Conversion_RateAssert hasMultiplyRate(Object expected)
	{
		isNotNull();
		bdAssert("MultiplyRate", actual.getMultiplyRate(), expected);
		return myself;
	}


	public C_Conversion_RateAssert hasValidFrom(Object expected)
	{
		isNotNull();
		dateAssert("ValidFrom", actual.getValidFrom(), expected);
		return myself;
	}


	public C_Conversion_RateAssert hasValidTo(Object expected)
	{
		isNotNull();
		dateAssert("ValidTo", actual.getValidTo(), expected);
		return myself;
	}

}