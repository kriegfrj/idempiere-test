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
import org.compiere.model.X_PA_ReportLine;

/** Generated assertion class for PA_ReportLine
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class PA_ReportLineAssert
	extends AbstractPOAssert<PA_ReportLineAssert,X_PA_ReportLine>
{

    /** Standard Constructor */
    public PA_ReportLineAssert (X_PA_ReportLine actual)
    {
      super (actual, PA_ReportLineAssert.class);
    }


	public PA_ReportLineAssert hasCalculationType(String expected)
	{
		isNotNull();
		String actualField = actual.getCalculationType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CalculationType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportLineAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportLineAssert hasGL_Budget_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getGL_Budget_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have GL_Budget_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportLineAssert isInverseDebitCreditOnly()
	{
		isNotNull();
		if (!actual.isInverseDebitCreditOnly()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be InverseDebitCreditOnly\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportLineAssert isNotInverseDebitCreditOnly()
	{
		isNotNull();
		if (actual.isInverseDebitCreditOnly()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be InverseDebitCreditOnly\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportLineAssert isPrinted()
	{
		isNotNull();
		if (!actual.isPrinted()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Printed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportLineAssert isNotPrinted()
	{
		isNotNull();
		if (actual.isPrinted()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Printed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportLineAssert hasLineType(String expected)
	{
		isNotNull();
		String actualField = actual.getLineType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have LineType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportLineAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportLineAssert hasOper_1_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getOper_1_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Oper_1_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportLineAssert hasOper_2_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getOper_2_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Oper_2_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportLineAssert hasPA_ReportLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPA_ReportLine_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PA_ReportLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportLineAssert hasPA_ReportLine_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getPA_ReportLine_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PA_ReportLine_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportLineAssert hasPA_ReportLineSet_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPA_ReportLineSet_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PA_ReportLineSet_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportLineAssert hasPAAmountType(String expected)
	{
		isNotNull();
		String actualField = actual.getPAAmountType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PAAmountType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportLineAssert hasPAPeriodType(String expected)
	{
		isNotNull();
		String actualField = actual.getPAPeriodType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PAPeriodType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportLineAssert hasPostingType(String expected)
	{
		isNotNull();
		String actualField = actual.getPostingType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PostingType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportLineAssert hasSeqNo(int expected)
	{
		isNotNull();
		int actualField = actual.getSeqNo();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SeqNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}