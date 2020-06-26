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
import org.compiere.model.X_AD_PasswordRule;

/** Generated assertion class for AD_PasswordRule
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_PasswordRuleAssert
	extends AbstractPOAssert<AD_PasswordRuleAssert,X_AD_PasswordRule>
{

    /** Standard Constructor */
    public AD_PasswordRuleAssert (X_AD_PasswordRule actual)
    {
      super (actual, AD_PasswordRuleAssert.class);
    }


	public AD_PasswordRuleAssert hasAD_PasswordRule_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PasswordRule_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_PasswordRule_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PasswordRuleAssert hasAD_PasswordRule_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_PasswordRule_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_PasswordRule_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PasswordRuleAssert hasAlphabeticalCharacter(int expected)
	{
		isNotNull();
		int actualField = actual.getAlphabeticalCharacter();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AlphabeticalCharacter: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PasswordRuleAssert hasAlphabeticalSequence(int expected)
	{
		isNotNull();
		int actualField = actual.getAlphabeticalSequence();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AlphabeticalSequence: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PasswordRuleAssert hasDays_Reuse_Password(int expected)
	{
		isNotNull();
		int actualField = actual.getDays_Reuse_Password();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Days_Reuse_Password: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PasswordRuleAssert hasDigitCharacter(int expected)
	{
		isNotNull();
		int actualField = actual.getDigitCharacter();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DigitCharacter: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PasswordRuleAssert isDictMatchBackwards()
	{
		isNotNull();
		if (!actual.isDictMatchBackwards()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DictMatchBackwards\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PasswordRuleAssert isNotDictMatchBackwards()
	{
		isNotNull();
		if (actual.isDictMatchBackwards()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DictMatchBackwards\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PasswordRuleAssert isUserNameRule()
	{
		isNotNull();
		if (!actual.isUserNameRule()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be UserNameRule\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PasswordRuleAssert isNotUserNameRule()
	{
		isNotNull();
		if (actual.isUserNameRule()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be UserNameRule\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PasswordRuleAssert isUsingDictionary()
	{
		isNotNull();
		if (!actual.isUsingDictionary()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be UsingDictionary\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PasswordRuleAssert isNotUsingDictionary()
	{
		isNotNull();
		if (actual.isUsingDictionary()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be UsingDictionary\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PasswordRuleAssert isWhitespace()
	{
		isNotNull();
		if (!actual.isWhitespace()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Whitespace\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_PasswordRuleAssert isNotWhitespace()
	{
		isNotNull();
		if (actual.isWhitespace()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Whitespace\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_PasswordRuleAssert hasLowercaseCharacter(int expected)
	{
		isNotNull();
		int actualField = actual.getLowercaseCharacter();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have LowercaseCharacter: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PasswordRuleAssert hasMaxLength(int expected)
	{
		isNotNull();
		int actualField = actual.getMaxLength();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have MaxLength: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PasswordRuleAssert hasMinLength(int expected)
	{
		isNotNull();
		int actualField = actual.getMinLength();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have MinLength: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PasswordRuleAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PasswordRuleAssert hasNonAlphaNumericCharacter(int expected)
	{
		isNotNull();
		int actualField = actual.getNonAlphaNumericCharacter();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have NonAlphaNumericCharacter: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PasswordRuleAssert hasNumericalSequence(int expected)
	{
		isNotNull();
		int actualField = actual.getNumericalSequence();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have NumericalSequence: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PasswordRuleAssert hasPathDictionary(String expected)
	{
		isNotNull();
		String actualField = actual.getPathDictionary();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have PathDictionary: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PasswordRuleAssert hasQWERTYSequence(int expected)
	{
		isNotNull();
		int actualField = actual.getQWERTYSequence();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have QWERTYSequence: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PasswordRuleAssert hasRepeatCharacterRegex(int expected)
	{
		isNotNull();
		int actualField = actual.getRepeatCharacterRegex();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have RepeatCharacterRegex: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_PasswordRuleAssert hasUppercaseCharacter(int expected)
	{
		isNotNull();
		int actualField = actual.getUppercaseCharacter();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have UppercaseCharacter: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}