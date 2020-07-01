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
import org.compiere.model.X_AD_CtxHelpSuggestion;

/** Generated assertion class for AD_CtxHelpSuggestion
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_CtxHelpSuggestionAssert
	extends AbstractPOAssert<AD_CtxHelpSuggestionAssert,X_AD_CtxHelpSuggestion>
{

    /** Standard Constructor */
    public AD_CtxHelpSuggestionAssert (X_AD_CtxHelpSuggestion actual)
    {
      super (actual, AD_CtxHelpSuggestionAssert.class);
    }


	public AD_CtxHelpSuggestionAssert hasAD_CtxHelp_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_CtxHelp_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_CtxHelp_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_CtxHelpSuggestionAssert hasAD_CtxHelpMsg_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_CtxHelpMsg_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_CtxHelpMsg_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_CtxHelpSuggestionAssert hasAD_CtxHelpSuggestion_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_CtxHelpSuggestion_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_CtxHelpSuggestion_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_CtxHelpSuggestionAssert hasAD_CtxHelpSuggestion_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_CtxHelpSuggestion_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_CtxHelpSuggestion_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_CtxHelpSuggestionAssert hasAD_Language(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Language();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Language: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_CtxHelpSuggestionAssert hasAD_User_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_User_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_User_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_CtxHelpSuggestionAssert hasAD_UserClient_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_UserClient_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_UserClient_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_CtxHelpSuggestionAssert isApproved()
	{
		isNotNull();
		if (!actual.isApproved()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Approved\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_CtxHelpSuggestionAssert isNotApproved()
	{
		isNotNull();
		if (actual.isApproved()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Approved\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_CtxHelpSuggestionAssert isSaveAsTenantCustomization()
	{
		isNotNull();
		if (!actual.isSaveAsTenantCustomization()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SaveAsTenantCustomization\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_CtxHelpSuggestionAssert isNotSaveAsTenantCustomization()
	{
		isNotNull();
		if (actual.isSaveAsTenantCustomization()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SaveAsTenantCustomization\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_CtxHelpSuggestionAssert hasMsgText(String expected)
	{
		isNotNull();
		String actualField = actual.getMsgText();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have MsgText: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_CtxHelpSuggestionAssert isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_CtxHelpSuggestionAssert isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}
}