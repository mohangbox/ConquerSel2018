package week6day1_5DataProviderExcel;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import methodTypes.Login;

public class Lead_CreateLead extends Login {

	@DataProvider(name = "dataFetch")
	public Object DataProvider_class() throws IOException {
		ReadExcel excel = new ReadExcel();
		Object[][] readExcelData = excel.ReadExcelData();
		return readExcelData;

	}

	@Test(dataProvider = "dataFetch")
	public void createLead(String cName, String fName, String lname, String email, String ph)
			throws InterruptedException {
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
