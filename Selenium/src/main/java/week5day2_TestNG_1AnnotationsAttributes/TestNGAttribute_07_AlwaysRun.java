package week5day2_TestNG_1AnnotationsAttributes;

import org.testng.annotations.Test;

public class TestNGAttribute_07_AlwaysRun {

	@Test
	public void method1() {
		System.out.println("This is method 1");
	}

	@Test(alwaysRun = true)
	public void method2() {
		System.out.println("This is method 2");
	}

	@Test(alwaysRun = true)
	public void method12() {
		System.out.println("This is method 12");
	}

	@Test(alwaysRun = false)
	public void method8() {
		System.out.println("This is method 8");
	}

	@Test(alwaysRun = false)
	public void method3() {
		System.out.println("This is method 3");
	}

	@Test(priority = -5, alwaysRun = false)
	public void method6() {
		System.out.println("This is method 6");
	}

	@Test(priority = -15, alwaysRun = false)
	public void method7() {
		System.out.println("This is method 7");
	}

	@Test(priority = -15, alwaysRun = true)
	public void method9() {
		System.out.println("This is method 9");
	}

	@Test(priority = 12, alwaysRun = false)
	public void method5() {
		System.out.println("This is method 5");
	}

	@Test(priority = 6, alwaysRun = false)
	public void method10() {
		System.out.println("This is method 10");
	}

	@Test(priority = 10)
	public void method11() {
		System.out.println("This is method 11");
	}

	@Test(dependsOnMethods = { "method3" }, alwaysRun = true) // This is used when we want to make sure a method always
																// runs even if the parameters on which the method
																// depends, fails.
																// If set to true, this test method will always run. Eg:
																// @Test(alwaysRun = true)
	public void method4() {
		System.out.println("This is method 4: Always run is true");
	}
}