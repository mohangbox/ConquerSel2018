package week2day2_WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebEelementRadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementById("u_0_b").click();
		
		//isEnabled Method
		boolean enabled1 = driver.findElementById("u_0_b").isEnabled();
		System.out.println("Female button is enabled ==>> "+enabled1);
		boolean enabled2 = driver.findElementById("u_0_c").isEnabled();
		System.out.println("Male button is enabled ==>> "+enabled2);
		
		//isDisplayed Method
		boolean displayed1 = driver.findElementById("u_0_b").isDisplayed();
		System.out.println("Female button is displayed ==>> "+displayed1);
		boolean displayed2 = driver.findElementById("u_0_c").isEnabled();
		System.out.println("Male button is displayed ==>> "+displayed2);
		
		//isSelected Method
		boolean selected1 = driver.findElementById("u_0_b").isSelected();
		System.out.println("Female button is selected ==>> "+selected1);
		boolean selected2 = driver.findElementById("u_0_c").isSelected();
		System.out.println("Male button is selected ==>> "+selected2);
		
		driver.findElementById("u_0_c").click();
		System.out.println("The Female button is selected");
		
		boolean selected3 = driver.findElementById("u_0_b").isSelected();
		System.out.println("Female button is selected ==>> "+selected3);
		boolean selected4 = driver.findElementById("u_0_c").isSelected();
		System.out.println("Male button is selected ==>> "+selected4);
		
		Thread.sleep(3000);
		driver.quit();
	}
}