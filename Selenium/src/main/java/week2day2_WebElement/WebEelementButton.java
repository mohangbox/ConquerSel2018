package week2day2_WebElement;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebEelementButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.calculator.net/bmi-calculator.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//*[@id=\"content\"]/div[3]/div[2]/table[4]/tbody/tr/td[1]/input[2]").click();
		String BMI = driver.findElementByXPath("//*[@id=\"content\"]/div[4]/div/b").getText();		
		System.out.println(BMI);
		Thread.sleep(3000);
		driver.quit();
	}
}