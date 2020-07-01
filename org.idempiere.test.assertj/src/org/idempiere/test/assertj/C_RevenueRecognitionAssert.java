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
import org.compiere.model.X_C_RevenueRecognition;

/** Generated assertion class for C_RevenueRecognition
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_RevenueRecognitionAssert
	extends AbstractPOAssert<C_RevenueRecognitionAssert,X_C_RevenueRecognition>
{

    /** Standard Constructor */
    public C_RevenueRecognitionAssert (X_C_RevenueRecognition actual)
    {
      super (actual, C_RevenueRecognitionAssert.class);
    }


	public C_RevenueRecognitionAssert hasC_RevenueRecognition_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_RevenueRecognition_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_RevenueRecognition_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RevenueRecognitionAssert hasC_RevenueRecognition_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_RevenueRecognition_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_RevenueRecognition_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RevenueRecognitionAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RevenueRecognitionAssert hasFixedRecogDay(int expected)
	{
		isNotNull();
		int actualField = actual.getFixedRecogDay();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have FixedRecogDay: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RevenueRecognitionAssert isTimeBased()
	{
		isNotNull();
		if (!actual.isTimeBased()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be TimeBased\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_RevenueRecognitionAssert isNotTimeBased()
	{
		isNotNull();
		if (actual.isTimeBased()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be TimeBased\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_RevenueRecognitionAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RevenueRecognitionAssert hasNoMonths(int expected)
	{
		isNotNull();
		int actualField = actual.getNoMonths();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have NoMonths: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_RevenueRecognitionAssert hasRecognitionFrequency(String expected)
	{
		isNotNull();
		String actualField = actual.getRecognitionFrequency();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have RecognitionFrequency: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}