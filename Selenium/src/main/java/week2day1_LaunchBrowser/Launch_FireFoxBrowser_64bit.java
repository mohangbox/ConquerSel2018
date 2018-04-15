package week2day1_LaunchBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_FireFoxBrowser_64bit {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_64bit.exe"); // drivers folder is created under
																						// Eclipse, place
																						// geckodriver_64bit.exe file
		FirefoxDriver driver = new FirefoxDriver();				//FireFoxDriver initialization
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElementById("lst-ib").sendKeys("Hello. Learning Selenium HQ");
		driver.findElementByName("btnK").click();

		Thread.sleep(3000);
		driver.quit();
	}
}