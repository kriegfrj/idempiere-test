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
import org.compiere.model.X_AD_LdapProcessorLog;

/** Generated assertion class for AD_LdapProcessorLog
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_LdapProcessorLogAssert
	extends AbstractPOAssert<AD_LdapProcessorLogAssert,X_AD_LdapProcessorLog>
{

    /** Standard Constructor */
    public AD_LdapProcessorLogAssert (X_AD_LdapProcessorLog actual)
    {
      super (actual, AD_LdapProcessorLogAssert.class);
    }


	public AD_LdapProcessorLogAssert hasAD_LdapProcessor_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_LdapProcessor_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_LdapProcessor_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_LdapProcessorLogAssert hasAD_LdapProcessorLog_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_LdapProcessorLog_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_LdapProcessorLog_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_LdapProcessorLogAssert hasAD_LdapProcessorLog_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_LdapProcessorLog_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_LdapProcessorLog_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_LdapProcessorLogAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_LdapProcessorLogAssert isError()
	{
		isNotNull();
		if (!actual.isError()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Error\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_LdapProcessorLogAssert isNotError()
	{
		isNotNull();
		if (actual.isError()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Error\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_LdapProcessorLogAssert hasReference(String expected)
	{
		isNotNull();
		String actualField = actual.getReference();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Reference: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_LdapProcessorLogAssert hasSummary(String expected)
	{
		isNotNull();
		String actualField = actual.getSummary();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Summary: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_LdapProcessorLogAssert hasTextMsg(String expected)
	{
		isNotNull();
		String actualField = actual.getTextMsg();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have TextMsg: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}