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
import org.compiere.model.X_T_DistributionRunDetail;

/** Generated assertion class for T_DistributionRunDetail
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class T_DistributionRunDetailAssert
	extends AbstractPOAssert<T_DistributionRunDetailAssert,X_T_DistributionRunDetail>
{

    /** Standard Constructor */
    public T_DistributionRunDetailAssert (X_T_DistributionRunDetail actual)
    {
      super (actual, T_DistributionRunDetailAssert.class);
    }


	public T_DistributionRunDetailAssert hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_DistributionRunDetailAssert hasC_BPartner_Location_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_Location_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BPartner_Location_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_DistributionRunDetailAssert hasM_DistributionList_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_DistributionList_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_DistributionList_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_DistributionRunDetailAssert hasM_DistributionListLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_DistributionListLine_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_DistributionListLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_DistributionRunDetailAssert hasM_DistributionRun_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_DistributionRun_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_DistributionRun_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_DistributionRunDetailAssert hasM_DistributionRunLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_DistributionRunLine_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_DistributionRunLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_DistributionRunDetailAssert hasM_Product_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Product_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_DistributionRunDetailAssert hasMinQty(Object expected)
	{
		isNotNull();
		bdAssert("MinQty", actual.getMinQty(), expected);
		return myself;
	}


	public T_DistributionRunDetailAssert hasQty(Object expected)
	{
		isNotNull();
		bdAssert("Qty", actual.getQty(), expected);
		return myself;
	}


	public T_DistributionRunDetailAssert hasRatio(Object expected)
	{
		isNotNull();
		bdAssert("Ratio", actual.getRatio(), expected);
		return myself;
	}


	public T_DistributionRunDetailAssert hasT_DistributionRunDetail_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getT_DistributionRunDetail_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have T_DistributionRunDetail_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}