package week5day1_TestNG_1Annotations;
import org.testng.annotations.Test;

public class TestNG_02_Dependent_02_MultiClass
{
    @Test(dependsOnMethods = { "testTwo", "testThree" })
    public void testOne() {
        System.out.println("Test method one");
    }
 
    @Test
    public void testTwo() {
        System.out.println("Test method two");
    }
 
    @Test
    public void testThree() {
        System.out.println("Test method three");
    }
}