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
import org.compiere.model.X_C_DocType;

/** Generated assertion class for C_DocType
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_DocTypeAssert
	extends AbstractPOAssert<C_DocTypeAssert,X_C_DocType>
{

    /** Standard Constructor */
    public C_DocTypeAssert (X_C_DocType actual)
    {
      super (actual, C_DocTypeAssert.class);
    }


	public C_DocTypeAssert hasAD_PrintFormat_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PrintFormat_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_PrintFormat_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DocTypeAssert hasC_DocType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_DocType_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_DocType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DocTypeAssert hasC_DocType_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_DocType_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_DocType_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DocTypeAssert hasC_DocTypeDifference_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_DocTypeDifference_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_DocTypeDifference_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DocTypeAssert hasC_DocTypeInvoice_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_DocTypeInvoice_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_DocTypeInvoice_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DocTypeAssert hasC_DocTypeProforma_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_DocTypeProforma_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_DocTypeProforma_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DocTypeAssert hasC_DocTypeShipment_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_DocTypeShipment_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_DocTypeShipment_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DocTypeAssert hasDefiniteSequence_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getDefiniteSequence_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DefiniteSequence_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DocTypeAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DocTypeAssert hasDocBaseType(String expected)
	{
		isNotNull();
		String actualField = actual.getDocBaseType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DocBaseType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DocTypeAssert hasDocNoSequence_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getDocNoSequence_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DocNoSequence_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DocTypeAssert hasDocSubTypeInv(String expected)
	{
		isNotNull();
		String actualField = actual.getDocSubTypeInv();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DocSubTypeInv: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DocTypeAssert hasDocSubTypeSO(String expected)
	{
		isNotNull();
		String actualField = actual.getDocSubTypeSO();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DocSubTypeSO: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DocTypeAssert hasDocumentCopies(int expected)
	{
		isNotNull();
		int actualField = actual.getDocumentCopies();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DocumentCopies: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DocTypeAssert hasDocumentNote(String expected)
	{
		isNotNull();
		String actualField = actual.getDocumentNote();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DocumentNote: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DocTypeAssert hasGL_Category_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getGL_Category_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have GL_Category_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DocTypeAssert isHasCharges()
	{
		isNotNull();
		if (!actual.isHasCharges()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be HasCharges\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_DocTypeAssert isNotHasCharges()
	{
		isNotNull();
		if (actual.isHasCharges()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be HasCharges\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_DocTypeAssert isHasProforma()
	{
		isNotNull();
		if (!actual.isHasProforma()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be HasProforma\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_DocTypeAssert isNotHasProforma()
	{
		isNotNull();
		if (actual.isHasProforma()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be HasProforma\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_DocTypeAssert isChargeOrProductMandatory()
	{
		isNotNull();
		if (!actual.isChargeOrProductMandatory()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ChargeOrProductMandatory\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_DocTypeAssert isNotChargeOrProductMandatory()
	{
		isNotNull();
		if (actual.isChargeOrProductMandatory()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ChargeOrProductMandatory\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_DocTypeAssert isCreateCounter()
	{
		isNotNull();
		if (!actual.isCreateCounter()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CreateCounter\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_DocTypeAssert isNotCreateCounter()
	{
		isNotNull();
		if (actual.isCreateCounter()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CreateCounter\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_DocTypeAssert isDefault()
	{
		isNotNull();
		if (!actual.isDefault()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Default\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_DocTypeAssert isNotDefault()
	{
		isNotNull();
		if (actual.isDefault()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Default\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_DocTypeAssert isDefaultCounterDoc()
	{
		isNotNull();
		if (!actual.isDefaultCounterDoc()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DefaultCounterDoc\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_DocTypeAssert isNotDefaultCounterDoc()
	{
		isNotNull();
		if (actual.isDefaultCounterDoc()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DefaultCounterDoc\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_DocTypeAssert isDocNoControlled()
	{
		isNotNull();
		if (!actual.isDocNoControlled()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DocNoControlled\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_DocTypeAssert isNotDocNoControlled()
	{
		isNotNull();
		if (actual.isDocNoControlled()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DocNoControlled\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_DocTypeAssert isIndexed()
	{
		isNotNull();
		if (!actual.isIndexed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Indexed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_DocTypeAssert isNotIndexed()
	{
		isNotNull();
		if (actual.isIndexed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Indexed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_DocTypeAssert isInTransit()
	{
		isNotNull();
		if (!actual.isInTransit()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be InTransit\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_DocTypeAssert isNotInTransit()
	{
		isNotNull();
		if (actual.isInTransit()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be InTransit\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_DocTypeAssert isOverwriteDateOnComplete()
	{
		isNotNull();
		if (!actual.isOverwriteDateOnComplete()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OverwriteDateOnComplete\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_DocTypeAssert isNotOverwriteDateOnComplete()
	{
		isNotNull();
		if (actual.isOverwriteDateOnComplete()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OverwriteDateOnComplete\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_DocTypeAssert isOverwriteSeqOnComplete()
	{
		isNotNull();
		if (!actual.isOverwriteSeqOnComplete()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OverwriteSeqOnComplete\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_DocTypeAssert isNotOverwriteSeqOnComplete()
	{
		isNotNull();
		if (actual.isOverwriteSeqOnComplete()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OverwriteSeqOnComplete\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_DocTypeAssert isPickQAConfirm()
	{
		isNotNull();
		if (!actual.isPickQAConfirm()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PickQAConfirm\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_DocTypeAssert isNotPickQAConfirm()
	{
		isNotNull();
		if (actual.isPickQAConfirm()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PickQAConfirm\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_DocTypeAssert isPrepareSplitDocument()
	{
		isNotNull();
		if (!actual.isPrepareSplitDocument()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PrepareSplitDocument\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_DocTypeAssert isNotPrepareSplitDocument()
	{
		isNotNull();
		if (actual.isPrepareSplitDocument()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PrepareSplitDocument\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_DocTypeAssert isShipConfirm()
	{
		isNotNull();
		if (!actual.isShipConfirm()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ShipConfirm\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_DocTypeAssert isNotShipConfirm()
	{
		isNotNull();
		if (actual.isShipConfirm()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ShipConfirm\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_DocTypeAssert isSOTrx()
	{
		isNotNull();
		if (!actual.isSOTrx()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SOTrx\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_DocTypeAssert isNotSOTrx()
	{
		isNotNull();
		if (actual.isSOTrx()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SOTrx\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_DocTypeAssert isSplitWhenDifference()
	{
		isNotNull();
		if (!actual.isSplitWhenDifference()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SplitWhenDifference\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_DocTypeAssert isNotSplitWhenDifference()
	{
		isNotNull();
		if (actual.isSplitWhenDifference()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SplitWhenDifference\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_DocTypeAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_DocTypeAssert hasPrintName(String expected)
	{
		isNotNull();
		String actualField = actual.getPrintName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PrintName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}