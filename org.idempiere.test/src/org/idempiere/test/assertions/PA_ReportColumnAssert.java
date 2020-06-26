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
import org.compiere.model.X_PA_ReportColumn;

/** Generated assertion class for PA_ReportColumn
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class PA_ReportColumnAssert
	extends AbstractPOAssert<PA_ReportColumnAssert,X_PA_ReportColumn>
{

    /** Standard Constructor */
    public PA_ReportColumnAssert (X_PA_ReportColumn actual)
    {
      super (actual, PA_ReportColumnAssert.class);
    }


	public PA_ReportColumnAssert hasAD_OrgTrx_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_OrgTrx_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_OrgTrx_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportColumnAssert hasC_Activity_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Activity_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Activity_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportColumnAssert hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportColumnAssert hasC_Campaign_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Campaign_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Campaign_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportColumnAssert hasC_Currency_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Currency_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Currency_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportColumnAssert hasC_ElementValue_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ElementValue_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_ElementValue_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportColumnAssert hasC_Location_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Location_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Location_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportColumnAssert hasC_Project_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Project_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Project_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportColumnAssert hasC_SalesRegion_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_SalesRegion_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_SalesRegion_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportColumnAssert hasCalculationType(String expected)
	{
		isNotNull();
		String actualField = actual.getCalculationType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CalculationType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportColumnAssert hasColumnType(String expected)
	{
		isNotNull();
		String actualField = actual.getColumnType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ColumnType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportColumnAssert hasCurrencyType(String expected)
	{
		isNotNull();
		String actualField = actual.getCurrencyType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CurrencyType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportColumnAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportColumnAssert hasElementType(String expected)
	{
		isNotNull();
		String actualField = actual.getElementType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ElementType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportColumnAssert hasFactor(String expected)
	{
		isNotNull();
		String actualField = actual.getFactor();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Factor: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportColumnAssert hasFormatPattern(String expected)
	{
		isNotNull();
		String actualField = actual.getFormatPattern();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have FormatPattern: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportColumnAssert hasGL_Budget_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getGL_Budget_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have GL_Budget_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportColumnAssert isAdhocConversion()
	{
		isNotNull();
		if (!actual.isAdhocConversion()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AdhocConversion\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportColumnAssert isNotAdhocConversion()
	{
		isNotNull();
		if (actual.isAdhocConversion()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AdhocConversion\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportColumnAssert isIncludeNullsActivity()
	{
		isNotNull();
		if (!actual.isIncludeNullsActivity()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IncludeNullsActivity\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportColumnAssert isNotIncludeNullsActivity()
	{
		isNotNull();
		if (actual.isIncludeNullsActivity()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IncludeNullsActivity\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportColumnAssert isIncludeNullsBPartner()
	{
		isNotNull();
		if (!actual.isIncludeNullsBPartner()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IncludeNullsBPartner\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportColumnAssert isNotIncludeNullsBPartner()
	{
		isNotNull();
		if (actual.isIncludeNullsBPartner()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IncludeNullsBPartner\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportColumnAssert isIncludeNullsCampaign()
	{
		isNotNull();
		if (!actual.isIncludeNullsCampaign()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IncludeNullsCampaign\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportColumnAssert isNotIncludeNullsCampaign()
	{
		isNotNull();
		if (actual.isIncludeNullsCampaign()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IncludeNullsCampaign\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportColumnAssert isIncludeNullsElementValue()
	{
		isNotNull();
		if (!actual.isIncludeNullsElementValue()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IncludeNullsElementValue\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportColumnAssert isNotIncludeNullsElementValue()
	{
		isNotNull();
		if (actual.isIncludeNullsElementValue()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IncludeNullsElementValue\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportColumnAssert isIncludeNullsLocation()
	{
		isNotNull();
		if (!actual.isIncludeNullsLocation()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IncludeNullsLocation\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportColumnAssert isNotIncludeNullsLocation()
	{
		isNotNull();
		if (actual.isIncludeNullsLocation()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IncludeNullsLocation\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportColumnAssert isIncludeNullsOrg()
	{
		isNotNull();
		if (!actual.isIncludeNullsOrg()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IncludeNullsOrg\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportColumnAssert isNotIncludeNullsOrg()
	{
		isNotNull();
		if (actual.isIncludeNullsOrg()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IncludeNullsOrg\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportColumnAssert isIncludeNullsOrgTrx()
	{
		isNotNull();
		if (!actual.isIncludeNullsOrgTrx()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IncludeNullsOrgTrx\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportColumnAssert isNotIncludeNullsOrgTrx()
	{
		isNotNull();
		if (actual.isIncludeNullsOrgTrx()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IncludeNullsOrgTrx\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportColumnAssert isIncludeNullsProduct()
	{
		isNotNull();
		if (!actual.isIncludeNullsProduct()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IncludeNullsProduct\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportColumnAssert isNotIncludeNullsProduct()
	{
		isNotNull();
		if (actual.isIncludeNullsProduct()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IncludeNullsProduct\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportColumnAssert isIncludeNullsProject()
	{
		isNotNull();
		if (!actual.isIncludeNullsProject()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IncludeNullsProject\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportColumnAssert isNotIncludeNullsProject()
	{
		isNotNull();
		if (actual.isIncludeNullsProject()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IncludeNullsProject\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportColumnAssert isIncludeNullsSalesRegion()
	{
		isNotNull();
		if (!actual.isIncludeNullsSalesRegion()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IncludeNullsSalesRegion\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportColumnAssert isNotIncludeNullsSalesRegion()
	{
		isNotNull();
		if (actual.isIncludeNullsSalesRegion()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IncludeNullsSalesRegion\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportColumnAssert isIncludeNullsUserElement1()
	{
		isNotNull();
		if (!actual.isIncludeNullsUserElement1()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IncludeNullsUserElement1\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportColumnAssert isNotIncludeNullsUserElement1()
	{
		isNotNull();
		if (actual.isIncludeNullsUserElement1()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IncludeNullsUserElement1\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportColumnAssert isIncludeNullsUserElement2()
	{
		isNotNull();
		if (!actual.isIncludeNullsUserElement2()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IncludeNullsUserElement2\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportColumnAssert isNotIncludeNullsUserElement2()
	{
		isNotNull();
		if (actual.isIncludeNullsUserElement2()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IncludeNullsUserElement2\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportColumnAssert isPrinted()
	{
		isNotNull();
		if (!actual.isPrinted()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Printed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportColumnAssert isNotPrinted()
	{
		isNotNull();
		if (actual.isPrinted()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Printed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportColumnAssert hasM_Product_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Product_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportColumnAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportColumnAssert hasOper_1_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getOper_1_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Oper_1_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportColumnAssert hasOper_2_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getOper_2_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Oper_2_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportColumnAssert hasOper_2_LineName(String expected)
	{
		isNotNull();
		String actualField = actual.getOper_2_LineName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Oper_2_LineName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportColumnAssert hasOrg_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getOrg_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Org_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportColumnAssert hasPA_ReportColumn_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPA_ReportColumn_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PA_ReportColumn_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportColumnAssert hasPA_ReportColumn_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getPA_ReportColumn_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PA_ReportColumn_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportColumnAssert hasPA_ReportColumnSet_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPA_ReportColumnSet_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PA_ReportColumnSet_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportColumnAssert hasPAAmountType(String expected)
	{
		isNotNull();
		String actualField = actual.getPAAmountType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PAAmountType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportColumnAssert hasPAPeriodType(String expected)
	{
		isNotNull();
		String actualField = actual.getPAPeriodType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PAPeriodType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportColumnAssert hasPostingType(String expected)
	{
		isNotNull();
		String actualField = actual.getPostingType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PostingType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportColumnAssert hasRelativePeriod(Object expected)
	{
		isNotNull();
		bdAssert("RelativePeriod", actual.getRelativePeriod(), expected);
		return myself;
	}


	public PA_ReportColumnAssert hasSeqNo(int expected)
	{
		isNotNull();
		int actualField = actual.getSeqNo();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SeqNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportColumnAssert hasUserElement1_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getUserElement1_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have UserElement1_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportColumnAssert hasUserElement2_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getUserElement2_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have UserElement2_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}