package week5day2_TestNG_2XML;

import org.testng.annotations.Test;

public class TestNG_SC02_TC02_Groups_Sanity {
		@Test(groups= {"sanity"})
		public void Sanity() {
			System.out.println("I am Sanity Test");
			
		}
}