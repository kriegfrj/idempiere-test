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
import org.compiere.model.X_C_CommissionLine;

/** Generated assertion class for C_CommissionLine
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_CommissionLineAssert
	extends AbstractPOAssert<C_CommissionLineAssert,X_C_CommissionLine>
{

    /** Standard Constructor */
    public C_CommissionLineAssert (X_C_CommissionLine actual)
    {
      super (actual, C_CommissionLineAssert.class);
    }


	public C_CommissionLineAssert hasAmtMultiplier(Object expected)
	{
		isNotNull();
		bdAssert("AmtMultiplier", actual.getAmtMultiplier(), expected);
		return myself;
	}


	public C_CommissionLineAssert hasAmtSubtract(Object expected)
	{
		isNotNull();
		bdAssert("AmtSubtract", actual.getAmtSubtract(), expected);
		return myself;
	}


	public C_CommissionLineAssert hasC_BP_Group_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BP_Group_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BP_Group_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CommissionLineAssert hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CommissionLineAssert hasC_Commission_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Commission_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Commission_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CommissionLineAssert hasC_CommissionLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_CommissionLine_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_CommissionLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CommissionLineAssert hasC_CommissionLine_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_CommissionLine_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_CommissionLine_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CommissionLineAssert hasC_SalesRegion_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_SalesRegion_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_SalesRegion_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CommissionLineAssert isCommissionOrders()
	{
		isNotNull();
		if (!actual.isCommissionOrders()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CommissionOrders\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_CommissionLineAssert isNotCommissionOrders()
	{
		isNotNull();
		if (actual.isCommissionOrders()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CommissionOrders\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_CommissionLineAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CommissionLineAssert isPositiveOnly()
	{
		isNotNull();
		if (!actual.isPositiveOnly()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PositiveOnly\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_CommissionLineAssert isNotPositiveOnly()
	{
		isNotNull();
		if (actual.isPositiveOnly()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PositiveOnly\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_CommissionLineAssert hasLine(int expected)
	{
		isNotNull();
		int actualField = actual.getLine();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Line: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CommissionLineAssert hasM_Product_Category_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_Category_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Product_Category_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CommissionLineAssert hasM_Product_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Product_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CommissionLineAssert hasOrg_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getOrg_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Org_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CommissionLineAssert hasPaymentRule(String expected)
	{
		isNotNull();
		String actualField = actual.getPaymentRule();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PaymentRule: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CommissionLineAssert hasQtyMultiplier(Object expected)
	{
		isNotNull();
		bdAssert("QtyMultiplier", actual.getQtyMultiplier(), expected);
		return myself;
	}


	public C_CommissionLineAssert hasQtySubtract(Object expected)
	{
		isNotNull();
		bdAssert("QtySubtract", actual.getQtySubtract(), expected);
		return myself;
	}

}