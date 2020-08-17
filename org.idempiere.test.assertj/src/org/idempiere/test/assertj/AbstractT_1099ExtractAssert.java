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
import org.compiere.model.X_T_1099Extract;

/** Generated assertion class for T_1099Extract
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractT_1099ExtractAssert<SELF extends AbstractT_1099ExtractAssert<SELF, ACTUAL>, ACTUAL extends X_T_1099Extract>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractT_1099ExtractAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAD_PInstance_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PInstance_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_PInstance_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAmtBucket01(Object expected)
	{
		isNotNull();
		bdAssert("AmtBucket01", actual.getAmtBucket01(), expected);
		return myself;
	}


	public SELF hasAmtBucket02(Object expected)
	{
		isNotNull();
		bdAssert("AmtBucket02", actual.getAmtBucket02(), expected);
		return myself;
	}


	public SELF hasAmtBucket03(Object expected)
	{
		isNotNull();
		bdAssert("AmtBucket03", actual.getAmtBucket03(), expected);
		return myself;
	}


	public SELF hasAmtBucket04(Object expected)
	{
		isNotNull();
		bdAssert("AmtBucket04", actual.getAmtBucket04(), expected);
		return myself;
	}


	public SELF hasAmtBucket05(Object expected)
	{
		isNotNull();
		bdAssert("AmtBucket05", actual.getAmtBucket05(), expected);
		return myself;
	}


	public SELF hasAmtBucket06(Object expected)
	{
		isNotNull();
		bdAssert("AmtBucket06", actual.getAmtBucket06(), expected);
		return myself;
	}


	public SELF hasAmtBucket07(Object expected)
	{
		isNotNull();
		bdAssert("AmtBucket07", actual.getAmtBucket07(), expected);
		return myself;
	}


	public SELF hasAmtBucket08(Object expected)
	{
		isNotNull();
		bdAssert("AmtBucket08", actual.getAmtBucket08(), expected);
		return myself;
	}


	public SELF hasAmtBucket09(Object expected)
	{
		isNotNull();
		bdAssert("AmtBucket09", actual.getAmtBucket09(), expected);
		return myself;
	}


	public SELF hasAmtBucket10(Object expected)
	{
		isNotNull();
		bdAssert("AmtBucket10", actual.getAmtBucket10(), expected);
		return myself;
	}


	public SELF hasAmtBucket11(Object expected)
	{
		isNotNull();
		bdAssert("AmtBucket11", actual.getAmtBucket11(), expected);
		return myself;
	}


	public SELF hasAmtBucket12(Object expected)
	{
		isNotNull();
		bdAssert("AmtBucket12", actual.getAmtBucket12(), expected);
		return myself;
	}


	public SELF hasAmtBucket13(Object expected)
	{
		isNotNull();
		bdAssert("AmtBucket13", actual.getAmtBucket13(), expected);
		return myself;
	}


	public SELF hasAmtBucket14(Object expected)
	{
		isNotNull();
		bdAssert("AmtBucket14", actual.getAmtBucket14(), expected);
		return myself;
	}


	public SELF hasAmtBucket15(Object expected)
	{
		isNotNull();
		bdAssert("AmtBucket15", actual.getAmtBucket15(), expected);
		return myself;
	}


	public SELF hasAmtBucket16(Object expected)
	{
		isNotNull();
		bdAssert("AmtBucket16", actual.getAmtBucket16(), expected);
		return myself;
	}


	public SELF hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Location_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Location_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Location_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasCut_Date(Object expected)
	{
		isNotNull();
		dateAssert("Cut_Date", actual.getCut_Date(), expected);
		return myself;
	}


	public SELF hasCut_Year(int expected)
	{
		isNotNull();
		int actualField = actual.getCut_Year();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Cut_Year: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasT_1099Extract_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getT_1099Extract_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have T_1099Extract_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasTaxID(String expected)
	{
		isNotNull();
		String actualField = actual.getTaxID();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have TaxID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasValue(String expected)
	{
		isNotNull();
		String actualField = actual.getValue();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Value: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}