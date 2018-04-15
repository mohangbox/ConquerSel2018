package week5day2_TestNG_2XML;

import org.testng.annotations.Test;

public class TestNG_SC02_TC03_Groups_Regression {
	@Test(groups= {"regression"})
	public void Sanity() {
		System.out.println("I am Regression Test");
		
	}
}
