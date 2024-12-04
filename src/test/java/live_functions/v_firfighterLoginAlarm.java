package live_functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class v_firfighterLoginAlarm extends B_baseClass {

	@FindBy(xpath="//span[text()=\"Alarm\"]")private WebElement alarm;
	 @FindBy(xpath="//a[@href=\"http://live.retteralarm.de/admin/AlarmTemplates/alarmList\"]")private WebElement manageAlarm;
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

	public v_firfighterLoginAlarm(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	public void loginFirefighter() throws Throwable
	{
		getBranchName();
		
		
	}
}
