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
import org.compiere.model.X_AD_Replication;

/** Generated assertion class for AD_Replication
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_ReplicationAssert
	extends AbstractPOAssert<AD_ReplicationAssert,X_AD_Replication>
{

    /** Standard Constructor */
    public AD_ReplicationAssert (X_AD_Replication actual)
    {
      super (actual, AD_ReplicationAssert.class);
    }


	public AD_ReplicationAssert hasAD_Replication_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Replication_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Replication_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ReplicationAssert hasAD_Replication_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Replication_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Replication_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ReplicationAssert hasAD_ReplicationStrategy_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_ReplicationStrategy_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_ReplicationStrategy_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ReplicationAssert hasDateLastRun(Object expected)
	{
		isNotNull();
		dateAssert("DateLastRun", actual.getDateLastRun(), expected);
		return myself;
	}


	public AD_ReplicationAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ReplicationAssert hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ReplicationAssert hasHostAddress(String expected)
	{
		isNotNull();
		String actualField = actual.getHostAddress();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have HostAddress: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ReplicationAssert hasHostPort(int expected)
	{
		isNotNull();
		int actualField = actual.getHostPort();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have HostPort: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ReplicationAssert hasIDRangeEnd(Object expected)
	{
		isNotNull();
		bdAssert("IDRangeEnd", actual.getIDRangeEnd(), expected);
		return myself;
	}


	public AD_ReplicationAssert hasIDRangeStart(Object expected)
	{
		isNotNull();
		bdAssert("IDRangeStart", actual.getIDRangeStart(), expected);
		return myself;
	}


	public AD_ReplicationAssert isRMIoverHTTP()
	{
		isNotNull();
		if (!actual.isRMIoverHTTP()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be RMIoverHTTP\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_ReplicationAssert isNotRMIoverHTTP()
	{
		isNotNull();
		if (actual.isRMIoverHTTP()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be RMIoverHTTP\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_ReplicationAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ReplicationAssert hasPrefix(String expected)
	{
		isNotNull();
		String actualField = actual.getPrefix();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Prefix: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ReplicationAssert hasRemote_Client_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getRemote_Client_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Remote_Client_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ReplicationAssert hasRemote_Org_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getRemote_Org_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Remote_Org_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ReplicationAssert hasSuffix(String expected)
	{
		isNotNull();
		String actualField = actual.getSuffix();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Suffix: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}