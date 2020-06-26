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
import org.compiere.model.X_C_DepositBatchLine;

/** Generated assertion class for C_DepositBatchLine
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_DepositBatchLineAssert
	extends AbstractPOAssert<C_DepositBatchLineAssert,X_C_DepositBatchLine>
{

    /** Standard Constructor */
    public C_DepositBatchLineAssert (X_C_DepositBatchLine actual)
    {
      super (actual, C_DepositBatchLineAssert.class);
    }


	public C_DepositBatchLineAssert hasC_DepositBatch_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_DepositBatch_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_DepositBatch_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DepositBatchLineAssert hasC_DepositBatchLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_DepositBatchLine_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_DepositBatchLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DepositBatchLineAssert hasC_DepositBatchLine_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_DepositBatchLine_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_DepositBatchLine_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DepositBatchLineAssert hasC_Payment_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Payment_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Payment_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DepositBatchLineAssert hasLine(int expected)
	{
		isNotNull();
		int actualField = actual.getLine();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Line: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DepositBatchLineAssert hasPayAmt(Object expected)
	{
		isNotNull();
		bdAssert("PayAmt", actual.getPayAmt(), expected);
		return myself;
	}


	public C_DepositBatchLineAssert isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_DepositBatchLineAssert isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_DepositBatchLineAssert isProcessing()
	{
		isNotNull();
		if (!actual.isProcessing()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processing\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_DepositBatchLineAssert isNotProcessing()
	{
		isNotNull();
		if (actual.isProcessing()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processing\nbut it was",
				getPODescription());
		}
		return myself;
	}
}