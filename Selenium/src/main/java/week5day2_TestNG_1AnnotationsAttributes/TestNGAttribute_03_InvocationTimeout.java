package week5day2_TestNG_1AnnotationsAttributes;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAttribute_03_InvocationTimeout {

	@Test(invocationCount=3, invocationTimeOut = 20000)  	//This refers to the maximum number of milliseconds a method should take for ALL the invocationCount to complete. 
															//This attribute will be ignored if invocationCount is not specified. Eg: @Test(invocationCount =3,invocationTimeOut = 20Sec )
	public void loadTestThisWebsite() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		driver.get("http://www.google.com");
		System.out.println("Page Title is " + driver.getTitle());
		Assert.assertEquals("Google", driver.getTitle());
		driver.quit();
	}
}