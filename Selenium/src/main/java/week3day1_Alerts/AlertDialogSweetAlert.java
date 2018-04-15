package week3day1_Alerts;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDialogSweetAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sweetalert.js.org/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
		Thread.sleep(3000);
		driver.quit();
	}
}