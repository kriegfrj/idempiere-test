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
import org.compiere.model.X_AD_WorkflowProcessorLog;

/** Generated assertion class for AD_WorkflowProcessorLog
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_WorkflowProcessorLogAssert
	extends AbstractPOAssert<AD_WorkflowProcessorLogAssert,X_AD_WorkflowProcessorLog>
{

    /** Standard Constructor */
    public AD_WorkflowProcessorLogAssert (X_AD_WorkflowProcessorLog actual)
    {
      super (actual, AD_WorkflowProcessorLogAssert.class);
    }


	public AD_WorkflowProcessorLogAssert hasAD_WorkflowProcessor_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_WorkflowProcessor_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_WorkflowProcessor_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WorkflowProcessorLogAssert hasAD_WorkflowProcessorLog_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_WorkflowProcessorLog_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_WorkflowProcessorLog_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WorkflowProcessorLogAssert hasAD_WorkflowProcessorLog_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_WorkflowProcessorLog_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_WorkflowProcessorLog_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WorkflowProcessorLogAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WorkflowProcessorLogAssert isError()
	{
		isNotNull();
		if (!actual.isError()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Error\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_WorkflowProcessorLogAssert isNotError()
	{
		isNotNull();
		if (actual.isError()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Error\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_WorkflowProcessorLogAssert hasReference(String expected)
	{
		isNotNull();
		String actualField = actual.getReference();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Reference: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WorkflowProcessorLogAssert hasSummary(String expected)
	{
		isNotNull();
		String actualField = actual.getSummary();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Summary: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WorkflowProcessorLogAssert hasTextMsg(String expected)
	{
		isNotNull();
		String actualField = actual.getTextMsg();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have TextMsg: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}