package week2day1_Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ElementByLinkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.calculator.net/college-cost-calculator.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByLinkText("Budget Calculator").click();
		
		//driver.findElement(By.linkText("Budget Calculator")).click();
		
		//HTML TAG
		//<a href="/budget-calculator.html">Budget Calculator</a>
		
		Thread.sleep(3000);
		driver.quit();
	}
}