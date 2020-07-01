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
import org.compiere.model.X_S_ResourceAssignment;

/** Generated assertion class for S_ResourceAssignment
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class S_ResourceAssignmentAssert
	extends AbstractPOAssert<S_ResourceAssignmentAssert,X_S_ResourceAssignment>
{

    /** Standard Constructor */
    public S_ResourceAssignmentAssert (X_S_ResourceAssignment actual)
    {
      super (actual, S_ResourceAssignmentAssert.class);
    }


	public S_ResourceAssignmentAssert hasAssignDateFrom(Object expected)
	{
		isNotNull();
		dateAssert("AssignDateFrom", actual.getAssignDateFrom(), expected);
		return myself;
	}


	public S_ResourceAssignmentAssert hasAssignDateTo(Object expected)
	{
		isNotNull();
		dateAssert("AssignDateTo", actual.getAssignDateTo(), expected);
		return myself;
	}


	public S_ResourceAssignmentAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_ResourceAssignmentAssert isConfirmed()
	{
		isNotNull();
		if (!actual.isConfirmed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Confirmed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public S_ResourceAssignmentAssert isNotConfirmed()
	{
		isNotNull();
		if (actual.isConfirmed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Confirmed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public S_ResourceAssignmentAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_ResourceAssignmentAssert hasQty(Object expected)
	{
		isNotNull();
		bdAssert("Qty", actual.getQty(), expected);
		return myself;
	}


	public S_ResourceAssignmentAssert hasS_Resource_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getS_Resource_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have S_Resource_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_ResourceAssignmentAssert hasS_ResourceAssignment_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getS_ResourceAssignment_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have S_ResourceAssignment_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_ResourceAssignmentAssert hasS_ResourceAssignment_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getS_ResourceAssignment_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have S_ResourceAssignment_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}