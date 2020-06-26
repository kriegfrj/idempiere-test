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
import org.compiere.model.X_AD_HouseKeeping;

/** Generated assertion class for AD_HouseKeeping
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_HouseKeepingAssert
	extends AbstractPOAssert<AD_HouseKeepingAssert,X_AD_HouseKeeping>
{

    /** Standard Constructor */
    public AD_HouseKeepingAssert (X_AD_HouseKeeping actual)
    {
      super (actual, AD_HouseKeepingAssert.class);
    }


	public AD_HouseKeepingAssert hasAD_HouseKeeping_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_HouseKeeping_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_HouseKeeping_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_HouseKeepingAssert hasAD_HouseKeeping_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_HouseKeeping_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_HouseKeeping_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_HouseKeepingAssert hasAD_Table_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Table_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Table_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_HouseKeepingAssert hasBackupFolder(String expected)
	{
		isNotNull();
		String actualField = actual.getBackupFolder();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have BackupFolder: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_HouseKeepingAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_HouseKeepingAssert hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_HouseKeepingAssert isExportXMLBackup()
	{
		isNotNull();
		if (!actual.isExportXMLBackup()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ExportXMLBackup\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_HouseKeepingAssert isNotExportXMLBackup()
	{
		isNotNull();
		if (actual.isExportXMLBackup()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ExportXMLBackup\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_HouseKeepingAssert isSaveInHistoric()
	{
		isNotNull();
		if (!actual.isSaveInHistoric()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SaveInHistoric\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_HouseKeepingAssert isNotSaveInHistoric()
	{
		isNotNull();
		if (actual.isSaveInHistoric()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SaveInHistoric\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_HouseKeepingAssert hasLastDeleted(int expected)
	{
		isNotNull();
		int actualField = actual.getLastDeleted();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have LastDeleted: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_HouseKeepingAssert hasLastRun(Object expected)
	{
		isNotNull();
		dateAssert("LastRun", actual.getLastRun(), expected);
		return myself;
	}


	public AD_HouseKeepingAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_HouseKeepingAssert hasValue(String expected)
	{
		isNotNull();
		String actualField = actual.getValue();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Value: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_HouseKeepingAssert hasWhereClause(String expected)
	{
		isNotNull();
		String actualField = actual.getWhereClause();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have WhereClause: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}