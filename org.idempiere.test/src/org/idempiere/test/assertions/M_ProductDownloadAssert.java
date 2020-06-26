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
import org.compiere.model.X_M_ProductDownload;

/** Generated assertion class for M_ProductDownload
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public class M_ProductDownloadAssert
	extends AbstractPOAssert<M_ProductDownloadAssert,X_M_ProductDownload>
{

    /** Standard Constructor */
    public M_ProductDownloadAssert (X_M_ProductDownload actual)
    {
      super (actual, M_ProductDownloadAssert.class);
    }


	public M_ProductDownloadAssert hasDownloadURL(String expected)
	{
		isNotNull();
		String actualField = actual.getDownloadURL();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have DownloadURL: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductDownloadAssert hasM_Product_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_Product_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductDownloadAssert hasM_ProductDownload_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_ProductDownload_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_ProductDownload_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductDownloadAssert hasM_ProductDownload_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getM_ProductDownload_UU();
		if (!Objects.areEqual(expected, actualField)) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to have M_ProductDownload_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public M_ProductDownloadAssert hasName(String expected)
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