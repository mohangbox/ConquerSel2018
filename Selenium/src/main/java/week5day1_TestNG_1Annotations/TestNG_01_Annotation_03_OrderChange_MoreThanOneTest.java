package week5day1_TestNG_1Annotations;

import org.testng.annotations.*;

public class TestNG_01_Annotation_03_OrderChange_MoreThanOneTest {
		
		@Test
		public void Test2() {
			System.out.println("	I am Class - Test Two");
		}	
		
		@Test
		public void Test1() {
			System.out.println("	I am Class - Test One");
		}
		
		@BeforeMethod
		public void BeforeMethod() {
			System.out.println("Before Method");
		}
		
		@Test
		public void Test0() {
			System.out.println("	I am Class - Test Zero");
		}
		
}