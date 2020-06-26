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
import org.compiere.model.X_PA_DashboardContent;

/** Generated assertion class for PA_DashboardContent
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class PA_DashboardContentAssert
	extends AbstractPOAssert<PA_DashboardContentAssert,X_PA_DashboardContent>
{

    /** Standard Constructor */
    public PA_DashboardContentAssert (X_PA_DashboardContent actual)
    {
      super (actual, PA_DashboardContentAssert.class);
    }


	public PA_DashboardContentAssert hasAD_Chart_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Chart_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Chart_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_DashboardContentAssert hasAD_Process_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Process_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Process_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_DashboardContentAssert hasAD_Role_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Role_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Role_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_DashboardContentAssert hasAD_User_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_User_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_User_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_DashboardContentAssert hasAD_Window_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Window_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Window_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_DashboardContentAssert hasColumnNo(int expected)
	{
		isNotNull();
		int actualField = actual.getColumnNo();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ColumnNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_DashboardContentAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_DashboardContentAssert hasGoalDisplay(String expected)
	{
		isNotNull();
		String actualField = actual.getGoalDisplay();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have GoalDisplay: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_DashboardContentAssert isCollapsedByDefault()
	{
		isNotNull();
		if (!actual.isCollapsedByDefault()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CollapsedByDefault\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_DashboardContentAssert isNotCollapsedByDefault()
	{
		isNotNull();
		if (actual.isCollapsedByDefault()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CollapsedByDefault\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_DashboardContentAssert isCollapsible()
	{
		isNotNull();
		if (!actual.isCollapsible()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Collapsible\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_DashboardContentAssert isNotCollapsible()
	{
		isNotNull();
		if (actual.isCollapsible()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Collapsible\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_DashboardContentAssert isEmbedReportContent()
	{
		isNotNull();
		if (!actual.isEmbedReportContent()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be EmbedReportContent\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_DashboardContentAssert isNotEmbedReportContent()
	{
		isNotNull();
		if (actual.isEmbedReportContent()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be EmbedReportContent\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_DashboardContentAssert isShowInDashboard()
	{
		isNotNull();
		if (!actual.isShowInDashboard()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ShowInDashboard\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_DashboardContentAssert isNotShowInDashboard()
	{
		isNotNull();
		if (actual.isShowInDashboard()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ShowInDashboard\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_DashboardContentAssert isShowinLogin()
	{
		isNotNull();
		if (!actual.isShowinLogin()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ShowinLogin\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_DashboardContentAssert isNotShowinLogin()
	{
		isNotNull();
		if (actual.isShowinLogin()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ShowinLogin\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_DashboardContentAssert hasLine(Object expected)
	{
		isNotNull();
		bdAssert("Line", actual.getLine(), expected);
		return myself;
	}


	public PA_DashboardContentAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_DashboardContentAssert hasPA_DashboardContent_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPA_DashboardContent_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PA_DashboardContent_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_DashboardContentAssert hasPA_DashboardContent_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getPA_DashboardContent_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PA_DashboardContent_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_DashboardContentAssert hasPA_Goal_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPA_Goal_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PA_Goal_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_DashboardContentAssert hasProcessParameters(String expected)
	{
		isNotNull();
		String actualField = actual.getProcessParameters();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ProcessParameters: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_DashboardContentAssert hasZulFilePath(String expected)
	{
		isNotNull();
		String actualField = actual.getZulFilePath();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ZulFilePath: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}