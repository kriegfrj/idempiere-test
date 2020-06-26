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
import org.compiere.model.X_AD_Workflow;

/** Generated assertion class for AD_Workflow
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_WorkflowAssert
	extends AbstractPOAssert<AD_WorkflowAssert,X_AD_Workflow>
{

    /** Standard Constructor */
    public AD_WorkflowAssert (X_AD_Workflow actual)
    {
      super (actual, AD_WorkflowAssert.class);
    }


	public AD_WorkflowAssert hasAccessLevel(String expected)
	{
		isNotNull();
		String actualField = actual.getAccessLevel();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AccessLevel: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WorkflowAssert hasAD_CtxHelp_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_CtxHelp_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_CtxHelp_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WorkflowAssert hasAD_Table_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Table_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Table_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WorkflowAssert hasAD_WF_Node_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_WF_Node_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_WF_Node_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WorkflowAssert hasAD_WF_Responsible_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_WF_Responsible_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_WF_Responsible_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WorkflowAssert hasAD_Workflow_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Workflow_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Workflow_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WorkflowAssert hasAD_Workflow_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Workflow_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Workflow_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WorkflowAssert hasAD_WorkflowProcessor_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_WorkflowProcessor_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_WorkflowProcessor_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WorkflowAssert hasAuthor(String expected)
	{
		isNotNull();
		String actualField = actual.getAuthor();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Author: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WorkflowAssert hasCost(Object expected)
	{
		isNotNull();
		bdAssert("Cost", actual.getCost(), expected);
		return myself;
	}


	public AD_WorkflowAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WorkflowAssert hasDocumentNo(String expected)
	{
		isNotNull();
		String actualField = actual.getDocumentNo();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DocumentNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WorkflowAssert hasDocValueLogic(String expected)
	{
		isNotNull();
		String actualField = actual.getDocValueLogic();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DocValueLogic: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WorkflowAssert hasDuration(int expected)
	{
		isNotNull();
		int actualField = actual.getDuration();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Duration: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WorkflowAssert hasDurationUnit(String expected)
	{
		isNotNull();
		String actualField = actual.getDurationUnit();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DurationUnit: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WorkflowAssert hasEntityType(String expected)
	{
		isNotNull();
		String actualField = actual.getEntityType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have EntityType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WorkflowAssert isBetaFunctionality()
	{
		isNotNull();
		if (!actual.isBetaFunctionality()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be BetaFunctionality\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_WorkflowAssert isNotBetaFunctionality()
	{
		isNotNull();
		if (actual.isBetaFunctionality()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be BetaFunctionality\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_WorkflowAssert isDefault()
	{
		isNotNull();
		if (!actual.isDefault()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Default\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_WorkflowAssert isNotDefault()
	{
		isNotNull();
		if (actual.isDefault()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Default\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_WorkflowAssert isValid()
	{
		isNotNull();
		if (!actual.isValid()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Valid\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_WorkflowAssert isNotValid()
	{
		isNotNull();
		if (actual.isValid()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Valid\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_WorkflowAssert hasLimit(int expected)
	{
		isNotNull();
		int actualField = actual.getLimit();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Limit: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WorkflowAssert hasMovingTime(int expected)
	{
		isNotNull();
		int actualField = actual.getMovingTime();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have MovingTime: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WorkflowAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WorkflowAssert hasOverlapUnits(Object expected)
	{
		isNotNull();
		bdAssert("OverlapUnits", actual.getOverlapUnits(), expected);
		return myself;
	}


	public AD_WorkflowAssert hasPriority(int expected)
	{
		isNotNull();
		int actualField = actual.getPriority();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Priority: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WorkflowAssert hasProcessType(String expected)
	{
		isNotNull();
		String actualField = actual.getProcessType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ProcessType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WorkflowAssert hasPublishStatus(String expected)
	{
		isNotNull();
		String actualField = actual.getPublishStatus();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PublishStatus: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WorkflowAssert hasQtyBatchSize(Object expected)
	{
		isNotNull();
		bdAssert("QtyBatchSize", actual.getQtyBatchSize(), expected);
		return myself;
	}


	public AD_WorkflowAssert hasQueuingTime(int expected)
	{
		isNotNull();
		int actualField = actual.getQueuingTime();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have QueuingTime: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WorkflowAssert hasS_Resource_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getS_Resource_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have S_Resource_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WorkflowAssert hasSetupTime(int expected)
	{
		isNotNull();
		int actualField = actual.getSetupTime();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SetupTime: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WorkflowAssert hasUnitsCycles(Object expected)
	{
		isNotNull();
		bdAssert("UnitsCycles", actual.getUnitsCycles(), expected);
		return myself;
	}


	public AD_WorkflowAssert hasValidFrom(Object expected)
	{
		isNotNull();
		dateAssert("ValidFrom", actual.getValidFrom(), expected);
		return myself;
	}


	public AD_WorkflowAssert hasValidTo(Object expected)
	{
		isNotNull();
		dateAssert("ValidTo", actual.getValidTo(), expected);
		return myself;
	}


	public AD_WorkflowAssert hasValue(String expected)
	{
		isNotNull();
		String actualField = actual.getValue();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Value: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WorkflowAssert hasVersion(int expected)
	{
		isNotNull();
		int actualField = actual.getVersion();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Version: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WorkflowAssert hasWaitingTime(int expected)
	{
		isNotNull();
		int actualField = actual.getWaitingTime();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have WaitingTime: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WorkflowAssert hasWorkflowType(String expected)
	{
		isNotNull();
		String actualField = actual.getWorkflowType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have WorkflowType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WorkflowAssert hasWorkingTime(int expected)
	{
		isNotNull();
		int actualField = actual.getWorkingTime();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have WorkingTime: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WorkflowAssert hasYield(int expected)
	{
		isNotNull();
		int actualField = actual.getYield();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Yield: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}