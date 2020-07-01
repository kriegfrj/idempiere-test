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
import org.compiere.model.X_GL_DistributionLine;

/** Generated assertion class for GL_DistributionLine
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class GL_DistributionLineAssert
	extends AbstractPOAssert<GL_DistributionLineAssert,X_GL_DistributionLine>
{

    /** Standard Constructor */
    public GL_DistributionLineAssert (X_GL_DistributionLine actual)
    {
      super (actual, GL_DistributionLineAssert.class);
    }


	public GL_DistributionLineAssert hasAccount_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAccount_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Account_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_DistributionLineAssert hasAD_OrgTrx_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_OrgTrx_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_OrgTrx_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_DistributionLineAssert hasC_Activity_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Activity_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Activity_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_DistributionLineAssert hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_DistributionLineAssert hasC_Campaign_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Campaign_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Campaign_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_DistributionLineAssert hasC_LocFrom_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_LocFrom_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_LocFrom_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_DistributionLineAssert hasC_LocTo_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_LocTo_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_LocTo_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_DistributionLineAssert hasC_Project_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Project_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Project_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_DistributionLineAssert hasC_SalesRegion_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_SalesRegion_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_SalesRegion_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_DistributionLineAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_DistributionLineAssert hasGL_Distribution_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getGL_Distribution_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have GL_Distribution_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_DistributionLineAssert hasGL_DistributionLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getGL_DistributionLine_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have GL_DistributionLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_DistributionLineAssert hasGL_DistributionLine_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getGL_DistributionLine_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have GL_DistributionLine_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_DistributionLineAssert hasLine(int expected)
	{
		isNotNull();
		int actualField = actual.getLine();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Line: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_DistributionLineAssert hasM_Product_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Product_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_DistributionLineAssert hasOrg_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getOrg_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Org_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_DistributionLineAssert isOverwriteAcct()
	{
		isNotNull();
		if (!actual.isOverwriteAcct()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OverwriteAcct\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionLineAssert isNotOverwriteAcct()
	{
		isNotNull();
		if (actual.isOverwriteAcct()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OverwriteAcct\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionLineAssert isOverwriteActivity()
	{
		isNotNull();
		if (!actual.isOverwriteActivity()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OverwriteActivity\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionLineAssert isNotOverwriteActivity()
	{
		isNotNull();
		if (actual.isOverwriteActivity()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OverwriteActivity\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionLineAssert isOverwriteBPartner()
	{
		isNotNull();
		if (!actual.isOverwriteBPartner()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OverwriteBPartner\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionLineAssert isNotOverwriteBPartner()
	{
		isNotNull();
		if (actual.isOverwriteBPartner()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OverwriteBPartner\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionLineAssert isOverwriteCampaign()
	{
		isNotNull();
		if (!actual.isOverwriteCampaign()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OverwriteCampaign\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionLineAssert isNotOverwriteCampaign()
	{
		isNotNull();
		if (actual.isOverwriteCampaign()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OverwriteCampaign\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionLineAssert isOverwriteLocFrom()
	{
		isNotNull();
		if (!actual.isOverwriteLocFrom()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OverwriteLocFrom\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionLineAssert isNotOverwriteLocFrom()
	{
		isNotNull();
		if (actual.isOverwriteLocFrom()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OverwriteLocFrom\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionLineAssert isOverwriteLocTo()
	{
		isNotNull();
		if (!actual.isOverwriteLocTo()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OverwriteLocTo\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionLineAssert isNotOverwriteLocTo()
	{
		isNotNull();
		if (actual.isOverwriteLocTo()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OverwriteLocTo\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionLineAssert isOverwriteOrg()
	{
		isNotNull();
		if (!actual.isOverwriteOrg()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OverwriteOrg\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionLineAssert isNotOverwriteOrg()
	{
		isNotNull();
		if (actual.isOverwriteOrg()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OverwriteOrg\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionLineAssert isOverwriteOrgTrx()
	{
		isNotNull();
		if (!actual.isOverwriteOrgTrx()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OverwriteOrgTrx\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionLineAssert isNotOverwriteOrgTrx()
	{
		isNotNull();
		if (actual.isOverwriteOrgTrx()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OverwriteOrgTrx\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionLineAssert isOverwriteProduct()
	{
		isNotNull();
		if (!actual.isOverwriteProduct()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OverwriteProduct\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionLineAssert isNotOverwriteProduct()
	{
		isNotNull();
		if (actual.isOverwriteProduct()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OverwriteProduct\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionLineAssert isOverwriteProject()
	{
		isNotNull();
		if (!actual.isOverwriteProject()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OverwriteProject\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionLineAssert isNotOverwriteProject()
	{
		isNotNull();
		if (actual.isOverwriteProject()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OverwriteProject\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionLineAssert isOverwriteSalesRegion()
	{
		isNotNull();
		if (!actual.isOverwriteSalesRegion()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OverwriteSalesRegion\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionLineAssert isNotOverwriteSalesRegion()
	{
		isNotNull();
		if (actual.isOverwriteSalesRegion()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OverwriteSalesRegion\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionLineAssert isOverwriteUser1()
	{
		isNotNull();
		if (!actual.isOverwriteUser1()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OverwriteUser1\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionLineAssert isNotOverwriteUser1()
	{
		isNotNull();
		if (actual.isOverwriteUser1()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OverwriteUser1\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionLineAssert isOverwriteUser2()
	{
		isNotNull();
		if (!actual.isOverwriteUser2()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OverwriteUser2\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionLineAssert isNotOverwriteUser2()
	{
		isNotNull();
		if (actual.isOverwriteUser2()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OverwriteUser2\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public GL_DistributionLineAssert hasPercent(Object expected)
	{
		isNotNull();
		bdAssert("Percent", actual.getPercent(), expected);
		return myself;
	}


	public GL_DistributionLineAssert hasUser1_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getUser1_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have User1_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_DistributionLineAssert hasUser2_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getUser2_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have User2_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}