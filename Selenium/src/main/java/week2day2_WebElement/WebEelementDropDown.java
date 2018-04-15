package week2day2_WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebEelementDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Select by Visible Text
		WebElement source1 = driver.findElementById("selenium_commands");
		Select dropdown1 = new Select(source1);
		dropdown1.selectByVisibleText("Navigation Commands");
		Thread.sleep(1000);
				
		//Select by Index
		dropdown1.selectByIndex(4);
		Thread.sleep(1000);
				
		//deselect by Visible Text
		dropdown1.deselectByVisibleText("Navigation Commands");
		Thread.sleep(1000);
		
		//deselect by Index
		dropdown1.deselectByIndex(4);
		Thread.sleep(1000);		

		//Print all values
		List<WebElement> options = dropdown1.getOptions();
		int size = options.size();
		for (int i = 0; i < size; i++) {
			System.out.println(i+"- "+options.get(i).getText());
		}
		
		//http://output.jsbin.com/osebed/3
		
		//Select by Visible Text
		WebElement source = driver.findElementById("continents");
		Select dropDown = new Select(source);
		dropDown.selectByVisibleText("North America");
		Thread.sleep(500);

		//Select by Index
		dropDown.selectByIndex(0);
		Thread.sleep(500);
			
		//Print all the options for the selected drop down and select one option of your choice
		// Get the size of the Select element
		List<WebElement> oSize = dropDown.getOptions();
		int iListSize = oSize.size();
		 
		// Setting up the loop to print all the options
		for(int i =0; i < iListSize ; i++){
			System.out.println(i+". "+dropDown.getOptions().get(i).getText());
			// Putting a check on each option that if any of the option is equal to 'Africa" then select it 
				if(dropDown.getOptions().get(i).getText().equals("North America")){
					dropDown.selectByIndex(i);
					break;
					}
				}	 
		
		Thread.sleep(3000);
		driver.quit();
	}
}