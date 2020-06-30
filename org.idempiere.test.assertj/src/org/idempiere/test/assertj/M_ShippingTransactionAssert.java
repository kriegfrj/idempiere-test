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
import org.compiere.model.X_M_ShippingTransaction;

/** Generated assertion class for M_ShippingTransaction
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class M_ShippingTransactionAssert
	extends AbstractPOAssert<M_ShippingTransactionAssert,X_M_ShippingTransaction>
{

    /** Standard Constructor */
    public M_ShippingTransactionAssert (X_M_ShippingTransaction actual)
    {
      super (actual, M_ShippingTransactionAssert.class);
    }


	public M_ShippingTransactionAssert hasAction(String expected)
	{
		isNotNull();
		String actualField = actual.getAction();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Action: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasAD_User_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_User_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_User_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasBill_Location_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getBill_Location_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Bill_Location_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasBoxCount(int expected)
	{
		isNotNull();
		int actualField = actual.getBoxCount();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have BoxCount: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasC_BP_ShippingAcct_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BP_ShippingAcct_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BP_ShippingAcct_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasC_BPartner_Location_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_Location_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BPartner_Location_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasC_Currency_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Currency_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Currency_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasC_Invoice_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Invoice_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Invoice_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasC_Order_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Order_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Order_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasC_UOM_Length_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_UOM_Length_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_UOM_Length_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasC_UOM_Weight_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_UOM_Weight_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_UOM_Weight_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert isCashOnDelivery()
	{
		isNotNull();
		if (!actual.isCashOnDelivery()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CashOnDelivery\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_ShippingTransactionAssert isNotCashOnDelivery()
	{
		isNotNull();
		if (actual.isCashOnDelivery()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CashOnDelivery\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasCODAmount(Object expected)
	{
		isNotNull();
		bdAssert("CODAmount", actual.getCODAmount(), expected);
		return myself;
	}


	public M_ShippingTransactionAssert hasCustomsValue(Object expected)
	{
		isNotNull();
		bdAssert("CustomsValue", actual.getCustomsValue(), expected);
		return myself;
	}


	public M_ShippingTransactionAssert hasDateReceived(Object expected)
	{
		isNotNull();
		dateAssert("DateReceived", actual.getDateReceived(), expected);
		return myself;
	}


	public M_ShippingTransactionAssert isDeliveryConfirmation()
	{
		isNotNull();
		if (!actual.isDeliveryConfirmation()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DeliveryConfirmation\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_ShippingTransactionAssert isNotDeliveryConfirmation()
	{
		isNotNull();
		if (actual.isDeliveryConfirmation()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DeliveryConfirmation\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasDeliveryConfirmationType(String expected)
	{
		isNotNull();
		String actualField = actual.getDeliveryConfirmationType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DeliveryConfirmationType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasDotHazardClassOrDivision(String expected)
	{
		isNotNull();
		String actualField = actual.getDotHazardClassOrDivision();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DotHazardClassOrDivision: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasDryIceWeight(Object expected)
	{
		isNotNull();
		bdAssert("DryIceWeight", actual.getDryIceWeight(), expected);
		return myself;
	}


	public M_ShippingTransactionAssert hasDutiesShipperAccount(String expected)
	{
		isNotNull();
		String actualField = actual.getDutiesShipperAccount();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DutiesShipperAccount: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasFOB(String expected)
	{
		isNotNull();
		String actualField = actual.getFOB();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have FOB: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasFreightAmt(Object expected)
	{
		isNotNull();
		bdAssert("FreightAmt", actual.getFreightAmt(), expected);
		return myself;
	}


	public M_ShippingTransactionAssert hasFreightCharges(String expected)
	{
		isNotNull();
		String actualField = actual.getFreightCharges();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have FreightCharges: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasHandlingCharge(Object expected)
	{
		isNotNull();
		bdAssert("HandlingCharge", actual.getHandlingCharge(), expected);
		return myself;
	}


	public M_ShippingTransactionAssert hasHeight(Object expected)
	{
		isNotNull();
		bdAssert("Height", actual.getHeight(), expected);
		return myself;
	}


	public M_ShippingTransactionAssert hasHoldAddress_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getHoldAddress_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have HoldAddress_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasHomeDeliveryPremiumDate(Object expected)
	{
		isNotNull();
		dateAssert("HomeDeliveryPremiumDate", actual.getHomeDeliveryPremiumDate(), expected);
		return myself;
	}


	public M_ShippingTransactionAssert hasHomeDeliveryPremiumPhone(String expected)
	{
		isNotNull();
		String actualField = actual.getHomeDeliveryPremiumPhone();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have HomeDeliveryPremiumPhone: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasHomeDeliveryPremiumType(String expected)
	{
		isNotNull();
		String actualField = actual.getHomeDeliveryPremiumType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have HomeDeliveryPremiumType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasInsurance(String expected)
	{
		isNotNull();
		String actualField = actual.getInsurance();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Insurance: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasInsuredAmount(Object expected)
	{
		isNotNull();
		bdAssert("InsuredAmount", actual.getInsuredAmount(), expected);
		return myself;
	}


	public M_ShippingTransactionAssert isAccessible()
	{
		isNotNull();
		if (!actual.isAccessible()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Accessible\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_ShippingTransactionAssert isNotAccessible()
	{
		isNotNull();
		if (actual.isAccessible()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Accessible\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_ShippingTransactionAssert isAddedHandling()
	{
		isNotNull();
		if (!actual.isAddedHandling()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AddedHandling\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_ShippingTransactionAssert isNotAddedHandling()
	{
		isNotNull();
		if (actual.isAddedHandling()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AddedHandling\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_ShippingTransactionAssert isAlternateReturnAddress()
	{
		isNotNull();
		if (!actual.isAlternateReturnAddress()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AlternateReturnAddress\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_ShippingTransactionAssert isNotAlternateReturnAddress()
	{
		isNotNull();
		if (actual.isAlternateReturnAddress()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AlternateReturnAddress\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_ShippingTransactionAssert isCargoAircraftOnly()
	{
		isNotNull();
		if (!actual.isCargoAircraftOnly()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CargoAircraftOnly\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_ShippingTransactionAssert isNotCargoAircraftOnly()
	{
		isNotNull();
		if (actual.isCargoAircraftOnly()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CargoAircraftOnly\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_ShippingTransactionAssert isDryIce()
	{
		isNotNull();
		if (!actual.isDryIce()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DryIce\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_ShippingTransactionAssert isNotDryIce()
	{
		isNotNull();
		if (actual.isDryIce()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DryIce\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_ShippingTransactionAssert isDutiable()
	{
		isNotNull();
		if (!actual.isDutiable()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Dutiable\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_ShippingTransactionAssert isNotDutiable()
	{
		isNotNull();
		if (actual.isDutiable()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Dutiable\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_ShippingTransactionAssert isFutureDayShipment()
	{
		isNotNull();
		if (!actual.isFutureDayShipment()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be FutureDayShipment\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_ShippingTransactionAssert isNotFutureDayShipment()
	{
		isNotNull();
		if (actual.isFutureDayShipment()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be FutureDayShipment\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_ShippingTransactionAssert isHazMat()
	{
		isNotNull();
		if (!actual.isHazMat()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be HazMat\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_ShippingTransactionAssert isNotHazMat()
	{
		isNotNull();
		if (actual.isHazMat()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be HazMat\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_ShippingTransactionAssert isHoldAtLocation()
	{
		isNotNull();
		if (!actual.isHoldAtLocation()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be HoldAtLocation\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_ShippingTransactionAssert isNotHoldAtLocation()
	{
		isNotNull();
		if (actual.isHoldAtLocation()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be HoldAtLocation\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_ShippingTransactionAssert isIgnoreZipNotFound()
	{
		isNotNull();
		if (!actual.isIgnoreZipNotFound()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IgnoreZipNotFound\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_ShippingTransactionAssert isNotIgnoreZipNotFound()
	{
		isNotNull();
		if (actual.isIgnoreZipNotFound()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IgnoreZipNotFound\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_ShippingTransactionAssert isIgnoreZipStateNotMatch()
	{
		isNotNull();
		if (!actual.isIgnoreZipStateNotMatch()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IgnoreZipStateNotMatch\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_ShippingTransactionAssert isNotIgnoreZipStateNotMatch()
	{
		isNotNull();
		if (actual.isIgnoreZipStateNotMatch()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IgnoreZipStateNotMatch\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_ShippingTransactionAssert isPriviledgedRate()
	{
		isNotNull();
		if (!actual.isPriviledgedRate()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PriviledgedRate\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_ShippingTransactionAssert isNotPriviledgedRate()
	{
		isNotNull();
		if (actual.isPriviledgedRate()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PriviledgedRate\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_ShippingTransactionAssert isResidential()
	{
		isNotNull();
		if (!actual.isResidential()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Residential\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_ShippingTransactionAssert isNotResidential()
	{
		isNotNull();
		if (actual.isResidential()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Residential\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_ShippingTransactionAssert isSaturdayDelivery()
	{
		isNotNull();
		if (!actual.isSaturdayDelivery()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SaturdayDelivery\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_ShippingTransactionAssert isNotSaturdayDelivery()
	{
		isNotNull();
		if (actual.isSaturdayDelivery()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SaturdayDelivery\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_ShippingTransactionAssert isSaturdayPickup()
	{
		isNotNull();
		if (!actual.isSaturdayPickup()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SaturdayPickup\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_ShippingTransactionAssert isNotSaturdayPickup()
	{
		isNotNull();
		if (actual.isSaturdayPickup()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SaturdayPickup\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_ShippingTransactionAssert isVerbalConfirmation()
	{
		isNotNull();
		if (!actual.isVerbalConfirmation()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be VerbalConfirmation\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_ShippingTransactionAssert isNotVerbalConfirmation()
	{
		isNotNull();
		if (actual.isVerbalConfirmation()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be VerbalConfirmation\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasLatestPickupTime(Object expected)
	{
		isNotNull();
		dateAssert("LatestPickupTime", actual.getLatestPickupTime(), expected);
		return myself;
	}


	public M_ShippingTransactionAssert hasLength(Object expected)
	{
		isNotNull();
		bdAssert("Length", actual.getLength(), expected);
		return myself;
	}


	public M_ShippingTransactionAssert hasM_InOut_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_InOut_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_InOut_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasM_Package_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Package_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Package_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasM_Shipper_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Shipper_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Shipper_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasM_ShipperLabels_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_ShipperLabels_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_ShipperLabels_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasM_ShipperPackaging_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_ShipperPackaging_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_ShipperPackaging_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasM_ShipperPickupTypes_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_ShipperPickupTypes_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_ShipperPickupTypes_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasM_ShippingProcessor_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_ShippingProcessor_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_ShippingProcessor_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasM_ShippingTransaction_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_ShippingTransaction_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_ShippingTransaction_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasM_ShippingTransaction_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getM_ShippingTransaction_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_ShippingTransaction_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasM_Warehouse_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Warehouse_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Warehouse_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasNotificationMessage(String expected)
	{
		isNotNull();
		String actualField = actual.getNotificationMessage();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have NotificationMessage: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasNotificationType(String expected)
	{
		isNotNull();
		String actualField = actual.getNotificationType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have NotificationType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasPaymentRule(String expected)
	{
		isNotNull();
		String actualField = actual.getPaymentRule();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PaymentRule: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasPOReference(String expected)
	{
		isNotNull();
		String actualField = actual.getPOReference();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have POReference: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasPrice(Object expected)
	{
		isNotNull();
		bdAssert("Price", actual.getPrice(), expected);
		return myself;
	}


	public M_ShippingTransactionAssert hasPriceActual(Object expected)
	{
		isNotNull();
		bdAssert("PriceActual", actual.getPriceActual(), expected);
		return myself;
	}


	public M_ShippingTransactionAssert isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_ShippingTransactionAssert isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasReceivedInfo(String expected)
	{
		isNotNull();
		String actualField = actual.getReceivedInfo();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ReceivedInfo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasReturnBPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getReturnBPartner_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ReturnBPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasReturnLocation_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getReturnLocation_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ReturnLocation_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasReturnUser_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getReturnUser_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ReturnUser_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasSalesRep_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getSalesRep_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SalesRep_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasShipDate(Object expected)
	{
		isNotNull();
		dateAssert("ShipDate", actual.getShipDate(), expected);
		return myself;
	}


	public M_ShippingTransactionAssert hasShipperAccount(String expected)
	{
		isNotNull();
		String actualField = actual.getShipperAccount();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ShipperAccount: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasShippingRespMessage(String expected)
	{
		isNotNull();
		String actualField = actual.getShippingRespMessage();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ShippingRespMessage: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasSurcharges(Object expected)
	{
		isNotNull();
		bdAssert("Surcharges", actual.getSurcharges(), expected);
		return myself;
	}


	public M_ShippingTransactionAssert hasTrackingInfo(String expected)
	{
		isNotNull();
		String actualField = actual.getTrackingInfo();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have TrackingInfo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasTrackingNo(String expected)
	{
		isNotNull();
		String actualField = actual.getTrackingNo();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have TrackingNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingTransactionAssert hasWeight(Object expected)
	{
		isNotNull();
		bdAssert("Weight", actual.getWeight(), expected);
		return myself;
	}


	public M_ShippingTransactionAssert hasWidth(Object expected)
	{
		isNotNull();
		bdAssert("Width", actual.getWidth(), expected);
		return myself;
	}

}