package live_functions;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class r_permissionGroup {
	
	 @FindBy(xpath="//span[text()=\"Permissions\"]")private WebElement permissionModule;
		@FindBy(xpath="//button[@class=\"btn btn-success\"]")private WebElement createNewButton;
		 @FindBy(xpath="//select[@id=\"selectFiredepartment\"]")private WebElement departmentFiled;
		 @FindBy(xpath="//input[@id=\"PermissionGroupTitle\"]")private WebElement groupTitle;
		@FindBy(xpath="//input[@name=\"data[Menu][108][PerAssign][view_per]\"]")private WebElement firefighterViewCheckBox;
	   @FindBy(xpath="//input[@name=\"data[Menu][10][PerAssign][view_per]\"]")private WebElement  atrributeoverviewView;
	   @FindBy(xpath="//input[@name=\"data[Menu][10][PerAssign][add_per]\"]")private WebElement  atrributeoverviewAdd;
	   @FindBy(xpath="//input[@name=\"data[Menu][10][PerAssign][edit_per]\"]")private WebElement  atrributeoverviewEdit;
	   @FindBy(xpath="//input[@name=\"data[Menu][10][PerAssign][delete_per]\"]")private WebElement  atrributeoverviewDelete;
		 @FindBy(xpath="//input[@name=\"data[Menu][29][PerAssign][view_per]\"]")private WebElement firefighterLeaderView;
		 @FindBy(xpath="//input[@name=\"data[Menu][29][PerAssign][add_per]\"]")private WebElement firefighterLeaderAdd;
		 @FindBy(xpath="//input[@name=\"data[Menu][29][PerAssign][edit_per]\"]")private WebElement firefighterLeaderEdit;
		 @FindBy(xpath="//input[@name=\"data[Menu][29][PerAssign][delete_per]\"]")private WebElement firefighterLeaderdelete;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][30][PerAssign][view_per]\"]")private WebElement manageIdCardsView;
		 @FindBy(xpath="//input[@name=\"data[Menu][30][PerAssign][add_per]\"]")private WebElement manageIdCardsAdd;
		 @FindBy(xpath="//input[@name=\"data[Menu][30][PerAssign][edit_per]\"]")private WebElement manageIdCardsEdit;
		 @FindBy(xpath="//input[@name=\"data[Menu][30][PerAssign][delete_per]\"]")private WebElement manageIdCardsDelete;
		 
		@FindBy(xpath="//input[@name=\"data[Menu][22][PerAssign][view_per]\"]")private WebElement manageFireStationView;
		@FindBy(xpath="//input[@name=\"data[Menu][22][PerAssign][add_per]\"]")private WebElement manageFireStationAdd;
		@FindBy(xpath="//input[@name=\"data[Menu][22][PerAssign][edit_per]\"]")private WebElement manageFireStationEdit;
		@FindBy(xpath="//input[@name=\"data[Menu][22][PerAssign][delete_per]\"]")private WebElement manageFireStationDelete;
		
		@FindBy(xpath="//input[@name=\"data[Menu][166][PerAssign][add_per]\"]")private WebElement manageVehicleCarAdd;
		 @FindBy(xpath="//input[@name=\"data[Menu][166][PerAssign][edit_per]\"]")private WebElement manageVehicleCarEdit;
		 @FindBy(xpath="//input[@name=\"data[Menu][166][PerAssign][view_per]\"]")private WebElement manageVehicleCarView;
		 @FindBy(xpath="//input[@name=\"data[Menu][166][PerAssign][delete_per]\"]")private WebElement manageVehicleCarDelete;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][39][PerAssign][add_per]\"]")private WebElement manageInformatioAdd;
		 @FindBy(xpath="//input[@name=\"data[Menu][39][PerAssign][edit_per]\"]")private WebElement manageInformatioEdit;
		 @FindBy(xpath="//input[@name=\"data[Menu][39][PerAssign][view_per]\"]")private WebElement manageInformatioView;
		 @FindBy(xpath="//input[@name=\"data[Menu][39][PerAssign][delete_per]\"]")private WebElement manageInformatioDelete;
		 
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][43][PerAssign][add_per]\"]")private WebElement manageEventCalendarAdd;
		 @FindBy(xpath="//input[@name=\"data[Menu][43][PerAssign][edit_per]\"]")private WebElement manageEventCalendarEdit;
		 @FindBy(xpath="//input[@name=\"data[Menu][43][PerAssign][view_per]\"]")private WebElement manageEventCalendarView;
		 @FindBy(xpath="//input[@name=\"data[Menu][43][PerAssign][delete_per]\"]")private WebElement manageEventCalendarDelete;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][44][PerAssign][add_per]\"]")private WebElement manageEventEventCategoriesAdd;
		 @FindBy(xpath="//input[@name=\"data[Menu][44][PerAssign][edit_per]\"]")private WebElement manageEventEventCategoriesEdit;
		 @FindBy(xpath="//input[@name=\"data[Menu][44][PerAssign][view_per]\"]")private WebElement manageEventEventCategoriesView;
		 @FindBy(xpath="//input[@name=\"data[Menu][44][PerAssign][delete_per]\"]")private WebElement manageEventEventCategoriesDelete;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][49][PerAssign][add_per]\"]")private WebElement manageMonitorSettingAdd;
		 @FindBy(xpath="//input[@name=\"data[Menu][49][PerAssign][edit_per]\"]")private WebElement manageMonitorSettingEdit;
		 @FindBy(xpath="//input[@name=\"data[Menu][49][PerAssign][view_per]\"]")private WebElement manageMonitorSettingView;
		 @FindBy(xpath="//input[@name=\"data[Menu][49][PerAssign][delete_per]\"]")private WebElement manageMonitorSettingDelete;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][182][PerAssign][list_per]\"]")private WebElement manageMonitorOverviewConnectedEntitiesList;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][52][PerAssign][add_per]\"]")private WebElement manageAlarmAdd;
		 @FindBy(xpath="//input[@name=\"data[Menu][52][PerAssign][edit_per]\"]")private WebElement  manageAlarmEdit;
		 @FindBy(xpath="//input[@name=\"data[Menu][52][PerAssign][view_per]\"]")private WebElement  manageAlarmView;
		 @FindBy(xpath="//input[@name=\"data[Menu][52][PerAssign][delete_per]\"]")private WebElement  manageAlarmDelete;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][61][PerAssign][view_per]\"]")private WebElement  manageAlarmDashboardView;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][65][PerAssign][add_per]\"]")private WebElement manageResourceAdd;
		 @FindBy(xpath="//input[@name=\"data[Menu][65][PerAssign][edit_per]\"]")private WebElement  manageResourceEdit;
		 @FindBy(xpath="//input[@name=\"data[Menu][65][PerAssign][view_per]\"]")private WebElement  manageResourceView;
		 @FindBy(xpath="//input[@name=\"data[Menu][65][PerAssign][delete_per]\"]")private WebElement  manageResourceDelete;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][68][PerAssign][add_per]\"]")private WebElement manageAlarmLoopAdd;
		 @FindBy(xpath="//input[@name=\"data[Menu][68][PerAssign][edit_per]\"]")private WebElement  manageAlarmLoopEdit;
		 @FindBy(xpath="//input[@name=\"data[Menu][68][PerAssign][view_per]\"]")private WebElement  manageAlarmLoopView;
		 @FindBy(xpath="//input[@name=\"data[Menu][68][PerAssign][delete_per]\"]")private WebElement  manageAlarmLoopDelete;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][71][PerAssign][add_per]\"]")private WebElement alarmTemplateAdd;
		 @FindBy(xpath="//input[@name=\"data[Menu][71][PerAssign][edit_per]\"]")private WebElement  alarmTemplateEdit;
		 @FindBy(xpath="//input[@name=\"data[Menu][71][PerAssign][view_per]\"]")private WebElement  alarmTemplateView;
		 @FindBy(xpath="//input[@name=\"data[Menu][71][PerAssign][delete_per]\"]")private WebElement  alarmTemplateDelete;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][57][PerAssign][add_per]\"]")private WebElement  manageTestAlarmAdd;
		 @FindBy(xpath="//input[@name=\"data[Menu][57][PerAssign][edit_per]\"]")private WebElement manageTestAlarmEdit;
		 @FindBy(xpath="//input[@name=\"data[Menu][57][PerAssign][view_per]\"]")private WebElement manageTestAlarmView;
		 @FindBy(xpath="//input[@name=\"data[Menu][57][PerAssign][delete_per]\"]")private WebElement manageTestAlarmDelete;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][183][PerAssign][edit_per]\"]")private WebElement testAlarmOverviewEdit;
		 @FindBy(xpath="//input[@name=\"data[Menu][183][PerAssign][view_per]\"]")private WebElement testAlarmOverviewView;
		 @FindBy(xpath="//input[@name=\"data[Menu][183][PerAssign][delete_per]\"]")private WebElement testAlarmOverviewDelete;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][184][PerAssign][view_per]\"]")private WebElement testAlarmDashboardView;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][123][PerAssign][add_per]\"]")private WebElement stormDashboardAdd;
		 @FindBy(xpath="//input[@name=\"data[Menu][123][PerAssign][edit_per]\"]")private WebElement  stormDashboardEdit;
		 @FindBy(xpath="//input[@name=\"data[Menu][123][PerAssign][view_per]\"]")private WebElement  stormDashboardView;
		 @FindBy(xpath="//input[@name=\"data[Menu][123][PerAssign][delete_per]\"]")private WebElement  stormDashboardDelete;

		 @FindBy(xpath="//input[@name=\"data[Menu][124][PerAssign][add_per]\"]")private WebElement manageStormResourceAdd;
		 @FindBy(xpath="//input[@name=\"data[Menu][124][PerAssign][edit_per]\"]")private WebElement manageStormResourceEdit;
		 @FindBy(xpath="//input[@name=\"data[Menu][124][PerAssign][view_per]\"]")private WebElement manageStormResourceView;
		 @FindBy(xpath="//input[@name=\"data[Menu][124][PerAssign][delete_per]\"]")private WebElement  manageStormResourceDelete;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][127][PerAssign][add_per]\"]")private WebElement manageEmergenciesAdd;
		 @FindBy(xpath="//input[@name=\"data[Menu][127][PerAssign][edit_per]\"]")private WebElement manageEmergenciesEdit;
		 @FindBy(xpath="//input[@name=\"data[Menu][127][PerAssign][view_per]\"]")private WebElement manageEmergenciesView;
		 @FindBy(xpath="//input[@name=\"data[Menu][127][PerAssign][delete_per]\"]")private WebElement  manageEmergenciesDelete;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][175][PerAssign][edit_per]\"]")private WebElement retterZeusManageUsersEdit;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][179][PerAssign][edit_per]\"]")private WebElement retterZeusAppStandardSettingEdit;
		 @FindBy(xpath="//input[@name=\"data[Menu][179][PerAssign][view_per]\"]")private WebElement retterZeusAppStandardSettingView;
		 
	
		 @FindBy(xpath="//input[@name=\"data[Menu][188][PerAssign][view_per]\"]")private WebElement retterZeusAlarmNoteView;
		 @FindBy(xpath="//input[@name=\"data[Menu][188][PerAssign][delete_per]\"]")private WebElement  retterZeusAlarmNoteDelete;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][190][PerAssign][view_per]\"]")private WebElement retterZeusAlarmEmergencyReportView;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][208][PerAssign][add_per]\"]")private WebElement  retterZeusRadioGroupsAdd;
		 @FindBy(xpath="//input[@name=\"data[Menu][208][PerAssign][edit_per]\"]")private WebElement retterZeusRadioGroupsEdit;
		 @FindBy(xpath="//input[@name=\"data[Menu][208][PerAssign][view_per]\"]")private WebElement retterZeusRadioGroupsView;
		 @FindBy(xpath="//input[@name=\"data[Menu][208][PerAssign][delete_per]\"]")private WebElement  retterZeusRadioGroupsDelete;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][81][PerAssign][add_per]\"]")private WebElement  conversationgroupListAdd;
		 @FindBy(xpath="//input[@name=\"data[Menu][81][PerAssign][edit_per]\"]")private WebElement conversationgroupListEdit;
		 @FindBy(xpath="//input[@name=\"data[Menu][81][PerAssign][view_per]\"]")private WebElement conversationgroupListView;
		 @FindBy(xpath="//input[@name=\"data[Menu][81][PerAssign][delete_per]\"]")private WebElement conversationgroupListDelete;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][82][PerAssign][add_per]\"]")private WebElement  conversationgroupConversationAdd;
		 @FindBy(xpath="//input[@name=\"data[Menu][82][PerAssign][edit_per]\"]")private WebElement conversationgroupConversationEdit;
		 @FindBy(xpath="//input[@name=\"data[Menu][82][PerAssign][view_per]\"]")private WebElement conversationgroupConversationView;
		 @FindBy(xpath="//input[@name=\"data[Menu][82][PerAssign][delete_per]\"]")private WebElement conversationgroupConversationDelete;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][153][PerAssign][add_per]\"]")private WebElement  ARAvailabilityRequestAdd;
		 @FindBy(xpath="//input[@name=\"data[Menu][153][PerAssign][edit_per]\"]")private WebElement ARAvailabilityRequestEdit;
		 @FindBy(xpath="//input[@name=\"data[Menu][153][PerAssign][view_per]\"]")private WebElement ARAvailabilityRequestView;
		 @FindBy(xpath="//input[@name=\"data[Menu][153][PerAssign][delete_per]\"]")private WebElement ARAvailabilityRequestDelete;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][86][PerAssign][add_per]\"]")private WebElement  ARPlanningCalenderAdd;
		 @FindBy(xpath="//input[@name=\"data[Menu][86][PerAssign][edit_per]\"]")private WebElement ARPlanningCalenderEdit;
		 @FindBy(xpath="//input[@name=\"data[Menu][86][PerAssign][view_per]\"]")private WebElement ARPlanningCalenderView;
		 @FindBy(xpath="//input[@name=\"data[Menu][86][PerAssign][delete_per]\"]")private WebElement ARPlanningCalenderDelete;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][87][PerAssign][add_per]\"]")private WebElement  ARHistoryAdd;
		 @FindBy(xpath="//input[@name=\"data[Menu][87][PerAssign][edit_per]\"]")private WebElement ARHistoryEdit;
		 @FindBy(xpath="//input[@name=\"data[Menu][87][PerAssign][view_per]\"]")private WebElement ARHistoryView;
		 @FindBy(xpath="//input[@name=\"data[Menu][87][PerAssign][delete_per]\"]")private WebElement ARHistoryDelete;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][186][PerAssign][add_per]\"]")private WebElement  ARReportSettingAdd;
		 @FindBy(xpath="//input[@name=\"data[Menu][186][PerAssign][edit_per]\"]")private WebElement ARReportSettingEdit;
		 @FindBy(xpath="//input[@name=\"data[Menu][186][PerAssign][view_per]\"]")private WebElement ARReportSettingView;
		 @FindBy(xpath="//input[@name=\"data[Menu][186][PerAssign][delete_per]\"]")private WebElement ARReportSettingDelete;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][119][PerAssign][add_per]\"]")private WebElement  checkListAdd;
		 @FindBy(xpath="//input[@name=\"data[Menu][119][PerAssign][edit_per]\"]")private WebElement checkListEdit;
		 @FindBy(xpath="//input[@name=\"data[Menu][119][PerAssign][view_per]\"]")private WebElement checkListView;
		 @FindBy(xpath="//input[@name=\"data[Menu][119][PerAssign][delete_per]\"]")private WebElement checkListDelete;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][145][PerAssign][add_per]\"]")private WebElement  fileSectionAdd;
		 @FindBy(xpath="//input[@name=\"data[Menu][145][PerAssign][edit_per]\"]")private WebElement fileSectionEdit;
		 @FindBy(xpath="//input[@name=\"data[Menu][145][PerAssign][view_per]\"]")private WebElement fileSectionView;
		 @FindBy(xpath="//input[@name=\"data[Menu][145][PerAssign][delete_per]\"]")private WebElement fileSectionDelete;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][148][PerAssign][edit_per]\"]")private WebElement emergencyDocumentEdit;
		 @FindBy(xpath="//input[@name=\"data[Menu][148][PerAssign][view_per]\"]")private WebElement emergencyDocumentView;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][132][PerAssign][add_per]\"]")private WebElement  SMUSERShiftChartAdd;
		 @FindBy(xpath="//input[@name=\"data[Menu][132][PerAssign][edit_per]\"]")private WebElement SMUSERShiftChartEdit;
		 @FindBy(xpath="//input[@name=\"data[Menu][132][PerAssign][view_per]\"]")private WebElement SMUSERShiftChartView;
		 @FindBy(xpath="//input[@name=\"data[Menu][132][PerAssign][delete_per]\"]")private WebElement SMUSERShiftChartDelete;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][133][PerAssign][view_per]\"]")private WebElement SMShowAvailabilityInMapView;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][134][PerAssign][add_per]\"]")private WebElement  SMMaanageUserGroupAdd;
		 @FindBy(xpath="//input[@name=\"data[Menu][134][PerAssign][edit_per]\"]")private WebElement SMMaanageUserGroupEdit;
		 @FindBy(xpath="//input[@name=\"data[Menu][134][PerAssign][view_per]\"]")private WebElement SMMaanageUserGroupView;
		 @FindBy(xpath="//input[@name=\"data[Menu][134][PerAssign][delete_per]\"]")private WebElement SMMaanageUserGroupDelete;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][169][PerAssign][add_per]\"]")private WebElement  SMShiftSettingAdd;
		 @FindBy(xpath="//input[@name=\"data[Menu][169][PerAssign][edit_per]\"]")private WebElement SMShiftSettingEdit;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][170][PerAssign][add_per]\"]")private WebElement  SMEscalationAdd;
		 @FindBy(xpath="//input[@name=\"data[Menu][170][PerAssign][edit_per]\"]")private WebElement SMEscalationEdit;
		 @FindBy(xpath="//input[@name=\"data[Menu][170][PerAssign][delete_per]\"]")private WebElement SMEscalationDelete;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][135][PerAssign][add_per]\"]")private WebElement  SMStandardRequrimentAdd;
		 @FindBy(xpath="//input[@name=\"data[Menu][135][PerAssign][edit_per]\"]")private WebElement SMStandardRequrimentEdit;
		 @FindBy(xpath="//input[@name=\"data[Menu][135][PerAssign][view_per]\"]")private WebElement SMStandardRequrimentView;
		 @FindBy(xpath="//input[@name=\"data[Menu][135][PerAssign][delete_per]\"]")private WebElement SMStandardRequrimentDelete;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][136][PerAssign][add_per]\"]")private WebElement  SMBookingCodeAdd;
		 @FindBy(xpath="//input[@name=\"data[Menu][136][PerAssign][view_per]\"]")private WebElement SMBookingCodeView;
		 @FindBy(xpath="//input[@name=\"data[Menu][136][PerAssign][delete_per]\"]")private WebElement SMBookingCodeDelete;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][137][PerAssign][view_per]\"]")private WebElement SMWorkingHoursReportView;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][138][PerAssign][add_per]\"]")private WebElement  SMReportSettingAdd;
		 @FindBy(xpath="//input[@name=\"data[Menu][138][PerAssign][edit_per]\"]")private WebElement SMReportSettingEdit;
		 @FindBy(xpath="//input[@name=\"data[Menu][138][PerAssign][view_per]\"]")private WebElement SMReportSettingView;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][139][PerAssign][add_per]\"]")private WebElement  SMManageVacationAdd;
		 @FindBy(xpath="//input[@name=\"data[Menu][139][PerAssign][delete_per]\"]")private WebElement SMManageVacationDelete;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][140][PerAssign][add_per]\"]")private WebElement  SMRuleAndVacartionCalenderAdd;
		 @FindBy(xpath="//input[@name=\"data[Menu][140][PerAssign][view_per]\"]")private WebElement SMRuleAndVacartionCalenderView;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][141][PerAssign][add_per]\"]")private WebElement  SMSetTargetAdd;
		 @FindBy(xpath="//input[@name=\"data[Menu][141][PerAssign][edit_per]\"]")private WebElement  SMSetTargetEdit;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][142][PerAssign][edit_per]\"]")private WebElement SMTargetReportEdit;
		 @FindBy(xpath="//input[@name=\"data[Menu][142][PerAssign][view_per]\"]")private WebElement SMTargetReportView;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][172][PerAssign][view_per]\"]")private WebElement downlodView;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][194][PerAssign][add_per]\"]")private WebElement  TTInOutManagementAdd;
		 @FindBy(xpath="//input[@name=\"data[Menu][194][PerAssign][edit_per]\"]")private WebElement TTInOutManagementEdit;
		 @FindBy(xpath="//input[@name=\"data[Menu][194][PerAssign][view_per]\"]")private WebElement TTInOutManagementView;
		 @FindBy(xpath="//input[@name=\"data[Menu][194][PerAssign][delete_per]\"]")private WebElement TTInOutManagementDelete;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][201][PerAssign][add_per]\"]")private WebElement  TTMinMaxWorkingHoursAdd;
		 @FindBy(xpath="//input[@name=\"data[Menu][201][PerAssign][edit_per]\"]")private WebElement TTMinMaxWorkingHoursEdit;
		 @FindBy(xpath="//input[@name=\"data[Menu][201][PerAssign][view_per]\"]")private WebElement TTMinMaxWorkingHoursView;
		 @FindBy(xpath="//input[@name=\"data[Menu][201][PerAssign][delete_per]\"]")private WebElement TTMinMaxWorkingHoursDelete;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][202][PerAssign][add_per]\"]")private WebElement  TTMakeBossAdd;
		 @FindBy(xpath="//input[@name=\"data[Menu][202][PerAssign][edit_per]\"]")private WebElement TTMakeBossEdit;
		 @FindBy(xpath="//input[@name=\"data[Menu][202][PerAssign][view_per]\"]")private WebElement TTMakeBossView;
		 @FindBy(xpath="//input[@name=\"data[Menu][202][PerAssign][delete_per]\"]")private WebElement TTMakeBossDelete;
		 
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][195][PerAssign][add_per]\"]")private WebElement  TTTrainingAdd;
		 @FindBy(xpath="//input[@name=\"data[Menu][195][PerAssign][edit_per]\"]")private WebElement TTTrainingEdit;
		 @FindBy(xpath="//input[@name=\"data[Menu][195][PerAssign][view_per]\"]")private WebElement TTTrainingView;
		 @FindBy(xpath="//input[@name=\"data[Menu][195][PerAssign][delete_per]\"]")private WebElement TTTrainingDelete;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][198][PerAssign][add_per]\"]")private WebElement  TTHolidayPlanningsAdd;
		 @FindBy(xpath="//input[@name=\"data[Menu][198][PerAssign][edit_per]\"]")private WebElement TTHolidayPlanningsEdit;
		 @FindBy(xpath="//input[@name=\"data[Menu][198][PerAssign][view_per]\"]")private WebElement TTHolidayPlanningsView;
		 @FindBy(xpath="//input[@name=\"data[Menu][198][PerAssign][delete_per]\"]")private WebElement TTHolidayPlanningsDelete;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][206][PerAssign][add_per]\"]")private WebElement  fireHydrantAdd;
		 @FindBy(xpath="//input[@name=\"data[Menu][206][PerAssign][edit_per]\"]")private WebElement fireHydrantEdit;
		 @FindBy(xpath="//input[@name=\"data[Menu][206][PerAssign][view_per]\"]")private WebElement fireHydrantView;
		 @FindBy(xpath="//input[@name=\"data[Menu][206][PerAssign][delete_per]\"]")private WebElement fireHydrantDelete;
		 
		 @FindBy(xpath="//input[@name=\"data[Menu][116][PerAssign][view_per]\"]")private WebElement releaseLogView;
		 

		 @FindBy(xpath="//input[@name=\"data[Menu][106][PerAssign][edit_per]\"]")private WebElement passwordEdit;
		 @FindBy(xpath="//input[@name=\"data[Menu][106][PerAssign][view_per]\"]")private WebElement passwordView;
		 @FindBy(xpath="//input[@name=\"data[Menu][106][PerAssign][delete_per]\"]")private WebElement passwordDelete;
		 
		 
		 
		 
		@FindBy(xpath="//td[contains(text(),\"BG\")]")private List<WebElement> availableDataCount ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ; 
                                                                   
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		 
		@FindBy(xpath="//button[@id=\"addDevice\"]")private WebElement savePermission;
		
		
		@FindBy(xpath="//input[@class=\"form-control input-sm\"]")private WebElement searchField;
		 @FindBy(xpath="//button[@id=\"dt_actionSearch\"]")private WebElement searchButton;
		 @FindBy(xpath = "(//i[@class=\"fa fa-trash-o\"])[1]")private WebElement delete;
		 @FindBy(xpath = "//button[@id=\"delYes\"]")private WebElement deleteYes;

		public r_permissionGroup(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		public void createPrmissionGroup (WebDriver driver,String dateDDMMYY,String gTimeHHMM) throws Throwable {
			
			Actions act = new Actions(driver);
			permissionModule.click();
		    
		    
		    for(int i=1;i<=2;i++) {
		    	
		    	createNewButton.click();
//		    	
//		    	Select se= new Select(departmentFiled);
//		        se.selectByVisibleText("Andrew");
		    	
		    	
		    	
		    	
		departmentFiled.click();
		
		Thread.sleep(1000);
		
		act.sendKeys("a").perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

			groupTitle.click();
			act.sendKeys("BG-Station defalult permission group-"+dateDDMMYY+gTimeHHMM+"-"+i).perform();
			Thread.sleep(10);
			
			firefighterViewCheckBox.click();
			Thread.sleep(10);
			
			atrributeoverviewAdd.click();
			Thread.sleep(10);
			atrributeoverviewEdit.click();
			Thread.sleep(10);
			atrributeoverviewView.click();
			Thread.sleep(10);
			atrributeoverviewDelete.click();
			Thread.sleep(10);
			
			firefighterLeaderAdd.click();
			Thread.sleep(10);
			firefighterLeaderEdit.click();
			Thread.sleep(10);
			firefighterLeaderView.click();
			Thread.sleep(10);
			firefighterLeaderdelete.click();
			Thread.sleep(10);
			
			manageIdCardsAdd.click();
			Thread.sleep(10);
			manageIdCardsEdit.click();
			Thread.sleep(10);
			manageIdCardsView.click();
			Thread.sleep(10);
			manageIdCardsDelete.click();
			Thread.sleep(10);
			
			act.sendKeys(Keys.PAGE_DOWN).perform();
			
			manageFireStationAdd.click();
			Thread.sleep(10);
			manageFireStationEdit.click();
			Thread.sleep(10);
			manageFireStationView.click();
			Thread.sleep(10);
			manageFireStationDelete.click();
			Thread.sleep(10);
			
			manageVehicleCarAdd.click();
			Thread.sleep(10);
			manageVehicleCarEdit.click();
			Thread.sleep(10);
			manageVehicleCarView.click();
			Thread.sleep(10);
			manageVehicleCarDelete.click();
			Thread.sleep(10);
			
			manageInformatioAdd.click();
			Thread.sleep(10);
			manageInformatioEdit.click();
			Thread.sleep(10);
			manageInformatioView.click();
			Thread.sleep(10);
			manageInformatioDelete.click();
			Thread.sleep(10);
			
			 manageEventCalendarAdd.click();
			Thread.sleep(10);
			 manageEventCalendarEdit.click();
			Thread.sleep(10);
			 manageEventCalendarView.click();
			Thread.sleep(10);
			 manageEventCalendarDelete.click();
			Thread.sleep(10);
			
			manageEventEventCategoriesAdd.click();
			Thread.sleep(10);
			manageEventEventCategoriesEdit.click();
			Thread.sleep(10);
			manageEventEventCategoriesView.click();
			Thread.sleep(10);
			manageEventEventCategoriesDelete.click();
			Thread.sleep(10);
			
			manageMonitorSettingAdd.click();
			Thread.sleep(10);
			manageMonitorSettingEdit.click();
			Thread.sleep(10);
			manageMonitorSettingView.click();
			Thread.sleep(10);
			manageMonitorSettingDelete.click();
			Thread.sleep(10);
			
//			manageMonitorOverviewConnectedEntitiesList.click();
			Thread.sleep(10);
			
			manageAlarmAdd.click();
			Thread.sleep(10);
			manageAlarmEdit.click();
			Thread.sleep(10);
			manageAlarmView.click();
			Thread.sleep(10);
			manageAlarmDelete.click();
			Thread.sleep(10);
			
			manageAlarmDashboardView.click();
			Thread.sleep(10);
			
			manageResourceAdd.click();
			Thread.sleep(10);
			manageResourceEdit.click();
			Thread.sleep(10);
			manageResourceView.click();
			Thread.sleep(10);
			manageResourceDelete.click();
			Thread.sleep(10);
			
			manageAlarmLoopAdd.click();
			Thread.sleep(10);
			manageAlarmLoopEdit.click();
			Thread.sleep(10);
			manageAlarmLoopView.click();
			Thread.sleep(10);
			manageAlarmLoopDelete.click();
			Thread.sleep(10);
			

			alarmTemplateAdd.click();
			Thread.sleep(10);
			alarmTemplateEdit.click();
			Thread.sleep(10);
			alarmTemplateView.click();
			Thread.sleep(10);
			alarmTemplateDelete.click();
			Thread.sleep(10);
		    
			act.sendKeys(Keys.PAGE_DOWN).perform();
			
		    manageTestAlarmAdd.click();
			Thread.sleep(10);
			manageTestAlarmEdit.click();
			Thread.sleep(10);
			manageTestAlarmView.click();
			Thread.sleep(10);
			manageTestAlarmDelete.click();
			Thread.sleep(10);
			
			testAlarmOverviewEdit.click();
			Thread.sleep(10);
			testAlarmOverviewView.click();
			Thread.sleep(10);
			testAlarmOverviewDelete.click();
			Thread.sleep(10);
			
			testAlarmDashboardView.click();
			Thread.sleep(10);
			
			stormDashboardAdd.click();
			Thread.sleep(10);
			stormDashboardEdit.click();
			Thread.sleep(10);
			stormDashboardView.click();
			Thread.sleep(10);
			stormDashboardDelete.click();
			Thread.sleep(10);
			
			manageStormResourceAdd.click();
			Thread.sleep(10);
			manageStormResourceEdit.click();
			Thread.sleep(10);
			manageStormResourceView.click();
			Thread.sleep(10);
			manageStormResourceDelete.click();
			Thread.sleep(10);
			
			manageEmergenciesAdd.click();
			Thread.sleep(10);
			manageEmergenciesEdit.click();
			Thread.sleep(10);
			manageEmergenciesView.click();
			Thread.sleep(10);
			manageEmergenciesDelete.click();
			Thread.sleep(10);
			
			retterZeusManageUsersEdit.click();
			Thread.sleep(10);
			
			retterZeusAppStandardSettingEdit.click();
			Thread.sleep(10);
			retterZeusAppStandardSettingView.click();
			Thread.sleep(10);
			
			
			retterZeusAlarmNoteView.click();
			Thread.sleep(10);
			retterZeusAlarmNoteDelete.click();
			Thread.sleep(10);
			
			retterZeusAlarmEmergencyReportView.click();
			Thread.sleep(10);
			
			retterZeusRadioGroupsAdd.click();
			Thread.sleep(10);
			retterZeusRadioGroupsEdit.click();
			Thread.sleep(10);
			retterZeusRadioGroupsView.click();
			Thread.sleep(10);
			retterZeusRadioGroupsDelete.click();
			Thread.sleep(10);
			
			conversationgroupListAdd.click();
			Thread.sleep(10);
			conversationgroupListEdit.click();
			Thread.sleep(10);
			conversationgroupListView.click();
			Thread.sleep(10);
			conversationgroupListDelete.click();
			Thread.sleep(10);

			conversationgroupConversationAdd.click();
			Thread.sleep(10);
			conversationgroupConversationEdit.click();
			Thread.sleep(10);
			conversationgroupConversationView.click();
			Thread.sleep(10);
			conversationgroupConversationDelete.click();
			Thread.sleep(10);
			
			act.sendKeys(Keys.PAGE_DOWN).perform();
			
			ARAvailabilityRequestAdd.click();
			Thread.sleep(10);
			ARAvailabilityRequestEdit.click();
			Thread.sleep(10);
			ARAvailabilityRequestView.click();
			Thread.sleep(10);
			ARAvailabilityRequestDelete.click();
			Thread.sleep(10);
			
			ARPlanningCalenderAdd.click();
			Thread.sleep(10);
			ARPlanningCalenderEdit.click();
			Thread.sleep(10);
			ARPlanningCalenderView.click();
			Thread.sleep(10);
			ARPlanningCalenderDelete.click();
			Thread.sleep(10);
			
			ARHistoryAdd.click();
			Thread.sleep(10);
			ARHistoryEdit.click();
			Thread.sleep(10);
			ARHistoryView.click();
			Thread.sleep(10);
			ARHistoryDelete.click();
			Thread.sleep(10);
			
			ARReportSettingAdd.click();
			Thread.sleep(10);
			ARReportSettingEdit.click();
			Thread.sleep(10);
			ARReportSettingView.click();
			Thread.sleep(10);
			ARReportSettingDelete.click();
			Thread.sleep(10);
			
			checkListAdd.click();
			Thread.sleep(10);
			checkListEdit.click();
			Thread.sleep(10);
			checkListView.click();
			Thread.sleep(10);
			checkListDelete.click();
			Thread.sleep(10);
			
			fileSectionAdd.click();
			Thread.sleep(10);
			fileSectionEdit.click();
			Thread.sleep(10);
			fileSectionView.click();
			Thread.sleep(10);
			fileSectionDelete.click();
			Thread.sleep(10);
			
			emergencyDocumentEdit.click();
			Thread.sleep(10);
			emergencyDocumentView.click();
			Thread.sleep(10);
						
			SMUSERShiftChartAdd.click();
			Thread.sleep(10);
			SMUSERShiftChartEdit.click();
			Thread.sleep(10);
			SMUSERShiftChartView.click();
			Thread.sleep(10);
			SMUSERShiftChartDelete.click();
			Thread.sleep(10);
			
			SMShowAvailabilityInMapView.click();
			Thread.sleep(10);
			
			SMMaanageUserGroupAdd.click();
			Thread.sleep(10);
			SMMaanageUserGroupEdit.click();
			Thread.sleep(10);
			SMMaanageUserGroupView.click();
			Thread.sleep(10);
			SMMaanageUserGroupDelete.click();
			Thread.sleep(10);
			
			SMShiftSettingAdd.click();
			Thread.sleep(10);
			SMShiftSettingEdit.click();
			Thread.sleep(10);
			
			SMEscalationAdd.click();
			Thread.sleep(10);
			SMEscalationEdit.click();
			Thread.sleep(10);
			SMEscalationDelete.click();
			Thread.sleep(10);
			

			SMStandardRequrimentAdd.click();
			Thread.sleep(10);
			SMStandardRequrimentEdit.click();
			Thread.sleep(10);
			SMStandardRequrimentView.click();
			Thread.sleep(10);
			SMStandardRequrimentDelete.click();
			Thread.sleep(10);
			
			SMBookingCodeAdd.click();
			Thread.sleep(10);
			SMBookingCodeView.click();
			Thread.sleep(10);
			SMBookingCodeDelete.click();
			Thread.sleep(10);
			
		    SMWorkingHoursReportView.click();
			Thread.sleep(10);
		    
			act.sendKeys(Keys.PAGE_DOWN).perform();
			
			SMReportSettingAdd.click();
			Thread.sleep(10);
			SMReportSettingEdit.click();
			Thread.sleep(10);
			SMReportSettingView.click();
			Thread.sleep(10);
			
			SMManageVacationAdd.click();
			Thread.sleep(10);
			SMManageVacationDelete.click();
			Thread.sleep(10);
			
			SMRuleAndVacartionCalenderAdd.click();
			Thread.sleep(10);
			SMRuleAndVacartionCalenderView.click();
			Thread.sleep(10);
			 
			SMSetTargetAdd.click();
			Thread.sleep(10);
			SMSetTargetEdit.click();
			Thread.sleep(10);
			
			SMTargetReportEdit.click();
			Thread.sleep(10);
			SMTargetReportView.click();
			Thread.sleep(10);
			
			
			
		    downlodView.click();
			Thread.sleep(10);
			
			TTInOutManagementAdd.click();
			Thread.sleep(10);
			TTInOutManagementEdit.click();
			Thread.sleep(10);
			TTInOutManagementView.click();
			Thread.sleep(10);
			TTInOutManagementDelete.click();
			Thread.sleep(10);
			
			
			TTMinMaxWorkingHoursAdd.click();
			Thread.sleep(10);
			TTMinMaxWorkingHoursEdit.click();
			Thread.sleep(10);
			TTMinMaxWorkingHoursView.click();
			Thread.sleep(10);
			TTMinMaxWorkingHoursDelete.click();
			Thread.sleep(10);
			
			TTMakeBossAdd.click();
			Thread.sleep(10);
			TTMakeBossEdit.click();
			Thread.sleep(10);
			TTMakeBossView.click();
			Thread.sleep(10);
			TTMakeBossDelete.click();
			Thread.sleep(10);
			
			
		
			TTTrainingAdd.click();
			Thread.sleep(10);
			TTTrainingEdit.click();
			Thread.sleep(10);
			TTTrainingView.click();
			Thread.sleep(10);
			TTTrainingDelete.click();
			Thread.sleep(10);
			
			TTHolidayPlanningsAdd.click();
			Thread.sleep(10);
			TTHolidayPlanningsEdit.click();
			Thread.sleep(10);
			TTHolidayPlanningsView.click();
			Thread.sleep(10);
			TTHolidayPlanningsDelete.click();
			Thread.sleep(10);
			
			
			
			fireHydrantAdd.click();
			Thread.sleep(10);
			fireHydrantEdit.click();
			Thread.sleep(10);
			fireHydrantView.click();
			Thread.sleep(10);
			fireHydrantDelete.click();
			Thread.sleep(10);
			
			
			
			releaseLogView.click();
			Thread.sleep(10);
		    
			
			passwordEdit.click();
			Thread.sleep(10);
			passwordView.click();
			Thread.sleep(10);
			passwordDelete.click();
			Thread.sleep(10);
			
			
			
			
			
			
			
			
			
			
			
		
			savePermission.click();
			Thread.sleep(10);
			
			Reporter.log("BG-Station defalult permission group-"+dateDDMMYY+gTimeHHMM+"-"+i,true);
			
		    }
			
			
			

		}
		
         public void deletePrmissionGroup (WebDriver driver,String dateDDMMYY,String gTimeHHMM) throws Throwable 
         {
			
			Actions act = new Actions(driver);
			permissionModule.click();
			int z =availableDataCount.size();
			Reporter.log("The total available permission count is-"+z+" in the list for delete.",true);
			 for (int i=1;i<=z;i++)
			    {
				searchField.click();
				act.sendKeys("BG").perform();
			
				searchButton.click();
				Thread.sleep(2000);
				delete.click();
			   	deleteYes.click();
				Thread.sleep(2000);
					
					Reporter.log("permission group number-" + i + " is deleted sucessfully.", true);
				
				driver.navigate().refresh();
			    }
			
			
			
         }

		
	

}
