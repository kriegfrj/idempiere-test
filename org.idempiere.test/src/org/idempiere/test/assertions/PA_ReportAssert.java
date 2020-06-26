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
import org.compiere.model.X_PA_Report;

/** Generated assertion class for PA_Report
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class PA_ReportAssert
	extends AbstractPOAssert<PA_ReportAssert,X_PA_Report>
{

    /** Standard Constructor */
    public PA_ReportAssert (X_PA_Report actual)
    {
      super (actual, PA_ReportAssert.class);
    }


	public PA_ReportAssert hasAD_PrintFormat_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PrintFormat_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_PrintFormat_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportAssert hasC_AcctSchema_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_AcctSchema_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_AcctSchema_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportAssert hasC_Calendar_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Calendar_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_Calendar_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportAssert hasJasperProcess_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getJasperProcess_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have JasperProcess_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportAssert isListSources()
	{
		isNotNull();
		if (!actual.isListSources()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ListSources\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportAssert isNotListSources()
	{
		isNotNull();
		if (actual.isListSources()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ListSources\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportAssert isListSourcesXTrx()
	{
		isNotNull();
		if (!actual.isListSourcesXTrx()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ListSourcesXTrx\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportAssert isNotListSourcesXTrx()
	{
		isNotNull();
		if (actual.isListSourcesXTrx()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ListSourcesXTrx\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportAssert isListTrx()
	{
		isNotNull();
		if (!actual.isListTrx()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ListTrx\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportAssert isNotListTrx()
	{
		isNotNull();
		if (actual.isListTrx()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ListTrx\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public PA_ReportAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportAssert hasPA_Report_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPA_Report_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PA_Report_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportAssert hasPA_Report_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getPA_Report_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PA_Report_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportAssert hasPA_ReportColumnSet_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPA_ReportColumnSet_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PA_ReportColumnSet_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportAssert hasPA_ReportCube_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPA_ReportCube_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PA_ReportCube_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public PA_ReportAssert hasPA_ReportLineSet_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPA_ReportLineSet_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PA_ReportLineSet_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}