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
import org.compiere.model.X_C_ProjectIssueMA;

/** Generated assertion class for C_ProjectIssueMA
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_ProjectIssueMAAssert
	extends AbstractPOAssert<C_ProjectIssueMAAssert,X_C_ProjectIssueMA>
{

    /** Standard Constructor */
    public C_ProjectIssueMAAssert (X_C_ProjectIssueMA actual)
    {
      super (actual, C_ProjectIssueMAAssert.class);
    }


	public C_ProjectIssueMAAssert hasC_ProjectIssue_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ProjectIssue_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_ProjectIssue_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_ProjectIssueMAAssert hasC_ProjectIssueMA_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_ProjectIssueMA_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_ProjectIssueMA_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_ProjectIssueMAAssert hasM_AttributeSetInstance_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_AttributeSetInstance_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_AttributeSetInstance_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_ProjectIssueMAAssert hasMovementQty(Object expected)
	{
		isNotNull();
		bdAssert("MovementQty", actual.getMovementQty(), expected);
		return myself;
	}

}