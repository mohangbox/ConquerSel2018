package week2day1_Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementByName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Locator by id
		//driver.findElementById("lst-ib").sendKeys("Hello. Learning Locator by ID");
		driver.findElement(By.id("lst-ib")).sendKeys("Hello. Learning Locator by ID");
		
		//Locator by name
		//driver.findElementByName("btnK").click();
		driver.findElement(By.name("btnK")).click();
		
//		<input value="Google Search" aria-label="Google Search" name="btnK" type="submit" 
//		jsaction="sf.chk">
		
		Thread.sleep(3000);
		driver.quit();
	}
}