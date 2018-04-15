package week6day1_2DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import methodTypes.Login;

public class Lead_CreateLead extends Login {
	
	@DataProvider(name="dataFetch")
	public Object DataProvider_class() {
	
	Object [][] data = new Object[2][5];
	
	data[0][0]="TestLeaf";
	data[0][1]="Gopinath";
	data[0][2]="Jayakumar";
	data[0][3]="gopinath@testleaf.com";
	data[0][4]="9597704568";
	
	data[1][0]="TestLeaf";
	data[1][1]="Mohan";
	data[1][2]="S";
	data[1][3]="Mohan.S@testleaf.com";
	data[1][4]="9940174143";
	
	return data;
	
	}

	@Test(dataProvider="dataFetch")
	public void createLead(String cName, String fName, String lname, String email, String ph) throws InterruptedException {
		loginApp();
		click(locateElement("xpath", "//*[contains(text(), 'CRM/SFA')]"));
		click(locateElement("linkText", "Leads"));
		click(locateElement("linkText", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), cName);
		type(locateElement("id", "createLeadForm_firstName"), fName);
		type(locateElement("id", "createLeadForm_lastName"), lname);
		type(locateElement("id", "createLeadForm_primaryEmail"), email);
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), ph);
		click(locateElement("name", "submitButton"));
		closeApp();
	}
}
