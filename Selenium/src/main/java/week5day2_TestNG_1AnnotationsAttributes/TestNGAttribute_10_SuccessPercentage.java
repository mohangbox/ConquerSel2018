package week5day2_TestNG_1AnnotationsAttributes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAttribute_10_SuccessPercentage {

	@Test
	public void test1() {
		System.out.println("I am in test 1  method and it will pass.");
	}

	@Test(expectedExceptions = RuntimeException.class)
	public void test2() {
		System.out.println("I am in test 2  method and it will fail.");
	}

	private int i = 0;
	@Test(successPercentage = 60, invocationCount = 5)	//The percentage of success expected from this method
	public void test3() {
		i++;
		System.out.println("test3 method, invocation count: " + i);
		if (i == 1 || i == 2) {
			System.out.println("Test 4 failed!");
			Assert.assertEquals(i, 8);
		}
	}

}