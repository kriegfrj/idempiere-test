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
import org.compiere.model.X_CM_ChatEntry;

/** Generated assertion class for CM_ChatEntry
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class CM_ChatEntryAssert
	extends AbstractPOAssert<CM_ChatEntryAssert,X_CM_ChatEntry>
{

    /** Standard Constructor */
    public CM_ChatEntryAssert (X_CM_ChatEntry actual)
    {
      super (actual, CM_ChatEntryAssert.class);
    }


	public CM_ChatEntryAssert hasAD_User_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_User_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_User_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_ChatEntryAssert hasChatEntryType(String expected)
	{
		isNotNull();
		String actualField = actual.getChatEntryType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ChatEntryType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_ChatEntryAssert hasCM_Chat_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getCM_Chat_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CM_Chat_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_ChatEntryAssert hasCM_ChatEntry_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getCM_ChatEntry_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CM_ChatEntry_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_ChatEntryAssert hasCM_ChatEntry_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getCM_ChatEntry_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CM_ChatEntry_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_ChatEntryAssert hasCM_ChatEntryGrandParent_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getCM_ChatEntryGrandParent_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CM_ChatEntryGrandParent_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_ChatEntryAssert hasCM_ChatEntryParent_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getCM_ChatEntryParent_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CM_ChatEntryParent_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_ChatEntryAssert hasConfidentialType(String expected)
	{
		isNotNull();
		String actualField = actual.getConfidentialType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ConfidentialType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_ChatEntryAssert hasModeratorStatus(String expected)
	{
		isNotNull();
		String actualField = actual.getModeratorStatus();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ModeratorStatus: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_ChatEntryAssert hasSubject(String expected)
	{
		isNotNull();
		String actualField = actual.getSubject();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Subject: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}