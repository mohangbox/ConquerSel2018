package week6day1_1Parameter;

import org.testng.annotations.Test;

import week6day1_1Parameter.Login;

public class Lead_CreateLead extends Login {

	@Test()
	public void createLead() throws InterruptedException {
		
		click(locateElement("xpath", "//*[contains(text(), 'CRM/SFA')]"));
		click(locateElement("linkText", "Leads"));
		click(locateElement("linkText", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), "TestLeaf");
		type(locateElement("id", "createLeadForm_firstName"), "Gopinath");
		type(locateElement("id", "createLeadForm_lastName"), "Jayakumar");
		type(locateElement("id", "createLeadForm_primaryEmail"), "gopinath@testleaf.com");
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), "9597704568");
		click(locateElement("name", "submitButton"));
		
	}
}
