package week5day2_TestNG_2XML;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNG_SC04_TC01_Annotations_TestConfiguration {

	@BeforeSuite()
	public void beforeSuite() {
		System.out.println("@BeforeSuite");
	}

	@AfterSuite()
	public void afterSuite() {
		System.out.println("@AfterSuite");
	}

	@BeforeTest()
	public void beforeTest() {
		System.out.println("@BeforeTest");
	}

	@AfterTest()
	public void afterTest() {
		System.out.println("@AfterTest");
	}

}
