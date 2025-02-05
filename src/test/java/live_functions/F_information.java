package live_functions;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class F_information extends B_baseClass {

	@FindBy(xpath = "//span[text()=\"Calendar\"]")private WebElement calendarModule;
	@FindBy(xpath = "//a[@href=\"http://live.retteralarm.de/admin/Informations/index\"]")private WebElement manageInformationL;
	@FindBy(xpath = "//a[@href=\"http://testing.retteralarm.de/admin/Informations/index\"]")private WebElement manageInformationT;
	@FindBy(xpath = "//a[@href=\"http://development.retteralarm.de/admin/Informations/index\"]")private WebElement manageInformationD;
	
	@FindBy(xpath = "//button[@class=\"btn btn-success\"]")private WebElement createNewButton;
	@FindBy(xpath = "//span[@id=\"select2-selectFiredepartment-container\"]")private WebElement fireDepartmentField;
	@FindBy(xpath = "//input[@placeholder=\"Select Firestation\"]")private WebElement fireStationField;
	@FindBy(xpath = "//select[@id=\"selectType\"]")private WebElement selectType;
	@FindBy(xpath = "//input[@id=\"InformationTitleDe\"]")
	private WebElement titleField;
	@FindBy(xpath = "//input[@id=\"InformationLocation\"]")
	private WebElement loacationField;
	@FindBy(xpath = "//input[@id=\"inlineRadio1\"]")private WebElement userTypeAttribute;

	@FindBy(xpath = "//input[@id=\"selectCheckboxes\"]")private WebElement selectAllCheckBox;
	

	@FindBy(xpath = "//button[@id=\"addSubmit\"]")
	private WebElement saveInfo;

	@FindBy(xpath = "//input[@id=\"inlineRadio2\"]")
	private WebElement userTypeResource;


	@FindBy(xpath = "//input[@id=\"inlineRadio3\"]")
	private WebElement userTypeFireFighter;
	
	@FindBy(xpath = "//input[@value=\"3138\" and @class=\"user-checkbox\" ]")
	private WebElement ADST06REsc;

	@FindBy(xpath = "//input[@aria-controls=\"example1\"]")
	private WebElement searchField;
	@FindBy(xpath = "//button[@id=\"dt_actionSearch\"]")
	private WebElement searchButton;
	@FindBy(xpath = "(//i[@class=\"fa fa-trash-o\"])[1]")
	private WebElement delete;
	@FindBy(xpath = "//button[@id=\"call_delete_ajax\"]")
	private WebElement deleteYes;

	@FindBy(xpath = "(//a[text()=\"Chat\"])[1]")
	private WebElement infoChatButton;
	@FindBy(xpath = "//input[@placeholder=\"Write your message...\"]")
	private WebElement writemessageField;
	@FindBy(xpath = "//button[@id=\"actionSendMessage\"]")
	private WebElement sendmessageButton;

	@FindBy(xpath = "//input[@id=\"inlineRadio4\"]")
	private WebElement userTypeMonitor;
	
	@FindBy(xpath = "//input[@id=\"InfoStartDate\"]")
	private WebElement infoStartDateField;
	@FindBy(xpath = "//input[@id=\"InfoEndDate\"]")
	private WebElement infoEndDateField;
	@FindBy(xpath = "//input[@id=\"InfoStartTime\"]")
	private WebElement infoStartTimeField;
	@FindBy(xpath = "//input[@id=\"InfoEndTime\"]")
	private WebElement infoEndTimeField;
	@FindBy(xpath="//i[@class=\"fa fa-upload\"]")private WebElement uplod;
	
	 @FindBy(xpath="//span[contains(text(),\"BG\")]")private List<WebElement> availableDataCount; 
	
	//Live
	@FindBy(xpath = "//input[@value=\"15429\"]")private WebElement ADST06A2;
	@FindBy(xpath = "//input[@value=\"3136\"]")private WebElement ADST06R2;
	@FindBy(xpath = "//input[@value=\"22999\"]")private WebElement jonas2;
	@FindBy(xpath = "//input[@value=\"23001\"]")private WebElement jonas3;
//	@FindBy(xpath = "//input[@value=\"25512\"]")private WebElement bhupeshLive2;
	@FindBy(xpath = "//input[@value=\"25626\"]")
	private WebElement ADST06M1;
	

//	 Testing 
	@FindBy(xpath="//input[@value=\"14551\"]")private WebElement D1ST04M1;
	@FindBy(xpath="//input[@value=\"2170\"]")private WebElement D1ST04A1;
	@FindBy(xpath="//input[@value=\"472\"]")private WebElement D1ST04R2;
	@FindBy(xpath="//input[@value=\"18952\"]")private WebElement bhupeshTest;
	@FindBy(xpath="//input[@value=\"476\"]")private WebElement D1ST04Esc;
	@FindBy(xpath="//input[@value=\"3078\"]")private WebElement D1ST5A1;
	
//	Dev
	
	@FindBy(xpath="//input[@value=\"10881\"]")private WebElement bh1A1;
	@FindBy(xpath="//input[@value=\"918\"]")private WebElement BH1ST1R1;
	@FindBy(xpath="//input[@value=\"22759\"]")private WebElement bhupeshDev;
	@FindBy(xpath="//input[@value=\"22074\"]")private WebElement BH1ST1M1;
	// @FindBy(xpath="")private WebElement ;

	public F_information(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void infoEventCommon(WebDriver driver, String BranchNameB) throws Throwable {
		calendarModule.click();
		

		
		Thread.sleep(2000);
		if  (BranchNameB.equals("1"))
		{
			manageInformationL.click();
		}
		
		else if (BranchNameB.equals("2"))
		{
			manageInformationT.click();
		}
		
		else if (BranchNameB.equals("3"))
		{
			manageInformationD.click();
			
		}
	

	}

	public void createInformationByAttribute(WebDriver driver,String gCurrntTime, String deptName,String stName1, String BranchNameB) throws Throwable {
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
		se.selectByVisibleText("Information");
		titleField.click();
		act.sendKeys("BG-Information created by attribute."+gCurrntTime).build().perform();
		loacationField.click();
		act.sendKeys("Manewada graound, Nagpur").build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys("BG-Information created by attribute checking.").build().perform();
//		act.sendKeys(Keys.PAGE_DOWN).build().perform();
//		uplod.click();
//		Thread.sleep(2000);
//		
//		StringSelection ss= new StringSelection("C:\\Users\\BHUPESH\\Desktop\\New folder\\Automation Test.pdf");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//		
//		Robot rc=new Robot();
//		Thread.sleep(2000);
//		rc.keyPress(KeyEvent.VK_CONTROL);
//		rc.keyPress(KeyEvent.VK_V);
//		Thread.sleep(2000);
//		rc.keyRelease(KeyEvent.VK_CONTROL);
//		rc.keyRelease(KeyEvent.VK_V);
//		Thread.sleep(2000);
//		rc.keyPress(KeyEvent.VK_ENTER);
//		rc.keyRelease(KeyEvent.VK_ENTER);
//		
//		Thread.sleep(2000);
		
		
//		act.sendKeys("C:\\Users\\BHUPESH\\Desktop\\New folder\\Automation Test.pdf").perform();
//		Thread.sleep(2000);
//		act.sendKeys(Keys.ENTER).perform();
//		Thread.sleep(2000);
		
		userTypeAttribute.click();
		Thread.sleep(2000);
	
		
		
		switch (BranchNameB) {
		
		case "1":
			ADST06A2.click();
			break;
			
		case "2":
			
			D1ST04A1.click();
			break;
			
			
		case "3":
			
			bh1A1.click();
			break;
		}
		
		Thread.sleep(2000);
		saveInfo.click();
		
	

	}

	public void createInformationByResource(WebDriver driver,String gCurrntTime, String deptName,String stName1,String BranchNameB) throws Throwable {
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
		se.selectByVisibleText("Information");
		titleField.click();
		act.sendKeys("BG-Information created by resource."+gCurrntTime).build().perform();
		loacationField.click();
		act.sendKeys("Manewada graound, Nagpur").build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys("BG-Information created by resource checking.").build().perform();
		
		
		userTypeResource.click();
		
		
	switch (BranchNameB) {
		
		case "1":
			ADST06R2.click();
			break;
			
		case "2":
			
			D1ST04R2.click();
			break;
			
			
		case "3":
			
			BH1ST1R1.click();
			break;
		}
		
		
		
		
		
		
		
		
		saveInfo.click();
		
	

	}

	public void createInformationByfireFighter(WebDriver driver,String gCurrntTime, String deptName,String stName1,String BranchNameB) throws Throwable {
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
		se.selectByVisibleText("Information");
		titleField.click();
		act.sendKeys("BG-Information created by firefighter."+gCurrntTime).build().perform();
		loacationField.click();
		act.sendKeys("Manewada graound, Nagpur").build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys("BG-Information created by firefighter checking.").build().perform();
		userTypeFireFighter.click();
		
		
switch (BranchNameB) {
		
		case "1":
			jonas3.click();
			Thread.sleep(1000);
			jonas2.click();
			break;
			
		case "2":
			
			bhupeshTest.click();
			break;
			
			
     case "3":
			
			bhupeshDev.click();
			break;
		}
		
		
		
		
		
		
		
		Thread.sleep(1000);
//		bhupeshLive2.click();
//		Thread.sleep(2000);
		saveInfo.click();
		
	

	}

	public void createInformationForMonitor(WebDriver driver, String gTimeA5min, String gTimeA15min, String date,String deptName,String stName1,String BranchNameB)
			throws Throwable {
		Actions act = new Actions(driver);

		createNewButton.click();
		fireDepartmentField.click();
		act.sendKeys(deptName).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(4000);
		fireStationField.click();
		act.sendKeys(stName1).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
			Select se = new Select(selectType);
		se.selectByVisibleText("Information");
    	titleField.click();
		act.sendKeys("BG-Monitor information for-" + date).build().perform();
		loacationField.click();
		act.sendKeys("Manewada graound, Nagpur").build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys("BG-Monitor information for-" + date + " from " + gTimeA5min + " to " + gTimeA15min).build().perform();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		userTypeMonitor.click();
		Thread.sleep(2000);
		
		if  (BranchNameB.equals("1"))
		{
			ADST06M1.click();
		}
		
		else if (BranchNameB.equals("2"))
		{
			D1ST04M1.click();
		}
		
		else if (BranchNameB.equals("3"))
		{
			BH1ST1M1.click();
			
		}
		
		
		Thread.sleep(1000);
		
		
		
		
		infoStartDateField.click();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(date).build().perform();
		infoEndDateField.click();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(date).build().perform();
		infoStartTimeField.click();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(gTimeA5min).build().perform();
		infoEndTimeField.click();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(gTimeA15min).build().perform();
		saveInfo.click();
		
		
	}
	
	
	

	public void sendmessageToInfoUsers(WebDriver driver,String BranchNameB) throws Throwable {
		Actions act = new Actions(driver);

		searchField.click();
		act.sendKeys("BG-Information").build().perform();
		searchButton.click();
		Thread.sleep(2000);
		infoChatButton.click();
		writemessageField.click();
		act.sendKeys("message-info users").build().perform();
		sendmessageButton.click();
		


	}

	public void deleteInfoEvent(WebDriver driver, String BranchNameB) throws Throwable {
		Actions act = new Actions(driver);
		calendarModule.click();
		
		Thread.sleep(2000);
		if  (BranchNameB.equals("1"))
		{
			manageInformationL.click();
		}
		
		else if (BranchNameB.equals("2"))
		{
			manageInformationT.click();
		}
		
		else if (BranchNameB.equals("3"))
		{
			manageInformationD.click();
			
		}
	
		
//		int z=availableDataCount.size();
//		Reporter.log("The total available information or event count is-"+z+" in the list for delate.",true);

		for (int i = 1; i <= 200; i++) {
			Thread.sleep(2000);
			searchField.click();
			act.sendKeys("BG").build().perform();
			searchButton.click();
			Thread.sleep(2000);
			delete.click();
			Thread.sleep(5000);
			deleteYes.click();
			Thread.sleep(2000);
			Reporter.log("information number-" + i + " is deleted sucessfully.", true);
			driver.navigate().refresh();	
		
			

		}

	}

}
