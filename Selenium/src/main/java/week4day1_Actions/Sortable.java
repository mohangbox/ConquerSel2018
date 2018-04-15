package week4day1_Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/sortable/");
		
		driver.switchTo().frame(0);
		WebElement item1 = driver.findElementByXPath("(//ul[@id='sortable'])/li[1]");
		WebElement item4 = driver.findElementByXPath("(//ul[@id='sortable'])/li[4]");
		
		int x = item4.getLocation().getX();
		int y = item4.getLocation().getY();
	
		Actions builder = new Actions(driver);
		builder.clickAndHold(item1).moveToElement(item4, x, y).release(item4).perform();
		
		Thread.sleep(10000);
		driver.quit();
	}
}