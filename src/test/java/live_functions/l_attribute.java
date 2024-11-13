package live_functions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class l_attribute {

	@FindBy(xpath = "//span[text()=\"Attributes\"]")
	private WebElement attributeModule;
	@FindBy(xpath = "//a[@href=\"http://live.retteralarm.de/admin/Attributes/\"]")
	private WebElement manageAttribute;
	@FindBy(xpath = "//button[@class=\"btn btn-success\"]")
	private WebElement createNew;
	@FindBy(xpath = "//span[@id=\"select2-sectionDepartment-container\"]")
	private WebElement departmentField;
	@FindBy(xpath = "//input[@id=\"AlarmAttributeTitle\"]")
	private WebElement attributeTitleField;
	@FindBy(xpath = "//input[@id=\"AlarmAttributeShortName\"]")
	private WebElement attributeShortNameField;
	@FindBy(xpath = "//button[@id=\"addSubmit\"]")
	private WebElement Save;
	
	
	@FindBy(xpath = "//input[@aria-controls=\"example12\"]")
	private WebElement searchField;
	@FindBy(xpath = "(//i[@class=\"fa fa-trash-o\"])[1]")
	private WebElement delete;
	@FindBy(xpath = "//button[@id=\"call_delete_ajax\"]")
	private WebElement deleteYes;

	public l_attribute(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void addAttribute(WebDriver driver,  String dateDDMMYY, String gTimeHHMM) throws Throwable {

		attributeModule.click();
		manageAttribute.click();

		
			createNew.click();
			departmentField.click();
			Actions act = new Actions(driver);

			act.sendKeys("Andrew").build().perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			attributeTitleField.click();
			Thread.sleep(1000);
			act.sendKeys("BG:Attribute>"+ dateDDMMYY+gTimeHHMM).build().perform();
			Thread.sleep(1000);
			attributeShortNameField.click();
			Thread.sleep(1000);
			act.sendKeys("BG:Attri>" + dateDDMMYY+gTimeHHMM).build().perform();
			Thread.sleep(1000);
			Save.click();
			Thread.sleep(1000);
			Reporter.log("BG:Attri>" + dateDDMMYY+gTimeHHMM+">"+"added successfully", true);
			driver.navigate().refresh();
			

	

	}
	
	public void addAttribute2(WebDriver driver,  String dateDDMMYY, String gTimeHHMM) throws Throwable {

		attributeModule.click();
		manageAttribute.click();

		
			createNew.click();
			departmentField.click();
			Actions act = new Actions(driver);

			act.sendKeys("bhupesh").build().perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			attributeTitleField.click();
			Thread.sleep(1000);
			act.sendKeys("BG:Attribute>"+ dateDDMMYY+gTimeHHMM).build().perform();
			Thread.sleep(1000);
			attributeShortNameField.click();
			Thread.sleep(1000);
			act.sendKeys("BG:Attri>" + dateDDMMYY+gTimeHHMM).build().perform();
			Thread.sleep(1000);
			Save.click();
			Thread.sleep(1000);
			Reporter.log("BG:Attri>" + dateDDMMYY+gTimeHHMM+">"+"added successfully", true);
			driver.navigate().refresh();
			

	

	}
	

	public void deleteAttribute(WebDriver driver) throws Throwable {

		attributeModule.click();
		manageAttribute.click();

		for (int i = 1; i <= 15; i++) {
			searchField.click();

			Actions act = new Actions(driver);

			act.sendKeys("BG").build().perform();
		
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			
			delete.click();
			Thread.sleep(2000);
			deleteYes.click();
			Thread.sleep(2000);
			Reporter.log("Attribute number" + i + " deleted successfully", true);
			driver.navigate().refresh();

		}

	}

}
