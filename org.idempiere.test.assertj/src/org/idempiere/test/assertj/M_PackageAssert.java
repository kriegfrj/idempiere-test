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
import org.compiere.model.X_M_Package;

/** Generated assertion class for M_Package
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class M_PackageAssert
	extends AbstractPOAssert<M_PackageAssert,X_M_Package>
{

    /** Standard Constructor */
    public M_PackageAssert (X_M_Package actual)
    {
      super (actual, M_PackageAssert.class);
    }


	public M_PackageAssert hasBoxCount(int expected)
	{
		isNotNull();
		int actualField = actual.getBoxCount();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have BoxCount: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageAssert hasC_BP_ShippingAcct_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BP_ShippingAcct_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BP_ShippingAcct_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageAssert hasC_BPartner_Location_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_Location_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BPartner_Location_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageAssert hasC_Currency_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Currency_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Currency_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageAssert hasC_UOM_Length_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_UOM_Length_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_UOM_Length_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageAssert hasC_UOM_Weight_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_UOM_Weight_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_UOM_Weight_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageAssert isCashOnDelivery()
	{
		isNotNull();
		if (!actual.isCashOnDelivery()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CashOnDelivery\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_PackageAssert isNotCashOnDelivery()
	{
		isNotNull();
		if (actual.isCashOnDelivery()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CashOnDelivery\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_PackageAssert hasDateReceived(Object expected)
	{
		isNotNull();
		dateAssert("DateReceived", actual.getDateReceived(), expected);
		return myself;
	}


	public M_PackageAssert isDeliveryConfirmation()
	{
		isNotNull();
		if (!actual.isDeliveryConfirmation()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DeliveryConfirmation\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_PackageAssert isNotDeliveryConfirmation()
	{
		isNotNull();
		if (actual.isDeliveryConfirmation()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DeliveryConfirmation\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_PackageAssert hasDeliveryConfirmationType(String expected)
	{
		isNotNull();
		String actualField = actual.getDeliveryConfirmationType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DeliveryConfirmationType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageAssert hasDocumentNo(String expected)
	{
		isNotNull();
		String actualField = actual.getDocumentNo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DocumentNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageAssert hasDotHazardClassOrDivision(String expected)
	{
		isNotNull();
		String actualField = actual.getDotHazardClassOrDivision();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DotHazardClassOrDivision: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageAssert hasDryIceWeight(Object expected)
	{
		isNotNull();
		bdAssert("DryIceWeight", actual.getDryIceWeight(), expected);
		return myself;
	}


	public M_PackageAssert hasDutiesShipperAccount(String expected)
	{
		isNotNull();
		String actualField = actual.getDutiesShipperAccount();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DutiesShipperAccount: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageAssert hasEstimatedWeight(Object expected)
	{
		isNotNull();
		bdAssert("EstimatedWeight", actual.getEstimatedWeight(), expected);
		return myself;
	}


	public M_PackageAssert hasFOB(String expected)
	{
		isNotNull();
		String actualField = actual.getFOB();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have FOB: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageAssert hasFreightCharges(String expected)
	{
		isNotNull();
		String actualField = actual.getFreightCharges();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have FreightCharges: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageAssert hasHandlingCharge(Object expected)
	{
		isNotNull();
		bdAssert("HandlingCharge", actual.getHandlingCharge(), expected);
		return myself;
	}


	public M_PackageAssert hasHeight(Object expected)
	{
		isNotNull();
		bdAssert("Height", actual.getHeight(), expected);
		return myself;
	}


	public M_PackageAssert hasHoldAddress_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getHoldAddress_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have HoldAddress_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageAssert hasHomeDeliveryPremiumDate(Object expected)
	{
		isNotNull();
		dateAssert("HomeDeliveryPremiumDate", actual.getHomeDeliveryPremiumDate(), expected);
		return myself;
	}


	public M_PackageAssert hasHomeDeliveryPremiumPhone(String expected)
	{
		isNotNull();
		String actualField = actual.getHomeDeliveryPremiumPhone();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have HomeDeliveryPremiumPhone: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageAssert hasHomeDeliveryPremiumType(String expected)
	{
		isNotNull();
		String actualField = actual.getHomeDeliveryPremiumType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have HomeDeliveryPremiumType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageAssert hasInsurance(String expected)
	{
		isNotNull();
		String actualField = actual.getInsurance();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Insurance: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageAssert hasInsuredAmount(Object expected)
	{
		isNotNull();
		bdAssert("InsuredAmount", actual.getInsuredAmount(), expected);
		return myself;
	}


	public M_PackageAssert isAccessible()
	{
		isNotNull();
		if (!actual.isAccessible()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Accessible\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_PackageAssert isNotAccessible()
	{
		isNotNull();
		if (actual.isAccessible()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Accessible\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_PackageAssert isAddedHandling()
	{
		isNotNull();
		if (!actual.isAddedHandling()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AddedHandling\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_PackageAssert isNotAddedHandling()
	{
		isNotNull();
		if (actual.isAddedHandling()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AddedHandling\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_PackageAssert isCargoAircraftOnly()
	{
		isNotNull();
		if (!actual.isCargoAircraftOnly()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CargoAircraftOnly\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_PackageAssert isNotCargoAircraftOnly()
	{
		isNotNull();
		if (actual.isCargoAircraftOnly()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CargoAircraftOnly\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_PackageAssert isDryIce()
	{
		isNotNull();
		if (!actual.isDryIce()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DryIce\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_PackageAssert isNotDryIce()
	{
		isNotNull();
		if (actual.isDryIce()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DryIce\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_PackageAssert isDutiable()
	{
		isNotNull();
		if (!actual.isDutiable()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Dutiable\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_PackageAssert isNotDutiable()
	{
		isNotNull();
		if (actual.isDutiable()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Dutiable\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_PackageAssert isFutureDayShipment()
	{
		isNotNull();
		if (!actual.isFutureDayShipment()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be FutureDayShipment\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_PackageAssert isNotFutureDayShipment()
	{
		isNotNull();
		if (actual.isFutureDayShipment()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be FutureDayShipment\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_PackageAssert isHazMat()
	{
		isNotNull();
		if (!actual.isHazMat()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be HazMat\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_PackageAssert isNotHazMat()
	{
		isNotNull();
		if (actual.isHazMat()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be HazMat\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_PackageAssert isHoldAtLocation()
	{
		isNotNull();
		if (!actual.isHoldAtLocation()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be HoldAtLocation\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_PackageAssert isNotHoldAtLocation()
	{
		isNotNull();
		if (actual.isHoldAtLocation()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be HoldAtLocation\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_PackageAssert isIgnoreZipNotFound()
	{
		isNotNull();
		if (!actual.isIgnoreZipNotFound()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IgnoreZipNotFound\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_PackageAssert isNotIgnoreZipNotFound()
	{
		isNotNull();
		if (actual.isIgnoreZipNotFound()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IgnoreZipNotFound\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_PackageAssert isIgnoreZipStateNotMatch()
	{
		isNotNull();
		if (!actual.isIgnoreZipStateNotMatch()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IgnoreZipStateNotMatch\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_PackageAssert isNotIgnoreZipStateNotMatch()
	{
		isNotNull();
		if (actual.isIgnoreZipStateNotMatch()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IgnoreZipStateNotMatch\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_PackageAssert isResidential()
	{
		isNotNull();
		if (!actual.isResidential()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Residential\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_PackageAssert isNotResidential()
	{
		isNotNull();
		if (actual.isResidential()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Residential\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_PackageAssert isSaturdayDelivery()
	{
		isNotNull();
		if (!actual.isSaturdayDelivery()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SaturdayDelivery\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_PackageAssert isNotSaturdayDelivery()
	{
		isNotNull();
		if (actual.isSaturdayDelivery()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SaturdayDelivery\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_PackageAssert isSaturdayPickup()
	{
		isNotNull();
		if (!actual.isSaturdayPickup()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SaturdayPickup\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_PackageAssert isNotSaturdayPickup()
	{
		isNotNull();
		if (actual.isSaturdayPickup()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SaturdayPickup\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_PackageAssert isVerbalConfirmation()
	{
		isNotNull();
		if (!actual.isVerbalConfirmation()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be VerbalConfirmation\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_PackageAssert isNotVerbalConfirmation()
	{
		isNotNull();
		if (actual.isVerbalConfirmation()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be VerbalConfirmation\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_PackageAssert hasLatestPickupTime(Object expected)
	{
		isNotNull();
		dateAssert("LatestPickupTime", actual.getLatestPickupTime(), expected);
		return myself;
	}


	public M_PackageAssert hasLength(Object expected)
	{
		isNotNull();
		bdAssert("Length", actual.getLength(), expected);
		return myself;
	}


	public M_PackageAssert hasM_InOut_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_InOut_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_InOut_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageAssert hasM_Package_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Package_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Package_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageAssert hasM_Package_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getM_Package_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Package_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageAssert hasM_Shipper_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Shipper_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Shipper_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageAssert hasM_ShipperLabels_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_ShipperLabels_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_ShipperLabels_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageAssert hasM_ShipperPackaging_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_ShipperPackaging_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_ShipperPackaging_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageAssert hasM_ShipperPickupTypes_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_ShipperPickupTypes_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_ShipperPickupTypes_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageAssert hasM_ShippingProcessor_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_ShippingProcessor_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_ShippingProcessor_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageAssert hasNotificationMessage(String expected)
	{
		isNotNull();
		String actualField = actual.getNotificationMessage();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have NotificationMessage: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageAssert hasNotificationType(String expected)
	{
		isNotNull();
		String actualField = actual.getNotificationType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have NotificationType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageAssert hasPaymentRule(String expected)
	{
		isNotNull();
		String actualField = actual.getPaymentRule();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PaymentRule: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageAssert hasPrice(Object expected)
	{
		isNotNull();
		bdAssert("Price", actual.getPrice(), expected);
		return myself;
	}


	public M_PackageAssert hasPriceActual(Object expected)
	{
		isNotNull();
		bdAssert("PriceActual", actual.getPriceActual(), expected);
		return myself;
	}


	public M_PackageAssert isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_PackageAssert isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_PackageAssert hasRateInquiryMessage(String expected)
	{
		isNotNull();
		String actualField = actual.getRateInquiryMessage();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have RateInquiryMessage: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageAssert hasReceivedInfo(String expected)
	{
		isNotNull();
		String actualField = actual.getReceivedInfo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ReceivedInfo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageAssert hasShipDate(Object expected)
	{
		isNotNull();
		dateAssert("ShipDate", actual.getShipDate(), expected);
		return myself;
	}


	public M_PackageAssert hasShipperAccount(String expected)
	{
		isNotNull();
		String actualField = actual.getShipperAccount();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ShipperAccount: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageAssert hasShippingRespMessage(String expected)
	{
		isNotNull();
		String actualField = actual.getShippingRespMessage();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ShippingRespMessage: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageAssert hasSurcharges(Object expected)
	{
		isNotNull();
		bdAssert("Surcharges", actual.getSurcharges(), expected);
		return myself;
	}


	public M_PackageAssert hasTotalPrice(Object expected)
	{
		isNotNull();
		bdAssert("TotalPrice", actual.getTotalPrice(), expected);
		return myself;
	}


	public M_PackageAssert hasTrackingInfo(String expected)
	{
		isNotNull();
		String actualField = actual.getTrackingInfo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have TrackingInfo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageAssert hasTrackingNo(String expected)
	{
		isNotNull();
		String actualField = actual.getTrackingNo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have TrackingNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageAssert hasWeight(Object expected)
	{
		isNotNull();
		bdAssert("Weight", actual.getWeight(), expected);
		return myself;
	}


	public M_PackageAssert hasWidth(Object expected)
	{
		isNotNull();
		bdAssert("Width", actual.getWidth(), expected);
		return myself;
	}

}