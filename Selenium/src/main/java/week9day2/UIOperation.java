package week9day2;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UIOperation {

	WebDriver driver = null;;

	public UIOperation(WebDriver driver) {
		this.driver = driver;
	}

	public void perform(Properties p, String operation, String objectName, String objectType, String value)
			throws Exception {
		System.out.println("");
		System.out.println(p);
		System.out.println(operation);
		System.out.println(objectName);
		System.out.println(objectType);
		System.out.println(value);
		switch (operation.toUpperCase()) {
		case "CLICK":
			// Perform click
			//driver.findElement(this.getObject(p, objectName, objectType)).click();
			System.out.println("Am Click ::----> " + p.getProperty(value));
			break;
		case "SETTEXT":
			// Set text on control
			//driver.findElement(this.getObject(p, objectName, objectType)).sendKeys(value);
			System.out.println("Am SetText ::----> " + p.getProperty(value));
			break;

		case "GOTOURL":
			// Get url of application
			//driver.get(p.getProperty(value));
			System.out.println("Am URL ::----> " + p.getProperty(value));
			break;
		case "GETTEXT":
			// Get text of an element
			driver.findElement(this.getObject(p, objectName, objectType)).getText();
			break;

		//default:
			//break;
		}
	}

	/**
	 * Find element BY using object type and value
	 * @param p
	 * @param objectName
	 * @param objectType
	 * @return
	 * @throws Exception
	 */

	private By getObject(Properties p, String objectName, String objectType) throws Exception {
		// Find by xpath
		if (objectType.equalsIgnoreCase("XPATH")) {

			return By.xpath(p.getProperty(objectName));
		}
		// find by class
		else if (objectType.equalsIgnoreCase("CLASSNAME")) {

			return By.className(p.getProperty(objectName));

		}
		// find by name
		else if (objectType.equalsIgnoreCase("NAME")) {

			return By.name(p.getProperty(objectName));

		}
		// Find by css
		else if (objectType.equalsIgnoreCase("CSS")) {

			return By.cssSelector(p.getProperty(objectName));

		}
		// find by link
		else if (objectType.equalsIgnoreCase("LINK")) {

			return By.linkText(p.getProperty(objectName));

		}
		// find by partial link
		else if (objectType.equalsIgnoreCase("PARTIALLINK")) {

			return By.partialLinkText(p.getProperty(objectName));

		} else {
			throw new Exception("Wrong object type");
		}
	}
}
