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
import org.compiere.model.X_R_RequestType;

/** Generated assertion class for R_RequestType
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class R_RequestTypeAssert
	extends AbstractPOAssert<R_RequestTypeAssert,X_R_RequestType>
{

    /** Standard Constructor */
    public R_RequestTypeAssert (X_R_RequestType actual)
    {
      super (actual, R_RequestTypeAssert.class);
    }


	public R_RequestTypeAssert hasAutoDueDateDays(int expected)
	{
		isNotNull();
		int actualField = actual.getAutoDueDateDays();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AutoDueDateDays: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestTypeAssert hasConfidentialType(String expected)
	{
		isNotNull();
		String actualField = actual.getConfidentialType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ConfidentialType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestTypeAssert hasContentColor(String expected)
	{
		isNotNull();
		String actualField = actual.getContentColor();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ContentColor: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestTypeAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestTypeAssert hasDueDateTolerance(int expected)
	{
		isNotNull();
		int actualField = actual.getDueDateTolerance();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DueDateTolerance: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestTypeAssert hasHeaderColor(String expected)
	{
		isNotNull();
		String actualField = actual.getHeaderColor();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have HeaderColor: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestTypeAssert isAutoChangeRequest()
	{
		isNotNull();
		if (!actual.isAutoChangeRequest()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AutoChangeRequest\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public R_RequestTypeAssert isNotAutoChangeRequest()
	{
		isNotNull();
		if (actual.isAutoChangeRequest()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AutoChangeRequest\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public R_RequestTypeAssert isConfidentialInfo()
	{
		isNotNull();
		if (!actual.isConfidentialInfo()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ConfidentialInfo\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public R_RequestTypeAssert isNotConfidentialInfo()
	{
		isNotNull();
		if (actual.isConfidentialInfo()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ConfidentialInfo\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public R_RequestTypeAssert isDefault()
	{
		isNotNull();
		if (!actual.isDefault()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Default\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public R_RequestTypeAssert isNotDefault()
	{
		isNotNull();
		if (actual.isDefault()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Default\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public R_RequestTypeAssert isEMailWhenDue()
	{
		isNotNull();
		if (!actual.isEMailWhenDue()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be EMailWhenDue\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public R_RequestTypeAssert isNotEMailWhenDue()
	{
		isNotNull();
		if (actual.isEMailWhenDue()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be EMailWhenDue\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public R_RequestTypeAssert isEMailWhenOverdue()
	{
		isNotNull();
		if (!actual.isEMailWhenOverdue()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be EMailWhenOverdue\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public R_RequestTypeAssert isNotEMailWhenOverdue()
	{
		isNotNull();
		if (actual.isEMailWhenOverdue()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be EMailWhenOverdue\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public R_RequestTypeAssert isIndexed()
	{
		isNotNull();
		if (!actual.isIndexed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Indexed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public R_RequestTypeAssert isNotIndexed()
	{
		isNotNull();
		if (actual.isIndexed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Indexed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public R_RequestTypeAssert isInvoiced()
	{
		isNotNull();
		if (!actual.isInvoiced()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Invoiced\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public R_RequestTypeAssert isNotInvoiced()
	{
		isNotNull();
		if (actual.isInvoiced()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Invoiced\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public R_RequestTypeAssert isSelfService()
	{
		isNotNull();
		if (!actual.isSelfService()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SelfService\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public R_RequestTypeAssert isNotSelfService()
	{
		isNotNull();
		if (actual.isSelfService()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SelfService\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public R_RequestTypeAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestTypeAssert hasR_RequestType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getR_RequestType_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have R_RequestType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestTypeAssert hasR_RequestType_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getR_RequestType_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have R_RequestType_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestTypeAssert hasR_StatusCategory_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getR_StatusCategory_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have R_StatusCategory_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}