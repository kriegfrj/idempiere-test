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
import org.compiere.model.X_AD_ImportTemplateAccess;

/** Generated assertion class for AD_ImportTemplateAccess
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_ImportTemplateAccessAssert
	extends AbstractPOAssert<AD_ImportTemplateAccessAssert,X_AD_ImportTemplateAccess>
{

    /** Standard Constructor */
    public AD_ImportTemplateAccessAssert (X_AD_ImportTemplateAccess actual)
    {
      super (actual, AD_ImportTemplateAccessAssert.class);
    }


	public AD_ImportTemplateAccessAssert hasAD_ImportTemplate_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_ImportTemplate_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_ImportTemplate_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ImportTemplateAccessAssert hasAD_ImportTemplateAccess_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_ImportTemplateAccess_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_ImportTemplateAccess_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ImportTemplateAccessAssert hasAD_ImportTemplateAccess_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_ImportTemplateAccess_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_ImportTemplateAccess_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ImportTemplateAccessAssert hasAD_Role_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Role_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Role_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ImportTemplateAccessAssert isAllowInsert()
	{
		isNotNull();
		if (!actual.isAllowInsert()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AllowInsert\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_ImportTemplateAccessAssert isNotAllowInsert()
	{
		isNotNull();
		if (actual.isAllowInsert()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AllowInsert\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_ImportTemplateAccessAssert isAllowMerge()
	{
		isNotNull();
		if (!actual.isAllowMerge()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AllowMerge\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_ImportTemplateAccessAssert isNotAllowMerge()
	{
		isNotNull();
		if (actual.isAllowMerge()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AllowMerge\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_ImportTemplateAccessAssert isAllowUpdate()
	{
		isNotNull();
		if (!actual.isAllowUpdate()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AllowUpdate\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_ImportTemplateAccessAssert isNotAllowUpdate()
	{
		isNotNull();
		if (actual.isAllowUpdate()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AllowUpdate\nbut it was",
				getPODescription());
		}
		return myself;
	}
}