package live_functions;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AAA_testClass_delete2 extends B_baseClass {
	
	

	String date;
	String gCurrntTime;
	String gTimeA7min;
	String gTimeA22min;
	String gTimeA67min;
	String gTimeA82min;

	String date2;
	String dateAft2Days;
	

	

	

	

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
	monitorLogin ml;
	
	
	

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
		ml=new monitorLogin (driver);
		

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
		hp.backToHomePage(driver,BranchNameB);

	}
	

	
	
	
	
	
	
	@Test

	public void deactiveManualAlarm() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of deactive a manual alarm is started.", true);

		ma.deactiveManualAlarms(driver, date,BranchNameB);
		Reporter.log("The process of deactive a manual alarm is complted.", true);
		Reporter.log(" ", true);

	}
	
	


	@AfterMethod

	public void backToHomePage2() throws Throwable {
		hp.backToHomePage(driver,BranchNameB);

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
