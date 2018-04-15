//Write a program for Drag and Drop the element and move to original position again

package week4day1_Actions;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
@Test
public void LearnDargAndDrop() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://jqueryui.com/droppable/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.switchTo().frame(0);
	
	WebElement source = driver.findElementByXPath("//div[@id='draggable']");
	WebElement target = driver.findElementByXPath("//div[@id='droppable']");
	
	int x1 = source.getLocation().getX();
	int y1 = source.getLocation().getY();
	System.out.println("X1 : "+x1 + " Y1 : "+y1);
	
	int x2 = target.getLocation().getX();
	int y2 = target.getLocation().getY();
	System.out.println("X2 : "+x2 + " Y2 : "+y2);
	
	Actions builder = new Actions(driver);
	builder.clickAndHold(source).moveToElement(target).release().perform();
	Thread.sleep(4000);
	
	builder.clickAndHold(source).moveToElement(source, (x2-x1), (y2-y1)).perform();
	
	int x3 = source.getLocation().getX();
	int y3 = source.getLocation().getY();
	System.out.println("X3 : "+x3 + " Y3 : "+y3);
	
	Thread.sleep(3000);
	driver.quit();
	}
}
