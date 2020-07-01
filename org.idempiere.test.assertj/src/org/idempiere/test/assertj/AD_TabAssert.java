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
import org.compiere.model.X_AD_Tab;

/** Generated assertion class for AD_Tab
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_TabAssert
	extends AbstractPOAssert<AD_TabAssert,X_AD_Tab>
{

    /** Standard Constructor */
    public AD_TabAssert (X_AD_Tab actual)
    {
      super (actual, AD_TabAssert.class);
    }


	public AD_TabAssert hasAD_Column_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Column_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Column_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_TabAssert hasAD_ColumnSortOrder_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_ColumnSortOrder_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_ColumnSortOrder_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_TabAssert hasAD_ColumnSortYesNo_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_ColumnSortYesNo_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_ColumnSortYesNo_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_TabAssert hasAD_CtxHelp_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_CtxHelp_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_CtxHelp_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_TabAssert hasAD_Image_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Image_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Image_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_TabAssert hasAD_Process_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Process_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Process_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_TabAssert hasAD_Tab_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Tab_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Tab_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_TabAssert hasAD_Tab_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Tab_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Tab_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_TabAssert hasAD_Table_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Table_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Table_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_TabAssert hasAD_Window_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Window_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Window_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_TabAssert hasCommitWarning(String expected)
	{
		isNotNull();
		String actualField = actual.getCommitWarning();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CommitWarning: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_TabAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_TabAssert hasDisplayLogic(String expected)
	{
		isNotNull();
		String actualField = actual.getDisplayLogic();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DisplayLogic: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_TabAssert hasEntityType(String expected)
	{
		isNotNull();
		String actualField = actual.getEntityType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have EntityType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_TabAssert isHasTree()
	{
		isNotNull();
		if (!actual.isHasTree()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be HasTree\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_TabAssert isNotHasTree()
	{
		isNotNull();
		if (actual.isHasTree()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be HasTree\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_TabAssert hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_TabAssert hasIncluded_Tab_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getIncluded_Tab_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Included_Tab_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_TabAssert isAdvancedTab()
	{
		isNotNull();
		if (!actual.isAdvancedTab()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AdvancedTab\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_TabAssert isNotAdvancedTab()
	{
		isNotNull();
		if (actual.isAdvancedTab()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AdvancedTab\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_TabAssert isInfoTab()
	{
		isNotNull();
		if (!actual.isInfoTab()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be InfoTab\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_TabAssert isNotInfoTab()
	{
		isNotNull();
		if (actual.isInfoTab()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be InfoTab\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_TabAssert isInsertRecord()
	{
		isNotNull();
		if (!actual.isInsertRecord()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be InsertRecord\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_TabAssert isNotInsertRecord()
	{
		isNotNull();
		if (actual.isInsertRecord()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be InsertRecord\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_TabAssert isReadOnly()
	{
		isNotNull();
		if (!actual.isReadOnly()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ReadOnly\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_TabAssert isNotReadOnly()
	{
		isNotNull();
		if (actual.isReadOnly()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ReadOnly\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_TabAssert isSingleRow()
	{
		isNotNull();
		if (!actual.isSingleRow()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SingleRow\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_TabAssert isNotSingleRow()
	{
		isNotNull();
		if (actual.isSingleRow()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SingleRow\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_TabAssert isSortTab()
	{
		isNotNull();
		if (!actual.isSortTab()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SortTab\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_TabAssert isNotSortTab()
	{
		isNotNull();
		if (actual.isSortTab()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SortTab\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_TabAssert isTranslationTab()
	{
		isNotNull();
		if (!actual.isTranslationTab()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be TranslationTab\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_TabAssert isNotTranslationTab()
	{
		isNotNull();
		if (actual.isTranslationTab()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be TranslationTab\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_TabAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_TabAssert hasOrderByClause(String expected)
	{
		isNotNull();
		String actualField = actual.getOrderByClause();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have OrderByClause: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_TabAssert hasParent_Column_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getParent_Column_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Parent_Column_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_TabAssert hasReadOnlyLogic(String expected)
	{
		isNotNull();
		String actualField = actual.getReadOnlyLogic();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ReadOnlyLogic: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_TabAssert hasSeqNo(int expected)
	{
		isNotNull();
		int actualField = actual.getSeqNo();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have SeqNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_TabAssert hasTabLevel(int expected)
	{
		isNotNull();
		int actualField = actual.getTabLevel();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have TabLevel: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_TabAssert hasTreeDisplayedOn(String expected)
	{
		isNotNull();
		String actualField = actual.getTreeDisplayedOn();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have TreeDisplayedOn: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_TabAssert hasWhereClause(String expected)
	{
		isNotNull();
		String actualField = actual.getWhereClause();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have WhereClause: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}