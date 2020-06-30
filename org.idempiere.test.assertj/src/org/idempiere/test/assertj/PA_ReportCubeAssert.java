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
import org.compiere.model.X_PA_ReportCube;

/** Generated assertion class for PA_ReportCube
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class PA_ReportCubeAssert
	extends AbstractPOAssert<PA_ReportCubeAssert,X_PA_ReportCube>
{

    /** Standard Constructor */
    public PA_ReportCubeAssert (X_PA_ReportCube actual)
    {
      super (actual, PA_ReportCubeAssert.class);
    }


	public PA_ReportCubeAssert hasC_Calendar_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Calendar_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Calendar_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportCubeAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportCubeAssert isActivityDim()
	{
		isNotNull();
		if (!actual.isActivityDim()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ActivityDim\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportCubeAssert isNotActivityDim()
	{
		isNotNull();
		if (actual.isActivityDim()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ActivityDim\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportCubeAssert isBPartnerDim()
	{
		isNotNull();
		if (!actual.isBPartnerDim()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be BPartnerDim\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportCubeAssert isNotBPartnerDim()
	{
		isNotNull();
		if (actual.isBPartnerDim()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be BPartnerDim\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportCubeAssert isCampaignDim()
	{
		isNotNull();
		if (!actual.isCampaignDim()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CampaignDim\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportCubeAssert isNotCampaignDim()
	{
		isNotNull();
		if (actual.isCampaignDim()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CampaignDim\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportCubeAssert isGLBudgetDim()
	{
		isNotNull();
		if (!actual.isGLBudgetDim()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be GLBudgetDim\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportCubeAssert isNotGLBudgetDim()
	{
		isNotNull();
		if (actual.isGLBudgetDim()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be GLBudgetDim\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportCubeAssert isLocFromDim()
	{
		isNotNull();
		if (!actual.isLocFromDim()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be LocFromDim\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportCubeAssert isNotLocFromDim()
	{
		isNotNull();
		if (actual.isLocFromDim()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be LocFromDim\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportCubeAssert isLocToDim()
	{
		isNotNull();
		if (!actual.isLocToDim()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be LocToDim\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportCubeAssert isNotLocToDim()
	{
		isNotNull();
		if (actual.isLocToDim()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be LocToDim\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportCubeAssert isOrgTrxDim()
	{
		isNotNull();
		if (!actual.isOrgTrxDim()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OrgTrxDim\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportCubeAssert isNotOrgTrxDim()
	{
		isNotNull();
		if (actual.isOrgTrxDim()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OrgTrxDim\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportCubeAssert isProductDim()
	{
		isNotNull();
		if (!actual.isProductDim()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ProductDim\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportCubeAssert isNotProductDim()
	{
		isNotNull();
		if (actual.isProductDim()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ProductDim\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportCubeAssert isProjectDim()
	{
		isNotNull();
		if (!actual.isProjectDim()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ProjectDim\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportCubeAssert isNotProjectDim()
	{
		isNotNull();
		if (actual.isProjectDim()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ProjectDim\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportCubeAssert isProjectPhaseDim()
	{
		isNotNull();
		if (!actual.isProjectPhaseDim()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ProjectPhaseDim\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportCubeAssert isNotProjectPhaseDim()
	{
		isNotNull();
		if (actual.isProjectPhaseDim()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ProjectPhaseDim\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportCubeAssert isProjectTaskDim()
	{
		isNotNull();
		if (!actual.isProjectTaskDim()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ProjectTaskDim\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportCubeAssert isNotProjectTaskDim()
	{
		isNotNull();
		if (actual.isProjectTaskDim()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ProjectTaskDim\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportCubeAssert isSalesRegionDim()
	{
		isNotNull();
		if (!actual.isSalesRegionDim()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SalesRegionDim\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportCubeAssert isNotSalesRegionDim()
	{
		isNotNull();
		if (actual.isSalesRegionDim()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SalesRegionDim\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportCubeAssert isSubAcctDim()
	{
		isNotNull();
		if (!actual.isSubAcctDim()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SubAcctDim\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportCubeAssert isNotSubAcctDim()
	{
		isNotNull();
		if (actual.isSubAcctDim()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SubAcctDim\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportCubeAssert isUser1Dim()
	{
		isNotNull();
		if (!actual.isUser1Dim()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be User1Dim\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportCubeAssert isNotUser1Dim()
	{
		isNotNull();
		if (actual.isUser1Dim()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be User1Dim\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportCubeAssert isUser2Dim()
	{
		isNotNull();
		if (!actual.isUser2Dim()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be User2Dim\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportCubeAssert isNotUser2Dim()
	{
		isNotNull();
		if (actual.isUser2Dim()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be User2Dim\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportCubeAssert isUserElement1Dim()
	{
		isNotNull();
		if (!actual.isUserElement1Dim()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be UserElement1Dim\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportCubeAssert isNotUserElement1Dim()
	{
		isNotNull();
		if (actual.isUserElement1Dim()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be UserElement1Dim\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportCubeAssert isUserElement2Dim()
	{
		isNotNull();
		if (!actual.isUserElement2Dim()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be UserElement2Dim\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportCubeAssert isNotUserElement2Dim()
	{
		isNotNull();
		if (actual.isUserElement2Dim()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be UserElement2Dim\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportCubeAssert hasLastRecalculated(Object expected)
	{
		isNotNull();
		dateAssert("LastRecalculated", actual.getLastRecalculated(), expected);
		return myself;
	}


	public PA_ReportCubeAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportCubeAssert hasPA_ReportCube_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPA_ReportCube_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PA_ReportCube_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportCubeAssert hasPA_ReportCube_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getPA_ReportCube_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PA_ReportCube_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportCubeAssert isProcessing()
	{
		isNotNull();
		if (!actual.isProcessing()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processing\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportCubeAssert isNotProcessing()
	{
		isNotNull();
		if (actual.isProcessing()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processing\nbut it was",
				getPODescription());
		}
		return myself;
	}
}