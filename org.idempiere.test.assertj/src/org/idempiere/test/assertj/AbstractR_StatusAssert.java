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
import org.compiere.model.X_R_Status;

/** Generated assertion class for R_Status
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractR_StatusAssert<SELF extends AbstractR_StatusAssert<SELF, ACTUAL>, ACTUAL extends X_R_Status>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractR_StatusAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isClosed()
	{
		isNotNull();
		if (!actual.isClosed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Closed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotClosed()
	{
		isNotNull();
		if (actual.isClosed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Closed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isDefault()
	{
		isNotNull();
		if (!actual.isDefault()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Default\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotDefault()
	{
		isNotNull();
		if (actual.isDefault()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Default\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isFinalClose()
	{
		isNotNull();
		if (!actual.isFinalClose()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be FinalClose\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotFinalClose()
	{
		isNotNull();
		if (actual.isFinalClose()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be FinalClose\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isOpen()
	{
		isNotNull();
		if (!actual.isOpen()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Open\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotOpen()
	{
		isNotNull();
		if (actual.isOpen()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Open\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isWebCanUpdate()
	{
		isNotNull();
		if (!actual.isWebCanUpdate()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be WebCanUpdate\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotWebCanUpdate()
	{
		isNotNull();
		if (actual.isWebCanUpdate()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be WebCanUpdate\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasNext_Status_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getNext_Status_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Next_Status_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasR_Status_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getR_Status_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have R_Status_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasR_Status_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getR_Status_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have R_Status_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasR_StatusCategory_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getR_StatusCategory_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have R_StatusCategory_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasSeqNo(int expected)
	{
		isNotNull();
		int actualField = actual.getSeqNo();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have SeqNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasTimeoutDays(int expected)
	{
		isNotNull();
		int actualField = actual.getTimeoutDays();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have TimeoutDays: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasUpdate_Status_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getUpdate_Status_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Update_Status_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasValue(String expected)
	{
		isNotNull();
		String actualField = actual.getValue();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Value: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}