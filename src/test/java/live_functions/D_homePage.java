package live_functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class D_homePage extends B_baseClass{
	@FindBy(xpath = "//img[@src=\"/img/logoicon.png\"]")
	private WebElement retterAlarmimg;
	@FindBy(xpath = "//select[@name=\"data[app_type]\"]")
	private WebElement languageButton;
	@FindBy(xpath="//span[text()=\"Dashboard\"]")private WebElement dashboardMenu;
	@FindBy(xpath="//a[@href=\"http://testing.retteralarm.de/admin/dashboard/index\"]")private WebElement dashboardT;
	@FindBy(xpath="//a[@href=\"http://live.retteralarm.de/admin/dashboard/index\"]")private WebElement dashboardL;
	@FindBy(xpath="//a[@href=\"http://development.retteralarm.de/admin/dashboard/index\"]")private WebElement dashboardD;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;

	public D_homePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void langChange(WebDriver driver) throws Throwable {
		Select se = new Select(languageButton);
		se.selectByVisibleText("English");
		//Thread.sleep(3000);

	}

	public void backToHomePage(WebDriver driver, String BranchNameB) throws Throwable {
		retterAlarmimg.click();
		Thread.sleep(1000);
////		
//		Thread.sleep(2000);
//		dashboardMenu.click();
//		Thread.sleep(2000);
//		
//		if  (BranchNameB.equals("1"))
//		{
//			dashboardL.click();
//		}
//		
//		else if (BranchNameB.equals("2"))
//		{
//			dashboardT.click();
//		}
//		
//		else if (BranchNameB.equals("3"))
//		{
//			dashboardD.click();
//			
//		}
//		
		
		
		
		
		
		Thread.sleep(1000);
		
		

	}

}
