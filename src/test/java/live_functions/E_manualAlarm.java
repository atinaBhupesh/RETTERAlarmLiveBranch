package live_functions;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class E_manualAlarm extends B_baseClass




     {


	
	@FindBy(xpath = "//span[text()=\"Alarm\"]")
	private WebElement manualAlarmModule;
	@FindBy(xpath = "//a[@href=\"http://live.retteralarm.de/admin/Alarms/index\"]")private WebElement manageAlarm;

	@FindBy(xpath = "//button[@class=\"btn btn-success\"]")
	private WebElement createNewButton;
	@FindBy(xpath = "//span[@id=\"select2-selectFiredepartment-container\"]")
	private WebElement fireDepartmentField;
	@FindBy(xpath = "//input[@placeholder=\"Select Firestation\"]")
	private WebElement fireStationField;
	@FindBy(xpath = "//textarea[@id=\"AlarmTitleDe\"]")
	private WebElement titlefield;
	@FindBy(xpath = "//textarea[@id=\"AlarmDescriptionDe\"]")
	private WebElement descriptionField;
	@FindBy(xpath = "//input[@id=\"inlineRadio1\"]")
	private WebElement userTypeAttribute;
	@FindBy(xpath = "//input[@placeholder=\"Select Vehicle/Cars\"]")
	private WebElement vehicleField;
	@FindBy(xpath = "//input[@id=\"selectCheckboxes\"]")
	
	private WebElement selectAllCheckBox;
	
	@FindBy(xpath = "//input[@id=\"user_id\" and @value=\"18336\"]")private WebElement RA1;
	//@FindBy(xpath = "//input[@id=\"user_id\" and @value=\"18336\"]")private WebElement RA1;
	@FindBy(xpath = "//textarea[@id=\"AlarmAddress\"]")
	private WebElement adressFeild;
	@FindBy(xpath = "//input[@id=\"locationDrag\"]")
	private WebElement dragMarkerOnMapCheckBox;
	@FindBy(xpath = "//button[@id=\"addSubmit\"]")
	private WebElement grenrateAlarmButton;
	@FindBy(xpath = "//button[@id=\"addSubForm\"]")
	private WebElement alarmYesButton;

	@FindBy(xpath = "//input[@id=\"inlineRadio2\"]")private WebElement userTypeResource;

	@FindBy(xpath = "//input[@id=\"inlineRadio3\"]")private WebElement userTypeFireFighter;
	

	@FindBy(xpath = "//input[@aria-controls=\"alarmTable\"]")
	private WebElement searchField;
	@FindBy(xpath = "//button[@id=\"dt_actionSearch\"]")
	private WebElement searchButton;
	@FindBy(xpath = "(//i[@class=\"fa fa-trash-o\"])[1]")
	private WebElement delete;
	@FindBy(xpath = "//button[@id=\"delRec\"]")
	private WebElement deleteYes;

	@FindBy(xpath = "(//a[@title=\"Chat\"])[1]")
	private WebElement chatOptions;
	@FindBy(xpath = "//input[@placeholder=\"Write your message...\"]")
	private WebElement writemessageField;
	@FindBy(xpath = "//button[@id=\"actionSendMessage\"]")
	private WebElement sendmessageButton;
	@FindBy(xpath="//input[@class=\"upload\"]")private WebElement attachFile;
	
	@FindBy(xpath = "(//i[@class=\"fa fa-user-plus\"])[1]")
	private WebElement extendAlarmButton;


	@FindBy(xpath = "//input[@id=\"information_1\"]")
	private WebElement addInfoField1;
	@FindBy(xpath = "//input[@id=\"information_2\"]")
	private WebElement addInfoField2;
	@FindBy(xpath = "//input[@id=\"information_3\"]")
	private WebElement addInfoField3;
	@FindBy(xpath = "//input[@id=\"information_4\"]")
	private WebElement addInfoField4;
	@FindBy(xpath = "//input[@id=\"information_5\"]")
	private WebElement addInfoField5;
	@FindBy(xpath = "//button[@id=\"addSubmit\"]")
	private WebElement save;

	@FindBy(xpath = "//input[@name=\"data[Alarm][low_priority]\"]")
	private WebElement lowPriorityCheckBox;

	 @FindBy(xpath="//span[@class=\"select2-selection__placeholder\"]")private WebElement selectStationForStationAlarm;
		@FindBy(xpath="//select[@name=\"alarmTable_length\"]")private WebElement alarmLength;
	 @FindBy(xpath="(//span[text()=\"Active\"])[1]")private WebElement deactiveAlarm;
	@FindBy(xpath="//button[@id=\"statChange\"]")private WebElement changeStatusYes;
	
	@FindBy(xpath = "//input[@value=\"15429\"]")private WebElement ADST06A2;
	@FindBy(xpath = "//input[@value=\"3136\"]")private WebElement ADST06R2;
	
	
	@FindBy(xpath = "//input[@value=\"3138\"]")	private WebElement ADST06REsc;
	@FindBy(xpath = "//input[@value=\"22999\"]")private WebElement jonas2;
	@FindBy(xpath = "//input[@value=\"23001\"]")private WebElement jonas3;

	@FindBy(xpath = "//input[@value=\"18480\"]")private WebElement ADST07A2;
	 @FindBy(xpath="//input[@value=\"3137\"]")private WebElement ADST07R2;
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
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;

	public E_manualAlarm(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void manualAlarmCommon(WebDriver driver) throws Throwable {
		manualAlarmModule.click();
	
		manageAlarm.click();
		

	}

	public void manualAlarmByAttribute(WebDriver driver, String date) throws Throwable {
		Actions act = new Actions(driver);

		createNewButton.click();
	
		fireDepartmentField.click();
	
		act.sendKeys("Andrew").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStationField.click();
		
		act.sendKeys("06").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
	
		titlefield.click();
	
		act.sendKeys("BG-manual alarm by attribute-" + date).build().perform();
	
		descriptionField.click();
	
		act.sendKeys("BG-manual alarm by attribute checking.").build().perform();
	
		
	
		userTypeAttribute.click();
		Thread.sleep(2000);

		vehicleField.click();
		Thread.sleep(1000);
		
		act.sendKeys("06v1").build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);

		act.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(2000);
		act.sendKeys("06v3").build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);

		selectAllCheckBox.click();
		Thread.sleep(2000);
		selectAllCheckBox.click();
	
		ADST06A2.click();
		//RA1.click();

		adressFeild.click();
		Thread.sleep(2000);
		act.sendKeys("BAPS Swaminarayan mandir, Wathoda Layout, Nagpur, Maharashtra 440035").build().perform();
	
		
	
		dragMarkerOnMapCheckBox.click();
	
		grenrateAlarmButton.click();
	
		alarmYesButton.click();

	
		

	}
	
	public void extendLowManualAlarmByAttributeFrom07ToSt06 (WebDriver driver, String date) throws Throwable {
		Actions act = new Actions(driver);

		createNewButton.click();
	
		fireDepartmentField.click();
	
		act.sendKeys("Andrew").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStationField.click();
		
		act.sendKeys("07").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
	
		titlefield.click();
	
		act.sendKeys("BG-Extend Low priority alarm from station 07 created by attribute-" + date).build().perform();
	
		descriptionField.click();
	
		act.sendKeys("BG-checking extend low priority alarm functionality from station 07 to station 06.").build().perform();
	
		
	
		userTypeAttribute.click();
		Thread.sleep(2000);

		vehicleField.click();
		Thread.sleep(1000);
		
		act.sendKeys("ADST07V1").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);

	
		selectAllCheckBox.click();
		Thread.sleep(2000);
		selectAllCheckBox.click();
	
		ADST07A2.click();
	
		lowPriorityCheckBox.click();
		Thread.sleep(1000);
		adressFeild.click();
		Thread.sleep(2000);
		act.sendKeys("BAPS Swaminarayan mandir, Wathoda Layout, Nagpur, Maharashtra 440035").build().perform();
	
		
	
		dragMarkerOnMapCheckBox.click();
	
		grenrateAlarmButton.click();
	
		alarmYesButton.click();
		
		Thread.sleep(15000);
		
		driver.navigate().refresh();
		
        searchField.click();
		
		act.sendKeys("BG-Extend Low priority alarm from station 07 created by attribute-" + date).build().perform();
		
		searchButton.click();
		Thread.sleep(2000);
		extendAlarmButton.click();
		Thread.sleep(2000);
		fireStationField.click();

		act.sendKeys("06").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		
	
		
		
		userTypeResource.click();
		
		ADST06R2.click();
		
		Thread.sleep(1000);
		
		addInfoField1.click();
	
		act.sendKeys("additional info 1").build().perform();
	
		addInfoField2.click();

		act.sendKeys("additional info 2").build().perform();
	
		addInfoField3.click();
	
		act.sendKeys("additional info 3").build().perform();
	
		addInfoField4.click();
		
		act.sendKeys("additional info 4").build().perform();
		
		addInfoField5.click();
	
		act.sendKeys("additional info 5").build().perform();
	
		save.click();
		
		
	
		

	}
	
	
	public void extendManualAlarmByAttributeFrom07ToSt06 (WebDriver driver, String date) throws Throwable {
		Actions act = new Actions(driver);

		createNewButton.click();
	
		fireDepartmentField.click();
	
		act.sendKeys("Andrew").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStationField.click();
		
		act.sendKeys("07").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
	
		titlefield.click();
	
		act.sendKeys("BG-Extend alarm from station 07 created by attribute-" + date).build().perform();
	
		descriptionField.click();
	
		act.sendKeys("BG-checking extend alarm functionality from station 07 to station 06.").build().perform();
	
		
	
		userTypeAttribute.click();
		Thread.sleep(2000);

		vehicleField.click();
		Thread.sleep(1000);
		
		act.sendKeys("ADST07V1").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);

	
		selectAllCheckBox.click();
		Thread.sleep(2000);
		selectAllCheckBox.click();
	
		ADST07A2.click();
	

		adressFeild.click();
		Thread.sleep(2000);
		act.sendKeys("BAPS Swaminarayan mandir, Wathoda Layout, Nagpur, Maharashtra 440035").build().perform();
	
		
	
		dragMarkerOnMapCheckBox.click();
	
		grenrateAlarmButton.click();
	
		alarmYesButton.click();
		
		Thread.sleep(15000);
		
		driver.navigate().refresh();
		
        searchField.click();
		
		act.sendKeys("BG-Extend alarm from station 07 created by attribute-" + date).build().perform();
		
		searchButton.click();
		Thread.sleep(2000);
		extendAlarmButton.click();
		Thread.sleep(2000);
		fireStationField.click();

		act.sendKeys("06").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		
	
		
		
		userTypeResource.click();
		
		ADST06R2.click();
		
		Thread.sleep(1000);
		
		addInfoField1.click();
	
		act.sendKeys("additional info 1").build().perform();
	
		addInfoField2.click();

		act.sendKeys("additional info 2").build().perform();
	
		addInfoField3.click();
	
		act.sendKeys("additional info 3").build().perform();
	
		addInfoField4.click();
		
		act.sendKeys("additional info 4").build().perform();
		
		addInfoField5.click();
	
		act.sendKeys("additional info 5").build().perform();
	
		save.click();
		
		
	
		

	}
	
	
	
	


	public void manualAlarmByResource(WebDriver driver, String date) throws Throwable {
		Actions act = new Actions(driver);

		createNewButton.click();
		
		fireDepartmentField.click();
	
		act.sendKeys("Andrew").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStationField.click();
		
		act.sendKeys("06").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		
		titlefield.click();
	
		act.sendKeys("BG-manual alarm by resource-" + date).build().perform();
	
		descriptionField.click();
		
		act.sendKeys("BG-manual alarm by resource checking.").build().perform();
	
		
	
		userTypeResource.click();
		Thread.sleep(2000);
		selectAllCheckBox.click();
		Thread.sleep(2000);
		selectAllCheckBox.click();
		
		ADST06R2.click();
	
		adressFeild.click();
	
		act.sendKeys("YES Hospital, Plot no. 1 & 1A, Dighori Flyover Square, Dighori, Nagpur, Maharashtra 440017").build().perform();
		
		
	
		dragMarkerOnMapCheckBox.click();
		
		grenrateAlarmButton.click();
		alarmYesButton.click();
		

	
		

	}
	
	
	

	

	public void manualAlarmByFireFighter(WebDriver driver, String date) throws Throwable {
		Actions act = new Actions(driver);

		createNewButton.click();
		
		fireDepartmentField.click();
		
		act.sendKeys("Andrew").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStationField.click();
		
		act.sendKeys("06").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		titlefield.click();
		
		act.sendKeys("BG-manual alarm by firefighter-" + date).build().perform();
	
		descriptionField.click();
		
		act.sendKeys("BG-manual alarm by firefighter checking.").build().perform();
	
		
	
		userTypeFireFighter.click();
		Thread.sleep(2000);
		
		vehicleField.click();
		Thread.sleep(1000);
		
		act.sendKeys("06v1").build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);

		act.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(2000);
		act.sendKeys("06v3").build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);

		
		selectAllCheckBox.click();
		Thread.sleep(1000);
		selectAllCheckBox.click();
		Thread.sleep(1000);
		jonas3.click();
		Thread.sleep(1000);
		jonas2.click();
		Thread.sleep(1000);
//		bhupeshLive2.click();
//		Thread.sleep(1000);

		
		

		adressFeild.click();
	
		act.sendKeys("Imperial Celebration Hall, Power House, 35, Mankapur Ring Rd, Mhalgi Nagar, Nagpur, Maharashtra 440034").build().perform();
		
		
	
		dragMarkerOnMapCheckBox.click();
	
		grenrateAlarmButton.click();
		
		alarmYesButton.click();
		

	
	
	}
	public void manualAlarmLowPriorityByAttribute(WebDriver driver, String date) throws Throwable {
		Actions act = new Actions(driver);

		createNewButton.click();
		
		fireDepartmentField.click();
	
		act.sendKeys("Andrew").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStationField.click();
		
		act.sendKeys("06").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		titlefield.click();
		
		act.sendKeys("BG-low priority manual alarm by attribute-" + date).build().perform();
		
		descriptionField.click();
		
		act.sendKeys("BG-low priority manual alarm by attribute checking.").build().perform();
		
		
	
		userTypeAttribute.click();
	
		vehicleField.click();
		Thread.sleep(1000);
		
		act.sendKeys("06v1").build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);

		act.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(2000);
		act.sendKeys("06v3").build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);

		
		selectAllCheckBox.click();
		Thread.sleep(2000);
		selectAllCheckBox.click();
	
		ADST06A2.click();
	
	
		lowPriorityCheckBox.click();
	
		adressFeild.click();
	
		act.sendKeys("Ranjana Celebration Hall, Suyog Nagar Square, Outer Ring Rd, Nagpur, Maharashtra 440015").build().perform();
	
		
	
		dragMarkerOnMapCheckBox.click();
	
		grenrateAlarmButton.click();
	
		alarmYesButton.click();
	
	


	}
	
	

	
	public void manualAlarmByNewFireFighter(WebDriver driver, String dateDDMMYY,String gTimeHHMM) throws Throwable {
		Actions act = new Actions(driver);

		createNewButton.click();
		
		fireDepartmentField.click();
		
		act.sendKeys("bhupesh").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStationField.click();
		
		act.sendKeys("BG andrew station "+dateDDMMYY+gTimeHHMM).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
	
		titlefield.click();
	
		act.sendKeys("BG-manual alarm by new firefighter-" + dateDDMMYY+gTimeHHMM).build().perform();
	
		descriptionField.click();
	
		act.sendKeys("BG-manual alarm by attribute checking.").build().perform();
	
		
	
		userTypeFireFighter.click();
		Thread.sleep(2000);
		vehicleField.click();
	
		act.sendKeys("06v1").build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		
		act.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(2000);
		act.sendKeys("06v3").build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		
		
		act.sendKeys("BG-V"+ dateDDMMYY+gTimeHHMM).build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).build().perform();
		
		selectAllCheckBox.click();
	
				

		adressFeild.click();
	
		act.sendKeys("Imperial Celebration Hall, Power House, 35, Mankapur Ring Rd, Mhalgi Nagar, Nagpur, Maharashtra 440034").build().perform();
		
		
	
		dragMarkerOnMapCheckBox.click();
	
		grenrateAlarmButton.click();
		
		alarmYesButton.click();
		
		Reporter.log("Manual alarm > BG-manual alarm by new firefighter-" + dateDDMMYY+gTimeHHMM+ "added successfully", true  );
		

	
	
	}
	
	
	
	
	
	
	

	public void manualAlarmByEscalationResource(WebDriver driver, String date) throws Throwable {
		Actions act = new Actions(driver);

		createNewButton.click();
	
		fireDepartmentField.click();
	
		act.sendKeys("Andrew").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStationField.click();

		act.sendKeys("06").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		titlefield.click();
		
		act.sendKeys("BG-manual alarm by escalation resource-" + date).build().perform();
	
		descriptionField.click();
	
		act.sendKeys("BG-manual alarm by escalation resource checking.").build().perform();
		
		
		
		userTypeResource.click();
		
		selectAllCheckBox.click();
	
		selectAllCheckBox.click();
		
		ADST06REsc.click();
	
		adressFeild.click();
		
		act.sendKeys("Tapasya Vidya Mandir, 4446+52G, Vinkar Colony, Manewada, Nagpur, Maharashtra 440024").build().perform();
	
		
		
		dragMarkerOnMapCheckBox.click();
		
		grenrateAlarmButton.click();
		
		alarmYesButton.click();
		

	
		

	}
	
	
	
	public void manualAlarmLowPriorityByEscalationResource(WebDriver driver, String date) throws Throwable {
		Actions act = new Actions(driver);

		createNewButton.click();
	
		fireDepartmentField.click();
	
		act.sendKeys("andrew").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStationField.click();

		act.sendKeys("06").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		titlefield.click();
		
		act.sendKeys("BG-low priority manual alarm by escalation resource-" + date).build().perform();
	
		descriptionField.click();
	
		act.sendKeys("BG-low priority manual alarm by escalation checking.").build().perform();
		
		
		
		userTypeResource.click();
		
		selectAllCheckBox.click();
	
		selectAllCheckBox.click();
		
		
	
		
		ADST06REsc.click();
		lowPriorityCheckBox.click();
		
		adressFeild.click();
		
		act.sendKeys("Tapasya Vidya Mandir, 4446+52G, Vinkar Colony, Manewada, Nagpur, Maharashtra 440024").build().perform();
	
		
		
		dragMarkerOnMapCheckBox.click();
		
		grenrateAlarmButton.click();
		
		alarmYesButton.click();
		

	
		

	}
	
	public void manualAlarmByNewFireFighterFromStationLogin(WebDriver driver, String dateDDMMYY,String gTimeHHMM) throws Throwable {
		Actions act = new Actions(driver);
		
		
		
		

		createNewButton.click();
		Thread.sleep(2000);
	
		selectStationForStationAlarm.click();
		Thread.sleep(1000);		
		act.sendKeys(Keys.ENTER).build().perform();
	
		titlefield.click();
	
		act.sendKeys("BG-manual alarm by new firefighter from new station user-" + dateDDMMYY+gTimeHHMM).build().perform();
	
		descriptionField.click();
	
		act.sendKeys("checking manual alarm by new station user login.").build().perform();
	
		
	
		userTypeFireFighter.click();
		Thread.sleep(2000);
		vehicleField.click();
	
		act.sendKeys("BG-V"+ dateDDMMYY+gTimeHHMM).build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).build().perform();
		
		selectAllCheckBox.click();
	
				

		adressFeild.click();
	
		act.sendKeys("Imperial Celebration Hall, Power House, 35, Mankapur Ring Rd, Mhalgi Nagar, Nagpur, Maharashtra 440034").build().perform();
		
		
	
		dragMarkerOnMapCheckBox.click();
	
		grenrateAlarmButton.click();
		
		alarmYesButton.click();
		
		Reporter.log("Manual alarm >BG-manual alarm by new firefighter from new station user-" + dateDDMMYY+gTimeHHMM+ "added successfully", true  );
		

	
	
	}

		
	
	public void extendAlarm(WebDriver driver, String date) throws Throwable {
		
		
		
		Actions act = new Actions(driver);
		searchField.click();
		
		act.sendKeys("BG-low priority").build().perform();
		
		searchButton.click();
		Thread.sleep(2000);
		extendAlarmButton.click();
		Thread.sleep(2000);
		fireStationField.click();

		act.sendKeys("07").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		userTypeAttribute.click();
	

		
		
		ADST07A2.click();
		
		addInfoField1.click();
	
		act.sendKeys("additional info 1").build().perform();
	
		addInfoField2.click();

		act.sendKeys("additional info 2").build().perform();
	
		addInfoField3.click();
	
		act.sendKeys("additional info 3").build().perform();
	
		addInfoField4.click();
		
		act.sendKeys("additional info 4").build().perform();
		
		addInfoField5.click();
	
		act.sendKeys("additional info 5").build().perform();
	
		save.click();
	
	
		

	}
	
	
	
	
	
	

	public void sendmessageToAlarmUser(WebDriver driver, String date) throws Throwable
	{
		Actions act = new Actions(driver);

		searchField.click();

		act.sendKeys("BG-low priority manual alarm by attribute").build().perform();
		
		searchButton.click();
		Thread.sleep(2000);
		chatOptions.click();
	
		writemessageField.click();
	
		act.sendKeys("message-alarm users").build().perform();
		
		sendmessageButton.click();
		
		Thread.sleep(1000);
		act.moveToElement(attachFile).click().build().perform();
		Thread.sleep(1000);
		
		StringSelection ss= new StringSelection("C:\\Users\\BHUPESH\\Desktop\\New folder\\FireFighter.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		
		Robot rc=new Robot();
		Thread.sleep(2000);
		rc.keyPress(KeyEvent.VK_CONTROL);
		rc.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		rc.keyRelease(KeyEvent.VK_CONTROL);
		rc.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		rc.keyPress(KeyEvent.VK_ENTER);
		rc.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		writemessageField.click();
		
		act.sendKeys("image-alarm users").build().perform();
		Thread.sleep(2000);
		sendmessageButton.click();
		Reporter.log("image attached properly",true);
		
		
		Thread.sleep(1000);
		act.moveToElement(attachFile).click().build().perform();
		Thread.sleep(1000);
		
		StringSelection ss1= new StringSelection("C:\\Users\\BHUPESH\\Desktop\\New folder\\Automation Test.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
		
		

		Thread.sleep(2000);
		rc.keyPress(KeyEvent.VK_CONTROL);
		rc.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		rc.keyRelease(KeyEvent.VK_CONTROL);
		rc.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		rc.keyPress(KeyEvent.VK_ENTER);
		rc.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		writemessageField.click();
		
		act.sendKeys("pdf-alarm users").build().perform();
		Thread.sleep(2000);
		sendmessageButton.click();
		Reporter.log("pdf attached properly",true);
		
		Thread.sleep(1000);
		act.moveToElement(attachFile).click().build().perform();
		Thread.sleep(1000);
		
		StringSelection ss2= new StringSelection("C:\\Users\\BHUPESH\\Desktop\\New folder\\Notes.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss2, null);
		
		

		Thread.sleep(2000);
		rc.keyPress(KeyEvent.VK_CONTROL);
		rc.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		rc.keyRelease(KeyEvent.VK_CONTROL);
		rc.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		rc.keyPress(KeyEvent.VK_ENTER);
		rc.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		writemessageField.click();
		
		act.sendKeys("word file -alarm users").build().perform();
		Thread.sleep(2000);
		sendmessageButton.click();
		Reporter.log("word file attached properly",true);
	
		
	}
	
	
	
	
	public void deactiveManualAlarms(WebDriver driver, String date) throws Throwable {
		Actions act = new Actions(driver);
				
		
		manualAlarmModule.click();
		
		manageAlarm.click();
		
		Select se = new Select(alarmLength);
		se.selectByVisibleText("100");
		Thread.sleep(2000);
	

		for (int i = 1; i <= 100; i++) {
			searchField.click();
			
			act.sendKeys("BG").build().perform();
			
			searchButton.click();
			Thread.sleep(2000);
			
			
			
	
			{deactiveAlarm.click();
			Thread.sleep(1000);
			changeStatusYes.click();
			Thread.sleep(1000);
			Reporter.log("Alarm number-" + i + " is deactive sucessfully.", true);
			Thread.sleep(8000);
		   driver.navigate().refresh();
		   Thread.sleep(2000);;
		  
			}

		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public void deleteAlarms(WebDriver driver, String date) throws Throwable {
		Actions act = new Actions(driver);
				
		
		manualAlarmModule.click();
		
		manageAlarm.click();
	

		for (int i = 1; i <= 100; i++) {
			searchField.click();
			
			act.sendKeys("BG").build().perform();
			
			searchButton.click();
			Thread.sleep(3000);
		
			delete.click();
		
			deleteYes.click();
			
			Reporter.log("Alarm number-" + i + " is deleted sucessfully.", true);
			Thread.sleep(2000);
		   driver.navigate().refresh();
		   Thread.sleep(1000);;

		}

	}

	

}