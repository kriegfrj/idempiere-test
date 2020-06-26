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
import org.compiere.model.X_AD_Package_Imp_Backup;

/** Generated assertion class for AD_Package_Imp_Backup
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_Package_Imp_BackupAssert
	extends AbstractPOAssert<AD_Package_Imp_BackupAssert,X_AD_Package_Imp_Backup>
{

    /** Standard Constructor */
    public AD_Package_Imp_BackupAssert (X_AD_Package_Imp_Backup actual)
    {
      super (actual, AD_Package_Imp_BackupAssert.class);
    }


	public AD_Package_Imp_BackupAssert hasAD_Column_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Column_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Column_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Package_Imp_BackupAssert hasAD_Package_Imp_Backup_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Package_Imp_Backup_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Package_Imp_Backup_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Package_Imp_BackupAssert hasAD_Package_Imp_Backup_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Package_Imp_Backup_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Package_Imp_Backup_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Package_Imp_BackupAssert hasAD_Package_Imp_Bck_Dir(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Package_Imp_Bck_Dir();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Package_Imp_Bck_Dir: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Package_Imp_BackupAssert hasAD_Package_Imp_Detail_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Package_Imp_Detail_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Package_Imp_Detail_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Package_Imp_BackupAssert hasAD_Package_Imp_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Package_Imp_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Package_Imp_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Package_Imp_BackupAssert hasAD_Package_Imp_Org_Dir(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Package_Imp_Org_Dir();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Package_Imp_Org_Dir: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Package_Imp_BackupAssert hasAD_Reference_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Reference_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Reference_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Package_Imp_BackupAssert hasAD_Table_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Table_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Table_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Package_Imp_BackupAssert hasColValue(String expected)
	{
		isNotNull();
		String actualField = actual.getColValue();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ColValue: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Package_Imp_BackupAssert isUninstall()
	{
		isNotNull();
		if (!actual.isUninstall()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Uninstall\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_Package_Imp_BackupAssert isNotUninstall()
	{
		isNotNull();
		if (actual.isUninstall()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Uninstall\nbut it was",
				getPODescription());
		}
		return myself;
	}
}