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
import org.compiere.model.X_R_CategoryUpdates;

/** Generated assertion class for R_CategoryUpdates
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class R_CategoryUpdatesAssert
	extends AbstractPOAssert<R_CategoryUpdatesAssert,X_R_CategoryUpdates>
{

    /** Standard Constructor */
    public R_CategoryUpdatesAssert (X_R_CategoryUpdates actual)
    {
      super (actual, R_CategoryUpdatesAssert.class);
    }


	public R_CategoryUpdatesAssert hasAD_User_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_User_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_User_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_CategoryUpdatesAssert isSelfService()
	{
		isNotNull();
		if (!actual.isSelfService()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SelfService\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public R_CategoryUpdatesAssert isNotSelfService()
	{
		isNotNull();
		if (actual.isSelfService()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SelfService\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public R_CategoryUpdatesAssert hasR_Category_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getR_Category_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have R_Category_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_CategoryUpdatesAssert hasR_CategoryUpdates_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getR_CategoryUpdates_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have R_CategoryUpdates_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}