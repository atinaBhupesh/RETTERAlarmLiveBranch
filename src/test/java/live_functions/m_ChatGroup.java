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

public class m_ChatGroup extends  B_baseClass{
	
	
	
	
	
	
	    @FindBy(xpath="//span[text()=\"Conversation\"]")private WebElement conversation ;
		@FindBy(xpath="//span[text()=\"Groups\"]")private WebElement groups;
		@FindBy(xpath="//a[@href=\"http://live.retteralarm.de/admin/GroupChat/groupList\"]")private WebElement groupListL;
		@FindBy(xpath="//a[@href=\"http://testing.retteralarm.de/admin/GroupChat/groupList\"]")private WebElement groupListT;
		@FindBy(xpath="//a[@href=\"http://development.retteralarm.de/admin/GroupChat/groupList\"]")private WebElement groupListD;
		
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
	 
		@FindBy(xpath="(//td[starts-with(text(),'BG-chatGroup')])[1]")private WebElement sm;
		@FindBy(xpath="//td[contains(text(), 'BG')]")private List<WebElement> availableDataCount;
	 
//	 Live
	 @FindBy(xpath = "//input[@value=\"15429\"]") private WebElement ADST06A2;
	 @FindBy(xpath="//input[@value=\"3136\"]")private WebElement ADST06R2;
	 @FindBy(xpath = "//input[@value=\"22999\"]")private WebElement jonas2;
		@FindBy(xpath = "//input[@value=\"23001\"]")private WebElement jonas3;
		@FindBy(xpath="//input[@value=\"3497\"]")private WebElement ADST06AL2;
		
//		Testing
		
		@FindBy(xpath="//input[@value=\"2170\"]")private WebElement D1ST04A1;
		@FindBy(xpath="//input[@value=\"472\"]")private WebElement D1ST04R2;
		@FindBy(xpath="//input[@value=\"18952\"]")private WebElement bhupeshTest;
		@FindBy(xpath="//input[@value=\"476\"]")private WebElement D1ST04Esc;
		@FindBy(xpath="//input[@value=\"3078\"]")private WebElement D1ST5A1;
		@FindBy(xpath="//INPUT[@value=\"462\"]")private WebElement D1ST04AL1;
	 

	 // @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	

		public m_ChatGroup(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		
		
		public void commonForCreateGroup(WebDriver driver, String BranchNameB) 
		
		
		{
             conversation.click();
			 groups.click();
		}
		
		




		public void createGroupByAttribute(WebDriver driver, String date, String gCurrntTime, String deptName,String St1N, String BranchNameB) throws Throwable {
			Actions act = new Actions(driver);
            
			
			
		
			
			
			Thread.sleep(1000);
			
			
			if  (BranchNameB.equals("1"))
			{
				groupListL.click();
			}
			
			else if (BranchNameB.equals("2"))
			{
				groupListT.click();
			}
			
			else if (BranchNameB.equals("3"))
			{
				groupListD.click();
				
			}

		
			createNewChatGroup.click();
	
			fireDepartmentField.click();

			act.sendKeys(deptName).build().perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			fireStationField.click();
	
			act.sendKeys(St1N).build().perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			groupNameField.click();
			act.sendKeys("BG-chatGroupByAttribute").sendKeys(date).sendKeys(gCurrntTime).build().perform();
		
			userTypeAttribute.click();
			Thread.sleep(1000);
		
			
			
			
			switch (BranchNameB)
			{
			case "1":
			
					ADST06A2.click();
					break;
			case "2":
				
				D1ST04A1.click();
				break;
					
			
			
			
			}
			
			
			
			
			
			
			
			
			Thread.sleep(2000);
			saveGroup.click();
			Thread.sleep(5000);
			
			
			
			
			String ActualResult = sm.getText();
			
			String Expected = "BG-chatGroupByAttribute"+date+gCurrntTime;
			System.out.println(ActualResult);
			System.out.println(Expected);
			
			
			
			
			
			
		}
	
		
		public void createGroupByResource(WebDriver driver, String date, String gCurrntTime, String deptName,String St1N,String BranchNameB) throws Throwable {
			Actions act = new Actions(driver);
            
			
			
			Thread.sleep(1000);
			
			
			if  (BranchNameB.equals("1"))
			{
				groupListL.click();
			}
			
			else if (BranchNameB.equals("2"))
			{
				groupListT.click();
			}
			
			else if (BranchNameB.equals("3"))
			{
				groupListD.click();
				
			}
			
			
		
			createNewChatGroup.click();
	
			fireDepartmentField.click();

			act.sendKeys(deptName).build().perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			fireStationField.click();
	
			act.sendKeys(St1N).build().perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			groupNameField.click();
			act.sendKeys("BG-chatGroupByResource").sendKeys(date).sendKeys(gCurrntTime).build().perform();
		
			userTypeResource.click();
			Thread.sleep(1000);
			
			
			
			switch (BranchNameB)
			{
			case "1":
			
				ADST06R2.click();
					break;
			case "2":
				
				D1ST04R2.click();
				break;
					
			
			
			
			}
			
			
			
			
			
			
			
			
			
			Thread.sleep(2000);
			saveGroup.click();
			Thread.sleep(1000);
			
			
			
			String ActualResult = sm.getText();
			
			String Expected = "BG-chatGroupByResource"+date+gCurrntTime;
			System.out.println(ActualResult);
			System.out.println(Expected);
			
			
			
		}
		
		public void createGroupByFirefighter(WebDriver driver, String date, String gCurrntTime,String deptName,String St1N, String BranchNameB) throws Throwable {
			Actions act = new Actions(driver);
            
			
			
Thread.sleep(1000);
			
			
			if  (BranchNameB.equals("1"))
			{
				groupListL.click();
			}
			
			else if (BranchNameB.equals("2"))
			{
				groupListT.click();
			}
			
			else if (BranchNameB.equals("3"))
			{
				groupListD.click();
				
			}
		
			createNewChatGroup.click();
	
			fireDepartmentField.click();

			act.sendKeys(deptName).build().perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			fireStationField.click();
	
			act.sendKeys(St1N).build().perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			groupNameField.click();
			act.sendKeys("BG-chatGroupByFirefighter").sendKeys(date).sendKeys(gCurrntTime).build().perform();
		
			userTypeFireFighter.click();
			Thread.sleep(1000);
			
			
			
			switch (BranchNameB)
			{
			case "1":
			
				jonas3.click();
				Thread.sleep(1000);
				jonas2.click();
					break;
			case "2":
				
				bhupeshTest.click();
				break;
					
			
			
			
			}
			
			
			
			
			
			
			
			
			
			
			
			
			Thread.sleep(1000);
			saveGroup.click();
			Thread.sleep(1000);
			

			String ActualResult = sm.getText();
			
			String Expected = "BG-chatGroupByFirefighter"+date+gCurrntTime;
			System.out.println(ActualResult);
			System.out.println(Expected);
		
		}
		
		
		public void createGroupByAlarmLoop(WebDriver driver, String date, String gCurrntTime,String deptName,String St1N,String BranchNameB) throws Throwable {
			Actions act = new Actions(driver);
            
			
			
			Thread.sleep(1000);
			
			
			if  (BranchNameB.equals("1"))
			{
				groupListL.click();
			}
			
			else if (BranchNameB.equals("2"))
			{
				groupListT.click();
			}
			
			else if (BranchNameB.equals("3"))
			{
				groupListD.click();
				
			}
			createNewChatGroup.click();
	
			fireDepartmentField.click();

			act.sendKeys(deptName).build().perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			fireStationField.click();
	
			act.sendKeys(St1N).build().perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			groupNameField.click();
			act.sendKeys("BG-chatGroupByAlarmLoop").sendKeys(date).sendKeys(gCurrntTime).build().perform();
		
			userTypeAlarmLoop.click();
			Thread.sleep(1000);
			
			
			
		
			
			switch (BranchNameB)
			{
			case "1":
				ADST06AL2.click();
				break;
				
			case "2":
				D1ST04AL1.click();
				break;
				
				
			}
			
			
			
			
			
			
			
			
			
			
			Thread.sleep(1000);
			saveGroup.click();
			Thread.sleep(1000);
			
			
            String ActualResult = sm.getText();
			
			String Expected = "BG-chatGroupByAlarmLoop"+date+gCurrntTime;
			System.out.println(ActualResult);
			System.out.println(Expected);
			
		
			
		}
		
		
		
		
		
		
		
		
		
		
		public void sendMessageToGtoupByAttribute(WebDriver driver , String date, String gCurrntTime, String BranchNameB) throws Throwable
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
		
		
		public void sendMessageToGtoupByResource(WebDriver driver , String date, String gCurrntTime, String BranchNameB) throws Throwable
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
		
		
		public void sendMessageToGtoupByFirefighter(WebDriver driver , String date, String gCurrntTime, String BranchNameB) throws Throwable
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
		
		public void sendMessageToGtoupByAlarmLoop(WebDriver driver , String date, String gCurrntTime, String BranchNameB) throws Throwable
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
		
		

		
		
		public void createNewChatGroupForNewFirefighter(WebDriver driver, String dateDDMMYY, String gTimeHHMM,String BranchNameB) throws Throwable 
		
		{
			Actions act = new Actions(driver);
			
			
			
			
			
Thread.sleep(1000);
			
			
			if  (BranchNameB.equals("1"))
			{
				groupListL.click();
			}
			
			else if (BranchNameB.equals("2"))
			{
				groupListT.click();
			}
			
			else if (BranchNameB.equals("3"))
			{
				groupListD.click();
				
			}
		
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
	
		
		
		public void sendMessageToNewChatGroupForNewFirefighter(WebDriver driver , String dateDDMMYY, String gTimeHHMM, String BranchNameB) throws Throwable
		
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
		
		
		
		
		
       public void deleteChatGroup (WebDriver driver,String BranchNameB ) throws Throwable
		
		{
    	   Actions act = new Actions(driver);
    	   
    	   Thread.sleep(1000);
			
			
			if  (BranchNameB.equals("1"))
			{
				groupListL.click();
			}
			
			else if (BranchNameB.equals("2"))
			{
				groupListT.click();
			}
			
			else if (BranchNameB.equals("3"))
			{
				groupListD.click();
				
			}
    	   
    	
    	   
    	   int z=availableDataCount.size();
    	   
    		Reporter.log("The total available chat group count is-"+z+" in the list for delete.",true);
    	   
    	   for (int i=1;i<=z;i++)
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
