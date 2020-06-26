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
import org.compiere.model.X_C_BP_Relation;

/** Generated assertion class for C_BP_Relation
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class C_BP_RelationAssert
	extends AbstractPOAssert<C_BP_RelationAssert,X_C_BP_Relation>
{

    /** Standard Constructor */
    public C_BP_RelationAssert (X_C_BP_Relation actual)
    {
      super (actual, C_BP_RelationAssert.class);
    }


	public C_BP_RelationAssert hasC_BP_Relation_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BP_Relation_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BP_Relation_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_RelationAssert hasC_BP_Relation_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_BP_Relation_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BP_Relation_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_RelationAssert hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_RelationAssert hasC_BPartner_Location_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_Location_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BPartner_Location_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_RelationAssert hasC_BPartnerRelation_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartnerRelation_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BPartnerRelation_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_RelationAssert hasC_BPartnerRelation_Location_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartnerRelation_Location_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have C_BPartnerRelation_Location_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_RelationAssert hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public C_BP_RelationAssert isBillTo()
	{
		isNotNull();
		if (!actual.isBillTo()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be BillTo\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BP_RelationAssert isNotBillTo()
	{
		isNotNull();
		if (actual.isBillTo()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be BillTo\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BP_RelationAssert isPayFrom()
	{
		isNotNull();
		if (!actual.isPayFrom()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PayFrom\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BP_RelationAssert isNotPayFrom()
	{
		isNotNull();
		if (actual.isPayFrom()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PayFrom\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BP_RelationAssert isRemitTo()
	{
		isNotNull();
		if (!actual.isRemitTo()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be RemitTo\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BP_RelationAssert isNotRemitTo()
	{
		isNotNull();
		if (actual.isRemitTo()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be RemitTo\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BP_RelationAssert isShipTo()
	{
		isNotNull();
		if (!actual.isShipTo()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ShipTo\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public C_BP_RelationAssert isNotShipTo()
	{
		isNotNull();
		if (actual.isShipTo()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ShipTo\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public C_BP_RelationAssert hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}