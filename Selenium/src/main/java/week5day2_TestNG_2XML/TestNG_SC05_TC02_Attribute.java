package week5day2_TestNG_2XML;

import org.testng.AssertJUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_SC05_TC02_Attribute {

	@Test
	public void loadTestThisWebsite2() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		driver.get("https://www.facebook.com/");
		System.out.println("Page Title is " + driver.getTitle());
		AssertJUnit.assertEquals("Facebook – log in or sign up", driver.getTitle());
		driver.quit();
	}
}