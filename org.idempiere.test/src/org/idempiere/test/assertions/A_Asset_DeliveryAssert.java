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
import org.compiere.model.X_A_Asset_Delivery;

/** Generated assertion class for A_Asset_Delivery
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class A_Asset_DeliveryAssert
	extends AbstractPOAssert<A_Asset_DeliveryAssert,X_A_Asset_Delivery>
{

    /** Standard Constructor */
    public A_Asset_DeliveryAssert (X_A_Asset_Delivery actual)
    {
      super (actual, A_Asset_DeliveryAssert.class);
    }


	public A_Asset_DeliveryAssert hasA_Asset_Delivery_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Delivery_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Asset_Delivery_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_DeliveryAssert hasA_Asset_Delivery_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Asset_Delivery_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Asset_Delivery_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_DeliveryAssert hasA_Asset_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have A_Asset_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_DeliveryAssert hasAD_User_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_User_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_User_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_DeliveryAssert hasDeliveryConfirmation(String expected)
	{
		isNotNull();
		String actualField = actual.getDeliveryConfirmation();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DeliveryConfirmation: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_DeliveryAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_DeliveryAssert hasEMail(String expected)
	{
		isNotNull();
		String actualField = actual.getEMail();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have EMail: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_DeliveryAssert hasLot(String expected)
	{
		isNotNull();
		String actualField = actual.getLot();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Lot: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_DeliveryAssert hasM_InOutLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_InOutLine_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_InOutLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_DeliveryAssert hasM_ProductDownload_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_ProductDownload_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_ProductDownload_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_DeliveryAssert hasMessageID(String expected)
	{
		isNotNull();
		String actualField = actual.getMessageID();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have MessageID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_DeliveryAssert hasMovementDate(Object expected)
	{
		isNotNull();
		dateAssert("MovementDate", actual.getMovementDate(), expected);
		return myself;
	}


	public A_Asset_DeliveryAssert hasReferrer(String expected)
	{
		isNotNull();
		String actualField = actual.getReferrer();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Referrer: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_DeliveryAssert hasRemote_Addr(String expected)
	{
		isNotNull();
		String actualField = actual.getRemote_Addr();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Remote_Addr: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_DeliveryAssert hasRemote_Host(String expected)
	{
		isNotNull();
		String actualField = actual.getRemote_Host();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Remote_Host: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_DeliveryAssert hasSerNo(String expected)
	{
		isNotNull();
		String actualField = actual.getSerNo();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SerNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_DeliveryAssert hasURL(String expected)
	{
		isNotNull();
		String actualField = actual.getURL();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have URL: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_DeliveryAssert hasVersionNo(String expected)
	{
		isNotNull();
		String actualField = actual.getVersionNo();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have VersionNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}