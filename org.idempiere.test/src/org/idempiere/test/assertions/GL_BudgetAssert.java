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
import org.compiere.model.X_GL_Budget;

/** Generated assertion class for GL_Budget
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class GL_BudgetAssert
	extends AbstractPOAssert<GL_BudgetAssert,X_GL_Budget>
{

    /** Standard Constructor */
    public GL_BudgetAssert (X_GL_Budget actual)
    {
      super (actual, GL_BudgetAssert.class);
    }


	public GL_BudgetAssert hasBudgetStatus(String expected)
	{
		isNotNull();
		String actualField = actual.getBudgetStatus();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have BudgetStatus: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_BudgetAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_BudgetAssert hasGL_Budget_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getGL_Budget_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have GL_Budget_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_BudgetAssert hasGL_Budget_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getGL_Budget_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have GL_Budget_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_BudgetAssert isPrimary()
	{
		isNotNull();
		if (!actual.isPrimary()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Primary\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public GL_BudgetAssert isNotPrimary()
	{
		isNotNull();
		if (actual.isPrimary()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Primary\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public GL_BudgetAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}