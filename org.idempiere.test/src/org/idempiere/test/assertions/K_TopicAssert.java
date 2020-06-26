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
import org.compiere.model.X_K_Topic;

/** Generated assertion class for K_Topic
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class K_TopicAssert
	extends AbstractPOAssert<K_TopicAssert,X_K_Topic>
{

    /** Standard Constructor */
    public K_TopicAssert (X_K_Topic actual)
    {
      super (actual, K_TopicAssert.class);
    }


	public K_TopicAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public K_TopicAssert hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public K_TopicAssert isPublic()
	{
		isNotNull();
		if (!actual.isPublic()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Public\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public K_TopicAssert isNotPublic()
	{
		isNotNull();
		if (actual.isPublic()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Public\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public K_TopicAssert isPublicWrite()
	{
		isNotNull();
		if (!actual.isPublicWrite()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PublicWrite\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public K_TopicAssert isNotPublicWrite()
	{
		isNotNull();
		if (actual.isPublicWrite()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PublicWrite\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public K_TopicAssert hasK_Topic_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getK_Topic_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have K_Topic_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public K_TopicAssert hasK_Topic_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getK_Topic_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have K_Topic_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public K_TopicAssert hasK_Type_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getK_Type_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have K_Type_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public K_TopicAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}