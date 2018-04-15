package week5day2_TestNG_1AnnotationsAttributes;

import org.testng.annotations.Test;

public class TestNGAttribute_05_Priority {

	@Test
	public void method5() {
		System.out.println("This is method Five");
	}
	
	@Test(priority = 0) // This command sets the priority of the test method. Lower priorities will be
						// scheduled first. Eg: @Test(priority =1 )
	public void method1() {
		System.out.println("This is method One");
	}

	@Test(priority = -2)
	public void method2() {
		System.out.println("This is method Two");
	}

	@Test(priority = 7)
	public void method4() {
		System.out.println("This is method Four");
	}

	@Test(priority = 2)
	public void method3() {
		System.out.println("This is method Three");
	}
}