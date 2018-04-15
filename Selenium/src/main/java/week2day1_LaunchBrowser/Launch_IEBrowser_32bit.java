package week2day1_LaunchBrowser;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launch_IEBrowser_32bit {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe"); // drivers folder is created under
																						// Eclipse, place
																						// IEDriverServer.exe file
		InternetExplorerDriver driver = new InternetExplorerDriver();				//IEDriver initialization & SEE SETUP STEPS
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElementByClassName("lst").sendKeys("Learning Selenium HQ");
		driver.findElementByClassName("lsb").click();

		Thread.sleep(3000);
		driver.quit();
		
//Open internet explorer.
//Navigate to Tools->Option
//Navigate to Security Tab
//Click on "Reset All Zones to Default level" button
//Now for all option like Internet,Intranet,Trusted Sites and Restricted Site enable "Enable Protected" mode check-box.
//Set IE zoom level to 100%
//then write below code in a java file and run

//System.setProperty("webdriver.ie.driver","path of your IE driver exe\IEDriverServer.exe");
//InternetExplorerDriver driver=new InternetExplorerDriver();
//driver.manage().window().maximize();
//Thread.Sleep(10100);
//driver.get("http://www.Google.com");


	}
}