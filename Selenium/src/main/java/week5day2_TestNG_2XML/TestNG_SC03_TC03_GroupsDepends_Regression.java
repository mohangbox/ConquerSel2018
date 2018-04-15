package week5day2_TestNG_2XML;

import org.testng.annotations.Test;

public class TestNG_SC03_TC03_GroupsDepends_Regression {
	@Test(groups= {"regression"}, dependsOnGroups= {"smoke", "sanity"})
	public void Regression() {
		System.out.println("I am Regression Test depends on smoke test and sanity test");
		
	}
}
