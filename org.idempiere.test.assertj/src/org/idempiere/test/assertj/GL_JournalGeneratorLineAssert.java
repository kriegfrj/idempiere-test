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
import org.compiere.model.X_GL_JournalGeneratorLine;

/** Generated assertion class for GL_JournalGeneratorLine
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class GL_JournalGeneratorLineAssert
	extends AbstractPOAssert<GL_JournalGeneratorLineAssert,X_GL_JournalGeneratorLine>
{

    /** Standard Constructor */
    public GL_JournalGeneratorLineAssert (X_GL_JournalGeneratorLine actual)
    {
      super (actual, GL_JournalGeneratorLineAssert.class);
    }


	public GL_JournalGeneratorLineAssert hasAmtMultiplier(Object expected)
	{
		isNotNull();
		bdAssert("AmtMultiplier", actual.getAmtMultiplier(), expected);
		return myself;
	}


	public GL_JournalGeneratorLineAssert hasBPColumn(String expected)
	{
		isNotNull();
		String actualField = actual.getBPColumn();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have BPColumn: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalGeneratorLineAssert hasBPDimensionType(String expected)
	{
		isNotNull();
		String actualField = actual.getBPDimensionType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have BPDimensionType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalGeneratorLineAssert hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalGeneratorLineAssert hasC_ElementValueCR_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ElementValueCR_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_ElementValueCR_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalGeneratorLineAssert hasC_ElementValueDR_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ElementValueDR_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_ElementValueDR_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalGeneratorLineAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalGeneratorLineAssert hasGL_JournalGenerator_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getGL_JournalGenerator_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have GL_JournalGenerator_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalGeneratorLineAssert hasGL_JournalGeneratorLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getGL_JournalGeneratorLine_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have GL_JournalGeneratorLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalGeneratorLineAssert hasGL_JournalGeneratorLine_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getGL_JournalGeneratorLine_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have GL_JournalGeneratorLine_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalGeneratorLineAssert hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalGeneratorLineAssert isCopyAllDimensions()
	{
		isNotNull();
		if (!actual.isCopyAllDimensions()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CopyAllDimensions\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public GL_JournalGeneratorLineAssert isNotCopyAllDimensions()
	{
		isNotNull();
		if (actual.isCopyAllDimensions()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CopyAllDimensions\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public GL_JournalGeneratorLineAssert isSameProduct()
	{
		isNotNull();
		if (!actual.isSameProduct()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SameProduct\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public GL_JournalGeneratorLineAssert isNotSameProduct()
	{
		isNotNull();
		if (actual.isSameProduct()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SameProduct\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public GL_JournalGeneratorLineAssert hasRoundFactor(int expected)
	{
		isNotNull();
		int actualField = actual.getRoundFactor();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have RoundFactor: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public GL_JournalGeneratorLineAssert hasSeqNo(int expected)
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