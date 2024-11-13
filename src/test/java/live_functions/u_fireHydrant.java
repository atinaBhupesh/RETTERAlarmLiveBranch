package live_functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class u_fireHydrant {
	
	
	
	@FindBy(xpath="//span[text()=\"Fire Hydrants\"]")private WebElement fireHydrantModule;
	@FindBy(xpath="//select[@id=\"selectFiredepartmentSearch\"]")private WebElement selectDepartment;
	@FindBy(xpath="//select[@id=\"selectFiredepartmentSearch\"]")private WebElement selectStation ;
	@FindBy(xpath="//button[@id=\"searchSubmit\"]")private WebElement filterButton;
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
			
		public u_fireHydrant (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		
		public void addFireHydrant () throws Throwable
		{
			
			fireHydrantModule.click();	
			Thread.sleep(1000);
			
			
			Select se =new Select(selectDepartment);
			se.selectByVisibleText("andrew department");
			Thread.sleep(1000);
			Select se1 =new Select(selectStation);
			se1.selectByVisibleText("andrew station 06");
			Thread.sleep(1000);
			filterButton.click();
			Thread.sleep(2000);
			
			
			
			
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
