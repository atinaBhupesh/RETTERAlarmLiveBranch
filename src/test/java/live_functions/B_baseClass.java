package live_functions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class B_baseClass {
	WebDriver driver;
	String  userName;
	String  password;
	String deptName;
	String stName1;
	String info;  
	String vehicleEmailId;
	String Station06Resource;
	


	
	public void browserLounch() throws Throwable {
		// WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
//      driver = new EdgeDriver();
//		driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		File src = new File (".\\DetailsFile\\DetailsFile.xlsx");

		FileInputStream ipt = new FileInputStream(src);

		XSSFWorkbook wb= new XSSFWorkbook (ipt); 

		XSSFSheet sheet = wb.getSheetAt(0);

	
	
				
		//driver.get("https://live.retteralarm.de/admin/users/login");
		
		driver.get(sheet.getRow(1).getCell(1).getStringCellValue());
			
		driver.manage().window().maximize();
		
		
		userName= sheet.getRow(2).getCell(1).getStringCellValue();
//		 System.out.println(userName);
//		 pw= sheet.getRow(4).getCell(1).getStringCellValue();
		 password="123456";
	
		 // department name 
		 
		 deptName=sheet.getRow(4).getCell(1).getStringCellValue();
//		 System.out.println( deptName);
		 
		 
		 // Station 1 name  
		 stName1=sheet.getRow(5).getCell(1).getStringCellValue();
//		 System.out.println( stName1);
		 
		 
		 info=sheet.getRow(5).getCell(1).getStringCellValue();
//		 System.out.println( info);
		
		 vehicleEmailId=sheet.getRow(7).getCell(1).getStringCellValue();
//		 System.out.println(vehicleEmailId);
		 
		 Station06Resource=sheet.getRow(8).getCell(1).getStringCellValue();
//		 System.out.println(Station06Resource);
		 
		 
		 System.out.println( info);
		
		
		
		

	}
	
	
	
	



}
