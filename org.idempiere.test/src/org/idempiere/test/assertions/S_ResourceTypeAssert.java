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
import org.compiere.model.X_S_ResourceType;

/** Generated assertion class for S_ResourceType
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class S_ResourceTypeAssert
	extends AbstractPOAssert<S_ResourceTypeAssert,X_S_ResourceType>
{

    /** Standard Constructor */
    public S_ResourceTypeAssert (X_S_ResourceType actual)
    {
      super (actual, S_ResourceTypeAssert.class);
    }


	public S_ResourceTypeAssert isAllowUoMFractions()
	{
		isNotNull();
		if (!actual.isAllowUoMFractions()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AllowUoMFractions\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public S_ResourceTypeAssert isNotAllowUoMFractions()
	{
		isNotNull();
		if (actual.isAllowUoMFractions()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AllowUoMFractions\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public S_ResourceTypeAssert hasC_TaxCategory_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_TaxCategory_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_TaxCategory_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_ResourceTypeAssert hasC_UOM_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_UOM_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_UOM_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_ResourceTypeAssert hasChargeableQty(int expected)
	{
		isNotNull();
		int actualField = actual.getChargeableQty();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ChargeableQty: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_ResourceTypeAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_ResourceTypeAssert isDateSlot()
	{
		isNotNull();
		if (!actual.isDateSlot()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DateSlot\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public S_ResourceTypeAssert isNotDateSlot()
	{
		isNotNull();
		if (actual.isDateSlot()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DateSlot\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public S_ResourceTypeAssert isSingleAssignment()
	{
		isNotNull();
		if (!actual.isSingleAssignment()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SingleAssignment\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public S_ResourceTypeAssert isNotSingleAssignment()
	{
		isNotNull();
		if (actual.isSingleAssignment()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SingleAssignment\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public S_ResourceTypeAssert isTimeSlot()
	{
		isNotNull();
		if (!actual.isTimeSlot()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be TimeSlot\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public S_ResourceTypeAssert isNotTimeSlot()
	{
		isNotNull();
		if (actual.isTimeSlot()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be TimeSlot\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public S_ResourceTypeAssert hasM_Product_Category_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_Category_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Product_Category_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_ResourceTypeAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_ResourceTypeAssert isOnFriday()
	{
		isNotNull();
		if (!actual.isOnFriday()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OnFriday\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public S_ResourceTypeAssert isNotOnFriday()
	{
		isNotNull();
		if (actual.isOnFriday()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OnFriday\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public S_ResourceTypeAssert isOnMonday()
	{
		isNotNull();
		if (!actual.isOnMonday()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OnMonday\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public S_ResourceTypeAssert isNotOnMonday()
	{
		isNotNull();
		if (actual.isOnMonday()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OnMonday\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public S_ResourceTypeAssert isOnSaturday()
	{
		isNotNull();
		if (!actual.isOnSaturday()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OnSaturday\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public S_ResourceTypeAssert isNotOnSaturday()
	{
		isNotNull();
		if (actual.isOnSaturday()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OnSaturday\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public S_ResourceTypeAssert isOnSunday()
	{
		isNotNull();
		if (!actual.isOnSunday()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OnSunday\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public S_ResourceTypeAssert isNotOnSunday()
	{
		isNotNull();
		if (actual.isOnSunday()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OnSunday\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public S_ResourceTypeAssert isOnThursday()
	{
		isNotNull();
		if (!actual.isOnThursday()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OnThursday\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public S_ResourceTypeAssert isNotOnThursday()
	{
		isNotNull();
		if (actual.isOnThursday()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OnThursday\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public S_ResourceTypeAssert isOnTuesday()
	{
		isNotNull();
		if (!actual.isOnTuesday()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OnTuesday\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public S_ResourceTypeAssert isNotOnTuesday()
	{
		isNotNull();
		if (actual.isOnTuesday()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OnTuesday\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public S_ResourceTypeAssert isOnWednesday()
	{
		isNotNull();
		if (!actual.isOnWednesday()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OnWednesday\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public S_ResourceTypeAssert isNotOnWednesday()
	{
		isNotNull();
		if (actual.isOnWednesday()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OnWednesday\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public S_ResourceTypeAssert hasS_ResourceType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getS_ResourceType_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have S_ResourceType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_ResourceTypeAssert hasS_ResourceType_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getS_ResourceType_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have S_ResourceType_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_ResourceTypeAssert hasTimeSlotEnd(Object expected)
	{
		isNotNull();
		dateAssert("TimeSlotEnd", actual.getTimeSlotEnd(), expected);
		return myself;
	}


	public S_ResourceTypeAssert hasTimeSlotStart(Object expected)
	{
		isNotNull();
		dateAssert("TimeSlotStart", actual.getTimeSlotStart(), expected);
		return myself;
	}


	public S_ResourceTypeAssert hasValue(String expected)
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