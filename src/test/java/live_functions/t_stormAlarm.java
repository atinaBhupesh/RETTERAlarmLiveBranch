package live_functions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class t_stormAlarm  extends B_baseClass{
	
	
	    @FindBy(xpath="//i[@class=\"fa fa-bolt\"]")private WebElement storm;
		@FindBy(xpath="//a[@href=\"http://live.retteralarm.de/admin/Emergencies/index\"]")private WebElement manageEmergenciesL;
		@FindBy(xpath="//a[@href=\"http://testing.retteralarm.de/admin/Emergencies/index\"]")private WebElement manageEmergenciesT;
		@FindBy(xpath="//a[@href=\"http://development.retteralarm.de/admin/Emergencies/index\"]")private WebElement manageEmergenciesD;
		
		@FindBy(xpath="//button[@class=\"btn btn-success\"]")private WebElement createNew;
		@FindBy(xpath="//span[@class=\"select2-selection__placeholder\"]")private WebElement selectDepartment ;
		@FindBy(xpath="//span[@class=\"select2-selection select2-selection--multiple\"]")private WebElement selectStation;
		@FindBy(xpath="//textarea[@id=\"AlarmTitleDe\"]")private WebElement alarmTitle;
		@FindBy(xpath="//textarea[@id=\"AlarmDescriptionDe\"]")private WebElement alarmDetails;
		@FindBy(xpath="//input[@id=\"inlineRadio2\"]")private WebElement userTypeResource;
		@FindBy(xpath = "//input[@value=\"3138\"]")private WebElement ADST06REsc;
		@FindBy(xpath="//textarea[@id=\"AlarmAddress\"]")private WebElement alarmAddress;
		@FindBy(xpath="//button[@id=\"addSubmit\"]")private WebElement save;
		@FindBy(xpath="//button[@id=\"addSubForm\"]")private WebElement genrateAlarm;
		
		@FindBy(xpath="//a[@href=\"http://live.retteralarm.de/admin/Emergencies/dashboard\"]")private WebElement extendStormAlarmL ;
		@FindBy(xpath="//a[@href=\"http://testing.retteralarm.de/admin/Emergencies/dashboard\"]")private WebElement extendStormAlarmT ;
		@FindBy(xpath="//a[@href=\"http://development.retteralarm.de/admin/Emergencies/dashboard\"]")private WebElement extendStormAlarmD ;
		@FindBy(xpath="//input[@class=\"form-control input-sm\" and @aria-controls=\"example2\"]")private WebElement searchField;
		@FindBy(xpath="(//span[@class=\"call\"])[2]")private WebElement dragADST07R2;
		@FindBy(xpath="(//span[@class=\"call\"])[1]")private WebElement dropADST06R2;
		@FindBy(xpath="//button[@data-alarmbox=\"droppableResource1\"]")private WebElement sendAlarm;
		@FindBy(xpath="//button[@class=\"btn btn-green\"]")private WebElement confirmSendAlarm;
		
		
//		Testing
		@FindBy(xpath="//input[@value=\"476\"]")private WebElement D1ST04Esc;
		
		
		  @FindBy(xpath="//input[@value=\"850\"]")private WebElement BH1ST04Esc;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
				
			public t_stormAlarm (WebDriver driver) {
				PageFactory.initElements(driver, this);
			}
			
			
			
			
			
			public void stormAlarm(WebDriver driver,String dateDDMMYY,String gTimeHHMM, String deptName, String St1N, String BranchNameB) throws Throwable 
			{
				Actions act = new Actions(driver);
				
				
				storm.click();
			
				
				if  (BranchNameB.equals("1"))
				{
					manageEmergenciesL.click();
				}
				
				else if (BranchNameB.equals("2"))
				{
					manageEmergenciesT.click();
				}
				
				else if (BranchNameB.equals("3"))
				{
					manageEmergenciesD.click();
					
				}
				
				createNew.click();
				selectDepartment.click();
				act.sendKeys(deptName).build().perform();
				Thread.sleep(2000);
				act.sendKeys(Keys.ENTER).build().perform();
				Thread.sleep(2000);
				selectStation.click();
				act.sendKeys(St1N).build().perform();
				Thread.sleep(2000);
				act.sendKeys(Keys.ENTER).build().perform();
				
				alarmTitle.click();
				
				act.sendKeys("BG-storm alarm by resource-" + dateDDMMYY+"_"+gTimeHHMM).build().perform();
				
				alarmDetails.click();
				
				act.sendKeys("BG-storm alarm by escalation.").build().perform();
				
				userTypeResource.click();
				Thread.sleep(2000);
				
				
				
				
				
				
				
				
				
				
				
				
				
				if  (BranchNameB.equals("1"))
				{
					ADST06REsc.click();
				}
				
				else if (BranchNameB.equals("2"))
				{
					D1ST04Esc.click();
				}
				
				else if (BranchNameB.equals("3"))
				{
					BH1ST04Esc.click();
					
				}
				
				
				
				alarmAddress.click();
				
				act.sendKeys("BAPS Swaminarayan mandir, Wathoda Layout, Nagpur, Maharashtra 440035").build().perform();
				
				
				save.click();
				
				genrateAlarm.click();
				Thread.sleep(3000);
				
					
				
				
				
				
				
				
				
				
			}
			
			
			
			
			
			public void extendStormAlarm(WebDriver driver, String BranchNameB) throws Throwable 
			{
				Actions act = new Actions(driver);
				
				storm.click();
			
				
				
				if  (BranchNameB.equals("1"))
				{
					extendStormAlarmL.click();
				}
				
				else if (BranchNameB.equals("2"))
				{
					extendStormAlarmT.click();
				}
				
				else if (BranchNameB.equals("3"))
				{
					extendStormAlarmD.click();
					
				}
				Thread.sleep(2000);
				
				
				searchField.click();
				
				
				if  (BranchNameB.equals("1"))
				{
					act.sendKeys("ADST07R2").build().perform();
					Thread.sleep(2000);
				}
				
				else if (BranchNameB.equals("2"))
				{
					act.sendKeys("D1ST05R1").build().perform();
					Thread.sleep(2000);
				}
				
				else if (BranchNameB.equals("3"))
				{
					act.sendKeys("BH1ST2R1").build().perform();
					Thread.sleep(2000);
					
				}
				
				
				
				
				
				act.dragAndDrop(dragADST07R2, dropADST06R2).build().perform();
				Thread.sleep(1000);
				
				sendAlarm.click();
				Thread.sleep(1000);

				
				confirmSendAlarm.click();
			
				
				
				
				
				
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
