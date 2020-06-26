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
import org.compiere.model.X_WS_WebServiceTypeAccess;

/** Generated assertion class for WS_WebServiceTypeAccess
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class WS_WebServiceTypeAccessAssert
	extends AbstractPOAssert<WS_WebServiceTypeAccessAssert,X_WS_WebServiceTypeAccess>
{

    /** Standard Constructor */
    public WS_WebServiceTypeAccessAssert (X_WS_WebServiceTypeAccess actual)
    {
      super (actual, WS_WebServiceTypeAccessAssert.class);
    }


	public WS_WebServiceTypeAccessAssert hasAD_Role_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Role_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Role_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public WS_WebServiceTypeAccessAssert isReadWrite()
	{
		isNotNull();
		if (!actual.isReadWrite()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ReadWrite\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public WS_WebServiceTypeAccessAssert isNotReadWrite()
	{
		isNotNull();
		if (actual.isReadWrite()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ReadWrite\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public WS_WebServiceTypeAccessAssert hasWS_WebServiceType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getWS_WebServiceType_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have WS_WebServiceType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public WS_WebServiceTypeAccessAssert hasWS_WebServiceTypeAccess_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getWS_WebServiceTypeAccess_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have WS_WebServiceTypeAccess_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}