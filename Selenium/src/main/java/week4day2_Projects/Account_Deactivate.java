package week4day2_Projects;

import org.testng.annotations.Test;

import methodTypes.Login;

public class Account_Deactivate extends Login {
	@Test
	public void Deactivate_Account() throws InterruptedException {
		String title = "Account Details | opentaps CRM";
		String getTxt1 = "This account was deactivated";
		String getTxt2 = "No records to display";
		
		loginApp();
		click(locateElement("xpath", "(//*[@for='crmsfa']/a)[1]"));
		click(locateElement("xpath", "//*[text()='Accounts']"));
		click(locateElement("xpath", "(//*[text()='Find Accounts'])[1]"));
		type(locateElement("xpath", "(//input[@name='accountName'])[2]"), "TestLeafDemoJuno");
		//type(locateElement("xpath", "//input[@name='id']"), "11665");
		click(locateElement("xpath", "//button[text()='Find Accounts']"));
		getText(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a"));
		click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a"));
		verifyTitle(title);
		clickWithNoSnap(locateElement("xpath", "//a[@class='subMenuButtonDangerous']"));		
		getAlertText();
		acceptAlert();
		Thread.sleep(2000);
		verifyExactText(locateElement("xpath", "//span[@class='subSectionWarning']"), getTxt1);
		click(locateElement("xpath", "(//*[text()='Find Accounts'])[1]"));
		type(locateElement("xpath", "(//input[@name='accountName'])[2]"), "TestLeafDemoJuno");
		type(locateElement("xpath", "//input[@name='id']"), "10096");
		click(locateElement("xpath", "//button[text()='Find Accounts']"));
		verifyExactText(locateElement("xpath", "//*[text()='No records to display']"), getTxt2);

		closeApp();
	}
}