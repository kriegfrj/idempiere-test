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
import org.compiere.model.X_AD_UserPreference;

/** Generated assertion class for AD_UserPreference
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_UserPreferenceAssert
	extends AbstractPOAssert<AD_UserPreferenceAssert,X_AD_UserPreference>
{

    /** Standard Constructor */
    public AD_UserPreferenceAssert (X_AD_UserPreference actual)
    {
      super (actual, AD_UserPreferenceAssert.class);
    }


	public AD_UserPreferenceAssert hasAD_User_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_User_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_User_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserPreferenceAssert hasAD_UserPreference_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_UserPreference_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_UserPreference_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserPreferenceAssert hasAD_UserPreference_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_UserPreference_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_UserPreference_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserPreferenceAssert isAutoCommit()
	{
		isNotNull();
		if (!actual.isAutoCommit()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AutoCommit\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_UserPreferenceAssert isNotAutoCommit()
	{
		isNotNull();
		if (actual.isAutoCommit()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AutoCommit\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_UserPreferenceAssert hasAutomaticDecimalPlacesForAmoun(int expected)
	{
		isNotNull();
		int actualField = actual.getAutomaticDecimalPlacesForAmoun();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AutomaticDecimalPlacesForAmoun: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_UserPreferenceAssert isAutoNew()
	{
		isNotNull();
		if (!actual.isAutoNew()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AutoNew\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_UserPreferenceAssert isNotAutoNew()
	{
		isNotNull();
		if (actual.isAutoNew()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AutoNew\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_UserPreferenceAssert isDetailedZoomAcross()
	{
		isNotNull();
		if (!actual.isDetailedZoomAcross()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DetailedZoomAcross\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_UserPreferenceAssert isNotDetailedZoomAcross()
	{
		isNotNull();
		if (actual.isDetailedZoomAcross()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DetailedZoomAcross\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_UserPreferenceAssert isToggleOnDoubleClick()
	{
		isNotNull();
		if (!actual.isToggleOnDoubleClick()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ToggleOnDoubleClick\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_UserPreferenceAssert isNotToggleOnDoubleClick()
	{
		isNotNull();
		if (actual.isToggleOnDoubleClick()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ToggleOnDoubleClick\nbut it was",
				getPODescription());
		}
		return myself;
	}
}