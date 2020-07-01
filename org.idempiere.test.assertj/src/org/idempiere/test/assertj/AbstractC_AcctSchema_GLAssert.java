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
import org.compiere.model.X_C_AcctSchema_GL;

/** Generated assertion class for C_AcctSchema_GL
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractC_AcctSchema_GLAssert<SELF extends AbstractC_AcctSchema_GLAssert<SELF, ACTUAL>, ACTUAL extends X_C_AcctSchema_GL>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractC_AcctSchema_GLAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasC_AcctSchema_GL_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_AcctSchema_GL_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_AcctSchema_GL_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_AcctSchema_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_AcctSchema_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_AcctSchema_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasCommitmentOffset_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getCommitmentOffset_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CommitmentOffset_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasCommitmentOffsetSales_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getCommitmentOffsetSales_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CommitmentOffsetSales_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasCurrencyBalancing_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getCurrencyBalancing_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CurrencyBalancing_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasIntercompanyDueFrom_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getIntercompanyDueFrom_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have IntercompanyDueFrom_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasIntercompanyDueTo_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getIntercompanyDueTo_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have IntercompanyDueTo_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPPVOffset_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getPPVOffset_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PPVOffset_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasSuspenseBalancing_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getSuspenseBalancing_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have SuspenseBalancing_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isUseCurrencyBalancing()
	{
		isNotNull();
		if (!actual.isUseCurrencyBalancing()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be UseCurrencyBalancing\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotUseCurrencyBalancing()
	{
		isNotNull();
		if (actual.isUseCurrencyBalancing()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be UseCurrencyBalancing\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isUseSuspenseBalancing()
	{
		isNotNull();
		if (!actual.isUseSuspenseBalancing()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be UseSuspenseBalancing\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotUseSuspenseBalancing()
	{
		isNotNull();
		if (actual.isUseSuspenseBalancing()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be UseSuspenseBalancing\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isUseSuspenseError()
	{
		isNotNull();
		if (!actual.isUseSuspenseError()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be UseSuspenseError\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotUseSuspenseError()
	{
		isNotNull();
		if (actual.isUseSuspenseError()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be UseSuspenseError\nbut it was",
				getPODescription());
		}
		return myself;
	}
}