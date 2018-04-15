package week5day2_TestNG_1AnnotationsAttributes;
import org.testng.annotations.Test;

public class TestNGAttribute_08_ExpectedExceptions {
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void dividedByZeroExample1(){
		int e = 1/0;
		System.out.println("This is Expected exception method " + e);
	}
	
	@Test
	public void dividedByZeroExample2(){
		int e = 1/0;
		System.out.println("This is NOT Expected exception method " + e);
	}
}