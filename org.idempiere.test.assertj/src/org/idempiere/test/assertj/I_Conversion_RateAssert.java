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
import org.compiere.model.X_I_Conversion_Rate;

/** Generated assertion class for I_Conversion_Rate
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class I_Conversion_RateAssert
	extends AbstractPOAssert<I_Conversion_RateAssert,X_I_Conversion_Rate>
{

    /** Standard Constructor */
    public I_Conversion_RateAssert (X_I_Conversion_Rate actual)
    {
      super (actual, I_Conversion_RateAssert.class);
    }


	public I_Conversion_RateAssert hasC_Conversion_Rate_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Conversion_Rate_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Conversion_Rate_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_Conversion_RateAssert hasC_ConversionType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ConversionType_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_ConversionType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_Conversion_RateAssert hasC_Currency_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Currency_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Currency_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_Conversion_RateAssert hasC_Currency_ID_To(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Currency_ID_To();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Currency_ID_To: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_Conversion_RateAssert hasConversionTypeValue(String expected)
	{
		isNotNull();
		String actualField = actual.getConversionTypeValue();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ConversionTypeValue: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_Conversion_RateAssert isCreateReciprocalRate()
	{
		isNotNull();
		if (!actual.isCreateReciprocalRate()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CreateReciprocalRate\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public I_Conversion_RateAssert isNotCreateReciprocalRate()
	{
		isNotNull();
		if (actual.isCreateReciprocalRate()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CreateReciprocalRate\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public I_Conversion_RateAssert hasDivideRate(Object expected)
	{
		isNotNull();
		bdAssert("DivideRate", actual.getDivideRate(), expected);
		return myself;
	}


	public I_Conversion_RateAssert hasI_Conversion_Rate_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getI_Conversion_Rate_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have I_Conversion_Rate_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_Conversion_RateAssert hasI_Conversion_Rate_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getI_Conversion_Rate_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have I_Conversion_Rate_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_Conversion_RateAssert hasI_ErrorMsg(String expected)
	{
		isNotNull();
		String actualField = actual.getI_ErrorMsg();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have I_ErrorMsg: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_Conversion_RateAssert isI_IsImported()
	{
		isNotNull();
		if (!actual.isI_IsImported()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be I_IsImported\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public I_Conversion_RateAssert isNotI_IsImported()
	{
		isNotNull();
		if (actual.isI_IsImported()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be I_IsImported\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public I_Conversion_RateAssert hasISO_Code(String expected)
	{
		isNotNull();
		String actualField = actual.getISO_Code();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ISO_Code: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_Conversion_RateAssert hasISO_Code_To(String expected)
	{
		isNotNull();
		String actualField = actual.getISO_Code_To();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ISO_Code_To: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public I_Conversion_RateAssert hasMultiplyRate(Object expected)
	{
		isNotNull();
		bdAssert("MultiplyRate", actual.getMultiplyRate(), expected);
		return myself;
	}


	public I_Conversion_RateAssert isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public I_Conversion_RateAssert isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public I_Conversion_RateAssert hasValidFrom(Object expected)
	{
		isNotNull();
		dateAssert("ValidFrom", actual.getValidFrom(), expected);
		return myself;
	}


	public I_Conversion_RateAssert hasValidTo(Object expected)
	{
		isNotNull();
		dateAssert("ValidTo", actual.getValidTo(), expected);
		return myself;
	}

}