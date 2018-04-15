package week3day1_Alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDialogSimple {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	driver.switchTo().frame("iframeResult");
	driver.findElement(By.xpath("//*[text()='JavaScript Alert']//following-sibling::button")).click();
	
	String str = driver.switchTo().alert().getText();
	System.out.println("The Alert Text is --> " + str);
	driver.switchTo().alert().accept();
	System.out.println("Simple Alert Dialog code is executed");
	
	Thread.sleep(3000);
	driver.quit();
	}
}