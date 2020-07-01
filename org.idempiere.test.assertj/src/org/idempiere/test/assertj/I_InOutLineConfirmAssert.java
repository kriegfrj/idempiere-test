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
import org.compiere.model.X_I_InOutLineConfirm;

/** Generated assertion class for I_InOutLineConfirm
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class I_InOutLineConfirmAssert
	extends AbstractPOAssert<I_InOutLineConfirmAssert,X_I_InOutLineConfirm>
{

    /** Standard Constructor */
    public I_InOutLineConfirmAssert (X_I_InOutLineConfirm actual)
    {
      super (actual, I_InOutLineConfirmAssert.class);
    }


	public I_InOutLineConfirmAssert hasConfirmationNo(String expected)
	{
		isNotNull();
		String actualField = actual.getConfirmationNo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ConfirmationNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_InOutLineConfirmAssert hasConfirmedQty(Object expected)
	{
		isNotNull();
		bdAssert("ConfirmedQty", actual.getConfirmedQty(), expected);
		return myself;
	}


	public I_InOutLineConfirmAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_InOutLineConfirmAssert hasDifferenceQty(Object expected)
	{
		isNotNull();
		bdAssert("DifferenceQty", actual.getDifferenceQty(), expected);
		return myself;
	}


	public I_InOutLineConfirmAssert hasI_ErrorMsg(String expected)
	{
		isNotNull();
		String actualField = actual.getI_ErrorMsg();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have I_ErrorMsg: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_InOutLineConfirmAssert hasI_InOutLineConfirm_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getI_InOutLineConfirm_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have I_InOutLineConfirm_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_InOutLineConfirmAssert hasI_InOutLineConfirm_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getI_InOutLineConfirm_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have I_InOutLineConfirm_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_InOutLineConfirmAssert isI_IsImported()
	{
		isNotNull();
		if (!actual.isI_IsImported()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be I_IsImported\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public I_InOutLineConfirmAssert isNotI_IsImported()
	{
		isNotNull();
		if (actual.isI_IsImported()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be I_IsImported\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public I_InOutLineConfirmAssert hasM_InOutLineConfirm_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_InOutLineConfirm_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_InOutLineConfirm_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_InOutLineConfirmAssert isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public I_InOutLineConfirmAssert isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public I_InOutLineConfirmAssert hasScrappedQty(Object expected)
	{
		isNotNull();
		bdAssert("ScrappedQty", actual.getScrappedQty(), expected);
		return myself;
	}

}