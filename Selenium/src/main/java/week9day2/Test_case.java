package week9day2;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test_case {

	@DataProvider(name = "dataFetch")
	public Object DataProvider_class() throws IOException {
		ReadExcel excel = new ReadExcel();
		Object[][] readExcelData = excel.ReadExcelData();
		return readExcelData;
	}

	@Test(dataProvider = "dataFetch")
	public void test(String cname, String keyword, String objectName, String objectType, String value)
			throws Exception {
		ChromeDriver webdriver = null;
		if (cname != null && cname.length() != 0) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			webdriver = new ChromeDriver();
			webdriver.manage().window().maximize();
			webdriver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		}
		System.out.println(cname);
		System.out.println(keyword);
		System.out.println(objectName);
		System.out.println(objectType);
		System.out.println(value);

		ReadObject object = new ReadObject();
		Properties allObjects = object.getObjectRepository();

		new UIOperation(webdriver).perform(allObjects, keyword, objectName, objectType, value);
	}
}