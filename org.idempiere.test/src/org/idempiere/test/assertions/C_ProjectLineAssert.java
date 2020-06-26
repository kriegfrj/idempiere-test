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
import org.compiere.model.X_C_ProjectLine;

/** Generated assertion class for C_ProjectLine
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_ProjectLineAssert
	extends AbstractPOAssert<C_ProjectLineAssert,X_C_ProjectLine>
{

    /** Standard Constructor */
    public C_ProjectLineAssert (X_C_ProjectLine actual)
    {
      super (actual, C_ProjectLineAssert.class);
    }


	public C_ProjectLineAssert hasC_Order_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Order_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Order_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_ProjectLineAssert hasC_OrderPO_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_OrderPO_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_OrderPO_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_ProjectLineAssert hasC_Project_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Project_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Project_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_ProjectLineAssert hasC_ProjectIssue_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ProjectIssue_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_ProjectIssue_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_ProjectLineAssert hasC_ProjectLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ProjectLine_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_ProjectLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_ProjectLineAssert hasC_ProjectLine_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_ProjectLine_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_ProjectLine_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_ProjectLineAssert hasC_ProjectPhase_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ProjectPhase_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_ProjectPhase_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_ProjectLineAssert hasC_ProjectTask_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ProjectTask_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_ProjectTask_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_ProjectLineAssert hasCommittedAmt(Object expected)
	{
		isNotNull();
		bdAssert("CommittedAmt", actual.getCommittedAmt(), expected);
		return myself;
	}


	public C_ProjectLineAssert hasCommittedQty(Object expected)
	{
		isNotNull();
		bdAssert("CommittedQty", actual.getCommittedQty(), expected);
		return myself;
	}


	public C_ProjectLineAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_ProjectLineAssert hasInvoicedAmt(Object expected)
	{
		isNotNull();
		bdAssert("InvoicedAmt", actual.getInvoicedAmt(), expected);
		return myself;
	}


	public C_ProjectLineAssert hasInvoicedQty(Object expected)
	{
		isNotNull();
		bdAssert("InvoicedQty", actual.getInvoicedQty(), expected);
		return myself;
	}


	public C_ProjectLineAssert isPrinted()
	{
		isNotNull();
		if (!actual.isPrinted()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Printed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_ProjectLineAssert isNotPrinted()
	{
		isNotNull();
		if (actual.isPrinted()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Printed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_ProjectLineAssert hasLine(int expected)
	{
		isNotNull();
		int actualField = actual.getLine();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Line: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_ProjectLineAssert hasM_Product_Category_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_Category_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Product_Category_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_ProjectLineAssert hasM_Product_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Product_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_ProjectLineAssert hasM_Production_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Production_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Production_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_ProjectLineAssert hasPlannedAmt(Object expected)
	{
		isNotNull();
		bdAssert("PlannedAmt", actual.getPlannedAmt(), expected);
		return myself;
	}


	public C_ProjectLineAssert hasPlannedMarginAmt(Object expected)
	{
		isNotNull();
		bdAssert("PlannedMarginAmt", actual.getPlannedMarginAmt(), expected);
		return myself;
	}


	public C_ProjectLineAssert hasPlannedPrice(Object expected)
	{
		isNotNull();
		bdAssert("PlannedPrice", actual.getPlannedPrice(), expected);
		return myself;
	}


	public C_ProjectLineAssert hasPlannedQty(Object expected)
	{
		isNotNull();
		bdAssert("PlannedQty", actual.getPlannedQty(), expected);
		return myself;
	}


	public C_ProjectLineAssert isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_ProjectLineAssert isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}
}