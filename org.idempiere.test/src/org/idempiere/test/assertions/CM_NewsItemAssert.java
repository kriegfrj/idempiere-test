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
import org.compiere.model.X_CM_NewsItem;

/** Generated assertion class for CM_NewsItem
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class CM_NewsItemAssert
	extends AbstractPOAssert<CM_NewsItemAssert,X_CM_NewsItem>
{

    /** Standard Constructor */
    public CM_NewsItemAssert (X_CM_NewsItem actual)
    {
      super (actual, CM_NewsItemAssert.class);
    }


	public CM_NewsItemAssert hasAuthor(String expected)
	{
		isNotNull();
		String actualField = actual.getAuthor();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Author: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_NewsItemAssert hasCM_NewsChannel_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getCM_NewsChannel_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CM_NewsChannel_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_NewsItemAssert hasCM_NewsItem_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getCM_NewsItem_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CM_NewsItem_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_NewsItemAssert hasCM_NewsItem_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getCM_NewsItem_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CM_NewsItem_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_NewsItemAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_NewsItemAssert hasLinkURL(String expected)
	{
		isNotNull();
		String actualField = actual.getLinkURL();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have LinkURL: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_NewsItemAssert hasPubDate(Object expected)
	{
		isNotNull();
		dateAssert("PubDate", actual.getPubDate(), expected);
		return myself;
	}


	public CM_NewsItemAssert hasTitle(String expected)
	{
		isNotNull();
		String actualField = actual.getTitle();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Title: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}