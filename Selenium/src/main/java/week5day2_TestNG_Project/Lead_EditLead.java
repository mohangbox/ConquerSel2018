package week5day2_TestNG_Project;

import org.testng.annotations.Test;
import methodTypes.Login;

public class Lead_EditLead extends Login {

	@Test(groups = { "smoke" })
	public void createLead() throws InterruptedException {
		loginApp();
		click(locateElement("xpath", "//*[contains(text(), 'CRM/SFA')]"));
		click(locateElement("linkText", "Leads"));
		click(locateElement("linkText", "Find Leads"));
		type(locateElement("xpath", "(//input[@name='firstName'])[3]"), "Gopinath");
		click(locateElement("xpath", "//button[contains(text(),'Find Leads')]"));
		Thread.sleep(3000);
		click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		verifyTitle("View Lead | opentaps CRM");
		click(locateElement("xpath", "//a[contains(text(),'Edit')]"));
		selectDropDownUsingIndex(locateElement("id", "updateLeadForm_industryEnumId"), 5);
		click(locateElement("xpath", "//input[@class='smallSubmit']"));
		closeApp();
	}
}
