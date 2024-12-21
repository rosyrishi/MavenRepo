package Generic_Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class File_Utility {
	/**
	 * This methid is used to read data from properties file(External Resource)
	 * @author Rojalin
	 * @return
	 */
	public String getKeyAndValuePair(String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/VTiger.Properties");
		Properties pro =new Properties();
		pro.load(fis);
		String value =pro.getProperty(key);
		return value;
		
	}
	
	public String getKeyAndValuePairAmazon(String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/Amazon.properties");
		Properties pro =new Properties();
		pro.load(fis);
		String value =pro.getProperty(key);
		return value;
		
	}

}
