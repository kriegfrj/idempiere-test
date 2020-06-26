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
import org.compiere.model.X_C_RevenueRecognition_Run;

/** Generated assertion class for C_RevenueRecognition_Run
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_RevenueRecognition_RunAssert
	extends AbstractPOAssert<C_RevenueRecognition_RunAssert,X_C_RevenueRecognition_Run>
{

    /** Standard Constructor */
    public C_RevenueRecognition_RunAssert (X_C_RevenueRecognition_Run actual)
    {
      super (actual, C_RevenueRecognition_RunAssert.class);
    }


	public C_RevenueRecognition_RunAssert hasC_RevenueRecognition_Plan_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_RevenueRecognition_Plan_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_RevenueRecognition_Plan_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RevenueRecognition_RunAssert hasC_RevenueRecognition_Run_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_RevenueRecognition_Run_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_RevenueRecognition_Run_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RevenueRecognition_RunAssert hasC_RevenueRecognition_Run_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_RevenueRecognition_Run_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_RevenueRecognition_Run_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RevenueRecognition_RunAssert hasGL_Journal_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getGL_Journal_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have GL_Journal_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RevenueRecognition_RunAssert hasRecognizedAmt(Object expected)
	{
		isNotNull();
		bdAssert("RecognizedAmt", actual.getRecognizedAmt(), expected);
		return myself;
	}

}