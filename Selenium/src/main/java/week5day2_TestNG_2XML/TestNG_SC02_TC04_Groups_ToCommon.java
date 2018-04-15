package week5day2_TestNG_2XML;

import org.testng.annotations.Test;

public class TestNG_SC02_TC04_Groups_ToCommon {
		@Test(groups= {"smoke", "sanity"})
		public void Common() {
			System.out.println("I am common to Sanity and Smoke Test");
			
		}
}