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
import org.compiere.model.X_AD_Client;

/** Generated assertion class for AD_Client
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractAD_ClientAssert<SELF extends AbstractAD_ClientAssert<SELF, ACTUAL>, ACTUAL extends X_AD_Client>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractAD_ClientAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAD_Client_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Client_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Client_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_Language(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Language();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Language: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_PasswordRule_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PasswordRule_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_PasswordRule_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAutoArchive(String expected)
	{
		isNotNull();
		String actualField = actual.getAutoArchive();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AutoArchive: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasDocumentDir(String expected)
	{
		isNotNull();
		String actualField = actual.getDocumentDir();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DocumentDir: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isMultiLingualDocument()
	{
		isNotNull();
		if (!actual.isMultiLingualDocument()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be MultiLingualDocument\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotMultiLingualDocument()
	{
		isNotNull();
		if (actual.isMultiLingualDocument()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be MultiLingualDocument\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isPostImmediate()
	{
		isNotNull();
		if (!actual.isPostImmediate()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PostImmediate\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPostImmediate()
	{
		isNotNull();
		if (actual.isPostImmediate()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PostImmediate\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSecureSMTP()
	{
		isNotNull();
		if (!actual.isSecureSMTP()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SecureSMTP\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSecureSMTP()
	{
		isNotNull();
		if (actual.isSecureSMTP()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SecureSMTP\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isServerEMail()
	{
		isNotNull();
		if (!actual.isServerEMail()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ServerEMail\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotServerEMail()
	{
		isNotNull();
		if (actual.isServerEMail()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ServerEMail\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSmtpAuthorization()
	{
		isNotNull();
		if (!actual.isSmtpAuthorization()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SmtpAuthorization\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSmtpAuthorization()
	{
		isNotNull();
		if (actual.isSmtpAuthorization()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SmtpAuthorization\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isUseASP()
	{
		isNotNull();
		if (!actual.isUseASP()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be UseASP\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotUseASP()
	{
		isNotNull();
		if (actual.isUseASP()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be UseASP\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isUseBetaFunctions()
	{
		isNotNull();
		if (!actual.isUseBetaFunctions()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be UseBetaFunctions\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotUseBetaFunctions()
	{
		isNotNull();
		if (actual.isUseBetaFunctions()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be UseBetaFunctions\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasMMPolicy(String expected)
	{
		isNotNull();
		String actualField = actual.getMMPolicy();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have MMPolicy: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasModelValidationClasses(String expected)
	{
		isNotNull();
		String actualField = actual.getModelValidationClasses();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ModelValidationClasses: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasRequestEMail(String expected)
	{
		isNotNull();
		String actualField = actual.getRequestEMail();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have RequestEMail: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasRequestFolder(String expected)
	{
		isNotNull();
		String actualField = actual.getRequestFolder();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have RequestFolder: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasRequestUser(String expected)
	{
		isNotNull();
		String actualField = actual.getRequestUser();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have RequestUser: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasRequestUserPW(String expected)
	{
		isNotNull();
		String actualField = actual.getRequestUserPW();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have RequestUserPW: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasSMTPHost(String expected)
	{
		isNotNull();
		String actualField = actual.getSMTPHost();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have SMTPHost: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasSMTPPort(int expected)
	{
		isNotNull();
		int actualField = actual.getSMTPPort();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have SMTPPort: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasValue(String expected)
	{
		isNotNull();
		String actualField = actual.getValue();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Value: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}