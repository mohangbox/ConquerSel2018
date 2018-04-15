package week2day1_Locators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementByTagName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> list=driver.findElementsByTagName("a");
		//List<WebElement> list=driver.findElements(By.tagName("a"));
		System.out.println("Number of links: "+list.size());
		
		//HTML TAG
		//<a class="gb_P" data-pid="23" href="https://mail.google.com/mail/?tab=wm">Gmail</a>
		Thread.sleep(3000);
		driver.quit();
	}
}