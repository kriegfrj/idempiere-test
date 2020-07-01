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
import org.compiere.model.X_M_ShippingTransactionLine;

/** Generated assertion class for M_ShippingTransactionLine
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class M_ShippingTransactionLineAssert
	extends AbstractPOAssert<M_ShippingTransactionLineAssert,X_M_ShippingTransactionLine>
{

    /** Standard Constructor */
    public M_ShippingTransactionLineAssert (X_M_ShippingTransactionLine actual)
    {
      super (actual, M_ShippingTransactionLineAssert.class);
    }


	public M_ShippingTransactionLineAssert hasC_UOM_Length_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_UOM_Length_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_UOM_Length_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionLineAssert hasC_UOM_Weight_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_UOM_Weight_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_UOM_Weight_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionLineAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionLineAssert hasHeight(Object expected)
	{
		isNotNull();
		bdAssert("Height", actual.getHeight(), expected);
		return myself;
	}


	public M_ShippingTransactionLineAssert hasLength(Object expected)
	{
		isNotNull();
		bdAssert("Length", actual.getLength(), expected);
		return myself;
	}


	public M_ShippingTransactionLineAssert hasM_PackageMPS_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_PackageMPS_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_PackageMPS_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionLineAssert hasM_ShippingTransaction_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_ShippingTransaction_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_ShippingTransaction_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionLineAssert hasM_ShippingTransactionLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_ShippingTransactionLine_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_ShippingTransactionLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionLineAssert hasM_ShippingTransactionLine_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getM_ShippingTransactionLine_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_ShippingTransactionLine_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionLineAssert hasMasterTrackingNo(String expected)
	{
		isNotNull();
		String actualField = actual.getMasterTrackingNo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have MasterTrackingNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionLineAssert hasPrice(Object expected)
	{
		isNotNull();
		bdAssert("Price", actual.getPrice(), expected);
		return myself;
	}


	public M_ShippingTransactionLineAssert isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_ShippingTransactionLineAssert isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_ShippingTransactionLineAssert hasSeqNo(int expected)
	{
		isNotNull();
		int actualField = actual.getSeqNo();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have SeqNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionLineAssert hasTrackingNo(String expected)
	{
		isNotNull();
		String actualField = actual.getTrackingNo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have TrackingNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionLineAssert hasWeight(Object expected)
	{
		isNotNull();
		bdAssert("Weight", actual.getWeight(), expected);
		return myself;
	}


	public M_ShippingTransactionLineAssert hasWidth(Object expected)
	{
		isNotNull();
		bdAssert("Width", actual.getWidth(), expected);
		return myself;
	}

}