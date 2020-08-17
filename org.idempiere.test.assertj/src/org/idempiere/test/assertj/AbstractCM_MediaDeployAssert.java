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
import org.compiere.model.X_CM_MediaDeploy;

/** Generated assertion class for CM_MediaDeploy
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractCM_MediaDeployAssert<SELF extends AbstractCM_MediaDeployAssert<SELF, ACTUAL>, ACTUAL extends X_CM_MediaDeploy>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractCM_MediaDeployAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasCM_Media_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getCM_Media_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CM_Media_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasCM_Media_Server_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getCM_Media_Server_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CM_Media_Server_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasCM_MediaDeploy_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getCM_MediaDeploy_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CM_MediaDeploy_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasCM_MediaDeploy_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getCM_MediaDeploy_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CM_MediaDeploy_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
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

	public SELF isDeployed()
	{
		isNotNull();
		if (!actual.isDeployed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Deployed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotDeployed()
	{
		isNotNull();
		if (actual.isDeployed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Deployed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasLastSynchronized(Object expected)
	{
		isNotNull();
		dateAssert("LastSynchronized", actual.getLastSynchronized(), expected);
		return myself;
	}

}