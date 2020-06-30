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
import org.compiere.model.X_T_Report;

/** Generated assertion class for T_Report
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class T_ReportAssert
	extends AbstractPOAssert<T_ReportAssert,X_T_Report>
{

    /** Standard Constructor */
    public T_ReportAssert (X_T_Report actual)
    {
      super (actual, T_ReportAssert.class);
    }


	public T_ReportAssert hasAD_PInstance_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PInstance_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_PInstance_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_ReportAssert hasCol_0(Object expected)
	{
		isNotNull();
		bdAssert("Col_0", actual.getCol_0(), expected);
		return myself;
	}


	public T_ReportAssert hasCol_1(Object expected)
	{
		isNotNull();
		bdAssert("Col_1", actual.getCol_1(), expected);
		return myself;
	}


	public T_ReportAssert hasCol_10(Object expected)
	{
		isNotNull();
		bdAssert("Col_10", actual.getCol_10(), expected);
		return myself;
	}


	public T_ReportAssert hasCol_11(Object expected)
	{
		isNotNull();
		bdAssert("Col_11", actual.getCol_11(), expected);
		return myself;
	}


	public T_ReportAssert hasCol_12(Object expected)
	{
		isNotNull();
		bdAssert("Col_12", actual.getCol_12(), expected);
		return myself;
	}


	public T_ReportAssert hasCol_13(Object expected)
	{
		isNotNull();
		bdAssert("Col_13", actual.getCol_13(), expected);
		return myself;
	}


	public T_ReportAssert hasCol_14(Object expected)
	{
		isNotNull();
		bdAssert("Col_14", actual.getCol_14(), expected);
		return myself;
	}


	public T_ReportAssert hasCol_15(Object expected)
	{
		isNotNull();
		bdAssert("Col_15", actual.getCol_15(), expected);
		return myself;
	}


	public T_ReportAssert hasCol_16(Object expected)
	{
		isNotNull();
		bdAssert("Col_16", actual.getCol_16(), expected);
		return myself;
	}


	public T_ReportAssert hasCol_17(Object expected)
	{
		isNotNull();
		bdAssert("Col_17", actual.getCol_17(), expected);
		return myself;
	}


	public T_ReportAssert hasCol_18(Object expected)
	{
		isNotNull();
		bdAssert("Col_18", actual.getCol_18(), expected);
		return myself;
	}


	public T_ReportAssert hasCol_19(Object expected)
	{
		isNotNull();
		bdAssert("Col_19", actual.getCol_19(), expected);
		return myself;
	}


	public T_ReportAssert hasCol_2(Object expected)
	{
		isNotNull();
		bdAssert("Col_2", actual.getCol_2(), expected);
		return myself;
	}


	public T_ReportAssert hasCol_20(Object expected)
	{
		isNotNull();
		bdAssert("Col_20", actual.getCol_20(), expected);
		return myself;
	}


	public T_ReportAssert hasCol_3(Object expected)
	{
		isNotNull();
		bdAssert("Col_3", actual.getCol_3(), expected);
		return myself;
	}


	public T_ReportAssert hasCol_4(Object expected)
	{
		isNotNull();
		bdAssert("Col_4", actual.getCol_4(), expected);
		return myself;
	}


	public T_ReportAssert hasCol_5(Object expected)
	{
		isNotNull();
		bdAssert("Col_5", actual.getCol_5(), expected);
		return myself;
	}


	public T_ReportAssert hasCol_6(Object expected)
	{
		isNotNull();
		bdAssert("Col_6", actual.getCol_6(), expected);
		return myself;
	}


	public T_ReportAssert hasCol_7(Object expected)
	{
		isNotNull();
		bdAssert("Col_7", actual.getCol_7(), expected);
		return myself;
	}


	public T_ReportAssert hasCol_8(Object expected)
	{
		isNotNull();
		bdAssert("Col_8", actual.getCol_8(), expected);
		return myself;
	}


	public T_ReportAssert hasCol_9(Object expected)
	{
		isNotNull();
		bdAssert("Col_9", actual.getCol_9(), expected);
		return myself;
	}


	public T_ReportAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_ReportAssert hasFact_Acct_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getFact_Acct_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Fact_Acct_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_ReportAssert hasLevelNo(int expected)
	{
		isNotNull();
		int actualField = actual.getLevelNo();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have LevelNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_ReportAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_ReportAssert hasPA_ReportLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPA_ReportLine_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PA_ReportLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_ReportAssert hasSeqNo(int expected)
	{
		isNotNull();
		int actualField = actual.getSeqNo();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SeqNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public T_ReportAssert hasT_Report_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getT_Report_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have T_Report_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}