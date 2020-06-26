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
import org.compiere.model.X_C_UserRemuneration;

/** Generated assertion class for C_UserRemuneration
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_UserRemunerationAssert
	extends AbstractPOAssert<C_UserRemunerationAssert,X_C_UserRemuneration>
{

    /** Standard Constructor */
    public C_UserRemunerationAssert (X_C_UserRemuneration actual)
    {
      super (actual, C_UserRemunerationAssert.class);
    }


	public C_UserRemunerationAssert hasAD_User_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_User_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_User_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_UserRemunerationAssert hasC_Remuneration_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Remuneration_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Remuneration_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_UserRemunerationAssert hasC_UserRemuneration_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_UserRemuneration_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_UserRemuneration_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_UserRemunerationAssert hasC_UserRemuneration_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_UserRemuneration_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_UserRemuneration_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_UserRemunerationAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_UserRemunerationAssert hasGrossRAmt(Object expected)
	{
		isNotNull();
		bdAssert("GrossRAmt", actual.getGrossRAmt(), expected);
		return myself;
	}


	public C_UserRemunerationAssert hasGrossRCost(Object expected)
	{
		isNotNull();
		bdAssert("GrossRCost", actual.getGrossRCost(), expected);
		return myself;
	}


	public C_UserRemunerationAssert hasOvertimeAmt(Object expected)
	{
		isNotNull();
		bdAssert("OvertimeAmt", actual.getOvertimeAmt(), expected);
		return myself;
	}


	public C_UserRemunerationAssert hasOvertimeCost(Object expected)
	{
		isNotNull();
		bdAssert("OvertimeCost", actual.getOvertimeCost(), expected);
		return myself;
	}


	public C_UserRemunerationAssert hasValidFrom(Object expected)
	{
		isNotNull();
		dateAssert("ValidFrom", actual.getValidFrom(), expected);
		return myself;
	}


	public C_UserRemunerationAssert hasValidTo(Object expected)
	{
		isNotNull();
		dateAssert("ValidTo", actual.getValidTo(), expected);
		return myself;
	}

}