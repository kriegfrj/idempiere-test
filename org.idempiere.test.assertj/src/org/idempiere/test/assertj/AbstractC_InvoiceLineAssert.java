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
import org.compiere.model.X_C_InvoiceLine;

/** Generated assertion class for C_InvoiceLine
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractC_InvoiceLineAssert<SELF extends AbstractC_InvoiceLineAssert<SELF, ACTUAL>, ACTUAL extends X_C_InvoiceLine>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractC_InvoiceLineAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasA_Asset_Group_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Group_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Group_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Asset_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_CapvsExp(String expected)
	{
		isNotNull();
		String actualField = actual.getA_CapvsExp();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_CapvsExp: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isA_CreateAsset()
	{
		isNotNull();
		if (!actual.isA_CreateAsset()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be A_CreateAsset\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotA_CreateAsset()
	{
		isNotNull();
		if (actual.isA_CreateAsset()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be A_CreateAsset\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isA_Processed()
	{
		isNotNull();
		if (!actual.isA_Processed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be A_Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotA_Processed()
	{
		isNotNull();
		if (actual.isA_Processed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be A_Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasAD_OrgTrx_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_OrgTrx_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_OrgTrx_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_1099Box_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_1099Box_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_1099Box_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Activity_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Activity_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Activity_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Campaign_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Campaign_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Campaign_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Charge_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Charge_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Charge_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Invoice_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Invoice_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Invoice_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_InvoiceLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_InvoiceLine_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_InvoiceLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_InvoiceLine_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_InvoiceLine_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_InvoiceLine_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_OrderLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_OrderLine_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_OrderLine_ID: <%s>\nbut it was: <%s>",
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

	public SELF hasC_Tax_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Tax_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Tax_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_UOM_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_UOM_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_UOM_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
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

	public SELF isDescription()
	{
		isNotNull();
		if (!actual.isDescription()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Description\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotDescription()
	{
		isNotNull();
		if (actual.isDescription()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Description\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isFixedAssetInvoice()
	{
		isNotNull();
		if (!actual.isFixedAssetInvoice()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be FixedAssetInvoice\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotFixedAssetInvoice()
	{
		isNotNull();
		if (actual.isFixedAssetInvoice()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be FixedAssetInvoice\nbut it was",
				getPODescription());
		}
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

	public SELF hasLineNetAmt(Object expected)
	{
		isNotNull();
		bdAssert("LineNetAmt", actual.getLineNetAmt(), expected);
		return myself;
	}


	public SELF hasLineTotalAmt(Object expected)
	{
		isNotNull();
		bdAssert("LineTotalAmt", actual.getLineTotalAmt(), expected);
		return myself;
	}


	public SELF hasM_AttributeSetInstance_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_AttributeSetInstance_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_AttributeSetInstance_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_InOutLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_InOutLine_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_InOutLine_ID: <%s>\nbut it was: <%s>",
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

	public SELF hasM_RMALine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_RMALine_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_RMALine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPriceActual(Object expected)
	{
		isNotNull();
		bdAssert("PriceActual", actual.getPriceActual(), expected);
		return myself;
	}


	public SELF hasPriceEntered(Object expected)
	{
		isNotNull();
		bdAssert("PriceEntered", actual.getPriceEntered(), expected);
		return myself;
	}


	public SELF hasPriceLimit(Object expected)
	{
		isNotNull();
		bdAssert("PriceLimit", actual.getPriceLimit(), expected);
		return myself;
	}


	public SELF hasPriceList(Object expected)
	{
		isNotNull();
		bdAssert("PriceList", actual.getPriceList(), expected);
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

	public SELF hasQtyEntered(Object expected)
	{
		isNotNull();
		bdAssert("QtyEntered", actual.getQtyEntered(), expected);
		return myself;
	}


	public SELF hasQtyInvoiced(Object expected)
	{
		isNotNull();
		bdAssert("QtyInvoiced", actual.getQtyInvoiced(), expected);
		return myself;
	}


	public SELF hasRef_InvoiceLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getRef_InvoiceLine_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Ref_InvoiceLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasRRAmt(Object expected)
	{
		isNotNull();
		bdAssert("RRAmt", actual.getRRAmt(), expected);
		return myself;
	}


	public SELF hasRRStartDate(Object expected)
	{
		isNotNull();
		dateAssert("RRStartDate", actual.getRRStartDate(), expected);
		return myself;
	}


	public SELF hasS_ResourceAssignment_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getS_ResourceAssignment_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have S_ResourceAssignment_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasTaxAmt(Object expected)
	{
		isNotNull();
		bdAssert("TaxAmt", actual.getTaxAmt(), expected);
		return myself;
	}


	public SELF hasUser1_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getUser1_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have User1_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasUser2_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getUser2_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have User2_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}