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
import org.compiere.model.X_M_PromotionReward;

/** Generated assertion class for M_PromotionReward
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class M_PromotionRewardAssert
	extends AbstractPOAssert<M_PromotionRewardAssert,X_M_PromotionReward>
{

    /** Standard Constructor */
    public M_PromotionRewardAssert (X_M_PromotionReward actual)
    {
      super (actual, M_PromotionRewardAssert.class);
    }


	public M_PromotionRewardAssert hasAmount(Object expected)
	{
		isNotNull();
		bdAssert("Amount", actual.getAmount(), expected);
		return myself;
	}


	public M_PromotionRewardAssert hasC_Charge_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Charge_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Charge_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PromotionRewardAssert hasDistributionSorting(String expected)
	{
		isNotNull();
		String actualField = actual.getDistributionSorting();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DistributionSorting: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PromotionRewardAssert isForAllDistribution()
	{
		isNotNull();
		if (!actual.isForAllDistribution()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ForAllDistribution\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_PromotionRewardAssert isNotForAllDistribution()
	{
		isNotNull();
		if (actual.isForAllDistribution()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ForAllDistribution\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_PromotionRewardAssert isSameDistribution()
	{
		isNotNull();
		if (!actual.isSameDistribution()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SameDistribution\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public M_PromotionRewardAssert isNotSameDistribution()
	{
		isNotNull();
		if (actual.isSameDistribution()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SameDistribution\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public M_PromotionRewardAssert hasM_Promotion_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Promotion_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Promotion_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PromotionRewardAssert hasM_PromotionDistribution_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_PromotionDistribution_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_PromotionDistribution_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PromotionRewardAssert hasM_PromotionReward_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_PromotionReward_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_PromotionReward_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PromotionRewardAssert hasM_PromotionReward_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getM_PromotionReward_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_PromotionReward_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PromotionRewardAssert hasM_TargetDistribution_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_TargetDistribution_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_TargetDistribution_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PromotionRewardAssert hasQty(Object expected)
	{
		isNotNull();
		bdAssert("Qty", actual.getQty(), expected);
		return myself;
	}


	public M_PromotionRewardAssert hasRewardType(String expected)
	{
		isNotNull();
		String actualField = actual.getRewardType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have RewardType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_PromotionRewardAssert hasSeqNo(int expected)
	{
		isNotNull();
		int actualField = actual.getSeqNo();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have SeqNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}