package week2day1_Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ElementByPartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.calculator.net/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByPartialLinkText("Carbohydrate").click();
		
		//driver.findElement(By.partialLinkText("Carbohydrate")).click();

		//HTML TAG
		//<a href="/carbohydrate-calculator.html">Carbohydrate Calculator</a>
		Thread.sleep(3000);
		driver.quit();
	}
}