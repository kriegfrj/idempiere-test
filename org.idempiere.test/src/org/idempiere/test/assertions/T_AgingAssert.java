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
import org.compiere.model.X_T_Aging;

/** Generated assertion class for T_Aging
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class T_AgingAssert
	extends AbstractPOAssert<T_AgingAssert,X_T_Aging>
{

    /** Standard Constructor */
    public T_AgingAssert (X_T_Aging actual)
    {
      super (actual, T_AgingAssert.class);
    }


	public T_AgingAssert hasAD_PInstance_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PInstance_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_PInstance_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_AgingAssert hasC_Activity_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Activity_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Activity_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_AgingAssert hasC_BP_Group_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BP_Group_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BP_Group_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_AgingAssert hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_AgingAssert hasC_Campaign_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Campaign_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Campaign_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_AgingAssert hasC_Currency_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Currency_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Currency_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_AgingAssert hasC_Invoice_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Invoice_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Invoice_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_AgingAssert hasC_InvoicePaySchedule_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_InvoicePaySchedule_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_InvoicePaySchedule_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_AgingAssert hasC_Project_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Project_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Project_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_AgingAssert isDateAcct()
	{
		isNotNull();
		if (!actual.isDateAcct()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DateAcct\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public T_AgingAssert isNotDateAcct()
	{
		isNotNull();
		if (actual.isDateAcct()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DateAcct\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public T_AgingAssert hasDaysDue(int expected)
	{
		isNotNull();
		int actualField = actual.getDaysDue();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DaysDue: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_AgingAssert hasDue0(Object expected)
	{
		isNotNull();
		bdAssert("Due0", actual.getDue0(), expected);
		return myself;
	}


	public T_AgingAssert hasDue0_30(Object expected)
	{
		isNotNull();
		bdAssert("Due0_30", actual.getDue0_30(), expected);
		return myself;
	}


	public T_AgingAssert hasDue0_7(Object expected)
	{
		isNotNull();
		bdAssert("Due0_7", actual.getDue0_7(), expected);
		return myself;
	}


	public T_AgingAssert hasDue1_7(Object expected)
	{
		isNotNull();
		bdAssert("Due1_7", actual.getDue1_7(), expected);
		return myself;
	}


	public T_AgingAssert hasDue31_60(Object expected)
	{
		isNotNull();
		bdAssert("Due31_60", actual.getDue31_60(), expected);
		return myself;
	}


	public T_AgingAssert hasDue31_Plus(Object expected)
	{
		isNotNull();
		bdAssert("Due31_Plus", actual.getDue31_Plus(), expected);
		return myself;
	}


	public T_AgingAssert hasDue61_90(Object expected)
	{
		isNotNull();
		bdAssert("Due61_90", actual.getDue61_90(), expected);
		return myself;
	}


	public T_AgingAssert hasDue61_Plus(Object expected)
	{
		isNotNull();
		bdAssert("Due61_Plus", actual.getDue61_Plus(), expected);
		return myself;
	}


	public T_AgingAssert hasDue8_30(Object expected)
	{
		isNotNull();
		bdAssert("Due8_30", actual.getDue8_30(), expected);
		return myself;
	}


	public T_AgingAssert hasDue91_Plus(Object expected)
	{
		isNotNull();
		bdAssert("Due91_Plus", actual.getDue91_Plus(), expected);
		return myself;
	}


	public T_AgingAssert hasDueAmt(Object expected)
	{
		isNotNull();
		bdAssert("DueAmt", actual.getDueAmt(), expected);
		return myself;
	}


	public T_AgingAssert hasDueDate(Object expected)
	{
		isNotNull();
		dateAssert("DueDate", actual.getDueDate(), expected);
		return myself;
	}


	public T_AgingAssert hasInvoicedAmt(Object expected)
	{
		isNotNull();
		bdAssert("InvoicedAmt", actual.getInvoicedAmt(), expected);
		return myself;
	}


	public T_AgingAssert isListInvoices()
	{
		isNotNull();
		if (!actual.isListInvoices()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ListInvoices\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public T_AgingAssert isNotListInvoices()
	{
		isNotNull();
		if (actual.isListInvoices()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ListInvoices\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public T_AgingAssert isSOTrx()
	{
		isNotNull();
		if (!actual.isSOTrx()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SOTrx\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public T_AgingAssert isNotSOTrx()
	{
		isNotNull();
		if (actual.isSOTrx()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SOTrx\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public T_AgingAssert hasOpenAmt(Object expected)
	{
		isNotNull();
		bdAssert("OpenAmt", actual.getOpenAmt(), expected);
		return myself;
	}


	public T_AgingAssert hasPastDue1_30(Object expected)
	{
		isNotNull();
		bdAssert("PastDue1_30", actual.getPastDue1_30(), expected);
		return myself;
	}


	public T_AgingAssert hasPastDue1_7(Object expected)
	{
		isNotNull();
		bdAssert("PastDue1_7", actual.getPastDue1_7(), expected);
		return myself;
	}


	public T_AgingAssert hasPastDue31_60(Object expected)
	{
		isNotNull();
		bdAssert("PastDue31_60", actual.getPastDue31_60(), expected);
		return myself;
	}


	public T_AgingAssert hasPastDue31_Plus(Object expected)
	{
		isNotNull();
		bdAssert("PastDue31_Plus", actual.getPastDue31_Plus(), expected);
		return myself;
	}


	public T_AgingAssert hasPastDue61_90(Object expected)
	{
		isNotNull();
		bdAssert("PastDue61_90", actual.getPastDue61_90(), expected);
		return myself;
	}


	public T_AgingAssert hasPastDue61_Plus(Object expected)
	{
		isNotNull();
		bdAssert("PastDue61_Plus", actual.getPastDue61_Plus(), expected);
		return myself;
	}


	public T_AgingAssert hasPastDue8_30(Object expected)
	{
		isNotNull();
		bdAssert("PastDue8_30", actual.getPastDue8_30(), expected);
		return myself;
	}


	public T_AgingAssert hasPastDue91_Plus(Object expected)
	{
		isNotNull();
		bdAssert("PastDue91_Plus", actual.getPastDue91_Plus(), expected);
		return myself;
	}


	public T_AgingAssert hasPastDueAmt(Object expected)
	{
		isNotNull();
		bdAssert("PastDueAmt", actual.getPastDueAmt(), expected);
		return myself;
	}


	public T_AgingAssert hasStatementDate(Object expected)
	{
		isNotNull();
		dateAssert("StatementDate", actual.getStatementDate(), expected);
		return myself;
	}


	public T_AgingAssert hasT_Aging_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getT_Aging_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have T_Aging_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}