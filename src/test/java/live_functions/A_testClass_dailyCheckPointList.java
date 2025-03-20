package live_functions;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class A_testClass_dailyCheckPointList extends B_baseClass {

	String date;
	String gCurrntTime;
	
	String gTimeA3min;
	String gTimeA5min;
	String gTimeA7min;
	String gTimeA9min;
	String gTimeA11min;
	String gTimeA15min;
	String gTimeA22min;
	String gTimeA30min;
	String gTimeA67min;
	String gTimeA82min;
	
	String gTime2A7min;
	String gTime2A9min;
	String gTime2A11min;
	String gTime2A15min;
	String gTime2A22min;
	String gTime2A30min;
	String gTime2A67min;
	String gTime2A88min;
	
	
	
	
	String gTimeHHMM;
	String dateDDMMYY;

	String date2;
	String dateAft2Days;
	String today;
	String dayCount ;
	String dayAf2day;
	String dayAf4day;
	
	String newStationUser;
	

	

	
	
	

	

	

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
	l_attribute at;
	j_resource rec;
	n_addUsers ff;
	o_fireStation st;
	p_vehicleUser vu;
	q_checkList cl;
	r_permissionGroup pg;
	j_alarmLoop al;
	s_alarmTemplate atem;
	t_stormAlarm salm;
	
	
	
	
	@BeforeSuite
	public void BeforeSuite () throws Throwable
	{
		getBranchName();
		
		browserLounch();

		
	
	}
	
	@BeforeTest
	public void BeforeTest () throws Throwable
	{
		lp = new C_logIn_logOut(driver);
		hp = new D_homePage(driver);
		
	
		
	
		
		
		lp.logInUser(userName, password, driver);
		
		
		
		
		
		
	}
	
	
	

	@BeforeClass
	public void lounchBrowser() throws Throwable {

	
		

		

		hp.langChange(driver);
		ma = new E_manualAlarm(driver);
		ip = new F_information(driver);
		ep = new G_InfoEvent(driver);
		tmc = new AAAAA_timeClasss();
		ta = new H_testAlarm(driver);

		ar = new I_availabilityRequest(driver);

		ce = new j_calendarEvent(driver);
		
		salm=new t_stormAlarm (driver) ;

		tmc.catchTime(driver);
		
		
		
	
		date = tmc.germanyTodaysDate;
		gCurrntTime = tmc.germanycurrentTime;
		gTimeA3min = tmc.germanyTimeAfter3Minutes;
		gTimeA7min = tmc.germanyTimeAfter7Minutes;
		gTimeA9min = tmc.germanyTimeAfter9Minutes;
		gTimeA11min = tmc.germanyTimeAfter11Minutes;
		gTimeA15min = tmc.germanyTimeAfter15Minutes;
		gTimeA22min = tmc.germanyTimeAfter22Minutes;
		gTimeA30min = tmc.germanyTimeAfter30Minutes;
		gTimeA67min = tmc.germanyTimeAfter67Minutes;
		
		gTime2A7min= tmc.germanyTime2After7Minutes;
		gTime2A9min= tmc.germanyTime2After9Minutes;
		gTime2A11min=tmc.germanyTime2After11Minutes;
		gTime2A15min=tmc.germanyTime2After15Minutes;
		gTime2A22min=tmc.germanyTime2After22Minutes;
		gTime2A30min=tmc.germanyTime2After30Minutes;
		
		gTime2A67min =tmc.germanyTime2After67Minutes;
	    gTime2A88min =tmc.germanyTime2After88Minutes;
		
		
				
		
		
		gTimeHHMM =tmc.germanycurrentTimeHHMM;
		dateDDMMYY =tmc.germanyTodaysDate2;
		
		
		date2 = tmc.germanyTomorrowDate2;
		dateAft2Days = tmc.germanyDateAfterTwoDyas;

		tmc.getDays(driver);
		tmc.getDaysDetail(driver);
		today = tmc.TodaysDay;
		dayCount = String.valueOf(tmc.count);
		dayAf2day = tmc.dayTow;
		dayAf4day = tmc.dayFour;
	
		
		
	

		mu = new k_monitorUser(driver);
		cg = new m_ChatGroup (driver) ;
		
		at=new l_attribute(driver) ;
		
	
		
		rec=new j_resource (driver);
		ff=new n_addUsers (driver);
		st=new o_fireStation (driver) ;
		vu=new p_vehicleUser (driver) ;
		cl=new q_checkList (driver) ;
		
		pg=new r_permissionGroup (driver);
		al = new j_alarmLoop (driver);
		atem=new s_alarmTemplate(driver);
		
		
		
		
		Reporter.log("Hello, Daily check point checking process of "+BranchNameB +" has started.-"+date+">"+gCurrntTime, true);
		
		Reporter.log(" ", true);
		Reporter.log("Todays is "+dayCount+" "+today+" of this month.", true);
		Reporter.log(" ", true);
		
		
		

	}

	@BeforeMethod
	public void backToHomePage() throws Throwable {
		hp.backToHomePage(driver);

	}
	@Test

	public void time() throws Throwable {
		tmc.catchTime(driver);

		
	}
	
	
	
	

	
	@Test

	public void userDetails() throws Throwable 
	{

		Reporter.log(" ", true);
		Reporter.log("Department user # " + userName + " # log in sucessfully", true);
		Reporter.log(" ", true);
	}

	

	@Test

	public void createStormAlarm() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of create new storm is started.", true);
		salm.stormAlarm(driver, dateDDMMYY, gTimeHHMM,  deptName,  St1N,BranchNameB);
		Reporter.log("The process of create new storm is complete.", true);
		Reporter.log(" ", true);
		Reporter.log("The process of extend storm is started.", true);
		salm.extendStormAlarm(driver,BranchNameB);
		Reporter.log("The process of extend storm is complete.", true);
		Reporter.log(" ", true);
		
		
		
	
	}
	
	
	@Test

	public void addEventCategory() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of adding new event category is started.", true);
		ce.calendarEventCommon(driver,BranchNameB);
		ce.addEventCategory( driver,  dateDDMMYY,   gTimeHHMM,  deptName,  St1N, BranchNameB);
		
		Reporter.log("The process of new event category is complete.", true);
		Reporter.log(" ", true);
		
	
	}
	
	
	
	
	
	
	
	
	
	@Test

	public void createAlamTemplate() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of adding new alarm template is started.", true);
		atem.commonForAlarmTemplate(driver,BranchNameB);
		atem.addAlarmTemplate(driver, dateDDMMYY, gTimeHHMM,  deptName, St1N, St1V1,BranchNameB);
		
		Reporter.log("The process of adding new alarm template is complete.", true);
		Reporter.log(" ", true);
		
	
	}
	
	
	
	
	
	
	
	@Test

	public void createAlamLoop() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of adding new alarm loop is started.", true);
		al.commonForAlarmLoop(driver,BranchNameB);
		al.addAlarmLoop(driver, dateDDMMYY, gTimeHHMM,deptName, St1N,BranchNameB);
		Reporter.log("The process of adding new alarm loop is complete.", true);
		Reporter.log(" ", true);
		
	
	}

	
	
	
	
	@Test

	public void createResource() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of adding new resource is started.", true);
		rec.addResource(driver, dateDDMMYY, gTimeHHMM,deptName, St1N,BranchNameB);
		Reporter.log("The process of adding new resource is complete.", true);
		Reporter.log(" ", true);
		
	
	}

	
	
	@Test

	public void createPermissionGroupDefaultStation() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of creating permission group for default station is started.", true);
		pg.createPrmissionGroup(driver, dateDDMMYY, gTimeHHMM, BranchNameB);
		Reporter.log("The process of creating permission group for default station is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	
	
	
	@Test

	public void createNormalCheckList() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of creating normal check list is started.", true);
		cl.commonForCheckList(driver,BranchNameB);
		cl.createCheckListNormal(driver, dateDDMMYY, gTimeHHMM, deptName, St1N,BranchNameB);
		Reporter.log("The process of creating normal check list is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	@Test

	public void createAlarmCheckList() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of creating alarm check list is started.", true);
		cl.commonForCheckList(driver,BranchNameB);
		cl.createCheckListAlarm(driver, dateDDMMYY, gTimeHHMM,deptName, St1N, BranchNameB);
		Reporter.log("The process of creating alarm check list is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	
	
	
	
	
	@Test

	public void createChatGrouForStation06Users() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of creating a chat group is started.", true);
		cg.commonForCreateGroup(driver,BranchNameB);
		cg.createGroupByAttribute(driver, date, gCurrntTime,deptName, St1N,BranchNameB);
		Reporter.log("The process of creating a chat group is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	
	
	
	
	@Test

	public void createChatGrouForNewStation() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of creating a chat group is started.", true);
		cg.commonForCreateGroup(driver,BranchNameB);
		cg.createNewChatGroupForNewFirefighter(driver, dateDDMMYY, gTimeHHMM, BranchNameB);
		Reporter.log("The process of creating a chat group is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	@Test

	public void createChatgroupByAttribute() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of creating chat group by attribute is started.", true);
		cg.commonForCreateGroup(driver,BranchNameB);
		cg.createGroupByAttribute(driver, date, gCurrntTime,deptName, St1N,BranchNameB);
	
		Reporter.log("The process of creating chat group by attribute is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	
	
	@Test

	public void createChatgroupByResource() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of creating chat group by resource is started.", true);
		cg.commonForCreateGroup(driver,BranchNameB);
		cg.createGroupByResource(driver, date, gCurrntTime,deptName, St1N,BranchNameB);
	
		Reporter.log("The process of creating chat group by resource is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	@Test

	public void createChatgroupByFirefighter() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of creating chat group by fire fightr is started.", true);
		cg.commonForCreateGroup(driver,BranchNameB);
		cg.createGroupByFirefighter(driver, date, gCurrntTime, deptName, St1N,BranchNameB);
	
		Reporter.log("The process of creating chat group by fire fightr is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	@Test

	public void createChatgroupByAlarmloop() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of creating chat group by alarm loop is started.", true);
		cg.commonForCreateGroup(driver,BranchNameB);
		cg.createGroupByAlarmLoop(driver, date, gCurrntTime ,deptName, St1N, BranchNameB);
	
		Reporter.log("The process of creating chat group by alarm loop is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	
	
	@Test

	public void sendMessageChatGrouCreatedByAttribute() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of sending message to a chat group created by attribute is started.", true);
		cg.commonForCreateGroup(driver,BranchNameB);
		cg.sendMessageToGtoupByAttribute(driver, date, gCurrntTime,BranchNameB);
	
		Reporter.log("The process of sending message to a chat group created by attribute is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	
	@Test

	public void sendMessageChatGrouCreatedByResource() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of sending message to a chat group created by Resource is started.", true);
		cg.commonForCreateGroup(driver,BranchNameB);
		cg.sendMessageToGtoupByResource(driver, date, gCurrntTime,BranchNameB);
	
		Reporter.log("The process of sending message to a chat group created by Resource is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	

	@Test

	public void sendMessageChatGrouCreatedByFirefighter() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of sending message to a chat group created by Firefighter is started.", true);
		cg.commonForCreateGroup(driver,BranchNameB);
		cg.sendMessageToGtoupByFirefighter(driver, date, gCurrntTime,BranchNameB);
	
		Reporter.log("The process of sending message to a chat group created by Firefighter is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	@Test

	public void sendMessageChatGrouCreatedByAlarmLoop() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of sending message to a chat group created by AlarmLoop is started.", true);
		cg.commonForCreateGroup(driver,BranchNameB);
		cg.sendMessageToGtoupByAlarmLoop(driver, date, gCurrntTime,BranchNameB);
	
		Reporter.log("The process of sending message to a chat group created by AlarmLoop is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	@Test

	public void sendMessageChatGrouForNewStation() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of sending message to a chat group is started.", true);
		cg.commonForCreateGroup(driver,BranchNameB);
		cg.sendMessageToNewChatGroupForNewFirefighter(driver, dateDDMMYY, gTimeHHMM,BranchNameB);
	
		Reporter.log("The process of sending message to a chat group is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	
	
	
	
	

	
	@Test

	public void ManulaAlarmRepeate() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of creating a manual alarm by new firefighter is started.", true);
		ma.manualAlarmCommon(driver, BranchNameB);
		ma.ManulaAlarmRepeate(driver, date);
		Reporter.log("The process of creating a manual alarm by new firefighter is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	

	
	@Test

	public void createManualAlarmByNewFireighterForNewStation() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of creating a manual alarm by new firefighter is started.", true);
		ma.manualAlarmCommon(driver, BranchNameB);
		ma.manualAlarmByNewFireFighter(driver, dateDDMMYY, gTimeHHMM,BranchNameB);
		Reporter.log("The process of creating a manual alarm by new firefighter is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	
	@Test

	public void extendAlarmFrom07To06ByAttribute() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of create alarm from stataion 06 and extend to station 07 is started.", true);
		ma.manualAlarmCommon(driver, BranchNameB);
		ma.extendManualAlarmByAttributeFrom07ToSt06(driver, date,  deptName,  St2N, st2V1,St1N, BranchNameB);
		
		Reporter.log("The create alarm from stataion 06 and extend to station 07 is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	@Test

	public void extendLowPriorityAlarmFrom07To06ByAttribute() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of create low priority alarm from stataion 06 and extend to station 07 is started.", true);
		ma.manualAlarmCommon(driver, BranchNameB);
		ma.extendLowManualAlarmByAttributeFrom07ToSt06(driver, date,  deptName,  St2N,  st2V1, St1N, BranchNameB);
		
		Reporter.log("The create low priority alarm from stataion 06 and extend to station 07 is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	@Test

	public void lowPriorityAlarmWithEscalationResource() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of creating low priority alarm with escalation resource is started.", true);
		ma.manualAlarmCommon(driver, BranchNameB);
		ma.manualAlarmLowPriorityByEscalationResource(driver,  date, deptName,  St1N,  BranchNameB);
		
		Reporter.log("The create creating low priority alarm with escalation resource is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	@Test

	public void manualAlarmEclation07to06 () throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of creating manual alarm to escalate from station 07 to 06  is started.", true);
		ma.manualAlarmCommon(driver, BranchNameB);
		ma.manualAlarmEclation07to06(driver,  date, deptName,  St2N,  BranchNameB);
		
		Reporter.log("The process of creating manual alarm to escalate from station 07 to 06 is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	@Test

	public void addVehicleUserForStation06() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of add new vehicle for station 06 is started.", true);
		
	vu.commonForVehicleUser(driver,BranchNameB);
	vu.addVehicleUser(driver,dailyVehicleEmailId1,dailyVehicleEmailId2, deptName, St1N, st1Recs, BranchNameB);
		
		Reporter.log("The process of aadd new vehicle for station 06 is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	
	
	
	
	@Test

	public void addFireStation() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of add new station is started.", true);
		st.CommonForStation(driver,BranchNameB);
		st.createStation(driver, dateDDMMYY, gTimeHHMM ,BranchNameB);
		
		
		Reporter.log("The process of aadd new station is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	@Test

	public void addStationUserForStation06() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of add station user is started.", true);
		ff.commonForAddUers(driver,BranchNameB);
	    ff.addStationUserForStation06(driver, dateDDMMYY, gTimeHHMM,deptName, St1N,stUEmail, BranchNameB);
	    newStationUser=ff.newStationUser;
		
		
		Reporter.log("The process of add station uers is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	@Test

	public void addMultyRoleUserForStation06() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of add multy role user is started.", true);
		ff.commonForAddUers(driver,BranchNameB);
	    ff.addMultyRoleUserForStation06( driver, dateDDMMYY, gTimeHHMM,  deptName, St1N, MRUserEmail,  BranchNameB);
	    newStationUser=ff.newStationUser;
		
		
		Reporter.log("The process of add station uers is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	
	
	
	
	
	@Test

	public void addFirefighter1ForNewStation06() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of add fire fighter is started.", true);
		ff.commonForAddUers(driver,BranchNameB);
		ff.addfireFighter1ForStation06(driver, dateDDMMYY, gTimeHHMM,deptName,St1N, st1Atti, st1Recs,ff1UEmail,ff2UEmail,BranchNameB);
		
		
		Reporter.log("The process of add fire fighter is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	@Test

	public void addFirefighter2ForNewStation06() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of add fire fighter is started.", true);
		ff.commonForAddUers(driver,BranchNameB);
		ff.addfireFighter2ForStation06(driver, dateDDMMYY, gTimeHHMM,deptName,St1N, st1Atti, st1Recs,ff1UEmail,ff2UEmail,BranchNameB);
		
		
		Reporter.log("The process of add fire fighter is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	
	
	
	
	
	 
	
	
	@Test

	public void addResourceForNewStation() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of creating resorce is started.", true);
		
		
		rec.addResourceForNewStation(driver, dateDDMMYY, gTimeHHMM ,BranchNameB);
		
		
		
		Reporter.log("The process of creating resorce is is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	
	
	
	@Test 

	public void CreateAttributeForDepartment() throws Throwable {

		Reporter.log(" ", true);
		Reporter.log("The process of creating attribute is started.", true);
		
		at.addAttribute(driver,dateDDMMYY,gTimeHHMM,deptName,BranchNameB);
		
		
		Reporter.log("The process of creating attribute is is complete.", true);
		Reporter.log(" ", true);
	
	}

	
	@Test

	public void createMonitorInformation01() throws Throwable {

		Reporter.log(" ", true);
		Reporter.log("The process of creating information 1 from " + gTimeA7min + " to " + gTimeA22min
				+ " for monitor is started.", true);
		ip.infoEventCommon(driver,BranchNameB);
		ip.createInformationForMonitor(driver, gTimeA7min, gTimeA22min, date,deptName,St1N,BranchNameB);
		Reporter.log("The process of creating information 1 for monitor is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test


	public void createMonitorInformation02() throws Throwable {

		Reporter.log(" ", true);
		Reporter.log("The process of creating information 2 from " + gTimeA15min + " to " + gTimeA30min
				+ " for monitor is started.", true);
		ip.infoEventCommon(driver,BranchNameB);
		ip.createInformationForMonitor(driver, gTimeA15min, gTimeA30min, date,deptName,St1N,BranchNameB);
		Reporter.log("The process of creating information 2 for monitor is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	




	
	
	
@Test
	
	public void createTestAlarmByAttributeOneTime() throws Throwable {
	
	tmc.catchTime2(driver);
//	gTimeA3min =tmc.germanyTimeAfter3Minutes;
	gTimeA5min = tmc.germanyTimeAfter5Minutes;
		Reporter.log(" ", true);
		Reporter.log("The process of creating a test alarm by attribute with remindar one time is started.",true);
		ta.testAlarmCommon(driver,BranchNameB);
		ta.testAlarmByOnetime(driver,  date,  gTimeA5min,  today, deptName, St1N, St1V1,  St1V2 ,BranchNameB);

		Reporter.log("The process of creating a test alarm by attribute with remindar one time is complete.",true);
		Reporter.log(" ", true);

		Thread.sleep(3000);
	}


@Test

public void createTestAlarmByAttributeRecursivedaily() throws Throwable {

tmc.catchTime2(driver);
gTimeA5min = tmc.germanyTimeAfter5Minutes;

	Reporter.log(" ", true);
	Reporter.log("The process of creating a test alarm by resource with remindar recursive > daily is started.",true);
	ta.testAlarmCommon(driver,BranchNameB);
	ta.testAlarmByRecursiveDaily(driver,  date ,  gTimeA5min,   today, deptName, St1N, St1V1,  St1V2 ,   BranchNameB);

	Reporter.log("The process of creating a test alarm by resource with remindar recursive > daily is complete.",true);
	Reporter.log(" ", true);

	Thread.sleep(3000);
}

@Test

public void createTestAlarmByAttributeRecursiveWeekly() throws Throwable {
tmc.catchTime2(driver);
//gTimeA7min = tmc.germanyTimeAfter7Minutes;
gTimeA5min = tmc.germanyTimeAfter5Minutes;
	Reporter.log(" ", true);
	Reporter.log("The process of creating a test alarm by fire fighter with remindar recursive > weekly is started.",true);
	ta.testAlarmCommon(driver,BranchNameB);
	ta.testAlarmByRecursiveWeekly(driver,   date ,  gTimeA5min,  today , deptName, St1N, St1V1,  St1V2,  BranchNameB);

	Reporter.log("The process of creating a test alarm by fire fighter with remindar recursive > weekly is complete.",true);
	Reporter.log(" ", true);

	Thread.sleep(3000);
}

	
	
@Test
	
	public void testAlarmByRecursiveMonthlyDayWise() throws Throwable {
	
		tmc.catchTime2(driver);
//		gTimeA7min = tmc.germanyTimeAfter7Minutes;
		gTimeA5min = tmc.germanyTimeAfter5Minutes;
		Reporter.log(" ", true);
		Reporter.log("The process of creating a test alarm by alarm loop 1 with remindar recirsive > monthly > day wise is started.",true);
		ta.testAlarmCommon(driver,BranchNameB);
		ta.testAlarmByRecursiveMonthlyDayWise(driver,  date ,  gTimeA5min,  dayCount, today,  deptName, St1N, St1V1,  St1V2,  BranchNameB);
	
		Reporter.log("The process of creating a test alarm by alarm loop 2 with remindar recirsive > monthly > day wise is complete.",true);
		Reporter.log(" ", true);

		Thread.sleep(3000);
	}
	
	


	
	
	
	@Test
	
	public void createTestAlarmByAttributeRecursiveMontlyDateWise() throws Throwable {

		tmc.catchTime2(driver);
		gTimeA11min = tmc.germanyTimeAfter11Minutes;
		gTimeA5min = tmc.germanyTimeAfter5Minutes;

		Reporter.log(" ", true);
		Reporter.log("The process of creating a test alarm by alarm loop 2 with remindar recursive > monthly > date wise is started.",true);
		ta.testAlarmCommon(driver,BranchNameB);
		ta.testAlarmByRecursiveMonthlyDateWais( driver,  date ,   gTimeA7min ,   deptName,  St1N,  St1V1,   St1V2,   BranchNameB);

		Reporter.log("The process of creating a test alarm by alarm loop 2 with remindar recursive > monthly > date wise is complete.",true);
		Reporter.log(" ", true);

		Thread.sleep(3000);
	}

	@Test

	public void createManualAlarmByAttribute() throws Throwable {
		
				
		Reporter.log(" ", true);
		Reporter.log("The process of creating a manual alarm by attribute is started.", true);
		ma.manualAlarmCommon(driver,BranchNameB);
		ma.manualAlarmByAttribute(driver, date, deptName, St1N, St1V1,  St1V2, BranchNameB);
		Reporter.log("The process of creating a manual alarm by attribute is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test

	public void createManualAlarmByResource() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of creating a manual alarm by resource is started.", true);
		ma.manualAlarmCommon(driver,BranchNameB);
		ma.manualAlarmByResource(driver, date,deptName,St1N, BranchNameB);
		Reporter.log("The process of creating a manual alarm by resource is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}

	

	@Test

	public void createLowPriorityManualAlarmByResource() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of creating a low priority manual alarm by resource is started.", true);
		ma.manualAlarmCommon(driver,BranchNameB);
		ma.manualAlarmLowPriorityByResource( driver, date,  deptName,  St1N,  St1V1,  St1V2,  BranchNameB);
		Reporter.log("The process of creating a low priority manual alarm by resource is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	
	
	
	
	
	
	
	@Test

	public void createManualAlarmByFireFighte() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of creating a manual alarm by firefighter is started.", true);
		ma.manualAlarmCommon(driver,BranchNameB);
		ma.manualAlarmByFireFighter(driver, date,  deptName,  St1N,  St1V1,  St1V2, BranchNameB);
		Reporter.log("The process of creating a manual alarm by firefighter is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test

	public void createManualAlarmByEscalationResource() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of creating a manual alarm by escaltion resource is started.", true);
		ma.manualAlarmCommon(driver, BranchNameB);
		ma.manualAlarmByEscalationResource(driver, date,  deptName,  St1N, BranchNameB);
		Reporter.log("The process of creating a manual alarm by escaltion resource is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test

	public void createLowPriorityManualAlarmByAttribute() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of creating low priority manual alarm by attribute is started.", true);
		ma.manualAlarmCommon(driver, BranchNameB);
		ma.manualAlarmLowPriorityByAttribute(driver, date, deptName,  St1N,  St1V1,  St1V2, BranchNameB);
		Reporter.log("The process of creating low priority manual alarm by attribute is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	
	
	@Test

	public void createLowPriorityManualAlarmByEscalationResource() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of creating low priority manual alarm by escalation resource is started.", true);
		ma.manualAlarmCommon(driver, BranchNameB);
		ma.manualAlarmLowPriorityByEscalationResource(driver,  date, deptName,  St1N,  BranchNameB);
		Reporter.log("The process of creating low priority manual alarm by escalation resource is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test

	public void sendmessageToAlarmUser() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The Process of send message to user is started.", true);
		ma.manualAlarmCommon(driver, BranchNameB);
		ma.sendmessageToAlarmUser(driver, date,BranchNameB);
		Reporter.log("The Process of send message to user is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test

	public void sendmessageToNewApiAlarmUser() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The Process of send message to new api alarm user is started.", true);
		ma.manualAlarmCommon(driver, BranchNameB);
		ma.sendmessageToNewApiAlarmUser(driver, date2, date);
		Reporter.log("The Process of send message to new api alarm user is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	
	
	
	
	
	
	
	@Test

	public void sendmessageToApiAlarmUser() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The Process of send message to user is started.", true);
		ma.manualAlarmCommon(driver, BranchNameB);
		ma.sendmessageToApiAlarmUser(driver, date2, date);
		Reporter.log("The Process of send message to user is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	
	@Test

	public void extendAlarmToSecondStation() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of extend alarm is started.", true);
		ma.manualAlarmCommon(driver, BranchNameB);
		ma.extendAlarm(driver, date,St2N, BranchNameB);
		Reporter.log("The process of extend alarm is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test

	public void createInformationByAttribute() throws Throwable {
		
		tmc.catchTime2(driver);
		gCurrntTime =tmc.germanycurrentTime;
		Reporter.log(" ", true);
		Reporter.log("The process of creating information by attribute is started.", true);
		ip.infoEventCommon(driver,BranchNameB);
		ip.createInformationByAttribute(driver,gCurrntTime, deptName,St1N,BranchNameB);
		Reporter.log("The process of creating information by attribute is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test

	public void createInformationByResource() throws Throwable {
		tmc.catchTime2(driver);
		gCurrntTime =tmc.germanycurrentTime;
		Reporter.log(" ", true);
		Reporter.log("The process of creating information by resource is started.", true);
		ip.infoEventCommon(driver,BranchNameB);
		ip.createInformationByResource(driver,gCurrntTime,deptName,St1N,BranchNameB);
		Reporter.log("The process of creating information by resource is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test

	public void createInformationByFirefighter() throws Throwable {
		tmc.catchTime2(driver);
		gCurrntTime =tmc.germanycurrentTime;
		Reporter.log(" ", true);
		Reporter.log("The process of creating information by firefighter is started.", true);
		ip.infoEventCommon(driver,BranchNameB);
		ip.createInformationByfireFighter(driver,gCurrntTime,deptName,St1N,BranchNameB);
		Reporter.log("The process of creating information by firefighter is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test
	public void sendmessageToinfoUsers() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of send message to information users is started.", true);
		ip.infoEventCommon(driver,BranchNameB);
		ip.sendmessageToInfoUsers(driver,BranchNameB);
		Reporter.log("The process of send message to information users is started is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test

	public void createInfoEventByAttributeSchedule() throws Throwable {

		tmc.catchTime2(driver);
		date = tmc.germanyTodaysDate;
		gCurrntTime =tmc.germanycurrentTime;
		gTimeA7min = tmc.germanyTimeAfter7Minutes;
		gTimeA22min = tmc.germanyTimeAfter22Minutes;
		Reporter.log(" ", true);
		Reporter.log("The process of create info-event schedule by attribute is started.", true);
		ip.infoEventCommon(driver,BranchNameB);
		ep.createEventByAttributeSchedule(driver, date,gCurrntTime, gTimeA7min, gTimeA22min,deptName,St1N,BranchNameB);
		Reporter.log("The process of create info-event schedule by attribute is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test
	public void createInfoEventByResourceSchedule() throws Throwable {

		tmc.catchTime2(driver);
		date = tmc.germanyTodaysDate;
		gCurrntTime =tmc.germanycurrentTime;
		gTimeA67min = tmc.germanyTimeAfter67Minutes;
		gTimeA82min = tmc.germanyTimeAfter82Minutes;

		Reporter.log(" ", true);
		Reporter.log("The process of create info-event schedule by resource is started.", true);
		ip.infoEventCommon(driver,BranchNameB);
		ep.createEventByResourceSchedule(driver, date,gCurrntTime, gTimeA67min, gTimeA82min,deptName,St1N,BranchNameB);
		Reporter.log("The process of create info-event schedule by attribute is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test
	public void createInfoEventByFighterSchedule() throws Throwable {

		tmc.catchTime2(driver);
		gCurrntTime =tmc.germanycurrentTime;
		gTimeA7min = tmc.germanyTimeAfter7Minutes;
		gTimeA22min = tmc.germanyTimeAfter22Minutes;

		Reporter.log(" ", true);
		Reporter.log("The process of create info-event schedule by firefighter is started.", true);
		ip.infoEventCommon(driver,BranchNameB);
		ep.createEventByFireFightrSchedule(driver, date2,gCurrntTime, gTimeA7min, gTimeA22min,deptName,St1N,BranchNameB);

		Reporter.log("The process of create info-event schedule by firefighter is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test

	public void createInfoEventByAttribute() throws Throwable {
		tmc.catchTime2(driver);
		gCurrntTime =tmc.germanycurrentTime;
		Reporter.log(" ", true);
		Reporter.log("The process of create info-event by attribute is started.", true);
		ip.infoEventCommon(driver,BranchNameB);
		ep.createEventByAttribute(driver, date,gCurrntTime, deptName,St1N,BranchNameB);
		Reporter.log("The process of create info-event by attribute is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test

	public void createInfoEventByResource() throws Throwable {
		tmc.catchTime2(driver);
		gCurrntTime =tmc.germanycurrentTime;
		Reporter.log(" ", true);
		Reporter.log("The process of create info-event by resource is started.", true);
		ip.infoEventCommon(driver,BranchNameB);
		ep.createEventByResource(driver, date,gCurrntTime, deptName,St1N,BranchNameB);
		Reporter.log("The process of create info-event by resource is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test

	public void createInfoEventByFirefighter() throws Throwable {
		tmc.catchTime2(driver);
		gCurrntTime =tmc.germanycurrentTime;
		Reporter.log(" ", true);
		Reporter.log("The process of create info-event by firefighter is started.", true);
		ip.infoEventCommon(driver,BranchNameB);
		ep.createEventByFirefighter(driver, date,gCurrntTime, deptName,St1N,BranchNameB);
		Reporter.log("The process of create info-event by firefighter is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

//	@Test
//
//	public void sendmessageToInfoEventUsers() throws Throwable {
//		Reporter.log(" ", true);
//		Reporter.log("The process of create info-event by firefighter is started.", true);
//		ip.infoEventCommon(driver);
//		ep.createEventByFirefighter(driver, date);
//		Reporter.log("The process of create info-event by firefighter is complete.", true);
//		Reporter.log(" ", true);
//		Thread.sleep(3000);
//	}

	@Test
	public void sendmessageToinfoEventUsers() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of send message to info-event users is started.", true);
		ip.infoEventCommon(driver,BranchNameB);
		ep.sendmessageToInfoEventUsers(driver,BranchNameB);
		Reporter.log("The process of send message to info-event users is started is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test
	public void createAvailabilityRequestSendImmediat() throws Throwable {
	
		
		Reporter.log(" ", true);
		Reporter.log("The process of create availability request > send imediate is started.", true);
		ar.availabilityRequestCommon(driver,BranchNameB);
		ar.ARSendImmediate(driver,date, date2, gTimeA7min, dateAft2Days, gTimeA22min,deptName,BranchNameB);
		Reporter.log("The process of create availability request > send imediate is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test
	public void createAvailabilityRequestSendSchedule() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of create availability request > schedule is started.", true);
		ar.availabilityRequestCommon(driver,BranchNameB);
		ar.ARSendSchedule(driver, date, date2, gTimeA7min, dateAft2Days, gTimeA22min,deptName, BranchNameB);
		Reporter.log("The process of create availability request > schedule is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test
	public void createAvailabilityRequestSendRecursive() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of create availability request > recursive is started.", true);
		ar.availabilityRequestCommon(driver,BranchNameB);
		ar.ARRecursivee(driver,date, today, gTimeA7min, gTimeA22min, dayAf2day, dayAf4day,deptName,BranchNameB);
		Reporter.log("The process of create availability request > recursive is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test
	public void createAvailabilityRequestSendMultipleDays() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of create availability request > multiple days is started.", true);
		ar.availabilityRequestCommon(driver,BranchNameB);
		ar.ARSendMultiple(driver, date, gTimeA7min, gTimeA11min, gTimeA15min, dayAf2day, dayAf4day, gTimeA22min,deptName,BranchNameB);
		Reporter.log("The process of create availability request > multiple days is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test
	public void SendmessagetoARUsers() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of send message to availability request users is started.", true);
		ar.availabilityRequestCommonDashboard(driver,BranchNameB);
		ar.messageToARUser(driver,BranchNameB);
		Reporter.log("The process of csend message to availability request users is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test
	public void cretecalendarEventAttributeSchedule() throws Throwable {
		
		tmc.catchTime(driver);
		
		gCurrntTime =tmc.germanycurrentTime;
		
		gTime2A7min = tmc.germanyTime2After7Minutes;
		gTime2A22min = tmc.germanyTime2After22Minutes;
		Reporter.log(" ", true);
		Reporter.log("The process of create calendar event by attribute is started.", true);
		ce.calendarEventCommon(driver,BranchNameB);
		ce.calendarEventByAttributeSchedul(driver, date,gCurrntTime, gTime2A7min, gTime2A22min,St1N, BranchNameB);
		Reporter.log("The process of create calendar event by attribute is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	@Test
	public void cretecalendarEventResourceSchedule() throws Throwable {
		
		tmc.catchTime(driver);
		gTime2A67min = tmc.germanyTime2After67Minutes;
		gTime2A88min = tmc.germanyTime2After88Minutes;
		Reporter.log(" ", true);
		Reporter.log("The process of create calendar event by resource is started.", true);
		ce.calendarEventCommon(driver,BranchNameB);
		ce.calendarEventByResorceSchedul(driver, date,gCurrntTime, gTime2A67min, gTime2A88min,St1N, BranchNameB);
		Reporter.log("The process of create calendar event by resource is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
		
	}
	
	
	@Test
	public void cretecalendarEventFirefighterSchedule() throws Throwable {
		
		tmc.catchTime(driver);
		gTime2A7min = tmc.germanyTime2After7Minutes;
		gTime2A22min = tmc.germanyTime2After22Minutes;
		Reporter.log(" ", true);
		Reporter.log("The process of create calendar event by Firefighter is started.", true);
		ce.calendarEventCommon(driver,BranchNameB);
		ce.calendarEventByFirefighterSchedul(driver, date, date2, gCurrntTime, gTime2A7min, gTime2A22min,St1N,BranchNameB);
		Reporter.log("The process of create calendar event by Firefighter is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

	@Test
	public void sendmessageToTestAlarmUsers() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of send message to test alarm user is started", true);
		ta.testAlarmOverviewCommon(driver,BranchNameB);
		ta.semdmessageToTestAlarmUsers(driver, date, gTimeA11min,BranchNameB);
		Reporter.log("The process of send message to test alarm user is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test
	public void createNewStationMonitorUser() throws Throwable {
		Reporter.log(" ", true);	
		Reporter.log("The process of create station monitor user is started.", true);
		mu.commonForMonitorUser(driver,BranchNameB);
		mu.createNewMonitorUser(driver, dateDDMMYY, gTimeHHMM,BranchNameB);
		Reporter.log("The process of create station monitor user is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	@Test
	public void createMonitorUserForSt06() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of create station monitor user is started.", true);
		mu.commonForMonitorUser(driver,BranchNameB);
		mu.createMonitorUserForStation06(driver,BranchNameB);
		Reporter.log("The process of create station monitor user is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	
	
	@Test
	public void logInNewMonitorUser() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of login new monitor user is started.", true);
		browserLounch();
		lp.logInMonitor("BG andrew station "+dateDDMMYY+gTimeHHMM+"M1", password, driver);
		
		Reporter.log("The process of login new monitor user is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	
	
	

	@Test
	public void detailsAboutScript() throws Throwable

	{
		Reporter.log(" ", true);

		Reporter.log("Login  date-" + date + " & login  time -" + gCurrntTime, true);
		String ctime=gCurrntTime;
		tmc.catchTime2(driver);
		date = tmc.germanyTodaysDate;
		gCurrntTime = tmc.germanycurrentTime;
		Reporter.log("Logout date-" + date + " & logout time -" + gCurrntTime, true);
		Reporter.log(" ", true);
	
	
		Thread.sleep(3000);

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

		

	}
	
	
	
	
	@AfterTest 
	public void AfterTest ()
	{
		driver.navigate().refresh();
		Reporter.log("Refresh the URL before successfully closing the browser.", true);
		
	}
	
	
	@AfterSuite 
	public void AfterSute ()
	{
		driver.quit();
		Reporter.log("Browser close sucessfully.", true);
		Reporter.log(" ", true);
	}
	
	
	
}
