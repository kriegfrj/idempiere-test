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
import org.compiere.model.X_AD_Registration;

/** Generated assertion class for AD_Registration
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_RegistrationAssert
	extends AbstractPOAssert<AD_RegistrationAssert,X_AD_Registration>
{

    /** Standard Constructor */
    public AD_RegistrationAssert (X_AD_Registration actual)
    {
      super (actual, AD_RegistrationAssert.class);
    }


	public AD_RegistrationAssert hasAD_Registration_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Registration_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Registration_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_RegistrationAssert hasAD_Registration_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Registration_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Registration_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_RegistrationAssert hasAD_System_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_System_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_System_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_RegistrationAssert hasC_Currency_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Currency_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Currency_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_RegistrationAssert hasC_Location_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Location_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Location_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_RegistrationAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_RegistrationAssert hasIndustryInfo(String expected)
	{
		isNotNull();
		String actualField = actual.getIndustryInfo();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have IndustryInfo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_RegistrationAssert isAllowPublish()
	{
		isNotNull();
		if (!actual.isAllowPublish()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AllowPublish\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_RegistrationAssert isNotAllowPublish()
	{
		isNotNull();
		if (actual.isAllowPublish()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AllowPublish\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_RegistrationAssert isAllowStatistics()
	{
		isNotNull();
		if (!actual.isAllowStatistics()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AllowStatistics\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_RegistrationAssert isNotAllowStatistics()
	{
		isNotNull();
		if (actual.isAllowStatistics()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AllowStatistics\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_RegistrationAssert isInProduction()
	{
		isNotNull();
		if (!actual.isInProduction()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be InProduction\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_RegistrationAssert isNotInProduction()
	{
		isNotNull();
		if (actual.isInProduction()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be InProduction\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_RegistrationAssert isRegistered()
	{
		isNotNull();
		if (!actual.isRegistered()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Registered\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_RegistrationAssert isNotRegistered()
	{
		isNotNull();
		if (actual.isRegistered()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Registered\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_RegistrationAssert hasNumberEmployees(int expected)
	{
		isNotNull();
		int actualField = actual.getNumberEmployees();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have NumberEmployees: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_RegistrationAssert hasPlatformInfo(String expected)
	{
		isNotNull();
		String actualField = actual.getPlatformInfo();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PlatformInfo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_RegistrationAssert hasRecord_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getRecord_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Record_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_RegistrationAssert hasRemote_Addr(String expected)
	{
		isNotNull();
		String actualField = actual.getRemote_Addr();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Remote_Addr: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_RegistrationAssert hasRemote_Host(String expected)
	{
		isNotNull();
		String actualField = actual.getRemote_Host();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Remote_Host: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_RegistrationAssert hasSalesVolume(int expected)
	{
		isNotNull();
		int actualField = actual.getSalesVolume();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SalesVolume: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_RegistrationAssert hasStartProductionDate(Object expected)
	{
		isNotNull();
		dateAssert("StartProductionDate", actual.getStartProductionDate(), expected);
		return myself;
	}

}