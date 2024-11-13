package live_functions;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AAAA_testClass_deleteNewData extends B_baseClass {

	String date;
	String gCurrntTime;
	String gTimeA7min;
	String gTimeA22min;
	String gTimeA67min;
	String gTimeA82min;

	String date2;
	String dateAft2Days;

	
	String userName = "24263-DE-Bhupesh-dept-1";
	
	String password = "123456";
	

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

		browserLounch();
		Reporter.log("Hello, Live branch deleting process has started.", true);
		Reporter.log(" ", true);

		lp = new C_logIn_logOut(driver);
		hp = new D_homePage(driver);

		lp.logIn(userName, password, driver);

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
		
		Reporter.log("Hello, Live branch deleting process has started.-"+date+">"+gCurrntTime, true);
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
		ce.calendarEventCommon(driver);
		ce.deleteEventCategory(driver);
		Reporter.log("The process of delete event category is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	
	
	
	
	
	@Test
	public void deleteAlarmTemplate() throws Throwable {
		
		
		Reporter.log(" ", true);
		Reporter.log("The process of delete alarm template is started.", true);
		atem.commonForAlarmTemplate(driver);
		atem.deleteAlarmTemplate(driver);
		Reporter.log("The process of delete alarm template is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	
	
	@Test
	public void deleteAlarmLoop() throws Throwable {
		
		
		Reporter.log(" ", true);
		Reporter.log("The process of delete alarm loop is started.", true);
		al.commonForAlarmLoop(driver);
		al.deleteAlarmLoop(driver);
		Reporter.log("The process of delete alarm loop is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	
	@Test
	public void deleteCalendarEventCreatedByAttribute() throws Throwable {
		
		
		Reporter.log(" ", true);
		Reporter.log("The process of delete calendar eventcreated by attribute is started.", true);
		ce.calendarEventCommon(driver);
		ce.deletecalendarEventByAttribute(driver);
		Reporter.log("The process of delete calendar event by attribute is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	
	@Test
	public void deleteCalendarEventCreatedByResource() throws Throwable {
		
		
		Reporter.log(" ", true);
		Reporter.log("The process of delete calendar event by resource is started.", true);
		ce.calendarEventCommon(driver);
		ce.deletecalendarEventByResource(driver);
		Reporter.log("The process of delete calendar event by resource is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	@Test
	public void deleteCalendarEventCreatedByFirefighter() throws Throwable {
		
		
		Reporter.log(" ", true);
		Reporter.log("The process of delete calendar event by firefighter is started.", true);
		ce.calendarEventCommon(driver);
		ce.deletecalendarEventByFirefighter(driver);
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
		
	cl.commonForCheckList(driver);
	cl.deleteCheckLis(driver);
		
		Reporter.log("The process of delete  check list is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	@Test

	public void deleteChatGroup() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of delete Chat group is started.", true);
		
		cg.commonForCreateGroup(driver);
		cg.deleteChatGroup(driver);
		
		Reporter.log("The process of delete  delete Chat group is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	
	@Test

	public void deleteVehicleUser() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of delete vehicle is started.", true);
		
	vu.commonForVehicleUser(driver);
	vu.deleteVehicleUser(driver);
		
		Reporter.log("The process ofdelete vehicle is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	@Test
	public void deleteFireStation() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of delete fire station is started.", true);
		st.CommonForStation(driver);
		st.deleteStation(driver);
		
		
		Reporter.log("The process of delete fire station is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	
	
	@Test

	public void deleteUers() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of delete user is started.", true);
		ff.commonForAddUers(driver);
		ff.deletfireFighter(driver);
		Reporter.log("The process of delete user is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	
	
	@Test

	public void deleteResource() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of delete resource is started.", true);
		
		rec.deleteResource(driver);
		
		
		Reporter.log("The process of delete resorce is is complete.", true);
		Reporter.log(" ", true);
		
	}
	
	@Test()

	public void deleteAttribute() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of deleting attribute is started.", true);
		at.deleteAttribute(driver);
		Reporter.log("The process of deleting attribute is complted.", true);
		Reporter.log(" ", true);

	}

	@Test()

	public void deleteMonitorUser() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of deleting monitor user is started.", true);
		mu.commonForMonitorUser(driver);
		mu.deleteMonitorUser(driver);
		Reporter.log("The process of deleting monitor user is complted.", true);
		Reporter.log(" ", true);

	}

	@Test()

	public void deleteTestAlarmFromList() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of deleting a test alarm from list is started.", true);
		ta.deleteTestAlarmFromList(driver);
		Reporter.log("The process of deleting a test alarm from list is complted.", true);
		Reporter.log(" ", true);

	}

	@Test

	public void deleteTestAlarmFromOverview() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of deleting a test alarm from overview is started.", true);
		ta.testAlarmOverviewCommon(driver);
		ta.deleteTestAlarmFromOverview(driver);

		Reporter.log("The process of deleting a test alarm from overview is complted.", true);
		Reporter.log(" ", true);

	}
	
	
	
	@Test

	public void deactiveTestAlarmFromOverview() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of deactive a test alarm from ovieview is started.", true);
		ta.testAlarmOverviewCommon(driver);
        ta.deactiveTestAlarms(driver, date);
		
		Reporter.log("The process of deactive a test alarm from ovieview is complted.", true);
		Reporter.log(" ", true);

	}
	

	@Test

	public void deactiveManualAlarm() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of deactive a manual alarm is started.", true);

		ma.deactiveManualAlarms(driver, date);
		Reporter.log("The process of deactive a manual alarm is complted.", true);
		Reporter.log(" ", true);

	}
	
	
	@Test

	public void deleteManualAlarm() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of deleting a manual alarm is started.", true);

		ma.deleteAlarms(driver, date);
		Reporter.log("The process of deleting a manual alarm is complted.", true);
		Reporter.log(" ", true);

	}

	@Test
	public void delteInfoEvent() throws Throwable {

		Reporter.log(" ", true);
		Reporter.log("The process of deleting information and event is started.", true);

		ip.deleteInfoEvent(driver);
		Reporter.log("Process of delete information and event is complted.", true);

		Reporter.log(" ", true);
	}

	@Test
	public void deleteARFromList() throws Throwable {

		Reporter.log(" ", true);
		Reporter.log("The process of deleting availability request from list is started.", true);
		ar.availabilityRequestCommon(driver);
		ar.deleteAvailabilityRequestFromList(driver);

		Reporter.log("The process of deleting availability request from list is complted.", true);

		Reporter.log(" ", true);
	}

	@Test
	public void deleteARFromHistory() throws Throwable {

		Reporter.log(" ", true);
		Reporter.log("The process of deleting availability request from history is started.", true);

		ar.availabilityRequestCommonDashboard(driver);
		ar.deleteAvailabilityRequestFromHistory(driver);

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
