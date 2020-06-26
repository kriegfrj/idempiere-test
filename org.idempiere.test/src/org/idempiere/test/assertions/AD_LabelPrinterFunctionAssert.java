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
import org.compiere.model.X_AD_LabelPrinterFunction;

/** Generated assertion class for AD_LabelPrinterFunction
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_LabelPrinterFunctionAssert
	extends AbstractPOAssert<AD_LabelPrinterFunctionAssert,X_AD_LabelPrinterFunction>
{

    /** Standard Constructor */
    public AD_LabelPrinterFunctionAssert (X_AD_LabelPrinterFunction actual)
    {
      super (actual, AD_LabelPrinterFunctionAssert.class);
    }


	public AD_LabelPrinterFunctionAssert hasAD_LabelPrinter_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_LabelPrinter_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_LabelPrinter_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_LabelPrinterFunctionAssert hasAD_LabelPrinterFunction_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_LabelPrinterFunction_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_LabelPrinterFunction_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_LabelPrinterFunctionAssert hasAD_LabelPrinterFunction_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_LabelPrinterFunction_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_LabelPrinterFunction_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_LabelPrinterFunctionAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_LabelPrinterFunctionAssert hasFunctionPrefix(String expected)
	{
		isNotNull();
		String actualField = actual.getFunctionPrefix();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have FunctionPrefix: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_LabelPrinterFunctionAssert hasFunctionSuffix(String expected)
	{
		isNotNull();
		String actualField = actual.getFunctionSuffix();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have FunctionSuffix: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_LabelPrinterFunctionAssert isXYPosition()
	{
		isNotNull();
		if (!actual.isXYPosition()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be XYPosition\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_LabelPrinterFunctionAssert isNotXYPosition()
	{
		isNotNull();
		if (actual.isXYPosition()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be XYPosition\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_LabelPrinterFunctionAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_LabelPrinterFunctionAssert hasXYSeparator(String expected)
	{
		isNotNull();
		String actualField = actual.getXYSeparator();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have XYSeparator: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}