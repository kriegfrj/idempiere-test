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
import org.compiere.model.X_AD_Sequence;

/** Generated assertion class for AD_Sequence
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_SequenceAssert
	extends AbstractPOAssert<AD_SequenceAssert,X_AD_Sequence>
{

    /** Standard Constructor */
    public AD_SequenceAssert (X_AD_Sequence actual)
    {
      super (actual, AD_SequenceAssert.class);
    }


	public AD_SequenceAssert hasAD_Sequence_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Sequence_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Sequence_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_SequenceAssert hasAD_Sequence_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Sequence_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Sequence_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_SequenceAssert hasCurrentNext(int expected)
	{
		isNotNull();
		int actualField = actual.getCurrentNext();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CurrentNext: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_SequenceAssert hasCurrentNextSys(int expected)
	{
		isNotNull();
		int actualField = actual.getCurrentNextSys();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CurrentNextSys: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_SequenceAssert hasDateColumn(String expected)
	{
		isNotNull();
		String actualField = actual.getDateColumn();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DateColumn: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_SequenceAssert hasDecimalPattern(String expected)
	{
		isNotNull();
		String actualField = actual.getDecimalPattern();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DecimalPattern: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_SequenceAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_SequenceAssert hasIncrementNo(int expected)
	{
		isNotNull();
		int actualField = actual.getIncrementNo();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have IncrementNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_SequenceAssert isAudited()
	{
		isNotNull();
		if (!actual.isAudited()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Audited\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_SequenceAssert isNotAudited()
	{
		isNotNull();
		if (actual.isAudited()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Audited\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_SequenceAssert isAutoSequence()
	{
		isNotNull();
		if (!actual.isAutoSequence()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AutoSequence\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_SequenceAssert isNotAutoSequence()
	{
		isNotNull();
		if (actual.isAutoSequence()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AutoSequence\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_SequenceAssert isOrgLevelSequence()
	{
		isNotNull();
		if (!actual.isOrgLevelSequence()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OrgLevelSequence\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_SequenceAssert isNotOrgLevelSequence()
	{
		isNotNull();
		if (actual.isOrgLevelSequence()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OrgLevelSequence\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_SequenceAssert isTableID()
	{
		isNotNull();
		if (!actual.isTableID()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be TableID\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_SequenceAssert isNotTableID()
	{
		isNotNull();
		if (actual.isTableID()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be TableID\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_SequenceAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_SequenceAssert hasOrgColumn(String expected)
	{
		isNotNull();
		String actualField = actual.getOrgColumn();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have OrgColumn: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_SequenceAssert hasPrefix(String expected)
	{
		isNotNull();
		String actualField = actual.getPrefix();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Prefix: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_SequenceAssert isStartNewMonth()
	{
		isNotNull();
		if (!actual.isStartNewMonth()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be StartNewMonth\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_SequenceAssert isNotStartNewMonth()
	{
		isNotNull();
		if (actual.isStartNewMonth()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be StartNewMonth\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_SequenceAssert isStartNewYear()
	{
		isNotNull();
		if (!actual.isStartNewYear()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be StartNewYear\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_SequenceAssert isNotStartNewYear()
	{
		isNotNull();
		if (actual.isStartNewYear()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be StartNewYear\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_SequenceAssert hasStartNo(int expected)
	{
		isNotNull();
		int actualField = actual.getStartNo();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have StartNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_SequenceAssert hasSuffix(String expected)
	{
		isNotNull();
		String actualField = actual.getSuffix();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Suffix: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_SequenceAssert hasVFormat(String expected)
	{
		isNotNull();
		String actualField = actual.getVFormat();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have VFormat: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}