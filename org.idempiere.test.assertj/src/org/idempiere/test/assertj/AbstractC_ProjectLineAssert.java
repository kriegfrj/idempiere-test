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
import org.compiere.model.X_C_ProjectLine;

/** Generated assertion class for C_ProjectLine
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractC_ProjectLineAssert<SELF extends AbstractC_ProjectLineAssert<SELF, ACTUAL>, ACTUAL extends X_C_ProjectLine>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractC_ProjectLineAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasC_Order_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Order_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Order_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_OrderPO_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_OrderPO_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_OrderPO_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Project_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Project_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Project_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_ProjectIssue_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ProjectIssue_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_ProjectIssue_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_ProjectLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ProjectLine_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_ProjectLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_ProjectLine_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_ProjectLine_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_ProjectLine_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_ProjectPhase_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ProjectPhase_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_ProjectPhase_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_ProjectTask_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ProjectTask_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_ProjectTask_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasCommittedAmt(Object expected)
	{
		isNotNull();
		bdAssert("CommittedAmt", actual.getCommittedAmt(), expected);
		return myself;
	}


	public SELF hasCommittedQty(Object expected)
	{
		isNotNull();
		bdAssert("CommittedQty", actual.getCommittedQty(), expected);
		return myself;
	}


	public SELF hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasInvoicedAmt(Object expected)
	{
		isNotNull();
		bdAssert("InvoicedAmt", actual.getInvoicedAmt(), expected);
		return myself;
	}


	public SELF hasInvoicedQty(Object expected)
	{
		isNotNull();
		bdAssert("InvoicedQty", actual.getInvoicedQty(), expected);
		return myself;
	}


	public SELF isPrinted()
	{
		isNotNull();
		if (!actual.isPrinted()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Printed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPrinted()
	{
		isNotNull();
		if (actual.isPrinted()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Printed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasLine(int expected)
	{
		isNotNull();
		int actualField = actual.getLine();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Line: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_Product_Category_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_Category_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Product_Category_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_Product_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Product_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_Production_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Production_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Production_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPlannedAmt(Object expected)
	{
		isNotNull();
		bdAssert("PlannedAmt", actual.getPlannedAmt(), expected);
		return myself;
	}


	public SELF hasPlannedMarginAmt(Object expected)
	{
		isNotNull();
		bdAssert("PlannedMarginAmt", actual.getPlannedMarginAmt(), expected);
		return myself;
	}


	public SELF hasPlannedPrice(Object expected)
	{
		isNotNull();
		bdAssert("PlannedPrice", actual.getPlannedPrice(), expected);
		return myself;
	}


	public SELF hasPlannedQty(Object expected)
	{
		isNotNull();
		bdAssert("PlannedQty", actual.getPlannedQty(), expected);
		return myself;
	}


	public SELF isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}
}