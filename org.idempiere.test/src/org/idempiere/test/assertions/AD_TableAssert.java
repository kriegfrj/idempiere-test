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
import org.compiere.model.X_AD_Table;

/** Generated assertion class for AD_Table
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_TableAssert
	extends AbstractPOAssert<AD_TableAssert,X_AD_Table>
{

    /** Standard Constructor */
    public AD_TableAssert (X_AD_Table actual)
    {
      super (actual, AD_TableAssert.class);
    }


	public AD_TableAssert hasAccessLevel(String expected)
	{
		isNotNull();
		String actualField = actual.getAccessLevel();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AccessLevel: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_TableAssert hasAD_Table_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Table_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Table_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_TableAssert hasAD_Table_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Table_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Table_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_TableAssert hasAD_Val_Rule_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Val_Rule_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Val_Rule_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_TableAssert hasAD_Window_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Window_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Window_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_TableAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_TableAssert hasEntityType(String expected)
	{
		isNotNull();
		String actualField = actual.getEntityType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have EntityType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_TableAssert hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_TableAssert isCentrallyMaintained()
	{
		isNotNull();
		if (!actual.isCentrallyMaintained()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CentrallyMaintained\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_TableAssert isNotCentrallyMaintained()
	{
		isNotNull();
		if (actual.isCentrallyMaintained()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CentrallyMaintained\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_TableAssert isChangeLog()
	{
		isNotNull();
		if (!actual.isChangeLog()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ChangeLog\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_TableAssert isNotChangeLog()
	{
		isNotNull();
		if (actual.isChangeLog()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ChangeLog\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_TableAssert isDeleteable()
	{
		isNotNull();
		if (!actual.isDeleteable()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Deleteable\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_TableAssert isNotDeleteable()
	{
		isNotNull();
		if (actual.isDeleteable()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Deleteable\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_TableAssert isHighVolume()
	{
		isNotNull();
		if (!actual.isHighVolume()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be HighVolume\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_TableAssert isNotHighVolume()
	{
		isNotNull();
		if (actual.isHighVolume()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be HighVolume\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_TableAssert isSecurityEnabled()
	{
		isNotNull();
		if (!actual.isSecurityEnabled()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SecurityEnabled\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_TableAssert isNotSecurityEnabled()
	{
		isNotNull();
		if (actual.isSecurityEnabled()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SecurityEnabled\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_TableAssert isView()
	{
		isNotNull();
		if (!actual.isView()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be View\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_TableAssert isNotView()
	{
		isNotNull();
		if (actual.isView()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be View\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_TableAssert hasLoadSeq(int expected)
	{
		isNotNull();
		int actualField = actual.getLoadSeq();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have LoadSeq: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_TableAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_TableAssert hasPO_Window_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPO_Window_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PO_Window_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_TableAssert hasReplicationType(String expected)
	{
		isNotNull();
		String actualField = actual.getReplicationType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ReplicationType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_TableAssert hasTableName(String expected)
	{
		isNotNull();
		String actualField = actual.getTableName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have TableName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}