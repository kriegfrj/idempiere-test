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
import org.compiere.model.X_R_RequestUpdate;

/** Generated assertion class for R_RequestUpdate
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class R_RequestUpdateAssert
	extends AbstractPOAssert<R_RequestUpdateAssert,X_R_RequestUpdate>
{

    /** Standard Constructor */
    public R_RequestUpdateAssert (X_R_RequestUpdate actual)
    {
      super (actual, R_RequestUpdateAssert.class);
    }


	public R_RequestUpdateAssert hasConfidentialTypeEntry(String expected)
	{
		isNotNull();
		String actualField = actual.getConfidentialTypeEntry();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ConfidentialTypeEntry: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestUpdateAssert hasEndTime(Object expected)
	{
		isNotNull();
		dateAssert("EndTime", actual.getEndTime(), expected);
		return myself;
	}


	public R_RequestUpdateAssert hasM_ProductSpent_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_ProductSpent_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_ProductSpent_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestUpdateAssert hasQtyInvoiced(Object expected)
	{
		isNotNull();
		bdAssert("QtyInvoiced", actual.getQtyInvoiced(), expected);
		return myself;
	}


	public R_RequestUpdateAssert hasQtySpent(Object expected)
	{
		isNotNull();
		bdAssert("QtySpent", actual.getQtySpent(), expected);
		return myself;
	}


	public R_RequestUpdateAssert hasR_Request_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getR_Request_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have R_Request_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestUpdateAssert hasR_RequestUpdate_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getR_RequestUpdate_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have R_RequestUpdate_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestUpdateAssert hasR_RequestUpdate_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getR_RequestUpdate_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have R_RequestUpdate_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestUpdateAssert hasResult(String expected)
	{
		isNotNull();
		String actualField = actual.getResult();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Result: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_RequestUpdateAssert hasStartTime(Object expected)
	{
		isNotNull();
		dateAssert("StartTime", actual.getStartTime(), expected);
		return myself;
	}

}