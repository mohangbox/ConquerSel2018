package week5day1_TestNG_1Annotations;

import org.testng.annotations.*;

public class TestNG_01_Annotation_01_OrderNormal {
		
		@BeforeSuite
		public void BeforeSuite() {
			System.out.println("Before Suite");
		}
		@BeforeTest
		public void BeforeTest() {
			System.out.println("Before Test");
		}	
		@BeforeClass
		public void BeforeClass() {
			System.out.println("Before Class");
		}	
		@BeforeMethod
		public void BeforeMethod() {
			System.out.println("Before Method");
		}	
		@Test
		public void Test() {
			System.out.println("Test");
		}	
		@AfterMethod
		public void AfterMethod() {
			System.out.println("After Method");
		}	
		@AfterClass
		public void AfterClass() {
			System.out.println("After Class");
		}
		@AfterTest
		public void AfterTest() {
			System.out.println("After Test");
		}	
		@AfterSuite
		public void AfterSuite() {
			System.out.println("After Suite");
		}	
		
}
