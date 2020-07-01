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
import org.compiere.model.X_AD_HouseKeeping;

/** Generated assertion class for AD_HouseKeeping
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractAD_HouseKeepingAssert<SELF extends AbstractAD_HouseKeepingAssert<SELF, ACTUAL>, ACTUAL extends X_AD_HouseKeeping>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractAD_HouseKeepingAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAD_HouseKeeping_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_HouseKeeping_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_HouseKeeping_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_HouseKeeping_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_HouseKeeping_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_HouseKeeping_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_Table_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Table_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Table_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasBackupFolder(String expected)
	{
		isNotNull();
		String actualField = actual.getBackupFolder();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have BackupFolder: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isExportXMLBackup()
	{
		isNotNull();
		if (!actual.isExportXMLBackup()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ExportXMLBackup\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotExportXMLBackup()
	{
		isNotNull();
		if (actual.isExportXMLBackup()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ExportXMLBackup\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSaveInHistoric()
	{
		isNotNull();
		if (!actual.isSaveInHistoric()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SaveInHistoric\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSaveInHistoric()
	{
		isNotNull();
		if (actual.isSaveInHistoric()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SaveInHistoric\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasLastDeleted(int expected)
	{
		isNotNull();
		int actualField = actual.getLastDeleted();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have LastDeleted: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasLastRun(Object expected)
	{
		isNotNull();
		dateAssert("LastRun", actual.getLastRun(), expected);
		return myself;
	}


	public SELF hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasTableName(String expected)
	{
		isNotNull();
		String actualField = actual.getTableName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have TableName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasValue(String expected)
	{
		isNotNull();
		String actualField = actual.getValue();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Value: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasWhereClause(String expected)
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