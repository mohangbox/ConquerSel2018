package week3day1_Alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDialogConfirmation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//*[text()='JavaScript Confirm Box']//following-sibling::button")).click();
		String str1 = driver.switchTo().alert().getText();
		System.out.println("The alert text is --> " + str1);
		driver.switchTo().alert().accept();
		String printtxt1 = driver.findElement(By.xpath("//*[@id='demo']")).getText();
		System.out.println("The text is --> " + printtxt1);
		System.out.println("The given alert is accepted ");
		
		driver.findElement(By.xpath("//*[text()='JavaScript Confirm Box']//following-sibling::button")).click();
		driver.switchTo().alert().dismiss();
		String printtxt2 = driver.findElement(By.xpath("//*[@id='demo']")).getText();
		System.out.println("The text is --> " + printtxt2);
		System.out.println("The given alert is dismissed ");

		Thread.sleep(3000);
		driver.quit();
	}
}