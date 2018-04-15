package week2day2_WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebEelementCheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://semantic-ui.com/modules/checkbox.html#/examples");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//label[text()='Checkbox']").click();
		driver.findElementByXPath("//label[text()='Radio']").click();
		
		driver.findElementByXPath("//label[text()='Fruits']").click();
		driver.findElementByXPath("//label[text()='Apple']").click();
		driver.findElementByXPath("//label[text()='Orange']").click();
		
		driver.findElementByXPath("//label[text()='Carrot']").click();
		
		boolean selected = driver.findElementByXPath("//label[text()='Disabled']").isSelected();
		if(selected!=true)
			System.out.println("The Checkbox is not Selected");
		
		boolean enabled = driver.findElementByXPath("//label[text()='Disabled']").isEnabled();
		if(enabled==true)
			System.out.println("The Checkbox is Enabled");
		
		boolean displayed = driver.findElementByXPath("//label[text()='Disabled']").isDisplayed();
		if(displayed!=true)
			System.out.println("The Checkbox is not Displayed");
		
		driver.findElementByXPath("//label[text()='1']").click();	
		driver.findElementByXPath("//label[text()='2']").click();	
		driver.findElementByXPath("//label[text()='3']").click();
		driver.findElementByXPath("//label[text()='4']").click();
		driver.findElementByXPath("//label[text()='5']").click();	
		driver.findElementByXPath("//label[text()='6']").click();			
		
		Thread.sleep(3000);
		driver.quit();
	}
}