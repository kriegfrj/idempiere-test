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
import org.compiere.model.X_AD_Language;

/** Generated assertion class for AD_Language
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_LanguageAssert
	extends AbstractPOAssert<AD_LanguageAssert,X_AD_Language>
{

    /** Standard Constructor */
    public AD_LanguageAssert (X_AD_Language actual)
    {
      super (actual, AD_LanguageAssert.class);
    }


	public AD_LanguageAssert hasAD_Language(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Language();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Language: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_LanguageAssert hasAD_Language_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Language_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Language_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_LanguageAssert hasAD_Language_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Language_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Language_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_LanguageAssert hasAD_PrintPaper_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PrintPaper_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_PrintPaper_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_LanguageAssert hasCountryCode(String expected)
	{
		isNotNull();
		String actualField = actual.getCountryCode();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CountryCode: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_LanguageAssert hasDatePattern(String expected)
	{
		isNotNull();
		String actualField = actual.getDatePattern();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DatePattern: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_LanguageAssert isBaseLanguage()
	{
		isNotNull();
		if (!actual.isBaseLanguage()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be BaseLanguage\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_LanguageAssert isNotBaseLanguage()
	{
		isNotNull();
		if (actual.isBaseLanguage()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be BaseLanguage\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_LanguageAssert isDecimalPoint()
	{
		isNotNull();
		if (!actual.isDecimalPoint()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DecimalPoint\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_LanguageAssert isNotDecimalPoint()
	{
		isNotNull();
		if (actual.isDecimalPoint()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DecimalPoint\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_LanguageAssert isLoginLocale()
	{
		isNotNull();
		if (!actual.isLoginLocale()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be LoginLocale\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_LanguageAssert isNotLoginLocale()
	{
		isNotNull();
		if (actual.isLoginLocale()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be LoginLocale\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_LanguageAssert isSystemLanguage()
	{
		isNotNull();
		if (!actual.isSystemLanguage()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SystemLanguage\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_LanguageAssert isNotSystemLanguage()
	{
		isNotNull();
		if (actual.isSystemLanguage()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SystemLanguage\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_LanguageAssert hasLanguageISO(String expected)
	{
		isNotNull();
		String actualField = actual.getLanguageISO();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have LanguageISO: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_LanguageAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_LanguageAssert hasPrintName(String expected)
	{
		isNotNull();
		String actualField = actual.getPrintName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PrintName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_LanguageAssert hasTimePattern(String expected)
	{
		isNotNull();
		String actualField = actual.getTimePattern();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have TimePattern: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}