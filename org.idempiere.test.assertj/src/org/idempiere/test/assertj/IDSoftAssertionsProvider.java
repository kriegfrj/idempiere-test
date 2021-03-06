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
import org.compiere.model.*;
import org.assertj.core.api.SoftAssertionsProvider;
import org.compiere.process.ProcessInfoLog;
import org.compiere.impexp.BankStatementMatchInfo;

/** Generated soft assertions entry point
 *  @author iDempiere (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class org.idempiere.test.generator.ModelAssertionGenerator")
public interface IDSoftAssertionsProvider extends SoftAssertionsProvider {

	default A_AssetAssert assertThat(X_A_Asset a) {
		return proxy(A_AssetAssert.class, X_A_Asset.class, a);
	}

	default A_Asset_AcctAssert assertThat(X_A_Asset_Acct a) {
		return proxy(A_Asset_AcctAssert.class, X_A_Asset_Acct.class, a);
	}

	default A_Asset_AdditionAssert assertThat(X_A_Asset_Addition a) {
		return proxy(A_Asset_AdditionAssert.class, X_A_Asset_Addition.class, a);
	}

	default A_Asset_ChangeAssert assertThat(X_A_Asset_Change a) {
		return proxy(A_Asset_ChangeAssert.class, X_A_Asset_Change.class, a);
	}

	default A_Asset_ClassAssert assertThat(X_A_Asset_Class a) {
		return proxy(A_Asset_ClassAssert.class, X_A_Asset_Class.class, a);
	}

	default A_Asset_DeliveryAssert assertThat(X_A_Asset_Delivery a) {
		return proxy(A_Asset_DeliveryAssert.class, X_A_Asset_Delivery.class, a);
	}

	default A_Asset_DisposedAssert assertThat(X_A_Asset_Disposed a) {
		return proxy(A_Asset_DisposedAssert.class, X_A_Asset_Disposed.class, a);
	}

	default A_Asset_GroupAssert assertThat(X_A_Asset_Group a) {
		return proxy(A_Asset_GroupAssert.class, X_A_Asset_Group.class, a);
	}

	default A_Asset_Group_AcctAssert assertThat(X_A_Asset_Group_Acct a) {
		return proxy(A_Asset_Group_AcctAssert.class, X_A_Asset_Group_Acct.class, a);
	}

	default A_Asset_Info_FinAssert assertThat(X_A_Asset_Info_Fin a) {
		return proxy(A_Asset_Info_FinAssert.class, X_A_Asset_Info_Fin.class, a);
	}

	default A_Asset_Info_InsAssert assertThat(X_A_Asset_Info_Ins a) {
		return proxy(A_Asset_Info_InsAssert.class, X_A_Asset_Info_Ins.class, a);
	}

	default A_Asset_Info_LicAssert assertThat(X_A_Asset_Info_Lic a) {
		return proxy(A_Asset_Info_LicAssert.class, X_A_Asset_Info_Lic.class, a);
	}

	default A_Asset_Info_OthAssert assertThat(X_A_Asset_Info_Oth a) {
		return proxy(A_Asset_Info_OthAssert.class, X_A_Asset_Info_Oth.class, a);
	}

	default A_Asset_Info_TaxAssert assertThat(X_A_Asset_Info_Tax a) {
		return proxy(A_Asset_Info_TaxAssert.class, X_A_Asset_Info_Tax.class, a);
	}

	default A_Asset_ProductAssert assertThat(X_A_Asset_Product a) {
		return proxy(A_Asset_ProductAssert.class, X_A_Asset_Product.class, a);
	}

	default A_Asset_RetirementAssert assertThat(X_A_Asset_Retirement a) {
		return proxy(A_Asset_RetirementAssert.class, X_A_Asset_Retirement.class, a);
	}

	default A_Asset_RevalAssert assertThat(X_A_Asset_Reval a) {
		return proxy(A_Asset_RevalAssert.class, X_A_Asset_Reval.class, a);
	}

	default A_Asset_Reval_EntryAssert assertThat(X_A_Asset_Reval_Entry a) {
		return proxy(A_Asset_Reval_EntryAssert.class, X_A_Asset_Reval_Entry.class, a);
	}

	default A_Asset_Reval_IndexAssert assertThat(X_A_Asset_Reval_Index a) {
		return proxy(A_Asset_Reval_IndexAssert.class, X_A_Asset_Reval_Index.class, a);
	}

	default A_Asset_SplitAssert assertThat(X_A_Asset_Split a) {
		return proxy(A_Asset_SplitAssert.class, X_A_Asset_Split.class, a);
	}

	default A_Asset_SpreadAssert assertThat(X_A_Asset_Spread a) {
		return proxy(A_Asset_SpreadAssert.class, X_A_Asset_Spread.class, a);
	}

	default A_Asset_TransferAssert assertThat(X_A_Asset_Transfer a) {
		return proxy(A_Asset_TransferAssert.class, X_A_Asset_Transfer.class, a);
	}

	default A_Asset_TypeAssert assertThat(X_A_Asset_Type a) {
		return proxy(A_Asset_TypeAssert.class, X_A_Asset_Type.class, a);
	}

	default A_Asset_UseAssert assertThat(X_A_Asset_Use a) {
		return proxy(A_Asset_UseAssert.class, X_A_Asset_Use.class, a);
	}

	default A_DepreciationAssert assertThat(X_A_Depreciation a) {
		return proxy(A_DepreciationAssert.class, X_A_Depreciation.class, a);
	}

	default A_Depreciation_BuildAssert assertThat(X_A_Depreciation_Build a) {
		return proxy(A_Depreciation_BuildAssert.class, X_A_Depreciation_Build.class, a);
	}

	default A_Depreciation_ConventionAssert assertThat(X_A_Depreciation_Convention a) {
		return proxy(A_Depreciation_ConventionAssert.class, X_A_Depreciation_Convention.class, a);
	}

	default A_Depreciation_EntryAssert assertThat(X_A_Depreciation_Entry a) {
		return proxy(A_Depreciation_EntryAssert.class, X_A_Depreciation_Entry.class, a);
	}

	default A_Depreciation_ExpAssert assertThat(X_A_Depreciation_Exp a) {
		return proxy(A_Depreciation_ExpAssert.class, X_A_Depreciation_Exp.class, a);
	}

	default A_Depreciation_ForecastAssert assertThat(X_A_Depreciation_Forecast a) {
		return proxy(A_Depreciation_ForecastAssert.class, X_A_Depreciation_Forecast.class, a);
	}

	default A_Depreciation_MethodAssert assertThat(X_A_Depreciation_Method a) {
		return proxy(A_Depreciation_MethodAssert.class, X_A_Depreciation_Method.class, a);
	}

	default A_Depreciation_Table_DetailAssert assertThat(X_A_Depreciation_Table_Detail a) {
		return proxy(A_Depreciation_Table_DetailAssert.class, X_A_Depreciation_Table_Detail.class, a);
	}

	default A_Depreciation_Table_HeaderAssert assertThat(X_A_Depreciation_Table_Header a) {
		return proxy(A_Depreciation_Table_HeaderAssert.class, X_A_Depreciation_Table_Header.class, a);
	}

	default A_Depreciation_WorkfileAssert assertThat(X_A_Depreciation_Workfile a) {
		return proxy(A_Depreciation_WorkfileAssert.class, X_A_Depreciation_Workfile.class, a);
	}

	default A_FundingModeAssert assertThat(X_A_FundingMode a) {
		return proxy(A_FundingModeAssert.class, X_A_FundingMode.class, a);
	}

	default A_FundingMode_AcctAssert assertThat(X_A_FundingMode_Acct a) {
		return proxy(A_FundingMode_AcctAssert.class, X_A_FundingMode_Acct.class, a);
	}

	default A_RegistrationAssert assertThat(X_A_Registration a) {
		return proxy(A_RegistrationAssert.class, X_A_Registration.class, a);
	}

	default A_RegistrationAttributeAssert assertThat(X_A_RegistrationAttribute a) {
		return proxy(A_RegistrationAttributeAssert.class, X_A_RegistrationAttribute.class, a);
	}

	default A_RegistrationProductAssert assertThat(X_A_RegistrationProduct a) {
		return proxy(A_RegistrationProductAssert.class, X_A_RegistrationProduct.class, a);
	}

	default A_RegistrationValueAssert assertThat(X_A_RegistrationValue a) {
		return proxy(A_RegistrationValueAssert.class, X_A_RegistrationValue.class, a);
	}

	default AD_AccessLogAssert assertThat(X_AD_AccessLog a) {
		return proxy(AD_AccessLogAssert.class, X_AD_AccessLog.class, a);
	}

	default AD_AlertAssert assertThat(X_AD_Alert a) {
		return proxy(AD_AlertAssert.class, X_AD_Alert.class, a);
	}

	default AD_AlertProcessorAssert assertThat(X_AD_AlertProcessor a) {
		return proxy(AD_AlertProcessorAssert.class, X_AD_AlertProcessor.class, a);
	}

	default AD_AlertProcessorLogAssert assertThat(X_AD_AlertProcessorLog a) {
		return proxy(AD_AlertProcessorLogAssert.class, X_AD_AlertProcessorLog.class, a);
	}

	default AD_AlertRecipientAssert assertThat(X_AD_AlertRecipient a) {
		return proxy(AD_AlertRecipientAssert.class, X_AD_AlertRecipient.class, a);
	}

	default AD_AlertRuleAssert assertThat(X_AD_AlertRule a) {
		return proxy(AD_AlertRuleAssert.class, X_AD_AlertRule.class, a);
	}

	default AD_ArchiveAssert assertThat(X_AD_Archive a) {
		return proxy(AD_ArchiveAssert.class, X_AD_Archive.class, a);
	}

	default AD_AttachmentAssert assertThat(X_AD_Attachment a) {
		return proxy(AD_AttachmentAssert.class, X_AD_Attachment.class, a);
	}

	default AD_AttachmentNoteAssert assertThat(X_AD_AttachmentNote a) {
		return proxy(AD_AttachmentNoteAssert.class, X_AD_AttachmentNote.class, a);
	}

	default AD_AttributeAssert assertThat(X_AD_Attribute a) {
		return proxy(AD_AttributeAssert.class, X_AD_Attribute.class, a);
	}

	default AD_Attribute_ValueAssert assertThat(X_AD_Attribute_Value a) {
		return proxy(AD_Attribute_ValueAssert.class, X_AD_Attribute_Value.class, a);
	}

	default AD_BroadcastMessageAssert assertThat(X_AD_BroadcastMessage a) {
		return proxy(AD_BroadcastMessageAssert.class, X_AD_BroadcastMessage.class, a);
	}

	default AD_ChangeLogAssert assertThat(X_AD_ChangeLog a) {
		return proxy(AD_ChangeLogAssert.class, X_AD_ChangeLog.class, a);
	}

	default AD_ChartAssert assertThat(X_AD_Chart a) {
		return proxy(AD_ChartAssert.class, X_AD_Chart.class, a);
	}

	default AD_ChartDatasourceAssert assertThat(X_AD_ChartDatasource a) {
		return proxy(AD_ChartDatasourceAssert.class, X_AD_ChartDatasource.class, a);
	}

	default AD_ClientAssert assertThat(X_AD_Client a) {
		return proxy(AD_ClientAssert.class, X_AD_Client.class, a);
	}

	default AD_ClientInfoAssert assertThat(X_AD_ClientInfo a) {
		return proxy(AD_ClientInfoAssert.class, X_AD_ClientInfo.class, a);
	}

	default AD_ClientShareAssert assertThat(X_AD_ClientShare a) {
		return proxy(AD_ClientShareAssert.class, X_AD_ClientShare.class, a);
	}

	default AD_ColorAssert assertThat(X_AD_Color a) {
		return proxy(AD_ColorAssert.class, X_AD_Color.class, a);
	}

	default AD_ColumnAssert assertThat(X_AD_Column a) {
		return proxy(AD_ColumnAssert.class, X_AD_Column.class, a);
	}

	default AD_Column_AccessAssert assertThat(X_AD_Column_Access a) {
		return proxy(AD_Column_AccessAssert.class, X_AD_Column_Access.class, a);
	}

	default AD_CtxHelpAssert assertThat(X_AD_CtxHelp a) {
		return proxy(AD_CtxHelpAssert.class, X_AD_CtxHelp.class, a);
	}

	default AD_CtxHelpMsgAssert assertThat(X_AD_CtxHelpMsg a) {
		return proxy(AD_CtxHelpMsgAssert.class, X_AD_CtxHelpMsg.class, a);
	}

	default AD_CtxHelpSuggestionAssert assertThat(X_AD_CtxHelpSuggestion a) {
		return proxy(AD_CtxHelpSuggestionAssert.class, X_AD_CtxHelpSuggestion.class, a);
	}

	default AD_DesktopAssert assertThat(X_AD_Desktop a) {
		return proxy(AD_DesktopAssert.class, X_AD_Desktop.class, a);
	}

	default AD_DesktopWorkbenchAssert assertThat(X_AD_DesktopWorkbench a) {
		return proxy(AD_DesktopWorkbenchAssert.class, X_AD_DesktopWorkbench.class, a);
	}

	default AD_Document_Action_AccessAssert assertThat(X_AD_Document_Action_Access a) {
		return proxy(AD_Document_Action_AccessAssert.class, X_AD_Document_Action_Access.class, a);
	}

	default AD_ElementAssert assertThat(X_AD_Element a) {
		return proxy(AD_ElementAssert.class, X_AD_Element.class, a);
	}

	default AD_EntityTypeAssert assertThat(X_AD_EntityType a) {
		return proxy(AD_EntityTypeAssert.class, X_AD_EntityType.class, a);
	}

	default AD_ErrorAssert assertThat(X_AD_Error a) {
		return proxy(AD_ErrorAssert.class, X_AD_Error.class, a);
	}

	default AD_FieldAssert assertThat(X_AD_Field a) {
		return proxy(AD_FieldAssert.class, X_AD_Field.class, a);
	}

	default AD_FieldGroupAssert assertThat(X_AD_FieldGroup a) {
		return proxy(AD_FieldGroupAssert.class, X_AD_FieldGroup.class, a);
	}

	default AD_FieldSuggestionAssert assertThat(X_AD_FieldSuggestion a) {
		return proxy(AD_FieldSuggestionAssert.class, X_AD_FieldSuggestion.class, a);
	}

	default AD_FindAssert assertThat(X_AD_Find a) {
		return proxy(AD_FindAssert.class, X_AD_Find.class, a);
	}

	default AD_FormAssert assertThat(X_AD_Form a) {
		return proxy(AD_FormAssert.class, X_AD_Form.class, a);
	}

	default AD_Form_AccessAssert assertThat(X_AD_Form_Access a) {
		return proxy(AD_Form_AccessAssert.class, X_AD_Form_Access.class, a);
	}

	default AD_HouseKeepingAssert assertThat(X_AD_HouseKeeping a) {
		return proxy(AD_HouseKeepingAssert.class, X_AD_HouseKeeping.class, a);
	}

	default AD_ImageAssert assertThat(X_AD_Image a) {
		return proxy(AD_ImageAssert.class, X_AD_Image.class, a);
	}

	default AD_ImpFormatAssert assertThat(X_AD_ImpFormat a) {
		return proxy(AD_ImpFormatAssert.class, X_AD_ImpFormat.class, a);
	}

	default AD_ImpFormat_RowAssert assertThat(X_AD_ImpFormat_Row a) {
		return proxy(AD_ImpFormat_RowAssert.class, X_AD_ImpFormat_Row.class, a);
	}

	default AD_ImportTemplateAssert assertThat(X_AD_ImportTemplate a) {
		return proxy(AD_ImportTemplateAssert.class, X_AD_ImportTemplate.class, a);
	}

	default AD_ImportTemplateAccessAssert assertThat(X_AD_ImportTemplateAccess a) {
		return proxy(AD_ImportTemplateAccessAssert.class, X_AD_ImportTemplateAccess.class, a);
	}

	default AD_IndexColumnAssert assertThat(X_AD_IndexColumn a) {
		return proxy(AD_IndexColumnAssert.class, X_AD_IndexColumn.class, a);
	}

	default AD_InfoColumnAssert assertThat(X_AD_InfoColumn a) {
		return proxy(AD_InfoColumnAssert.class, X_AD_InfoColumn.class, a);
	}

	default AD_InfoProcessAssert assertThat(X_AD_InfoProcess a) {
		return proxy(AD_InfoProcessAssert.class, X_AD_InfoProcess.class, a);
	}

	default AD_InfoRelatedAssert assertThat(X_AD_InfoRelated a) {
		return proxy(AD_InfoRelatedAssert.class, X_AD_InfoRelated.class, a);
	}

	default AD_InfoWindowAssert assertThat(X_AD_InfoWindow a) {
		return proxy(AD_InfoWindowAssert.class, X_AD_InfoWindow.class, a);
	}

	default AD_InfoWindow_AccessAssert assertThat(X_AD_InfoWindow_Access a) {
		return proxy(AD_InfoWindow_AccessAssert.class, X_AD_InfoWindow_Access.class, a);
	}

	default AD_IssueAssert assertThat(X_AD_Issue a) {
		return proxy(AD_IssueAssert.class, X_AD_Issue.class, a);
	}

	default AD_LabelPrinterAssert assertThat(X_AD_LabelPrinter a) {
		return proxy(AD_LabelPrinterAssert.class, X_AD_LabelPrinter.class, a);
	}

	default AD_LabelPrinterFunctionAssert assertThat(X_AD_LabelPrinterFunction a) {
		return proxy(AD_LabelPrinterFunctionAssert.class, X_AD_LabelPrinterFunction.class, a);
	}

	default AD_LanguageAssert assertThat(X_AD_Language a) {
		return proxy(AD_LanguageAssert.class, X_AD_Language.class, a);
	}

	default AD_LdapAccessAssert assertThat(X_AD_LdapAccess a) {
		return proxy(AD_LdapAccessAssert.class, X_AD_LdapAccess.class, a);
	}

	default AD_LdapProcessorAssert assertThat(X_AD_LdapProcessor a) {
		return proxy(AD_LdapProcessorAssert.class, X_AD_LdapProcessor.class, a);
	}

	default AD_LdapProcessorLogAssert assertThat(X_AD_LdapProcessorLog a) {
		return proxy(AD_LdapProcessorLogAssert.class, X_AD_LdapProcessorLog.class, a);
	}

	default AD_MenuAssert assertThat(X_AD_Menu a) {
		return proxy(AD_MenuAssert.class, X_AD_Menu.class, a);
	}

	default AD_MessageAssert assertThat(X_AD_Message a) {
		return proxy(AD_MessageAssert.class, X_AD_Message.class, a);
	}

	default AD_MigrationScriptAssert assertThat(X_AD_MigrationScript a) {
		return proxy(AD_MigrationScriptAssert.class, X_AD_MigrationScript.class, a);
	}

	default AD_ModelValidatorAssert assertThat(X_AD_ModelValidator a) {
		return proxy(AD_ModelValidatorAssert.class, X_AD_ModelValidator.class, a);
	}

	default AD_ModificationAssert assertThat(X_AD_Modification a) {
		return proxy(AD_ModificationAssert.class, X_AD_Modification.class, a);
	}

	default AD_NoteAssert assertThat(X_AD_Note a) {
		return proxy(AD_NoteAssert.class, X_AD_Note.class, a);
	}

	default AD_OrgAssert assertThat(X_AD_Org a) {
		return proxy(AD_OrgAssert.class, X_AD_Org.class, a);
	}

	default AD_OrgInfoAssert assertThat(X_AD_OrgInfo a) {
		return proxy(AD_OrgInfoAssert.class, X_AD_OrgInfo.class, a);
	}

	default AD_OrgTypeAssert assertThat(X_AD_OrgType a) {
		return proxy(AD_OrgTypeAssert.class, X_AD_OrgType.class, a);
	}

	default AD_Package_ExpAssert assertThat(X_AD_Package_Exp a) {
		return proxy(AD_Package_ExpAssert.class, X_AD_Package_Exp.class, a);
	}

	default AD_Package_Exp_DetailAssert assertThat(X_AD_Package_Exp_Detail a) {
		return proxy(AD_Package_Exp_DetailAssert.class, X_AD_Package_Exp_Detail.class, a);
	}

	default AD_Package_ImpAssert assertThat(X_AD_Package_Imp a) {
		return proxy(AD_Package_ImpAssert.class, X_AD_Package_Imp.class, a);
	}

	default AD_Package_Imp_BackupAssert assertThat(X_AD_Package_Imp_Backup a) {
		return proxy(AD_Package_Imp_BackupAssert.class, X_AD_Package_Imp_Backup.class, a);
	}

	default AD_Package_Imp_DetailAssert assertThat(X_AD_Package_Imp_Detail a) {
		return proxy(AD_Package_Imp_DetailAssert.class, X_AD_Package_Imp_Detail.class, a);
	}

	default AD_Package_Imp_InstAssert assertThat(X_AD_Package_Imp_Inst a) {
		return proxy(AD_Package_Imp_InstAssert.class, X_AD_Package_Imp_Inst.class, a);
	}

	default AD_Package_Imp_ProcAssert assertThat(X_AD_Package_Imp_Proc a) {
		return proxy(AD_Package_Imp_ProcAssert.class, X_AD_Package_Imp_Proc.class, a);
	}

	default AD_Package_UUID_MapAssert assertThat(X_AD_Package_UUID_Map a) {
		return proxy(AD_Package_UUID_MapAssert.class, X_AD_Package_UUID_Map.class, a);
	}

	default AD_Password_HistoryAssert assertThat(X_AD_Password_History a) {
		return proxy(AD_Password_HistoryAssert.class, X_AD_Password_History.class, a);
	}

	default AD_PasswordRuleAssert assertThat(X_AD_PasswordRule a) {
		return proxy(AD_PasswordRuleAssert.class, X_AD_PasswordRule.class, a);
	}

	default AD_PInstanceAssert assertThat(X_AD_PInstance a) {
		return proxy(AD_PInstanceAssert.class, X_AD_PInstance.class, a);
	}

	default AD_PInstance_LogAssert assertThat(X_AD_PInstance_Log a) {
		return proxy(AD_PInstance_LogAssert.class, X_AD_PInstance_Log.class, a);
	}

	default AD_PInstance_ParaAssert assertThat(X_AD_PInstance_Para a) {
		return proxy(AD_PInstance_ParaAssert.class, X_AD_PInstance_Para.class, a);
	}

	default AD_PostItAssert assertThat(X_AD_PostIt a) {
		return proxy(AD_PostItAssert.class, X_AD_PostIt.class, a);
	}

	default AD_PreferenceAssert assertThat(X_AD_Preference a) {
		return proxy(AD_PreferenceAssert.class, X_AD_Preference.class, a);
	}

	default AD_PrintColorAssert assertThat(X_AD_PrintColor a) {
		return proxy(AD_PrintColorAssert.class, X_AD_PrintColor.class, a);
	}

	default AD_PrintFontAssert assertThat(X_AD_PrintFont a) {
		return proxy(AD_PrintFontAssert.class, X_AD_PrintFont.class, a);
	}

	default AD_PrintFormAssert assertThat(X_AD_PrintForm a) {
		return proxy(AD_PrintFormAssert.class, X_AD_PrintForm.class, a);
	}

	default AD_PrintFormatAssert assertThat(X_AD_PrintFormat a) {
		return proxy(AD_PrintFormatAssert.class, X_AD_PrintFormat.class, a);
	}

	default AD_PrintFormatItemAssert assertThat(X_AD_PrintFormatItem a) {
		return proxy(AD_PrintFormatItemAssert.class, X_AD_PrintFormatItem.class, a);
	}

	default AD_PrintGraphAssert assertThat(X_AD_PrintGraph a) {
		return proxy(AD_PrintGraphAssert.class, X_AD_PrintGraph.class, a);
	}

	default AD_PrintLabelAssert assertThat(X_AD_PrintLabel a) {
		return proxy(AD_PrintLabelAssert.class, X_AD_PrintLabel.class, a);
	}

	default AD_PrintLabelLineAssert assertThat(X_AD_PrintLabelLine a) {
		return proxy(AD_PrintLabelLineAssert.class, X_AD_PrintLabelLine.class, a);
	}

	default AD_PrintPaperAssert assertThat(X_AD_PrintPaper a) {
		return proxy(AD_PrintPaperAssert.class, X_AD_PrintPaper.class, a);
	}

	default AD_PrintTableFormatAssert assertThat(X_AD_PrintTableFormat a) {
		return proxy(AD_PrintTableFormatAssert.class, X_AD_PrintTableFormat.class, a);
	}

	default AD_Private_AccessAssert assertThat(X_AD_Private_Access a) {
		return proxy(AD_Private_AccessAssert.class, X_AD_Private_Access.class, a);
	}

	default AD_ProcessAssert assertThat(X_AD_Process a) {
		return proxy(AD_ProcessAssert.class, X_AD_Process.class, a);
	}

	default AD_Process_AccessAssert assertThat(X_AD_Process_Access a) {
		return proxy(AD_Process_AccessAssert.class, X_AD_Process_Access.class, a);
	}

	default AD_Process_ParaAssert assertThat(X_AD_Process_Para a) {
		return proxy(AD_Process_ParaAssert.class, X_AD_Process_Para.class, a);
	}

	default AD_RecentItemAssert assertThat(X_AD_RecentItem a) {
		return proxy(AD_RecentItemAssert.class, X_AD_RecentItem.class, a);
	}

	default AD_Record_AccessAssert assertThat(X_AD_Record_Access a) {
		return proxy(AD_Record_AccessAssert.class, X_AD_Record_Access.class, a);
	}

	default AD_Ref_ListAssert assertThat(X_AD_Ref_List a) {
		return proxy(AD_Ref_ListAssert.class, X_AD_Ref_List.class, a);
	}

	default AD_Ref_TableAssert assertThat(X_AD_Ref_Table a) {
		return proxy(AD_Ref_TableAssert.class, X_AD_Ref_Table.class, a);
	}

	default AD_ReferenceAssert assertThat(X_AD_Reference a) {
		return proxy(AD_ReferenceAssert.class, X_AD_Reference.class, a);
	}

	default AD_RegistrationAssert assertThat(X_AD_Registration a) {
		return proxy(AD_RegistrationAssert.class, X_AD_Registration.class, a);
	}

	default AD_RelationTypeAssert assertThat(X_AD_RelationType a) {
		return proxy(AD_RelationTypeAssert.class, X_AD_RelationType.class, a);
	}

	default AD_ReplicationAssert assertThat(X_AD_Replication a) {
		return proxy(AD_ReplicationAssert.class, X_AD_Replication.class, a);
	}

	default AD_Replication_LogAssert assertThat(X_AD_Replication_Log a) {
		return proxy(AD_Replication_LogAssert.class, X_AD_Replication_Log.class, a);
	}

	default AD_Replication_RunAssert assertThat(X_AD_Replication_Run a) {
		return proxy(AD_Replication_RunAssert.class, X_AD_Replication_Run.class, a);
	}

	default AD_ReplicationDocumentAssert assertThat(X_AD_ReplicationDocument a) {
		return proxy(AD_ReplicationDocumentAssert.class, X_AD_ReplicationDocument.class, a);
	}

	default AD_ReplicationStrategyAssert assertThat(X_AD_ReplicationStrategy a) {
		return proxy(AD_ReplicationStrategyAssert.class, X_AD_ReplicationStrategy.class, a);
	}

	default AD_ReplicationTableAssert assertThat(X_AD_ReplicationTable a) {
		return proxy(AD_ReplicationTableAssert.class, X_AD_ReplicationTable.class, a);
	}

	default AD_ReportViewAssert assertThat(X_AD_ReportView a) {
		return proxy(AD_ReportViewAssert.class, X_AD_ReportView.class, a);
	}

	default AD_ReportView_ColAssert assertThat(X_AD_ReportView_Col a) {
		return proxy(AD_ReportView_ColAssert.class, X_AD_ReportView_Col.class, a);
	}

	default AD_ReportView_ColumnAssert assertThat(X_AD_ReportView_Column a) {
		return proxy(AD_ReportView_ColumnAssert.class, X_AD_ReportView_Column.class, a);
	}

	default AD_RoleAssert assertThat(X_AD_Role a) {
		return proxy(AD_RoleAssert.class, X_AD_Role.class, a);
	}

	default AD_Role_IncludedAssert assertThat(X_AD_Role_Included a) {
		return proxy(AD_Role_IncludedAssert.class, X_AD_Role_Included.class, a);
	}

	default AD_Role_OrgAccessAssert assertThat(X_AD_Role_OrgAccess a) {
		return proxy(AD_Role_OrgAccessAssert.class, X_AD_Role_OrgAccess.class, a);
	}

	default AD_RuleAssert assertThat(X_AD_Rule a) {
		return proxy(AD_RuleAssert.class, X_AD_Rule.class, a);
	}

	default AD_ScheduleAssert assertThat(X_AD_Schedule a) {
		return proxy(AD_ScheduleAssert.class, X_AD_Schedule.class, a);
	}

	default AD_SchedulerAssert assertThat(X_AD_Scheduler a) {
		return proxy(AD_SchedulerAssert.class, X_AD_Scheduler.class, a);
	}

	default AD_Scheduler_ParaAssert assertThat(X_AD_Scheduler_Para a) {
		return proxy(AD_Scheduler_ParaAssert.class, X_AD_Scheduler_Para.class, a);
	}

	default AD_SchedulerLogAssert assertThat(X_AD_SchedulerLog a) {
		return proxy(AD_SchedulerLogAssert.class, X_AD_SchedulerLog.class, a);
	}

	default AD_SchedulerRecipientAssert assertThat(X_AD_SchedulerRecipient a) {
		return proxy(AD_SchedulerRecipientAssert.class, X_AD_SchedulerRecipient.class, a);
	}

	default AD_SearchDefinitionAssert assertThat(X_AD_SearchDefinition a) {
		return proxy(AD_SearchDefinitionAssert.class, X_AD_SearchDefinition.class, a);
	}

	default AD_SequenceAssert assertThat(X_AD_Sequence a) {
		return proxy(AD_SequenceAssert.class, X_AD_Sequence.class, a);
	}

	default AD_Sequence_AuditAssert assertThat(X_AD_Sequence_Audit a) {
		return proxy(AD_Sequence_AuditAssert.class, X_AD_Sequence_Audit.class, a);
	}

	default AD_Sequence_NoAssert assertThat(X_AD_Sequence_No a) {
		return proxy(AD_Sequence_NoAssert.class, X_AD_Sequence_No.class, a);
	}

	default AD_SessionAssert assertThat(X_AD_Session a) {
		return proxy(AD_SessionAssert.class, X_AD_Session.class, a);
	}

	default AD_StatusLineAssert assertThat(X_AD_StatusLine a) {
		return proxy(AD_StatusLineAssert.class, X_AD_StatusLine.class, a);
	}

	default AD_StatusLineUsedInAssert assertThat(X_AD_StatusLineUsedIn a) {
		return proxy(AD_StatusLineUsedInAssert.class, X_AD_StatusLineUsedIn.class, a);
	}

	default AD_StorageProviderAssert assertThat(X_AD_StorageProvider a) {
		return proxy(AD_StorageProviderAssert.class, X_AD_StorageProvider.class, a);
	}

	default AD_StyleAssert assertThat(X_AD_Style a) {
		return proxy(AD_StyleAssert.class, X_AD_Style.class, a);
	}

	default AD_StyleLineAssert assertThat(X_AD_StyleLine a) {
		return proxy(AD_StyleLineAssert.class, X_AD_StyleLine.class, a);
	}

	default AD_SysConfigAssert assertThat(X_AD_SysConfig a) {
		return proxy(AD_SysConfigAssert.class, X_AD_SysConfig.class, a);
	}

	default AD_SystemAssert assertThat(X_AD_System a) {
		return proxy(AD_SystemAssert.class, X_AD_System.class, a);
	}

	default AD_TabAssert assertThat(X_AD_Tab a) {
		return proxy(AD_TabAssert.class, X_AD_Tab.class, a);
	}

	default AD_Tab_CustomizationAssert assertThat(X_AD_Tab_Customization a) {
		return proxy(AD_Tab_CustomizationAssert.class, X_AD_Tab_Customization.class, a);
	}

	default AD_TableAssert assertThat(X_AD_Table a) {
		return proxy(AD_TableAssert.class, X_AD_Table.class, a);
	}

	default AD_Table_AccessAssert assertThat(X_AD_Table_Access a) {
		return proxy(AD_Table_AccessAssert.class, X_AD_Table_Access.class, a);
	}

	default AD_Table_ScriptValidatorAssert assertThat(X_AD_Table_ScriptValidator a) {
		return proxy(AD_Table_ScriptValidatorAssert.class, X_AD_Table_ScriptValidator.class, a);
	}

	default AD_TableIndexAssert assertThat(X_AD_TableIndex a) {
		return proxy(AD_TableIndexAssert.class, X_AD_TableIndex.class, a);
	}

	default AD_TaskAssert assertThat(X_AD_Task a) {
		return proxy(AD_TaskAssert.class, X_AD_Task.class, a);
	}

	default AD_Task_AccessAssert assertThat(X_AD_Task_Access a) {
		return proxy(AD_Task_AccessAssert.class, X_AD_Task_Access.class, a);
	}

	default AD_TaskInstanceAssert assertThat(X_AD_TaskInstance a) {
		return proxy(AD_TaskInstanceAssert.class, X_AD_TaskInstance.class, a);
	}

	default AD_ToolBarButtonAssert assertThat(X_AD_ToolBarButton a) {
		return proxy(AD_ToolBarButtonAssert.class, X_AD_ToolBarButton.class, a);
	}

	default AD_ToolBarButtonRestrictAssert assertThat(X_AD_ToolBarButtonRestrict a) {
		return proxy(AD_ToolBarButtonRestrictAssert.class, X_AD_ToolBarButtonRestrict.class, a);
	}

	default AD_TreeAssert assertThat(X_AD_Tree a) {
		return proxy(AD_TreeAssert.class, X_AD_Tree.class, a);
	}

	default AD_TreeBarAssert assertThat(X_AD_TreeBar a) {
		return proxy(AD_TreeBarAssert.class, X_AD_TreeBar.class, a);
	}

	default AD_TreeNodeAssert assertThat(X_AD_TreeNode a) {
		return proxy(AD_TreeNodeAssert.class, X_AD_TreeNode.class, a);
	}

	default AD_TreeNodeBPAssert assertThat(X_AD_TreeNodeBP a) {
		return proxy(AD_TreeNodeBPAssert.class, X_AD_TreeNodeBP.class, a);
	}

	default AD_TreeNodeCMCAssert assertThat(X_AD_TreeNodeCMC a) {
		return proxy(AD_TreeNodeCMCAssert.class, X_AD_TreeNodeCMC.class, a);
	}

	default AD_TreeNodeCMMAssert assertThat(X_AD_TreeNodeCMM a) {
		return proxy(AD_TreeNodeCMMAssert.class, X_AD_TreeNodeCMM.class, a);
	}

	default AD_TreeNodeCMSAssert assertThat(X_AD_TreeNodeCMS a) {
		return proxy(AD_TreeNodeCMSAssert.class, X_AD_TreeNodeCMS.class, a);
	}

	default AD_TreeNodeCMTAssert assertThat(X_AD_TreeNodeCMT a) {
		return proxy(AD_TreeNodeCMTAssert.class, X_AD_TreeNodeCMT.class, a);
	}

	default AD_TreeNodeMMAssert assertThat(X_AD_TreeNodeMM a) {
		return proxy(AD_TreeNodeMMAssert.class, X_AD_TreeNodeMM.class, a);
	}

	default AD_TreeNodePRAssert assertThat(X_AD_TreeNodePR a) {
		return proxy(AD_TreeNodePRAssert.class, X_AD_TreeNodePR.class, a);
	}

	default AD_TreeNodeU1Assert assertThat(X_AD_TreeNodeU1 a) {
		return proxy(AD_TreeNodeU1Assert.class, X_AD_TreeNodeU1.class, a);
	}

	default AD_TreeNodeU2Assert assertThat(X_AD_TreeNodeU2 a) {
		return proxy(AD_TreeNodeU2Assert.class, X_AD_TreeNodeU2.class, a);
	}

	default AD_TreeNodeU3Assert assertThat(X_AD_TreeNodeU3 a) {
		return proxy(AD_TreeNodeU3Assert.class, X_AD_TreeNodeU3.class, a);
	}

	default AD_TreeNodeU4Assert assertThat(X_AD_TreeNodeU4 a) {
		return proxy(AD_TreeNodeU4Assert.class, X_AD_TreeNodeU4.class, a);
	}

	default AD_UserAssert assertThat(X_AD_User a) {
		return proxy(AD_UserAssert.class, X_AD_User.class, a);
	}

	default AD_User_OrgAccessAssert assertThat(X_AD_User_OrgAccess a) {
		return proxy(AD_User_OrgAccessAssert.class, X_AD_User_OrgAccess.class, a);
	}

	default AD_User_RolesAssert assertThat(X_AD_User_Roles a) {
		return proxy(AD_User_RolesAssert.class, X_AD_User_Roles.class, a);
	}

	default AD_User_SubstituteAssert assertThat(X_AD_User_Substitute a) {
		return proxy(AD_User_SubstituteAssert.class, X_AD_User_Substitute.class, a);
	}

	default AD_UserBPAccessAssert assertThat(X_AD_UserBPAccess a) {
		return proxy(AD_UserBPAccessAssert.class, X_AD_UserBPAccess.class, a);
	}

	default AD_UserDef_FieldAssert assertThat(X_AD_UserDef_Field a) {
		return proxy(AD_UserDef_FieldAssert.class, X_AD_UserDef_Field.class, a);
	}

	default AD_UserDef_TabAssert assertThat(X_AD_UserDef_Tab a) {
		return proxy(AD_UserDef_TabAssert.class, X_AD_UserDef_Tab.class, a);
	}

	default AD_UserDef_WinAssert assertThat(X_AD_UserDef_Win a) {
		return proxy(AD_UserDef_WinAssert.class, X_AD_UserDef_Win.class, a);
	}

	default AD_UserMailAssert assertThat(X_AD_UserMail a) {
		return proxy(AD_UserMailAssert.class, X_AD_UserMail.class, a);
	}

	default AD_UserPreferenceAssert assertThat(X_AD_UserPreference a) {
		return proxy(AD_UserPreferenceAssert.class, X_AD_UserPreference.class, a);
	}

	default AD_UserQueryAssert assertThat(X_AD_UserQuery a) {
		return proxy(AD_UserQueryAssert.class, X_AD_UserQuery.class, a);
	}

	default AD_Val_RuleAssert assertThat(X_AD_Val_Rule a) {
		return proxy(AD_Val_RuleAssert.class, X_AD_Val_Rule.class, a);
	}

	default AD_ViewColumnAssert assertThat(X_AD_ViewColumn a) {
		return proxy(AD_ViewColumnAssert.class, X_AD_ViewColumn.class, a);
	}

	default AD_ViewComponentAssert assertThat(X_AD_ViewComponent a) {
		return proxy(AD_ViewComponentAssert.class, X_AD_ViewComponent.class, a);
	}

	default AD_WF_ActivityAssert assertThat(X_AD_WF_Activity a) {
		return proxy(AD_WF_ActivityAssert.class, X_AD_WF_Activity.class, a);
	}

	default AD_WF_ActivityApproverAssert assertThat(X_AD_WF_ActivityApprover a) {
		return proxy(AD_WF_ActivityApproverAssert.class, X_AD_WF_ActivityApprover.class, a);
	}

	default AD_WF_ActivityResultAssert assertThat(X_AD_WF_ActivityResult a) {
		return proxy(AD_WF_ActivityResultAssert.class, X_AD_WF_ActivityResult.class, a);
	}

	default AD_WF_BlockAssert assertThat(X_AD_WF_Block a) {
		return proxy(AD_WF_BlockAssert.class, X_AD_WF_Block.class, a);
	}

	default AD_WF_EventAuditAssert assertThat(X_AD_WF_EventAudit a) {
		return proxy(AD_WF_EventAuditAssert.class, X_AD_WF_EventAudit.class, a);
	}

	default AD_WF_NextConditionAssert assertThat(X_AD_WF_NextCondition a) {
		return proxy(AD_WF_NextConditionAssert.class, X_AD_WF_NextCondition.class, a);
	}

	default AD_WF_NodeAssert assertThat(X_AD_WF_Node a) {
		return proxy(AD_WF_NodeAssert.class, X_AD_WF_Node.class, a);
	}

	default AD_WF_Node_ParaAssert assertThat(X_AD_WF_Node_Para a) {
		return proxy(AD_WF_Node_ParaAssert.class, X_AD_WF_Node_Para.class, a);
	}

	default AD_WF_NodeNextAssert assertThat(X_AD_WF_NodeNext a) {
		return proxy(AD_WF_NodeNextAssert.class, X_AD_WF_NodeNext.class, a);
	}

	default AD_WF_ProcessAssert assertThat(X_AD_WF_Process a) {
		return proxy(AD_WF_ProcessAssert.class, X_AD_WF_Process.class, a);
	}

	default AD_WF_ProcessDataAssert assertThat(X_AD_WF_ProcessData a) {
		return proxy(AD_WF_ProcessDataAssert.class, X_AD_WF_ProcessData.class, a);
	}

	default AD_WF_ResponsibleAssert assertThat(X_AD_WF_Responsible a) {
		return proxy(AD_WF_ResponsibleAssert.class, X_AD_WF_Responsible.class, a);
	}

	default AD_WindowAssert assertThat(X_AD_Window a) {
		return proxy(AD_WindowAssert.class, X_AD_Window.class, a);
	}

	default AD_Window_AccessAssert assertThat(X_AD_Window_Access a) {
		return proxy(AD_Window_AccessAssert.class, X_AD_Window_Access.class, a);
	}

	default AD_WizardProcessAssert assertThat(X_AD_WizardProcess a) {
		return proxy(AD_WizardProcessAssert.class, X_AD_WizardProcess.class, a);
	}

	default AD_WorkbenchAssert assertThat(X_AD_Workbench a) {
		return proxy(AD_WorkbenchAssert.class, X_AD_Workbench.class, a);
	}

	default AD_WorkbenchWindowAssert assertThat(X_AD_WorkbenchWindow a) {
		return proxy(AD_WorkbenchWindowAssert.class, X_AD_WorkbenchWindow.class, a);
	}

	default AD_WorkflowAssert assertThat(X_AD_Workflow a) {
		return proxy(AD_WorkflowAssert.class, X_AD_Workflow.class, a);
	}

	default AD_Workflow_AccessAssert assertThat(X_AD_Workflow_Access a) {
		return proxy(AD_Workflow_AccessAssert.class, X_AD_Workflow_Access.class, a);
	}

	default AD_WorkflowProcessorAssert assertThat(X_AD_WorkflowProcessor a) {
		return proxy(AD_WorkflowProcessorAssert.class, X_AD_WorkflowProcessor.class, a);
	}

	default AD_WorkflowProcessorLogAssert assertThat(X_AD_WorkflowProcessorLog a) {
		return proxy(AD_WorkflowProcessorLogAssert.class, X_AD_WorkflowProcessorLog.class, a);
	}

	default AD_ZoomConditionAssert assertThat(X_AD_ZoomCondition a) {
		return proxy(AD_ZoomConditionAssert.class, X_AD_ZoomCondition.class, a);
	}

	default ASP_ClientExceptionAssert assertThat(X_ASP_ClientException a) {
		return proxy(ASP_ClientExceptionAssert.class, X_ASP_ClientException.class, a);
	}

	default ASP_ClientLevelAssert assertThat(X_ASP_ClientLevel a) {
		return proxy(ASP_ClientLevelAssert.class, X_ASP_ClientLevel.class, a);
	}

	default ASP_FieldAssert assertThat(X_ASP_Field a) {
		return proxy(ASP_FieldAssert.class, X_ASP_Field.class, a);
	}

	default ASP_FormAssert assertThat(X_ASP_Form a) {
		return proxy(ASP_FormAssert.class, X_ASP_Form.class, a);
	}

	default ASP_LevelAssert assertThat(X_ASP_Level a) {
		return proxy(ASP_LevelAssert.class, X_ASP_Level.class, a);
	}

	default ASP_ModuleAssert assertThat(X_ASP_Module a) {
		return proxy(ASP_ModuleAssert.class, X_ASP_Module.class, a);
	}

	default ASP_ProcessAssert assertThat(X_ASP_Process a) {
		return proxy(ASP_ProcessAssert.class, X_ASP_Process.class, a);
	}

	default ASP_Process_ParaAssert assertThat(X_ASP_Process_Para a) {
		return proxy(ASP_Process_ParaAssert.class, X_ASP_Process_Para.class, a);
	}

	default ASP_Ref_ListAssert assertThat(X_ASP_Ref_List a) {
		return proxy(ASP_Ref_ListAssert.class, X_ASP_Ref_List.class, a);
	}

	default ASP_TabAssert assertThat(X_ASP_Tab a) {
		return proxy(ASP_TabAssert.class, X_ASP_Tab.class, a);
	}

	default ASP_TaskAssert assertThat(X_ASP_Task a) {
		return proxy(ASP_TaskAssert.class, X_ASP_Task.class, a);
	}

	default ASP_WindowAssert assertThat(X_ASP_Window a) {
		return proxy(ASP_WindowAssert.class, X_ASP_Window.class, a);
	}

	default ASP_WorkflowAssert assertThat(X_ASP_Workflow a) {
		return proxy(ASP_WorkflowAssert.class, X_ASP_Workflow.class, a);
	}

	default B_BidAssert assertThat(X_B_Bid a) {
		return proxy(B_BidAssert.class, X_B_Bid.class, a);
	}

	default B_BidCommentAssert assertThat(X_B_BidComment a) {
		return proxy(B_BidCommentAssert.class, X_B_BidComment.class, a);
	}

	default B_BuyerAssert assertThat(X_B_Buyer a) {
		return proxy(B_BuyerAssert.class, X_B_Buyer.class, a);
	}

	default B_BuyerFundsAssert assertThat(X_B_BuyerFunds a) {
		return proxy(B_BuyerFundsAssert.class, X_B_BuyerFunds.class, a);
	}

	default B_OfferAssert assertThat(X_B_Offer a) {
		return proxy(B_OfferAssert.class, X_B_Offer.class, a);
	}

	default B_SellerAssert assertThat(X_B_Seller a) {
		return proxy(B_SellerAssert.class, X_B_Seller.class, a);
	}

	default B_SellerFundsAssert assertThat(X_B_SellerFunds a) {
		return proxy(B_SellerFundsAssert.class, X_B_SellerFunds.class, a);
	}

	default B_TopicAssert assertThat(X_B_Topic a) {
		return proxy(B_TopicAssert.class, X_B_Topic.class, a);
	}

	default B_TopicCategoryAssert assertThat(X_B_TopicCategory a) {
		return proxy(B_TopicCategoryAssert.class, X_B_TopicCategory.class, a);
	}

	default B_TopicTypeAssert assertThat(X_B_TopicType a) {
		return proxy(B_TopicTypeAssert.class, X_B_TopicType.class, a);
	}

	default C_1099BoxAssert assertThat(X_C_1099Box a) {
		return proxy(C_1099BoxAssert.class, X_C_1099Box.class, a);
	}

	default C_AcctProcessorAssert assertThat(X_C_AcctProcessor a) {
		return proxy(C_AcctProcessorAssert.class, X_C_AcctProcessor.class, a);
	}

	default C_AcctProcessorLogAssert assertThat(X_C_AcctProcessorLog a) {
		return proxy(C_AcctProcessorLogAssert.class, X_C_AcctProcessorLog.class, a);
	}

	default C_AcctSchemaAssert assertThat(X_C_AcctSchema a) {
		return proxy(C_AcctSchemaAssert.class, X_C_AcctSchema.class, a);
	}

	default C_AcctSchema_DefaultAssert assertThat(X_C_AcctSchema_Default a) {
		return proxy(C_AcctSchema_DefaultAssert.class, X_C_AcctSchema_Default.class, a);
	}

	default C_AcctSchema_ElementAssert assertThat(X_C_AcctSchema_Element a) {
		return proxy(C_AcctSchema_ElementAssert.class, X_C_AcctSchema_Element.class, a);
	}

	default C_AcctSchema_GLAssert assertThat(X_C_AcctSchema_GL a) {
		return proxy(C_AcctSchema_GLAssert.class, X_C_AcctSchema_GL.class, a);
	}

	default C_ActivityAssert assertThat(X_C_Activity a) {
		return proxy(C_ActivityAssert.class, X_C_Activity.class, a);
	}

	default C_AddressTransactionAssert assertThat(X_C_AddressTransaction a) {
		return proxy(C_AddressTransactionAssert.class, X_C_AddressTransaction.class, a);
	}

	default C_AddressValidationAssert assertThat(X_C_AddressValidation a) {
		return proxy(C_AddressValidationAssert.class, X_C_AddressValidation.class, a);
	}

	default C_AddressValidationCfgAssert assertThat(X_C_AddressValidationCfg a) {
		return proxy(C_AddressValidationCfgAssert.class, X_C_AddressValidationCfg.class, a);
	}

	default C_AllocationHdrAssert assertThat(X_C_AllocationHdr a) {
		return proxy(C_AllocationHdrAssert.class, X_C_AllocationHdr.class, a);
	}

	default C_AllocationLineAssert assertThat(X_C_AllocationLine a) {
		return proxy(C_AllocationLineAssert.class, X_C_AllocationLine.class, a);
	}

	default C_BankAssert assertThat(X_C_Bank a) {
		return proxy(C_BankAssert.class, X_C_Bank.class, a);
	}

	default C_BankAccountAssert assertThat(X_C_BankAccount a) {
		return proxy(C_BankAccountAssert.class, X_C_BankAccount.class, a);
	}

	default C_BankAccount_AcctAssert assertThat(X_C_BankAccount_Acct a) {
		return proxy(C_BankAccount_AcctAssert.class, X_C_BankAccount_Acct.class, a);
	}

	default C_BankAccount_ProcessorAssert assertThat(X_C_BankAccount_Processor a) {
		return proxy(C_BankAccount_ProcessorAssert.class, X_C_BankAccount_Processor.class, a);
	}

	default C_BankAccountDocAssert assertThat(X_C_BankAccountDoc a) {
		return proxy(C_BankAccountDocAssert.class, X_C_BankAccountDoc.class, a);
	}

	default C_BankStatementAssert assertThat(X_C_BankStatement a) {
		return proxy(C_BankStatementAssert.class, X_C_BankStatement.class, a);
	}

	default C_BankStatementLineAssert assertThat(X_C_BankStatementLine a) {
		return proxy(C_BankStatementLineAssert.class, X_C_BankStatementLine.class, a);
	}

	default C_BankStatementLoaderAssert assertThat(X_C_BankStatementLoader a) {
		return proxy(C_BankStatementLoaderAssert.class, X_C_BankStatementLoader.class, a);
	}

	default C_BankStatementMatcherAssert assertThat(X_C_BankStatementMatcher a) {
		return proxy(C_BankStatementMatcherAssert.class, X_C_BankStatementMatcher.class, a);
	}

	default C_BP_BankAccountAssert assertThat(X_C_BP_BankAccount a) {
		return proxy(C_BP_BankAccountAssert.class, X_C_BP_BankAccount.class, a);
	}

	default C_BP_Customer_AcctAssert assertThat(X_C_BP_Customer_Acct a) {
		return proxy(C_BP_Customer_AcctAssert.class, X_C_BP_Customer_Acct.class, a);
	}

	default C_BP_EDIAssert assertThat(X_C_BP_EDI a) {
		return proxy(C_BP_EDIAssert.class, X_C_BP_EDI.class, a);
	}

	default C_BP_Employee_AcctAssert assertThat(X_C_BP_Employee_Acct a) {
		return proxy(C_BP_Employee_AcctAssert.class, X_C_BP_Employee_Acct.class, a);
	}

	default C_BP_GroupAssert assertThat(X_C_BP_Group a) {
		return proxy(C_BP_GroupAssert.class, X_C_BP_Group.class, a);
	}

	default C_BP_Group_AcctAssert assertThat(X_C_BP_Group_Acct a) {
		return proxy(C_BP_Group_AcctAssert.class, X_C_BP_Group_Acct.class, a);
	}

	default C_BP_RelationAssert assertThat(X_C_BP_Relation a) {
		return proxy(C_BP_RelationAssert.class, X_C_BP_Relation.class, a);
	}

	default C_BP_ShippingAcctAssert assertThat(X_C_BP_ShippingAcct a) {
		return proxy(C_BP_ShippingAcctAssert.class, X_C_BP_ShippingAcct.class, a);
	}

	default C_BP_Vendor_AcctAssert assertThat(X_C_BP_Vendor_Acct a) {
		return proxy(C_BP_Vendor_AcctAssert.class, X_C_BP_Vendor_Acct.class, a);
	}

	default C_BP_WithholdingAssert assertThat(X_C_BP_Withholding a) {
		return proxy(C_BP_WithholdingAssert.class, X_C_BP_Withholding.class, a);
	}

	default C_BPartnerAssert assertThat(X_C_BPartner a) {
		return proxy(C_BPartnerAssert.class, X_C_BPartner.class, a);
	}

	default C_BPartner_LocationAssert assertThat(X_C_BPartner_Location a) {
		return proxy(C_BPartner_LocationAssert.class, X_C_BPartner_Location.class, a);
	}

	default C_BPartner_ProductAssert assertThat(X_C_BPartner_Product a) {
		return proxy(C_BPartner_ProductAssert.class, X_C_BPartner_Product.class, a);
	}

	default C_CalendarAssert assertThat(X_C_Calendar a) {
		return proxy(C_CalendarAssert.class, X_C_Calendar.class, a);
	}

	default C_CampaignAssert assertThat(X_C_Campaign a) {
		return proxy(C_CampaignAssert.class, X_C_Campaign.class, a);
	}

	default C_CashAssert assertThat(X_C_Cash a) {
		return proxy(C_CashAssert.class, X_C_Cash.class, a);
	}

	default C_CashBookAssert assertThat(X_C_CashBook a) {
		return proxy(C_CashBookAssert.class, X_C_CashBook.class, a);
	}

	default C_CashBook_AcctAssert assertThat(X_C_CashBook_Acct a) {
		return proxy(C_CashBook_AcctAssert.class, X_C_CashBook_Acct.class, a);
	}

	default C_CashLineAssert assertThat(X_C_CashLine a) {
		return proxy(C_CashLineAssert.class, X_C_CashLine.class, a);
	}

	default C_CashPlanAssert assertThat(X_C_CashPlan a) {
		return proxy(C_CashPlanAssert.class, X_C_CashPlan.class, a);
	}

	default C_CashPlanLineAssert assertThat(X_C_CashPlanLine a) {
		return proxy(C_CashPlanLineAssert.class, X_C_CashPlanLine.class, a);
	}

	default C_ChannelAssert assertThat(X_C_Channel a) {
		return proxy(C_ChannelAssert.class, X_C_Channel.class, a);
	}

	default C_ChargeAssert assertThat(X_C_Charge a) {
		return proxy(C_ChargeAssert.class, X_C_Charge.class, a);
	}

	default C_Charge_AcctAssert assertThat(X_C_Charge_Acct a) {
		return proxy(C_Charge_AcctAssert.class, X_C_Charge_Acct.class, a);
	}

	default C_ChargeTypeAssert assertThat(X_C_ChargeType a) {
		return proxy(C_ChargeTypeAssert.class, X_C_ChargeType.class, a);
	}

	default C_ChargeType_DocTypeAssert assertThat(X_C_ChargeType_DocType a) {
		return proxy(C_ChargeType_DocTypeAssert.class, X_C_ChargeType_DocType.class, a);
	}

	default C_CityAssert assertThat(X_C_City a) {
		return proxy(C_CityAssert.class, X_C_City.class, a);
	}

	default C_CommissionAssert assertThat(X_C_Commission a) {
		return proxy(C_CommissionAssert.class, X_C_Commission.class, a);
	}

	default C_CommissionAmtAssert assertThat(X_C_CommissionAmt a) {
		return proxy(C_CommissionAmtAssert.class, X_C_CommissionAmt.class, a);
	}

	default C_CommissionDetailAssert assertThat(X_C_CommissionDetail a) {
		return proxy(C_CommissionDetailAssert.class, X_C_CommissionDetail.class, a);
	}

	default C_CommissionLineAssert assertThat(X_C_CommissionLine a) {
		return proxy(C_CommissionLineAssert.class, X_C_CommissionLine.class, a);
	}

	default C_CommissionRunAssert assertThat(X_C_CommissionRun a) {
		return proxy(C_CommissionRunAssert.class, X_C_CommissionRun.class, a);
	}

	default C_ContactActivityAssert assertThat(X_C_ContactActivity a) {
		return proxy(C_ContactActivityAssert.class, X_C_ContactActivity.class, a);
	}

	default C_Conversion_RateAssert assertThat(X_C_Conversion_Rate a) {
		return proxy(C_Conversion_RateAssert.class, X_C_Conversion_Rate.class, a);
	}

	default C_ConversionTypeAssert assertThat(X_C_ConversionType a) {
		return proxy(C_ConversionTypeAssert.class, X_C_ConversionType.class, a);
	}

	default C_CountryAssert assertThat(X_C_Country a) {
		return proxy(C_CountryAssert.class, X_C_Country.class, a);
	}

	default C_CountryGroupAssert assertThat(X_C_CountryGroup a) {
		return proxy(C_CountryGroupAssert.class, X_C_CountryGroup.class, a);
	}

	default C_CountryGroupCountryAssert assertThat(X_C_CountryGroupCountry a) {
		return proxy(C_CountryGroupCountryAssert.class, X_C_CountryGroupCountry.class, a);
	}

	default C_CurrencyAssert assertThat(X_C_Currency a) {
		return proxy(C_CurrencyAssert.class, X_C_Currency.class, a);
	}

	default C_Currency_AcctAssert assertThat(X_C_Currency_Acct a) {
		return proxy(C_Currency_AcctAssert.class, X_C_Currency_Acct.class, a);
	}

	default C_CycleAssert assertThat(X_C_Cycle a) {
		return proxy(C_CycleAssert.class, X_C_Cycle.class, a);
	}

	default C_CyclePhaseAssert assertThat(X_C_CyclePhase a) {
		return proxy(C_CyclePhaseAssert.class, X_C_CyclePhase.class, a);
	}

	default C_CycleStepAssert assertThat(X_C_CycleStep a) {
		return proxy(C_CycleStepAssert.class, X_C_CycleStep.class, a);
	}

	default C_DepositBatchAssert assertThat(X_C_DepositBatch a) {
		return proxy(C_DepositBatchAssert.class, X_C_DepositBatch.class, a);
	}

	default C_DepositBatchLineAssert assertThat(X_C_DepositBatchLine a) {
		return proxy(C_DepositBatchLineAssert.class, X_C_DepositBatchLine.class, a);
	}

	default C_DocTypeAssert assertThat(X_C_DocType a) {
		return proxy(C_DocTypeAssert.class, X_C_DocType.class, a);
	}

	default C_DocTypeCounterAssert assertThat(X_C_DocTypeCounter a) {
		return proxy(C_DocTypeCounterAssert.class, X_C_DocTypeCounter.class, a);
	}

	default C_DunningAssert assertThat(X_C_Dunning a) {
		return proxy(C_DunningAssert.class, X_C_Dunning.class, a);
	}

	default C_DunningLevelAssert assertThat(X_C_DunningLevel a) {
		return proxy(C_DunningLevelAssert.class, X_C_DunningLevel.class, a);
	}

	default C_DunningRunAssert assertThat(X_C_DunningRun a) {
		return proxy(C_DunningRunAssert.class, X_C_DunningRun.class, a);
	}

	default C_DunningRunEntryAssert assertThat(X_C_DunningRunEntry a) {
		return proxy(C_DunningRunEntryAssert.class, X_C_DunningRunEntry.class, a);
	}

	default C_DunningRunLineAssert assertThat(X_C_DunningRunLine a) {
		return proxy(C_DunningRunLineAssert.class, X_C_DunningRunLine.class, a);
	}

	default C_ElementAssert assertThat(X_C_Element a) {
		return proxy(C_ElementAssert.class, X_C_Element.class, a);
	}

	default C_ElementValueAssert assertThat(X_C_ElementValue a) {
		return proxy(C_ElementValueAssert.class, X_C_ElementValue.class, a);
	}

	default C_GreetingAssert assertThat(X_C_Greeting a) {
		return proxy(C_GreetingAssert.class, X_C_Greeting.class, a);
	}

	default C_InterOrg_AcctAssert assertThat(X_C_InterOrg_Acct a) {
		return proxy(C_InterOrg_AcctAssert.class, X_C_InterOrg_Acct.class, a);
	}

	default C_InvoiceAssert assertThat(X_C_Invoice a) {
		return proxy(C_InvoiceAssert.class, X_C_Invoice.class, a);
	}

	default C_InvoiceBatchAssert assertThat(X_C_InvoiceBatch a) {
		return proxy(C_InvoiceBatchAssert.class, X_C_InvoiceBatch.class, a);
	}

	default C_InvoiceBatchLineAssert assertThat(X_C_InvoiceBatchLine a) {
		return proxy(C_InvoiceBatchLineAssert.class, X_C_InvoiceBatchLine.class, a);
	}

	default C_InvoiceLineAssert assertThat(X_C_InvoiceLine a) {
		return proxy(C_InvoiceLineAssert.class, X_C_InvoiceLine.class, a);
	}

	default C_InvoicePayScheduleAssert assertThat(X_C_InvoicePaySchedule a) {
		return proxy(C_InvoicePayScheduleAssert.class, X_C_InvoicePaySchedule.class, a);
	}

	default C_InvoiceScheduleAssert assertThat(X_C_InvoiceSchedule a) {
		return proxy(C_InvoiceScheduleAssert.class, X_C_InvoiceSchedule.class, a);
	}

	default C_InvoiceTaxAssert assertThat(X_C_InvoiceTax a) {
		return proxy(C_InvoiceTaxAssert.class, X_C_InvoiceTax.class, a);
	}

	default C_JobAssert assertThat(X_C_Job a) {
		return proxy(C_JobAssert.class, X_C_Job.class, a);
	}

	default C_JobAssignmentAssert assertThat(X_C_JobAssignment a) {
		return proxy(C_JobAssignmentAssert.class, X_C_JobAssignment.class, a);
	}

	default C_JobCategoryAssert assertThat(X_C_JobCategory a) {
		return proxy(C_JobCategoryAssert.class, X_C_JobCategory.class, a);
	}

	default C_JobRemunerationAssert assertThat(X_C_JobRemuneration a) {
		return proxy(C_JobRemunerationAssert.class, X_C_JobRemuneration.class, a);
	}

	default C_LandedCostAssert assertThat(X_C_LandedCost a) {
		return proxy(C_LandedCostAssert.class, X_C_LandedCost.class, a);
	}

	default C_LandedCostAllocationAssert assertThat(X_C_LandedCostAllocation a) {
		return proxy(C_LandedCostAllocationAssert.class, X_C_LandedCostAllocation.class, a);
	}

	default C_LocationAssert assertThat(X_C_Location a) {
		return proxy(C_LocationAssert.class, X_C_Location.class, a);
	}

	default C_NonBusinessDayAssert assertThat(X_C_NonBusinessDay a) {
		return proxy(C_NonBusinessDayAssert.class, X_C_NonBusinessDay.class, a);
	}

	default C_OnlineTrxHistoryAssert assertThat(X_C_OnlineTrxHistory a) {
		return proxy(C_OnlineTrxHistoryAssert.class, X_C_OnlineTrxHistory.class, a);
	}

	default C_OpportunityAssert assertThat(X_C_Opportunity a) {
		return proxy(C_OpportunityAssert.class, X_C_Opportunity.class, a);
	}

	default C_OrderAssert assertThat(X_C_Order a) {
		return proxy(C_OrderAssert.class, X_C_Order.class, a);
	}

	default C_OrderLandedCostAssert assertThat(X_C_OrderLandedCost a) {
		return proxy(C_OrderLandedCostAssert.class, X_C_OrderLandedCost.class, a);
	}

	default C_OrderLandedCostAllocationAssert assertThat(X_C_OrderLandedCostAllocation a) {
		return proxy(C_OrderLandedCostAllocationAssert.class, X_C_OrderLandedCostAllocation.class, a);
	}

	default C_OrderLineAssert assertThat(X_C_OrderLine a) {
		return proxy(C_OrderLineAssert.class, X_C_OrderLine.class, a);
	}

	default C_OrderPayScheduleAssert assertThat(X_C_OrderPaySchedule a) {
		return proxy(C_OrderPayScheduleAssert.class, X_C_OrderPaySchedule.class, a);
	}

	default C_OrderSourceAssert assertThat(X_C_OrderSource a) {
		return proxy(C_OrderSourceAssert.class, X_C_OrderSource.class, a);
	}

	default C_OrderTaxAssert assertThat(X_C_OrderTax a) {
		return proxy(C_OrderTaxAssert.class, X_C_OrderTax.class, a);
	}

	default C_OrgAssignmentAssert assertThat(X_C_OrgAssignment a) {
		return proxy(C_OrgAssignmentAssert.class, X_C_OrgAssignment.class, a);
	}

	default C_PaymentAssert assertThat(X_C_Payment a) {
		return proxy(C_PaymentAssert.class, X_C_Payment.class, a);
	}

	default C_PaymentAllocateAssert assertThat(X_C_PaymentAllocate a) {
		return proxy(C_PaymentAllocateAssert.class, X_C_PaymentAllocate.class, a);
	}

	default C_PaymentBatchAssert assertThat(X_C_PaymentBatch a) {
		return proxy(C_PaymentBatchAssert.class, X_C_PaymentBatch.class, a);
	}

	default C_PaymentProcessorAssert assertThat(X_C_PaymentProcessor a) {
		return proxy(C_PaymentProcessorAssert.class, X_C_PaymentProcessor.class, a);
	}

	default C_PaymentTermAssert assertThat(X_C_PaymentTerm a) {
		return proxy(C_PaymentTermAssert.class, X_C_PaymentTerm.class, a);
	}

	default C_PaymentTransactionAssert assertThat(X_C_PaymentTransaction a) {
		return proxy(C_PaymentTransactionAssert.class, X_C_PaymentTransaction.class, a);
	}

	default C_PayScheduleAssert assertThat(X_C_PaySchedule a) {
		return proxy(C_PayScheduleAssert.class, X_C_PaySchedule.class, a);
	}

	default C_PaySelectionAssert assertThat(X_C_PaySelection a) {
		return proxy(C_PaySelectionAssert.class, X_C_PaySelection.class, a);
	}

	default C_PaySelectionCheckAssert assertThat(X_C_PaySelectionCheck a) {
		return proxy(C_PaySelectionCheckAssert.class, X_C_PaySelectionCheck.class, a);
	}

	default C_PaySelectionLineAssert assertThat(X_C_PaySelectionLine a) {
		return proxy(C_PaySelectionLineAssert.class, X_C_PaySelectionLine.class, a);
	}

	default C_PeriodAssert assertThat(X_C_Period a) {
		return proxy(C_PeriodAssert.class, X_C_Period.class, a);
	}

	default C_PeriodControlAssert assertThat(X_C_PeriodControl a) {
		return proxy(C_PeriodControlAssert.class, X_C_PeriodControl.class, a);
	}

	default C_PhaseAssert assertThat(X_C_Phase a) {
		return proxy(C_PhaseAssert.class, X_C_Phase.class, a);
	}

	default C_POSAssert assertThat(X_C_POS a) {
		return proxy(C_POSAssert.class, X_C_POS.class, a);
	}

	default C_POSKeyAssert assertThat(X_C_POSKey a) {
		return proxy(C_POSKeyAssert.class, X_C_POSKey.class, a);
	}

	default C_POSKeyLayoutAssert assertThat(X_C_POSKeyLayout a) {
		return proxy(C_POSKeyLayoutAssert.class, X_C_POSKeyLayout.class, a);
	}

	default C_POSPaymentAssert assertThat(X_C_POSPayment a) {
		return proxy(C_POSPaymentAssert.class, X_C_POSPayment.class, a);
	}

	default C_POSTenderTypeAssert assertThat(X_C_POSTenderType a) {
		return proxy(C_POSTenderTypeAssert.class, X_C_POSTenderType.class, a);
	}

	default C_ProjectAssert assertThat(X_C_Project a) {
		return proxy(C_ProjectAssert.class, X_C_Project.class, a);
	}

	default C_Project_AcctAssert assertThat(X_C_Project_Acct a) {
		return proxy(C_Project_AcctAssert.class, X_C_Project_Acct.class, a);
	}

	default C_ProjectIssueAssert assertThat(X_C_ProjectIssue a) {
		return proxy(C_ProjectIssueAssert.class, X_C_ProjectIssue.class, a);
	}

	default C_ProjectIssueMAAssert assertThat(X_C_ProjectIssueMA a) {
		return proxy(C_ProjectIssueMAAssert.class, X_C_ProjectIssueMA.class, a);
	}

	default C_ProjectLineAssert assertThat(X_C_ProjectLine a) {
		return proxy(C_ProjectLineAssert.class, X_C_ProjectLine.class, a);
	}

	default C_ProjectPhaseAssert assertThat(X_C_ProjectPhase a) {
		return proxy(C_ProjectPhaseAssert.class, X_C_ProjectPhase.class, a);
	}

	default C_ProjectTaskAssert assertThat(X_C_ProjectTask a) {
		return proxy(C_ProjectTaskAssert.class, X_C_ProjectTask.class, a);
	}

	default C_ProjectTypeAssert assertThat(X_C_ProjectType a) {
		return proxy(C_ProjectTypeAssert.class, X_C_ProjectType.class, a);
	}

	default C_RecurringAssert assertThat(X_C_Recurring a) {
		return proxy(C_RecurringAssert.class, X_C_Recurring.class, a);
	}

	default C_Recurring_RunAssert assertThat(X_C_Recurring_Run a) {
		return proxy(C_Recurring_RunAssert.class, X_C_Recurring_Run.class, a);
	}

	default C_RecurringGroupAssert assertThat(X_C_RecurringGroup a) {
		return proxy(C_RecurringGroupAssert.class, X_C_RecurringGroup.class, a);
	}

	default C_RegionAssert assertThat(X_C_Region a) {
		return proxy(C_RegionAssert.class, X_C_Region.class, a);
	}

	default C_RemunerationAssert assertThat(X_C_Remuneration a) {
		return proxy(C_RemunerationAssert.class, X_C_Remuneration.class, a);
	}

	default C_RevenueRecog_ServiceAssert assertThat(X_C_RevenueRecog_Service a) {
		return proxy(C_RevenueRecog_ServiceAssert.class, X_C_RevenueRecog_Service.class, a);
	}

	default C_RevenueRecognitionAssert assertThat(X_C_RevenueRecognition a) {
		return proxy(C_RevenueRecognitionAssert.class, X_C_RevenueRecognition.class, a);
	}

	default C_RevenueRecognition_PlanAssert assertThat(X_C_RevenueRecognition_Plan a) {
		return proxy(C_RevenueRecognition_PlanAssert.class, X_C_RevenueRecognition_Plan.class, a);
	}

	default C_RevenueRecognition_RunAssert assertThat(X_C_RevenueRecognition_Run a) {
		return proxy(C_RevenueRecognition_RunAssert.class, X_C_RevenueRecognition_Run.class, a);
	}

	default C_RfQAssert assertThat(X_C_RfQ a) {
		return proxy(C_RfQAssert.class, X_C_RfQ.class, a);
	}

	default C_RfQ_TopicAssert assertThat(X_C_RfQ_Topic a) {
		return proxy(C_RfQ_TopicAssert.class, X_C_RfQ_Topic.class, a);
	}

	default C_RfQ_TopicSubscriberAssert assertThat(X_C_RfQ_TopicSubscriber a) {
		return proxy(C_RfQ_TopicSubscriberAssert.class, X_C_RfQ_TopicSubscriber.class, a);
	}

	default C_RfQ_TopicSubscriberOnlyAssert assertThat(X_C_RfQ_TopicSubscriberOnly a) {
		return proxy(C_RfQ_TopicSubscriberOnlyAssert.class, X_C_RfQ_TopicSubscriberOnly.class, a);
	}

	default C_RfQLineAssert assertThat(X_C_RfQLine a) {
		return proxy(C_RfQLineAssert.class, X_C_RfQLine.class, a);
	}

	default C_RfQLineQtyAssert assertThat(X_C_RfQLineQty a) {
		return proxy(C_RfQLineQtyAssert.class, X_C_RfQLineQty.class, a);
	}

	default C_RfQResponseAssert assertThat(X_C_RfQResponse a) {
		return proxy(C_RfQResponseAssert.class, X_C_RfQResponse.class, a);
	}

	default C_RfQResponseLineAssert assertThat(X_C_RfQResponseLine a) {
		return proxy(C_RfQResponseLineAssert.class, X_C_RfQResponseLine.class, a);
	}

	default C_RfQResponseLineQtyAssert assertThat(X_C_RfQResponseLineQty a) {
		return proxy(C_RfQResponseLineQtyAssert.class, X_C_RfQResponseLineQty.class, a);
	}

	default C_SalesRegionAssert assertThat(X_C_SalesRegion a) {
		return proxy(C_SalesRegionAssert.class, X_C_SalesRegion.class, a);
	}

	default C_SalesStageAssert assertThat(X_C_SalesStage a) {
		return proxy(C_SalesStageAssert.class, X_C_SalesStage.class, a);
	}

	default C_ServiceLevelAssert assertThat(X_C_ServiceLevel a) {
		return proxy(C_ServiceLevelAssert.class, X_C_ServiceLevel.class, a);
	}

	default C_ServiceLevelLineAssert assertThat(X_C_ServiceLevelLine a) {
		return proxy(C_ServiceLevelLineAssert.class, X_C_ServiceLevelLine.class, a);
	}

	default C_SubAcctAssert assertThat(X_C_SubAcct a) {
		return proxy(C_SubAcctAssert.class, X_C_SubAcct.class, a);
	}

	default C_SubscriptionAssert assertThat(X_C_Subscription a) {
		return proxy(C_SubscriptionAssert.class, X_C_Subscription.class, a);
	}

	default C_Subscription_DeliveryAssert assertThat(X_C_Subscription_Delivery a) {
		return proxy(C_Subscription_DeliveryAssert.class, X_C_Subscription_Delivery.class, a);
	}

	default C_SubscriptionTypeAssert assertThat(X_C_SubscriptionType a) {
		return proxy(C_SubscriptionTypeAssert.class, X_C_SubscriptionType.class, a);
	}

	default C_TaskAssert assertThat(X_C_Task a) {
		return proxy(C_TaskAssert.class, X_C_Task.class, a);
	}

	default C_TaxAssert assertThat(X_C_Tax a) {
		return proxy(C_TaxAssert.class, X_C_Tax.class, a);
	}

	default C_Tax_AcctAssert assertThat(X_C_Tax_Acct a) {
		return proxy(C_Tax_AcctAssert.class, X_C_Tax_Acct.class, a);
	}

	default C_TaxCategoryAssert assertThat(X_C_TaxCategory a) {
		return proxy(C_TaxCategoryAssert.class, X_C_TaxCategory.class, a);
	}

	default C_TaxDeclarationAssert assertThat(X_C_TaxDeclaration a) {
		return proxy(C_TaxDeclarationAssert.class, X_C_TaxDeclaration.class, a);
	}

	default C_TaxDeclarationAcctAssert assertThat(X_C_TaxDeclarationAcct a) {
		return proxy(C_TaxDeclarationAcctAssert.class, X_C_TaxDeclarationAcct.class, a);
	}

	default C_TaxDeclarationLineAssert assertThat(X_C_TaxDeclarationLine a) {
		return proxy(C_TaxDeclarationLineAssert.class, X_C_TaxDeclarationLine.class, a);
	}

	default C_TaxPostalAssert assertThat(X_C_TaxPostal a) {
		return proxy(C_TaxPostalAssert.class, X_C_TaxPostal.class, a);
	}

	default C_TaxProviderAssert assertThat(X_C_TaxProvider a) {
		return proxy(C_TaxProviderAssert.class, X_C_TaxProvider.class, a);
	}

	default C_TaxProviderCfgAssert assertThat(X_C_TaxProviderCfg a) {
		return proxy(C_TaxProviderCfgAssert.class, X_C_TaxProviderCfg.class, a);
	}

	default C_UOMAssert assertThat(X_C_UOM a) {
		return proxy(C_UOMAssert.class, X_C_UOM.class, a);
	}

	default C_UOM_ConversionAssert assertThat(X_C_UOM_Conversion a) {
		return proxy(C_UOM_ConversionAssert.class, X_C_UOM_Conversion.class, a);
	}

	default C_UserRemunerationAssert assertThat(X_C_UserRemuneration a) {
		return proxy(C_UserRemunerationAssert.class, X_C_UserRemuneration.class, a);
	}

	default C_ValidCombinationAssert assertThat(X_C_ValidCombination a) {
		return proxy(C_ValidCombinationAssert.class, X_C_ValidCombination.class, a);
	}

	default C_WithholdingAssert assertThat(X_C_Withholding a) {
		return proxy(C_WithholdingAssert.class, X_C_Withholding.class, a);
	}

	default C_Withholding_AcctAssert assertThat(X_C_Withholding_Acct a) {
		return proxy(C_Withholding_AcctAssert.class, X_C_Withholding_Acct.class, a);
	}

	default C_YearAssert assertThat(X_C_Year a) {
		return proxy(C_YearAssert.class, X_C_Year.class, a);
	}

	default CM_AccessContainerAssert assertThat(X_CM_AccessContainer a) {
		return proxy(CM_AccessContainerAssert.class, X_CM_AccessContainer.class, a);
	}

	default CM_AccessListBPGroupAssert assertThat(X_CM_AccessListBPGroup a) {
		return proxy(CM_AccessListBPGroupAssert.class, X_CM_AccessListBPGroup.class, a);
	}

	default CM_AccessListRoleAssert assertThat(X_CM_AccessListRole a) {
		return proxy(CM_AccessListRoleAssert.class, X_CM_AccessListRole.class, a);
	}

	default CM_AccessMediaAssert assertThat(X_CM_AccessMedia a) {
		return proxy(CM_AccessMediaAssert.class, X_CM_AccessMedia.class, a);
	}

	default CM_AccessNewsChannelAssert assertThat(X_CM_AccessNewsChannel a) {
		return proxy(CM_AccessNewsChannelAssert.class, X_CM_AccessNewsChannel.class, a);
	}

	default CM_AccessProfileAssert assertThat(X_CM_AccessProfile a) {
		return proxy(CM_AccessProfileAssert.class, X_CM_AccessProfile.class, a);
	}

	default CM_AccessStageAssert assertThat(X_CM_AccessStage a) {
		return proxy(CM_AccessStageAssert.class, X_CM_AccessStage.class, a);
	}

	default CM_AdAssert assertThat(X_CM_Ad a) {
		return proxy(CM_AdAssert.class, X_CM_Ad.class, a);
	}

	default CM_Ad_CatAssert assertThat(X_CM_Ad_Cat a) {
		return proxy(CM_Ad_CatAssert.class, X_CM_Ad_Cat.class, a);
	}

	default CM_BroadcastServerAssert assertThat(X_CM_BroadcastServer a) {
		return proxy(CM_BroadcastServerAssert.class, X_CM_BroadcastServer.class, a);
	}

	default CM_ChatAssert assertThat(X_CM_Chat a) {
		return proxy(CM_ChatAssert.class, X_CM_Chat.class, a);
	}

	default CM_ChatEntryAssert assertThat(X_CM_ChatEntry a) {
		return proxy(CM_ChatEntryAssert.class, X_CM_ChatEntry.class, a);
	}

	default CM_ChatTypeAssert assertThat(X_CM_ChatType a) {
		return proxy(CM_ChatTypeAssert.class, X_CM_ChatType.class, a);
	}

	default CM_ChatTypeUpdateAssert assertThat(X_CM_ChatTypeUpdate a) {
		return proxy(CM_ChatTypeUpdateAssert.class, X_CM_ChatTypeUpdate.class, a);
	}

	default CM_ChatUpdateAssert assertThat(X_CM_ChatUpdate a) {
		return proxy(CM_ChatUpdateAssert.class, X_CM_ChatUpdate.class, a);
	}

	default CM_ContainerAssert assertThat(X_CM_Container a) {
		return proxy(CM_ContainerAssert.class, X_CM_Container.class, a);
	}

	default CM_Container_ElementAssert assertThat(X_CM_Container_Element a) {
		return proxy(CM_Container_ElementAssert.class, X_CM_Container_Element.class, a);
	}

	default CM_Container_URLAssert assertThat(X_CM_Container_URL a) {
		return proxy(CM_Container_URLAssert.class, X_CM_Container_URL.class, a);
	}

	default CM_ContainerTTableAssert assertThat(X_CM_ContainerTTable a) {
		return proxy(CM_ContainerTTableAssert.class, X_CM_ContainerTTable.class, a);
	}

	default CM_CStageAssert assertThat(X_CM_CStage a) {
		return proxy(CM_CStageAssert.class, X_CM_CStage.class, a);
	}

	default CM_CStage_ElementAssert assertThat(X_CM_CStage_Element a) {
		return proxy(CM_CStage_ElementAssert.class, X_CM_CStage_Element.class, a);
	}

	default CM_CStageTTableAssert assertThat(X_CM_CStageTTable a) {
		return proxy(CM_CStageTTableAssert.class, X_CM_CStageTTable.class, a);
	}

	default CM_MediaAssert assertThat(X_CM_Media a) {
		return proxy(CM_MediaAssert.class, X_CM_Media.class, a);
	}

	default CM_Media_ServerAssert assertThat(X_CM_Media_Server a) {
		return proxy(CM_Media_ServerAssert.class, X_CM_Media_Server.class, a);
	}

	default CM_MediaDeployAssert assertThat(X_CM_MediaDeploy a) {
		return proxy(CM_MediaDeployAssert.class, X_CM_MediaDeploy.class, a);
	}

	default CM_NewsChannelAssert assertThat(X_CM_NewsChannel a) {
		return proxy(CM_NewsChannelAssert.class, X_CM_NewsChannel.class, a);
	}

	default CM_NewsItemAssert assertThat(X_CM_NewsItem a) {
		return proxy(CM_NewsItemAssert.class, X_CM_NewsItem.class, a);
	}

	default CM_TemplateAssert assertThat(X_CM_Template a) {
		return proxy(CM_TemplateAssert.class, X_CM_Template.class, a);
	}

	default CM_Template_Ad_CatAssert assertThat(X_CM_Template_Ad_Cat a) {
		return proxy(CM_Template_Ad_CatAssert.class, X_CM_Template_Ad_Cat.class, a);
	}

	default CM_TemplateTableAssert assertThat(X_CM_TemplateTable a) {
		return proxy(CM_TemplateTableAssert.class, X_CM_TemplateTable.class, a);
	}

	default CM_WebAccessLogAssert assertThat(X_CM_WebAccessLog a) {
		return proxy(CM_WebAccessLogAssert.class, X_CM_WebAccessLog.class, a);
	}

	default CM_WebProjectAssert assertThat(X_CM_WebProject a) {
		return proxy(CM_WebProjectAssert.class, X_CM_WebProject.class, a);
	}

	default CM_WebProject_DomainAssert assertThat(X_CM_WebProject_Domain a) {
		return proxy(CM_WebProject_DomainAssert.class, X_CM_WebProject_Domain.class, a);
	}

	default CM_WikiTokenAssert assertThat(X_CM_WikiToken a) {
		return proxy(CM_WikiTokenAssert.class, X_CM_WikiToken.class, a);
	}

	default Fact_AcctAssert assertThat(X_Fact_Acct a) {
		return proxy(Fact_AcctAssert.class, X_Fact_Acct.class, a);
	}

	default Fact_Acct_SummaryAssert assertThat(X_Fact_Acct_Summary a) {
		return proxy(Fact_Acct_SummaryAssert.class, X_Fact_Acct_Summary.class, a);
	}

	default Fact_ReconciliationAssert assertThat(X_Fact_Reconciliation a) {
		return proxy(Fact_ReconciliationAssert.class, X_Fact_Reconciliation.class, a);
	}

	default GL_BudgetAssert assertThat(X_GL_Budget a) {
		return proxy(GL_BudgetAssert.class, X_GL_Budget.class, a);
	}

	default GL_BudgetControlAssert assertThat(X_GL_BudgetControl a) {
		return proxy(GL_BudgetControlAssert.class, X_GL_BudgetControl.class, a);
	}

	default GL_CategoryAssert assertThat(X_GL_Category a) {
		return proxy(GL_CategoryAssert.class, X_GL_Category.class, a);
	}

	default GL_DistributionAssert assertThat(X_GL_Distribution a) {
		return proxy(GL_DistributionAssert.class, X_GL_Distribution.class, a);
	}

	default GL_DistributionLineAssert assertThat(X_GL_DistributionLine a) {
		return proxy(GL_DistributionLineAssert.class, X_GL_DistributionLine.class, a);
	}

	default GL_FundAssert assertThat(X_GL_Fund a) {
		return proxy(GL_FundAssert.class, X_GL_Fund.class, a);
	}

	default GL_FundRestrictionAssert assertThat(X_GL_FundRestriction a) {
		return proxy(GL_FundRestrictionAssert.class, X_GL_FundRestriction.class, a);
	}

	default GL_JournalAssert assertThat(X_GL_Journal a) {
		return proxy(GL_JournalAssert.class, X_GL_Journal.class, a);
	}

	default GL_JournalBatchAssert assertThat(X_GL_JournalBatch a) {
		return proxy(GL_JournalBatchAssert.class, X_GL_JournalBatch.class, a);
	}

	default GL_JournalGeneratorAssert assertThat(X_GL_JournalGenerator a) {
		return proxy(GL_JournalGeneratorAssert.class, X_GL_JournalGenerator.class, a);
	}

	default GL_JournalGeneratorLineAssert assertThat(X_GL_JournalGeneratorLine a) {
		return proxy(GL_JournalGeneratorLineAssert.class, X_GL_JournalGeneratorLine.class, a);
	}

	default GL_JournalGeneratorSourceAssert assertThat(X_GL_JournalGeneratorSource a) {
		return proxy(GL_JournalGeneratorSourceAssert.class, X_GL_JournalGeneratorSource.class, a);
	}

	default GL_JournalLineAssert assertThat(X_GL_JournalLine a) {
		return proxy(GL_JournalLineAssert.class, X_GL_JournalLine.class, a);
	}

	default I_AssetAssert assertThat(X_I_Asset a) {
		return proxy(I_AssetAssert.class, X_I_Asset.class, a);
	}

	default I_BankStatementAssert assertThat(X_I_BankStatement a) {
		return proxy(I_BankStatementAssert.class, X_I_BankStatement.class, a);
	}

	default I_BPartnerAssert assertThat(X_I_BPartner a) {
		return proxy(I_BPartnerAssert.class, X_I_BPartner.class, a);
	}

	default I_Conversion_RateAssert assertThat(X_I_Conversion_Rate a) {
		return proxy(I_Conversion_RateAssert.class, X_I_Conversion_Rate.class, a);
	}

	default I_ElementValueAssert assertThat(X_I_ElementValue a) {
		return proxy(I_ElementValueAssert.class, X_I_ElementValue.class, a);
	}

	default I_FAJournalAssert assertThat(X_I_FAJournal a) {
		return proxy(I_FAJournalAssert.class, X_I_FAJournal.class, a);
	}

	default I_FixedAssetAssert assertThat(X_I_FixedAsset a) {
		return proxy(I_FixedAssetAssert.class, X_I_FixedAsset.class, a);
	}

	default I_GLJournalAssert assertThat(X_I_GLJournal a) {
		return proxy(I_GLJournalAssert.class, X_I_GLJournal.class, a);
	}

	default I_InOutLineConfirmAssert assertThat(X_I_InOutLineConfirm a) {
		return proxy(I_InOutLineConfirmAssert.class, X_I_InOutLineConfirm.class, a);
	}

	default I_InventoryAssert assertThat(X_I_Inventory a) {
		return proxy(I_InventoryAssert.class, X_I_Inventory.class, a);
	}

	default I_InvoiceAssert assertThat(X_I_Invoice a) {
		return proxy(I_InvoiceAssert.class, X_I_Invoice.class, a);
	}

	default I_OrderAssert assertThat(X_I_Order a) {
		return proxy(I_OrderAssert.class, X_I_Order.class, a);
	}

	default I_PaymentAssert assertThat(X_I_Payment a) {
		return proxy(I_PaymentAssert.class, X_I_Payment.class, a);
	}

	default I_PriceListAssert assertThat(X_I_PriceList a) {
		return proxy(I_PriceListAssert.class, X_I_PriceList.class, a);
	}

	default I_ProductAssert assertThat(X_I_Product a) {
		return proxy(I_ProductAssert.class, X_I_Product.class, a);
	}

	default I_ReportLineAssert assertThat(X_I_ReportLine a) {
		return proxy(I_ReportLineAssert.class, X_I_ReportLine.class, a);
	}

	default K_CategoryAssert assertThat(X_K_Category a) {
		return proxy(K_CategoryAssert.class, X_K_Category.class, a);
	}

	default K_CategoryValueAssert assertThat(X_K_CategoryValue a) {
		return proxy(K_CategoryValueAssert.class, X_K_CategoryValue.class, a);
	}

	default K_CommentAssert assertThat(X_K_Comment a) {
		return proxy(K_CommentAssert.class, X_K_Comment.class, a);
	}

	default K_EntryAssert assertThat(X_K_Entry a) {
		return proxy(K_EntryAssert.class, X_K_Entry.class, a);
	}

	default K_EntryCategoryAssert assertThat(X_K_EntryCategory a) {
		return proxy(K_EntryCategoryAssert.class, X_K_EntryCategory.class, a);
	}

	default K_EntryRelatedAssert assertThat(X_K_EntryRelated a) {
		return proxy(K_EntryRelatedAssert.class, X_K_EntryRelated.class, a);
	}

	default K_IndexAssert assertThat(X_K_Index a) {
		return proxy(K_IndexAssert.class, X_K_Index.class, a);
	}

	default K_IndexLogAssert assertThat(X_K_IndexLog a) {
		return proxy(K_IndexLogAssert.class, X_K_IndexLog.class, a);
	}

	default K_IndexStopAssert assertThat(X_K_IndexStop a) {
		return proxy(K_IndexStopAssert.class, X_K_IndexStop.class, a);
	}

	default K_SourceAssert assertThat(X_K_Source a) {
		return proxy(K_SourceAssert.class, X_K_Source.class, a);
	}

	default K_SynonymAssert assertThat(X_K_Synonym a) {
		return proxy(K_SynonymAssert.class, X_K_Synonym.class, a);
	}

	default K_TopicAssert assertThat(X_K_Topic a) {
		return proxy(K_TopicAssert.class, X_K_Topic.class, a);
	}

	default K_TypeAssert assertThat(X_K_Type a) {
		return proxy(K_TypeAssert.class, X_K_Type.class, a);
	}

	default M_AttributeAssert assertThat(X_M_Attribute a) {
		return proxy(M_AttributeAssert.class, X_M_Attribute.class, a);
	}

	default M_AttributeInstanceAssert assertThat(X_M_AttributeInstance a) {
		return proxy(M_AttributeInstanceAssert.class, X_M_AttributeInstance.class, a);
	}

	default M_AttributeSearchAssert assertThat(X_M_AttributeSearch a) {
		return proxy(M_AttributeSearchAssert.class, X_M_AttributeSearch.class, a);
	}

	default M_AttributeSetAssert assertThat(X_M_AttributeSet a) {
		return proxy(M_AttributeSetAssert.class, X_M_AttributeSet.class, a);
	}

	default M_AttributeSetExcludeAssert assertThat(X_M_AttributeSetExclude a) {
		return proxy(M_AttributeSetExcludeAssert.class, X_M_AttributeSetExclude.class, a);
	}

	default M_AttributeSetInstanceAssert assertThat(X_M_AttributeSetInstance a) {
		return proxy(M_AttributeSetInstanceAssert.class, X_M_AttributeSetInstance.class, a);
	}

	default M_AttributeUseAssert assertThat(X_M_AttributeUse a) {
		return proxy(M_AttributeUseAssert.class, X_M_AttributeUse.class, a);
	}

	default M_AttributeValueAssert assertThat(X_M_AttributeValue a) {
		return proxy(M_AttributeValueAssert.class, X_M_AttributeValue.class, a);
	}

	default M_BOMAssert assertThat(X_M_BOM a) {
		return proxy(M_BOMAssert.class, X_M_BOM.class, a);
	}

	default M_BOMAlternativeAssert assertThat(X_M_BOMAlternative a) {
		return proxy(M_BOMAlternativeAssert.class, X_M_BOMAlternative.class, a);
	}

	default M_BOMProductAssert assertThat(X_M_BOMProduct a) {
		return proxy(M_BOMProductAssert.class, X_M_BOMProduct.class, a);
	}

	default M_BP_PriceAssert assertThat(X_M_BP_Price a) {
		return proxy(M_BP_PriceAssert.class, X_M_BP_Price.class, a);
	}

	default M_ChangeNoticeAssert assertThat(X_M_ChangeNotice a) {
		return proxy(M_ChangeNoticeAssert.class, X_M_ChangeNotice.class, a);
	}

	default M_ChangeRequestAssert assertThat(X_M_ChangeRequest a) {
		return proxy(M_ChangeRequestAssert.class, X_M_ChangeRequest.class, a);
	}

	default M_CommodityShipmentAssert assertThat(X_M_CommodityShipment a) {
		return proxy(M_CommodityShipmentAssert.class, X_M_CommodityShipment.class, a);
	}

	default M_CostAssert assertThat(X_M_Cost a) {
		return proxy(M_CostAssert.class, X_M_Cost.class, a);
	}

	default M_CostDetailAssert assertThat(X_M_CostDetail a) {
		return proxy(M_CostDetailAssert.class, X_M_CostDetail.class, a);
	}

	default M_CostElementAssert assertThat(X_M_CostElement a) {
		return proxy(M_CostElementAssert.class, X_M_CostElement.class, a);
	}

	default M_CostHistoryAssert assertThat(X_M_CostHistory a) {
		return proxy(M_CostHistoryAssert.class, X_M_CostHistory.class, a);
	}

	default M_CostQueueAssert assertThat(X_M_CostQueue a) {
		return proxy(M_CostQueueAssert.class, X_M_CostQueue.class, a);
	}

	default M_CostTypeAssert assertThat(X_M_CostType a) {
		return proxy(M_CostTypeAssert.class, X_M_CostType.class, a);
	}

	default M_DemandAssert assertThat(X_M_Demand a) {
		return proxy(M_DemandAssert.class, X_M_Demand.class, a);
	}

	default M_DemandDetailAssert assertThat(X_M_DemandDetail a) {
		return proxy(M_DemandDetailAssert.class, X_M_DemandDetail.class, a);
	}

	default M_DemandLineAssert assertThat(X_M_DemandLine a) {
		return proxy(M_DemandLineAssert.class, X_M_DemandLine.class, a);
	}

	default M_DiscountSchemaAssert assertThat(X_M_DiscountSchema a) {
		return proxy(M_DiscountSchemaAssert.class, X_M_DiscountSchema.class, a);
	}

	default M_DiscountSchemaBreakAssert assertThat(X_M_DiscountSchemaBreak a) {
		return proxy(M_DiscountSchemaBreakAssert.class, X_M_DiscountSchemaBreak.class, a);
	}

	default M_DiscountSchemaLineAssert assertThat(X_M_DiscountSchemaLine a) {
		return proxy(M_DiscountSchemaLineAssert.class, X_M_DiscountSchemaLine.class, a);
	}

	default M_DistributionListAssert assertThat(X_M_DistributionList a) {
		return proxy(M_DistributionListAssert.class, X_M_DistributionList.class, a);
	}

	default M_DistributionListLineAssert assertThat(X_M_DistributionListLine a) {
		return proxy(M_DistributionListLineAssert.class, X_M_DistributionListLine.class, a);
	}

	default M_DistributionRunAssert assertThat(X_M_DistributionRun a) {
		return proxy(M_DistributionRunAssert.class, X_M_DistributionRun.class, a);
	}

	default M_DistributionRunLineAssert assertThat(X_M_DistributionRunLine a) {
		return proxy(M_DistributionRunLineAssert.class, X_M_DistributionRunLine.class, a);
	}

	default M_ForecastAssert assertThat(X_M_Forecast a) {
		return proxy(M_ForecastAssert.class, X_M_Forecast.class, a);
	}

	default M_ForecastLineAssert assertThat(X_M_ForecastLine a) {
		return proxy(M_ForecastLineAssert.class, X_M_ForecastLine.class, a);
	}

	default M_FreightAssert assertThat(X_M_Freight a) {
		return proxy(M_FreightAssert.class, X_M_Freight.class, a);
	}

	default M_FreightCategoryAssert assertThat(X_M_FreightCategory a) {
		return proxy(M_FreightCategoryAssert.class, X_M_FreightCategory.class, a);
	}

	default M_InOutAssert assertThat(X_M_InOut a) {
		return proxy(M_InOutAssert.class, X_M_InOut.class, a);
	}

	default M_InOutConfirmAssert assertThat(X_M_InOutConfirm a) {
		return proxy(M_InOutConfirmAssert.class, X_M_InOutConfirm.class, a);
	}

	default M_InOutLineAssert assertThat(X_M_InOutLine a) {
		return proxy(M_InOutLineAssert.class, X_M_InOutLine.class, a);
	}

	default M_InOutLineConfirmAssert assertThat(X_M_InOutLineConfirm a) {
		return proxy(M_InOutLineConfirmAssert.class, X_M_InOutLineConfirm.class, a);
	}

	default M_InOutLineMAAssert assertThat(X_M_InOutLineMA a) {
		return proxy(M_InOutLineMAAssert.class, X_M_InOutLineMA.class, a);
	}

	default M_InventoryAssert assertThat(X_M_Inventory a) {
		return proxy(M_InventoryAssert.class, X_M_Inventory.class, a);
	}

	default M_InventoryLineAssert assertThat(X_M_InventoryLine a) {
		return proxy(M_InventoryLineAssert.class, X_M_InventoryLine.class, a);
	}

	default M_InventoryLineMAAssert assertThat(X_M_InventoryLineMA a) {
		return proxy(M_InventoryLineMAAssert.class, X_M_InventoryLineMA.class, a);
	}

	default M_LocatorAssert assertThat(X_M_Locator a) {
		return proxy(M_LocatorAssert.class, X_M_Locator.class, a);
	}

	default M_LocatorTypeAssert assertThat(X_M_LocatorType a) {
		return proxy(M_LocatorTypeAssert.class, X_M_LocatorType.class, a);
	}

	default M_LotAssert assertThat(X_M_Lot a) {
		return proxy(M_LotAssert.class, X_M_Lot.class, a);
	}

	default M_LotCtlAssert assertThat(X_M_LotCtl a) {
		return proxy(M_LotCtlAssert.class, X_M_LotCtl.class, a);
	}

	default M_LotCtlExcludeAssert assertThat(X_M_LotCtlExclude a) {
		return proxy(M_LotCtlExcludeAssert.class, X_M_LotCtlExclude.class, a);
	}

	default M_MatchInvAssert assertThat(X_M_MatchInv a) {
		return proxy(M_MatchInvAssert.class, X_M_MatchInv.class, a);
	}

	default M_MatchPOAssert assertThat(X_M_MatchPO a) {
		return proxy(M_MatchPOAssert.class, X_M_MatchPO.class, a);
	}

	default M_MovementAssert assertThat(X_M_Movement a) {
		return proxy(M_MovementAssert.class, X_M_Movement.class, a);
	}

	default M_MovementConfirmAssert assertThat(X_M_MovementConfirm a) {
		return proxy(M_MovementConfirmAssert.class, X_M_MovementConfirm.class, a);
	}

	default M_MovementLineAssert assertThat(X_M_MovementLine a) {
		return proxy(M_MovementLineAssert.class, X_M_MovementLine.class, a);
	}

	default M_MovementLineConfirmAssert assertThat(X_M_MovementLineConfirm a) {
		return proxy(M_MovementLineConfirmAssert.class, X_M_MovementLineConfirm.class, a);
	}

	default M_MovementLineMAAssert assertThat(X_M_MovementLineMA a) {
		return proxy(M_MovementLineMAAssert.class, X_M_MovementLineMA.class, a);
	}

	default M_OperationResourceAssert assertThat(X_M_OperationResource a) {
		return proxy(M_OperationResourceAssert.class, X_M_OperationResource.class, a);
	}

	default M_PackageAssert assertThat(X_M_Package a) {
		return proxy(M_PackageAssert.class, X_M_Package.class, a);
	}

	default M_PackageLineAssert assertThat(X_M_PackageLine a) {
		return proxy(M_PackageLineAssert.class, X_M_PackageLine.class, a);
	}

	default M_PackageMPSAssert assertThat(X_M_PackageMPS a) {
		return proxy(M_PackageMPSAssert.class, X_M_PackageMPS.class, a);
	}

	default M_PartTypeAssert assertThat(X_M_PartType a) {
		return proxy(M_PartTypeAssert.class, X_M_PartType.class, a);
	}

	default M_PerpetualInvAssert assertThat(X_M_PerpetualInv a) {
		return proxy(M_PerpetualInvAssert.class, X_M_PerpetualInv.class, a);
	}

	default M_PriceListAssert assertThat(X_M_PriceList a) {
		return proxy(M_PriceListAssert.class, X_M_PriceList.class, a);
	}

	default M_PriceList_VersionAssert assertThat(X_M_PriceList_Version a) {
		return proxy(M_PriceList_VersionAssert.class, X_M_PriceList_Version.class, a);
	}

	default M_ProductAssert assertThat(X_M_Product a) {
		return proxy(M_ProductAssert.class, X_M_Product.class, a);
	}

	default M_Product_AcctAssert assertThat(X_M_Product_Acct a) {
		return proxy(M_Product_AcctAssert.class, X_M_Product_Acct.class, a);
	}

	default M_Product_BOMAssert assertThat(X_M_Product_BOM a) {
		return proxy(M_Product_BOMAssert.class, X_M_Product_BOM.class, a);
	}

	default M_Product_CategoryAssert assertThat(X_M_Product_Category a) {
		return proxy(M_Product_CategoryAssert.class, X_M_Product_Category.class, a);
	}

	default M_Product_Category_AcctAssert assertThat(X_M_Product_Category_Acct a) {
		return proxy(M_Product_Category_AcctAssert.class, X_M_Product_Category_Acct.class, a);
	}

	default M_Product_POAssert assertThat(X_M_Product_PO a) {
		return proxy(M_Product_POAssert.class, X_M_Product_PO.class, a);
	}

	default M_Product_QualityTestAssert assertThat(X_M_Product_QualityTest a) {
		return proxy(M_Product_QualityTestAssert.class, X_M_Product_QualityTest.class, a);
	}

	default M_ProductDownloadAssert assertThat(X_M_ProductDownload a) {
		return proxy(M_ProductDownloadAssert.class, X_M_ProductDownload.class, a);
	}

	default M_ProductionAssert assertThat(X_M_Production a) {
		return proxy(M_ProductionAssert.class, X_M_Production.class, a);
	}

	default M_ProductionLineAssert assertThat(X_M_ProductionLine a) {
		return proxy(M_ProductionLineAssert.class, X_M_ProductionLine.class, a);
	}

	default M_ProductionLineMAAssert assertThat(X_M_ProductionLineMA a) {
		return proxy(M_ProductionLineMAAssert.class, X_M_ProductionLineMA.class, a);
	}

	default M_ProductionPlanAssert assertThat(X_M_ProductionPlan a) {
		return proxy(M_ProductionPlanAssert.class, X_M_ProductionPlan.class, a);
	}

	default M_ProductOperationAssert assertThat(X_M_ProductOperation a) {
		return proxy(M_ProductOperationAssert.class, X_M_ProductOperation.class, a);
	}

	default M_ProductPriceAssert assertThat(X_M_ProductPrice a) {
		return proxy(M_ProductPriceAssert.class, X_M_ProductPrice.class, a);
	}

	default M_ProductPriceVendorBreakAssert assertThat(X_M_ProductPriceVendorBreak a) {
		return proxy(M_ProductPriceVendorBreakAssert.class, X_M_ProductPriceVendorBreak.class, a);
	}

	default M_PromotionAssert assertThat(X_M_Promotion a) {
		return proxy(M_PromotionAssert.class, X_M_Promotion.class, a);
	}

	default M_PromotionDistributionAssert assertThat(X_M_PromotionDistribution a) {
		return proxy(M_PromotionDistributionAssert.class, X_M_PromotionDistribution.class, a);
	}

	default M_PromotionGroupAssert assertThat(X_M_PromotionGroup a) {
		return proxy(M_PromotionGroupAssert.class, X_M_PromotionGroup.class, a);
	}

	default M_PromotionGroupLineAssert assertThat(X_M_PromotionGroupLine a) {
		return proxy(M_PromotionGroupLineAssert.class, X_M_PromotionGroupLine.class, a);
	}

	default M_PromotionLineAssert assertThat(X_M_PromotionLine a) {
		return proxy(M_PromotionLineAssert.class, X_M_PromotionLine.class, a);
	}

	default M_PromotionPreConditionAssert assertThat(X_M_PromotionPreCondition a) {
		return proxy(M_PromotionPreConditionAssert.class, X_M_PromotionPreCondition.class, a);
	}

	default M_PromotionRewardAssert assertThat(X_M_PromotionReward a) {
		return proxy(M_PromotionRewardAssert.class, X_M_PromotionReward.class, a);
	}

	default M_QualityTestAssert assertThat(X_M_QualityTest a) {
		return proxy(M_QualityTestAssert.class, X_M_QualityTest.class, a);
	}

	default M_QualityTestResultAssert assertThat(X_M_QualityTestResult a) {
		return proxy(M_QualityTestResultAssert.class, X_M_QualityTestResult.class, a);
	}

	default M_RelatedProductAssert assertThat(X_M_RelatedProduct a) {
		return proxy(M_RelatedProductAssert.class, X_M_RelatedProduct.class, a);
	}

	default M_ReplenishAssert assertThat(X_M_Replenish a) {
		return proxy(M_ReplenishAssert.class, X_M_Replenish.class, a);
	}

	default M_RequisitionAssert assertThat(X_M_Requisition a) {
		return proxy(M_RequisitionAssert.class, X_M_Requisition.class, a);
	}

	default M_RequisitionLineAssert assertThat(X_M_RequisitionLine a) {
		return proxy(M_RequisitionLineAssert.class, X_M_RequisitionLine.class, a);
	}

	default M_RMAAssert assertThat(X_M_RMA a) {
		return proxy(M_RMAAssert.class, X_M_RMA.class, a);
	}

	default M_RMALineAssert assertThat(X_M_RMALine a) {
		return proxy(M_RMALineAssert.class, X_M_RMALine.class, a);
	}

	default M_RMATaxAssert assertThat(X_M_RMATax a) {
		return proxy(M_RMATaxAssert.class, X_M_RMATax.class, a);
	}

	default M_RMATypeAssert assertThat(X_M_RMAType a) {
		return proxy(M_RMATypeAssert.class, X_M_RMAType.class, a);
	}

	default M_SerNoCtlAssert assertThat(X_M_SerNoCtl a) {
		return proxy(M_SerNoCtlAssert.class, X_M_SerNoCtl.class, a);
	}

	default M_SerNoCtlExcludeAssert assertThat(X_M_SerNoCtlExclude a) {
		return proxy(M_SerNoCtlExcludeAssert.class, X_M_SerNoCtlExclude.class, a);
	}

	default M_ShipperAssert assertThat(X_M_Shipper a) {
		return proxy(M_ShipperAssert.class, X_M_Shipper.class, a);
	}

	default M_ShipperCfgAssert assertThat(X_M_ShipperCfg a) {
		return proxy(M_ShipperCfgAssert.class, X_M_ShipperCfg.class, a);
	}

	default M_ShipperLabelsAssert assertThat(X_M_ShipperLabels a) {
		return proxy(M_ShipperLabelsAssert.class, X_M_ShipperLabels.class, a);
	}

	default M_ShipperLabelsCfgAssert assertThat(X_M_ShipperLabelsCfg a) {
		return proxy(M_ShipperLabelsCfgAssert.class, X_M_ShipperLabelsCfg.class, a);
	}

	default M_ShipperPackagingAssert assertThat(X_M_ShipperPackaging a) {
		return proxy(M_ShipperPackagingAssert.class, X_M_ShipperPackaging.class, a);
	}

	default M_ShipperPackagingCfgAssert assertThat(X_M_ShipperPackagingCfg a) {
		return proxy(M_ShipperPackagingCfgAssert.class, X_M_ShipperPackagingCfg.class, a);
	}

	default M_ShipperPickupTypesAssert assertThat(X_M_ShipperPickupTypes a) {
		return proxy(M_ShipperPickupTypesAssert.class, X_M_ShipperPickupTypes.class, a);
	}

	default M_ShipperPickupTypesCfgAssert assertThat(X_M_ShipperPickupTypesCfg a) {
		return proxy(M_ShipperPickupTypesCfgAssert.class, X_M_ShipperPickupTypesCfg.class, a);
	}

	default M_ShippingProcessorAssert assertThat(X_M_ShippingProcessor a) {
		return proxy(M_ShippingProcessorAssert.class, X_M_ShippingProcessor.class, a);
	}

	default M_ShippingProcessorCfgAssert assertThat(X_M_ShippingProcessorCfg a) {
		return proxy(M_ShippingProcessorCfgAssert.class, X_M_ShippingProcessorCfg.class, a);
	}

	default M_ShippingTransactionAssert assertThat(X_M_ShippingTransaction a) {
		return proxy(M_ShippingTransactionAssert.class, X_M_ShippingTransaction.class, a);
	}

	default M_ShippingTransactionLineAssert assertThat(X_M_ShippingTransactionLine a) {
		return proxy(M_ShippingTransactionLineAssert.class, X_M_ShippingTransactionLine.class, a);
	}

	default M_StorageOnHandAssert assertThat(X_M_StorageOnHand a) {
		return proxy(M_StorageOnHandAssert.class, X_M_StorageOnHand.class, a);
	}

	default M_StorageReservationAssert assertThat(X_M_StorageReservation a) {
		return proxy(M_StorageReservationAssert.class, X_M_StorageReservation.class, a);
	}

	default M_SubstituteAssert assertThat(X_M_Substitute a) {
		return proxy(M_SubstituteAssert.class, X_M_Substitute.class, a);
	}

	default M_TransactionAssert assertThat(X_M_Transaction a) {
		return proxy(M_TransactionAssert.class, X_M_Transaction.class, a);
	}

	default M_TransactionAllocationAssert assertThat(X_M_TransactionAllocation a) {
		return proxy(M_TransactionAllocationAssert.class, X_M_TransactionAllocation.class, a);
	}

	default M_WarehouseAssert assertThat(X_M_Warehouse a) {
		return proxy(M_WarehouseAssert.class, X_M_Warehouse.class, a);
	}

	default M_Warehouse_AcctAssert assertThat(X_M_Warehouse_Acct a) {
		return proxy(M_Warehouse_AcctAssert.class, X_M_Warehouse_Acct.class, a);
	}

	default PA_AchievementAssert assertThat(X_PA_Achievement a) {
		return proxy(PA_AchievementAssert.class, X_PA_Achievement.class, a);
	}

	default PA_BenchmarkAssert assertThat(X_PA_Benchmark a) {
		return proxy(PA_BenchmarkAssert.class, X_PA_Benchmark.class, a);
	}

	default PA_BenchmarkDataAssert assertThat(X_PA_BenchmarkData a) {
		return proxy(PA_BenchmarkDataAssert.class, X_PA_BenchmarkData.class, a);
	}

	default PA_ColorSchemaAssert assertThat(X_PA_ColorSchema a) {
		return proxy(PA_ColorSchemaAssert.class, X_PA_ColorSchema.class, a);
	}

	default PA_DashboardContentAssert assertThat(X_PA_DashboardContent a) {
		return proxy(PA_DashboardContentAssert.class, X_PA_DashboardContent.class, a);
	}

	default PA_DashboardContent_AccessAssert assertThat(X_PA_DashboardContent_Access a) {
		return proxy(PA_DashboardContent_AccessAssert.class, X_PA_DashboardContent_Access.class, a);
	}

	default PA_DashboardPreferenceAssert assertThat(X_PA_DashboardPreference a) {
		return proxy(PA_DashboardPreferenceAssert.class, X_PA_DashboardPreference.class, a);
	}

	default PA_DocumentStatusAssert assertThat(X_PA_DocumentStatus a) {
		return proxy(PA_DocumentStatusAssert.class, X_PA_DocumentStatus.class, a);
	}

	default PA_GoalAssert assertThat(X_PA_Goal a) {
		return proxy(PA_GoalAssert.class, X_PA_Goal.class, a);
	}

	default PA_GoalRestrictionAssert assertThat(X_PA_GoalRestriction a) {
		return proxy(PA_GoalRestrictionAssert.class, X_PA_GoalRestriction.class, a);
	}

	default PA_HierarchyAssert assertThat(X_PA_Hierarchy a) {
		return proxy(PA_HierarchyAssert.class, X_PA_Hierarchy.class, a);
	}

	default PA_MeasureAssert assertThat(X_PA_Measure a) {
		return proxy(PA_MeasureAssert.class, X_PA_Measure.class, a);
	}

	default PA_MeasureCalcAssert assertThat(X_PA_MeasureCalc a) {
		return proxy(PA_MeasureCalcAssert.class, X_PA_MeasureCalc.class, a);
	}

	default PA_RatioAssert assertThat(X_PA_Ratio a) {
		return proxy(PA_RatioAssert.class, X_PA_Ratio.class, a);
	}

	default PA_RatioElementAssert assertThat(X_PA_RatioElement a) {
		return proxy(PA_RatioElementAssert.class, X_PA_RatioElement.class, a);
	}

	default PA_ReportAssert assertThat(X_PA_Report a) {
		return proxy(PA_ReportAssert.class, X_PA_Report.class, a);
	}

	default PA_ReportColumnAssert assertThat(X_PA_ReportColumn a) {
		return proxy(PA_ReportColumnAssert.class, X_PA_ReportColumn.class, a);
	}

	default PA_ReportColumnSetAssert assertThat(X_PA_ReportColumnSet a) {
		return proxy(PA_ReportColumnSetAssert.class, X_PA_ReportColumnSet.class, a);
	}

	default PA_ReportCubeAssert assertThat(X_PA_ReportCube a) {
		return proxy(PA_ReportCubeAssert.class, X_PA_ReportCube.class, a);
	}

	default PA_ReportLineAssert assertThat(X_PA_ReportLine a) {
		return proxy(PA_ReportLineAssert.class, X_PA_ReportLine.class, a);
	}

	default PA_ReportLineSetAssert assertThat(X_PA_ReportLineSet a) {
		return proxy(PA_ReportLineSetAssert.class, X_PA_ReportLineSet.class, a);
	}

	default PA_ReportSourceAssert assertThat(X_PA_ReportSource a) {
		return proxy(PA_ReportSourceAssert.class, X_PA_ReportSource.class, a);
	}

	default PA_SLA_CriteriaAssert assertThat(X_PA_SLA_Criteria a) {
		return proxy(PA_SLA_CriteriaAssert.class, X_PA_SLA_Criteria.class, a);
	}

	default PA_SLA_GoalAssert assertThat(X_PA_SLA_Goal a) {
		return proxy(PA_SLA_GoalAssert.class, X_PA_SLA_Goal.class, a);
	}

	default PA_SLA_MeasureAssert assertThat(X_PA_SLA_Measure a) {
		return proxy(PA_SLA_MeasureAssert.class, X_PA_SLA_Measure.class, a);
	}

	default R_CategoryAssert assertThat(X_R_Category a) {
		return proxy(R_CategoryAssert.class, X_R_Category.class, a);
	}

	default R_CategoryUpdatesAssert assertThat(X_R_CategoryUpdates a) {
		return proxy(R_CategoryUpdatesAssert.class, X_R_CategoryUpdates.class, a);
	}

	default R_ContactInterestAssert assertThat(X_R_ContactInterest a) {
		return proxy(R_ContactInterestAssert.class, X_R_ContactInterest.class, a);
	}

	default R_GroupAssert assertThat(X_R_Group a) {
		return proxy(R_GroupAssert.class, X_R_Group.class, a);
	}

	default R_GroupUpdatesAssert assertThat(X_R_GroupUpdates a) {
		return proxy(R_GroupUpdatesAssert.class, X_R_GroupUpdates.class, a);
	}

	default R_InterestAreaAssert assertThat(X_R_InterestArea a) {
		return proxy(R_InterestAreaAssert.class, X_R_InterestArea.class, a);
	}

	default R_IssueKnownAssert assertThat(X_R_IssueKnown a) {
		return proxy(R_IssueKnownAssert.class, X_R_IssueKnown.class, a);
	}

	default R_IssueProjectAssert assertThat(X_R_IssueProject a) {
		return proxy(R_IssueProjectAssert.class, X_R_IssueProject.class, a);
	}

	default R_IssueRecommendationAssert assertThat(X_R_IssueRecommendation a) {
		return proxy(R_IssueRecommendationAssert.class, X_R_IssueRecommendation.class, a);
	}

	default R_IssueStatusAssert assertThat(X_R_IssueStatus a) {
		return proxy(R_IssueStatusAssert.class, X_R_IssueStatus.class, a);
	}

	default R_IssueSystemAssert assertThat(X_R_IssueSystem a) {
		return proxy(R_IssueSystemAssert.class, X_R_IssueSystem.class, a);
	}

	default R_IssueUserAssert assertThat(X_R_IssueUser a) {
		return proxy(R_IssueUserAssert.class, X_R_IssueUser.class, a);
	}

	default R_MailTextAssert assertThat(X_R_MailText a) {
		return proxy(R_MailTextAssert.class, X_R_MailText.class, a);
	}

	default R_RequestAssert assertThat(X_R_Request a) {
		return proxy(R_RequestAssert.class, X_R_Request.class, a);
	}

	default R_RequestActionAssert assertThat(X_R_RequestAction a) {
		return proxy(R_RequestActionAssert.class, X_R_RequestAction.class, a);
	}

	default R_RequestProcessorAssert assertThat(X_R_RequestProcessor a) {
		return proxy(R_RequestProcessorAssert.class, X_R_RequestProcessor.class, a);
	}

	default R_RequestProcessor_RouteAssert assertThat(X_R_RequestProcessor_Route a) {
		return proxy(R_RequestProcessor_RouteAssert.class, X_R_RequestProcessor_Route.class, a);
	}

	default R_RequestProcessorLogAssert assertThat(X_R_RequestProcessorLog a) {
		return proxy(R_RequestProcessorLogAssert.class, X_R_RequestProcessorLog.class, a);
	}

	default R_RequestTypeAssert assertThat(X_R_RequestType a) {
		return proxy(R_RequestTypeAssert.class, X_R_RequestType.class, a);
	}

	default R_RequestTypeUpdatesAssert assertThat(X_R_RequestTypeUpdates a) {
		return proxy(R_RequestTypeUpdatesAssert.class, X_R_RequestTypeUpdates.class, a);
	}

	default R_RequestUpdateAssert assertThat(X_R_RequestUpdate a) {
		return proxy(R_RequestUpdateAssert.class, X_R_RequestUpdate.class, a);
	}

	default R_RequestUpdatesAssert assertThat(X_R_RequestUpdates a) {
		return proxy(R_RequestUpdatesAssert.class, X_R_RequestUpdates.class, a);
	}

	default R_ResolutionAssert assertThat(X_R_Resolution a) {
		return proxy(R_ResolutionAssert.class, X_R_Resolution.class, a);
	}

	default R_StandardResponseAssert assertThat(X_R_StandardResponse a) {
		return proxy(R_StandardResponseAssert.class, X_R_StandardResponse.class, a);
	}

	default R_StatusAssert assertThat(X_R_Status a) {
		return proxy(R_StatusAssert.class, X_R_Status.class, a);
	}

	default R_StatusCategoryAssert assertThat(X_R_StatusCategory a) {
		return proxy(R_StatusCategoryAssert.class, X_R_StatusCategory.class, a);
	}

	default RV_BPartnerAssert assertThat(X_RV_BPartner a) {
		return proxy(RV_BPartnerAssert.class, X_RV_BPartner.class, a);
	}

	default RV_WarehousePriceAssert assertThat(X_RV_WarehousePrice a) {
		return proxy(RV_WarehousePriceAssert.class, X_RV_WarehousePrice.class, a);
	}

	default S_ExpenseTypeAssert assertThat(X_S_ExpenseType a) {
		return proxy(S_ExpenseTypeAssert.class, X_S_ExpenseType.class, a);
	}

	default S_ResourceAssert assertThat(X_S_Resource a) {
		return proxy(S_ResourceAssert.class, X_S_Resource.class, a);
	}

	default S_ResourceAssignmentAssert assertThat(X_S_ResourceAssignment a) {
		return proxy(S_ResourceAssignmentAssert.class, X_S_ResourceAssignment.class, a);
	}

	default S_ResourceTypeAssert assertThat(X_S_ResourceType a) {
		return proxy(S_ResourceTypeAssert.class, X_S_ResourceType.class, a);
	}

	default S_ResourceUnAvailableAssert assertThat(X_S_ResourceUnAvailable a) {
		return proxy(S_ResourceUnAvailableAssert.class, X_S_ResourceUnAvailable.class, a);
	}

	default S_TimeExpenseAssert assertThat(X_S_TimeExpense a) {
		return proxy(S_TimeExpenseAssert.class, X_S_TimeExpense.class, a);
	}

	default S_TimeExpenseLineAssert assertThat(X_S_TimeExpenseLine a) {
		return proxy(S_TimeExpenseLineAssert.class, X_S_TimeExpenseLine.class, a);
	}

	default S_TimeTypeAssert assertThat(X_S_TimeType a) {
		return proxy(S_TimeTypeAssert.class, X_S_TimeType.class, a);
	}

	default S_TrainingAssert assertThat(X_S_Training a) {
		return proxy(S_TrainingAssert.class, X_S_Training.class, a);
	}

	default S_Training_ClassAssert assertThat(X_S_Training_Class a) {
		return proxy(S_Training_ClassAssert.class, X_S_Training_Class.class, a);
	}

	default T_1099ExtractAssert assertThat(X_T_1099Extract a) {
		return proxy(T_1099ExtractAssert.class, X_T_1099Extract.class, a);
	}

	default T_AgingAssert assertThat(X_T_Aging a) {
		return proxy(T_AgingAssert.class, X_T_Aging.class, a);
	}

	default T_BankRegisterAssert assertThat(X_T_BankRegister a) {
		return proxy(T_BankRegisterAssert.class, X_T_BankRegister.class, a);
	}

	default T_BOM_IndentedAssert assertThat(X_T_BOM_Indented a) {
		return proxy(T_BOM_IndentedAssert.class, X_T_BOM_Indented.class, a);
	}

	default T_CashFlowAssert assertThat(X_T_CashFlow a) {
		return proxy(T_CashFlowAssert.class, X_T_CashFlow.class, a);
	}

	default T_DistributionRunDetailAssert assertThat(X_T_DistributionRunDetail a) {
		return proxy(T_DistributionRunDetailAssert.class, X_T_DistributionRunDetail.class, a);
	}

	default T_InventoryValueAssert assertThat(X_T_InventoryValue a) {
		return proxy(T_InventoryValueAssert.class, X_T_InventoryValue.class, a);
	}

	default T_InvoiceGLAssert assertThat(X_T_InvoiceGL a) {
		return proxy(T_InvoiceGLAssert.class, X_T_InvoiceGL.class, a);
	}

	default T_ReconciliationAssert assertThat(X_T_Reconciliation a) {
		return proxy(T_ReconciliationAssert.class, X_T_Reconciliation.class, a);
	}

	default T_ReplenishAssert assertThat(X_T_Replenish a) {
		return proxy(T_ReplenishAssert.class, X_T_Replenish.class, a);
	}

	default T_ReportAssert assertThat(X_T_Report a) {
		return proxy(T_ReportAssert.class, X_T_Report.class, a);
	}

	default T_ReportStatementAssert assertThat(X_T_ReportStatement a) {
		return proxy(T_ReportStatementAssert.class, X_T_ReportStatement.class, a);
	}

	default T_TransactionAssert assertThat(X_T_Transaction a) {
		return proxy(T_TransactionAssert.class, X_T_Transaction.class, a);
	}

	default TestAssert assertThat(X_Test a) {
		return proxy(TestAssert.class, X_Test.class, a);
	}

	default U_BlackListChequeAssert assertThat(X_U_BlackListCheque a) {
		return proxy(U_BlackListChequeAssert.class, X_U_BlackListCheque.class, a);
	}

	default U_POSTerminalAssert assertThat(X_U_POSTerminal a) {
		return proxy(U_POSTerminalAssert.class, X_U_POSTerminal.class, a);
	}

	default U_RoleMenuAssert assertThat(X_U_RoleMenu a) {
		return proxy(U_RoleMenuAssert.class, X_U_RoleMenu.class, a);
	}

	default U_Web_PropertiesAssert assertThat(X_U_Web_Properties a) {
		return proxy(U_Web_PropertiesAssert.class, X_U_Web_Properties.class, a);
	}

	default U_WebMenuAssert assertThat(X_U_WebMenu a) {
		return proxy(U_WebMenuAssert.class, X_U_WebMenu.class, a);
	}

	default W_AdvertisementAssert assertThat(X_W_Advertisement a) {
		return proxy(W_AdvertisementAssert.class, X_W_Advertisement.class, a);
	}

	default W_BasketAssert assertThat(X_W_Basket a) {
		return proxy(W_BasketAssert.class, X_W_Basket.class, a);
	}

	default W_BasketLineAssert assertThat(X_W_BasketLine a) {
		return proxy(W_BasketLineAssert.class, X_W_BasketLine.class, a);
	}

	default W_ClickAssert assertThat(X_W_Click a) {
		return proxy(W_ClickAssert.class, X_W_Click.class, a);
	}

	default W_ClickCountAssert assertThat(X_W_ClickCount a) {
		return proxy(W_ClickCountAssert.class, X_W_ClickCount.class, a);
	}

	default W_CounterAssert assertThat(X_W_Counter a) {
		return proxy(W_CounterAssert.class, X_W_Counter.class, a);
	}

	default W_CounterCountAssert assertThat(X_W_CounterCount a) {
		return proxy(W_CounterCountAssert.class, X_W_CounterCount.class, a);
	}

	default W_MailMsgAssert assertThat(X_W_MailMsg a) {
		return proxy(W_MailMsgAssert.class, X_W_MailMsg.class, a);
	}

	default W_StoreAssert assertThat(X_W_Store a) {
		return proxy(W_StoreAssert.class, X_W_Store.class, a);
	}

	default WS_WebServiceAssert assertThat(X_WS_WebService a) {
		return proxy(WS_WebServiceAssert.class, X_WS_WebService.class, a);
	}

	default WS_WebService_ParaAssert assertThat(X_WS_WebService_Para a) {
		return proxy(WS_WebService_ParaAssert.class, X_WS_WebService_Para.class, a);
	}

	default WS_WebServiceFieldInputAssert assertThat(X_WS_WebServiceFieldInput a) {
		return proxy(WS_WebServiceFieldInputAssert.class, X_WS_WebServiceFieldInput.class, a);
	}

	default WS_WebServiceFieldOutputAssert assertThat(X_WS_WebServiceFieldOutput a) {
		return proxy(WS_WebServiceFieldOutputAssert.class, X_WS_WebServiceFieldOutput.class, a);
	}

	default WS_WebServiceMethodAssert assertThat(X_WS_WebServiceMethod a) {
		return proxy(WS_WebServiceMethodAssert.class, X_WS_WebServiceMethod.class, a);
	}

	default WS_WebServiceTypeAssert assertThat(X_WS_WebServiceType a) {
		return proxy(WS_WebServiceTypeAssert.class, X_WS_WebServiceType.class, a);
	}

	default WS_WebServiceTypeAccessAssert assertThat(X_WS_WebServiceTypeAccess a) {
		return proxy(WS_WebServiceTypeAccessAssert.class, X_WS_WebServiceTypeAccess.class, a);
	}

	default POAssert assertThat(PO a) {
		return proxy(POAssert.class, PO.class, a);
	}

	default ProcessInfoLogAssert assertThat(ProcessInfoLog a) {
		return proxy(ProcessInfoLogAssert.class, ProcessInfoLog.class, a);
	}

	default BankStatementMatchInfoAssert assertThat(BankStatementMatchInfo a) {
		return proxy(BankStatementMatchInfoAssert.class, BankStatementMatchInfo.class, a);
	}
}