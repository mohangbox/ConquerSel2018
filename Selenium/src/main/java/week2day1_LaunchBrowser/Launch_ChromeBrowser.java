package week2day1_LaunchBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_ChromeBrowser {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); // drivers folder is created under
																						// Eclipse, place
																						// chromedriver.exe file
		ChromeDriver driver = new ChromeDriver();			//Chrome driver initialization
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElementById("lst-ib").sendKeys("Hello. Learning Selenium HQ");
		driver.findElementByName("btnK").click();

		Thread.sleep(3000);
		driver.quit();
	}
}