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
import org.compiere.model.X_M_PackageMPS;

/** Generated assertion class for M_PackageMPS
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class M_PackageMPSAssert
	extends AbstractPOAssert<M_PackageMPSAssert,X_M_PackageMPS>
{

    /** Standard Constructor */
    public M_PackageMPSAssert (X_M_PackageMPS actual)
    {
      super (actual, M_PackageMPSAssert.class);
    }


	public M_PackageMPSAssert hasC_UOM_Length_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_UOM_Length_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_UOM_Length_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageMPSAssert hasC_UOM_Weight_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_UOM_Weight_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_UOM_Weight_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageMPSAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageMPSAssert hasEstimatedWeight(Object expected)
	{
		isNotNull();
		bdAssert("EstimatedWeight", actual.getEstimatedWeight(), expected);
		return myself;
	}


	public M_PackageMPSAssert hasHeight(Object expected)
	{
		isNotNull();
		bdAssert("Height", actual.getHeight(), expected);
		return myself;
	}


	public M_PackageMPSAssert hasLength(Object expected)
	{
		isNotNull();
		bdAssert("Length", actual.getLength(), expected);
		return myself;
	}


	public M_PackageMPSAssert hasM_Package_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Package_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Package_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageMPSAssert hasM_PackageMPS_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_PackageMPS_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_PackageMPS_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageMPSAssert hasM_PackageMPS_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getM_PackageMPS_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_PackageMPS_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageMPSAssert hasMasterTrackingNo(String expected)
	{
		isNotNull();
		String actualField = actual.getMasterTrackingNo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have MasterTrackingNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageMPSAssert hasPrice(Object expected)
	{
		isNotNull();
		bdAssert("Price", actual.getPrice(), expected);
		return myself;
	}


	public M_PackageMPSAssert isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_PackageMPSAssert isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_PackageMPSAssert hasSeqNo(int expected)
	{
		isNotNull();
		int actualField = actual.getSeqNo();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have SeqNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageMPSAssert hasTrackingNo(String expected)
	{
		isNotNull();
		String actualField = actual.getTrackingNo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have TrackingNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PackageMPSAssert hasWeight(Object expected)
	{
		isNotNull();
		bdAssert("Weight", actual.getWeight(), expected);
		return myself;
	}


	public M_PackageMPSAssert hasWidth(Object expected)
	{
		isNotNull();
		bdAssert("Width", actual.getWidth(), expected);
		return myself;
	}

}