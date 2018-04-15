package week5day2_TestNG_1AnnotationsAttributes;

import org.testng.annotations.Test;

public class TestNGAttribute_09_Enabled {

	@Test(enabled=true)		 //Whether methods on this class/method are enabled.												
	public void method1() {
		System.out.println("This is method 1");
	}
	
	@Test(enabled=false)
	public void method2() {
		System.out.println("This is method 2");
	}
	
	@Test(enabled=false)
	public void method4() {
		System.out.println("This is method 4");
	}
	@Test(enabled=true)
	public void method3() {
		System.out.println("This is method 3");
	}
}