package live_functions;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.SkipException;

public class n_addUsers extends  B_baseClass {
	
	String newStationUser;
	
	 @FindBy(xpath="//span[text()=\"Administration\"]")private WebElement admin;
	 @FindBy(xpath="//span[text()=\"Manage Users\"]")private WebElement manageUsers;
	 @FindBy(xpath="//a[@href=\"http://live.retteralarm.de/admin/Users/index\"]")private WebElement listL ;
	 @FindBy(xpath="//a[@href=\"http://testing.retteralarm.de/admin/Users/index\"]")private WebElement listT ;
	 @FindBy(xpath="//a[@href=\"http://development.retteralarm.de/admin/Users/index\"]")private WebElement listD ;
	 
	 @FindBy(xpath="//button[@class=\"btn btn-success\"]")private WebElement createNew;
	 @FindBy(xpath="//input[@id=\"UserFirstName\"]")private WebElement userNameField;
     @FindBy(xpath="//input[@id=\"UserLastName\"]")private WebElement userLastNameField;
	
		 @FindBy(xpath="//input[@id=\"UserAlarmEmail\"]")private WebElement emailField;
		 @FindBy(xpath="//span[@id=\"select2-selectCountry-container\"]")private WebElement country;
		 @FindBy(xpath="//select [@id=\"select-alert-lang\"]")private WebElement selectLang;
		 @FindBy(xpath="//input[@id=\"UserPassword\"]")private WebElement userPasswordField;
		 @FindBy(xpath="//button[@id=\"actionAddSubmit\"]")private WebElement saveBasicDetails;
		 @FindBy(xpath="//input[@id=\"chkUsertypeFF\"]")private WebElement userFireFighter;
		 @FindBy(xpath="//input[@placeholder=\"Select Department\"]")private WebElement departmentField;
	     @FindBy(xpath="//span[@id=\"select2-ffSDepartmetnBox-container\"]")private WebElement mainDepartmentField;
		 @FindBy(xpath="(//input[@placeholder=\"Select Fire Station\"])[2]")private WebElement stationField;
		 
	
		 
		 
		 @FindBy(xpath="//button[@id=\"actionSubmit\"]")private WebElement saveUserRole;
		 @FindBy(xpath="//a[@id=\"specialshowdisplayviewgroup\"]")private WebElement specialGroupPermission;
		 @FindBy(xpath="//input[@id=\"additional_info\"]")private WebElement permssionAdditional_info;
		 @FindBy(xpath="//input[@id=\"avaibility_dashboard\"]")private WebElement permssionAvaibility_dashboard;
		 @FindBy(xpath="//input[@id=\"alarm_permission_in_app\"]")private WebElement permssionAlarm_permission_in_app;
		 @FindBy(xpath="//input[@id=\"select_all_special\"]")private WebElement selectAllPermission;
		 @FindBy(xpath="//div[@id=\"special_submit\"]")private WebElement updatespecialGroupPermission;
		 @FindBy(xpath="//button[@class=\"btn btn-green\"]")private WebElement permissionOk;
		 @FindBy(xpath="//button[@id=\"actionEditSubmit\"]")private WebElement savePermission;
	
		 @FindBy(xpath="//a[text()=\"Attributes\"]")private WebElement attributeTab;
		 @FindBy(xpath="//span[@id=\"select2-actionDepartment-container\"]")private WebElement atrriDepartmentField;
		 @FindBy(xpath="//input[@placeholder=\"Select Attribute\"]")private WebElement attributeFiled;
		@FindBy(xpath="//button[@id=\"addSubmit\"]")private WebElement saveAttribute;
		 @FindBy(xpath="//a[text()=\"Continue\"]")private WebElement atrriContinue;
		 
		 
		 @FindBy(xpath="//span[@class=\"select2-selection__placeholder\"]")private WebElement resourceDepartmentFiled;
		 @FindBy(xpath="//input[@placeholder=\"Please select firestation.\"]")private WebElement resourceStationFiled;
		@FindBy(xpath="//input[@placeholder=\"Please select resource.\"]")private WebElement resourceField;
		 @FindBy(xpath="//button[@id=\"addSubmit\"]")private WebElement saveResource;
		 @FindBy(xpath="	//input[@placeholder=\"Select Fire Station\"]")private WebElement stationField2;
		 
		 @FindBy(xpath="//a[text()=\"Finish\"]")private WebElement finishAddUserProcess;
		
		 
			@FindBy(xpath="//div[text()=\"Assign Firefighter\"]")private WebElement SaveBasicDetails;
	
	
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		 @FindBy(xpath="//a[@href=\"/admin/Users\"]")private WebElement userList;
		 
		 @FindBy(xpath="//input[@name=\"data[User][is_station]\"]")private WebElement userFireStation;
		 @FindBy(xpath="//span[@class=\"select2-selection__placeholder\"]")private WebElement departmerntFieldForStationUser;
		@FindBy(xpath="//input[@placeholder=\"Select Fire Station\"]")private WebElement stationFieldForStationUser;
			@FindBy(xpath="//button[@id=\"actionEditSubmit\"]")private WebElement saveStationUserPermission;
			 @FindBy(xpath="//div[@style=\"text-align: center; font-size: 22px;\"]")private WebElement StationUserName;
			// @FindBy(xpath="")private WebElement ;
			@FindBy(xpath="//td[contains(text(),'Roj')]")private List<WebElement> availabledatCount ;
		 
		 
		   @FindBy(xpath="//input[@aria-controls=\"actionUser\"]")private WebElement searchField ;
		    @FindBy(xpath="//button[@id=\"dt_actionSearch\"]")private WebElement searchButton;
			 @FindBy(xpath="(//i[@class=\"fa fa-trash-o\"])[1]")private WebElement deleteUser1;
			 @FindBy(xpath="//button[text()=\"Remove\"]")private WebElement remove;
			 @FindBy(xpath="//button[text()=\"Yes, Please\"]")private WebElement yesPlease;
			
			 
			 @FindBy(xpath="//label[@id=\"UserAlarmEmail-error\"]")private WebElement userError;
			//label[@id="UserAlarmEmail-error"]

		public n_addUsers(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		public void commonForAddUers (WebDriver driver, String BranchNameB) throws Throwable
		{
            admin.click();
			
			manageUsers.click();
		
			
			
			
			Thread.sleep(1000);
			
			
			if  (BranchNameB.equals("1"))
			{
				listL.click();
			}
			
			else if (BranchNameB.equals("2"))
			{
				listT.click();
			}
			
			else if (BranchNameB.equals("3"))
			{
				listD.click();
				
			}
			
		}
		
		
		public void addStationUserForStation06 (WebDriver driver,String dateDDMMYY,String gTimeHHMM, String deptName,String St1N,String stUEmail, String BranchNameB) throws Throwable
		{
			Actions act = new Actions(driver);
			
		
			
			createNew.click();
			Thread.sleep(1000);
            emailField.click();
            Thread.sleep(1000);
			act.sendKeys(stUEmail).perform();
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);
		
			
			
			
		if (userError.isDisplayed()) {
			System.out.println();
			System.out.println(">>>>Skipping test: User already exists in another station.<<<<<");
		    throw new SkipException("Skipping test: User already exists in another station.");
		}
			
			
		else {	
			
		Thread.sleep(4000);		
		saveBasicDetails.click();
		
		if (SaveBasicDetails.isDisplayed())
		{
			Reporter.log("Users basic detailas save successfully.",true );
		}
		
		else 
		
		{
			Reporter.log("Users basic detailas not save.",true );
		}
		
		
	
		
		Thread.sleep(2000);	
		
		userFireStation.click();
		Thread.sleep(2000);		
		
		departmerntFieldForStationUser.click();
		act.sendKeys(deptName).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
	
		stationFieldForStationUser.click();
		act.sendKeys(St1N).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		saveUserRole.click();
		
	
		Reporter.log("adding role save successfully.",true );
		
		
		saveStationUserPermission.click();
		
		
		
		
		
		
		
		
		
		
		Reporter.log("user details", true);
		Reporter.log("User first name > RojDev",true);
		Reporter.log("User last name > StUser1", true);
		Reporter.log("User mail id > "+stUEmail,  true);
		Reporter.log("  ", true);
		
		
		//userList.click();
		Thread.sleep(2000);driver.navigate().refresh();
		}
		
			

		}
		
		
		
		public void addMultyRoleUserForStation06 (WebDriver driver,String dateDDMMYY,String gTimeHHMM, String deptName,String St1N,String MRUserEmail, String BranchNameB) throws Throwable
		{
			Actions act = new Actions(driver);
			
		
			
			createNew.click();
			Thread.sleep(1000);
            emailField.click();
            Thread.sleep(1000);
			act.sendKeys(MRUserEmail).perform();
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);
		
			
				
				
			if (userError.isDisplayed()) {
				System.out.println();
				System.out.println(">>>>Skipping test: User already exists in another station.<<<<<");
			    throw new SkipException("Skipping test: User already exists in another station.");
			}
				
				
			else {			
		
			
		Thread.sleep(4000);		
		saveBasicDetails.click();
		
		if (SaveBasicDetails.isDisplayed())
		{
			Reporter.log("Users basic detailas save successfully.",true );
		}
		
		else 
		
		{
			Reporter.log("Users basic detailas not save.",true );
		}
		
		
		Thread.sleep(2000);	
		
		userFireStation.click();
		Thread.sleep(2000);		
		
		departmerntFieldForStationUser.click();
		act.sendKeys(deptName).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
	
		stationFieldForStationUser.click();
		act.sendKeys(St1N).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
	
		
	
	
		
		
		Thread.sleep(2000);	
		
		userFireFighter.click();
		
			
		Thread.sleep(2000);			
		departmentField.click();
		act.sendKeys(deptName).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		
		stationField2.click();
		act.sendKeys(St1N).perform();
//	    act.sendKeys(dateDDMMYY).sendKeys(gTimeHHMM).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		saveUserRole.click();
		
		Reporter.log("user role save successfully.",true );
		
		specialGroupPermission.click();
		permssionAdditional_info.click();
		Thread.sleep(500);
		permssionAvaibility_dashboard.click();
		Thread.sleep(500);
		permssionAlarm_permission_in_app.click();
		Thread.sleep(500);
		selectAllPermission.click();
		updatespecialGroupPermission.click();
		Thread.sleep(500);
		permissionOk.click();
		Thread.sleep(500);
		savePermission.click();
		
		Reporter.log("permission save successfully.",true );
		
		attributeTab.click();
		Thread.sleep(500);
		atrriDepartmentField.click();
		act.sendKeys(deptName).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		attributeFiled.click();
		Thread.sleep(2000);
		act.sendKeys(st1Atti).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		saveAttribute.click();
		
		
		atrriContinue.click();
		Reporter.log("adding atrribute successfully.",true );
		
		resourceDepartmentFiled.click();
		act.sendKeys(deptName).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		resourceStationFiled.click();
		act.sendKeys(St1N).perform();
//		act.sendKeys(dateDDMMYY).sendKeys(gTimeHHMM).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		resourceField.click();
		act.sendKeys(st1Recs).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(500);
		saveResource.click();
		Reporter.log("adding resource successfully.",true );
		
		
		finishAddUserProcess.click();
		
		
		
		Reporter.log("user details", true);
		Reporter.log("User first name > RojDev",true);
		Reporter.log("User last name > MRuser1", true);
		Reporter.log("User mail id > "+MRUserEmail,  true);
		Reporter.log("  ", true);
		
		
		//userList.click();
		Thread.sleep(2000);driver.navigate().refresh();
			
		
			

		}
		
		}
		
		
		
		
		
		public void addfireFighter1ForStation06 (WebDriver driver,String dateDDMMYY,String gTimeHHMM, String deptName,String St1N,String st1Atti,String st1Recs,	String ff1UEmail, String ff2UEmail, String BranchNameB) throws Throwable
		{
			Actions act = new Actions(driver);
			
			
			
				createNew.click();
				Thread.sleep(2000);
				emailField.click();
				
				
			act.sendKeys(ff1UEmail).perform();
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(2000);
			
		
				
//			
			
//			userNameField.click();
//			Thread.sleep(1000);
//			
//			act.sendKeys("ghatole").perform();
//			Thread.sleep(1000);
//			
//			
//			
//			
//	
//			userLastNameField.click();
//			Thread.sleep(1000);
//			
//			act.sendKeys("ff"+i).perform();
//			Thread.sleep(1000);
//			
//			
//
//			
//			country.click();
//	
//			
//			act.sendKeys("india").perform();
//			Thread.sleep(2000);
//			
//			act.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
//	
//			
//		Select se= new Select(selectLang);
//		se.selectByVisibleText("English");
//		
//		userPasswordField.click();
//		act.sendKeys("Qwerty@123").perform();
				
				
		
		saveBasicDetails.click();
		if (SaveBasicDetails.isDisplayed())
		{
			Reporter.log("Users basic detailas save successfully.",true );
		}
		
		else 
		
		{
			Reporter.log("Users basic detailas not save.",true );
		}
		
		
		Thread.sleep(2000);	
		
		userFireFighter.click();
		
			
		Thread.sleep(2000);			
		departmentField.click();
		act.sendKeys(deptName).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		mainDepartmentField.click();
		act.sendKeys(deptName).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		stationField.click();
		act.sendKeys(St1N).perform();
//	    act.sendKeys(dateDDMMYY).sendKeys(gTimeHHMM).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		saveUserRole.click();
		
		Reporter.log("user role save successfully.",true );
		
		specialGroupPermission.click();
		permssionAdditional_info.click();
		Thread.sleep(500);
		permssionAvaibility_dashboard.click();
		Thread.sleep(500);
		permssionAlarm_permission_in_app.click();
		Thread.sleep(500);
		selectAllPermission.click();
		updatespecialGroupPermission.click();
		Thread.sleep(500);
		permissionOk.click();
		Thread.sleep(500);
		savePermission.click();
		
		Reporter.log("permission save successfully.",true );
		
		attributeTab.click();
		Thread.sleep(500);
		atrriDepartmentField.click();
		act.sendKeys(deptName).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		attributeFiled.click();
		act.sendKeys(st1Atti).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		saveAttribute.click();
		
		
		atrriContinue.click();
		Reporter.log("adding atrribute successfully.",true );
		
		resourceDepartmentFiled.click();
		act.sendKeys(deptName).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		resourceStationFiled.click();
		act.sendKeys(St1N).perform();
//		act.sendKeys(dateDDMMYY).sendKeys(gTimeHHMM).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		resourceField.click();
		act.sendKeys(st1Recs).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(500);
		saveResource.click();
		Reporter.log("adding resource successfully.",true );
		
		
		finishAddUserProcess.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Reporter.log("user details", true);
		Reporter.log("User first name > RojDev",true);
		Reporter.log("User last name > FF1", true);
		
		
			Reporter.log("User mail id > "+ff1UEmail,  true);
			
	
			
	
		Reporter.log("  ", true);
		
		//userList.click();
		Thread.sleep(2000);driver.navigate().refresh();
			
		
		
			}
		
//			}

		
		
		public void addfireFighter2ForStation06 (WebDriver driver,String dateDDMMYY,String gTimeHHMM, String deptName,String St1N,String st1Atti,String st1Recs,	String ff1UEmail, String ff2UEmail, String BranchNameB) throws Throwable
		{
			Actions act = new Actions(driver);
			
		
			
				createNew.click();
				Thread.sleep(2000);
				emailField.click();
				
			
			
					act.sendKeys(ff2UEmail).perform();
					
				
				
			
				
			
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(3000);
			
			
			
			
//			userNameField.click();
//			Thread.sleep(1000);
//			
//			act.sendKeys("ghatole").perform();
//			Thread.sleep(1000);
//			
//			
//			
//			
//	
//			userLastNameField.click();
//			Thread.sleep(1000);
//			
//			act.sendKeys("ff"+i).perform();
//			Thread.sleep(1000);
//			
//			
//
//			
//			country.click();
//	
//			
//			act.sendKeys("india").perform();
//			Thread.sleep(2000);
//			
//			act.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
//	
//			
//		Select se= new Select(selectLang);
//		se.selectByVisibleText("English");
//		
//		userPasswordField.click();
//		act.sendKeys("Qwerty@123").perform();
		
		saveBasicDetails.click();
		Thread.sleep(4000);	
		
		if (SaveBasicDetails.isDisplayed())
		{
			Reporter.log("Users basic detailas save successfully.",true );
		}
		
		else 
		
		{
			Reporter.log("Users basic detailas not save.",true );
		}
		
		
		Thread.sleep(2000);	
		
		userFireFighter.click();
		
			
		Thread.sleep(2000);			
		departmentField.click();
		act.sendKeys(deptName).perform();
		Thread.sleep(2000);
		
		
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		mainDepartmentField.click();
		act.sendKeys(deptName).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		
		stationField.click();
		act.sendKeys(St1N).perform();
//	    act.sendKeys(dateDDMMYY).sendKeys(gTimeHHMM).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		saveUserRole.click();
		
		Reporter.log("user role save successfully.",true );
		
		specialGroupPermission.click();
		permssionAdditional_info.click();
		Thread.sleep(500);
		permssionAvaibility_dashboard.click();
		Thread.sleep(500);
		permssionAlarm_permission_in_app.click();
		Thread.sleep(500);
		selectAllPermission.click();
		updatespecialGroupPermission.click();
		Thread.sleep(500);
		permissionOk.click();
		Thread.sleep(500);
		savePermission.click();
		
		Reporter.log("permission save successfully.",true );
		
		attributeTab.click();
		Thread.sleep(500);
		atrriDepartmentField.click();
		act.sendKeys(deptName).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		attributeFiled.click();
		act.sendKeys(st1Atti).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		saveAttribute.click();
		
		
		atrriContinue.click();
		Reporter.log("adding atrribute successfully.",true );
		
		resourceDepartmentFiled.click();
		act.sendKeys(deptName).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		resourceStationFiled.click();
		act.sendKeys(St1N).perform();
//		act.sendKeys(dateDDMMYY).sendKeys(gTimeHHMM).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		resourceField.click();
		act.sendKeys(st1Recs).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(500);
		saveResource.click();
		Reporter.log("adding resource successfully.",true );
		
		
		finishAddUserProcess.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Reporter.log("user details", true);
		Reporter.log("User first name > RojDev",true);
		Reporter.log("User last name > FF1", true);
		
		
		
		
	
			Reporter.log("User mail id > "+ff2UEmail,  true);
			

		Reporter.log("  ", true);
		
		//userList.click();
		Thread.sleep(2000);driver.navigate().refresh();
			
			
		
			}

		
		
		
		
		
		
		
		
		
		
		
		
		public void deletfireFighter (WebDriver driver, String BranchNameB) throws Throwable
		{
			Actions act = new Actions(driver);
//			int z=availabledatCount.size();
//			Reporter.log("The available user cout is "+z+" in the list for delete",true );
		
			for (int i=1;i<=200;i++)
					{
			searchField.click();
			act.sendKeys("Roj").perform();
			Thread.sleep(2000);
			searchButton.click();
			Thread.sleep(2000);
			deleteUser1.click();
			Thread.sleep(2000);
			remove.click();
			Thread.sleep(5000);
			yesPlease.click();
			Thread.sleep(2000);
			Reporter.log("User number-" + i + " is deleted sucessfully.", true);
			
			driver.navigate().refresh();
			
					}
			
			
			
		}
		
		
}
