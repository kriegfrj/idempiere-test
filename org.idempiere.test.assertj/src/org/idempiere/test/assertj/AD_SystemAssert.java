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

import javax.annotation.Generated;
import org.assertj.core.util.Objects;
import org.compiere.model.X_AD_System;

/** Generated assertion class for AD_System
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_SystemAssert
	extends AbstractPOAssert<AD_SystemAssert,X_AD_System>
{

    /** Standard Constructor */
    public AD_SystemAssert (X_AD_System actual)
    {
      super (actual, AD_SystemAssert.class);
    }


	public AD_SystemAssert hasAD_System_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_System_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_System_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_SystemAssert hasAD_System_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_System_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_System_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_SystemAssert hasCustomPrefix(String expected)
	{
		isNotNull();
		String actualField = actual.getCustomPrefix();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CustomPrefix: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_SystemAssert hasDBAddress(String expected)
	{
		isNotNull();
		String actualField = actual.getDBAddress();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DBAddress: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_SystemAssert hasDBInstance(String expected)
	{
		isNotNull();
		String actualField = actual.getDBInstance();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DBInstance: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_SystemAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_SystemAssert hasEncryptionKey(String expected)
	{
		isNotNull();
		String actualField = actual.getEncryptionKey();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have EncryptionKey: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_SystemAssert hasIDRangeEnd(Object expected)
	{
		isNotNull();
		bdAssert("IDRangeEnd", actual.getIDRangeEnd(), expected);
		return myself;
	}


	public AD_SystemAssert hasIDRangeStart(Object expected)
	{
		isNotNull();
		bdAssert("IDRangeStart", actual.getIDRangeStart(), expected);
		return myself;
	}


	public AD_SystemAssert hasInfo(String expected)
	{
		isNotNull();
		String actualField = actual.getInfo();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Info: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_SystemAssert isAllowStatistics()
	{
		isNotNull();
		if (!actual.isAllowStatistics()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AllowStatistics\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_SystemAssert isNotAllowStatistics()
	{
		isNotNull();
		if (actual.isAllowStatistics()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AllowStatistics\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_SystemAssert isAutoErrorReport()
	{
		isNotNull();
		if (!actual.isAutoErrorReport()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AutoErrorReport\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_SystemAssert isNotAutoErrorReport()
	{
		isNotNull();
		if (actual.isAutoErrorReport()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AutoErrorReport\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_SystemAssert isFailOnBuildDiffer()
	{
		isNotNull();
		if (!actual.isFailOnBuildDiffer()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be FailOnBuildDiffer\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_SystemAssert isNotFailOnBuildDiffer()
	{
		isNotNull();
		if (actual.isFailOnBuildDiffer()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be FailOnBuildDiffer\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_SystemAssert isFailOnMissingModelValidator()
	{
		isNotNull();
		if (!actual.isFailOnMissingModelValidator()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be FailOnMissingModelValidator\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_SystemAssert isNotFailOnMissingModelValidator()
	{
		isNotNull();
		if (actual.isFailOnMissingModelValidator()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be FailOnMissingModelValidator\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_SystemAssert isJustMigrated()
	{
		isNotNull();
		if (!actual.isJustMigrated()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be JustMigrated\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_SystemAssert isNotJustMigrated()
	{
		isNotNull();
		if (actual.isJustMigrated()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be JustMigrated\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_SystemAssert hasLastBuildInfo(String expected)
	{
		isNotNull();
		String actualField = actual.getLastBuildInfo();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have LastBuildInfo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_SystemAssert hasLastMigrationScriptApplied(String expected)
	{
		isNotNull();
		String actualField = actual.getLastMigrationScriptApplied();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have LastMigrationScriptApplied: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_SystemAssert hasLDAPDomain(String expected)
	{
		isNotNull();
		String actualField = actual.getLDAPDomain();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have LDAPDomain: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_SystemAssert hasLDAPHost(String expected)
	{
		isNotNull();
		String actualField = actual.getLDAPHost();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have LDAPHost: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_SystemAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_SystemAssert hasNoProcessors(int expected)
	{
		isNotNull();
		int actualField = actual.getNoProcessors();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have NoProcessors: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_SystemAssert hasOldName(String expected)
	{
		isNotNull();
		String actualField = actual.getOldName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have OldName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_SystemAssert hasPassword(String expected)
	{
		isNotNull();
		String actualField = actual.getPassword();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Password: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_SystemAssert hasProfileInfo(String expected)
	{
		isNotNull();
		String actualField = actual.getProfileInfo();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ProfileInfo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_SystemAssert hasRecord_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getRecord_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Record_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_SystemAssert hasReleaseNo(String expected)
	{
		isNotNull();
		String actualField = actual.getReleaseNo();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ReleaseNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_SystemAssert hasReplicationType(String expected)
	{
		isNotNull();
		String actualField = actual.getReplicationType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ReplicationType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_SystemAssert hasStatisticsInfo(String expected)
	{
		isNotNull();
		String actualField = actual.getStatisticsInfo();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have StatisticsInfo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_SystemAssert hasSummary(String expected)
	{
		isNotNull();
		String actualField = actual.getSummary();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Summary: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_SystemAssert hasSupportEMail(String expected)
	{
		isNotNull();
		String actualField = actual.getSupportEMail();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SupportEMail: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_SystemAssert hasSupportExpDate(Object expected)
	{
		isNotNull();
		dateAssert("SupportExpDate", actual.getSupportExpDate(), expected);
		return myself;
	}


	public AD_SystemAssert hasSupportUnits(int expected)
	{
		isNotNull();
		int actualField = actual.getSupportUnits();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SupportUnits: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_SystemAssert hasSystemStatus(String expected)
	{
		isNotNull();
		String actualField = actual.getSystemStatus();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SystemStatus: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_SystemAssert hasUserName(String expected)
	{
		isNotNull();
		String actualField = actual.getUserName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have UserName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_SystemAssert hasVersion(String expected)
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