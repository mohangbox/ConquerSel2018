package week5day2_TestNG_Project;

import org.testng.annotations.Test;
import methodTypes.Login;

public class Lead_MergeLead extends Login {

	@Test(groups = { "sanity" }, dependsOnGroups= {"smoke"})
	public void Merge_Leads() throws InterruptedException {
		
		loginApp();
		click(locateElement("xpath", "(//*[@id='button'][@class='crmsfa'])/a/img"));
		click(locateElement("xpath", "//a[text()='Leads']"));
		click(locateElement("xpath", "//a[text()='Merge Leads']"));
		click(locateElement("xpath", "//img[contains(@src,'/images/fieldlookup.gif')]"));
		switchToWindow(1);

		type(locateElement("xpath", "//input[@name='id']"), "10");
		click(locateElement("xpath", "//*[text()='Find Leads'][@class='x-btn-text']"));
		Thread.sleep(1000);

		clickWithNoSnap(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		switchToWindow(0);
		click(locateElement("xpath", "(//img[@alt='Lookup'])[2]"));
		switchToWindow(1);

		Thread.sleep(1000);
		type(locateElement("xpath", "//input[@name='id']"), "15");
		click(locateElement("xpath", "//button[text()='Find Leads']"));

		Thread.sleep(2000);
		clickWithNoSnap(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		switchToWindow(0);
		Thread.sleep(1000);
		clickWithNoSnap(locateElement("class", "buttonDangerous"));
		Thread.sleep(1000);
		acceptAlert();
		Thread.sleep(1000);
		click(locateElement("xpath", "//a[text()='Find Leads']"));
		type(locateElement("xpath", "//input[@name='id']"), "10");
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		
		closeApp();

	}
}