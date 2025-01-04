package live_functions;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AAA_testClass_delete extends B_baseClass {
	
	

	String date;
	String gCurrntTime;
	String gTimeA7min;
	String gTimeA22min;
	String gTimeA67min;
	String gTimeA82min;

	String date2;
	String dateAft2Days;
	String BranchNameB2;

	

	

	

	C_logIn_logOut lp;
	D_homePage hp;
	E_manualAlarm ma;
	F_information ip;
	G_InfoEvent ep;
	AAAAA_timeClasss tmc;
	H_testAlarm ta;
	I_availabilityRequest ar;
	j_calendarEvent ce;
	k_monitorUser mu;
	m_ChatGroup cg;
	
	l_attribute  at;
	j_resource rec;
	n_addUsers ff;
	o_fireStation st;
	p_vehicleUser vu;
	q_checkList cl;
	r_permissionGroup pg;
	j_alarmLoop al;
	s_alarmTemplate atem;
	
	
	
	

	@BeforeClass
	public void lounchBrowser() throws Throwable {

		getBranchName();
		browserLounch();
	
		

		lp = new C_logIn_logOut(driver);
		hp = new D_homePage(driver);
	

		lp.logInUser(userName, password, driver);

		hp.langChange(driver);
		ma = new E_manualAlarm(driver);
		ip = new F_information(driver);
		ep = new G_InfoEvent(driver);
		tmc = new AAAAA_timeClasss();
		ta = new H_testAlarm(driver);
		ce = new j_calendarEvent(driver);
		ar = new I_availabilityRequest(driver);

		tmc.catchTime(driver);
		date = tmc.germanyTodaysDate;
		gCurrntTime = tmc.germanycurrentTime;
		gTimeA7min = tmc.germanyTimeAfter7Minutes;
		gTimeA22min = tmc.germanyTimeAfter22Minutes;
		date2 = tmc.germanyTomorrowDate2;
		dateAft2Days = tmc.germanyDateAfterTwoDyas;

		mu = new k_monitorUser(driver);
		cg = new m_ChatGroup (driver) ;
		
		at=new l_attribute(driver) ;
		rec=new j_resource (driver);
		ff=new n_addUsers (driver);
		st=new o_fireStation (driver) ;
		vu=new p_vehicleUser (driver) ;
		cl=new q_checkList (driver) ;
		pg=new r_permissionGroup (driver) ;
		al = new j_alarmLoop (driver);
		atem=new s_alarmTemplate(driver);
		
		Reporter.log("Hello,"+BranchNameB+" branch deleting process has started.-"+date+">"+gCurrntTime, true);
		
		Reporter.log(" ", true);
		
	

	}

	@BeforeMethod
	public void backToHomePage() throws Throwable {
		hp.backToHomePage(driver);

	}
	
	
	

	@Test

	public void userDetails() throws Throwable {

		Reporter.log(" ", true);
		Reporter.log("live department user # " + userName + " # log in sucessfully", true);
		Reporter.log(" ", true);
	}
	
	
	
	@Test
	public void deleteEventCategory() throws Throwable {
		
		
		Reporter.log(" ", true);
		Reporter.log("The process of delete event category is started.", true);
		ce.calendarEventCommon(driver,BranchNameB);
		ce.deleteEventCategory(driver, BranchNameB);
		Reporter.log("The process of delete event category is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	
	
	
	
	
	@Test
	public void deleteAlarmTemplate() throws Throwable {
		
		
		Reporter.log(" ", true);
		Reporter.log("The process of delete alarm template is started.", true);
		atem.commonForAlarmTemplate(driver,BranchNameB);
		atem.deleteAlarmTemplate(driver,BranchNameB);
		Reporter.log("The process of delete alarm template is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	
	
	@Test
	public void deleteAlarmLoop() throws Throwable {
		
		
		Reporter.log(" ", true);
		Reporter.log("The process of delete alarm loop is started.", true);
		al.commonForAlarmLoop(driver,BranchNameB);
		al.deleteAlarmLoop(driver,BranchNameB);
		Reporter.log("The process of delete alarm loop is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	
	@Test
	public void deleteCalendarEventCreatedByAttribute() throws Throwable {
		
		
		Reporter.log(" ", true);
		Reporter.log("The process of delete calendar eventcreated by attribute is started.", true);
		ce.calendarEventCommon(driver,BranchNameB);
		ce.deletecalendarEventByAttribute(driver,BranchNameB);
		Reporter.log("The process of delete calendar event by attribute is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	
	@Test
	public void deleteCalendarEventCreatedByResource() throws Throwable {
		
		
		Reporter.log(" ", true);
		Reporter.log("The process of delete calendar event by resource is started.", true);
		ce.calendarEventCommon(driver,BranchNameB);
		ce.deletecalendarEventByResource(driver,BranchNameB);
		Reporter.log("The process of delete calendar event by resource is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	@Test
	public void deleteCalendarEventCreatedByFirefighter() throws Throwable {
		
		
		Reporter.log(" ", true);
		Reporter.log("The process of delete calendar event by firefighter is started.", true);
		ce.calendarEventCommon(driver,BranchNameB);
		ce.deletecalendarEventByFirefighter(driver,BranchNameB);
		Reporter.log("The process of delete calendar event is by firefighter complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	
	@Test

	public void deletePermissionGroup() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of delete permission group is started.", true);
		
		pg.deletePrmissionGroup(driver, date2, date);
		
		Reporter.log("The process of delete permission group is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	@Test

	public void deleteCheckList() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of delete check list is started.", true);
		
	cl.commonForCheckList(driver,BranchNameB);
	cl.deleteCheckLis(driver,BranchNameB);
		
		Reporter.log("The process of delete  check list is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	@Test

	public void deleteChatGroup() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of delete Chat group is started.", true);
		
		cg.commonForCreateGroup(driver,BranchNameB);
		cg.deleteChatGroup(driver, BranchNameB);
		
		Reporter.log("The process of delete  delete Chat group is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	
	@Test

	public void deleteVehicleUser() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of delete vehicle is started.", true);
		
	vu.commonForVehicleUser(driver,BranchNameB);
	vu.deleteVehicleUser(driver,BranchNameB);
		
		Reporter.log("The process ofdelete vehicle is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	@Test
	public void deleteFireStation() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of delete fire station is started.", true);
		st.CommonForStation(driver,BranchNameB);
		st.deleteStation(driver,BranchNameB);
		
		
		Reporter.log("The process of delete fire station is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	
	
	@Test

	public void deleteUers() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of delete user is started.", true);
		ff.commonForAddUers(driver,BranchNameB);
		ff.deletfireFighter(driver,BranchNameB);
		Reporter.log("The process of delete user is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	
	
	@Test

	public void deleteResource() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of delete resource is started.", true);
		
		rec.deleteResource(driver,BranchNameB);
		
		
		Reporter.log("The process of delete resorce is is complete.", true);
		Reporter.log(" ", true);
		
	}
	
	@Test()

	public void deleteAttribute() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of deleting attribute is started.", true);
		at.deleteAttribute(driver,BranchNameB);
		Reporter.log("The process of deleting attribute is complted.", true);
		Reporter.log(" ", true);

	}

	@Test()

	public void deleteMonitorUser() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of deleting monitor user is started.", true);
		mu.commonForMonitorUser(driver,BranchNameB);
		mu.deleteMonitorUser(driver,BranchNameB);
		Reporter.log("The process of deleting monitor user is complted.", true);
		Reporter.log(" ", true);

	}

	@Test()

	public void deleteTestAlarmFromList() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of deleting a test alarm from list is started.", true);
		ta.deleteTestAlarmFromList(driver,BranchNameB);
		Reporter.log("The process of deleting a test alarm from list is complted.", true);
		Reporter.log(" ", true);

	}

	@Test

	public void deleteTestAlarmFromOverview() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of deleting a test alarm from overview is started.", true);
		ta.testAlarmOverviewCommon(driver,BranchNameB);
		ta.deleteTestAlarmFromOverview(driver,BranchNameB);

		Reporter.log("The process of deleting a test alarm from overview is complted.", true);
		Reporter.log(" ", true);

	}
	
	
	
	@Test

	public void deleteTestAlarmFromOverview_monthly() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of deleting a monthly test alarm from overview is started.", true);
		ta.testAlarmOverviewCommon(driver,BranchNameB);
		ta.deleteTestAlarmFromOverview_monthly(driver, BranchNameB2);

		Reporter.log("The process of deleting a test alarm from overview is complted.", true);
		Reporter.log(" ", true);

	}
	
	
	
	
	
	
	
	@Test

	public void deactiveTestAlarmFromOverview() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of deactive a test alarm from ovieview is started.", true);
		ta.testAlarmOverviewCommon(driver,BranchNameB);
        ta.deactiveTestAlarmsFromOverview(driver, date,BranchNameB);
		
		Reporter.log("The process of deactive a test alarm from ovieview is complted.", true);
		Reporter.log(" ", true);

	}
	
	
	
	@Test

	public void deactiveMonthlyTestAlarmFromOverview() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of deactive a test alarm from ovieview is started.", true);
		ta.testAlarmOverviewCommon(driver,BranchNameB);
        ta.deactiveMonthlyTestAlarmsFromOverview(driver, date,BranchNameB);
		
		Reporter.log("The process of deactive a test alarm from ovieview is complted.", true);
		Reporter.log(" ", true);

	}
	

	@Test

	public void deactiveManualAlarm() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of deactive a manual alarm is started.", true);

		ma.deactiveManualAlarms(driver, date,BranchNameB);
		Reporter.log("The process of deactive a manual alarm is complted.", true);
		Reporter.log(" ", true);

	}
	
	
	@Test

	public void deleteManualAlarm() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of deleting a manual alarm is started.", true);

		ma.deleteAlarms(driver, date,BranchNameB);
		Reporter.log("The process of deleting a manual alarm is complted.", true);
		Reporter.log(" ", true);

	}
	
	@Test

	public void deleteAllManualAlarm() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of deleting a manual alarm is started.", true);

		ma.deleteAllAlarms(driver, date,BranchNameB);
		Reporter.log("The process of deleting a manual alarm is complted.", true);
		Reporter.log(" ", true);

	}
	

	@Test
	public void deleteInfoEvent() throws Throwable {

		Reporter.log(" ", true);
		Reporter.log("The process of deleting information and event is started.", true);

		ip.deleteInfoEvent(driver,BranchNameB);
		Reporter.log("Process of delete information and event is complted.", true);

		Reporter.log(" ", true);
	}

	@Test
	public void deleteARFromList() throws Throwable {

		Reporter.log(" ", true);
		Reporter.log("The process of deleting availability request from list is started.", true);
		ar.availabilityRequestCommon(driver,BranchNameB);
		ar.deleteAvailabilityRequestFromList(driver,BranchNameB);

		Reporter.log("The process of deleting availability request from list is complted.", true);

		Reporter.log(" ", true);
	}

	@Test
	public void deleteARFromHistory() throws Throwable {

		Reporter.log(" ", true);
		Reporter.log("The process of deleting availability request from history is started.", true);

		ar.availabilityRequestCommonDashboard(driver,BranchNameB);
		ar.deleteAvailabilityRequestFromHistory(driver,BranchNameB);

		Reporter.log("The process of deleting availability request from history is complted.", true);

		Reporter.log(" ", true);
	}

	@Test
	public void detailsAboutScript() throws Throwable

	{
		Reporter.log(" ", true);

		Reporter.log("Login  date-" + date + " & login  time -" + gCurrntTime, true);
		tmc.catchTime2(driver);
		date = tmc.germanyTodaysDate;
		gCurrntTime = tmc.germanycurrentTime;

		Reporter.log("Logout date-" + date + " & logout time -" + gCurrntTime, true);
		Reporter.log(" ", true);

	}

	@AfterMethod

	public void backToHomePage2() throws Throwable {
		hp.backToHomePage(driver);

	}

	@AfterClass
	public void logOut() throws Throwable {

		lp.logOut(driver);
		Reporter.log("Logout sucessfully.", true);
		Reporter.log(" ", true);

		driver.quit();
		Reporter.log("Browser close sucessfully.", true);
		Reporter.log(" ", true);

	}
}
