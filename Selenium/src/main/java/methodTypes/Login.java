package methodTypes;

public class Login extends SeMethods{
 public void loginApp() throws InterruptedException {
	 	startApp("chrome", "http://leaftaps.com/opentaps/control/main");
	 	type(locateElement("id", "username"), "DemoSalesManager");
		type(locateElement("id", "password"), "crmsfa");
		click(locateElement("class", "decorativeSubmit"));
 }	
 public void closeApp() throws InterruptedException {
	 closeBrowser();
 	}
 }
