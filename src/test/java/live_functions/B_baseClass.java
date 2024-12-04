package live_functions;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class B_baseClass {
	String branchName;
	String browserName;
	String psaaword;
	String BranchNameB; // live/testing/dev
//	String BranchNameB = "live"; // live/testing/dev

	WebDriver driver;
	String userName;
	String password;
	String deptName;
	String St1N;
	String info;
	String dailyVehicleEmailId1;
	String dailyVehicleEmailId2;
	String Station06Resource;
	String St1V1;
	String St1V2;
	String St2N;
	String st2V1;

	public void getBranchName() throws Throwable {

		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter the branch name
		System.out.print("Enter the branch name (live/testing/dev) : ");
		System.out.println();

		// Store the input in a variable
		branchName = scanner.nextLine();
		BranchNameB = branchName;
		System.out.print("please select browser- 1 for chrome, 2 for edge,3 for firefox : ");
		browserName = scanner.nextLine();

		System.out.print("Enter password: ");
		psaaword = scanner.nextLine();

		if (branchName != null && !branchName.isEmpty() && psaaword != null) {

			if (psaaword.equals("123456")) {
				System.out.println("password is correct");
			} else {
				System.out.println("password is worng");
				System.out.println("The Selenium script cannot continue because the branch name was not found.");

				System.exit(0);

			}

//			System.out.println("Branch name entered: " + branchName);
//			
//			if (browserName.equals(1) )
//			{
//			System.out.println("You are selected chrom browaser" );
//			}
//			
//			else if (browserName.equals(2) )
//			{
			
		
//			System.out.println("You are selected edge browaser" );
//			}
			// Check if the branch name is not null and not empty
//			else if (browserName.equals(3) )
//			{
//			System.out.println("You are selected fire fox browaser" );
//			}

		}
		else {
			System.out.println("You did not enter any branch name.");
			Thread.sleep(2000);
			System.out.println();
			System.out.println("The Selenium script cannot continue because the branch name was not found.");

			System.exit(0);
		}

		// Close the scanner
		scanner.close();

	}

	public void browserLounch() throws Throwable {

		if (browserName.equals("1")) {
			driver = new ChromeDriver();

		}

		else if (browserName.equals("2")) {
			driver = new EdgeDriver();

		}

		else if (browserName.equals("3")) {
			driver = new FirefoxDriver();

		}

//     
//		

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();

		File src = new File(".\\DetailsFile\\DetailsFile.xlsx");

		FileInputStream ipt = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(ipt);

		XSSFSheet sheet = wb.getSheetAt(0);

		if (BranchNameB.equals("live"))

		{
			System.out.println("Well come to RETTERAlarm Live branch.");
//	     	JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("alert( 'Well come to RETTERAlarm Live branch.');");
//			Thread.sleep(1000);

			String liveBranchUrl = sheet.getRow(1).getCell(1).getStringCellValue();
			driver.get(liveBranchUrl);

			userName = sheet.getRow(2).getCell(1).getStringCellValue();

			password = "123456";

			deptName = sheet.getRow(4).getCell(1).getStringCellValue();

			St1N = sheet.getRow(5).getCell(1).getStringCellValue();

			St1V1 = sheet.getRow(6).getCell(1).getStringCellValue();

			St1V2 = sheet.getRow(7).getCell(1).getStringCellValue();

			St2N = sheet.getRow(8).getCell(1).getStringCellValue();

			st2V1 = sheet.getRow(9).getCell(1).getStringCellValue();

			dailyVehicleEmailId1 = sheet.getRow(10).getCell(1).getStringCellValue();
			dailyVehicleEmailId2 = sheet.getRow(11).getCell(1).getStringCellValue();

		}

		else if (BranchNameB.equals("dev")) {

			System.out.println("Well come to RETTERAlarm Development branch.");
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("alert( 'Well come to RETTERAlarm Development branch.');");
//			Thread.sleep(1000);

			System.out.println("Well come to RETTERAlarm dev branch.");

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
