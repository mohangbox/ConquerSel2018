/*Launch the IRCTC, Click Contacts -->Switch to 2nd Window --> Print the title of the 2nd window & print the
Fax number --> close the 2nd window --> then enter the user id and password */

package week3day1_WindowHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//*[text()='Contact Us']").click();
		Set<String> allwindows = driver.getWindowHandles();
		List<String> listwin = new ArrayList<String>();
		listwin.addAll(allwindows);
		driver.switchTo().window(listwin.get(1));
		
		String faxNo = driver.findElementByXPath("//*[text()='011-23345400.']").getText();
		System.out.println(faxNo);
		driver.close();
		
		driver.switchTo().window(listwin.get(0));
		
		driver.findElementById("usernameId").sendKeys("mohangbox");
		driver.findElementByClassName("loginPassword").sendKeys("seerangan");
		
		Thread.sleep(3000);
		driver.quit();
	}
}