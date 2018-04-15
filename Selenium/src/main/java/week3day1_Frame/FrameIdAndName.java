/* Go to http://demo.guru99.com/test/guru99home/ 2. Switch to Frame 3.Click on image inside Frame */
package week3day1_Frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class FrameIdAndName {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
				
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Enter into Frame & Click image
		driver.switchTo().frame("a077aa5e"); //By ID or Name
		System.out.println("********We are switch to the iframe*******");
		driver.findElementByXPath("/html/body/a/img").click();
		System.out.println("*********We are done***************");
		
		//Come out of Frame
		driver.switchTo().defaultContent();
		System.out.println("*********We are Out of Frame***************");
		
		Thread.sleep(3000);
		driver.quit();
	}
}