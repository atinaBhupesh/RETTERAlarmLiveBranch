package live_functions;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AAA_testClass_delete3 extends B_baseClass {
	
	

	
	monitorLogin ml;
	
	
	

	@BeforeClass
	public void lounchBrowser() throws Throwable {

	
	
		

		
		ml=new monitorLogin (driver);
		
		
	}

	
	

	
	@Test

	public void deactiveAlarmFromMonitor() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of deactive alarm from monitor is started.", true);
		ml.loginMonitor(driver,BranchNameB);
		
		Reporter.log("The process of deactive alarm from monitor is complted.", true);
		Reporter.log(" ", true);

	}
	
	@AfterClass
	public void m2 ()
	{
		
		
	}
	
	
	
	
	


}
