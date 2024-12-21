package TestNG1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;


public class RegionalRegressionTestExample extends BaseClass {
	@Test(groups="smoke")
	public void campaignWithProductTest() throws Throwable 
		{
				String BROWSER = System.getProperty("browser");
				String URL = System.getProperty("url");
				System.out.println(BROWSER);
				System.out.println(URL);
				
				WebDriver driver=new FirefoxDriver();;
				
				driver.get(URL);
				}
}
	























