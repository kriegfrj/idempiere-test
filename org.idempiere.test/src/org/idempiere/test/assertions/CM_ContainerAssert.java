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
import org.compiere.model.X_CM_Container;

/** Generated assertion class for CM_Container
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class CM_ContainerAssert
	extends AbstractPOAssert<CM_ContainerAssert,X_CM_Container>
{

    /** Standard Constructor */
    public CM_ContainerAssert (X_CM_Container actual)
    {
      super (actual, CM_ContainerAssert.class);
    }


	public CM_ContainerAssert hasCM_Container_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getCM_Container_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CM_Container_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_ContainerAssert hasCM_Container_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getCM_Container_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CM_Container_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_ContainerAssert hasCM_ContainerLink_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getCM_ContainerLink_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CM_ContainerLink_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_ContainerAssert hasCM_Template_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getCM_Template_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CM_Template_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_ContainerAssert hasCM_WebProject_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getCM_WebProject_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have CM_WebProject_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_ContainerAssert hasContainerLinkURL(String expected)
	{
		isNotNull();
		String actualField = actual.getContainerLinkURL();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ContainerLinkURL: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_ContainerAssert hasContainerType(String expected)
	{
		isNotNull();
		String actualField = actual.getContainerType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ContainerType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_ContainerAssert hasContainerXML(String expected)
	{
		isNotNull();
		String actualField = actual.getContainerXML();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ContainerXML: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_ContainerAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_ContainerAssert hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_ContainerAssert isIndexed()
	{
		isNotNull();
		if (!actual.isIndexed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Indexed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public CM_ContainerAssert isNotIndexed()
	{
		isNotNull();
		if (actual.isIndexed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Indexed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public CM_ContainerAssert isSecure()
	{
		isNotNull();
		if (!actual.isSecure()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Secure\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public CM_ContainerAssert isNotSecure()
	{
		isNotNull();
		if (actual.isSecure()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Secure\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public CM_ContainerAssert isSummary()
	{
		isNotNull();
		if (!actual.isSummary()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Summary\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public CM_ContainerAssert isNotSummary()
	{
		isNotNull();
		if (actual.isSummary()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Summary\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public CM_ContainerAssert isValid()
	{
		isNotNull();
		if (!actual.isValid()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Valid\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public CM_ContainerAssert isNotValid()
	{
		isNotNull();
		if (actual.isValid()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Valid\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public CM_ContainerAssert hasMeta_Author(String expected)
	{
		isNotNull();
		String actualField = actual.getMeta_Author();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Meta_Author: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_ContainerAssert hasMeta_Content(String expected)
	{
		isNotNull();
		String actualField = actual.getMeta_Content();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Meta_Content: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_ContainerAssert hasMeta_Copyright(String expected)
	{
		isNotNull();
		String actualField = actual.getMeta_Copyright();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Meta_Copyright: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_ContainerAssert hasMeta_Description(String expected)
	{
		isNotNull();
		String actualField = actual.getMeta_Description();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Meta_Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_ContainerAssert hasMeta_Keywords(String expected)
	{
		isNotNull();
		String actualField = actual.getMeta_Keywords();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Meta_Keywords: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_ContainerAssert hasMeta_Language(String expected)
	{
		isNotNull();
		String actualField = actual.getMeta_Language();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Meta_Language: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_ContainerAssert hasMeta_Publisher(String expected)
	{
		isNotNull();
		String actualField = actual.getMeta_Publisher();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Meta_Publisher: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_ContainerAssert hasMeta_RobotsTag(String expected)
	{
		isNotNull();
		String actualField = actual.getMeta_RobotsTag();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Meta_RobotsTag: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_ContainerAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_ContainerAssert hasNotice(String expected)
	{
		isNotNull();
		String actualField = actual.getNotice();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Notice: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_ContainerAssert hasPriority(int expected)
	{
		isNotNull();
		int actualField = actual.getPriority();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Priority: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_ContainerAssert hasRelativeURL(String expected)
	{
		isNotNull();
		String actualField = actual.getRelativeURL();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have RelativeURL: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_ContainerAssert hasStructureXML(String expected)
	{
		isNotNull();
		String actualField = actual.getStructureXML();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have StructureXML: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public CM_ContainerAssert hasTitle(String expected)
	{
		isNotNull();
		String actualField = actual.getTitle();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Title: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}