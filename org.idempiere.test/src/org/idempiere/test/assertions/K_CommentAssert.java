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
import org.compiere.model.X_K_Comment;

/** Generated assertion class for K_Comment
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class K_CommentAssert
	extends AbstractPOAssert<K_CommentAssert,X_K_Comment>
{

    /** Standard Constructor */
    public K_CommentAssert (X_K_Comment actual)
    {
      super (actual, K_CommentAssert.class);
    }


	public K_CommentAssert hasAD_Session_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Session_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Session_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public K_CommentAssert isPublic()
	{
		isNotNull();
		if (!actual.isPublic()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Public\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public K_CommentAssert isNotPublic()
	{
		isNotNull();
		if (actual.isPublic()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Public\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public K_CommentAssert hasK_Comment_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getK_Comment_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have K_Comment_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public K_CommentAssert hasK_Comment_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getK_Comment_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have K_Comment_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public K_CommentAssert hasK_Entry_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getK_Entry_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have K_Entry_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public K_CommentAssert hasRating(int expected)
	{
		isNotNull();
		int actualField = actual.getRating();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Rating: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public K_CommentAssert hasTextMsg(String expected)
	{
		isNotNull();
		String actualField = actual.getTextMsg();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have TextMsg: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}