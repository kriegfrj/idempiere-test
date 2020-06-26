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
import org.compiere.model.X_M_AttributeSet;

/** Generated assertion class for M_AttributeSet
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class M_AttributeSetAssert
	extends AbstractPOAssert<M_AttributeSetAssert,X_M_AttributeSet>
{

    /** Standard Constructor */
    public M_AttributeSetAssert (X_M_AttributeSet actual)
    {
      super (actual, M_AttributeSetAssert.class);
    }


	public M_AttributeSetAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_AttributeSetAssert hasGuaranteeDays(int expected)
	{
		isNotNull();
		int actualField = actual.getGuaranteeDays();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have GuaranteeDays: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_AttributeSetAssert isAutoGenerateLot()
	{
		isNotNull();
		if (!actual.isAutoGenerateLot()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AutoGenerateLot\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_AttributeSetAssert isNotAutoGenerateLot()
	{
		isNotNull();
		if (actual.isAutoGenerateLot()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AutoGenerateLot\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_AttributeSetAssert isGuaranteeDate()
	{
		isNotNull();
		if (!actual.isGuaranteeDate()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be GuaranteeDate\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_AttributeSetAssert isNotGuaranteeDate()
	{
		isNotNull();
		if (actual.isGuaranteeDate()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be GuaranteeDate\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_AttributeSetAssert isGuaranteeDateMandatory()
	{
		isNotNull();
		if (!actual.isGuaranteeDateMandatory()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be GuaranteeDateMandatory\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_AttributeSetAssert isNotGuaranteeDateMandatory()
	{
		isNotNull();
		if (actual.isGuaranteeDateMandatory()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be GuaranteeDateMandatory\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_AttributeSetAssert isInstanceAttribute()
	{
		isNotNull();
		if (!actual.isInstanceAttribute()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be InstanceAttribute\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_AttributeSetAssert isNotInstanceAttribute()
	{
		isNotNull();
		if (actual.isInstanceAttribute()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be InstanceAttribute\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_AttributeSetAssert isLot()
	{
		isNotNull();
		if (!actual.isLot()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Lot\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_AttributeSetAssert isNotLot()
	{
		isNotNull();
		if (actual.isLot()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Lot\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_AttributeSetAssert isLotMandatory()
	{
		isNotNull();
		if (!actual.isLotMandatory()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be LotMandatory\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_AttributeSetAssert isNotLotMandatory()
	{
		isNotNull();
		if (actual.isLotMandatory()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be LotMandatory\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_AttributeSetAssert isSerNo()
	{
		isNotNull();
		if (!actual.isSerNo()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SerNo\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_AttributeSetAssert isNotSerNo()
	{
		isNotNull();
		if (actual.isSerNo()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SerNo\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_AttributeSetAssert isSerNoMandatory()
	{
		isNotNull();
		if (!actual.isSerNoMandatory()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SerNoMandatory\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_AttributeSetAssert isNotSerNoMandatory()
	{
		isNotNull();
		if (actual.isSerNoMandatory()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SerNoMandatory\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_AttributeSetAssert hasLotCharEOverwrite(String expected)
	{
		isNotNull();
		String actualField = actual.getLotCharEOverwrite();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have LotCharEOverwrite: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_AttributeSetAssert hasLotCharSOverwrite(String expected)
	{
		isNotNull();
		String actualField = actual.getLotCharSOverwrite();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have LotCharSOverwrite: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_AttributeSetAssert hasM_AttributeSet_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_AttributeSet_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_AttributeSet_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_AttributeSetAssert hasM_AttributeSet_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getM_AttributeSet_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_AttributeSet_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_AttributeSetAssert hasM_LotCtl_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_LotCtl_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_LotCtl_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_AttributeSetAssert hasM_SerNoCtl_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_SerNoCtl_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_SerNoCtl_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_AttributeSetAssert hasMandatoryType(String expected)
	{
		isNotNull();
		String actualField = actual.getMandatoryType();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have MandatoryType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_AttributeSetAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_AttributeSetAssert hasSerNoCharEOverwrite(String expected)
	{
		isNotNull();
		String actualField = actual.getSerNoCharEOverwrite();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SerNoCharEOverwrite: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_AttributeSetAssert hasSerNoCharSOverwrite(String expected)
	{
		isNotNull();
		String actualField = actual.getSerNoCharSOverwrite();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have SerNoCharSOverwrite: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_AttributeSetAssert isUseGuaranteeDateForMPolicy()
	{
		isNotNull();
		if (!actual.isUseGuaranteeDateForMPolicy()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be UseGuaranteeDateForMPolicy\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_AttributeSetAssert isNotUseGuaranteeDateForMPolicy()
	{
		isNotNull();
		if (actual.isUseGuaranteeDateForMPolicy()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be UseGuaranteeDateForMPolicy\nbut it was",
				getPODescription());
		}
		return myself;
	}
}