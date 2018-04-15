//Write a program for Selectable item1 & item4 in the page http://jqueryui.com/selectable/

package week4day1_Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/selectable/");
		
		driver.switchTo().frame(0);
		WebElement item1 = driver.findElementByXPath("//ol[@id='selectable']/li[1]");
		WebElement item4 = driver.findElementByXPath("//ol[@id='selectable']/li[4]");
	
		Actions builder = new Actions(driver);
		builder.keyDown(item1, Keys.CONTROL).click(item4).release().perform();
		
		Thread.sleep(10000);
		driver.quit();
	}
}