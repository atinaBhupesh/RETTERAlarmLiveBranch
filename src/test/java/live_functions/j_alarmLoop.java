package live_functions;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class j_alarmLoop extends  B_baseClass {
	
	@FindBy(xpath = "//span[text()=\"Alarm\"]")private WebElement manualAlarmModule ;

	@FindBy(xpath="//a[@href=\"http://live.retteralarm.de/admin/AlarmResources/loops\"]")private WebElement alarmLoopL;
	@FindBy(xpath="//a[@href=\"http://testing.retteralarm.de/admin/AlarmResources/loops\"]")private WebElement alarmLoopT;
	@FindBy(xpath="//a[@href=\"http://development.retteralarm.de/admin/AlarmResources/loops\"]")private WebElement alarmLoopD;
	
	
	 @FindBy(xpath="//button[@class=\"btn btn-success\"]")private WebElement createNew ;
	 @FindBy(xpath="//a[@href=\"http://live.retteralarm.de/admin/AlarmResources/resources\"]")private WebElement alarmResourceL;
	 @FindBy(xpath="//a[@href=\"http://testing.retteralarm.de/admin/AlarmResources/resources\"]")private WebElement alarmResourceT;
	 @FindBy(xpath="//a[@href=\"http://development.retteralarm.de/admin/AlarmResources/resources\"]")private WebElement alarmResourceD;
	 
	 
	 @FindBy(xpath = "//span[@id=\"select2-selectFiredepartment-container\"]")private WebElement fireDepartmentField;
	 @FindBy(xpath = "//input[@placeholder=\"Select Firestation\"]")	private WebElement fireStationField;
	 @FindBy(xpath="//input[@id=\"AlarmLoopNickname\"]")private WebElement alarmLoopNikName ;
	 @FindBy(xpath="//input[@id=\"AlarmLoopAlarmCode\"]")private WebElement alarmLoopCode;
	 @FindBy(xpath="//input[@placeholder=\"Make a new resource, enter the name of the resource here\"]")private WebElement resourceField;
	 @FindBy(xpath="//button[@id=\"addSubmit\"]")private WebElement save;
	
	  @FindBy(xpath="//input[@class=\"form-control input-sm\"]")private WebElement searchfield;
	 @FindBy(xpath="//button[@id=\"dt_actionSearch\"]")private WebElement searchButton;
	 @FindBy(xpath="(//i[@class=\"fa fa-trash-o\"])[1]")private WebElement delete;
	@FindBy(xpath="//button[@id=\"delYes\"]")private WebElement deleteYes;
	
	@FindBy(xpath="//td[contains(text(),\"BG\")]")private List<WebElement> availableDataCount ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
		
	public j_alarmLoop(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	public void commonForAlarmLoop(WebDriver driver, String BranchNameB) throws Throwable 
	{
		manualAlarmModule.click();
		
		
		Thread.sleep(1000);
		
		
		if  (BranchNameB.equals("1"))
		{
			alarmLoopL.click();
		}
		
		else if (BranchNameB.equals("2"))
		{
			alarmLoopT.click();
		}
		
		else if (BranchNameB.equals("3"))
		{
			alarmLoopD.click();
			
		}
		
	}
	
	
	
	public void deleteAlarmLoop(WebDriver driver, String BranchNameB) throws Throwable 
	{
		int z=availableDataCount.size();
		Reporter.log("The total availabe alarm loop cout is -"+z+" in the list for delete.",true);
		for (int i=1;i<=z;i++)
		{
		Actions act = new Actions(driver);
		searchfield.click();
		act.sendKeys("bg").build().perform();
		
		searchButton.click();
		Thread.sleep(3000);
		delete.click();
		Thread.sleep(5000);
		deleteYes.click();
		Thread.sleep(1000);
		Reporter.log("Alarm loop no-"+i+" deleted successfully",true);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
	}
	
	}





	public void addAlarmLoop(WebDriver driver, String dateDDMMYY, String gTimeHHMM,String deptName,String St1N, String branchNameB) throws Throwable {

		Actions act = new Actions(driver);
		createNew.click();
		
		fireDepartmentField.click();
		act.sendKeys(deptName).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		fireStationField.click();
		act.sendKeys(St1N).build().perform();
		//act.sendKeys(dateDDMMYY).sendKeys(gTimeHHMM).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		alarmLoopNikName.click();
		act.sendKeys("BG:AlarmLoop-"+ dateDDMMYY+"_"+gTimeHHMM).build().perform();
		alarmLoopCode.click();
		act.sendKeys("BG:AlarmLoop-"+ dateDDMMYY+"_"+gTimeHHMM).build().perform();
		resourceField.click();
		act.sendKeys("BG").build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		save.click();
		Reporter.log("Alarm Loop >BG:AlarmLoop-"+ dateDDMMYY+"_"+gTimeHHMM+" added successfully.",true);
	}
	
	
	
	

}
