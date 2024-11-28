package live_functions;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class s_alarmTemplate extends  B_baseClass {
	
	@FindBy(xpath = "//span[text()=\"Alarm\"]")private WebElement manualAlarmModule ;
	 @FindBy(xpath="//a[@href=\"http://live.retteralarm.de/admin/AlarmTemplates/list\"]")private WebElement alarmTemplateL;
	 @FindBy(xpath="//a[@href=\"http://testing.retteralarm.de/admin/AlarmTemplates/list\"]")private WebElement alarmTemplateT;
	 @FindBy(xpath="//a[@href=\"http://development.retteralarm.de/admin/AlarmTemplates/list\"]")private WebElement alarmTemplateD;
	 
	 @FindBy(xpath="//button[@class=\"btn btn-success\"]")private WebElement createNew ;
	 
	 @FindBy(xpath = "//span[@id=\"select2-selectDepartment-container\"]")private WebElement fireDepartmentField;
	 
	 @FindBy(xpath = "//input[@placeholder=\"Select Alarm Firestation\"]")	private WebElement alarmedfireStationField;
	 @FindBy(xpath="//input[@id=\"AlarmTemplateTemplateName\"]")private WebElement templateName;
		@FindBy(xpath="//textarea[@id=\"AlarmTemplateTitle\"]")private WebElement templateTitle;
		@FindBy(xpath="//textarea[@id=\"AlarmTemplateContent\"]")private WebElement templateAlarmDescriptions;
		@FindBy(xpath="//input[@id=\"inlineRadio1\"]")private WebElement userTypeAttribute;
		 @FindBy(xpath="//input[@placeholder=\"Select Firecar\"]")private WebElement vehicleField;
	
			
	 @FindBy(xpath="//textarea[@placeholder=\"Enter address\"]")private WebElement alarmAddress;
			 @FindBy(xpath="//span[@id=\"select2-selectTFirestation-container\"]")private WebElement fireStationField;
			 @FindBy(xpath="//button[@id=\"addSubmit\"]")private WebElement saveAlarmTemplate;
			
			 @FindBy(xpath="//input[@class=\"form-control input-sm\"]")private WebElement searchField;
			 @FindBy(xpath="(//i[@class=\"fa fa-trash-o\"])[1]")private WebElement delate;
			 @FindBy(xpath="//button[@id=\"delYes1\"]")private WebElement delateYes;
			 
			 
			 @FindBy(xpath = "//input[@value=\"15429\"]") private WebElement ADST06A2;
			 
			 @FindBy(xpath = "//td[contains(text(),\"BG-Template\")]")
				private List<WebElement> availableDataCount; 
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
			
		public s_alarmTemplate(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		
		
		
		
		public void commonForAlarmTemplate(WebDriver driver, String BranchNameB) throws Throwable 
		{
			manualAlarmModule.click();
			
			
			
			Thread.sleep(1000);
			
			
			if  (BranchNameB.equals("live"))
			{
				alarmTemplateL.click();
			}
			
			else if (BranchNameB.equals("testing"))
			{
				alarmTemplateT.click();
			}
			
			else if (BranchNameB.equals("dev"))
			{
				alarmTemplateD.click();
				
			}
			
			
		}
		
		
		public void addAlarmTemplate(WebDriver driver,String dateDDMMYY,String gTimeHHMM, String BranchNameB) throws Throwable 
		{
			
			Actions act = new Actions(driver);
			createNew.click();
			
			fireDepartmentField.click();
			act.sendKeys("Andrew").build().perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			fireStationField.click();
			act.sendKeys("06").build().perform();
			Thread.sleep(1000);
			//act.sendKeys(dateDDMMYY).sendKeys(gTimeHHMM).build().perform();
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			alarmedfireStationField.click();
			act.sendKeys("06").build().perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			
			templateName.click();
			act.sendKeys("BG-Template-"+dateDDMMYY+"_"+gTimeHHMM).build().perform();
			Thread.sleep(2000);
			templateTitle.click();
			act.sendKeys("BG-Template alarm for station 06").build().perform();
			templateAlarmDescriptions.click();
			act.sendKeys("creating template alarm for satation 06.").build().perform();
			userTypeAttribute.click();
			vehicleField.click();
			act.sendKeys("ADST06v1").build().perform();
			ADST06A2.click();
			alarmAddress.click();
			act.sendKeys("Mahal, Nagpur").build().perform();
			
			Thread.sleep(5000);
			saveAlarmTemplate.click();
			Reporter.log("Alarm Template> BG-Template-"+dateDDMMYY+"_"+gTimeHHMM+" adde successfully.",true);
			
		}
		public void deleteAlarmTemplate(WebDriver driver, String BranchNameB) throws Throwable 
		{
			
			int z = availableDataCount.size();
			Reporter.log("The availabler alarm template count is-" + z + " in the list for delete.", true);
			for (int i=1;i<=z;i++)
			{
			searchField.click();
			Actions act = new Actions(driver);
			act.sendKeys("BG-Template").build().perform();
			Thread.sleep(3000);
			delate.click();
			delateYes.click();
			driver.navigate().refresh();
			Reporter.log("Template No-"+i+" deleted successfully.",true);
			Thread.sleep(2000);
		}
			
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
