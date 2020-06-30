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
import org.compiere.model.X_M_MovementLineConfirm;

/** Generated assertion class for M_MovementLineConfirm
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class M_MovementLineConfirmAssert
	extends AbstractPOAssert<M_MovementLineConfirmAssert,X_M_MovementLineConfirm>
{

    /** Standard Constructor */
    public M_MovementLineConfirmAssert (X_M_MovementLineConfirm actual)
    {
      super (actual, M_MovementLineConfirmAssert.class);
    }


	public M_MovementLineConfirmAssert hasConfirmedQty(Object expected)
	{
		isNotNull();
		bdAssert("ConfirmedQty", actual.getConfirmedQty(), expected);
		return myself;
	}


	public M_MovementLineConfirmAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_MovementLineConfirmAssert hasDifferenceQty(Object expected)
	{
		isNotNull();
		bdAssert("DifferenceQty", actual.getDifferenceQty(), expected);
		return myself;
	}


	public M_MovementLineConfirmAssert hasM_InventoryLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_InventoryLine_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_InventoryLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_MovementLineConfirmAssert hasM_MovementConfirm_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_MovementConfirm_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_MovementConfirm_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_MovementLineConfirmAssert hasM_MovementLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_MovementLine_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_MovementLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_MovementLineConfirmAssert hasM_MovementLineConfirm_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_MovementLineConfirm_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_MovementLineConfirm_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_MovementLineConfirmAssert hasM_MovementLineConfirm_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getM_MovementLineConfirm_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_MovementLineConfirm_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_MovementLineConfirmAssert isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_MovementLineConfirmAssert isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_MovementLineConfirmAssert hasScrappedQty(Object expected)
	{
		isNotNull();
		bdAssert("ScrappedQty", actual.getScrappedQty(), expected);
		return myself;
	}


	public M_MovementLineConfirmAssert hasTargetQty(Object expected)
	{
		isNotNull();
		bdAssert("TargetQty", actual.getTargetQty(), expected);
		return myself;
	}

}