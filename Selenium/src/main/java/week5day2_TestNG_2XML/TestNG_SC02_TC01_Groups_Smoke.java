package week5day2_TestNG_2XML;

import org.testng.annotations.Test;

public class TestNG_SC02_TC01_Groups_Smoke {
	@Test(groups= {"smoke"})
	public void Smoke() {
		System.out.println("I am Smoke Test");
		
	}
}