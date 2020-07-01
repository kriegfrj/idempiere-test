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
import org.compiere.model.X_S_Training_Class;

/** Generated assertion class for S_Training_Class
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class S_Training_ClassAssert
	extends AbstractPOAssert<S_Training_ClassAssert,X_S_Training_Class>
{

    /** Standard Constructor */
    public S_Training_ClassAssert (X_S_Training_Class actual)
    {
      super (actual, S_Training_ClassAssert.class);
    }


	public S_Training_ClassAssert hasEndDate(Object expected)
	{
		isNotNull();
		dateAssert("EndDate", actual.getEndDate(), expected);
		return myself;
	}


	public S_Training_ClassAssert hasM_Product_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Product_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_Training_ClassAssert hasS_Training_Class_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getS_Training_Class_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have S_Training_Class_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_Training_ClassAssert hasS_Training_Class_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getS_Training_Class_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have S_Training_Class_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_Training_ClassAssert hasS_Training_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getS_Training_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have S_Training_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public S_Training_ClassAssert hasStartDate(Object expected)
	{
		isNotNull();
		dateAssert("StartDate", actual.getStartDate(), expected);
		return myself;
	}

}