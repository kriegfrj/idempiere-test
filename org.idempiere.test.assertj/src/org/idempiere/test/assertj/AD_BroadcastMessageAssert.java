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
import org.compiere.model.X_AD_BroadcastMessage;

/** Generated assertion class for AD_BroadcastMessage
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_BroadcastMessageAssert
	extends AbstractPOAssert<AD_BroadcastMessageAssert,X_AD_BroadcastMessage>
{

    /** Standard Constructor */
    public AD_BroadcastMessageAssert (X_AD_BroadcastMessage actual)
    {
      super (actual, AD_BroadcastMessageAssert.class);
    }


	public AD_BroadcastMessageAssert hasAD_BroadcastMessage_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_BroadcastMessage_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_BroadcastMessage_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_BroadcastMessageAssert hasAD_BroadcastMessage_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_BroadcastMessage_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_BroadcastMessage_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_BroadcastMessageAssert hasAD_Role_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Role_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Role_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_BroadcastMessageAssert hasAD_User_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_User_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_User_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_BroadcastMessageAssert hasBroadcastFrequency(String expected)
	{
		isNotNull();
		String actualField = actual.getBroadcastFrequency();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have BroadcastFrequency: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_BroadcastMessageAssert hasBroadcastMessage(String expected)
	{
		isNotNull();
		String actualField = actual.getBroadcastMessage();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have BroadcastMessage: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_BroadcastMessageAssert hasBroadcastType(String expected)
	{
		isNotNull();
		String actualField = actual.getBroadcastType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have BroadcastType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_BroadcastMessageAssert hasExpiration(Object expected)
	{
		isNotNull();
		dateAssert("Expiration", actual.getExpiration(), expected);
		return myself;
	}


	public AD_BroadcastMessageAssert isExpired()
	{
		isNotNull();
		if (!actual.isExpired()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Expired\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_BroadcastMessageAssert isNotExpired()
	{
		isNotNull();
		if (actual.isExpired()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Expired\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_BroadcastMessageAssert isPublished()
	{
		isNotNull();
		if (!actual.isPublished()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Published\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_BroadcastMessageAssert isNotPublished()
	{
		isNotNull();
		if (actual.isPublished()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Published\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_BroadcastMessageAssert isLogAcknowledge()
	{
		isNotNull();
		if (!actual.isLogAcknowledge()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be LogAcknowledge\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_BroadcastMessageAssert isNotLogAcknowledge()
	{
		isNotNull();
		if (actual.isLogAcknowledge()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be LogAcknowledge\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_BroadcastMessageAssert hasNotification_Client_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getNotification_Client_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Notification_Client_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_BroadcastMessageAssert isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_BroadcastMessageAssert isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_BroadcastMessageAssert hasTarget(String expected)
	{
		isNotNull();
		String actualField = actual.getTarget();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Target: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}