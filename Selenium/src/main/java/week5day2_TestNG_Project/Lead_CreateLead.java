package week5day2_TestNG_Project;

import org.testng.annotations.Test;
import methodTypes.Login;

public class Lead_CreateLead extends Login {

	@Test(groups = { "smoke" })
	public void createLead() throws InterruptedException {
		loginApp();
		click(locateElement("xpath", "//*[contains(text(), 'CRM/SFA')]"));
		click(locateElement("linkText", "Leads"));
		click(locateElement("linkText", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), "TestLeaf");
		type(locateElement("id", "createLeadForm_firstName"), "Gopinath");
		type(locateElement("id", "createLeadForm_lastName"), "Jayakumar");
		type(locateElement("id", "createLeadForm_primaryEmail"), "gopinath@testleaf.com");
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), "9597704568");
		click(locateElement("name", "submitButton"));
		closeApp();
	}
}
