package week3day1_WebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS" + Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("TPJ" + Keys.TAB);
		
		WebElement tableElement = driver.findElementByXPath("//table[@class='DataTable TrainList']");
		List<WebElement> rows = tableElement.findElements(By.tagName("tr"));
		System.out.println("No of Trains :"+ rows.size());
		
		for(WebElement r : rows){
			List<WebElement> cells=r.findElements(By.tagName("td"));
			String trNum=cells.get(0).getText();
			if(trNum.equals("16127")){
				System.out.println("the train name is : "+cells.get(1).getText());
				break;
			}
	}
		Thread.sleep(3000);
		driver.quit();
	}
}