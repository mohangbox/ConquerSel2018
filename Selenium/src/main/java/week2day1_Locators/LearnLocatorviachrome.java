package week2day1_Locators;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnLocatorviachrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		//By id
		driver.findElementById("userRegistrationForm:userName").sendKeys("KANIPRABHU");
		driver.findElementById("userRegistrationForm:password").sendKeys("welcome");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("welcome");
		
		WebElement source = driver.findElementById("userRegistrationForm:securityQ");
		Select dd = new Select(source);
		dd.selectByVisibleText("What is your all time favorite sports team?");
		
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("chennai super kings");
		driver.findElementById("userRegistrationForm:firstName").sendKeys("KANI");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("PPRABHU");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("S");
	    driver.findElementById("userRegistrationForm:gender:0").click();
	    driver.findElementById("userRegistrationForm:maritalStatus:0").click();
	    //	driver.findElementByClassName("userRegistrationForm:gender").click();
		/*WebElement sex_find = driver.findElementByClassName("userRegistrationForm:gender");
		Select sex = new Select(sex_find);
		sex.selectByValue("M");
	    WebElement find_single = driver.findElementById("userRegistrationForm:maritalStatus");
		Select status = new Select(find_single);
		status.deselectByVisibleText("M");*/

		
		WebElement dob_DD = driver.findElementById("userRegistrationForm:dobDay");
		Select ddd = new Select(dob_DD);
		List<WebElement> options = ddd.getOptions();
		ddd.selectByIndex(options.size()-17);
		
		WebElement dobMonth = driver.findElementById("userRegistrationForm:dobMonth");
		Select dm = new Select(dobMonth);
		dm.selectByVisibleText("MAY");
		
		WebElement dateOfBirth = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select dy = new Select(dateOfBirth);
		dy.selectByValue("1989");		
		
		WebElement occupation = driver.findElementById("userRegistrationForm:occupation");
		Select occu = new Select(occupation);
		occu.selectByValue("2");
		
		driver.findElementById("userRegistrationForm:uidno").sendKeys("754246882400");
		driver.findElementById("userRegistrationForm:idno").sendKeys("CCXPK8524J");
		
		WebElement countries = driver.findElementById("userRegistrationForm:countries");
		Select cntry = new Select(countries);
		cntry.selectByValue("94");
		
		driver.findElementById("userRegistrationForm:email").sendKeys("fruitprabhu@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9976738877");
		
		WebElement nationalityId = driver.findElementById("userRegistrationForm:nationalityId");
		Select nid = new Select(nationalityId);
		nid.selectByVisibleText("India");
		
		driver.findElementById("userRegistrationForm:address").sendKeys("41/20 MMN FLATS");
		driver.findElementById("userRegistrationForm:street").sendKeys("MOHAMMED HUSSAIN STREET");
		driver.findElementById("userRegistrationForm:area").sendKeys("ROYAPETTAH");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("627808",Keys.TAB);
		Thread.sleep(2000);
		
		//CITY
		WebElement cityName = driver.findElementById("userRegistrationForm:cityName");
		Select city = new Select(cityName) ;
		city.selectByVisibleText("Tirunelveli");
		Thread.sleep(2000);
	
		//POST OFFICE
		WebElement postofficeName = driver.findElementById("userRegistrationForm:postofficeName");
		Select po = new Select(postofficeName) ;
		po.selectByVisibleText("Pethanadarpatti B.O");
		
		driver.findElementById("userRegistrationForm:landline").sendKeys("257276");		
		driver.findElementById("userRegistrationForm:resAndOff:0").click();
	}
}