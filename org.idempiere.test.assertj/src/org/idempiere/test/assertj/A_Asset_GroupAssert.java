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
import org.compiere.model.X_A_Asset_Group;

/** Generated assertion class for A_Asset_Group
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class A_Asset_GroupAssert
	extends AbstractPOAssert<A_Asset_GroupAssert,X_A_Asset_Group>
{

    /** Standard Constructor */
    public A_Asset_GroupAssert (X_A_Asset_Group actual)
    {
      super (actual, A_Asset_GroupAssert.class);
    }


	public A_Asset_GroupAssert hasA_Asset_Class_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Class_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Class_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_GroupAssert hasA_Asset_Group_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Group_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Group_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_GroupAssert hasA_Asset_Group_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Asset_Group_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Group_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_GroupAssert hasA_Asset_Type_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Type_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Type_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_GroupAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_GroupAssert hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public A_Asset_GroupAssert isCreateAsActive()
	{
		isNotNull();
		if (!actual.isCreateAsActive()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CreateAsActive\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_GroupAssert isNotCreateAsActive()
	{
		isNotNull();
		if (actual.isCreateAsActive()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CreateAsActive\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_GroupAssert isDefault()
	{
		isNotNull();
		if (!actual.isDefault()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Default\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_GroupAssert isNotDefault()
	{
		isNotNull();
		if (actual.isDefault()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Default\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_GroupAssert isDepreciated()
	{
		isNotNull();
		if (!actual.isDepreciated()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Depreciated\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_GroupAssert isNotDepreciated()
	{
		isNotNull();
		if (actual.isDepreciated()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Depreciated\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_GroupAssert isFixedAsset()
	{
		isNotNull();
		if (!actual.isFixedAsset()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be FixedAsset\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_GroupAssert isNotFixedAsset()
	{
		isNotNull();
		if (actual.isFixedAsset()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be FixedAsset\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_GroupAssert isOneAssetPerUOM()
	{
		isNotNull();
		if (!actual.isOneAssetPerUOM()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OneAssetPerUOM\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_GroupAssert isNotOneAssetPerUOM()
	{
		isNotNull();
		if (actual.isOneAssetPerUOM()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OneAssetPerUOM\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_GroupAssert isOwned()
	{
		isNotNull();
		if (!actual.isOwned()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Owned\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_GroupAssert isNotOwned()
	{
		isNotNull();
		if (actual.isOwned()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Owned\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_GroupAssert isTrackIssues()
	{
		isNotNull();
		if (!actual.isTrackIssues()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be TrackIssues\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_GroupAssert isNotTrackIssues()
	{
		isNotNull();
		if (actual.isTrackIssues()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be TrackIssues\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public A_Asset_GroupAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}