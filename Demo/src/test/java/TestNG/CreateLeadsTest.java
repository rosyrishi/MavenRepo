package TestNG;

import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.Excel_Utility;
import Generic_Utilities.File_Utility;
import Generic_Utilities.Java_Utility;
import Generic_Utilities.WebDriver_Utility;
import Object_Repo.CreateLeadPage;
import Object_Repo.LeadDetailedPage;
import Object_Repo.LeadValidationPage;
import Object_Repo.VtigerHomePage;


public class CreateLeadsTest  extends BaseClass{
	@Test
	public void CreateLeadsTest1() throws Throwable {
		File_Utility fileb = new File_Utility();
		WebDriver_Utility wlib = new WebDriver_Utility();
		Excel_Utility elib = new Excel_Utility();
		Java_Utility jlib = new Java_Utility();
		
//		String URL = fileb.getKeyAndValuePair("url");
//		String UN=fileb.getKeyAndValuePair("username");
//		String PW=fileb.getKeyAndValuePair("password");
//
//		c.get(URL);
//			
//		//using business logics
//		LoginVtigerPage login=new LoginVtigerPage(c);
//		login.loginIntoVtiger(UN,PW);
//
//		wlib.maximizeWindow(c);
//		wlib.implicitlyWait(c);

//		c.findElement(By.name("user_name")).sendKeys(UN);
//		c.findElement(By.name("user_password")).sendKeys(PW);
//		c.findElement(By.id("submitButton")).click();
//		c.findElement(By.linkText("Leads")).click();
		
		VtigerHomePage home=new VtigerHomePage(driver);
		home.clickleadsLink();
		
		LeadDetailedPage img = new LeadDetailedPage(driver);
		img.clickCampLookUpImg();
		
//		c.findElement(By.xpath("//img[@title='Create Lead...']")).click();
		//Ramdomclass is generating the unique values(to avoid duplicate values)
		
		int ranNum=jlib.getRandomNum();
		
		
		String firstName=elib.ReadExcelData("Leads", 0, 0) + ranNum;
		String lastName=elib.ReadExcelData("Leads", 1, 0) + ranNum;
		String comp=elib.ReadExcelData("Leads", 2, 0) + ranNum;

		CreateLeadPage createPage = new CreateLeadPage(driver);
		createPage.enterfirstname(firstName);;
		createPage.enterlastname(lastName);
		createPage.enterCompanyName(comp);
		createPage.clickSaveButton();
		
//		c.findElement(By.name("firstname")).sendKeys(firstName);
//		
//		c.findElement(By.name("lastname")).sendKeys(lastName);
//
//		c.findElement(By.name("company")).sendKeys(comp);
//
//		c.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		Thread.sleep(4000);
//		String Lastname = c.findElement(By.id("dtlview_Last Name")).getText();
//		String Company = c.findElement(By.id("dtlview_Company")).getText();
//
//		if(Lastname.contains(lastName))
//		{
//			System.out.println("Leads created successfully");
//		}
//		else
//		{
//			System.out.println("Leads not created");
//		}
//		
//		if(Company.contains(comp))
//		{
//			System.out.println("Comp created successfully");
//		}
//		else
//		{
//			System.out.println("Comp not created");
//		}
		LeadValidationPage validate = new LeadValidationPage(driver);
		validate.validateProduct(driver, lastName);
//		c.findElement(By.cssSelector("[src=\"themes/softed/images/user.PNG\"]")).click();
//		c.findElement(By.linkText("Sign Out")).click();
//		home.logoutApp();
//		c.close();
		
		System.out.println("CreateLeadsTest ran successfully.");
	}

}

