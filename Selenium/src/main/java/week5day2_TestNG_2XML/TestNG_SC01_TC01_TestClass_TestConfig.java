package week5day2_TestNG_2XML;

import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

//show the use of @BeforeSuite and @BeforeTest
public class TestNG_SC01_TC01_TestClass_TestConfig {

	@Test
	@BeforeSuite
	public void testBeforeSuite() {
		System.out.println("testBeforeSuite()");
	}

	@Test
	@AfterSuite
	public void testAfterSuite() {
		System.out.println("testAfterSuite()");
	}

	@Test
	@BeforeTest
	public void testBeforeTest() {
		System.out.println("testBeforeTest()");
	}

	@Test
	@AfterTest
	public void testAfterTest() {
		System.out.println("testAfterTest()");
	}

}