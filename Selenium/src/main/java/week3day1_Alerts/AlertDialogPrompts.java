package week3day1_Alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDialogPrompts {

	public static void main(String[] args) throws InterruptedException {
		String str1 ="Mohan";
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.switchTo().frame("iframeResult");
	driver.findElement(By.xpath("//*[text()='JavaScript Prompt']//following-sibling::button")).click();
	driver.switchTo().alert().sendKeys(str1);
	driver.switchTo().alert().accept();
	String str2 = driver.findElement(By.id("demo")).getText();
	System.out.println("The Comparision of both values are :"+str2.contains(str1));
	
	Thread.sleep(3000);
	driver.quit();
	}
}