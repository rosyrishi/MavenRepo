package Generic_Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import Object_Repo.LoginVtigerPage;
import Object_Repo.VtigerHomePage;

public class BaseClass {
	public WebDriver driver;
	public static WebDriver sdriver;

	@BeforeSuite(groups = {"smoke","Regression","sanity"})
	public void bs() {
		System.out.println("DataBase connection");
	}

	@BeforeTest(groups = {"smoke","Regression","sanity"})
	public void bt() {
		System.out.println("parallel execution");
	}
	//use for without parameter

//	@Parameters("BROWSER")
//	@BeforeClass(groups = {"smoke","Regression","sanity"})
//	public void bc() throws Throwable {
//		File_Utility flib = new File_Utility();
//		String BROWSER = flib.getKeyAndValuePair("Browser");
//
////	public void bc(String BROWSER ) throws Throwable
//	{
//		if (BROWSER.equalsIgnoreCase("chrome")) {
//			driver = new ChromeDriver();
//		} else if (BROWSER.equalsIgnoreCase("firefox")) {
//			driver = new FirefoxDriver();
//		} else if (BROWSER.equalsIgnoreCase("edge")) {
//			driver = new EdgeDriver();
//		} else {
//			driver = new ChromeDriver();
//		}
//		System.out.println("launching browser");
//		sdriver=driver;
//	}
//	}
//====================================================================
	
	// use for jenkin parameter
	
	@BeforeClass(groups = {"smoke","Regression","sanity"})
	public void bc() throws Throwable {
		//reading from cmd/Jenkins
		String BROWSER = System.getProperty("browser");
	
		if (BROWSER.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (BROWSER.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new ChromeDriver();
		}
		System.out.println("launching browser");
		sdriver=driver;
	}
//	//use for without parameter									 
//	@BeforeMethod
//	public void bm() throws Throwable {
//		System.out.println("login to application");
//		File_Utility flib = new File_Utility();
//		String URL = flib.getKeyAndValuePair("url");
//		String USERNAME = flib.getKeyAndValuePair("username");
//		String PASSWORD = flib.getKeyAndValuePair("password");
//		
//																				
//		driver.get(URL);
//
//		// using business logics
//		LoginVtigerPage login = new LoginVtigerPage(driver);
//		login.loginIntoVtiger(USERNAME, PASSWORD);
//
//		WebDriver_Utility wlib = new WebDriver_Utility();
//		wlib.maximizeWindow(driver);
//		wlib.implicitlyWait(driver);
//	}
	//=================================================================
	// use for jenkin parameter
	@BeforeMethod
	public void bm() throws Throwable {
		System.out.println("login to application");


		String URL = System.getProperty("url");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
																				
		driver.get(URL);

		// using business logics
		LoginVtigerPage login = new LoginVtigerPage(driver);
		login.loginIntoVtiger(USERNAME, PASSWORD);

		WebDriver_Utility wlib = new WebDriver_Utility();
		wlib.maximizeWindow(driver);
		wlib.implicitlyWait(driver);
	}

	@AfterMethod(groups = {"smoke","Regression","sanity"})
	public void am() {
		
		VtigerHomePage home = new VtigerHomePage(driver);
		home.logoutApp();
		System.out.println("logout from Application");

	}

	@AfterClass(groups = {"smoke","Regression","sanity"})
	public void ac() {

		driver.quit();
		System.out.println("close the browser");

	}

	@AfterTest(groups = {"smoke","Regression","sanity"})
	public void at() {
		System.out.println("close parallel execution");
	}

	@AfterSuite(groups = {"smoke","Regression","sanity"})
	public void as() {
		System.out.println("Data base close");
	}
}
