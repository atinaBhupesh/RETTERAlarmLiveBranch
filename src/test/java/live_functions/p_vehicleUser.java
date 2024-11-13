package live_functions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class p_vehicleUser {
	
		 @FindBy(xpath="//span[text()=\"Administration\"]")private WebElement admin;
		 @FindBy(xpath="//a[@href=\"http://live.retteralarm.de/admin/ResourceCars/\"]")private WebElement ManageVehicleUser;
		 @FindBy(xpath="//button[@class=\"btn btn-success\"]")private WebElement createNew;
		 @FindBy(xpath="//input[@id=\"UserAlarmEmail\"]")private WebElement vehicleUserMailIdField;
		 
		 @FindBy(xpath="//input[@id=\"UserFirstName\"]")private WebElement vehicleNamefield;
				 
				 
		 @FindBy(xpath="//span[@id=\"select2-selectFiredepartment-container\"]")private WebElement vehicleDepartment;
		 @FindBy(xpath="//span[@id=\"select2-selectFiresation-container\"]")private WebElement vehicleStation;
			@FindBy(xpath="//input[@placeholder=\"Select Resource\"]")private WebElement resource; 
		 
		 @FindBy(xpath="//span[@id=\"select2-selectCountry-container\"]")private WebElement vehicleCountry; 
		 @FindBy(xpath="//input[@id=\"UserAlarmTypePush\"]")private WebElement typePush;
		 @FindBy(xpath="//button[@id=\"addSubmit\"]")private WebElement saveVehicle; 
		 @FindBy(xpath="//input[@placeholder=\"Enter password\"]")private WebElement vehiclePasswordField;
		 
		
	
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ; 
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		 
		 @FindBy(xpath="//input[@class=\"form-control input-sm\"]")private WebElement searchField;
		 @FindBy(xpath="//button[@id=\"dt_actionSearch\"]")private WebElement searchButton;
		 @FindBy(xpath="(//i[@class=\"fa fa-trash-o\"])[1]")private WebElement deleteStation;
		 @FindBy(xpath="//button[@id=\"delYes\"]")private WebElement deleteYes;

	   public p_vehicleUser(WebDriver driver)
	   {
		PageFactory.initElements(driver, this);
		}
	   
	   
		public void commonForVehicleUser(WebDriver driver) 
		{
			admin.click();
			ManageVehicleUser.click();
		}
		
		
		
		public void addVehicleUser(WebDriver driver,String vehicleEmailId,String deptName,String stName1, String Station06Resource) throws Throwable 
		{
			
			for (int i=1;i<=2;i++)
			{
			Actions act = new Actions(driver);
			createNew.click();
			Thread.sleep(2000);
			vehicleUserMailIdField.click();
			act.sendKeys(vehicleEmailId+"_"+i+"@atpl.in").perform();
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(2000);
			
			
//			vehicleNamefield.click();
//			act.sendKeys("BG-Station06V"+i).build().perform();
//			Thread.sleep(2000);
			
			
			vehicleDepartment.click();
			act.sendKeys(deptName).build().perform();
		
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(2000);
			vehicleStation.click();
			act.sendKeys(stName1).build().perform();
		
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(2000);
			resource.click();
			
			act.sendKeys(Station06Resource).build().perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.ENTER).perform();
			
//			
//			vehicleCountry.click();
//			act.sendKeys("India").perform();
//			Thread.sleep(2000);
			act.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
			typePush.click();
		
//			vehiclePasswordField.click();
//			act.sendKeys("123456").perform();
//		
			
			saveVehicle.click();
			
			
			Reporter.log(vehicleEmailId+"_"+i+"@atpl.in  added sucessfully",true);
			}
		
			}
		
		
		
	   
		public void addVehicleUserForNewStation(WebDriver driver,String dateDDMMYY,String gTimeHHMM,String vehicleEmailId) throws Throwable 
		{
			
			for (int i=1;i<=2;i++)
			{
			Actions act = new Actions(driver);
			createNew.click();
			
			
			
			
		
			act.sendKeys("BG-V"+ dateDDMMYY+gTimeHHMM+"-"+i).build().perform();
			Thread.sleep(2000);
			vehicleStation.click();
			act.sendKeys("BG andrew station "+dateDDMMYY+gTimeHHMM).build().perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.ENTER).perform();
			vehicleCountry.click();
			act.sendKeys("India").perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
			typePush.click();
		
			vehiclePasswordField.click();
			act.sendKeys("123456").perform();
		
			
			saveVehicle.click();
			
			
			Reporter.log("vehicle > BG-V"+ dateDDMMYY+gTimeHHMM+"-"+1+" added sucessfully",true);
		
			}
			
			
			
		}
		public void deleteVehicleUser(WebDriver driver) throws Throwable 
		{
			Actions act = new Actions(driver);
			for (int i=1;i<=15;i++)
			{
			
			searchField.click();
			
			act.sendKeys("BG_adst06").perform();
			
			searchButton.click();
			Thread.sleep(3000);
			deleteStation.click();
			deleteYes.click();
			driver.navigate().refresh();
			
			Reporter.log("vehicle number-"+i, true);
			
			}
		}
		

}
