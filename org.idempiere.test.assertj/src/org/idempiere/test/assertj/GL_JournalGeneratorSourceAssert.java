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
import org.compiere.model.X_GL_JournalGeneratorSource;

/** Generated assertion class for GL_JournalGeneratorSource
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class GL_JournalGeneratorSourceAssert
	extends AbstractPOAssert<GL_JournalGeneratorSourceAssert,X_GL_JournalGeneratorSource>
{

    /** Standard Constructor */
    public GL_JournalGeneratorSourceAssert (X_GL_JournalGeneratorSource actual)
    {
      super (actual, GL_JournalGeneratorSourceAssert.class);
    }


	public GL_JournalGeneratorSourceAssert hasAmtMultiplier(Object expected)
	{
		isNotNull();
		bdAssert("AmtMultiplier", actual.getAmtMultiplier(), expected);
		return myself;
	}


	public GL_JournalGeneratorSourceAssert hasC_ElementValue_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ElementValue_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_ElementValue_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalGeneratorSourceAssert hasGL_Category_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getGL_Category_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have GL_Category_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalGeneratorSourceAssert hasGL_JournalGeneratorLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getGL_JournalGeneratorLine_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have GL_JournalGeneratorLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalGeneratorSourceAssert hasGL_JournalGeneratorSource_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getGL_JournalGeneratorSource_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have GL_JournalGeneratorSource_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalGeneratorSourceAssert hasGL_JournalGeneratorSource_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getGL_JournalGeneratorSource_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have GL_JournalGeneratorSource_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalGeneratorSourceAssert hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalGeneratorSourceAssert hasRoundFactor(int expected)
	{
		isNotNull();
		int actualField = actual.getRoundFactor();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have RoundFactor: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}