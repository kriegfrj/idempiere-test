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
import org.compiere.model.X_GL_Distribution;

/** Generated assertion class for GL_Distribution
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class GL_DistributionAssert
	extends AbstractPOAssert<GL_DistributionAssert,X_GL_Distribution>
{

    /** Standard Constructor */
    public GL_DistributionAssert (X_GL_Distribution actual)
    {
      super (actual, GL_DistributionAssert.class);
    }


	public GL_DistributionAssert hasAccount_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAccount_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Account_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_DistributionAssert hasAD_OrgTrx_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_OrgTrx_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_OrgTrx_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_DistributionAssert isAnyAcct()
	{
		isNotNull();
		if (!actual.isAnyAcct()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AnyAcct\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionAssert isNotAnyAcct()
	{
		isNotNull();
		if (actual.isAnyAcct()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AnyAcct\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionAssert isAnyActivity()
	{
		isNotNull();
		if (!actual.isAnyActivity()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AnyActivity\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionAssert isNotAnyActivity()
	{
		isNotNull();
		if (actual.isAnyActivity()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AnyActivity\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionAssert isAnyBPartner()
	{
		isNotNull();
		if (!actual.isAnyBPartner()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AnyBPartner\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionAssert isNotAnyBPartner()
	{
		isNotNull();
		if (actual.isAnyBPartner()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AnyBPartner\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionAssert isAnyCampaign()
	{
		isNotNull();
		if (!actual.isAnyCampaign()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AnyCampaign\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionAssert isNotAnyCampaign()
	{
		isNotNull();
		if (actual.isAnyCampaign()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AnyCampaign\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionAssert isAnyLocFrom()
	{
		isNotNull();
		if (!actual.isAnyLocFrom()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AnyLocFrom\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionAssert isNotAnyLocFrom()
	{
		isNotNull();
		if (actual.isAnyLocFrom()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AnyLocFrom\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionAssert isAnyLocTo()
	{
		isNotNull();
		if (!actual.isAnyLocTo()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AnyLocTo\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionAssert isNotAnyLocTo()
	{
		isNotNull();
		if (actual.isAnyLocTo()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AnyLocTo\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionAssert isAnyOrg()
	{
		isNotNull();
		if (!actual.isAnyOrg()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AnyOrg\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionAssert isNotAnyOrg()
	{
		isNotNull();
		if (actual.isAnyOrg()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AnyOrg\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionAssert isAnyOrgTrx()
	{
		isNotNull();
		if (!actual.isAnyOrgTrx()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AnyOrgTrx\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionAssert isNotAnyOrgTrx()
	{
		isNotNull();
		if (actual.isAnyOrgTrx()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AnyOrgTrx\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionAssert isAnyProduct()
	{
		isNotNull();
		if (!actual.isAnyProduct()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AnyProduct\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionAssert isNotAnyProduct()
	{
		isNotNull();
		if (actual.isAnyProduct()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AnyProduct\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionAssert isAnyProject()
	{
		isNotNull();
		if (!actual.isAnyProject()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AnyProject\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionAssert isNotAnyProject()
	{
		isNotNull();
		if (actual.isAnyProject()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AnyProject\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionAssert isAnySalesRegion()
	{
		isNotNull();
		if (!actual.isAnySalesRegion()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AnySalesRegion\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionAssert isNotAnySalesRegion()
	{
		isNotNull();
		if (actual.isAnySalesRegion()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AnySalesRegion\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionAssert isAnyUser1()
	{
		isNotNull();
		if (!actual.isAnyUser1()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AnyUser1\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionAssert isNotAnyUser1()
	{
		isNotNull();
		if (actual.isAnyUser1()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AnyUser1\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionAssert isAnyUser2()
	{
		isNotNull();
		if (!actual.isAnyUser2()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AnyUser2\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionAssert isNotAnyUser2()
	{
		isNotNull();
		if (actual.isAnyUser2()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AnyUser2\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionAssert hasC_AcctSchema_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_AcctSchema_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_AcctSchema_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_DistributionAssert hasC_Activity_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Activity_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Activity_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_DistributionAssert hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_DistributionAssert hasC_Campaign_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Campaign_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Campaign_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_DistributionAssert hasC_DocType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_DocType_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_DocType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_DistributionAssert hasC_LocFrom_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_LocFrom_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_LocFrom_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_DistributionAssert hasC_LocTo_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_LocTo_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_LocTo_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_DistributionAssert hasC_Project_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Project_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Project_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_DistributionAssert hasC_SalesRegion_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_SalesRegion_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_SalesRegion_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_DistributionAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_DistributionAssert hasGL_Distribution_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getGL_Distribution_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have GL_Distribution_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_DistributionAssert hasGL_Distribution_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getGL_Distribution_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have GL_Distribution_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_DistributionAssert hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_DistributionAssert isCreateReversal()
	{
		isNotNull();
		if (!actual.isCreateReversal()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CreateReversal\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionAssert isNotCreateReversal()
	{
		isNotNull();
		if (actual.isCreateReversal()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CreateReversal\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionAssert isValid()
	{
		isNotNull();
		if (!actual.isValid()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Valid\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionAssert isNotValid()
	{
		isNotNull();
		if (actual.isValid()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Valid\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionAssert hasM_Product_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Product_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_DistributionAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_DistributionAssert hasOrg_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getOrg_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Org_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_DistributionAssert hasPercentTotal(Object expected)
	{
		isNotNull();
		bdAssert("PercentTotal", actual.getPercentTotal(), expected);
		return myself;
	}


	public GL_DistributionAssert hasPostingType(String expected)
	{
		isNotNull();
		String actualField = actual.getPostingType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PostingType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_DistributionAssert hasUser1_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getUser1_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have User1_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_DistributionAssert hasUser2_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getUser2_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have User2_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}