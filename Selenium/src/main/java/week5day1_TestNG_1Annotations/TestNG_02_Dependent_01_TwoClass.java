package week5day1_TestNG_1Annotations;
import org.testng.annotations.Test;

public class TestNG_02_Dependent_01_TwoClass
{
    @Test(dependsOnMethods = { "testTwo" })
    public void testOne() {
        System.out.println("Test method one");
    }
 
    @Test
    public void testTwo() {
        System.out.println("Test method two");
    }
}