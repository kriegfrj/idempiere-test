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
import org.compiere.model.X_AD_Replication_Run;

/** Generated assertion class for AD_Replication_Run
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_Replication_RunAssert
	extends AbstractPOAssert<AD_Replication_RunAssert,X_AD_Replication_Run>
{

    /** Standard Constructor */
    public AD_Replication_RunAssert (X_AD_Replication_Run actual)
    {
      super (actual, AD_Replication_RunAssert.class);
    }


	public AD_Replication_RunAssert hasAD_Replication_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Replication_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Replication_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Replication_RunAssert hasAD_Replication_Run_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Replication_Run_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Replication_Run_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Replication_RunAssert hasAD_Replication_Run_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Replication_Run_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Replication_Run_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Replication_RunAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_Replication_RunAssert isReplicated()
	{
		isNotNull();
		if (!actual.isReplicated()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Replicated\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_Replication_RunAssert isNotReplicated()
	{
		isNotNull();
		if (actual.isReplicated()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Replicated\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_Replication_RunAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}