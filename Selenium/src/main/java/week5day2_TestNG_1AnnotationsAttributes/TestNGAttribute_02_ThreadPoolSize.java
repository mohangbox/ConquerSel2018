package week5day2_TestNG_1AnnotationsAttributes;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAttribute_02_ThreadPoolSize {

	@Test(invocationCount = 6, threadPoolSize=3)  //The size of the thread pool for this method. The method will be invoked from multiple threads as specified by invocationCount. 
											      //Note: this attribute is ignored if invocationCount is not specified. With thread pool, it will greatly decrease the running time of the test method.
	public void loadTestThisWebsite() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		driver.get("http://www.google.com");
		System.out.println("Page Title is " + driver.getTitle());
		Assert.assertEquals("Google", driver.getTitle());
		driver.quit();
	}
}