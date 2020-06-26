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
import org.compiere.model.X_S_Resource;

/** Generated assertion class for S_Resource
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class S_ResourceAssert
	extends AbstractPOAssert<S_ResourceAssert,X_S_Resource>
{

    /** Standard Constructor */
    public S_ResourceAssert (X_S_Resource actual)
    {
      super (actual, S_ResourceAssert.class);
    }


	public S_ResourceAssert hasAD_User_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_User_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_User_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_ResourceAssert hasChargeableQty(Object expected)
	{
		isNotNull();
		bdAssert("ChargeableQty", actual.getChargeableQty(), expected);
		return myself;
	}


	public S_ResourceAssert hasDailyCapacity(Object expected)
	{
		isNotNull();
		bdAssert("DailyCapacity", actual.getDailyCapacity(), expected);
		return myself;
	}


	public S_ResourceAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_ResourceAssert isAvailable()
	{
		isNotNull();
		if (!actual.isAvailable()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Available\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public S_ResourceAssert isNotAvailable()
	{
		isNotNull();
		if (actual.isAvailable()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Available\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public S_ResourceAssert isManufacturingResource()
	{
		isNotNull();
		if (!actual.isManufacturingResource()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ManufacturingResource\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public S_ResourceAssert isNotManufacturingResource()
	{
		isNotNull();
		if (actual.isManufacturingResource()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ManufacturingResource\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public S_ResourceAssert hasM_Warehouse_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Warehouse_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Warehouse_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_ResourceAssert hasManufacturingResourceType(String expected)
	{
		isNotNull();
		String actualField = actual.getManufacturingResourceType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ManufacturingResourceType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_ResourceAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_ResourceAssert hasPercentUtilization(Object expected)
	{
		isNotNull();
		bdAssert("PercentUtilization", actual.getPercentUtilization(), expected);
		return myself;
	}


	public S_ResourceAssert hasPlanningHorizon(int expected)
	{
		isNotNull();
		int actualField = actual.getPlanningHorizon();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PlanningHorizon: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_ResourceAssert hasQueuingTime(Object expected)
	{
		isNotNull();
		bdAssert("QueuingTime", actual.getQueuingTime(), expected);
		return myself;
	}


	public S_ResourceAssert hasS_Resource_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getS_Resource_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have S_Resource_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_ResourceAssert hasS_Resource_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getS_Resource_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have S_Resource_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_ResourceAssert hasS_ResourceType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getS_ResourceType_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have S_ResourceType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_ResourceAssert hasValue(String expected)
	{
		isNotNull();
		String actualField = actual.getValue();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Value: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_ResourceAssert hasWaitingTime(Object expected)
	{
		isNotNull();
		bdAssert("WaitingTime", actual.getWaitingTime(), expected);
		return myself;
	}

}