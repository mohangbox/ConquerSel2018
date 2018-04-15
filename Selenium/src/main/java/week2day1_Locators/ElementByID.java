package week2day1_Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ElementByID {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Locator by id
		driver.findElementById("lst-ib").sendKeys("Hello. Learning Locator by ID");
		//driver.findElement(By.id("lst-ib")).sendKeys("Hello. Learning Locator by ID");
		
//		
//		<input class="gsfi" id="lst-ib" maxlength="2048" name="q" autocomplete="off" 
//		title="Search" type="text" value="" aria-label="Search" aria-haspopup="false" 
//		role="combobox" aria-autocomplete="list" dir="ltr" spellcheck="false" 
//		style="border: none; padding: 0px; margin: 0px; height: auto; width: 100%; background: url(&quot;data:image/gif;base64,R0lGODlhAQABAID/AMDAwAAAACH5BAEAAAAALAAAAAABAAEAAAICRAEAOw%3D%3D&quot;) transparent; position: absolute; z-index: 6; left: 0px; outline: none;">
		
		Thread.sleep(3000);
		driver.quit();
	}
}