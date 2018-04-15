package week5day2_TestNG_1AnnotationsAttributes;

import org.testng.annotations.Test;

public class TestNGAttribute_06_DependsOnMethods {

	@Test
	public void method1() {
		System.out.println("This is method 1");
	}

	@Test(dependsOnMethods = { "method1", "method2"}) 
	public void method5() {
		System.out.println("This is method 5");
	}
	
	@Test(dependsOnMethods = { "method2" }) // This command is used to execute a method based on its dependent method.
	public void method3() {
		System.out.println("This is method 3");
	}

	@Test(dependsOnMethods = { "method1", "method3"}) 
	public void method4() {
		System.out.println("This is method 4");
	}
	
	@Test(dependsOnMethods = { "method1" }) 
	public void method2() {
		System.out.println("This is method 2");
	}
}