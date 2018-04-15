/* Example-1: 1.Access https://jqueryui.com/selectable, 
 * 2.Click “Item 3” 3.Click “Download” */
package week3day1_Frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class FrameWebElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//Example-1
		driver.get("https://jqueryui.com/selectable");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Enter into Frame & Click Item 3
		driver.switchTo().frame(driver.findElementByClassName("demo-frame")); //WebElement
		driver.findElementByXPath("//li[text()='Item 3']").click();
		
		//Come out of Frame
		driver.switchTo().defaultContent();
		
		//Click outside frame - Download
		driver.findElementByXPath("//a[text()='Download']").click();
		
		Thread.sleep(3000);
		driver.quit();
	}
}