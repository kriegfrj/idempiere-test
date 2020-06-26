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
import org.compiere.model.X_AD_Package_Imp;

/** Generated assertion class for AD_Package_Imp
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_Package_ImpAssert
	extends AbstractPOAssert<AD_Package_ImpAssert,X_AD_Package_Imp>
{

    /** Standard Constructor */
    public AD_Package_ImpAssert (X_AD_Package_Imp actual)
    {
      super (actual, AD_Package_ImpAssert.class);
    }


	public AD_Package_ImpAssert hasAD_Package_Imp_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Package_Imp_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Package_Imp_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Package_ImpAssert hasAD_Package_Imp_Proc_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Package_Imp_Proc_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Package_Imp_Proc_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Package_ImpAssert hasAD_Package_Imp_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Package_Imp_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Package_Imp_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Package_ImpAssert hasCreatedDate(String expected)
	{
		isNotNull();
		String actualField = actual.getCreatedDate();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CreatedDate: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Package_ImpAssert hasCreator(String expected)
	{
		isNotNull();
		String actualField = actual.getCreator();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Creator: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Package_ImpAssert hasCreatorContact(String expected)
	{
		isNotNull();
		String actualField = actual.getCreatorContact();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CreatorContact: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Package_ImpAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Package_ImpAssert hasEMail(String expected)
	{
		isNotNull();
		String actualField = actual.getEMail();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have EMail: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Package_ImpAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Package_ImpAssert hasPK_Status(String expected)
	{
		isNotNull();
		String actualField = actual.getPK_Status();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PK_Status: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Package_ImpAssert hasPK_Version(String expected)
	{
		isNotNull();
		String actualField = actual.getPK_Version();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PK_Version: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Package_ImpAssert isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_Package_ImpAssert isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_Package_ImpAssert hasReleaseNo(String expected)
	{
		isNotNull();
		String actualField = actual.getReleaseNo();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ReleaseNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Package_ImpAssert isUninstall()
	{
		isNotNull();
		if (!actual.isUninstall()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Uninstall\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_Package_ImpAssert isNotUninstall()
	{
		isNotNull();
		if (actual.isUninstall()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Uninstall\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_Package_ImpAssert hasUpdatedDate(String expected)
	{
		isNotNull();
		String actualField = actual.getUpdatedDate();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have UpdatedDate: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Package_ImpAssert hasVersion(String expected)
	{
		isNotNull();
		String actualField = actual.getVersion();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Version: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}