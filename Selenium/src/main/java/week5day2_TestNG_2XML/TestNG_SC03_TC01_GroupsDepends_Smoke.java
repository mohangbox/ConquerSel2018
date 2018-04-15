package week5day2_TestNG_2XML;

import org.testng.annotations.Test;

public class TestNG_SC03_TC01_GroupsDepends_Smoke {
	@Test(groups= {"smoke"})
	public void Smoke() {
		System.out.println("I am Smoke Test");
		
	}
}