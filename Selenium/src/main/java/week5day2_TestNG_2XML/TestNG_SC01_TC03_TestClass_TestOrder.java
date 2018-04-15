package week5day2_TestNG_2XML;

import org.testng.annotations.Test;
 
public class TestNG_SC01_TC03_TestClass_TestOrder {
 
	@Test(groups={"orderBo", "save"})
	public void testMakeOrder() {  
	  System.out.println("testMakeOrder");
	}  
 
	@Test(groups={"orderBo", "save"})
	public void testMakeEmptyOrder() {  
	  System.out.println("testMakeEmptyOrder");
	}  
	
	@Test(groups="orderBo")
	public void testUpdateOrder() {  
		System.out.println("testUpdateOrder");
	}  
 
	@Test(groups="orderBo")
	public void testFindOrder() {  
		System.out.println("testFindOrder");
	}  
	
}