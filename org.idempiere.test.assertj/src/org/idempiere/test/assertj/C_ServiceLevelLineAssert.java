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
import org.compiere.model.X_C_ServiceLevelLine;

/** Generated assertion class for C_ServiceLevelLine
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_ServiceLevelLineAssert
	extends AbstractPOAssert<C_ServiceLevelLineAssert,X_C_ServiceLevelLine>
{

    /** Standard Constructor */
    public C_ServiceLevelLineAssert (X_C_ServiceLevelLine actual)
    {
      super (actual, C_ServiceLevelLineAssert.class);
    }


	public C_ServiceLevelLineAssert hasC_ServiceLevel_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ServiceLevel_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_ServiceLevel_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_ServiceLevelLineAssert hasC_ServiceLevelLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ServiceLevelLine_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_ServiceLevelLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_ServiceLevelLineAssert hasC_ServiceLevelLine_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_ServiceLevelLine_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_ServiceLevelLine_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_ServiceLevelLineAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_ServiceLevelLineAssert isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_ServiceLevelLineAssert isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_ServiceLevelLineAssert hasServiceDate(Object expected)
	{
		isNotNull();
		dateAssert("ServiceDate", actual.getServiceDate(), expected);
		return myself;
	}


	public C_ServiceLevelLineAssert hasServiceLevelProvided(Object expected)
	{
		isNotNull();
		bdAssert("ServiceLevelProvided", actual.getServiceLevelProvided(), expected);
		return myself;
	}

}