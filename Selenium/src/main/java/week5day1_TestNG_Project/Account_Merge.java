package week5day1_TestNG_Project;

import org.testng.annotations.Test;

public class Account_Merge extends LoginApp{
	@Test
	public void Merge_Accounts() throws InterruptedException {
		
		click(locateElement("xpath", "(//*[@for='crmsfa']/a)[1]"));
		click(locateElement("xpath", "//*[text()='Accounts']"));
		click(locateElement("xpath", "//a[text()='Merge Accounts']"));
		click(locateElement("xpath", "(//*[@alt='Lookup'])[1]"));
		
		switchToWindow(1);
		type(locateElement("xpath", "//input[@name='id']"), "10047");
		click(locateElement("xpath", "//button[text()='Find Accounts']"));
		Thread.sleep(1000);
		clickWithNoSnap(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a"));
		Thread.sleep(1000);
		
		switchToWindow(0);
		click(locateElement("xpath", "(//*[@alt='Lookup'])[2]"));
		
		switchToWindow(1);
		type(locateElement("xpath", "//input[@name='id']"), "10048");
		click(locateElement("xpath", "//button[text()='Find Accounts']"));
		Thread.sleep(1000);
		clickWithNoSnap(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a"));
		
		Thread.sleep(4000);
		switchToWindow(0);
		Thread.sleep(2000);
		clickWithNoSnap(locateElement("xpath", "//a[@class='buttonDangerous']"));
		Thread.sleep(1000);
		acceptAlert();
		Thread.sleep(1000);
		click(locateElement("xpath", "(//*[text()='Find Accounts'])[1]"));
		type(locateElement("xpath", "//input[@name='id']"), "10047");
		click(locateElement("xpath", "//button[text()='Find Accounts']"));
		verifyExactText(locateElement("xpath", "//*[text()='No records to display']"), "No records to display");
			
	}
}