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
import org.compiere.model.X_AD_ImpFormat_Row;

/** Generated assertion class for AD_ImpFormat_Row
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_ImpFormat_RowAssert
	extends AbstractPOAssert<AD_ImpFormat_RowAssert,X_AD_ImpFormat_Row>
{

    /** Standard Constructor */
    public AD_ImpFormat_RowAssert (X_AD_ImpFormat_Row actual)
    {
      super (actual, AD_ImpFormat_RowAssert.class);
    }


	public AD_ImpFormat_RowAssert hasAD_Column_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Column_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Column_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ImpFormat_RowAssert hasAD_ImpFormat_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_ImpFormat_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_ImpFormat_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ImpFormat_RowAssert hasAD_ImpFormat_Row_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_ImpFormat_Row_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_ImpFormat_Row_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ImpFormat_RowAssert hasAD_ImpFormat_Row_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_ImpFormat_Row_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_ImpFormat_Row_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ImpFormat_RowAssert hasCallout(String expected)
	{
		isNotNull();
		String actualField = actual.getCallout();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Callout: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ImpFormat_RowAssert hasConstantValue(String expected)
	{
		isNotNull();
		String actualField = actual.getConstantValue();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ConstantValue: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ImpFormat_RowAssert hasDataFormat(String expected)
	{
		isNotNull();
		String actualField = actual.getDataFormat();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DataFormat: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ImpFormat_RowAssert hasDataType(String expected)
	{
		isNotNull();
		String actualField = actual.getDataType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DataType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ImpFormat_RowAssert hasDecimalPoint(String expected)
	{
		isNotNull();
		String actualField = actual.getDecimalPoint();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DecimalPoint: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ImpFormat_RowAssert isDivideBy100()
	{
		isNotNull();
		if (!actual.isDivideBy100()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DivideBy100\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_ImpFormat_RowAssert isNotDivideBy100()
	{
		isNotNull();
		if (actual.isDivideBy100()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DivideBy100\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_ImpFormat_RowAssert hasEndNo(int expected)
	{
		isNotNull();
		int actualField = actual.getEndNo();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have EndNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ImpFormat_RowAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ImpFormat_RowAssert hasScript(String expected)
	{
		isNotNull();
		String actualField = actual.getScript();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Script: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ImpFormat_RowAssert hasSeqNo(int expected)
	{
		isNotNull();
		int actualField = actual.getSeqNo();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SeqNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ImpFormat_RowAssert hasStartNo(int expected)
	{
		isNotNull();
		int actualField = actual.getStartNo();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have StartNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}