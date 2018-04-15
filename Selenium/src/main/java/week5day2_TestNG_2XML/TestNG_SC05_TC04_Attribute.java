package week5day2_TestNG_2XML;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_SC05_TC04_Attribute {

	@Test(timeOut = 20000) // The maximum number of milliseconds this test should take.
	public void loadTestThisWebsite1() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println("Page Title is " + driver.getTitle());
		Assert.assertEquals("Google", driver.getTitle());
		driver.quit();
	}

	@Test(invocationCount = 2, timeOut = 4000)
	public void loadTestThisWebsite2() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println("Page Title is " + driver.getTitle());
		Assert.assertEquals("Google", driver.getTitle());
		driver.quit();
	}
	
	@Test(invocationCount = 2, timeOut = 20000)
	public void loadTestThisWebsite3() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println("Page Title is " + driver.getTitle());
		Assert.assertEquals("Google", driver.getTitle());
		driver.quit();
	}
}