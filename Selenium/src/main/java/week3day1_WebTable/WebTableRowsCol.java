package week3day1_WebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableRowsCol {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS"+Keys.TAB);
		
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("TPJ"+Keys.TAB);
		
		WebElement tableElement = driver.findElementByXPath("//table[@class='DataTable TrainList']");
		List<WebElement> rows = tableElement.findElements(By.tagName("tr"));
		System.out.println("No of Trains :"+ rows.size());
		
		for(WebElement r: rows)
		{
			List<WebElement> cells=r.findElements(By.tagName("td"));
			if(cells !=null )
			System.out.println(cells.get(0).getText() +" - "+cells.get(1).getText());	
		}
		Thread.sleep(3000);
		driver.quit();
	}
}