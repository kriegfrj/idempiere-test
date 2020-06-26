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
import org.compiere.model.X_M_SerNoCtl;

/** Generated assertion class for M_SerNoCtl
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class M_SerNoCtlAssert
	extends AbstractPOAssert<M_SerNoCtlAssert,X_M_SerNoCtl>
{

    /** Standard Constructor */
    public M_SerNoCtlAssert (X_M_SerNoCtl actual)
    {
      super (actual, M_SerNoCtlAssert.class);
    }


	public M_SerNoCtlAssert hasCurrentNext(int expected)
	{
		isNotNull();
		int actualField = actual.getCurrentNext();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CurrentNext: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_SerNoCtlAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_SerNoCtlAssert hasIncrementNo(int expected)
	{
		isNotNull();
		int actualField = actual.getIncrementNo();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have IncrementNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_SerNoCtlAssert hasM_SerNoCtl_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_SerNoCtl_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_SerNoCtl_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_SerNoCtlAssert hasM_SerNoCtl_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getM_SerNoCtl_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_SerNoCtl_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_SerNoCtlAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_SerNoCtlAssert hasPrefix(String expected)
	{
		isNotNull();
		String actualField = actual.getPrefix();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Prefix: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_SerNoCtlAssert hasStartNo(int expected)
	{
		isNotNull();
		int actualField = actual.getStartNo();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have StartNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_SerNoCtlAssert hasSuffix(String expected)
	{
		isNotNull();
		String actualField = actual.getSuffix();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Suffix: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}