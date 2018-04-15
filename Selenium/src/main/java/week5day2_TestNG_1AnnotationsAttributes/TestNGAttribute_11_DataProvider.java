package week5day2_TestNG_1AnnotationsAttributes;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGAttribute_11_DataProvider {

	@DataProvider(name = "addMethodDataProvider")  //TestNG dataProvider is used to provide any data for parameterization. Eg. @Test(dataProvider = “Hello”).
	public Object[][] dataProvider() {
		return new Object[][] { { 2, 5, 7 }, { 3, 7, 10 }, { 4, 5, 9 } };
	}

	@Test(dataProvider = "addMethodDataProvider")
	public void testAddMethod(int a, int b, int result) {
		Calculator calculator = new Calculator();
		Assert.assertEquals(calculator.add(a, b), result);
	}

	public class Calculator {
		public int add(int a, int b) {
			return a + b;
		}
	}
}