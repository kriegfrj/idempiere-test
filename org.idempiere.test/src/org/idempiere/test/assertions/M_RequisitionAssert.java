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
import org.compiere.model.X_M_Requisition;

/** Generated assertion class for M_Requisition
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class M_RequisitionAssert
	extends AbstractPOAssert<M_RequisitionAssert,X_M_Requisition>
{

    /** Standard Constructor */
    public M_RequisitionAssert (X_M_Requisition actual)
    {
      super (actual, M_RequisitionAssert.class);
    }


	public M_RequisitionAssert hasAD_User_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_User_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_User_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_RequisitionAssert hasC_DocType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_DocType_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_DocType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_RequisitionAssert hasDateDoc(Object expected)
	{
		isNotNull();
		dateAssert("DateDoc", actual.getDateDoc(), expected);
		return myself;
	}


	public M_RequisitionAssert hasDateRequired(Object expected)
	{
		isNotNull();
		dateAssert("DateRequired", actual.getDateRequired(), expected);
		return myself;
	}


	public M_RequisitionAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_RequisitionAssert hasDocStatus(String expected)
	{
		isNotNull();
		String actualField = actual.getDocStatus();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DocStatus: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_RequisitionAssert hasDocumentNo(String expected)
	{
		isNotNull();
		String actualField = actual.getDocumentNo();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DocumentNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_RequisitionAssert hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_RequisitionAssert isApproved()
	{
		isNotNull();
		if (!actual.isApproved()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Approved\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_RequisitionAssert isNotApproved()
	{
		isNotNull();
		if (actual.isApproved()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Approved\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_RequisitionAssert hasM_PriceList_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_PriceList_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_PriceList_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_RequisitionAssert hasM_Requisition_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Requisition_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Requisition_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_RequisitionAssert hasM_Requisition_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getM_Requisition_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Requisition_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_RequisitionAssert hasM_Warehouse_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Warehouse_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Warehouse_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_RequisitionAssert hasPriorityRule(String expected)
	{
		isNotNull();
		String actualField = actual.getPriorityRule();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PriorityRule: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_RequisitionAssert isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_RequisitionAssert isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_RequisitionAssert hasProcessedOn(Object expected)
	{
		isNotNull();
		bdAssert("ProcessedOn", actual.getProcessedOn(), expected);
		return myself;
	}


	public M_RequisitionAssert isProcessing()
	{
		isNotNull();
		if (!actual.isProcessing()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processing\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_RequisitionAssert isNotProcessing()
	{
		isNotNull();
		if (actual.isProcessing()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processing\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_RequisitionAssert hasTotalLines(Object expected)
	{
		isNotNull();
		bdAssert("TotalLines", actual.getTotalLines(), expected);
		return myself;
	}

}