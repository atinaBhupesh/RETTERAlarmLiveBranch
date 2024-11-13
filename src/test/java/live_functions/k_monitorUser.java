package live_functions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class k_monitorUser extends B_baseClass {

	@FindBy(xpath = "//i[@class=\"fa fa-desktop\"]")
	private WebElement manageMonitor;
	@FindBy(xpath = "//a[@href=\"http://live.retteralarm.de/admin/MonitorSettings/users\"]")
	private WebElement manageMonitorSetting;

	@FindBy(xpath = "//span[@id=\"select2-selectedFiredepartment-container\"]")
	private WebElement fireDepartmentField;
	@FindBy(xpath = "//span[@class=\"select2-selection__placeholder\"]")
	private WebElement fireStationField;
	@FindBy(xpath = "//a[@id=\"actionAddMonitor\"]")
	private WebElement addMonitorUser;
	@FindBy(xpath = "//input[@id=\"UserFirstName\"]")
	private WebElement monitorNameField;
	@FindBy(xpath = "//input[@id=\"UserUsername\"]")
	private WebElement monitorUserNameField;
	@FindBy(xpath = "//select[@id=\"select-alert-lang\"]")
	private WebElement selectLang;
	@FindBy(xpath = "//input[@name=\"data[User][show_setting]\"]")
	private WebElement checkBoxAllowToSeeSetting;
	@FindBy(xpath = "//input[@name=\"data[User][access_setting]\"]")
	private WebElement checkBoxAllowToChangeSetting;
	@FindBy(xpath = "//textarea[@id=\"AlarmAddress\"]")
	private WebElement monitorAddressField;
	@FindBy(xpath = "//input[@id=\"locationDrag\"]")
	private WebElement dragMarkerOnMap;
	@FindBy(xpath = "//button[@id=\"addSubmit\"]")
	private WebElement saveButton;
	@FindBy(xpath = "//input[@id=\"UserPassword\"]")
	private WebElement userPasswordField;
	@FindBy(xpath = "(//i[@class=\"fa fa-trash-o\"])[1]")
	private WebElement deleteLastAddedMonitorUser;
	@FindBy(xpath = "//button[@id=\"delYes1\"]")
	private WebElement deleteYes;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;

	public k_monitorUser(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void commonForMonitorUser(WebDriver driver) throws Throwable {
		Actions act = new Actions(driver);
		manageMonitor.click();
		Thread.sleep(2000);
		manageMonitorSetting.click();
		Thread.sleep(2000);

	}

	public void createMonitorUserForStation06(WebDriver driver) throws Throwable {
		Actions act = new Actions(driver);

		fireDepartmentField.click();
		act.sendKeys("andrew").build().perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStationField.click();
		act.sendKeys("06").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		addMonitorUser.click();
		Thread.sleep(2000);
		monitorNameField.click();
		act.sendKeys("BgStation06M10").build().perform();
		monitorUserNameField.click();
		act.sendKeys("BgStation06M10").build().perform();
		userPasswordField.click();
		act.sendKeys("123456").build().perform();
		Select se = new Select(selectLang);
		se.selectByVisibleText("English");
		checkBoxAllowToSeeSetting.click();
		checkBoxAllowToChangeSetting.click();
		monitorAddressField.click();
		act.sendKeys("Pardi nagpur.").build().perform();
		dragMarkerOnMap.click();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		saveButton.click();

	}
	public void createNewMonitorUser(WebDriver driver,String dateDDMMYY,String gTimeHHMM) throws Throwable {
		Actions act = new Actions(driver);

		fireDepartmentField.click();

		act.sendKeys("bhupesh").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStationField.click();
	
		act.sendKeys("BG andrew station "+dateDDMMYY+gTimeHHMM).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		addMonitorUser.click();
	
		monitorNameField.click();
		act.sendKeys("BG andrew station "+dateDDMMYY+gTimeHHMM+"M1").build().perform();
		
		monitorUserNameField.click();
	
		act.sendKeys("BG andrew station "+dateDDMMYY+gTimeHHMM+"M1").build().perform();
		
		userPasswordField.click();
	
		act.sendKeys("123456").build().perform();

		Select se = new Select(selectLang);
		se.selectByVisibleText("English");
	
		checkBoxAllowToSeeSetting.click();

		checkBoxAllowToChangeSetting.click();

		monitorAddressField.click();

		act.sendKeys("Pardi nagpur.").build().perform();
	
		dragMarkerOnMap.click();
		
		saveButton.click();
		
		
		Reporter.log("Station monitor > BG andrew station "+dateDDMMYY+gTimeHHMM+"M1created successfully", true);
	

	}
	
	
	
	
	
	
	
	


	public void deleteMonitorUser(WebDriver driver) throws Throwable {
		Actions act = new Actions(driver);

		for (int i=0;i<=20;i++)
		{
		fireDepartmentField.click();
		Thread.sleep(2000);
		act.sendKeys("bhupesh").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStationField.click();
		Thread.sleep(2000);
		act.sendKeys("bg").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		deleteLastAddedMonitorUser.click();
		Thread.sleep(2000);
		deleteYes.click();
		Thread.sleep(5000);
		
		Reporter.log("monitor number-"+i+" deleted successfully");
		}

	}

}
