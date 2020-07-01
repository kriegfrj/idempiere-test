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
import org.compiere.model.X_C_ChargeType_DocType;

/** Generated assertion class for C_ChargeType_DocType
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_ChargeType_DocTypeAssert
	extends AbstractPOAssert<C_ChargeType_DocTypeAssert,X_C_ChargeType_DocType>
{

    /** Standard Constructor */
    public C_ChargeType_DocTypeAssert (X_C_ChargeType_DocType actual)
    {
      super (actual, C_ChargeType_DocTypeAssert.class);
    }


	public C_ChargeType_DocTypeAssert hasC_ChargeType_DocType_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_ChargeType_DocType_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_ChargeType_DocType_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_ChargeType_DocTypeAssert hasC_ChargeType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ChargeType_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_ChargeType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_ChargeType_DocTypeAssert hasC_DocType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_DocType_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_DocType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_ChargeType_DocTypeAssert isAllowNegative()
	{
		isNotNull();
		if (!actual.isAllowNegative()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AllowNegative\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_ChargeType_DocTypeAssert isNotAllowNegative()
	{
		isNotNull();
		if (actual.isAllowNegative()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AllowNegative\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_ChargeType_DocTypeAssert isAllowPositive()
	{
		isNotNull();
		if (!actual.isAllowPositive()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AllowPositive\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_ChargeType_DocTypeAssert isNotAllowPositive()
	{
		isNotNull();
		if (actual.isAllowPositive()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AllowPositive\nbut it was",
				getPODescription());
		}
		return myself;
	}
}