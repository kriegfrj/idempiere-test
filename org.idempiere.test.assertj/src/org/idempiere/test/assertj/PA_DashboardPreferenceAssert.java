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
import org.compiere.model.X_PA_DashboardPreference;

/** Generated assertion class for PA_DashboardPreference
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class PA_DashboardPreferenceAssert
	extends AbstractPOAssert<PA_DashboardPreferenceAssert,X_PA_DashboardPreference>
{

    /** Standard Constructor */
    public PA_DashboardPreferenceAssert (X_PA_DashboardPreference actual)
    {
      super (actual, PA_DashboardPreferenceAssert.class);
    }


	public PA_DashboardPreferenceAssert hasAD_Role_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Role_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Role_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_DashboardPreferenceAssert hasAD_User_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_User_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_User_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_DashboardPreferenceAssert hasColumnNo(int expected)
	{
		isNotNull();
		int actualField = actual.getColumnNo();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ColumnNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_DashboardPreferenceAssert isCollapsedByDefault()
	{
		isNotNull();
		if (!actual.isCollapsedByDefault()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CollapsedByDefault\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_DashboardPreferenceAssert isNotCollapsedByDefault()
	{
		isNotNull();
		if (actual.isCollapsedByDefault()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CollapsedByDefault\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_DashboardPreferenceAssert isShowInDashboard()
	{
		isNotNull();
		if (!actual.isShowInDashboard()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ShowInDashboard\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_DashboardPreferenceAssert isNotShowInDashboard()
	{
		isNotNull();
		if (actual.isShowInDashboard()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ShowInDashboard\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_DashboardPreferenceAssert hasLine(Object expected)
	{
		isNotNull();
		bdAssert("Line", actual.getLine(), expected);
		return myself;
	}


	public PA_DashboardPreferenceAssert hasPA_DashboardContent_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPA_DashboardContent_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PA_DashboardContent_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_DashboardPreferenceAssert hasPA_DashboardPreference_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPA_DashboardPreference_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PA_DashboardPreference_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_DashboardPreferenceAssert hasPA_DashboardPreference_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getPA_DashboardPreference_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PA_DashboardPreference_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}