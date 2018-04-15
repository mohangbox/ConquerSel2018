package week5day1_TestNG_Project;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import methodTypes.SeMethods;

public class LoginApp extends SeMethods{
	
	@BeforeMethod
 public void loginApp() throws InterruptedException {
	 	startApp("chrome", "http://leaftaps.com/opentaps/control/main");
	 	type(locateElement("id", "username"), "DemoSalesManager");
		type(locateElement("id", "password"), "crmsfa");
		click(locateElement("class", "decorativeSubmit"));
 }	
	@AfterMethod
 public void closeApp() throws InterruptedException {
	 closeBrowser();
 	}
 }
