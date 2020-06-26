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
import org.compiere.model.X_M_ShippingProcessorCfg;

/** Generated assertion class for M_ShippingProcessorCfg
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class M_ShippingProcessorCfgAssert
	extends AbstractPOAssert<M_ShippingProcessorCfgAssert,X_M_ShippingProcessorCfg>
{

    /** Standard Constructor */
    public M_ShippingProcessorCfgAssert (X_M_ShippingProcessorCfg actual)
    {
      super (actual, M_ShippingProcessorCfgAssert.class);
    }


	public M_ShippingProcessorCfgAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingProcessorCfgAssert hasHostAddress(String expected)
	{
		isNotNull();
		String actualField = actual.getHostAddress();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have HostAddress: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingProcessorCfgAssert hasHostPort(int expected)
	{
		isNotNull();
		int actualField = actual.getHostPort();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have HostPort: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingProcessorCfgAssert hasM_ShippingProcessorCfg_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_ShippingProcessorCfg_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_ShippingProcessorCfg_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingProcessorCfgAssert hasM_ShippingProcessorCfg_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getM_ShippingProcessorCfg_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_ShippingProcessorCfg_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingProcessorCfgAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingProcessorCfgAssert hasProxyAddress(String expected)
	{
		isNotNull();
		String actualField = actual.getProxyAddress();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ProxyAddress: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingProcessorCfgAssert hasProxyLogon(String expected)
	{
		isNotNull();
		String actualField = actual.getProxyLogon();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ProxyLogon: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingProcessorCfgAssert hasProxyPassword(String expected)
	{
		isNotNull();
		String actualField = actual.getProxyPassword();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ProxyPassword: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingProcessorCfgAssert hasProxyPort(int expected)
	{
		isNotNull();
		int actualField = actual.getProxyPort();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ProxyPort: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingProcessorCfgAssert hasServicePath(String expected)
	{
		isNotNull();
		String actualField = actual.getServicePath();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ServicePath: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ShippingProcessorCfgAssert hasShippingProcessorClass(String expected)
	{
		isNotNull();
		String actualField = actual.getShippingProcessorClass();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ShippingProcessorClass: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}