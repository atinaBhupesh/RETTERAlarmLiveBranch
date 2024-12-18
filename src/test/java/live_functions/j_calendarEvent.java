package live_functions;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class j_calendarEvent extends B_baseClass {

	@FindBy(xpath = "//span[text()=\"Calendar\"]")
	private WebElement calendarModule;
	@FindBy(xpath = "//span[text()=\"Manage Event\"]")
	private WebElement manageEvent;
	@FindBy(xpath = "//a[@href=\"http://live.retteralarm.de/admin/Firestations/eventCalendar\"]")
	private WebElement calendarL;
	@FindBy(xpath = "//a[@href=\"http://testing.retteralarm.de/admin/Firestations/eventCalendar\"]")
	private WebElement calendarT;
	@FindBy(xpath = "//a[@href=\"http://development.retteralarm.de/admin/Firestations/eventCalendar\"]")
	private WebElement calendarD;
	@FindBy(xpath = "//a[text()=\"Add New Event\"]")
	private WebElement addNewEvent;
	@FindBy(xpath = "//span[@id=\"select2-selectFireDepartment-container\"]")
	private WebElement fireDepartmentField;
	@FindBy(xpath = "//input[@placeholder=\"Select Firestation\"]")
	private WebElement fireStastionField;
	@FindBy(xpath = "//input[@id=\"InformationTitle\"]")
	private WebElement eventTitleField;
	@FindBy(xpath = "//textarea[@id=\"InformationDescription\"]")
	private WebElement eventDescriptionField;
	@FindBy(xpath = "//input[@id=\"InformationLocation\"]")
	private WebElement eventLocation;
	@FindBy(xpath = "//input[@id=\"selectDatePic1\"]")
	private WebElement eventStartDate;
	@FindBy(xpath = "//input[@id=\"selectDatePic2\"]")
	private WebElement eventEndDate;
	@FindBy(xpath = "(//label[@class=\"col-sm-3 control-label\"])[1]")
	private WebElement label;
	@FindBy(xpath = "//input[@id=\"startTime\"]")
	private WebElement eventStartTime;
	@FindBy(xpath = "//input[@id=\"endTime\"]")
	private WebElement eventEndTime;
	@FindBy(xpath = "//input[@id=\"reminderTimeStatus\"]")
	private WebElement setReminder;
	@FindBy(xpath = "//select[@id=\"InformationReminderType\"]")
	private WebElement reminderType;
	@FindBy(xpath = "//select[@id=\"InformationReminderMin\"]")
	private WebElement reminderInMin;
	@FindBy(xpath = "//input[@id=\"inlineRadio1\"]")
	private WebElement userTypeAttribute;

	@FindBy(xpath = "//span[@class=\"slider round\"]")
	private WebElement sendPush;
	@FindBy(xpath = "//button[@id=\"actionsubmit\"]")
	private WebElement saveEvent;

	@FindBy(xpath = "//select[@id=\"InformationReminderHours\"]")
	private WebElement reminderInHour;
	@FindBy(xpath = "//input[@id=\"inlineRadio2\"]")
	private WebElement userTypeResource;

	@FindBy(xpath = "//select[@id=\"InformationReminderDay\"]")
	private WebElement reminderInDay;
	@FindBy(xpath = "//input[@id=\"inlineRadio3\"]")
	private WebElement userTypeFirefighter;

	@FindBy(xpath = "//button[@class=\"fc-month-button fc-button fc-state-default fc-corner-left fc-corner-right fc-state-active\"]")
	private WebElement monthButton;
	@FindBy(xpath = "(//span[text()=\"General : BG-1 min reminder calendar event.\"])[1]")
	private WebElement EventByAttribute;
	@FindBy(xpath = "//a[@id=\"actionDeleteEvent\"]")
	private WebElement deleteEvent;

	@FindBy(xpath = "(//span[text()=\"General : BG-1 hrs calendar event.\"])[1]")
	private WebElement EventByResource;
	@FindBy(xpath = "(//span[text()=\"General : BG-1 day calendar event by.\"])[1]")
	private WebElement EventByFirefighter;

	@FindBy(xpath = "//a[@href=\"http://live.retteralarm.de/admin/Firestations/events\"]") private WebElement eventCatogeryL;
	@FindBy(xpath = "//a[@href=\"http://testing.retteralarm.de/admin/Firestations/events\"]") private WebElement eventCatogeryT;
	@FindBy(xpath = "//a[@href=\"http://development.retteralarm.de/admin/Firestations/events\"]") private WebElement eventCatogeryD;
	@FindBy(xpath = "//a[@href=\"/admin/firestations/createEvent\"]")
	private WebElement addEventCatogery;
	@FindBy(xpath = "//span[@id=\"select2-mainDepartment-container\"]")
	private WebElement SelectDepartment;
	@FindBy(xpath = "//span[@class=\"select2-selection__placeholder\"]")
	private WebElement selectStation;
	@FindBy(xpath = "//input[@id=\"FirestationEventTitle\"]")
	private WebElement eventCategoryTitle;
	@FindBy(xpath = "//button[@name=\"colorpalettebutton\"]")
	private WebElement chooseColor;
	@FindBy(xpath = "//div[@data-color=\"rgb(255, 140, 0)\"]")
	private WebElement orange;
	@FindBy(xpath = "//button[@id=\"addSubmit\"]")
	private WebElement saveCategory;
	@FindBy(xpath = "//input[@class=\"form-control input-sm\"]")
	private WebElement search;
	@FindBy(xpath = "(//i[@class=\"fa fa-trash-o\"])[1]")
	private WebElement deleteCategory;
	@FindBy(xpath = "//button[@id=\"delYes1\"]")
	private WebElement deleteYes;

	@FindBy(xpath = "//input[@value=\"15429\"]")
	private WebElement ADST06A2;
	@FindBy(xpath = "//input[@value=\"3136\"]")
	private WebElement ADST06R2;
	@FindBy(xpath = "//input[@value=\"23001\"]")
	private WebElement jonas3;
	@FindBy(xpath = "//input[@value=\"22999\"]")
	private WebElement jonas2;
//			 @FindBy(xpath = "//input[@value=\"27026\"]")private WebElement bhupeshLive;


	@FindBy(xpath = "//span[contains(text(),\"BG-1 min\")]")
	private List<WebElement> availableDataCount1min;
	@FindBy(xpath = "//span[contains(text(),\"BG-1 hrs\")]")
	private List<WebElement> availableDataCount1hrs;
	@FindBy(xpath = "//span[contains(text(),\"BG-1 day\")]")
	private List<WebElement> availableDataCount1day;
	
	 @FindBy(xpath = "//td[contains(text(),\"BG\")]")
		private List<WebElement> availableDataCount; 
	 
//	 Live
	@FindBy(xpath = "//li[text()=\"andrew department\"]")private WebElement andrewDept;
	
//	Testing
	@FindBy(xpath="//li[text()=\"D1\"]")private WebElement d1;
	@FindBy(xpath="//input[@value=\"2170\"]")private WebElement D1ST04A1;
	@FindBy(xpath="//input[@value=\"472\"]")private WebElement D1ST04R2;
	@FindBy(xpath="//input[@value=\"18952\"]")private WebElement bhupeshTest;
	@FindBy(xpath="//input[@value=\"476\"]")private WebElement D1ST04Esc;
	@FindBy(xpath="//input[@value=\"3078\"]")private WebElement D1ST5A1;
	
	
	// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement
	public j_calendarEvent(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void calendarEventCommon(WebDriver driver, String BranchNameB) throws Throwable {
		calendarModule.click();
		Thread.sleep(2000);
		manageEvent.click();
		Thread.sleep(2000);

	}

	public void calendarEventByAttributeSchedul(WebDriver driver, String date, String gCurrntTime, String gTimeA7min,String gTimeA22min,String St1N,String BranchNameB) throws Throwable {
	
		
		Thread.sleep(2000);
		if  (BranchNameB.equals("1"))
		{
			calendarL.click();
		}
		
		else if (BranchNameB.equals("2"))
		{
			calendarT.click();
		}
		
		else if (BranchNameB.equals("3"))
		{
			calendarD.click();
			
		}
		
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		addNewEvent.click();
		Thread.sleep(1000);
		fireDepartmentField.click();
		Thread.sleep(1000);
		// act.sendKeys("Andrew").build().perform();
		
//Thread.sleep(1000);
//act.sendKeys(Keys.ENTER).build().perform();
		
		
		if  (BranchNameB.equals("1"))
		{
			andrewDept.click();
		}
		
		else if (BranchNameB.equals("2"))
		{
			d1.click();
		}
		
		else if (BranchNameB.equals("3"))
		{
			calendarD.click();
			
		}
		
		
		
		
		Thread.sleep(2000);
		fireStastionField.click();
		Thread.sleep(1000);
		act.sendKeys(St1N).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();

		eventTitleField.click();

		act.sendKeys("BG-1 min reminder calendar event.").build().perform();

		eventDescriptionField.click();

		act.sendKeys("checking calendar event by attribute with 1 min reminder."
				+ "Calendar event creation date andt time-" + date + "_" + gCurrntTime).build().perform();

		eventLocation.click();

		act.sendKeys("Nagpur").build().perform();

		eventStartDate.click();

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();

		act.sendKeys(date).build().perform();

		label.click();

		eventEndDate.click();

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();

		act.sendKeys(date).build().perform();

		label.click();

		eventStartTime.click();

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();

		act.sendKeys(gTimeA7min).build().perform();
		label.click();

		eventEndTime.click();

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();

		act.sendKeys(gTimeA22min).build().perform();
		label.click();

		setReminder.click();

		Select se = new Select(reminderType);

		se.selectByVisibleText("One time");

		Select se2 = new Select(reminderInMin);

		se2.selectByVisibleText("1");

		userTypeAttribute.click();
		Thread.sleep(1000);
			
		
		if  (BranchNameB.equals("1"))
		{
			ADST06A2.click();

		}
		
		else if (BranchNameB.equals("2"))
		{
			D1ST04A1.click();
		}
		
		else if (BranchNameB.equals("3"))
		{
			calendarD.click();
			
		}
		
		Thread.sleep(1000);

		sendPush.click();
		saveEvent.click();
		Thread.sleep(1000);

		Reporter.log("calendar event by attribute from-" + date + (gTimeA7min) + " to " + date + (gTimeA22min), true);

		driver.navigate().refresh();

	}

	public void calendarEventByResorceSchedul(WebDriver driver, String date, String gCurrntTime, String gTimeA7min, String gTimeA22min,String St1N, String BranchNameB) throws Throwable {
		Thread.sleep(2000);
		if  (BranchNameB.equals("1"))
		{
			calendarL.click();
		}
		
		else if (BranchNameB.equals("2"))
		{
			calendarT.click();
		}
		
		else if (BranchNameB.equals("3"))
		{
			calendarD.click();
			
		}
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		addNewEvent.click();
		Thread.sleep(1000);
		fireDepartmentField.click();
		Thread.sleep(1000);
		// act.sendKeys("Andrew").build().perform();
		
//Thread.sleep(1000);
//act.sendKeys(Keys.ENTER).build().perform();
		if  (BranchNameB.equals("1"))
		{
			andrewDept.click();
		}
		
		else if (BranchNameB.equals("2"))
		{
			d1.click();
		}
		
		else if (BranchNameB.equals("3"))
		{
			calendarD.click();
			
		}
		
		
		Thread.sleep(2000);
		fireStastionField.click();
		Thread.sleep(1000);
		act.sendKeys(St1N).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();

		eventTitleField.click();

		act.sendKeys("BG-1 hrs calendar event.").build().perform();

		eventDescriptionField.click();

		act.sendKeys("checking calendar event by attribute with 1 hour reminder."
				+ "Calendar event creation date andt time-" + date + "_" + gCurrntTime).build().perform();

		eventLocation.click();

		act.sendKeys("Nagpur").build().perform();

		eventStartDate.click();

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();

		act.sendKeys(date).build().perform();

		label.click();

		eventEndDate.click();

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();

		act.sendKeys(date).build().perform();

		label.click();

		eventStartTime.click();

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();

		act.sendKeys(gTimeA7min).build().perform();
		label.click();

		eventEndTime.click();

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();

		act.sendKeys(gTimeA22min).build().perform();
		label.click();

		setReminder.click();

		Select se = new Select(reminderType);

		se.selectByVisibleText("One time");

		Select se2 = new Select(reminderInHour);

		se2.selectByVisibleText("1");

		userTypeResource.click();
		Thread.sleep(1000);
		

		
		
		if  (BranchNameB.equals("1"))
		{
			ADST06R2.click();
		}
		
		else if (BranchNameB.equals("2"))
		{
			D1ST04R2.click();
		}
		
		else if (BranchNameB.equals("3"))
		{
			calendarD.click();
			
		}
		
		Thread.sleep(1000);
		
		
		
		
		

		sendPush.click();
		saveEvent.click();
		Thread.sleep(1000);

		Reporter.log("calendar event by attribute from-" + date + (gTimeA7min) + " to " + date + (gTimeA22min), true);
		driver.navigate().refresh();

	}

	public void calendarEventByFirefighterSchedul(WebDriver driver, String date, String date2, String gCurrntTime,String gTimeA7min, String gTimeA22min,String St1N,String BranchNameB) throws Throwable {

		Thread.sleep(2000);
		if  (BranchNameB.equals("1"))
		{
			calendarL.click();
		}
		
		else if (BranchNameB.equals("2"))
		{
			calendarT.click();
		}
		
		else if (BranchNameB.equals("3"))
		{
			calendarD.click();
			
		}
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		addNewEvent.click();
		Thread.sleep(1000);
		fireDepartmentField.click();
		Thread.sleep(1000);
		// act.sendKeys("Andrew").build().perform();
	
//		Thread.sleep(1000);
//		act.sendKeys(Keys.ENTER).build().perform();
		if  (BranchNameB.equals("1"))
		{
			andrewDept.click();
		}
		
		else if (BranchNameB.equals("2"))
		{
			d1.click();
		}
		
		else if (BranchNameB.equals("3"))
		{
			calendarD.click();
			
		}
		
		
		Thread.sleep(2000);
		fireStastionField.click();
		Thread.sleep(1000);
		act.sendKeys(St1N).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();

		eventTitleField.click();

		act.sendKeys("BG-1 day calendar event by.").build().perform();

		eventDescriptionField.click();

		act.sendKeys("checking calendar event by attribute with 1 day reminder."
				+ "Calendar event creation date andt time-" + date + "_" + gCurrntTime).build().perform();

		eventLocation.click();

		act.sendKeys("Nagpur").build().perform();

		eventStartDate.click();

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();

		act.sendKeys(date2).build().perform();

		label.click();

		eventEndDate.click();

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();

		act.sendKeys(date2).build().perform();

		label.click();

		eventStartTime.click();

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();

		act.sendKeys(gTimeA7min).build().perform();
		label.click();

		eventEndTime.click();

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();

		act.sendKeys(gTimeA22min).build().perform();
		label.click();

		setReminder.click();

		Select se = new Select(reminderType);

		se.selectByVisibleText("One time");

		Select se2 = new Select(reminderInDay);

		se2.selectByVisibleText("1");

		userTypeFirefighter.click();
		Thread.sleep(1000);

		
		
		
		
		
		if  (BranchNameB.equals("1"))
		{
			jonas3.click();
			Thread.sleep(1000);
			jonas2.click();
			Thread.sleep(1000);
//			bhupeshLive.click();
//			Thread.sleep(1000);
		}
		
		else if (BranchNameB.equals("2"))
		{
			bhupeshTest.click();
		}
		
		else if (BranchNameB.equals("3"))
		{
			calendarD.click();
			
		}
		
		
		
		
		Thread.sleep(1000);
		sendPush.click();
		saveEvent.click();
		Thread.sleep(2000);

		Reporter.log("calendar event by firefighter from-" + date2 + (gTimeA7min) + " to " + date + (gTimeA22min),
				true);
		driver.navigate().refresh();

	}

	public void addEventCategory(WebDriver driver, String dateDDMMYY, String gTimeHHMM,String deptName,String St1N,String BranchNameB) throws Throwable {
		Actions act = new Actions(driver);
		
		
		Thread.sleep(1000);
		
		
		if  (BranchNameB.equals("1"))
		{
			eventCatogeryL.click();
		}
		
		else if (BranchNameB.equals("2"))
		{
			eventCatogeryT.click();
		}
		
		else if (BranchNameB.equals("3"))
		{
			eventCatogeryD.click();
			
		}
		addEventCatogery.click();
		SelectDepartment.click();
		act.sendKeys(deptName).build().perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		selectStation.click();
		act.sendKeys(St1N).build().perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		eventCategoryTitle.click();
		act.sendKeys("BG-EventCategoty-" + dateDDMMYY + "_" + gTimeHHMM).build().perform();
		chooseColor.click();
		Thread.sleep(2000);
		orange.click();
		Thread.sleep(2000);
		saveCategory.click();

		Reporter.log(" BG-EventCategoty-" + dateDDMMYY + "_" + gTimeHHMM + " added successfully.", true);

	}

	public void deletecalendarEventByAttribute(WebDriver driver,String BranchNameB) throws Throwable {

		Thread.sleep(2000);
		if  (BranchNameB.equals("1"))
		{
			calendarL.click();
		}
		
		else if (BranchNameB.equals("2"))
		{
			calendarT.click();
		}
		
		else if (BranchNameB.equals("3"))
		{
			calendarD.click();
			
		}
		Thread.sleep(2000);
		int z = availableDataCount1min.size();
		Reporter.log(
				"The total available calendar event created by attribute count is-" + z + " in the list for delate.",
				true);

		for (int i = 1; i <= z; i++) {
			// monthButton.click();
			Thread.sleep(2000);

			EventByAttribute.click();
			deleteEvent.click();
			Alert a = driver.switchTo().alert();
			Thread.sleep(5000);
			a.accept();

			Thread.sleep(3000);
			driver.navigate().refresh();
			Reporter.log("Calendar event create created by attribute no-" + i + " deleted successfully.", true);

		}

	}

	public void deletecalendarEventByResource(WebDriver driver,String BranchNameB) throws Throwable {
		Thread.sleep(2000);
		if  (BranchNameB.equals("1"))
		{
			calendarL.click();
		}
		
		else if (BranchNameB.equals("2"))
		{
			calendarT.click();
		}
		
		else if (BranchNameB.equals("3"))
		{
			calendarD.click();
			
		}
		Thread.sleep(2000);

		int z = availableDataCount1hrs.size();
		Reporter.log(
				"The total available calendar event created by resource count is-" + z + " in the list for delate.",
				true);
		for (int i = 1; i <= z; i++) {
			// monthButton.click();
			Thread.sleep(2000);
			Actions act = new Actions(driver);
			EventByResource.click();
			deleteEvent.click();
			Alert a = driver.switchTo().alert();
			Thread.sleep(5000);
			a.accept();

			Thread.sleep(3000);
			driver.navigate().refresh();
			Reporter.log("Calendar event create created by resource no-" + i + " deleted successfully.", true);

		}

	}

	public void deletecalendarEventByFirefighter(WebDriver driver,String BranchNameB) throws Throwable {

		Thread.sleep(2000);
		if  (BranchNameB.equals("1"))
		{
			calendarL.click();
		}
		
		else if (BranchNameB.equals("2"))
		{
			calendarT.click();
		}
		
		else if (BranchNameB.equals("3"))
		{
			calendarD.click();
			
		}
		Thread.sleep(2000);
		

		int z = availableDataCount1day.size();
		Reporter.log(
				"The total available calendar event created by fire fighter count is-" + z + " in the list for delate.",
				true);

		for (int i = 1; i <= z; i++) {
			// monthButton.click();
			Thread.sleep(2000);
			Actions act = new Actions(driver);
			EventByFirefighter.click();
			deleteEvent.click();
			Alert a = driver.switchTo().alert();
			Thread.sleep(5000);
			a.accept();

			Thread.sleep(3000);
			driver.navigate().refresh();
			Reporter.log("Calendar event create created by firefighter no-" + i + " deleted successfully.", true);

		}
	}

	public void deleteEventCategory(WebDriver driver,String BranchNameB) throws Throwable {
Thread.sleep(1000);
		
		
		if  (BranchNameB.equals("1"))
		{
			eventCatogeryL.click();
		}
		
		else if (BranchNameB.equals("2"))
		{
			eventCatogeryT.click();
		}
		
		else if (BranchNameB.equals("3"))
		{
			eventCatogeryD.click();
			
		}
		
		int z = availableDataCount.size();
		Reporter.log("The availabler event catagory count is-" + z + " in the list for delete.", true);
		for (int i = 1; i <= z; i++) {
			Thread.sleep(2000);
			Actions act = new Actions(driver);

			search.click();
			act.sendKeys("BG-EventCategoty").build().perform();
			Thread.sleep(2000);
			deleteCategory.click();
			Thread.sleep(5000);
			deleteYes.click();
			driver.navigate().refresh();
			Reporter.log(" Event category number-" + i + " delete successfully deleted.", true);

		}

	}

}
