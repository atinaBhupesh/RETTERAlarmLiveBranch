package live_functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class D_homePage {
	@FindBy(xpath = "//img[@src=\"/img/logoicon.png\"]")
	private WebElement retterAlarmimg;
	@FindBy(xpath = "//select[@name=\"data[app_type]\"]")
	private WebElement languageButton;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
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

	public void backToHomePage(WebDriver driver) throws Throwable {
		retterAlarmimg.click();
		//Thread.sleep(3000);

	}

}
