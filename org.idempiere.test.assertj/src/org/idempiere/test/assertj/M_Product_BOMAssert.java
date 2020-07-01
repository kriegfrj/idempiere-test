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
import org.compiere.model.X_M_Product_BOM;

/** Generated assertion class for M_Product_BOM
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class M_Product_BOMAssert
	extends AbstractPOAssert<M_Product_BOMAssert,X_M_Product_BOM>
{

    /** Standard Constructor */
    public M_Product_BOMAssert (X_M_Product_BOM actual)
    {
      super (actual, M_Product_BOMAssert.class);
    }


	public M_Product_BOMAssert hasBOMQty(Object expected)
	{
		isNotNull();
		bdAssert("BOMQty", actual.getBOMQty(), expected);
		return myself;
	}


	public M_Product_BOMAssert hasBOMType(String expected)
	{
		isNotNull();
		String actualField = actual.getBOMType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have BOMType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_Product_BOMAssert hasCostStandard(Object expected)
	{
		isNotNull();
		bdAssert("CostStandard", actual.getCostStandard(), expected);
		return myself;
	}


	public M_Product_BOMAssert hasCostStandardCumAmt(Object expected)
	{
		isNotNull();
		bdAssert("CostStandardCumAmt", actual.getCostStandardCumAmt(), expected);
		return myself;
	}


	public M_Product_BOMAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_Product_BOMAssert isBillOfMaterial()
	{
		isNotNull();
		if (!actual.isBillOfMaterial()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be BillOfMaterial\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_Product_BOMAssert isNotBillOfMaterial()
	{
		isNotNull();
		if (actual.isBillOfMaterial()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be BillOfMaterial\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_Product_BOMAssert hasLine(int expected)
	{
		isNotNull();
		int actualField = actual.getLine();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Line: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_Product_BOMAssert hasM_PartType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_PartType_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_PartType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_Product_BOMAssert hasM_Product_BOM_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_BOM_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Product_BOM_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_Product_BOMAssert hasM_Product_BOM_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getM_Product_BOM_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Product_BOM_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_Product_BOMAssert hasM_Product_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Product_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_Product_BOMAssert hasM_ProductBOM_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_ProductBOM_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_ProductBOM_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_Product_BOMAssert hasValue(String expected)
	{
		isNotNull();
		String actualField = actual.getValue();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Value: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}