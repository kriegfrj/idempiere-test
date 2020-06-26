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
import org.compiere.model.X_C_Tax;

/** Generated assertion class for C_Tax
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_TaxAssert
	extends AbstractPOAssert<C_TaxAssert,X_C_Tax>
{

    /** Standard Constructor */
    public C_TaxAssert (X_C_Tax actual)
    {
      super (actual, C_TaxAssert.class);
    }


	public C_TaxAssert hasAD_Rule_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Rule_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Rule_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_TaxAssert hasC_Country_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Country_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Country_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_TaxAssert hasC_CountryGroupFrom_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_CountryGroupFrom_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_CountryGroupFrom_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_TaxAssert hasC_CountryGroupTo_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_CountryGroupTo_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_CountryGroupTo_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_TaxAssert hasC_Region_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Region_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Region_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_TaxAssert hasC_Tax_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Tax_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Tax_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_TaxAssert hasC_Tax_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_Tax_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Tax_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_TaxAssert hasC_TaxCategory_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_TaxCategory_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_TaxCategory_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_TaxAssert hasC_TaxProvider_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_TaxProvider_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_TaxProvider_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_TaxAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_TaxAssert isDefault()
	{
		isNotNull();
		if (!actual.isDefault()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Default\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_TaxAssert isNotDefault()
	{
		isNotNull();
		if (actual.isDefault()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Default\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_TaxAssert isDocumentLevel()
	{
		isNotNull();
		if (!actual.isDocumentLevel()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DocumentLevel\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_TaxAssert isNotDocumentLevel()
	{
		isNotNull();
		if (actual.isDocumentLevel()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DocumentLevel\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_TaxAssert isSalesTax()
	{
		isNotNull();
		if (!actual.isSalesTax()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SalesTax\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_TaxAssert isNotSalesTax()
	{
		isNotNull();
		if (actual.isSalesTax()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SalesTax\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_TaxAssert isSummary()
	{
		isNotNull();
		if (!actual.isSummary()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Summary\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_TaxAssert isNotSummary()
	{
		isNotNull();
		if (actual.isSummary()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Summary\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_TaxAssert isTaxExempt()
	{
		isNotNull();
		if (!actual.isTaxExempt()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be TaxExempt\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_TaxAssert isNotTaxExempt()
	{
		isNotNull();
		if (actual.isTaxExempt()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be TaxExempt\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_TaxAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_TaxAssert hasParent_Tax_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getParent_Tax_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Parent_Tax_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_TaxAssert hasRate(Object expected)
	{
		isNotNull();
		bdAssert("Rate", actual.getRate(), expected);
		return myself;
	}


	public C_TaxAssert isRequiresTaxCertificate()
	{
		isNotNull();
		if (!actual.isRequiresTaxCertificate()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be RequiresTaxCertificate\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_TaxAssert isNotRequiresTaxCertificate()
	{
		isNotNull();
		if (actual.isRequiresTaxCertificate()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be RequiresTaxCertificate\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_TaxAssert hasSOPOType(String expected)
	{
		isNotNull();
		String actualField = actual.getSOPOType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SOPOType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_TaxAssert hasTaxIndicator(String expected)
	{
		isNotNull();
		String actualField = actual.getTaxIndicator();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have TaxIndicator: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_TaxAssert hasTo_Country_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getTo_Country_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have To_Country_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_TaxAssert hasTo_Region_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getTo_Region_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have To_Region_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_TaxAssert hasValidFrom(Object expected)
	{
		isNotNull();
		dateAssert("ValidFrom", actual.getValidFrom(), expected);
		return myself;
	}

}