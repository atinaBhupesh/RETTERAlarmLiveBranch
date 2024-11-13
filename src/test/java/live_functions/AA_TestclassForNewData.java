package live_functions;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AA_TestclassForNewData extends B_baseClass {
	
	
	
	
	
	
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
	
	
	
	
	
	
	
	

	@BeforeClass
	public void lounchBrowser() throws Throwable {

		browserLounch();
		

		lp = new C_logIn_logOut(driver);
		hp = new D_homePage(driver);

		lp.logIn(userName, password, driver);

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
		
		
		
		
		Reporter.log("Hello, Daily check point checking process has started.-"+date+">"+gCurrntTime, true);
		
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
		Reporter.log("live department user # " + userName + " # log in sucessfully", true);
		Reporter.log(" ", true);
	}

	@Test 

	public void CreateAttributeForDepartment() throws Throwable {

		Reporter.log(" ", true);
		Reporter.log("The process of creating attribute is started.", true);
		
		at.addAttribute2(driver,dateDDMMYY,gTimeHHMM);
		
		
		Reporter.log("The process of creating attribute is is complete.", true);
		Reporter.log(" ", true);
	
	}
	
	
	@Test

	public void addFireStation() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of add new station is started.", true);
		st.CommonForStation(driver);
		st.createStation(driver, dateDDMMYY, gTimeHHMM);
		
		
		Reporter.log("The process of aadd new station is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
//	@Test
//
//	public void addVehicleUserForNewStation() throws Throwable {
//		Reporter.log(" ", true);
//		Reporter.log("The process of add new vehicle is started.", true);
//		
//	vu.commonForVehicleUser(driver);
//	vu.addVehicleUserForNewStation(driver, dateDDMMYY, gTimeHHMM);
//		
//		Reporter.log("The process of aadd new vehicle is complete.", true);
//		Reporter.log(" ", true);
//		Thread.sleep(3000);
//		
//	}
	
	
	@Test

	public void addResourceForNewStation() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of creating resorce is started.", true);
		
		
		rec.addResourceForNewStation(driver, dateDDMMYY, gTimeHHMM);
		
		
		
		Reporter.log("The process of creating resorce is is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	@Test

	public void addFirefighterForNewStation() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of add fire fighter is started.", true);
		ff.commonForAddUers(driver);
	
		
		
		Reporter.log("The process of add fire fighter is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	@Test

	public void addNewStationUserForNewStation() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of add station user is started.", true);
		ff.commonForAddUers(driver);
	   
	    newStationUser=ff.newStationUser;
		
		
		Reporter.log("The process of add station uers is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	


	

	@Test

	public void createManualAlarmByNewFireighterForNewStation() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of creating a manual alarm by new firefighter is started.", true);
		ma.manualAlarmCommon(driver);
		ma.manualAlarmByNewFireFighter(driver, dateDDMMYY, gTimeHHMM);
		Reporter.log("The process of creating a manual alarm by new firefighter is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	
	@Test
	public void createNewStationMonitorUser() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of create station monitor user is started.", true);
		mu.commonForMonitorUser(driver);
		mu.createNewMonitorUser(driver, dateDDMMYY, gTimeHHMM);
		Reporter.log("The process of create station monitor user is complete.", true);
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

		driver.quit();
		Reporter.log("Browser close sucessfully.", true);
		Reporter.log(" ", true);

	}
	
	
	
	

}
