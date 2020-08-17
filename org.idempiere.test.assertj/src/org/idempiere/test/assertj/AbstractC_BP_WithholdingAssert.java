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
import org.compiere.model.X_C_BP_Withholding;

/** Generated assertion class for C_BP_Withholding
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractC_BP_WithholdingAssert<SELF extends AbstractC_BP_WithholdingAssert<SELF, ACTUAL>, ACTUAL extends X_C_BP_Withholding>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractC_BP_WithholdingAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasC_BP_Withholding_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_BP_Withholding_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BP_Withholding_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
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

	public SELF hasC_Withholding_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Withholding_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Withholding_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasExemptReason(String expected)
	{
		isNotNull();
		String actualField = actual.getExemptReason();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ExemptReason: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isMandatoryWithholding()
	{
		isNotNull();
		if (!actual.isMandatoryWithholding()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be MandatoryWithholding\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotMandatoryWithholding()
	{
		isNotNull();
		if (actual.isMandatoryWithholding()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be MandatoryWithholding\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isTemporaryExempt()
	{
		isNotNull();
		if (!actual.isTemporaryExempt()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be TemporaryExempt\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotTemporaryExempt()
	{
		isNotNull();
		if (actual.isTemporaryExempt()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be TemporaryExempt\nbut it was",
				getPODescription());
		}
		return myself;
	}
}