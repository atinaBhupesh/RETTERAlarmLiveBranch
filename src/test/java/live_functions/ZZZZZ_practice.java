package live_functions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZZZZZ_practice {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		driver.get("https://hub-dev.rescue.digital/register");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//div[text()=\"I accept the general terms and conditions\"]")).click();

		driver.manage().window().minimize();

		driver.manage().window().maximize();
		driver.navigate().refresh();

		driver.quit();

	}

}
