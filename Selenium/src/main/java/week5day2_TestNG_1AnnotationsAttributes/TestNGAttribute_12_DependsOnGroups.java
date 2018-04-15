package week5day2_TestNG_1AnnotationsAttributes;

import org.testng.annotations.Test;

public class TestNGAttribute_12_DependsOnGroups
{
    @Test(dependsOnGroups = {"test-group"}) //The list of groups this method depends on.
    public void groupe1() {
        System.out.println("Group Test method 1");
    }
 
    @Test(groups = {"test-group1"})
    public void group2() {
        System.out.println("Group test method 2");
    }
 
    @Test(groups = {"test-group"})
    public void group3() {
        System.out.println("Group Test method 3");
    }
}