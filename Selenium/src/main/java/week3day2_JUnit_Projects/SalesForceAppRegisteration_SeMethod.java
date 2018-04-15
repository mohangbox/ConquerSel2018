package week3day2_JUnit_Projects;		
import org.junit.Test;

import methodTypes.SeMethods;

public class SalesForceAppRegisteration_SeMethod extends SeMethods{				
	@Test()
    public void SalesForceAppRegisters() throws InterruptedException{	
    	
		startApp("chrome", "https://developer.salesforce.com/");
		click(locateElement("xpath", "/html/body/div[4]/div/div/header/div[3]/div/div/div[1]/div[1]/div[1]/a"));
		type(locateElement("id", "first_name"), "Kumar");
		type(locateElement("id", "last_name"), "S");
		type(locateElement("id", "email"), "tester01@gmail.com");
		selectDropDownUsingText(locateElement("id", "job_role"), "Administrator");
		type(locateElement("id", "company"), "Testing Company");
		selectDropDownUsingText(locateElement("id", "country"), "IN");
		type(locateElement("id", "postal_code"), "600044");
		type(locateElement("id", "username"), "tester01@gmail.com");
		click(locateElement("xpath", "//*[@id=\'eula_container\']/label[1]"));
		click(locateElement("id", "submit_btn"));
		closeAllBrowsers();
    }
}