package week2day1_Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/crmsfa/control/leadsMain");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByName("USERNAME").sendKeys("DemoSalesManager");
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		driver.findElementByXPath("/html/body/div[5]/div/div/div[1]/div/div[2]/form/table/tbody/tr[3]/td/input").click();
		driver.findElementByXPath("//*[@id='sectionHeaderTitle_leads']").click();
		driver.findElementByXPath("//div[@id='sectionHeaderTitle_leads']").click();		
		driver.findElementByXPath("//*[text()='Merge Leads']").click();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
