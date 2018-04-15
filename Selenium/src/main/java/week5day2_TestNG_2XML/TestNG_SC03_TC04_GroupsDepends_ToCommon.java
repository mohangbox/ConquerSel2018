package week5day2_TestNG_2XML;

import org.testng.annotations.Test;

public class TestNG_SC03_TC04_GroupsDepends_ToCommon {
	@Test(groups= {"smoke", "sanity"})
	public void Commom() {
		System.out.println("I am Common Test depends on smoke test and sanity test");
		
	}
}
