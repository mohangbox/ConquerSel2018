//Write a program for mouse over on the 'Electronics header' and click on the link (Apple) in the flipkat page
package week4day1_Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKartMouseOver1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElementByXPath("//*[text()='✕']").click();
		
		WebElement clc = driver.findElementByXPath("//*[text()='Electronics']");
		WebElement tar = driver.findElementByXPath("//*[text()='Apple']");
		
		Actions builder = new Actions(driver);
		builder.moveToElement(clc).perform();
		Thread.sleep(2000);
		builder.click(tar).perform();
		
		Thread.sleep(10000);
		driver.quit();
	}
}