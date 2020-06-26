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
import org.compiere.model.X_AD_WF_NextCondition;

/** Generated assertion class for AD_WF_NextCondition
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_WF_NextConditionAssert
	extends AbstractPOAssert<AD_WF_NextConditionAssert,X_AD_WF_NextCondition>
{

    /** Standard Constructor */
    public AD_WF_NextConditionAssert (X_AD_WF_NextCondition actual)
    {
      super (actual, AD_WF_NextConditionAssert.class);
    }


	public AD_WF_NextConditionAssert hasAD_Column_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Column_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Column_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WF_NextConditionAssert hasAD_WF_NextCondition_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_WF_NextCondition_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_WF_NextCondition_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WF_NextConditionAssert hasAD_WF_NextCondition_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_WF_NextCondition_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_WF_NextCondition_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WF_NextConditionAssert hasAD_WF_NodeNext_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_WF_NodeNext_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_WF_NodeNext_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WF_NextConditionAssert hasAndOr(String expected)
	{
		isNotNull();
		String actualField = actual.getAndOr();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AndOr: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WF_NextConditionAssert hasEntityType(String expected)
	{
		isNotNull();
		String actualField = actual.getEntityType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have EntityType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WF_NextConditionAssert hasOperation(String expected)
	{
		isNotNull();
		String actualField = actual.getOperation();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Operation: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WF_NextConditionAssert hasSeqNo(int expected)
	{
		isNotNull();
		int actualField = actual.getSeqNo();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SeqNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WF_NextConditionAssert hasValue(String expected)
	{
		isNotNull();
		String actualField = actual.getValue();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Value: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_WF_NextConditionAssert hasValue2(String expected)
	{
		isNotNull();
		String actualField = actual.getValue2();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Value2: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}