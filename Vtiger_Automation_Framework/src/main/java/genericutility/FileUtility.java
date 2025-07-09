package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * @author Rashmipriya
 */
public class FileUtility {
	// We have to pass key as a parameter, because it will return value in String
	/**
	 * This method is used to read data from property file
	 * by taking key from the caller
	 * @param key
	 * @return String value
	 * @throws IOException
	 */
	public String getDataFromProperty(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/commondata.properties");
		Properties prop=new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}

}
