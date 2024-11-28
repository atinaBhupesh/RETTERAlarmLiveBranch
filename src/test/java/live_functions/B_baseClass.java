package live_functions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;



public class B_baseClass {
	
	String BranchNameB = "dev"; // live/testing/dev
	WebDriver driver;
	String userName;
	String password;
	String deptName;
	String St1N;
	String info;
	String vehicleEmailId;
	String Station06Resource;
	String St1V1;
	String St1V2;
	
	
	
	
	
	String branchName;
	
	
	
	
	
	
	  

	
	
//	public void getBranchName () throws Throwable
//	{
//		Scanner scanner = new Scanner(System.in);
//
//		// Prompt the user to enter the branch name
//		System.out.print("Enter the branch name (live/testing/dev) : ");
//		System.out.println();
//
//		// Store the input in a variable
//		branchName = scanner.nextLine();
//
//		// Check if the branch name is not null and not empty
//		if (branchName != null && !branchName.isEmpty()) {
//			System.out.println("Branch name entered: " + branchName);
//
//		}
//
//		else {
//			System.out.println("You did not enter any branch name.");
//			Thread.sleep(2000);
//			System.out.println();
//			System.out.println("The Selenium script cannot continue because the branch name was not found.");
//
//			System.exit(0);
//		}
//
//		// Close the scanner
//		scanner.close();
//		BranchNameB = branchName;
//	}

	
	public void browserLounch() throws Throwable {

		
		
	
		

//		 WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//      driver = new EdgeDriver();
//		driver = new FirefoxDriver();

	
		
		
		
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();

		File src = new File(".\\DetailsFile\\DetailsFile.xlsx");

		FileInputStream ipt = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(ipt);

		XSSFSheet sheet = wb.getSheetAt(0);
		
		
		
		if (BranchNameB.equals("live")) 
		
		{
			

			String liveBranchUrl = sheet.getRow(1).getCell(1).getStringCellValue();
			driver.get(liveBranchUrl);

			userName = sheet.getRow(2).getCell(1).getStringCellValue();

			password = "123456";

			deptName = sheet.getRow(4).getCell(1).getStringCellValue();

			St1N = sheet.getRow(5).getCell(1).getStringCellValue();
			
			St1V1 = sheet.getRow(6).getCell(1).getStringCellValue();
			
			St1V2 = sheet.getRow(7).getCell(1).getStringCellValue();

		}

		else if  (BranchNameB.equals("dev"))  {

			String devBranchUrl = sheet.getRow(1).getCell(3).getStringCellValue();
			driver.get(devBranchUrl);

			userName = sheet.getRow(2).getCell(3).getStringCellValue();

			password = sheet.getRow(3).getCell(3).getStringCellValue();

			deptName = sheet.getRow(4).getCell(3).getStringCellValue();

			St1N = sheet.getRow(5).getCell(3).getStringCellValue();
			
			St1V1 = sheet.getRow(6).getCell(3).getStringCellValue();
			
			St1V2 = sheet.getRow(7).getCell(3).getStringCellValue();

			
			

		}

		else {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("alert( 'Branch not found!!, now clossing the browser... ');");
			Thread.sleep(2000);
			Reporter.log("Branch not found!!", true);

			driver.quit();
		}

	}
	
	
	

}
