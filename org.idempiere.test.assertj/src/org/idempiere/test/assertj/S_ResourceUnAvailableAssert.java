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
import org.compiere.model.X_S_ResourceUnAvailable;

/** Generated assertion class for S_ResourceUnAvailable
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class S_ResourceUnAvailableAssert
	extends AbstractPOAssert<S_ResourceUnAvailableAssert,X_S_ResourceUnAvailable>
{

    /** Standard Constructor */
    public S_ResourceUnAvailableAssert (X_S_ResourceUnAvailable actual)
    {
      super (actual, S_ResourceUnAvailableAssert.class);
    }


	public S_ResourceUnAvailableAssert hasDateFrom(Object expected)
	{
		isNotNull();
		dateAssert("DateFrom", actual.getDateFrom(), expected);
		return myself;
	}


	public S_ResourceUnAvailableAssert hasDateTo(Object expected)
	{
		isNotNull();
		dateAssert("DateTo", actual.getDateTo(), expected);
		return myself;
	}


	public S_ResourceUnAvailableAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_ResourceUnAvailableAssert hasS_Resource_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getS_Resource_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have S_Resource_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_ResourceUnAvailableAssert hasS_ResourceUnAvailable_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getS_ResourceUnAvailable_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have S_ResourceUnAvailable_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_ResourceUnAvailableAssert hasS_ResourceUnAvailable_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getS_ResourceUnAvailable_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have S_ResourceUnAvailable_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}