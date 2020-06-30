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
import org.compiere.model.X_AD_PrintFormatItem;

/** Generated assertion class for AD_PrintFormatItem
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_PrintFormatItemAssert
	extends AbstractPOAssert<AD_PrintFormatItemAssert,X_AD_PrintFormatItem>
{

    /** Standard Constructor */
    public AD_PrintFormatItemAssert (X_AD_PrintFormatItem actual)
    {
      super (actual, AD_PrintFormatItemAssert.class);
    }


	public AD_PrintFormatItemAssert hasAD_Column_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Column_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Column_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatItemAssert hasAD_PrintColor_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PrintColor_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_PrintColor_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatItemAssert hasAD_PrintFont_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PrintFont_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_PrintFont_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatItemAssert hasAD_PrintFormat_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PrintFormat_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_PrintFormat_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatItemAssert hasAD_PrintFormatChild_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PrintFormatChild_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_PrintFormatChild_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatItemAssert hasAD_PrintFormatItem_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PrintFormatItem_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_PrintFormatItem_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatItemAssert hasAD_PrintFormatItem_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_PrintFormatItem_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_PrintFormatItem_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatItemAssert hasAD_PrintGraph_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PrintGraph_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_PrintGraph_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatItemAssert hasArcDiameter(int expected)
	{
		isNotNull();
		int actualField = actual.getArcDiameter();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ArcDiameter: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatItemAssert hasBarcodeType(String expected)
	{
		isNotNull();
		String actualField = actual.getBarcodeType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have BarcodeType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatItemAssert hasBelowColumn(int expected)
	{
		isNotNull();
		int actualField = actual.getBelowColumn();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have BelowColumn: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatItemAssert hasFieldAlignmentType(String expected)
	{
		isNotNull();
		String actualField = actual.getFieldAlignmentType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have FieldAlignmentType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatItemAssert hasFormatPattern(String expected)
	{
		isNotNull();
		String actualField = actual.getFormatPattern();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have FormatPattern: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isImageIsAttached()
	{
		isNotNull();
		if (!actual.isImageIsAttached()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ImageIsAttached\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isNotImageIsAttached()
	{
		isNotNull();
		if (actual.isImageIsAttached()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ImageIsAttached\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert hasImageURL(String expected)
	{
		isNotNull();
		String actualField = actual.getImageURL();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ImageURL: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isAveraged()
	{
		isNotNull();
		if (!actual.isAveraged()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Averaged\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isNotAveraged()
	{
		isNotNull();
		if (actual.isAveraged()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Averaged\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isCentrallyMaintained()
	{
		isNotNull();
		if (!actual.isCentrallyMaintained()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CentrallyMaintained\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isNotCentrallyMaintained()
	{
		isNotNull();
		if (actual.isCentrallyMaintained()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CentrallyMaintained\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isCounted()
	{
		isNotNull();
		if (!actual.isCounted()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Counted\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isNotCounted()
	{
		isNotNull();
		if (actual.isCounted()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Counted\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isDesc()
	{
		isNotNull();
		if (!actual.isDesc()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Desc\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isNotDesc()
	{
		isNotNull();
		if (actual.isDesc()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Desc\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isDeviationCalc()
	{
		isNotNull();
		if (!actual.isDeviationCalc()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DeviationCalc\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isNotDeviationCalc()
	{
		isNotNull();
		if (actual.isDeviationCalc()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DeviationCalc\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isFilledRectangle()
	{
		isNotNull();
		if (!actual.isFilledRectangle()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be FilledRectangle\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isNotFilledRectangle()
	{
		isNotNull();
		if (actual.isFilledRectangle()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be FilledRectangle\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isFixedWidth()
	{
		isNotNull();
		if (!actual.isFixedWidth()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be FixedWidth\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isNotFixedWidth()
	{
		isNotNull();
		if (actual.isFixedWidth()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be FixedWidth\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isGroupBy()
	{
		isNotNull();
		if (!actual.isGroupBy()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be GroupBy\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isNotGroupBy()
	{
		isNotNull();
		if (actual.isGroupBy()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be GroupBy\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isHeightOneLine()
	{
		isNotNull();
		if (!actual.isHeightOneLine()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be HeightOneLine\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isNotHeightOneLine()
	{
		isNotNull();
		if (actual.isHeightOneLine()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be HeightOneLine\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isImageField()
	{
		isNotNull();
		if (!actual.isImageField()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ImageField\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isNotImageField()
	{
		isNotNull();
		if (actual.isImageField()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ImageField\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isMaxCalc()
	{
		isNotNull();
		if (!actual.isMaxCalc()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be MaxCalc\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isNotMaxCalc()
	{
		isNotNull();
		if (actual.isMaxCalc()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be MaxCalc\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isMinCalc()
	{
		isNotNull();
		if (!actual.isMinCalc()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be MinCalc\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isNotMinCalc()
	{
		isNotNull();
		if (actual.isMinCalc()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be MinCalc\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isNextLine()
	{
		isNotNull();
		if (!actual.isNextLine()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be NextLine\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isNotNextLine()
	{
		isNotNull();
		if (actual.isNextLine()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be NextLine\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isNextPage()
	{
		isNotNull();
		if (!actual.isNextPage()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be NextPage\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isNotNextPage()
	{
		isNotNull();
		if (actual.isNextPage()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be NextPage\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isOrderBy()
	{
		isNotNull();
		if (!actual.isOrderBy()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OrderBy\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isNotOrderBy()
	{
		isNotNull();
		if (actual.isOrderBy()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OrderBy\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isPageBreak()
	{
		isNotNull();
		if (!actual.isPageBreak()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PageBreak\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isNotPageBreak()
	{
		isNotNull();
		if (actual.isPageBreak()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PageBreak\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isPrinted()
	{
		isNotNull();
		if (!actual.isPrinted()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Printed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isNotPrinted()
	{
		isNotNull();
		if (actual.isPrinted()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Printed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isRelativePosition()
	{
		isNotNull();
		if (!actual.isRelativePosition()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be RelativePosition\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isNotRelativePosition()
	{
		isNotNull();
		if (actual.isRelativePosition()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be RelativePosition\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isRunningTotal()
	{
		isNotNull();
		if (!actual.isRunningTotal()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be RunningTotal\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isNotRunningTotal()
	{
		isNotNull();
		if (actual.isRunningTotal()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be RunningTotal\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isSetNLPosition()
	{
		isNotNull();
		if (!actual.isSetNLPosition()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SetNLPosition\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isNotSetNLPosition()
	{
		isNotNull();
		if (actual.isSetNLPosition()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SetNLPosition\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isSummarized()
	{
		isNotNull();
		if (!actual.isSummarized()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Summarized\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isNotSummarized()
	{
		isNotNull();
		if (actual.isSummarized()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Summarized\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isSuppressNull()
	{
		isNotNull();
		if (!actual.isSuppressNull()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SuppressNull\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isNotSuppressNull()
	{
		isNotNull();
		if (actual.isSuppressNull()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SuppressNull\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isSuppressRepeats()
	{
		isNotNull();
		if (!actual.isSuppressRepeats()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SuppressRepeats\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isNotSuppressRepeats()
	{
		isNotNull();
		if (actual.isSuppressRepeats()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SuppressRepeats\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isVarianceCalc()
	{
		isNotNull();
		if (!actual.isVarianceCalc()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be VarianceCalc\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert isNotVarianceCalc()
	{
		isNotNull();
		if (actual.isVarianceCalc()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be VarianceCalc\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatItemAssert hasLineAlignmentType(String expected)
	{
		isNotNull();
		String actualField = actual.getLineAlignmentType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have LineAlignmentType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatItemAssert hasLineWidth(int expected)
	{
		isNotNull();
		int actualField = actual.getLineWidth();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have LineWidth: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatItemAssert hasMaxHeight(int expected)
	{
		isNotNull();
		int actualField = actual.getMaxHeight();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have MaxHeight: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatItemAssert hasMaxWidth(int expected)
	{
		isNotNull();
		int actualField = actual.getMaxWidth();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have MaxWidth: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatItemAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatItemAssert hasPrintAreaType(String expected)
	{
		isNotNull();
		String actualField = actual.getPrintAreaType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PrintAreaType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatItemAssert hasPrintFormatType(String expected)
	{
		isNotNull();
		String actualField = actual.getPrintFormatType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PrintFormatType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatItemAssert hasPrintName(String expected)
	{
		isNotNull();
		String actualField = actual.getPrintName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PrintName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatItemAssert hasPrintNameSuffix(String expected)
	{
		isNotNull();
		String actualField = actual.getPrintNameSuffix();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PrintNameSuffix: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatItemAssert hasRunningTotalLines(int expected)
	{
		isNotNull();
		int actualField = actual.getRunningTotalLines();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have RunningTotalLines: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatItemAssert hasSeqNo(int expected)
	{
		isNotNull();
		int actualField = actual.getSeqNo();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SeqNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatItemAssert hasShapeType(String expected)
	{
		isNotNull();
		String actualField = actual.getShapeType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ShapeType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatItemAssert hasSortNo(int expected)
	{
		isNotNull();
		int actualField = actual.getSortNo();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SortNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatItemAssert hasXPosition(int expected)
	{
		isNotNull();
		int actualField = actual.getXPosition();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have XPosition: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatItemAssert hasXSpace(int expected)
	{
		isNotNull();
		int actualField = actual.getXSpace();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have XSpace: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatItemAssert hasYPosition(int expected)
	{
		isNotNull();
		int actualField = actual.getYPosition();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have YPosition: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatItemAssert hasYSpace(int expected)
	{
		isNotNull();
		int actualField = actual.getYSpace();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have YSpace: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}