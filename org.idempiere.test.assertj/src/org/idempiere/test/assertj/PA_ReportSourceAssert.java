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
import org.compiere.model.X_PA_ReportSource;

/** Generated assertion class for PA_ReportSource
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class PA_ReportSourceAssert
	extends AbstractPOAssert<PA_ReportSourceAssert,X_PA_ReportSource>
{

    /** Standard Constructor */
    public PA_ReportSourceAssert (X_PA_ReportSource actual)
    {
      super (actual, PA_ReportSourceAssert.class);
    }


	public PA_ReportSourceAssert hasAD_OrgTrx_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_OrgTrx_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_OrgTrx_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportSourceAssert hasC_Activity_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Activity_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Activity_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportSourceAssert hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportSourceAssert hasC_Campaign_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Campaign_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Campaign_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportSourceAssert hasC_ElementValue_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ElementValue_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_ElementValue_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportSourceAssert hasC_Location_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Location_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Location_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportSourceAssert hasC_Project_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Project_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Project_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportSourceAssert hasC_SalesRegion_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_SalesRegion_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_SalesRegion_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportSourceAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportSourceAssert hasElementType(String expected)
	{
		isNotNull();
		String actualField = actual.getElementType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ElementType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportSourceAssert isIncludeNullsActivity()
	{
		isNotNull();
		if (!actual.isIncludeNullsActivity()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IncludeNullsActivity\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportSourceAssert isNotIncludeNullsActivity()
	{
		isNotNull();
		if (actual.isIncludeNullsActivity()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IncludeNullsActivity\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportSourceAssert isIncludeNullsBPartner()
	{
		isNotNull();
		if (!actual.isIncludeNullsBPartner()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IncludeNullsBPartner\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportSourceAssert isNotIncludeNullsBPartner()
	{
		isNotNull();
		if (actual.isIncludeNullsBPartner()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IncludeNullsBPartner\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportSourceAssert isIncludeNullsCampaign()
	{
		isNotNull();
		if (!actual.isIncludeNullsCampaign()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IncludeNullsCampaign\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportSourceAssert isNotIncludeNullsCampaign()
	{
		isNotNull();
		if (actual.isIncludeNullsCampaign()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IncludeNullsCampaign\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportSourceAssert isIncludeNullsElementValue()
	{
		isNotNull();
		if (!actual.isIncludeNullsElementValue()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IncludeNullsElementValue\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportSourceAssert isNotIncludeNullsElementValue()
	{
		isNotNull();
		if (actual.isIncludeNullsElementValue()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IncludeNullsElementValue\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportSourceAssert isIncludeNullsLocation()
	{
		isNotNull();
		if (!actual.isIncludeNullsLocation()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IncludeNullsLocation\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportSourceAssert isNotIncludeNullsLocation()
	{
		isNotNull();
		if (actual.isIncludeNullsLocation()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IncludeNullsLocation\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportSourceAssert isIncludeNullsOrg()
	{
		isNotNull();
		if (!actual.isIncludeNullsOrg()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IncludeNullsOrg\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportSourceAssert isNotIncludeNullsOrg()
	{
		isNotNull();
		if (actual.isIncludeNullsOrg()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IncludeNullsOrg\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportSourceAssert isIncludeNullsOrgTrx()
	{
		isNotNull();
		if (!actual.isIncludeNullsOrgTrx()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IncludeNullsOrgTrx\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportSourceAssert isNotIncludeNullsOrgTrx()
	{
		isNotNull();
		if (actual.isIncludeNullsOrgTrx()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IncludeNullsOrgTrx\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportSourceAssert isIncludeNullsProduct()
	{
		isNotNull();
		if (!actual.isIncludeNullsProduct()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IncludeNullsProduct\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportSourceAssert isNotIncludeNullsProduct()
	{
		isNotNull();
		if (actual.isIncludeNullsProduct()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IncludeNullsProduct\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportSourceAssert isIncludeNullsProject()
	{
		isNotNull();
		if (!actual.isIncludeNullsProject()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IncludeNullsProject\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportSourceAssert isNotIncludeNullsProject()
	{
		isNotNull();
		if (actual.isIncludeNullsProject()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IncludeNullsProject\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportSourceAssert isIncludeNullsSalesRegion()
	{
		isNotNull();
		if (!actual.isIncludeNullsSalesRegion()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IncludeNullsSalesRegion\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportSourceAssert isNotIncludeNullsSalesRegion()
	{
		isNotNull();
		if (actual.isIncludeNullsSalesRegion()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IncludeNullsSalesRegion\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportSourceAssert isIncludeNullsUserElement1()
	{
		isNotNull();
		if (!actual.isIncludeNullsUserElement1()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IncludeNullsUserElement1\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportSourceAssert isNotIncludeNullsUserElement1()
	{
		isNotNull();
		if (actual.isIncludeNullsUserElement1()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IncludeNullsUserElement1\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportSourceAssert isIncludeNullsUserElement2()
	{
		isNotNull();
		if (!actual.isIncludeNullsUserElement2()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IncludeNullsUserElement2\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportSourceAssert isNotIncludeNullsUserElement2()
	{
		isNotNull();
		if (actual.isIncludeNullsUserElement2()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IncludeNullsUserElement2\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportSourceAssert hasM_Product_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Product_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportSourceAssert hasOrg_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getOrg_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Org_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportSourceAssert hasPA_ReportLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPA_ReportLine_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PA_ReportLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportSourceAssert hasPA_ReportSource_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPA_ReportSource_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PA_ReportSource_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportSourceAssert hasPA_ReportSource_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getPA_ReportSource_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PA_ReportSource_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportSourceAssert hasUserElement1_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getUserElement1_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have UserElement1_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportSourceAssert hasUserElement2_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getUserElement2_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have UserElement2_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}