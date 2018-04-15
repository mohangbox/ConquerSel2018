package week5day2_TestNG_1AnnotationsAttributes;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAttribute_01_InvocationCount {

	@Test(invocationCount = 3)  //This invocationCount determined how many times TestNG should run this test method.
	public void loadTestThisWebsite() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		driver.get("http://www.google.com");
		System.out.println("Page Title is " + driver.getTitle());
		Assert.assertEquals("Google", driver.getTitle());
		driver.quit();
	}
}