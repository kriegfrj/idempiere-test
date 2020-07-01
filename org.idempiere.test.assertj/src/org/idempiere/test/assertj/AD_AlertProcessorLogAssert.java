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
import org.compiere.model.X_AD_AlertProcessorLog;

/** Generated assertion class for AD_AlertProcessorLog
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_AlertProcessorLogAssert
	extends AbstractPOAssert<AD_AlertProcessorLogAssert,X_AD_AlertProcessorLog>
{

    /** Standard Constructor */
    public AD_AlertProcessorLogAssert (X_AD_AlertProcessorLog actual)
    {
      super (actual, AD_AlertProcessorLogAssert.class);
    }


	public AD_AlertProcessorLogAssert hasAD_AlertProcessor_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_AlertProcessor_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_AlertProcessor_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_AlertProcessorLogAssert hasAD_AlertProcessorLog_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_AlertProcessorLog_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_AlertProcessorLog_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_AlertProcessorLogAssert hasAD_AlertProcessorLog_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_AlertProcessorLog_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_AlertProcessorLog_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_AlertProcessorLogAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_AlertProcessorLogAssert isError()
	{
		isNotNull();
		if (!actual.isError()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Error\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_AlertProcessorLogAssert isNotError()
	{
		isNotNull();
		if (actual.isError()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Error\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_AlertProcessorLogAssert hasReference(String expected)
	{
		isNotNull();
		String actualField = actual.getReference();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Reference: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_AlertProcessorLogAssert hasSummary(String expected)
	{
		isNotNull();
		String actualField = actual.getSummary();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Summary: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_AlertProcessorLogAssert hasTextMsg(String expected)
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