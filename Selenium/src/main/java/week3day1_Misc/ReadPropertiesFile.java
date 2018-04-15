package week3day1_Misc;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Test;

public class ReadPropertiesFile {

	@Test //Only Junit
	public void readPropertiesFile() {
		Properties prop = new Properties();
		try {

			InputStream input = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\main\\java\\week9day2\\object.properties");
			prop.load(input);
			System.out.println(prop.getProperty("url"));
			System.out.println(prop.getProperty("username"));
			System.out.println(prop.getProperty("password"));
			System.out.println(prop.getProperty("loginButton"));
			System.out.println(prop.getProperty("resetButton"));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}