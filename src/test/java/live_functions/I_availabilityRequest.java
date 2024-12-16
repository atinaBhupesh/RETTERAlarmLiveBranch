package live_functions;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class I_availabilityRequest extends B_baseClass {

	@FindBy(xpath = "//span[text()=\"Availability Request\"]")private WebElement availabilityRequestModule;
	@FindBy(xpath = "//a[@href=\"http://live.retteralarm.de/admin/WeekendPlannings/list\"]")private WebElement availabilityRequesL;
	@FindBy(xpath = "//a[@href=\"http://testing.retteralarm.de/admin/WeekendPlannings/list\"]")private WebElement availabilityRequesT;
	@FindBy(xpath = "//a[@href=\"http://development.retteralarm.de/admin/WeekendPlannings/list\"]")private WebElement availabilityRequesD;

	@FindBy(xpath = "//button[@class=\"btn btn-success\"]")
	private WebElement createNewButton;
	@FindBy(xpath = "//input[@id=\"title\"]")
	private WebElement ARTitle;
	@FindBy(xpath = "//select[@id=\"PlanningResourcesIsRecursive\"]")
	private WebElement ARType;
	@FindBy(xpath = "//input[@id=\"actionImmediateRequest1\"]")
	private WebElement sendImmediateChekBox;
	@FindBy(xpath = "//span[@id=\"select2-sectionDepartment-container\"]")
	private WebElement departmentField;
	
	@FindBy(xpath = "//input[@id=\"from_date\"]")
	private WebElement ARFromDate;
	@FindBy(xpath = "//input[@id=\"from_time\"]")
	private WebElement ARFromTime;
	@FindBy(xpath = "//input[@id=\"to_date\"]")
	private WebElement ARToDate;

	@FindBy(xpath = "//input[@id=\"to_time\"]")
	private WebElement ARToTime;
	@FindBy(xpath = "(//span[@class=\"slider round\"])[2]")
	private WebElement ARSlipInDays;
	@FindBy(xpath = "(//span[@class=\"slider round\"])[3]")
	private WebElement ARSHift;
	@FindBy(xpath = "//input[@id=\"inputShift\"]")
	private WebElement addShift;
	@FindBy(xpath = "//button[@id=\"actionAddShift\"]")
	private WebElement adShiftButton;
	@FindBy(xpath = "//button[@id=\"addSubmit\"]")
	private WebElement ARSaveButton;

	@FindBy(xpath = "//input[@aria-controls=\"example1\"]")
	private WebElement searchField;
	@FindBy(xpath = "(//i[@class=\"fa fa-trash-o\"])[1]")
	private WebElement deleteAvailbilityRequest;
	@FindBy(xpath = "//button[@id=\"delYes1\"]")
	private WebElement deleteAvailbiliYes;

	@FindBy(xpath = "//a[@href=\"http://live.retteralarm.de/admin/WeekendPlannings/history\"]")private WebElement availabilityRequestHistoryL;
	@FindBy(xpath = "//a[@href=\"http://testing.retteralarm.de/admin/WeekendPlannings/history\"]")private WebElement availabilityRequestHistoryT;
	@FindBy(xpath = "//a[@href=\"http://development.retteralarm.de/admin/WeekendPlannings/history\"]")private WebElement availabilityRequestHistoryD;
	@FindBy(xpath = "//button[@id=\"dt_actionSearch\"]")
	private WebElement searchButton;
	@FindBy(xpath = "(//button[@type=\"submit\"])[1]")
	private WebElement deleteAvailbiliHistoryYes;
	@FindBy(xpath = "//input[@aria-controls=\"weekendHistoryTable\"]")
	private WebElement searFieldHistory;

	@FindBy(xpath = "//input[@id=\"requested_datetime\"]")
	private WebElement ARSendTime;

	@FindBy(xpath = "//select[@id=\"requested_day_id\"]")
	private WebElement ARday;

	@FindBy(xpath = "//input[@id=\"timePicker1\"]")
	private WebElement ARSendTime1;

	@FindBy(xpath = "//select[@name=\"data[PlanningResources][from_day]\"]")
	private WebElement ArRequestFrom;
	@FindBy(xpath = "//select[@name=\"data[PlanningResources][to_day]\"]")
	private WebElement ArRequestTo;
	@FindBy(xpath = "//input[@id=\"requested_datetime_multi1\"]")
	private WebElement ARMultiTime1;
	@FindBy(xpath = "//button[@class=\"add_field_button btn btn-primary float-right\"]")
	private WebElement addMoreTime;

	@FindBy(xpath = "//input[@id=\"requested_datetime_multi2\"]")
	private WebElement ARMultiTime2;
	@FindBy(xpath = "//input[@id=\"requested_datetime_multi3\"]")
	private WebElement ARMultiTime3;

	@FindBy(xpath = "//select[@id=\"multiple_from_day\"]")
	private WebElement ARMultiFromDay;
	@FindBy(xpath = "//input[@id=\"multiple_from_time\"]")
	private WebElement ARMultiFromTime;
	@FindBy(xpath = "//select[@id=\"multiple_to_day\"]")
	private WebElement ARMultiToDay;
	@FindBy(xpath = "//input[@id=\"multiple_to_time\"]")
	private WebElement ARMultiToTime;

	@FindBy(xpath = "//input[@aria-controls=\"weekendHistoryTable\"]")
	private WebElement ARHistorySearchField;
	@FindBy(xpath = "//button[@id=\"dt_actionSearch\"]")
	private WebElement historySearchButton;
	@FindBy(xpath = "(//a[text()=\"Chat\"])[1]")
	private WebElement ARChatOption;
	@FindBy(xpath = "//input[@placeholder=\"Write your message...\"]")
	private WebElement writemessageField;
	@FindBy(xpath = "//button[@id=\"actionSendMessage\"]")
	private WebElement sendmessageButton;
	
	@FindBy(xpath="//td[contains(text(),\"BG-AR\")]")private List<WebElement> availableDataCount;

//	Live
	@FindBy(xpath="//input[@value=\"6286\"]")private WebElement Station06;
	
	@FindBy(xpath = "//input[@id=\"ff_6286_23001\"]")private WebElement jonas3;
	@FindBy(xpath="//input[@id=\"ff_6286_22999\"]")private WebElement jonas2 ;
	
	
//	Testing
  @FindBy(xpath="//input[@value=\"980\"]")private WebElement station04;
  @FindBy(xpath="//input[@id=\"ff_980_18952\"]")private WebElement bhupeshTest;
	// @FindBy(xpath="")private WebElement ;
//@FindBy(xpath="")private WebElement ;
//@FindBy(xpath="")private WebElement ;
//@FindBy(xpath="")private WebElement ;

	public I_availabilityRequest(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void availabilityRequestCommon(WebDriver driver, String BranchNameB) throws Throwable {
	

		availabilityRequestModule.click();
		

		
		
		if  (BranchNameB.equals("1"))
		{
			availabilityRequesL.click();
		}
		
		else if (BranchNameB.equals("2"))
		{
			availabilityRequesT.click();
		}
		
		else if (BranchNameB.equals("3"))
		{
			availabilityRequesD.click();
			
		}
		

	}

	public void availabilityRequestCommonDashboard(WebDriver driver, String BranchNameB) throws Throwable {


	
	
		availabilityRequestModule.click();
	
	
		

		if  (BranchNameB.equals("1"))
		{
			availabilityRequestHistoryL.click();
		}
		
		else if (BranchNameB.equals("2"))
		{
			availabilityRequestHistoryT.click();
		}
		
		else if (BranchNameB.equals("3"))
		{
			availabilityRequestHistoryD.click();
			
		}
		
	

	}

	public void ARSendImmediate(WebDriver driver,String date, String date2, String gTimeA7min, String dateAft2Days,
			String gTimeA22min, String deptName, String BranchNameB) throws Throwable {
		Actions act = new Actions(driver);

		createNewButton.click();
	
		ARTitle.click();

		act.sendKeys("BG-AR > one time > immediate-"+date).build().perform();

		Select se = new Select(ARType);
		se.selectByVisibleText("One time");
	
		sendImmediateChekBox.click();
	
		departmentField.click();
		
		act.sendKeys(deptName).build().perform();
		Thread.sleep(2000);
	
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		
		
		
	
		
		
		switch (BranchNameB) {
		
		case "1" :
			
			Station06.click();
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);
			Station06.click();
			Thread.sleep(2000);
			
			jonas3.click();
			Thread.sleep(1000);
			jonas2.click();
			Thread.sleep(1000);
			
			
			break;
			
			
		case "2" :
			station04.click();
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);
			station04.click();
			Thread.sleep(2000);
			
			bhupeshTest.click();
			Thread.sleep(1000);
			
			break;
			
			
		
		}
		
		
		
	


		ARFromDate.click();

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		act.sendKeys(date2).build().perform();
	

		ARFromTime.click();
	
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	
		act.sendKeys(gTimeA7min).build().perform();
		

		ARToDate.click();
	
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		act.sendKeys(dateAft2Days).build().perform();
		

		ARToTime.click();
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	
		act.sendKeys(gTimeA22min).build().perform();
	

		ARSlipInDays.click();
	;

		act.sendKeys(Keys.PAGE_DOWN).build().perform();


		ARSHift.click();

		addShift.click();
		act.sendKeys("1st").build().perform();

		adShiftButton.click();

		act.sendKeys("2nd").build().perform();

		adShiftButton.click();

		ARSaveButton.click();

		driver.navigate().refresh();

	}

	public void ARSendSchedule(WebDriver driver, String date, String date2, String gTimeA7min, String dateAft2Days,
			String gTimeA22min, String deptName, String BranchNameB) throws Throwable {
		Actions act = new Actions(driver);

		createNewButton.click();
		ARTitle.click();
		act.sendKeys("BG-AR >  one time > schedule>"+date+"-"+gTimeA7min).build().perform();

		Select se = new Select(ARType);
		se.selectByVisibleText("One time");

		ARSendTime.click();

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(date + " " + gTimeA7min).build().perform();

		departmentField.click();
		act.sendKeys( deptName).build().perform();
		Thread.sleep(2000);
	
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		
      switch (BranchNameB) {
		
		case "1" :
			
			Station06.click();
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);
			Station06.click();
			Thread.sleep(2000);
			
			jonas3.click();
			Thread.sleep(1000);
			jonas2.click();
			Thread.sleep(1000);
			
			
			break;
			
			
		case "2" :
			station04.click();
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);
			station04.click();
			Thread.sleep(2000);
			
			bhupeshTest.click();
			Thread.sleep(1000);
			
			break;
			
			
		
		}


		ARFromDate.click();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(date2).build().perform();

		ARFromTime.click();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(gTimeA7min).build().perform();

		ARToDate.click();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(dateAft2Days).build().perform();

		ARToTime.click();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(gTimeA22min).build().perform();

		ARSlipInDays.click();

		ARSHift.click();

		act.sendKeys(Keys.PAGE_DOWN).build().perform();

		addShift.click();
		act.sendKeys("1st").build().perform();

		adShiftButton.click();

		act.sendKeys("2nd").build().perform();

		adShiftButton.click();

		ARSaveButton.click();
		driver.navigate().refresh();
		
		Reporter.log("Availability request schedule>"+date+"-"+gTimeA7min,true);

	}

	public void ARRecursivee(WebDriver driver,String date, String today, String gTimeA7min, String gTimeA22min, String dayAf2day,
			String dayAf4day,String deptName, String BranchNameB) throws Throwable {
		Actions act = new Actions(driver);

		createNewButton.click();
		ARTitle.click();
		act.sendKeys("BG-AR > recursive-"+ date).build().perform();

		Select se = new Select(ARType);
		se.selectByVisibleText("Recursive");

		Select se1 = new Select(ARday);
		se1.selectByVisibleText(today);

		ARSendTime1.click();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();

		act.sendKeys(gTimeA7min).build().perform();

		departmentField.click();
		act.sendKeys( deptName).build().perform();
		Thread.sleep(2000);
	
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		
		
switch (BranchNameB) {
		
		case "1" :
			
			Station06.click();
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);
			Station06.click();
			Thread.sleep(2000);
			
			jonas3.click();
			Thread.sleep(1000);
			jonas2.click();
			Thread.sleep(1000);
			
			
			break;
			
			
		case "2" :
			station04.click();
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);
			station04.click();
			Thread.sleep(2000);
			
			bhupeshTest.click();
			Thread.sleep(1000);
			
			break;
			
			
		
		}
	

		Select se2 = new Select(ArRequestFrom);
		se2.selectByVisibleText(dayAf2day);

		Select se3 = new Select(ArRequestTo);
		se3.selectByVisibleText(dayAf4day);

		act.sendKeys(Keys.PAGE_DOWN).build().perform();

		ARSlipInDays.click();

		ARSHift.click();

		act.sendKeys(Keys.PAGE_DOWN).build().perform();

		addShift.click();

		act.sendKeys("1st").build().perform();

		adShiftButton.click();

		act.sendKeys("2nd").build().perform();

		adShiftButton.click();

		ARSaveButton.click();
		driver.navigate().refresh();
		
		Reporter.log("Availability request recursive >"+date+"-"+today+"-"+gTimeA7min,true);

	}

	public void ARSendMultiple(WebDriver driver,String date, String gTimeA7min, String gTimeA9min, String gTimeA11min,
			String dayAf2day, String dayAf4day, String gTimeA22min,String deptName, String BranchNameB) throws Throwable {
		Actions act = new Actions(driver);

		createNewButton.click();
		ARTitle.click();
		act.sendKeys("BG-AR > multiple days-"+date).build().perform();

		Select se = new Select(ARType);
		se.selectByVisibleText("Multiple days");

		ARMultiTime1.click();

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(date + " " + gTimeA7min).build().perform();

		addMoreTime.click();

		ARMultiTime2.click();

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(date + " " + gTimeA9min).build().perform();

		addMoreTime.click();

		ARMultiTime3.click();

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();

		act.sendKeys(date + " " + gTimeA11min).build().perform();

		departmentField.click();
		act.sendKeys( deptName).build().perform();
		Thread.sleep(2000);
	
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		
		
switch (BranchNameB) {
		
		case "1" :
			
			Station06.click();
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);
			Station06.click();
			Thread.sleep(2000);
			
			jonas3.click();
			Thread.sleep(1000);
			jonas2.click();
			Thread.sleep(1000);
			
			
			break;
			
			
		case "2" :
			station04.click();
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);
			station04.click();
			Thread.sleep(2000);
			
			bhupeshTest.click();
			Thread.sleep(1000);
			
			break;
			
			
		
		}

		Select se1 = new Select(ARMultiFromDay);
		se1.selectByVisibleText(dayAf2day);

		ARMultiFromTime.click();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(gTimeA7min).build().perform();

		Select se2 = new Select(ARMultiToDay);
		se2.selectByVisibleText(dayAf4day);

		ARMultiToTime.click();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(gTimeA22min).build().perform();

		ARSlipInDays.click();

		act.sendKeys(Keys.PAGE_DOWN).build().perform();

		ARSHift.click();

		addShift.click();
		act.sendKeys("1st").build().perform();

		adShiftButton.click();

		act.sendKeys("2nd").build().perform();

		adShiftButton.click();

		ARSaveButton.click();

		driver.navigate().refresh();
		Reporter.log("Availability request recursive >"+date+"-"+gTimeA7min,true);
		Reporter.log("Availability request recursive >"+date+"-"+gTimeA9min,true);
		Reporter.log("Availability request recursive >"+date+"-"+gTimeA11min,true);
		
	}

	public void messageToARUser(WebDriver driver, String BranchNameB) throws Throwable {
		Actions act = new Actions(driver);

		ARHistorySearchField.click();

		act.sendKeys("BG-AR").build().perform();
		Thread.sleep(2000);

		historySearchButton.click();

		ARChatOption.click();

		writemessageField.click();
		act.sendKeys("message-availability request users").build().perform();
		sendmessageButton.click();
		
	}

	public void deleteAvailabilityRequestFromList(WebDriver driver, String BranchNameB) throws Throwable {
		
		int z = availableDataCount.size();
		Reporter.log("The total available availability request count is-"+z+" in the list for delete.",true);


		Actions act = new Actions(driver);

		for (int i = 1; i <= z; i++) 
		
		{
			searchField.click();
			Thread.sleep(2000);

			act.sendKeys("BG").perform();
			Thread.sleep(2000);

			deleteAvailbilityRequest.click();
			Thread.sleep(2000);
			deleteAvailbiliYes.click();

			Thread.sleep(5000);
			Reporter.log("Availability request number-" + i + " deleted sucessfully from list-testing branch.", true);
			driver.navigate().refresh();
			Thread.sleep(2000);

		}
	}

	public void deleteAvailabilityRequestFromHistory(WebDriver driver, String BranchNameB) throws Throwable {

		Actions act = new Actions(driver);

		int z = availableDataCount.size();
		Reporter.log("The total available availability request count is-"+z+" in the history for delete.",true);
		
		for (int i = 1; i <= z; i++) {
			searFieldHistory.click();
			Thread.sleep(2000);
			act.sendKeys("BG").perform();
			Thread.sleep(4000);
			searchButton.click();
			Thread.sleep(5000);

			deleteAvailbilityRequest.click();
			Thread.sleep(2000);
			deleteAvailbiliHistoryYes.click();
			Thread.sleep(5000);
			Reporter.log("Availability request number-" + i + " deleted sucessfully from histry-testing branch.", true);
			driver.navigate().refresh();
			Thread.sleep(2000);

		}

	}

	

}
