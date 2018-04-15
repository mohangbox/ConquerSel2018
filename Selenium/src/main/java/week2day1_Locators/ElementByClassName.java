package week2day1_Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ElementByClassName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementsByClassName("date-header").clear();
		
		//driver.findElement(By.className("date-header"));
		
		//HTML TAG
		//<h2 class="date-header"><span>Sunday, 17 November 2013</span></h2>
		
		Thread.sleep(3000);
		driver.quit();
	}
}