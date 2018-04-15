package week3day1_WindowHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleAndHandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");		
		ChromeDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://legacy.crystalcruises.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.findElementByLinkText("GUEST CHECK-IN").click();
		Set<String> allwindows = driver.getWindowHandles();
		List<String> winList = new ArrayList<String>();
		winList.addAll(allwindows);
		driver.switchTo().window(winList.get(1));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(winList.get(0));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		String handle= driver.getWindowHandle();
		System.out.println("Am window handle:");
		System.out.println(handle);
        
		System.out.println("Am window Handles:");
		for (String eachWindow : allwindows) {
		System.out.println(eachWindow);
		}	
		Thread.sleep(3000);
		driver.quit();
	}
}