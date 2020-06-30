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
import org.compiere.model.X_R_Status;

/** Generated assertion class for R_Status
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class R_StatusAssert
	extends AbstractPOAssert<R_StatusAssert,X_R_Status>
{

    /** Standard Constructor */
    public R_StatusAssert (X_R_Status actual)
    {
      super (actual, R_StatusAssert.class);
    }


	public R_StatusAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_StatusAssert hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_StatusAssert isClosed()
	{
		isNotNull();
		if (!actual.isClosed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Closed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public R_StatusAssert isNotClosed()
	{
		isNotNull();
		if (actual.isClosed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Closed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public R_StatusAssert isDefault()
	{
		isNotNull();
		if (!actual.isDefault()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Default\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public R_StatusAssert isNotDefault()
	{
		isNotNull();
		if (actual.isDefault()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Default\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public R_StatusAssert isFinalClose()
	{
		isNotNull();
		if (!actual.isFinalClose()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be FinalClose\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public R_StatusAssert isNotFinalClose()
	{
		isNotNull();
		if (actual.isFinalClose()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be FinalClose\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public R_StatusAssert isOpen()
	{
		isNotNull();
		if (!actual.isOpen()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Open\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public R_StatusAssert isNotOpen()
	{
		isNotNull();
		if (actual.isOpen()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Open\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public R_StatusAssert isWebCanUpdate()
	{
		isNotNull();
		if (!actual.isWebCanUpdate()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be WebCanUpdate\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public R_StatusAssert isNotWebCanUpdate()
	{
		isNotNull();
		if (actual.isWebCanUpdate()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be WebCanUpdate\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public R_StatusAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_StatusAssert hasNext_Status_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getNext_Status_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Next_Status_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_StatusAssert hasR_Status_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getR_Status_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have R_Status_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_StatusAssert hasR_Status_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getR_Status_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have R_Status_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_StatusAssert hasR_StatusCategory_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getR_StatusCategory_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have R_StatusCategory_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_StatusAssert hasSeqNo(int expected)
	{
		isNotNull();
		int actualField = actual.getSeqNo();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SeqNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_StatusAssert hasTimeoutDays(int expected)
	{
		isNotNull();
		int actualField = actual.getTimeoutDays();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have TimeoutDays: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_StatusAssert hasUpdate_Status_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getUpdate_Status_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Update_Status_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_StatusAssert hasValue(String expected)
	{
		isNotNull();
		String actualField = actual.getValue();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Value: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}