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
import org.compiere.model.X_CM_Template;

/** Generated assertion class for CM_Template
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class CM_TemplateAssert
	extends AbstractPOAssert<CM_TemplateAssert,X_CM_Template>
{

    /** Standard Constructor */
    public CM_TemplateAssert (X_CM_Template actual)
    {
      super (actual, CM_TemplateAssert.class);
    }


	public CM_TemplateAssert hasCM_Template_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getCM_Template_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CM_Template_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_TemplateAssert hasCM_Template_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getCM_Template_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CM_Template_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_TemplateAssert hasCM_WebProject_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getCM_WebProject_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CM_WebProject_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_TemplateAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_TemplateAssert hasElements(String expected)
	{
		isNotNull();
		String actualField = actual.getElements();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Elements: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_TemplateAssert hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_TemplateAssert isInclude()
	{
		isNotNull();
		if (!actual.isInclude()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Include\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public CM_TemplateAssert isNotInclude()
	{
		isNotNull();
		if (actual.isInclude()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Include\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public CM_TemplateAssert isNews()
	{
		isNotNull();
		if (!actual.isNews()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be News\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public CM_TemplateAssert isNotNews()
	{
		isNotNull();
		if (actual.isNews()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be News\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public CM_TemplateAssert isSummary()
	{
		isNotNull();
		if (!actual.isSummary()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Summary\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public CM_TemplateAssert isNotSummary()
	{
		isNotNull();
		if (actual.isSummary()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Summary\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public CM_TemplateAssert isUseAd()
	{
		isNotNull();
		if (!actual.isUseAd()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be UseAd\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public CM_TemplateAssert isNotUseAd()
	{
		isNotNull();
		if (actual.isUseAd()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be UseAd\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public CM_TemplateAssert isValid()
	{
		isNotNull();
		if (!actual.isValid()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Valid\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public CM_TemplateAssert isNotValid()
	{
		isNotNull();
		if (actual.isValid()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Valid\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public CM_TemplateAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_TemplateAssert hasValue(String expected)
	{
		isNotNull();
		String actualField = actual.getValue();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Value: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}