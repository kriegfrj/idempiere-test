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
import org.compiere.model.X_C_PaymentAllocate;

/** Generated assertion class for C_PaymentAllocate
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_PaymentAllocateAssert
	extends AbstractPOAssert<C_PaymentAllocateAssert,X_C_PaymentAllocate>
{

    /** Standard Constructor */
    public C_PaymentAllocateAssert (X_C_PaymentAllocate actual)
    {
      super (actual, C_PaymentAllocateAssert.class);
    }


	public C_PaymentAllocateAssert hasAmount(Object expected)
	{
		isNotNull();
		bdAssert("Amount", actual.getAmount(), expected);
		return myself;
	}


	public C_PaymentAllocateAssert hasC_AllocationLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_AllocationLine_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_AllocationLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentAllocateAssert hasC_Invoice_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Invoice_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Invoice_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentAllocateAssert hasC_Payment_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Payment_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Payment_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentAllocateAssert hasC_PaymentAllocate_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_PaymentAllocate_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_PaymentAllocate_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentAllocateAssert hasC_PaymentAllocate_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_PaymentAllocate_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_PaymentAllocate_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_PaymentAllocateAssert hasDiscountAmt(Object expected)
	{
		isNotNull();
		bdAssert("DiscountAmt", actual.getDiscountAmt(), expected);
		return myself;
	}


	public C_PaymentAllocateAssert hasInvoiceAmt(Object expected)
	{
		isNotNull();
		bdAssert("InvoiceAmt", actual.getInvoiceAmt(), expected);
		return myself;
	}


	public C_PaymentAllocateAssert hasOverUnderAmt(Object expected)
	{
		isNotNull();
		bdAssert("OverUnderAmt", actual.getOverUnderAmt(), expected);
		return myself;
	}


	public C_PaymentAllocateAssert hasRemainingAmt(Object expected)
	{
		isNotNull();
		bdAssert("RemainingAmt", actual.getRemainingAmt(), expected);
		return myself;
	}


	public C_PaymentAllocateAssert hasWriteOffAmt(Object expected)
	{
		isNotNull();
		bdAssert("WriteOffAmt", actual.getWriteOffAmt(), expected);
		return myself;
	}

}