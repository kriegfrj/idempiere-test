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
import org.compiere.model.X_B_Topic;

/** Generated assertion class for B_Topic
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractB_TopicAssert<SELF extends AbstractB_TopicAssert<SELF, ACTUAL>, ACTUAL extends X_B_Topic>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractB_TopicAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasB_Topic_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getB_Topic_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have B_Topic_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasB_Topic_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getB_Topic_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have B_Topic_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasB_TopicCategory_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getB_TopicCategory_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have B_TopicCategory_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasB_TopicType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getB_TopicType_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have B_TopicType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasDecisionDate(Object expected)
	{
		isNotNull();
		dateAssert("DecisionDate", actual.getDecisionDate(), expected);
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

	public SELF hasDocumentNo(String expected)
	{
		isNotNull();
		String actualField = actual.getDocumentNo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DocumentNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isPublished()
	{
		isNotNull();
		if (!actual.isPublished()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Published\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPublished()
	{
		isNotNull();
		if (actual.isPublished()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Published\nbut it was",
				getPODescription());
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

	public SELF isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasTextDetails(String expected)
	{
		isNotNull();
		String actualField = actual.getTextDetails();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have TextDetails: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasTextMsg(String expected)
	{
		isNotNull();
		String actualField = actual.getTextMsg();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have TextMsg: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasTopicAction(String expected)
	{
		isNotNull();
		String actualField = actual.getTopicAction();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have TopicAction: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasTopicStatus(String expected)
	{
		isNotNull();
		String actualField = actual.getTopicStatus();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have TopicStatus: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}