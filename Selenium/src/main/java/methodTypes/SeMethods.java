package methodTypes;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods implements WdMethods {

	RemoteWebDriver driver = null;

	public void startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			// Maximize the browser
			driver.manage().window().maximize();
			// Load the URL
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("The browser is launched successfully");
		} catch (NullPointerException e) {
			System.err.println("Null Pointer Exeception");
			e.printStackTrace();
		} catch (WebDriverException e) {
			System.err.println("WebDriverException");
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println("Other Exception");
			e.printStackTrace();
		} finally {
			takeSnap();
		}
	}

	public WebElement locateElement(String locator, String locValue) throws InterruptedException {
		WebElement ele = null;
		try {
			switch (locator) {
			case "id":
				ele = driver.findElementById(locValue);
				break;
			case "name":
				ele = driver.findElementByName(locValue);
				break;
			case "class":
				ele = driver.findElementByClassName(locValue);
				break;
			case "tagName":
				ele = driver.findElementByTagName(locValue);
				break;
			case "linkText":
				ele = driver.findElementByLinkText(locValue);
				break;
			case "partialLinkText":
				ele = driver.findElementByPartialLinkText(locValue);
				break;
			case "xpath":
				ele = driver.findElementByXPath(locValue);
				break;
			case "cssSelector":
				ele = driver.findElementByCssSelector(locValue);
				break;
			}
		} catch (NoSuchElementException e) {
			System.err.println("No Such Element Exception");
			e.printStackTrace();
		} finally {
			takeSnap();
		}
		return ele;
	}

	public WebElement locateElement(String locValue) {
		return driver.findElementById(locValue);
	}

	public void type(WebElement ele, String data) {
		try {
			ele.clear();
			ele.sendKeys(data);
			System.out.println("The given value is entered: " + data);
		} catch (NoSuchElementException e) {
			System.err.println("NoSuchElementException");
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println("Exception");
			e.printStackTrace();
		} finally {
			takeSnap();
		}
	}

	public void typeTab(WebElement ele, String data) {
		try {
			ele.clear();
			ele.sendKeys(data, Keys.TAB);
			System.out.println("The given value is entered: " + data);
		} catch (NoSuchElementException e) {
			System.err.println("NoSuchElementException");
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println("Exception");
			e.printStackTrace();
		} finally {
			takeSnap();
		}
	}

	public void click(WebElement ele) {
		try {
			ele.click();
			System.out.println("The element is clicked successfully");
		} catch (NoSuchElementException e) {
			System.err.println("NoSuchElementException");
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println("Exception");
			e.printStackTrace();
		} finally {
			takeSnap();
		}

	}

	public void clickWithNoSnap(WebElement ele) {
		try {
			ele.click();
			//Thread.sleep(2000);
			System.out.println("The element is clicked successfully");
		} catch (NoSuchElementException e) {
			System.err.println("NoSuchElementException");
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println("Exception");
			e.printStackTrace();
		}
	}

	public String getText(WebElement ele) {
		System.out.println(ele.getText());
		return ele.getText();

	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		Select dropdown = new Select(ele);
		dropdown.selectByValue(value);
		System.out.println("The element is selected with" + value + " successfully");
		takeSnap();
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		Select dropdown = new Select(ele);
		dropdown.selectByIndex(index);
		System.out.println("The element is selected with" + index + " successfully");
		takeSnap();
	}

	public void selectDropDownUsingVisibleText(WebElement ele, String text) {
		Select dropdown = new Select(ele);
		dropdown.selectByVisibleText(text);
		System.out.println("The element is selected with " + text + " successfully");
		takeSnap();
	}

	public boolean verifyTitle(String expectedTitle) {
		if (driver.getTitle().contains(expectedTitle))
			System.out.println("Page title contains : " + expectedTitle);
		else
			System.out.println("Page title doesn't contains : " + expectedTitle);
		takeSnap();
		return false;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		if (ele.getText().equalsIgnoreCase(expectedText))
			System.out.println("The text is matched : " + expectedText);
		else
			System.out.println("The text doesn't matched : " + expectedText);
		takeSnap();
	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		if (ele.getText().contains(expectedText))
			System.out.println("The partial text is matched : " + expectedText);
		else
			System.out.println("The partial text doesn't matched : " + expectedText);
		takeSnap();
	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		if (ele.getAttribute(attribute).equalsIgnoreCase(value))
			System.out.println("The attribute is matched : " + attribute);
		else
			System.out.println("The attribute doesn't matched : " + attribute);
		takeSnap();
	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		if (ele.getAttribute(attribute).contains(value))
			System.out.println("The Partial attribute is matched : " + attribute);
		else
			System.out.println("The Partial attribute doesn't matched : " + attribute);
		takeSnap();
	}

	public void verifySelected(WebElement ele) {
		if (ele.isSelected() == true)
			System.out.println("The given " + ele + " text is selected");
		else
			System.out.println("The given " + ele + " text is not selected");
		takeSnap();
	}

	public void verifyDisplayed(WebElement ele) {
		if (ele.isDisplayed() == true)
			System.out.println("The given " + ele + " text is displayed");
		else
			System.out.println("The given " + ele + " text is not displayed");
		takeSnap();
	}

	public void switchToWindow(int index) throws InterruptedException {
		try {
			Set<String> allwindows = driver.getWindowHandles();
			List<String> winList = new ArrayList<String>();
			winList.addAll(allwindows);
			driver.switchTo().window(winList.get(index));
			System.out.println("The window is switch to :" + index);
		} catch (NoSuchWindowException e) {
			System.err.println("NoSuchWindowException");
			e.printStackTrace();
		} finally {
			//Thread.sleep(2000);
			takeSnap();
		}
	}

	public void switchToFrame(WebElement ele) {
		driver.switchTo().frame(ele);
		System.out.println("The frame is switch to :" + ele);
		takeSnap();
	}

	public void acceptAlert() {
		try {
			driver.switchTo().alert().accept();
			System.out.println("The alert is accepted");
		} catch (UnhandledAlertException e) {
			System.err.println("UnhandledAlertException");
			e.printStackTrace();
		} catch (NoAlertPresentException e) {
			System.err.println("NoAlertPresentException");
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println("Exception");
			e.printStackTrace();
		}
	}

	public void dismissAlert() {
		try {
			driver.switchTo().alert().dismiss();
			System.out.println("The alert is dismissed");
		} catch (UnhandledAlertException e) {
			System.err.println("UnhandledAlertException");
			e.printStackTrace();
		} catch (NoAlertPresentException e) {
			System.err.println("NoAlertPresentException");
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println("Exception");
			e.printStackTrace();
		}
	}

	public String getAlertText() {
		String text = driver.switchTo().alert().getText();
		System.out.println("The alert is dismissed");
		return text;
	}

	int i = 1;

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		File des = new File("./snaps/Img-" + i + "-" + timeStamp + ".png");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;
	}

	public void closeBrowser() throws InterruptedException {
		//Thread.sleep(5000);
		driver.close();
		System.out.println("The browser is closed");
	}

	public void closeAllBrowsers() throws InterruptedException {
		//Thread.sleep(5000);
		driver.quit();
		System.out.println("All the browsers are closed");
	}
	
	public void close() throws InterruptedException {
		//Thread.sleep(5000);
		
		System.out.println("All the browsers are closed");
	}
}