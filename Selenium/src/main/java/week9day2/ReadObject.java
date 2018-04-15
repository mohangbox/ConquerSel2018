package week9day2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadObject {

	Properties p = new Properties();

	public Properties getObjectRepository() throws IOException{
		try {
			InputStream stream = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\week9day2\\object.properties");
			//load all objects
			p.load(stream);
			stream.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return p;
	}
}