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
import org.compiere.model.X_R_MailText;

/** Generated assertion class for R_MailText
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class R_MailTextAssert
	extends AbstractPOAssert<R_MailTextAssert,X_R_MailText>
{

    /** Standard Constructor */
    public R_MailTextAssert (X_R_MailText actual)
    {
      super (actual, R_MailTextAssert.class);
    }


	public R_MailTextAssert isHtml()
	{
		isNotNull();
		if (!actual.isHtml()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Html\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public R_MailTextAssert isNotHtml()
	{
		isNotNull();
		if (actual.isHtml()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Html\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public R_MailTextAssert hasMailHeader(String expected)
	{
		isNotNull();
		String actualField = actual.getMailHeader();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have MailHeader: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_MailTextAssert hasMailText2(String expected)
	{
		isNotNull();
		String actualField = actual.getMailText2();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have MailText2: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_MailTextAssert hasMailText3(String expected)
	{
		isNotNull();
		String actualField = actual.getMailText3();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have MailText3: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_MailTextAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_MailTextAssert hasR_MailText_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getR_MailText_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have R_MailText_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public R_MailTextAssert hasR_MailText_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getR_MailText_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have R_MailText_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}