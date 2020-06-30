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
import org.compiere.model.X_C_POSTenderType;

/** Generated assertion class for C_POSTenderType
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_POSTenderTypeAssert
	extends AbstractPOAssert<C_POSTenderTypeAssert,X_C_POSTenderType>
{

    /** Standard Constructor */
    public C_POSTenderTypeAssert (X_C_POSTenderType actual)
    {
      super (actual, C_POSTenderTypeAssert.class);
    }


	public C_POSTenderTypeAssert hasC_POSTenderType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_POSTenderType_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_POSTenderType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_POSTenderTypeAssert hasC_POSTenderType_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_POSTenderType_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_POSTenderType_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_POSTenderTypeAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_POSTenderTypeAssert hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_POSTenderTypeAssert isGuarantee()
	{
		isNotNull();
		if (!actual.isGuarantee()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Guarantee\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_POSTenderTypeAssert isNotGuarantee()
	{
		isNotNull();
		if (actual.isGuarantee()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Guarantee\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_POSTenderTypeAssert isPostDated()
	{
		isNotNull();
		if (!actual.isPostDated()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PostDated\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_POSTenderTypeAssert isNotPostDated()
	{
		isNotNull();
		if (actual.isPostDated()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PostDated\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_POSTenderTypeAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_POSTenderTypeAssert hasTenderType(String expected)
	{
		isNotNull();
		String actualField = actual.getTenderType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have TenderType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_POSTenderTypeAssert hasValue(String expected)
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