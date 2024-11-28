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

    
    
	@FindBy(xpath = "//input[@value=\"15429\"]")private WebElement ADST06A2;
    @FindBy(xpath = "//input[@value=\"3136\"]")private WebElement ADST06R2;
    @FindBy(xpath = "//input[@value=\"22999\"]")private WebElement jonas2;
	@FindBy(xpath = "//input[@value=\"23001\"]")private WebElement jonas3;
	@FindBy(xpath = "//input[@value=\"25512\"]")private WebElement bhupeshLive2;
    
    
    

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

	public void createEventByAttributeSchedule(WebDriver driver, String date, String gTimeA7min, String gTimeA22min,String deptName,String stName1,String BranchNameB)
			throws Throwable {
		Actions act = new Actions(driver);

		createNewButton.click();
		fireDepartmentField.click();
		act.sendKeys(deptName).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStationField.click();
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
		act.sendKeys("BG-info event schedule-atrribute-reminder>1 min").build().perform();
		loacationField.click();
		act.sendKeys("Manewada graound, Nagpur").build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys("BG-info event schedule created by attribute with reminder > 1 min checking. From-"+gTimeA7min+" to-"+gTimeA22min).build().perform();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		userTypeAttribute.click();
		selectAllCheckBox.click();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		selectAllCheckBox.click();
		ADST06A2.click();
		Thread.sleep(2000);
		saveInfo.click();
		
		Reporter.log("info-event created for "+gTimeA7min+" to "+ gTimeA22min ,true);
    	
	
	}

	public void createEventByResourceSchedule(WebDriver driver, String date, String gTimeA67min, String gTimeA82min,String deptName,String stName1,String BranchNameB)
			throws Throwable {
		Actions act = new Actions(driver);

		createNewButton.click();
		fireDepartmentField.click();
		act.sendKeys(deptName).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStationField.click();
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
		act.sendKeys("BG-info event schedule-resource-reminder>1 hours").build().perform();
		loacationField.click();
		act.sendKeys("Manewada graound, Nagpur").build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys("BG-info event schedule - resource with reminder > 1 hours checking. from-"+gTimeA67min+" to-"+gTimeA82min).build().perform();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
				userTypeResource.click();
		selectAllCheckBox.click();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		selectAllCheckBox.click();
		ADST06R2.click();
		Thread.sleep(2000);
		saveInfo.click();
		driver.navigate().refresh();
		
		Reporter.log("info-event created for "+gTimeA67min+" to "+ gTimeA82min ,true);
	
	}

	public void createEventByFireFightrSchedule(WebDriver driver, String date2, String gTimeA7min, String gTimeA22min,String deptName,String stName1,String BranchNameB)
			throws Throwable {
		Actions act = new Actions(driver);
		createNewButton.click();
		fireDepartmentField.click();
		act.sendKeys(deptName).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStationField.click();
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
		act.sendKeys("BG-info event schedule-firefighter-reminder>1 day").build().perform();
		loacationField.click();
		act.sendKeys("Manewada graound, Nagpur").build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys("BG-info event schedule created by firefighter with reminder > 1 day checking. from-"+gTimeA7min+"("+date2+")"+" to-"+gTimeA22min+"("+date2+")").build().perform();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		userTypeFireFighter.click();
		selectAllCheckBox.click();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		selectAllCheckBox.click();
		Thread.sleep(2000);
		jonas3.click();
		Thread.sleep(1000);
		jonas2.click();
		Thread.sleep(1000);
//		bhupeshLive2.click();
//		Thread.sleep(2000);
		saveInfo.click();
		driver.navigate().refresh();
		Reporter.log("info-event created for "+date2+" > "+gTimeA7min+" to "+ gTimeA22min ,true);


	}

	public void createEventByAttribute(WebDriver driver, String date,String deptName,String stName1,String BranchNameB) throws Throwable {
		Actions act = new Actions(driver);
		createNewButton.click();
		fireDepartmentField.click();
		act.sendKeys(deptName).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStationField.click();
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
		act.sendKeys("BG-info event-full day created by attribute.").build().perform();
		loacationField.click();
		act.sendKeys("Manewada graound, Nagpur").build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys("BG-info event-full day created by attribute checking.").build().perform();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		userTypeAttribute.click();
		selectAllCheckBox.click();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		selectAllCheckBox.click();
		ADST06A2.click();
		Thread.sleep(2000);
		saveInfo.click();
		driver.navigate().refresh();

	}

	public void createEventByResource(WebDriver driver, String date,String deptName,String stName1,String BranchNameB) throws Throwable {
		Actions act = new Actions(driver);
		createNewButton.click();
		fireDepartmentField.click();
		act.sendKeys(deptName).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStationField.click();
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
		act.sendKeys("BG-info event-full day created by resource.").build().perform();
		loacationField.click();
		act.sendKeys("Manewada graound, Nagpur").build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys("BG-info event-full day created by resource checking.").build().perform();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		userTypeResource.click();
		selectAllCheckBox.click();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		selectAllCheckBox.click();
		Thread.sleep(1000);
		ADST06R2.click();
		Thread.sleep(2000);
		saveInfo.click();
		driver.navigate().refresh();

	}

	public void createEventByFirefighter(WebDriver driver, String date,String deptName,String stName1,String BranchNameB) throws Throwable {
		Actions act = new Actions(driver);
		createNewButton.click();
		fireDepartmentField.click();
		act.sendKeys(deptName).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStationField.click();
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
		act.sendKeys("BG-info event-full day created by firefighter.").build().perform();
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
		jonas3.click();
		Thread.sleep(1000);
		jonas2.click();
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
