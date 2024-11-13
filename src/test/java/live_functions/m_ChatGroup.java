package live_functions;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class m_ChatGroup {
	
	
	
	
	
	
	    @FindBy(xpath="//span[text()=\"Conversation\"]")private WebElement conversation ;
		@FindBy(xpath="//span[text()=\"Groups\"]")private WebElement groups;
		@FindBy(xpath="//a[@href=\"http://live.retteralarm.de/admin/GroupChat/groupList\"]")private WebElement groupList;
		@FindBy(xpath="//button[@class=\"btn btn-success\"]")private WebElement createNewChatGroup;
		@FindBy(xpath = "//span[@id=\"select2-selectFiredepartment-container\"]")private WebElement fireDepartmentField;
		@FindBy(xpath = "//input[@placeholder=\"Please select firestation.\"]")private WebElement fireStationField;
	    @FindBy(xpath="//input[@placeholder=\"Please enter group name.\"]")private WebElement groupNameField ;
	    @FindBy(xpath = "//input[@id=\"inlineRadio1\"]")private WebElement userTypeAttribute;
		@FindBy(xpath="//input[@id=\"inlineRadio2\"]")private WebElement userTypeResource ;
		@FindBy(xpath = "//input[@id=\"inlineRadio3\"]")private WebElement userTypeFireFighter;
		@FindBy(xpath="//input[@id=\"inlineRadio4\"]")private WebElement userTypeAlarmLoop ;
	    
	    
	    
		
	    @FindBy(xpath="//button[@id=\"addSubmit\"]")private WebElement saveGroup;

	    
	    @FindBy(xpath="//a[@href=\"http://live.retteralarm.de/admin/GroupChat/index\"]")private WebElement groupConversation ;
	    @FindBy(xpath="//input [@placeholder=\"Search Group..\"]")private WebElement searchGroup;
	    @FindBy(xpath="(//a[@class=\"actionShowGroup\"])[1]")private WebElement charGroup;
	    @FindBy(xpath = "//input[@placeholder=\"Write your message...\"]")
		private WebElement writemessageField;
		@FindBy(xpath = "//button[@id=\"actionSendMessage\"]")
		private WebElement sendmessageButton;
		@FindBy(xpath = "(//i[@class=\"fa fa-user-plus\"])[4]")private WebElement extendAlarmButton;
		
		
		
	  @FindBy(xpath="//input[@id=\"selectCheckboxes\"]")private WebElement selectAll;
	  
	  
	 @FindBy(xpath="//input[@class=\"form-control input-sm\"]")private WebElement searchField;
	 @FindBy(xpath = "(//i[@class=\"fa fa-trash-o\"])[1]")private WebElement delete;
	 @FindBy(xpath = "//button[@id=\"delYes\"]")private WebElement deleteYes;
	 @FindBy(xpath="//input[@id=\"inlineRadio3\"]")private WebElement userTypeFirefighter;
	 
	 
	 @FindBy(xpath = "//input[@value=\"15429\"]") private WebElement ADST06A2;
	 @FindBy(xpath="//input[@value=\"3136\"]")private WebElement ADST06R2;
	 @FindBy(xpath = "//input[@value=\"22999\"]")private WebElement jonas2;
		@FindBy(xpath = "//input[@value=\"23001\"]")private WebElement jonas3;
		@FindBy(xpath="//input[@value=\"3497\"]")private WebElement ADST06AL2;
	 
	@FindBy(xpath="(//td[starts-with(text(),'BG-chatGroup')])[1]")private WebElement sm;
	// @FindBy(xpath="")private WebElement ;
	 // @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	

		public m_ChatGroup(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		
		
		public void commonForCreateGroup(WebDriver driver) 
		
		
		{
             conversation.click();
			 groups.click();
		}
		
		




		public void createGroupByAttribute(WebDriver driver, String date, String gCurrntTime) throws Throwable {
			Actions act = new Actions(driver);
            
			
			
			groupList.click();
		
			createNewChatGroup.click();
	
			fireDepartmentField.click();

			act.sendKeys("Andrew").build().perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			fireStationField.click();
	
			act.sendKeys("06").build().perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			groupNameField.click();
			act.sendKeys("BG-chatGroupByAttribute").sendKeys(date).sendKeys(gCurrntTime).build().perform();
		
			userTypeAttribute.click();
		
			ADST06A2.click();
			Thread.sleep(2000);
			saveGroup.click();
			Thread.sleep(5000);
			
			String ActualResult = sm.getText();
			
			String Expected = "BG-chatGroupByAttribute"+date+gCurrntTime;
			System.out.println(ActualResult);
			System.out.println(Expected);
			
			if (ActualResult.equals(Expected))
			{
				System.out.println("Chat group successfully created by attribute.");
			}
			else
			{
				System.out.println("The group was not created successfully.");
			}
			
			
			
			
		}
	
		
		public void createGroupByResource(WebDriver driver, String date, String gCurrntTime) throws Throwable {
			Actions act = new Actions(driver);
            
			
			
			groupList.click();
		
			createNewChatGroup.click();
	
			fireDepartmentField.click();

			act.sendKeys("Andrew").build().perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			fireStationField.click();
	
			act.sendKeys("06").build().perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			groupNameField.click();
			act.sendKeys("BG-chatGroupByResource").sendKeys(date).sendKeys(gCurrntTime).build().perform();
		
			userTypeResource.click();
		
			ADST06R2.click();
			Thread.sleep(2000);
			saveGroup.click();
			Thread.sleep(1000);
			
			
			
			String ActualResult = sm.getText();
			
			String Expected = "BG-chatGroupByResource"+date+gCurrntTime;
			System.out.println(ActualResult);
			System.out.println(Expected);
			
			if (ActualResult.equals(Expected))
			{
				System.out.println("Chat group successfully created by resopurce.");
			}
			else
			{
				System.out.println("The group was not created successfully.");
			}
			
		}
		
		public void createGroupByFirefighter(WebDriver driver, String date, String gCurrntTime) throws Throwable {
			Actions act = new Actions(driver);
            
			
			
			groupList.click();
		
			createNewChatGroup.click();
	
			fireDepartmentField.click();

			act.sendKeys("Andrew").build().perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			fireStationField.click();
	
			act.sendKeys("06").build().perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			groupNameField.click();
			act.sendKeys("BG-chatGroupByFirefighter").sendKeys(date).sendKeys(gCurrntTime).build().perform();
		
			userTypeFireFighter.click();
		
			jonas3.click();
			Thread.sleep(1000);
			jonas2.click();
			Thread.sleep(1000);
			saveGroup.click();
			Thread.sleep(1000);
			

			String ActualResult = sm.getText();
			
			String Expected = "BG-chatGroupByFirefighter"+date+gCurrntTime;
			System.out.println(ActualResult);
			System.out.println(Expected);
			
			if (ActualResult.equals(Expected))
			{
				System.out.println("Chat group successfully created by fire fighter.");
			}
			else
			{
				System.out.println("The group was not created successfully.");
			}
			
		}
		
		
		public void createGroupByAlarmLoop(WebDriver driver, String date, String gCurrntTime) throws Throwable {
			Actions act = new Actions(driver);
            
			
			
			groupList.click();
		
			createNewChatGroup.click();
	
			fireDepartmentField.click();

			act.sendKeys("Andrew").build().perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			fireStationField.click();
	
			act.sendKeys("06").build().perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			groupNameField.click();
			act.sendKeys("BG-chatGroupByAlarmLoop").sendKeys(date).sendKeys(gCurrntTime).build().perform();
		
			userTypeAlarmLoop.click();
		
			ADST06AL2.click();
			Thread.sleep(1000);
			saveGroup.click();
			Thread.sleep(1000);
			
			
            String ActualResult = sm.getText();
			
			String Expected = "BG-chatGroupByAlarmLoop"+date+gCurrntTime;
			System.out.println(ActualResult);
			System.out.println(Expected);
			
			if (ActualResult.equals(Expected))
			{
				System.out.println("Chat group successfully created by fire alarm loop.");
			}
			else
			{
				System.out.println("The group was not created successfully.");
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		public void sendMessageToGtoupByAttribute(WebDriver driver , String date, String gCurrntTime) throws Throwable
		{
			Actions act = new Actions(driver);
			
			
			groupConversation.click();
		
			searchGroup.click();
	
			act.sendKeys("BG-chatGroupByAttribute").sendKeys(date).sendKeys(gCurrntTime).build().perform();
			Thread.sleep(5000);
			charGroup.click();
		
			writemessageField.click();
		
			act.sendKeys("message-chat group created by attribute").build().perform();
			Thread.sleep(2000);
			sendmessageButton.click();
			driver.navigate().refresh();
			Thread.sleep(1000);
			
		}
		
		
		public void sendMessageToGtoupByResource(WebDriver driver , String date, String gCurrntTime) throws Throwable
		{
			Actions act = new Actions(driver);
			
			
			groupConversation.click();
		
			searchGroup.click();
	
			act.sendKeys("BG-chatGroupByResource").sendKeys(date).sendKeys(gCurrntTime).build().perform();
			Thread.sleep(5000);
			charGroup.click();
		
			writemessageField.click();
		
			act.sendKeys("message-chat group created by resource").build().perform();
			Thread.sleep(2000);
			sendmessageButton.click();
			driver.navigate().refresh();
			Thread.sleep(1000);
			
		}
		
		
		public void sendMessageToGtoupByFirefighter(WebDriver driver , String date, String gCurrntTime) throws Throwable
		{
			Actions act = new Actions(driver);
			
			
			groupConversation.click();
		
			searchGroup.click();
	
			act.sendKeys("BG-chatGroupByFirefighter").sendKeys(date).sendKeys(gCurrntTime).build().perform();
			Thread.sleep(5000);
			charGroup.click();
		
			writemessageField.click();
		
			act.sendKeys("message-chat group created by firefighter").build().perform();
			Thread.sleep(2000);
			sendmessageButton.click();
			driver.navigate().refresh();
			Thread.sleep(1000);
			
		}
		
		public void sendMessageToGtoupByAlarmLoop(WebDriver driver , String date, String gCurrntTime) throws Throwable
		{
			Actions act = new Actions(driver);
			
			
			groupConversation.click();
		
			searchGroup.click();
	
			act.sendKeys("BG-chatGroupByAlarmLoop").sendKeys(date).sendKeys(gCurrntTime).build().perform();
			Thread.sleep(5000);
			charGroup.click();
		
			writemessageField.click();
		
			act.sendKeys("message-chat group created by alarm loop.").build().perform();
			Thread.sleep(2000);
			sendmessageButton.click();
			driver.navigate().refresh();
			Thread.sleep(1000);
			
		}
		
		

		
		
		public void createNewChatGroupForNewFirefighter(WebDriver driver, String dateDDMMYY, String gTimeHHMM) throws Throwable 
		
		{
			Actions act = new Actions(driver);
			
			
			
			
			
			groupList.click();
		
			createNewChatGroup.click();
	
			fireDepartmentField.click();

			act.sendKeys("Andrew").build().perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			fireStationField.click();
	
			act.sendKeys("BG D1 station "+dateDDMMYY+gTimeHHMM).build().perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			groupNameField.click();
			act.sendKeys("BG").sendKeys(dateDDMMYY).sendKeys(gTimeHHMM).sendKeys("ChatGroup").build().perform();
		
			userTypeFirefighter.click();
			Thread.sleep(2000);
			
			selectAll.click();
			saveGroup.click();
			Thread.sleep(1000);
			
			
			
			
		}
	
		
		
		public void sendMessageToNewChatGroupForNewFirefighter(WebDriver driver , String dateDDMMYY, String gTimeHHMM) throws Throwable
		
		{
			Actions act = new Actions(driver);
			
			
			groupConversation.click();
		
			searchGroup.click();
	
			act.sendKeys("BG").sendKeys(dateDDMMYY).sendKeys(gTimeHHMM).sendKeys("ChatGroup").build().perform();
			Thread.sleep(5000);
			charGroup.click();
		
			writemessageField.click();
		
			act.sendKeys("message-chat group new users").build().perform();
			Thread.sleep(2000);
			sendmessageButton.click();
			driver.navigate().refresh();
			Thread.sleep(1000);
			
		}
		
		
		
		
		
       public void deleteChatGroup (WebDriver driver ) throws Throwable
		
		{
    	   Actions act = new Actions(driver);
    	   
    	   groupList.click();
    	   
    	   for (int i=1;i<=20;i++)
    	   {
    	   searchField.click();
    	   act.sendKeys("BG").build().perform();
    	   Thread.sleep(3000);
    	   delete.click();
   		
			deleteYes.click();
			Thread.sleep(2000);
			
			Reporter.log("Chat group number-" + i + " is deleted sucessfully.", true);
		
		driver.navigate().refresh();
		
    	   }
    	   
    	   
    	   
    	   
	  
	  
	 
	
		}
		


		
		

	
	
	
	

}
