package week5day2_TestNG_1AnnotationsAttributes;

import org.testng.annotations.Test;

public class TestNGAttribute_13_DependsOnMethods {

	@Test(priority = 10, groups = { "login" })
	public void login() {
		System.out.println("I am login method");
	}

	@Test(priority = 20, dependsOnMethods = "login", groups = { "login" }) // This command is used to execute a method based on its dependent method. Eg: @Test (dependsOnMethods = { “OpenBrowser” ,”database is up” })
	public void verifyUserLogin() {
		System.out.println("I am verifyUserLogin method");
	}

	@Test(priority = 30, dependsOnMethods = "verifyUserLogin")
	public void navigateToReportSettings() {
		System.out.println("I am navigateToReportSettings method");
	}

	@Test(priority = 40, dependsOnMethods = "navigateToReportSettings")
	public void verifyGeneralSettings() {
		System.out.println("I am verifyGeneralSettings method");
	}

	@Test(priority = 40, dependsOnMethods = "navigateToReportSettings")
	public void verifyReportingPeriod() {
		System.out.println("I am verifyReportingPeriod method");
	}

	@Test(priority = 50, dependsOnMethods = "navigateToReportSettings", alwaysRun=true)
	public void saveReportSettings() {
		System.out.println("I am saveReportSettings method");
	}

	@Test(priority = 60, dependsOnGroups = "login")
	public void verifygroups() {
		System.out.println("I am verifygroups method");
	}
}