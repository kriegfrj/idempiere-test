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
import org.compiere.model.X_M_ShipperCfg;

/** Generated assertion class for M_ShipperCfg
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractM_ShipperCfgAssert<SELF extends AbstractM_ShipperCfgAssert<SELF, ACTUAL>, ACTUAL extends X_M_ShipperCfg>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractM_ShipperCfgAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
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

	public SELF isInternational()
	{
		isNotNull();
		if (!actual.isInternational()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be International\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotInternational()
	{
		isNotNull();
		if (actual.isInternational()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be International\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isOnline()
	{
		isNotNull();
		if (!actual.isOnline()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Online\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotOnline()
	{
		isNotNull();
		if (actual.isOnline()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Online\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isResidential()
	{
		isNotNull();
		if (!actual.isResidential()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Residential\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotResidential()
	{
		isNotNull();
		if (actual.isResidential()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Residential\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSaturdayDelivery()
	{
		isNotNull();
		if (!actual.isSaturdayDelivery()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SaturdayDelivery\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSaturdayDelivery()
	{
		isNotNull();
		if (actual.isSaturdayDelivery()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SaturdayDelivery\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasM_ShipperCfg_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_ShipperCfg_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_ShipperCfg_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_ShipperCfg_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getM_ShipperCfg_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_ShipperCfg_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_ShippingProcessorCfg_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_ShippingProcessorCfg_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_ShippingProcessorCfg_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasShippingServiceCode(String expected)
	{
		isNotNull();
		String actualField = actual.getShippingServiceCode();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ShippingServiceCode: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasTrackingURL(String expected)
	{
		isNotNull();
		String actualField = actual.getTrackingURL();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have TrackingURL: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}