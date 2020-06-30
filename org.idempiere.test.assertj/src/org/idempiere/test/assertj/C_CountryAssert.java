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
import org.compiere.model.X_C_Country;

/** Generated assertion class for C_Country
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_CountryAssert
	extends AbstractPOAssert<C_CountryAssert,X_C_Country>
{

    /** Standard Constructor */
    public C_CountryAssert (X_C_Country actual)
    {
      super (actual, C_CountryAssert.class);
    }


	public C_CountryAssert hasAD_Language(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Language();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Language: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CountryAssert isAllowCitiesOutOfList()
	{
		isNotNull();
		if (!actual.isAllowCitiesOutOfList()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AllowCitiesOutOfList\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_CountryAssert isNotAllowCitiesOutOfList()
	{
		isNotNull();
		if (actual.isAllowCitiesOutOfList()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AllowCitiesOutOfList\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_CountryAssert hasC_Country_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Country_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Country_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CountryAssert hasC_Country_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_Country_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Country_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CountryAssert hasC_Currency_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Currency_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Currency_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CountryAssert hasCaptureSequence(String expected)
	{
		isNotNull();
		String actualField = actual.getCaptureSequence();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CaptureSequence: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CountryAssert hasCountryCode(String expected)
	{
		isNotNull();
		String actualField = actual.getCountryCode();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CountryCode: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CountryAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CountryAssert hasDisplaySequence(String expected)
	{
		isNotNull();
		String actualField = actual.getDisplaySequence();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DisplaySequence: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CountryAssert hasDisplaySequenceLocal(String expected)
	{
		isNotNull();
		String actualField = actual.getDisplaySequenceLocal();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DisplaySequenceLocal: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CountryAssert hasExpressionBankAccountNo(String expected)
	{
		isNotNull();
		String actualField = actual.getExpressionBankAccountNo();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ExpressionBankAccountNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CountryAssert hasExpressionBankRoutingNo(String expected)
	{
		isNotNull();
		String actualField = actual.getExpressionBankRoutingNo();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ExpressionBankRoutingNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CountryAssert hasExpressionPhone(String expected)
	{
		isNotNull();
		String actualField = actual.getExpressionPhone();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ExpressionPhone: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CountryAssert hasExpressionPostal(String expected)
	{
		isNotNull();
		String actualField = actual.getExpressionPostal();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ExpressionPostal: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CountryAssert hasExpressionPostal_Add(String expected)
	{
		isNotNull();
		String actualField = actual.getExpressionPostal_Add();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ExpressionPostal_Add: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CountryAssert isHasPostal_Add()
	{
		isNotNull();
		if (!actual.isHasPostal_Add()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be HasPostal_Add\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_CountryAssert isNotHasPostal_Add()
	{
		isNotNull();
		if (actual.isHasPostal_Add()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be HasPostal_Add\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_CountryAssert isHasRegion()
	{
		isNotNull();
		if (!actual.isHasRegion()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be HasRegion\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_CountryAssert isNotHasRegion()
	{
		isNotNull();
		if (actual.isHasRegion()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be HasRegion\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_CountryAssert isAddressLinesLocalReverse()
	{
		isNotNull();
		if (!actual.isAddressLinesLocalReverse()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AddressLinesLocalReverse\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_CountryAssert isNotAddressLinesLocalReverse()
	{
		isNotNull();
		if (actual.isAddressLinesLocalReverse()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AddressLinesLocalReverse\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_CountryAssert isAddressLinesReverse()
	{
		isNotNull();
		if (!actual.isAddressLinesReverse()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AddressLinesReverse\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_CountryAssert isNotAddressLinesReverse()
	{
		isNotNull();
		if (actual.isAddressLinesReverse()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AddressLinesReverse\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_CountryAssert isPostcodeLookup()
	{
		isNotNull();
		if (!actual.isPostcodeLookup()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PostcodeLookup\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_CountryAssert isNotPostcodeLookup()
	{
		isNotNull();
		if (actual.isPostcodeLookup()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PostcodeLookup\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_CountryAssert hasLookupClassName(String expected)
	{
		isNotNull();
		String actualField = actual.getLookupClassName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have LookupClassName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CountryAssert hasLookupClientID(String expected)
	{
		isNotNull();
		String actualField = actual.getLookupClientID();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have LookupClientID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CountryAssert hasLookupPassword(String expected)
	{
		isNotNull();
		String actualField = actual.getLookupPassword();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have LookupPassword: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CountryAssert hasLookupUrl(String expected)
	{
		isNotNull();
		String actualField = actual.getLookupUrl();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have LookupUrl: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CountryAssert hasMediaSize(String expected)
	{
		isNotNull();
		String actualField = actual.getMediaSize();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have MediaSize: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CountryAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CountryAssert hasPlaceholderAddress1(String expected)
	{
		isNotNull();
		String actualField = actual.getPlaceholderAddress1();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PlaceholderAddress1: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CountryAssert hasPlaceholderAddress2(String expected)
	{
		isNotNull();
		String actualField = actual.getPlaceholderAddress2();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PlaceholderAddress2: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CountryAssert hasPlaceholderAddress3(String expected)
	{
		isNotNull();
		String actualField = actual.getPlaceholderAddress3();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PlaceholderAddress3: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CountryAssert hasPlaceholderAddress4(String expected)
	{
		isNotNull();
		String actualField = actual.getPlaceholderAddress4();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PlaceholderAddress4: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CountryAssert hasPlaceholderAddress5(String expected)
	{
		isNotNull();
		String actualField = actual.getPlaceholderAddress5();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PlaceholderAddress5: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CountryAssert hasPlaceholderCity(String expected)
	{
		isNotNull();
		String actualField = actual.getPlaceholderCity();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PlaceholderCity: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CountryAssert hasPlaceholderComments(String expected)
	{
		isNotNull();
		String actualField = actual.getPlaceholderComments();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PlaceholderComments: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CountryAssert hasPlaceholderPostal(String expected)
	{
		isNotNull();
		String actualField = actual.getPlaceholderPostal();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PlaceholderPostal: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CountryAssert hasPlaceholderPostal_Add(String expected)
	{
		isNotNull();
		String actualField = actual.getPlaceholderPostal_Add();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PlaceholderPostal_Add: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_CountryAssert hasRegionName(String expected)
	{
		isNotNull();
		String actualField = actual.getRegionName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have RegionName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}