package week5day2_TestNG_2XML;

import org.testng.AssertJUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_SC05_TC01_Attribute {

	@Test
	public void loadTestThisWebsite1() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		driver.get("http://www.google.com");
		System.out.println("Page Title is " + driver.getTitle());
		AssertJUnit.assertEquals("Google", driver.getTitle());
		driver.quit();
	}
}