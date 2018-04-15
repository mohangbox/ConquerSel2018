package week5day2_TestNG_2XML;

import org.testng.AssertJUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_SC05_TC03_Attribute {

	@Test
	public void loadTestThisWebsite3() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		driver.get("https://www.seleniumhq.org/");
		System.out.println("Page Title is " + driver.getTitle());
		AssertJUnit.assertEquals("Selenium - Web Browser Automation", driver.getTitle());
		driver.quit();
	}
}