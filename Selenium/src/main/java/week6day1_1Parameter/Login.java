package week6day1_1Parameter;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import methodTypes.SeMethods;

public class Login extends SeMethods{
	
	@Parameters({"url", "userName", "password"})
	@BeforeMethod
 public void loginApp(String url, String userName, String password) throws InterruptedException {
	 	startApp("chrome", url);
	 	type(locateElement("id", "username"), userName);
		type(locateElement("id", "password"), password);
		click(locateElement("class", "decorativeSubmit"));
 }	
	@AfterMethod
 public void closeApp() throws InterruptedException {
	 closeBrowser();
 	}
 }
