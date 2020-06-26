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
import org.compiere.model.X_M_LocatorType;

/** Generated assertion class for M_LocatorType
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class M_LocatorTypeAssert
	extends AbstractPOAssert<M_LocatorTypeAssert,X_M_LocatorType>
{

    /** Standard Constructor */
    public M_LocatorTypeAssert (X_M_LocatorType actual)
    {
      super (actual, M_LocatorTypeAssert.class);
    }


	public M_LocatorTypeAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_LocatorTypeAssert hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_LocatorTypeAssert isAvailableForReplenishment()
	{
		isNotNull();
		if (!actual.isAvailableForReplenishment()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AvailableForReplenishment\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_LocatorTypeAssert isNotAvailableForReplenishment()
	{
		isNotNull();
		if (actual.isAvailableForReplenishment()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AvailableForReplenishment\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_LocatorTypeAssert isAvailableForReservation()
	{
		isNotNull();
		if (!actual.isAvailableForReservation()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AvailableForReservation\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_LocatorTypeAssert isNotAvailableForReservation()
	{
		isNotNull();
		if (actual.isAvailableForReservation()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AvailableForReservation\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_LocatorTypeAssert isAvailableForShipping()
	{
		isNotNull();
		if (!actual.isAvailableForShipping()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AvailableForShipping\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_LocatorTypeAssert isNotAvailableForShipping()
	{
		isNotNull();
		if (actual.isAvailableForShipping()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AvailableForShipping\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_LocatorTypeAssert hasM_LocatorType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_LocatorType_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_LocatorType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_LocatorTypeAssert hasM_LocatorType_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getM_LocatorType_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_LocatorType_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_LocatorTypeAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}