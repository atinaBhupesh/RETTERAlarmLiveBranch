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

public class G_InfoEvent extends B_baseClass {

	@FindBy(xpath = "//span[text()=\"Calendar\"]")private WebElement calendarModule;
	@FindBy(xpath = "//button[@class=\"btn btn-success\"]")private WebElement createNewButton;
	@FindBy(xpath = "//span[@id=\"select2-selectFiredepartment-container\"]")private WebElement fireDepartmentField;
	@FindBy(xpath = "//input[@placeholder=\"Select Firestation\"]")private WebElement fireStationField;
	@FindBy(xpath = "//select[@id=\"selectType\"]")private WebElement selectType;
	@FindBy(xpath = "//div[@class=\"select-selected\"]")private WebElement eventCategoryList;
	@FindBy(xpath = "//span[@style=\"background-color: #ff8c00\"]")private WebElement ADST06ECat1;
	@FindBy(xpath = "//input[@id=\"startDate\"]")private WebElement startDate;
	@FindBy(xpath = "//input[@id=\"endDate\"]")private WebElement endDate;
	@FindBy(xpath = "//input[@id=\"fullDayType\"]")private WebElement eventFullDay;
	@FindBy(xpath = "//span[@class=\"slider round\"]")private WebElement enabldSendPush;

	@FindBy(xpath = "//input[@id=\"InformationTitleDe\"]")private WebElement titleField;
	@FindBy(xpath = "//input[@id=\"InformationLocation\"]")private WebElement loacationField;
	@FindBy(xpath = "//input[@id=\"inlineRadio1\"]")private WebElement userTypeAttribute;

	@FindBy(xpath = "//input[@id=\"selectCheckboxes\"]")private WebElement selectAllCheckBox;


	@FindBy(xpath = "//button[@id=\"addSubmit\"]")private WebElement saveInfo;

	@FindBy(xpath = "//input[@id=\"inlineRadio2\"]")private WebElement userTypeResource;
	

	@FindBy(xpath = "//input[@id=\"inlineRadio3\"]")private WebElement userTypeFireFighter;



	@FindBy(xpath = "//input[@aria-controls=\"example1\"]")private WebElement searchField;
	@FindBy(xpath = "//button[@id=\"dt_actionSearch\"]")private WebElement searchButton;
	@FindBy(xpath = "(//a[text()=\"Chat\"])[1]")private WebElement infoChatButton;
	@FindBy(xpath = "//input[@placeholder=\"Write your message...\"]")private WebElement writemessageField;
	@FindBy(xpath = "//button[@id=\"actionSendMessage\"]")private WebElement sendmessageButton;

	@FindBy(xpath = "//input[@id=\"startTime\"]")private WebElement eventStartTime;
	@FindBy(xpath = "//input[@id=\"endTime\"]")private WebElement evenEventTime;
	@FindBy(xpath = "//input[@id=\"reminderTimeStatus\"]")private WebElement setRemindarCheckBox;
	@FindBy(xpath = "//select[@id=\"InformationReminderType\"]")private WebElement remindarType;
	@FindBy(xpath = "//select[@id=\"InformationReminderMin\"]")private WebElement SelectReminderMin;
	@FindBy(xpath = "//select[@id=\"InformationReminderHours\"]")private WebElement SelectReminderHours;
    @FindBy(xpath = "//select[@id=\"InformationReminderDay\"]")private WebElement SelectReminderDays;

    
//    Live
    @FindBy(xpath = "//input[@value=\"20516\"]")private WebElement ADST06A2;
    @FindBy(xpath = "//input[@value=\"4623\"]")private WebElement ADST06R2;
    @FindBy(xpath = "//input[@value=\"22999\"]")private WebElement jonas2;
	@FindBy(xpath = "//input[@value=\"23001\"]")private WebElement jonas3;
	@FindBy(xpath = "//input[@value=\"25512\"]")private WebElement bhupeshLive2;
	
	
//	Testing
	@FindBy(xpath="//input[@value=\"2170\"]")private WebElement D1ST04A1;
	@FindBy(xpath="//input[@value=\"472\"]")private WebElement D1ST04R2;
	@FindBy(xpath="//input[@value=\"18952\"]")private WebElement bhupeshTest;
	@FindBy(xpath="//input[@value=\"476\"]")private WebElement D1ST04Esc;
	@FindBy(xpath="//input[@value=\"3078\"]")private WebElement D1ST5A1;
    
//	Dev
	
	@FindBy(xpath="//input[@value=\"10881\"]")private WebElement bh1A1;
	@FindBy(xpath="//input[@value=\"918\"]")private WebElement BH1ST1R1;
	@FindBy(xpath="//input[@value=\"22759\"]")private WebElement bhupeshDev;
    
    

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

	public G_InfoEvent(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void createEventByAttributeSchedule(WebDriver driver, String date,String gCurrntTime, String gTimeA7min, String gTimeA22min,String deptName,String stName1,String BranchNameB)
			throws Throwable {
		Actions act = new Actions(driver);

		createNewButton.click();
		Thread.sleep(2000);
		fireDepartmentField.click();
		Thread.sleep(2000);
		act.sendKeys(deptName).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStationField.click();
		Thread.sleep(2000);
		act.sendKeys(stName1).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		Select se = new Select(selectType);
		se.selectByVisibleText("Event");
//		eventCategoryList.click();
//	    ADST06ECat1.click();
		startDate.click();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(date).build().perform();
		endDate.click();
		act.sendKeys(date).build().perform();
		eventStartTime.click();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(gTimeA7min).build().perform();
		evenEventTime.click();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(gTimeA22min).build().perform();
		setRemindarCheckBox.click();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Select se1 = new Select(remindarType);
		se1.selectByVisibleText("One time");
		Select se2 = new Select(SelectReminderMin);
		se2.selectByVisibleText("1");
		enabldSendPush.click();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		titleField.click();
		act.sendKeys("BG-info event schedule-atrribute-R>1 min-"+gCurrntTime).build().perform();
		loacationField.click();
		act.sendKeys("Manewada graound, Nagpur").build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys("BG-info event schedule created by attribute with reminder > 1 min checking. From-"+gTimeA7min+" to-"+gTimeA22min).build().perform();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		userTypeAttribute.click();
		selectAllCheckBox.click();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		selectAllCheckBox.click();
		Thread.sleep(2000);
	
		
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
			bh1A1.click();
			
		}
		
		
		Thread.sleep(2000);
		saveInfo.click();
		
		Reporter.log("info-event created for "+gTimeA7min+" to "+ gTimeA22min ,true);
    	
	
	}

	public void createEventByResourceSchedule(WebDriver driver, String date, String germanycurrentTime,String gTimeA67min, String gTimeA82min,String deptName,String stName1,String BranchNameB)
			throws Throwable {
		Actions act = new Actions(driver);

		createNewButton.click();
		Thread.sleep(2000);
		fireDepartmentField.click();
		Thread.sleep(2000);
		act.sendKeys(deptName).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStationField.click();
		Thread.sleep(2000);
		act.sendKeys(stName1).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		Select se = new Select(selectType);
		se.selectByVisibleText("Event");
//    	eventCategoryList.click();
//		ADST06ECat1.click();
		startDate.click();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(date).build().perform();
		endDate.click();
		act.sendKeys(date).build().perform();
		eventStartTime.click();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(gTimeA67min).build().perform();
		evenEventTime.click();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(gTimeA82min).build().perform();
		setRemindarCheckBox.click();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Select se1 = new Select(remindarType);
		se1.selectByVisibleText("One time");
		Select se2 = new Select(SelectReminderHours);
		se2.selectByVisibleText("1");
		enabldSendPush.click();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		titleField.click();
		act.sendKeys("BG-info event schedule-resource-R>1 hr -"+germanycurrentTime).build().perform();
		loacationField.click();
		act.sendKeys("Manewada graound, Nagpur").build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys("BG-info event schedule - resource with reminder > 1 hours checking. from-"+gTimeA67min+" to-"+gTimeA82min).build().perform();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
				userTypeResource.click();
		selectAllCheckBox.click();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		selectAllCheckBox.click();
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
			BH1ST1R1.click();
			
		}
		
		
		Thread.sleep(2000);
		saveInfo.click();
		driver.navigate().refresh();
		
		Reporter.log("info-event created for "+gTimeA67min+" to "+ gTimeA82min ,true);
	
	}

	public void createEventByFireFightrSchedule(WebDriver driver, String date2,String gCurrntTime, String gTimeA7min, String gTimeA22min,String deptName,String stName1,String BranchNameB)
			throws Throwable {
		Actions act = new Actions(driver);
		createNewButton.click();
		Thread.sleep(2000);
		fireDepartmentField.click();
		Thread.sleep(2000);
		act.sendKeys(deptName).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStationField.click();
		Thread.sleep(2000);
		act.sendKeys(stName1).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		Select se = new Select(selectType);
		se.selectByVisibleText("Event");
//		eventCategoryList.click();
//		ADST06ECat1.click();
		startDate.click();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(date2).build().perform();
		endDate.click();
		act.sendKeys(date2).build().perform();
		eventStartTime.click();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(gTimeA7min).build().perform();
		evenEventTime.click();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(gTimeA22min).build().perform();
		setRemindarCheckBox.click();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Select se1 = new Select(remindarType);
		se1.selectByVisibleText("One time");
		Select se2 = new Select(SelectReminderDays);
		se2.selectByVisibleText("1");
		enabldSendPush.click();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		titleField.click();
		act.sendKeys("BG-info event schedule-firefighter-R>1 day+"+gCurrntTime).build().perform();
		loacationField.click();
		act.sendKeys("Manewada graound, Nagpur").build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys("BG-info event schedule created by firefighter with reminder > 1 day checking. from-"+gTimeA7min+"("+date2+")"+" to-"+gTimeA22min+"("+date2+")").build().perform();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		userTypeFireFighter.click();
		selectAllCheckBox.click();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		selectAllCheckBox.click();
		Thread.sleep(1000);
		
		
	
		
		
		
		
		if  (BranchNameB.equals("1"))
		{
			jonas3.click();
			Thread.sleep(1000);
			jonas2.click();
		}
		
		else if (BranchNameB.equals("2"))
		{
			bhupeshTest.click();
		}
		
		else if (BranchNameB.equals("3"))
		{
			bhupeshDev.click();
			
		}
		
		
		
		
		
		
		
		Thread.sleep(1000);
//		bhupeshLive2.click();
//		Thread.sleep(2000);
		saveInfo.click();
		driver.navigate().refresh();
		Reporter.log("info-event created for "+date2+" > "+gTimeA7min+" to "+ gTimeA22min ,true);


	}

	public void createEventByAttribute(WebDriver driver, String date,String gCurrntTime,String deptName ,String stName1,String BranchNameB) throws Throwable {
		Actions act = new Actions(driver);
		createNewButton.click();
		Thread.sleep(2000);
		fireDepartmentField.click();
		Thread.sleep(2000);
		act.sendKeys(deptName).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStationField.click();
		Thread.sleep(2000);
		act.sendKeys(stName1).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		Select se = new Select(selectType);
		se.selectByVisibleText("Event");
//		eventCategoryList.click();
//		ADST06ECat1.click();
		startDate.click();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(date).build().perform();
		endDate.click();
		act.sendKeys(date).build().perform();
		eventFullDay.click();
		enabldSendPush.click();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		titleField.click();
		act.sendKeys("BG-info event-full day created by attribute."+gCurrntTime).build().perform();
		loacationField.click();
		act.sendKeys("Manewada graound, Nagpur").build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys("BG-info event-full day created by attribute checking.").build().perform();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		userTypeAttribute.click();
		selectAllCheckBox.click();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		selectAllCheckBox.click();
		
		
		
		
		
		
		switch (BranchNameB) {
		
		case "1" :
			ADST06A2.click();
			break;
			
		case "2" :
			
			D1ST04A1.click();
			break;
			
			
			
			
			
		case "3" :
			
			bh1A1.click();
			break;
			
		
		}
		
		Thread.sleep(2000);
		saveInfo.click();
		driver.navigate().refresh();

	}

	public void createEventByResource(WebDriver driver, String date,String gCurrntTime,  String deptName, String stName1,String BranchNameB) throws Throwable {
		Actions act = new Actions(driver);
		createNewButton.click();
		Thread.sleep(2000);
		fireDepartmentField.click();
		Thread.sleep(2000);
		act.sendKeys(deptName).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStationField.click();
		Thread.sleep(2000);
		act.sendKeys(stName1).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		Select se = new Select(selectType);
		se.selectByVisibleText("Event");
//		eventCategoryList.click();
//		ADST06ECat1.click();
		startDate.click();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(date).build().perform();
		endDate.click();
		act.sendKeys(date).build().perform();
		eventFullDay.click();
		enabldSendPush.click();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		titleField.click();
		act.sendKeys("BG-info event-full day created by resource."+gCurrntTime).build().perform();
		loacationField.click();
		act.sendKeys("Manewada graound, Nagpur").build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys("BG-info event-full day created by resource checking.").build().perform();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		userTypeResource.click();
		Thread.sleep(1500);
		selectAllCheckBox.click();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		selectAllCheckBox.click();
		Thread.sleep(1000);
	
		
		
		
		
switch (BranchNameB) {
		
		case "1" :
			ADST06R2.click();
			break;
			
		case "2" :
			
			D1ST04R2.click();
			break;
			
case "3" :
			
	BH1ST1R1.click();
			break;
		
		}
		
		
		
		
		
		
		
		
		Thread.sleep(2000);
		saveInfo.click();
		driver.navigate().refresh();

	}

	public void createEventByFirefighter(WebDriver driver, String date,String gCurrntTime,String deptName,String stName1,String BranchNameB) throws Throwable {
		Actions act = new Actions(driver);
		createNewButton.click();
		Thread.sleep(2000);
		fireDepartmentField.click();
		Thread.sleep(2000);
		act.sendKeys(deptName).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStationField.click();
		Thread.sleep(2000);
		act.sendKeys(stName1).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		Select se = new Select(selectType);
		se.selectByVisibleText("Event");
//		eventCategoryList.click();
//		ADST06ECat1.click();
		startDate.click();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(date).build().perform();
		endDate.click();
		act.sendKeys(date).build().perform();
		eventFullDay.click();
		enabldSendPush.click();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		titleField.click();
		act.sendKeys("BG-info event-full day created by firefighter."+gCurrntTime).build().perform();
		loacationField.click();
		act.sendKeys("Manewada graound, Nagpur").build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys("BG-info event created by firefighter checking.").build().perform();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		userTypeFireFighter.click();
		selectAllCheckBox.click();
		Thread.sleep(2000);
		selectAllCheckBox.click();
		Thread.sleep(2000);
		
		
		
		
		
		
          switch (BranchNameB) {
		
		case "1" :
			jonas3.click();
			Thread.sleep(1000);
			jonas2.click();
			break;
			
		case "2" :
			
			bhupeshTest.click();
			break;
case "3" :
			
			bhupeshDev.click();
			break;
			
		
		}
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(1000);
//		bhupeshLive2.click();
//		Thread.sleep(2000);
		saveInfo.click();
		driver.navigate().refresh();
	

	}

public void sendmessageToInfoEventUsers(WebDriver driver,String BranchNameB) throws Throwable {
		
		Actions act = new Actions(driver);
		searchField.click();
		act.sendKeys("BG-info event").build().perform();
		searchButton.click();
		Thread.sleep(2000);
		infoChatButton.click();
		writemessageField.click();
		act.sendKeys("message-info event users").build().perform();
		sendmessageButton.click();
		driver.navigate().refresh();
	}

	

}
