package week5day1_TestNG_1Annotations;
import org.testng.annotations.Test;

public class TestNG_03_Dependent_02_Inherited extends TestNG_03_Dependent_01_InheritedParentClass
{
    @Test(dependsOnMethods = { "testOne" })
    public void testThree() {
        System.out.println("Test three method in Inherited test");
    }
 
    @Test
    public void testFour() {
        System.out.println("Test four method in Inherited test");
    }
}