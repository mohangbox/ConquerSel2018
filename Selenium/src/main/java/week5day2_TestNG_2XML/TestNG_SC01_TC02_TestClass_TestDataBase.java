package week5day2_TestNG_2XML;

import org.testng.annotations.Test;

public class TestNG_SC01_TC02_TestClass_TestDataBase {

	@Test(groups = "db")
	public void testConnectOracle() {
		System.out.println("testConnectOracle()");
	}

	@Test(groups = "db")
	public void testConnectMsSQL() {
		System.out.println("testConnectMsSQL");
	}

	@Test(groups = "db-nosql")
	public void testConnectMongoDB() {
		System.out.println("testConnectMongoDB");
	}
	
	@Test(groups = "db-nosql")
	public void testConnectDB2() {
		System.out.println("testConnectDB2");
	}

	@Test(groups = { "db", "brokenTests" })
	public void testConnectMySQL() {
		System.out.println("testConnectMySQL");
	}

}