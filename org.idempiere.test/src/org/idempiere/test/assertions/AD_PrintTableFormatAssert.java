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
import org.compiere.model.X_AD_PrintTableFormat;

/** Generated assertion class for AD_PrintTableFormat
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_PrintTableFormatAssert
	extends AbstractPOAssert<AD_PrintTableFormatAssert,X_AD_PrintTableFormat>
{

    /** Standard Constructor */
    public AD_PrintTableFormatAssert (X_AD_PrintTableFormat actual)
    {
      super (actual, AD_PrintTableFormatAssert.class);
    }


	public AD_PrintTableFormatAssert hasAD_Image_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Image_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Image_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintTableFormatAssert hasAD_PrintTableFormat_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PrintTableFormat_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_PrintTableFormat_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintTableFormatAssert hasAD_PrintTableFormat_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_PrintTableFormat_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_PrintTableFormat_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintTableFormatAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintTableFormatAssert hasFooterCenter(String expected)
	{
		isNotNull();
		String actualField = actual.getFooterCenter();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have FooterCenter: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintTableFormatAssert hasFooterLeft(String expected)
	{
		isNotNull();
		String actualField = actual.getFooterLeft();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have FooterLeft: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintTableFormatAssert hasFooterRight(String expected)
	{
		isNotNull();
		String actualField = actual.getFooterRight();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have FooterRight: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintTableFormatAssert hasFunct_PrintFont_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getFunct_PrintFont_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Funct_PrintFont_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintTableFormatAssert hasFunctBG_PrintColor_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getFunctBG_PrintColor_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have FunctBG_PrintColor_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintTableFormatAssert hasFunctFG_PrintColor_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getFunctFG_PrintColor_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have FunctFG_PrintColor_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintTableFormatAssert hasHdr_PrintFont_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getHdr_PrintFont_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Hdr_PrintFont_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintTableFormatAssert hasHdrLine_PrintColor_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getHdrLine_PrintColor_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have HdrLine_PrintColor_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintTableFormatAssert hasHdrStroke(Object expected)
	{
		isNotNull();
		bdAssert("HdrStroke", actual.getHdrStroke(), expected);
		return myself;
	}


	public AD_PrintTableFormatAssert hasHdrStrokeType(String expected)
	{
		isNotNull();
		String actualField = actual.getHdrStrokeType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have HdrStrokeType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintTableFormatAssert hasHdrTextBG_PrintColor_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getHdrTextBG_PrintColor_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have HdrTextBG_PrintColor_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintTableFormatAssert hasHdrTextFG_PrintColor_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getHdrTextFG_PrintColor_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have HdrTextFG_PrintColor_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintTableFormatAssert hasHeaderCenter(String expected)
	{
		isNotNull();
		String actualField = actual.getHeaderCenter();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have HeaderCenter: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintTableFormatAssert hasHeaderLeft(String expected)
	{
		isNotNull();
		String actualField = actual.getHeaderLeft();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have HeaderLeft: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintTableFormatAssert hasHeaderRight(String expected)
	{
		isNotNull();
		String actualField = actual.getHeaderRight();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have HeaderRight: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintTableFormatAssert isImageIsAttached()
	{
		isNotNull();
		if (!actual.isImageIsAttached()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ImageIsAttached\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintTableFormatAssert isNotImageIsAttached()
	{
		isNotNull();
		if (actual.isImageIsAttached()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ImageIsAttached\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintTableFormatAssert hasImageURL(String expected)
	{
		isNotNull();
		String actualField = actual.getImageURL();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ImageURL: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintTableFormatAssert isDefault()
	{
		isNotNull();
		if (!actual.isDefault()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Default\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintTableFormatAssert isNotDefault()
	{
		isNotNull();
		if (actual.isDefault()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Default\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintTableFormatAssert isMultiLineHeader()
	{
		isNotNull();
		if (!actual.isMultiLineHeader()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be MultiLineHeader\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintTableFormatAssert isNotMultiLineHeader()
	{
		isNotNull();
		if (actual.isMultiLineHeader()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be MultiLineHeader\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintTableFormatAssert isPaintBoundaryLines()
	{
		isNotNull();
		if (!actual.isPaintBoundaryLines()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PaintBoundaryLines\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintTableFormatAssert isNotPaintBoundaryLines()
	{
		isNotNull();
		if (actual.isPaintBoundaryLines()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PaintBoundaryLines\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintTableFormatAssert isPaintHeaderLines()
	{
		isNotNull();
		if (!actual.isPaintHeaderLines()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PaintHeaderLines\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintTableFormatAssert isNotPaintHeaderLines()
	{
		isNotNull();
		if (actual.isPaintHeaderLines()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PaintHeaderLines\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintTableFormatAssert isPaintHLines()
	{
		isNotNull();
		if (!actual.isPaintHLines()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PaintHLines\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintTableFormatAssert isNotPaintHLines()
	{
		isNotNull();
		if (actual.isPaintHLines()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PaintHLines\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintTableFormatAssert isPaintVLines()
	{
		isNotNull();
		if (!actual.isPaintVLines()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PaintVLines\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintTableFormatAssert isNotPaintVLines()
	{
		isNotNull();
		if (actual.isPaintVLines()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PaintVLines\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintTableFormatAssert isPrintFunctionSymbols()
	{
		isNotNull();
		if (!actual.isPrintFunctionSymbols()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PrintFunctionSymbols\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintTableFormatAssert isNotPrintFunctionSymbols()
	{
		isNotNull();
		if (actual.isPrintFunctionSymbols()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PrintFunctionSymbols\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintTableFormatAssert hasLine_PrintColor_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getLine_PrintColor_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Line_PrintColor_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintTableFormatAssert hasLineStroke(Object expected)
	{
		isNotNull();
		bdAssert("LineStroke", actual.getLineStroke(), expected);
		return myself;
	}


	public AD_PrintTableFormatAssert hasLineStrokeType(String expected)
	{
		isNotNull();
		String actualField = actual.getLineStrokeType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have LineStrokeType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintTableFormatAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}