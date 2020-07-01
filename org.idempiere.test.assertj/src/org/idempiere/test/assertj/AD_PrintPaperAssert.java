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
import org.compiere.model.X_AD_PrintPaper;

/** Generated assertion class for AD_PrintPaper
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_PrintPaperAssert
	extends AbstractPOAssert<AD_PrintPaperAssert,X_AD_PrintPaper>
{

    /** Standard Constructor */
    public AD_PrintPaperAssert (X_AD_PrintPaper actual)
    {
      super (actual, AD_PrintPaperAssert.class);
    }


	public AD_PrintPaperAssert hasAD_PrintPaper_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PrintPaper_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_PrintPaper_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintPaperAssert hasAD_PrintPaper_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_PrintPaper_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_PrintPaper_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintPaperAssert hasCode(String expected)
	{
		isNotNull();
		String actualField = actual.getCode();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Code: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintPaperAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintPaperAssert hasDimensionUnits(String expected)
	{
		isNotNull();
		String actualField = actual.getDimensionUnits();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DimensionUnits: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintPaperAssert isDefault()
	{
		isNotNull();
		if (!actual.isDefault()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Default\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintPaperAssert isNotDefault()
	{
		isNotNull();
		if (actual.isDefault()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Default\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintPaperAssert isLandscape()
	{
		isNotNull();
		if (!actual.isLandscape()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Landscape\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintPaperAssert isNotLandscape()
	{
		isNotNull();
		if (actual.isLandscape()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Landscape\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintPaperAssert hasMarginBottom(int expected)
	{
		isNotNull();
		int actualField = actual.getMarginBottom();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have MarginBottom: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintPaperAssert hasMarginLeft(int expected)
	{
		isNotNull();
		int actualField = actual.getMarginLeft();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have MarginLeft: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintPaperAssert hasMarginRight(int expected)
	{
		isNotNull();
		int actualField = actual.getMarginRight();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have MarginRight: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintPaperAssert hasMarginTop(int expected)
	{
		isNotNull();
		int actualField = actual.getMarginTop();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have MarginTop: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintPaperAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintPaperAssert hasSizeX(Object expected)
	{
		isNotNull();
		bdAssert("SizeX", actual.getSizeX(), expected);
		return myself;
	}


	public AD_PrintPaperAssert hasSizeY(Object expected)
	{
		isNotNull();
		bdAssert("SizeY", actual.getSizeY(), expected);
		return myself;
	}

}