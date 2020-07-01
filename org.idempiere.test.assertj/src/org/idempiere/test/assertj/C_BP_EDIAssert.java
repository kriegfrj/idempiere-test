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
import org.compiere.model.X_C_BP_EDI;

/** Generated assertion class for C_BP_EDI
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_BP_EDIAssert
	extends AbstractPOAssert<C_BP_EDIAssert,X_C_BP_EDI>
{

    /** Standard Constructor */
    public C_BP_EDIAssert (X_C_BP_EDI actual)
    {
      super (actual, C_BP_EDIAssert.class);
    }


	public C_BP_EDIAssert hasAD_Sequence_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Sequence_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Sequence_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_EDIAssert hasC_BP_EDI_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BP_EDI_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BP_EDI_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_EDIAssert hasC_BP_EDI_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_BP_EDI_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BP_EDI_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_EDIAssert hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_EDIAssert hasCustomerNo(String expected)
	{
		isNotNull();
		String actualField = actual.getCustomerNo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CustomerNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_EDIAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_EDIAssert hasEDIType(String expected)
	{
		isNotNull();
		String actualField = actual.getEDIType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have EDIType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_EDIAssert hasEMail_Error_To(String expected)
	{
		isNotNull();
		String actualField = actual.getEMail_Error_To();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have EMail_Error_To: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_EDIAssert hasEMail_From(String expected)
	{
		isNotNull();
		String actualField = actual.getEMail_From();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have EMail_From: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_EDIAssert hasEMail_From_Pwd(String expected)
	{
		isNotNull();
		String actualField = actual.getEMail_From_Pwd();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have EMail_From_Pwd: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_EDIAssert hasEMail_From_Uid(String expected)
	{
		isNotNull();
		String actualField = actual.getEMail_From_Uid();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have EMail_From_Uid: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_EDIAssert hasEMail_Info_To(String expected)
	{
		isNotNull();
		String actualField = actual.getEMail_Info_To();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have EMail_Info_To: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_EDIAssert hasEMail_To(String expected)
	{
		isNotNull();
		String actualField = actual.getEMail_To();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have EMail_To: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_EDIAssert isAudited()
	{
		isNotNull();
		if (!actual.isAudited()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Audited\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BP_EDIAssert isNotAudited()
	{
		isNotNull();
		if (actual.isAudited()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Audited\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BP_EDIAssert isInfoSent()
	{
		isNotNull();
		if (!actual.isInfoSent()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be InfoSent\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BP_EDIAssert isNotInfoSent()
	{
		isNotNull();
		if (actual.isInfoSent()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be InfoSent\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BP_EDIAssert hasM_Warehouse_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Warehouse_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Warehouse_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_EDIAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_EDIAssert isReceiveInquiryReply()
	{
		isNotNull();
		if (!actual.isReceiveInquiryReply()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ReceiveInquiryReply\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BP_EDIAssert isNotReceiveInquiryReply()
	{
		isNotNull();
		if (actual.isReceiveInquiryReply()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ReceiveInquiryReply\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BP_EDIAssert isReceiveOrderReply()
	{
		isNotNull();
		if (!actual.isReceiveOrderReply()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ReceiveOrderReply\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BP_EDIAssert isNotReceiveOrderReply()
	{
		isNotNull();
		if (actual.isReceiveOrderReply()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ReceiveOrderReply\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BP_EDIAssert isSendInquiry()
	{
		isNotNull();
		if (!actual.isSendInquiry()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SendInquiry\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BP_EDIAssert isNotSendInquiry()
	{
		isNotNull();
		if (actual.isSendInquiry()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SendInquiry\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BP_EDIAssert isSendOrder()
	{
		isNotNull();
		if (!actual.isSendOrder()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SendOrder\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BP_EDIAssert isNotSendOrder()
	{
		isNotNull();
		if (actual.isSendOrder()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SendOrder\nbut it was",
				getPODescription());
		}
		return myself;
	}
}