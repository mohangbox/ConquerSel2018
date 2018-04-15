package week3day2_JUnit_Projects;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lead_MergeLead_Normal_ {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElement(By.xpath("(//*[@id='button'][@class='crmsfa'])/a/img")).click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a[text()='Merge Leads']").click();
				
		driver.findElementByXPath("//img[contains(@src,'/images/fieldlookup.gif')][@alt='Lookup']").click();
		
		Set<String> windowHandles1 = driver.getWindowHandles();
		ArrayList<String> arrayList1 = new ArrayList<String>();
		arrayList1.addAll(windowHandles1);
		driver.switchTo().window(arrayList1.get(1));
		
		driver.findElementByXPath("//input[@name='id']").sendKeys("11");
		driver.findElementByXPath("//*[text()='Find Leads'][@class='x-btn-text']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a").click();
		
		driver.switchTo().window(arrayList1.get(0));
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		ArrayList<String> arrayList2 = new ArrayList<String>();
		arrayList2.addAll(windowHandles2);
		driver.switchTo().window(arrayList2.get(1));
		
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@name='id']").sendKeys("15");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(2000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a").click();
		driver.switchTo().window(arrayList2.get(0));
		driver.findElementByClassName("buttonDangerous").click();
		
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys("10");	
		driver.findElementByXPath("//button[text()='Find Leads']").click();

		Thread.sleep(3000);
		driver.quit();
	}
}