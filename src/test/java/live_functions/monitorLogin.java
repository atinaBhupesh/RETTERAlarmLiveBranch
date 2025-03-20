package live_functions;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class monitorLogin {
	
	
	@FindBy(xpath = "//input[@id=\"u\"]")private WebElement userNameField;
	@FindBy(xpath = "//input[@id=\"p\"]")	private WebElement passwordField;
	@FindBy(xpath = "//button[@id=\"addSubmit\"]")	private WebElement logInButton;
	@FindBy(xpath = "//a[@href=\"/admin/users/logout\"]")	private WebElement logOutButton;
	
	
	
	
	
	String Bn;
	
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

		public monitorLogin(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public void loginMonitor(WebDriver driver, String Bn ) throws Throwable
		{
			
			
			
			
			
			Scanner scanner = new Scanner(System.in);

			// Prompt the user to enter the branch name
			System.out.print("Enter the branch name > for live-1, for Testing-2, for development-3 : ");
			System.out.println();

			// Store the input in a variable
			Bn = scanner.nextLine();
			
			
			
			
			Actions act= new Actions (driver);
			
			
			
			
			
			if  (Bn.equals("1" ) || Bn.equals("1.5" ))
			{
				driver.navigate().to("https://am2.retteralarm.de/login");
				Thread.sleep(3000);
				userNameField.click();
				act.sendKeys("andrewdeptm").build().perform();
			
				
				
				
			}
			
			else if (Bn.equals("2")||Bn.equals("2.5"))
			{
				driver.navigate().to("https://testing.retteralarm.de/admin/users/login");
				Thread.sleep(3000);
				
				userNameField.click();
				act.sendKeys("Dept1M1").build().perform();
				
				
			}
			
			else if (Bn.equals("3")||Bn.equals("3.5"))
			{
				driver.navigate().to("https://development.retteralarm.de/admin/users/login");
				Thread.sleep(3000);
				
				userNameField.click();
				act.sendKeys("andrewdeptm").build().perform();
				
			}
						
			
			
			
			passwordField.click();

			act.sendKeys("123456").build().perform();
			
//			Thread.sleep(3000);
			logInButton.click();
//			Thread.sleep(3000);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
