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
import org.compiere.model.X_C_Withholding;

/** Generated assertion class for C_Withholding
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_WithholdingAssert
	extends AbstractPOAssert<C_WithholdingAssert,X_C_Withholding>
{

    /** Standard Constructor */
    public C_WithholdingAssert (X_C_Withholding actual)
    {
      super (actual, C_WithholdingAssert.class);
    }


	public C_WithholdingAssert hasBeneficiary(int expected)
	{
		isNotNull();
		int actualField = actual.getBeneficiary();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Beneficiary: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_WithholdingAssert hasC_PaymentTerm_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_PaymentTerm_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_PaymentTerm_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_WithholdingAssert hasC_Withholding_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Withholding_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Withholding_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_WithholdingAssert hasC_Withholding_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_Withholding_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Withholding_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_WithholdingAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_WithholdingAssert hasFixAmt(Object expected)
	{
		isNotNull();
		bdAssert("FixAmt", actual.getFixAmt(), expected);
		return myself;
	}


	public C_WithholdingAssert isPaidTo3Party()
	{
		isNotNull();
		if (!actual.isPaidTo3Party()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PaidTo3Party\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_WithholdingAssert isNotPaidTo3Party()
	{
		isNotNull();
		if (actual.isPaidTo3Party()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PaidTo3Party\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_WithholdingAssert isPercentWithholding()
	{
		isNotNull();
		if (!actual.isPercentWithholding()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PercentWithholding\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_WithholdingAssert isNotPercentWithholding()
	{
		isNotNull();
		if (actual.isPercentWithholding()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PercentWithholding\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_WithholdingAssert isTaxProrated()
	{
		isNotNull();
		if (!actual.isTaxProrated()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be TaxProrated\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_WithholdingAssert isNotTaxProrated()
	{
		isNotNull();
		if (actual.isTaxProrated()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be TaxProrated\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_WithholdingAssert isTaxWithholding()
	{
		isNotNull();
		if (!actual.isTaxWithholding()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be TaxWithholding\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_WithholdingAssert isNotTaxWithholding()
	{
		isNotNull();
		if (actual.isTaxWithholding()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be TaxWithholding\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_WithholdingAssert hasMaxAmt(Object expected)
	{
		isNotNull();
		bdAssert("MaxAmt", actual.getMaxAmt(), expected);
		return myself;
	}


	public C_WithholdingAssert hasMinAmt(Object expected)
	{
		isNotNull();
		bdAssert("MinAmt", actual.getMinAmt(), expected);
		return myself;
	}


	public C_WithholdingAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_WithholdingAssert hasPercent(Object expected)
	{
		isNotNull();
		bdAssert("Percent", actual.getPercent(), expected);
		return myself;
	}


	public C_WithholdingAssert hasThresholdMax(Object expected)
	{
		isNotNull();
		bdAssert("ThresholdMax", actual.getThresholdMax(), expected);
		return myself;
	}


	public C_WithholdingAssert hasThresholdmin(Object expected)
	{
		isNotNull();
		bdAssert("Thresholdmin", actual.getThresholdmin(), expected);
		return myself;
	}

}