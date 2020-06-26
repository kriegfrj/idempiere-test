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
import org.compiere.model.X_AD_PrintLabelLine;

/** Generated assertion class for AD_PrintLabelLine
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_PrintLabelLineAssert
	extends AbstractPOAssert<AD_PrintLabelLineAssert,X_AD_PrintLabelLine>
{

    /** Standard Constructor */
    public AD_PrintLabelLineAssert (X_AD_PrintLabelLine actual)
    {
      super (actual, AD_PrintLabelLineAssert.class);
    }


	public AD_PrintLabelLineAssert hasAD_Column_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Column_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Column_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintLabelLineAssert hasAD_LabelPrinterFunction_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_LabelPrinterFunction_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_LabelPrinterFunction_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintLabelLineAssert hasAD_PrintLabel_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PrintLabel_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_PrintLabel_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintLabelLineAssert hasAD_PrintLabelLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PrintLabelLine_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_PrintLabelLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintLabelLineAssert hasAD_PrintLabelLine_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_PrintLabelLine_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_PrintLabelLine_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintLabelLineAssert hasLabelFormatType(String expected)
	{
		isNotNull();
		String actualField = actual.getLabelFormatType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have LabelFormatType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintLabelLineAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintLabelLineAssert hasPrintName(String expected)
	{
		isNotNull();
		String actualField = actual.getPrintName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PrintName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintLabelLineAssert hasSeqNo(int expected)
	{
		isNotNull();
		int actualField = actual.getSeqNo();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SeqNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintLabelLineAssert hasXPosition(int expected)
	{
		isNotNull();
		int actualField = actual.getXPosition();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have XPosition: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintLabelLineAssert hasYPosition(int expected)
	{
		isNotNull();
		int actualField = actual.getYPosition();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have YPosition: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}