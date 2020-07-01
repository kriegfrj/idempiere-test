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
import org.compiere.model.X_AD_PrintFormat;

/** Generated assertion class for AD_PrintFormat
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_PrintFormatAssert
	extends AbstractPOAssert<AD_PrintFormatAssert,X_AD_PrintFormat>
{

    /** Standard Constructor */
    public AD_PrintFormatAssert (X_AD_PrintFormat actual)
    {
      super (actual, AD_PrintFormatAssert.class);
    }


	public AD_PrintFormatAssert hasAD_PrintColor_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PrintColor_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_PrintColor_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatAssert hasAD_PrintFont_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PrintFont_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_PrintFont_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatAssert hasAD_PrintFormat_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PrintFormat_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_PrintFormat_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatAssert hasAD_PrintFormat_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_PrintFormat_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_PrintFormat_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatAssert hasAD_PrintPaper_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PrintPaper_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_PrintPaper_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatAssert hasAD_PrintTableFormat_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PrintTableFormat_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_PrintTableFormat_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatAssert hasAD_ReportView_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_ReportView_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_ReportView_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatAssert hasAD_Table_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Table_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Table_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatAssert hasAD_Window_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Window_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Window_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatAssert hasArgs(String expected)
	{
		isNotNull();
		String actualField = actual.getArgs();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Args: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatAssert hasClassname(String expected)
	{
		isNotNull();
		String actualField = actual.getClassname();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Classname: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatAssert hasFooterMargin(int expected)
	{
		isNotNull();
		int actualField = actual.getFooterMargin();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have FooterMargin: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatAssert hasHeaderMargin(int expected)
	{
		isNotNull();
		int actualField = actual.getHeaderMargin();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have HeaderMargin: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatAssert isDefault()
	{
		isNotNull();
		if (!actual.isDefault()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Default\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatAssert isNotDefault()
	{
		isNotNull();
		if (actual.isDefault()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Default\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatAssert isForm()
	{
		isNotNull();
		if (!actual.isForm()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Form\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatAssert isNotForm()
	{
		isNotNull();
		if (actual.isForm()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Form\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatAssert isStandardHeaderFooter()
	{
		isNotNull();
		if (!actual.isStandardHeaderFooter()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be StandardHeaderFooter\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatAssert isNotStandardHeaderFooter()
	{
		isNotNull();
		if (actual.isStandardHeaderFooter()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be StandardHeaderFooter\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatAssert isTableBased()
	{
		isNotNull();
		if (!actual.isTableBased()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be TableBased\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatAssert isNotTableBased()
	{
		isNotNull();
		if (actual.isTableBased()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be TableBased\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PrintFormatAssert hasJasperProcess_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getJasperProcess_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have JasperProcess_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PrintFormatAssert hasPrinterName(String expected)
	{
		isNotNull();
		String actualField = actual.getPrinterName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PrinterName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}