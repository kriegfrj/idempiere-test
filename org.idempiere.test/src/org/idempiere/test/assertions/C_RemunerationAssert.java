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
import org.compiere.model.X_C_Remuneration;

/** Generated assertion class for C_Remuneration
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_RemunerationAssert
	extends AbstractPOAssert<C_RemunerationAssert,X_C_Remuneration>
{

    /** Standard Constructor */
    public C_RemunerationAssert (X_C_Remuneration actual)
    {
      super (actual, C_RemunerationAssert.class);
    }


	public C_RemunerationAssert hasC_Remuneration_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Remuneration_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Remuneration_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RemunerationAssert hasC_Remuneration_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_Remuneration_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Remuneration_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RemunerationAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RemunerationAssert hasGrossRAmt(Object expected)
	{
		isNotNull();
		bdAssert("GrossRAmt", actual.getGrossRAmt(), expected);
		return myself;
	}


	public C_RemunerationAssert hasGrossRCost(Object expected)
	{
		isNotNull();
		bdAssert("GrossRCost", actual.getGrossRCost(), expected);
		return myself;
	}


	public C_RemunerationAssert hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RemunerationAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RemunerationAssert hasOvertimeAmt(Object expected)
	{
		isNotNull();
		bdAssert("OvertimeAmt", actual.getOvertimeAmt(), expected);
		return myself;
	}


	public C_RemunerationAssert hasOvertimeCost(Object expected)
	{
		isNotNull();
		bdAssert("OvertimeCost", actual.getOvertimeCost(), expected);
		return myself;
	}


	public C_RemunerationAssert hasRemunerationType(String expected)
	{
		isNotNull();
		String actualField = actual.getRemunerationType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have RemunerationType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RemunerationAssert hasStandardHours(int expected)
	{
		isNotNull();
		int actualField = actual.getStandardHours();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have StandardHours: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}