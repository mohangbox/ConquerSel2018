package week4day2_Projects;

import org.testng.annotations.Test;

import methodTypes.Login;

public class Account_DeleteContactInformation extends Login{
	@Test
	public void DeleteContactInformations() throws InterruptedException {
		String pnum="9573892106";
		
		loginApp();
		click(locateElement("xpath", "//*[contains(text(), 'CRM/SFA')]"));
		click(locateElement("xpath", "//a[text()='Accounts']"));
		click(locateElement("xpath", "(//*[text()='Find Accounts'])[1]"));
		click(locateElement("xpath", "(//span[@class='x-tab-strip-text '])[2]"));		
		type(locateElement("xpath", "//input[@name='phoneNumber']"), pnum);
		click(locateElement("xpath", "(//*[text()='Find Accounts'])[3]"));
		String num = getText(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		
		click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		click(locateElement("xpath", "(//form[@name='deleteContactMechForm1'])/following::img[2]"));
		click(locateElement("xpath", "(//*[text()='Find Accounts'])[1]"));
		type(locateElement("xpath", "//input[@name='id']"), num);
		
		
		click(locateElement("xpath", "(//button[text()='Find Accounts'])"));
		click(locateElement("xpath", "//*[contains(text(), '"+num+"')]"));

		verifyPartialText(locateElement("xpath", "//*[text()[contains(.,'"+num+"')]]"), num);

		closeApp();		
	}
}