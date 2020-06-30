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
import org.compiere.model.X_AD_Color;

/** Generated assertion class for AD_Color
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class AD_ColorAssert
	extends AbstractPOAssert<AD_ColorAssert,X_AD_Color>
{

    /** Standard Constructor */
    public AD_ColorAssert (X_AD_Color actual)
    {
      super (actual, AD_ColorAssert.class);
    }


	public AD_ColorAssert hasAD_Color_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Color_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Color_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColorAssert hasAD_Color_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Color_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Color_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColorAssert hasAD_Image_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Image_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have AD_Image_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColorAssert hasAlpha(int expected)
	{
		isNotNull();
		int actualField = actual.getAlpha();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Alpha: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColorAssert hasAlpha_1(int expected)
	{
		isNotNull();
		int actualField = actual.getAlpha_1();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Alpha_1: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColorAssert hasBlue(int expected)
	{
		isNotNull();
		int actualField = actual.getBlue();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Blue: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColorAssert hasBlue_1(int expected)
	{
		isNotNull();
		int actualField = actual.getBlue_1();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Blue_1: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColorAssert hasColorType(String expected)
	{
		isNotNull();
		String actualField = actual.getColorType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have ColorType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColorAssert hasGreen(int expected)
	{
		isNotNull();
		int actualField = actual.getGreen();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Green: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColorAssert hasGreen_1(int expected)
	{
		isNotNull();
		int actualField = actual.getGreen_1();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Green_1: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColorAssert hasImageAlpha(Object expected)
	{
		isNotNull();
		bdAssert("ImageAlpha", actual.getImageAlpha(), expected);
		return myself;
	}


	public AD_ColorAssert isDefault()
	{
		isNotNull();
		if (!actual.isDefault()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Default\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public AD_ColorAssert isNotDefault()
	{
		isNotNull();
		if (actual.isDefault()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Default\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public AD_ColorAssert hasLineDistance(int expected)
	{
		isNotNull();
		int actualField = actual.getLineDistance();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have LineDistance: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColorAssert hasLineWidth(int expected)
	{
		isNotNull();
		int actualField = actual.getLineWidth();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have LineWidth: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColorAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColorAssert hasRed(int expected)
	{
		isNotNull();
		int actualField = actual.getRed();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Red: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColorAssert hasRed_1(int expected)
	{
		isNotNull();
		int actualField = actual.getRed_1();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Red_1: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColorAssert hasRepeatDistance(int expected)
	{
		isNotNull();
		int actualField = actual.getRepeatDistance();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have RepeatDistance: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public AD_ColorAssert hasStartPoint(String expected)
	{
		isNotNull();
		String actualField = actual.getStartPoint();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have StartPoint: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}