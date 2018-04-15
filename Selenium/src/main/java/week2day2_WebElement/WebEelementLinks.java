package week2day2_WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebEelementLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List<WebElement> links = driver.findElementsByTagName("a");
		System.out.println("The total links are: "+links.size());
		
		System.out.println("The total links are : ");
		for (int i = 0; i < links.size(); i++) {
			System.out.println((i+1+". ")+links.get(i).getText());
		}
		
		Thread.sleep(3000);
		driver.quit();
	}
}