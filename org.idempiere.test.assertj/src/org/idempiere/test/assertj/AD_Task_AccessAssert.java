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
import org.compiere.model.X_AD_Task_Access;

/** Generated assertion class for AD_Task_Access
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_Task_AccessAssert
	extends AbstractPOAssert<AD_Task_AccessAssert,X_AD_Task_Access>
{

    /** Standard Constructor */
    public AD_Task_AccessAssert (X_AD_Task_Access actual)
    {
      super (actual, AD_Task_AccessAssert.class);
    }


	public AD_Task_AccessAssert hasAD_Role_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Role_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Role_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Task_AccessAssert hasAD_Task_Access_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Task_Access_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Task_Access_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Task_AccessAssert hasAD_Task_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Task_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Task_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Task_AccessAssert isReadWrite()
	{
		isNotNull();
		if (!actual.isReadWrite()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ReadWrite\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_Task_AccessAssert isNotReadWrite()
	{
		isNotNull();
		if (actual.isReadWrite()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ReadWrite\nbut it was",
				getPODescription());
		}
		return myself;
	}
}