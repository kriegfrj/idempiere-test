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
import org.compiere.model.X_CM_CStage;

/** Generated assertion class for CM_CStage
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class CM_CStageAssert
	extends AbstractPOAssert<CM_CStageAssert,X_CM_CStage>
{

    /** Standard Constructor */
    public CM_CStageAssert (X_CM_CStage actual)
    {
      super (actual, CM_CStageAssert.class);
    }


	public CM_CStageAssert hasCM_CStage_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getCM_CStage_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CM_CStage_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_CStageAssert hasCM_CStage_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getCM_CStage_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CM_CStage_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_CStageAssert hasCM_CStageLink_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getCM_CStageLink_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CM_CStageLink_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_CStageAssert hasCM_Template_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getCM_Template_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CM_Template_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_CStageAssert hasCM_WebProject_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getCM_WebProject_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CM_WebProject_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_CStageAssert hasContainerLinkURL(String expected)
	{
		isNotNull();
		String actualField = actual.getContainerLinkURL();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ContainerLinkURL: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_CStageAssert hasContainerType(String expected)
	{
		isNotNull();
		String actualField = actual.getContainerType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ContainerType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_CStageAssert hasContainerXML(String expected)
	{
		isNotNull();
		String actualField = actual.getContainerXML();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ContainerXML: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_CStageAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_CStageAssert hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_CStageAssert isIndexed()
	{
		isNotNull();
		if (!actual.isIndexed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Indexed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public CM_CStageAssert isNotIndexed()
	{
		isNotNull();
		if (actual.isIndexed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Indexed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public CM_CStageAssert isModified()
	{
		isNotNull();
		if (!actual.isModified()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Modified\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public CM_CStageAssert isNotModified()
	{
		isNotNull();
		if (actual.isModified()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Modified\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public CM_CStageAssert isSecure()
	{
		isNotNull();
		if (!actual.isSecure()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Secure\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public CM_CStageAssert isNotSecure()
	{
		isNotNull();
		if (actual.isSecure()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Secure\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public CM_CStageAssert isSummary()
	{
		isNotNull();
		if (!actual.isSummary()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Summary\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public CM_CStageAssert isNotSummary()
	{
		isNotNull();
		if (actual.isSummary()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Summary\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public CM_CStageAssert isValid()
	{
		isNotNull();
		if (!actual.isValid()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Valid\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public CM_CStageAssert isNotValid()
	{
		isNotNull();
		if (actual.isValid()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Valid\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public CM_CStageAssert hasMeta_Author(String expected)
	{
		isNotNull();
		String actualField = actual.getMeta_Author();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Meta_Author: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_CStageAssert hasMeta_Content(String expected)
	{
		isNotNull();
		String actualField = actual.getMeta_Content();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Meta_Content: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_CStageAssert hasMeta_Copyright(String expected)
	{
		isNotNull();
		String actualField = actual.getMeta_Copyright();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Meta_Copyright: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_CStageAssert hasMeta_Description(String expected)
	{
		isNotNull();
		String actualField = actual.getMeta_Description();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Meta_Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_CStageAssert hasMeta_Keywords(String expected)
	{
		isNotNull();
		String actualField = actual.getMeta_Keywords();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Meta_Keywords: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_CStageAssert hasMeta_Language(String expected)
	{
		isNotNull();
		String actualField = actual.getMeta_Language();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Meta_Language: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_CStageAssert hasMeta_Publisher(String expected)
	{
		isNotNull();
		String actualField = actual.getMeta_Publisher();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Meta_Publisher: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_CStageAssert hasMeta_RobotsTag(String expected)
	{
		isNotNull();
		String actualField = actual.getMeta_RobotsTag();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Meta_RobotsTag: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_CStageAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_CStageAssert hasNotice(String expected)
	{
		isNotNull();
		String actualField = actual.getNotice();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Notice: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_CStageAssert hasPriority(int expected)
	{
		isNotNull();
		int actualField = actual.getPriority();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Priority: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_CStageAssert hasRelativeURL(String expected)
	{
		isNotNull();
		String actualField = actual.getRelativeURL();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have RelativeURL: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_CStageAssert hasStructureXML(String expected)
	{
		isNotNull();
		String actualField = actual.getStructureXML();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have StructureXML: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_CStageAssert hasTitle(String expected)
	{
		isNotNull();
		String actualField = actual.getTitle();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Title: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}