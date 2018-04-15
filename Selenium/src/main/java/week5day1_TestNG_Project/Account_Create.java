package week5day1_TestNG_Project;

import org.testng.annotations.Test;

public class Account_Create extends LoginApp{
	@Test
	public void Create_Accounts() throws InterruptedException {
		
		String str = "TestLeafDemoJunodtestet";
		
		click(locateElement("xpath", "//*[contains(text(), 'CRM/SFA')]"));
		click(locateElement("xpath", "//a[text()='Accounts']"));
		click(locateElement("xpath", "//a[text()='Create Account']"));
		type(locateElement("xpath", "//input[@id='accountName']"), str);
		selectDropDownUsingIndex(locateElement("xpath", "//select[@name='industryEnumId']"), 1);
		selectDropDownUsingText(locateElement("xpath", "//select[@name='currencyUomId']"), "INR");
		selectDropDownUsingIndex(locateElement("xpath", "//select[@name='dataSourceId']"), 4);
		selectDropDownUsingIndex(locateElement("xpath", "//select[@name='marketingCampaignId']"), 5);
		type(locateElement("xpath", "//input[@id='primaryPhoneNumber']"), "9573892106");
		type(locateElement("xpath", "//input[@id='generalCity']"), "Chennai");
		type(locateElement("xpath", "//input[@id='primaryEmail']"), "testleaf123@gmail.com");
		selectDropDownUsingVisibleText(locateElement("xpath", "//select[@id='generalCountryGeoId']"), "United States");
		selectDropDownUsingIndex(locateElement("xpath", "//select[@name='generalStateProvinceGeoId']"), 2);
		click(locateElement("xpath", "//input[@type='submit']"));
		String getText = getText(locateElement("xpath", "//*[contains(text(), '"+str+"')]"));
		String numberOnly= getText.replaceAll("[^0-9]", "");
		System.out.println("Convert text is  :"+numberOnly);
		
		click(locateElement("xpath", "//a[text()='Find Accounts']"));
		type(locateElement("xpath", "(//input[@name='accountName'])[2]"), str);
		type(locateElement("xpath", "//input[@name='id']"), numberOnly);
		click(locateElement("xpath", "//button[text()='Find Accounts']"));
		verifyPartialText(locateElement("xpath", "(//div[@class='x-grid3-body'])/div[1]"), numberOnly);
		
	}
}