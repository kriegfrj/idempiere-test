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
import org.compiere.model.X_CM_Chat;

/** Generated assertion class for CM_Chat
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class CM_ChatAssert
	extends AbstractPOAssert<CM_ChatAssert,X_CM_Chat>
{

    /** Standard Constructor */
    public CM_ChatAssert (X_CM_Chat actual)
    {
      super (actual, CM_ChatAssert.class);
    }


	public CM_ChatAssert hasAD_Table_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Table_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Table_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_ChatAssert hasCM_Chat_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getCM_Chat_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CM_Chat_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_ChatAssert hasCM_Chat_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getCM_Chat_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CM_Chat_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_ChatAssert hasCM_ChatType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getCM_ChatType_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CM_ChatType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_ChatAssert hasConfidentialType(String expected)
	{
		isNotNull();
		String actualField = actual.getConfidentialType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ConfidentialType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_ChatAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_ChatAssert hasModerationType(String expected)
	{
		isNotNull();
		String actualField = actual.getModerationType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ModerationType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}