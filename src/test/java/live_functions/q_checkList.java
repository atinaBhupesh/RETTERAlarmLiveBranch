package live_functions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class q_checkList {
	
	
	
	     @FindBy(xpath="//span[text()=\"Documentation\"]")private WebElement documentation;
		 @FindBy(xpath="//a[@href=\"http://live.retteralarm.de/admin/Checklists/index\"]")private WebElement checkList;
		 
		 @FindBy(xpath = "//button[@class=\"btn btn-success\"]")private WebElement createNewButton;
		 @FindBy(xpath="//select[@id=\"selectFiredepartment\"]")private WebElement selectDepartment;
		 @FindBy(xpath="//span[@class=\"select2-selection__placeholder\"]")private WebElement fireStationField;
		 @FindBy(xpath="//input[@class=\"checklistType\" and @value=\"1\"]")private WebElement checkListNormal;
		 @FindBy(xpath="//input[@id=\"ChecklistsChecklistTitle\"]")private WebElement checkListTitle;
		 @FindBy(xpath="//input[@placeholder=\"Enter points\"]")private WebElement checkPoint1 ;
		 @FindBy(xpath="//button[@id=\"addRow\"]")private WebElement addCheckPointField;
		 @FindBy(xpath="(//input[@placeholder=\"Enter points\"])[2]")private WebElement checkPoint2;
		 @FindBy(xpath="(//button[@id=\"removeRow\"])[2]")private WebElement removeCheckPointField;
		@FindBy(xpath="//button[@id=\"addSubmit\"]")private WebElement saveCheckList;
		 @FindBy(xpath="//button[@id=\"dt_actionSearch\"]")private WebElement searchButton;
		 @FindBy(xpath="//input[@class=\"checklistType\" and @value=\"2\"]")private WebElement checkListAlarm;
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
		 @FindBy(xpath="//input[@class=\"form-control input-sm\"]")private WebElement searchField;
		 @FindBy(xpath = "(//i[@class=\"fa fa-trash-o\"])[1]")private WebElement delete;
		 @FindBy(xpath = "//button[@id=\"delRec\"]")private WebElement deleteYes;
		@FindBy(xpath="//td[contains(text(),\"BG\")]")private List<WebElement> availabeDataCount ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
	
	public q_checkList(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void commonForCheckList(WebDriver driver) throws Throwable {
		
		documentation.click();
		checkList.click();
		
		
	}
	
	public void createCheckListNormal (WebDriver driver,String dateDDMMYY,String gTimeHHMM) throws Throwable {
		
		Actions act = new Actions(driver);
		
		
		 for (int i=1;i<=2;i++)
		    {
		createNewButton.click();
		Thread.sleep(3000);
		selectDepartment.click();
		act.sendKeys("Andrew").perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		fireStationField.click();
		act.sendKeys("06").perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		checkListNormal.click();
		checkListTitle.click();
		act.sendKeys(" BG station 06 > normal check list-"+dateDDMMYY+gTimeHHMM+"-"+i).perform();
		checkPoint1.click();
		act.sendKeys("Normal check point 1").perform();
		addCheckPointField.click();
		checkPoint2.click();
		act.sendKeys("Normal check point 2").perform();
		addCheckPointField.click();
		removeCheckPointField.click();
		saveCheckList.click();
        Reporter.log("Normal check list number-" + i + " is added sucessfully.", true);
		
		driver.navigate().refresh();
		
		    }
		
		    }
		 
		 
		 
		 
		 public void createCheckListAlarm (WebDriver driver,String dateDDMMYY,String gTimeHHMM) throws Throwable {
				
				Actions act = new Actions(driver);
				
				
				 for (int i=1;i<=2;i++)
				    {
				createNewButton.click();
				Thread.sleep(3000);
				selectDepartment.click();
				act.sendKeys("Andrew").perform();
				Thread.sleep(500);
				act.sendKeys(Keys.ENTER).perform();
				Thread.sleep(2000);
				fireStationField.click();
				act.sendKeys("06").perform();
				Thread.sleep(500);
				act.sendKeys(Keys.ENTER).perform();
				checkListAlarm.click();
				checkListTitle.click();
				act.sendKeys("BG station 06 > alarm check list-"+dateDDMMYY+gTimeHHMM+"-"+i).perform();
				checkPoint1.click();
				act.sendKeys("alarm check point 1").perform();
				addCheckPointField.click();
				checkPoint2.click();
				act.sendKeys("alarm check point 2").perform();
				addCheckPointField.click();
				removeCheckPointField.click();
				saveCheckList.click();
		        Reporter.log("Alarm check list number-" + i + " is added sucessfully.", true);
				
				driver.navigate().refresh();
				
				    }
		
		
		
		
		
	}
		
public void deleteCheckLis (WebDriver driver) throws Throwable {
		
		
	
	    Actions act = new Actions(driver);
	    
	    int z=availabeDataCount.size();
		Reporter.log("The total available check list count is-"+z+" in the list for delete.",true);
	    
	    for (int i=1;i<=z;i++)
	    {
		searchField.click();
		act.sendKeys("BG").perform();
		Thread.sleep(2000);
		searchButton.click();
		delete.click();
	   	deleteYes.click();
		Thread.sleep(2000);
			
			Reporter.log("Check list number-" + i + " is deleted sucessfully.", true);
		
		driver.navigate().refresh();
	    }
		

    }

}
