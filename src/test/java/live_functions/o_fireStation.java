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

public class o_fireStation {
	
	
	
	 @FindBy(xpath="//span[text()=\"Administration\"]")private WebElement admin;
	 @FindBy(xpath="//a[@href=\"http://live.retteralarm.de/admin/Firestations/\"]")private WebElement manageFireStation;
	 @FindBy(xpath="//button[@class=\"btn btn-success\"]")private WebElement createNew ;
	 @FindBy(xpath="//span[@id=\"select2-mainFirestation-container\"]")private WebElement departmentField;
	 @FindBy(xpath="//input[@placeholder=\"Enter fire station name\"]")private WebElement stationNameField;
	 @FindBy(xpath="//select[@id=\"select-alert-lang\"]")private WebElement stationLanguage;
	 @FindBy(xpath="//span[@id=\"select2-selectCountry-container\"]")private WebElement StationCountry;
	 @FindBy(xpath="//textarea[@placeholder=\"Enter address\"]")private WebElement stationAddress;
	 @FindBy(xpath="//button[@id=\"addSubmit\"]")private WebElement saveStation;
	 
	 
	 
	 @FindBy(xpath="//input[@class=\"form-control input-sm\"]")private WebElement searchField;
	 @FindBy(xpath="//button[@id=\"dt_actionSearch\"]")private WebElement searchButton;
	 @FindBy(xpath="(//i[@class=\"fa fa-trash-o\"])[1]")private WebElement deleteStation;
	 @FindBy(xpath="//button[@id=\"delYes\"]")private WebElement deleteYes;
		@FindBy(xpath="//td[contains(text(),\"BG andrew\")]")private List<WebElement> availabeDataCount ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;


   public o_fireStation(WebDriver driver)
   {
	PageFactory.initElements(driver, this);
	}
   
	public void CommonForStation(WebDriver driver) 
	{
		admin.click();
		manageFireStation.click();
		
	}
	
	
	public void createStation (WebDriver driver,String dateDDMMYY,String gTimeHHMM) throws Throwable
	{
		Actions act = new Actions(driver);
		
		createNew.click();
		departmentField.click();
		act.sendKeys("Andrew").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		stationNameField.click();
		act.sendKeys("BG andrew station "+dateDDMMYY+gTimeHHMM).perform();
//
//		Select se44 = new Select(stationLanguage);
//		se44.deselectByVisibleText("English");
		StationCountry.click();
		act.sendKeys("India").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
		
		stationAddress.click();
		act.sendKeys("itwari railway station nagpur").perform();
		saveStation.click();
		
		
	
		Reporter.log("Station > BG andrew station "+dateDDMMYY+gTimeHHMM+" added sucessfully",true);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	public void deleteStation (WebDriver driver) throws Throwable
	{
		Actions act = new Actions(driver);
		int z=availabeDataCount.size();
		Reporter.log("The available station count is-"+z+" in the list for delete.",true);
		
		
		for (int i=1;i<=z;i++)
		{
		
		searchField.click();
		
		act.sendKeys("bg").perform();
		
		searchButton.click();
		Thread.sleep(3000);
		deleteStation.click();
		deleteYes.click();
		driver.navigate().refresh();
		
		Reporter.log("Fire station number-"+i, true);
		
		}
		
		
	}


	
}
	
	
	


