package week4day2_Projects;

import org.testng.annotations.Test;

import methodTypes.Login;

public class Account_EditAndSave extends Login{
	@Test
	public void EditAndSave_Accounts() throws InterruptedException {
		String str1 = "TestLeafDemoJunodtestet";
		String str2 = "TestLeafDemoJunodtest";
		//String num="11653";
		
		loginApp();
		click(locateElement("xpath", "//*[contains(text(), 'CRM/SFA')]"));
		click(locateElement("xpath", "//a[text()='Accounts']"));
		click(locateElement("xpath", "(//*[text()='Find Accounts'])[1]"));
		//type(locateElement("xpath", "//input[@name='id']"), num);
		type(locateElement("xpath", "(//input[@name='accountName'])[2]"), str1);
		click(locateElement("xpath", "//button[text()='Find Accounts']"));
		click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a[1]"));
		getText(locateElement("xpath", "//div[text()='Account Details']"));
		click(locateElement("xpath", "//a[text()='Edit']"));
		type(locateElement("xpath", "//input[@id='accountName']"), str2);
		click(locateElement("xpath", "//input[@value='Save']"));
		verifyPartialText(locateElement("xpath", "//*[text()[contains(.,'"+str2+"')]]"), str2);
		
		closeApp();	
	}
}