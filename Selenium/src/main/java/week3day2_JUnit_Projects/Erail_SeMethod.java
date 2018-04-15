package week3day2_JUnit_Projects;

import org.junit.Test;

import methodTypes.SeMethods;

public class Erail_SeMethod extends SeMethods {
	@Test
	public void windowHandles() throws InterruptedException {
		startApp("chrome", "https://erail.in/");
		typeTab(locateElement("id", "txtStationFrom"), "MAS");
		typeTab(locateElement("id", "txtStationTo"), "TPJ");
		
		Thread.sleep(3000);
		closeAllBrowsers();
	}
}