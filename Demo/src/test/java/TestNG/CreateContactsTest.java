package TestNG;

import java.util.Random;

import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.Excel_Utility;
import Generic_Utilities.File_Utility;
import Generic_Utilities.WebDriver_Utility;
import Object_Repo.ContactDetailedPage;
import Object_Repo.ContactValidationPage;
import Object_Repo.CreateContactPage;
import Object_Repo.VtigerHomePage;


public class CreateContactsTest  extends BaseClass {
	@Test
	public void CreateContactsTest1() throws Throwable {
		WebDriver_Utility wlib = new WebDriver_Utility();
		File_Utility fileb = new File_Utility();
//		Java_Utility jlib = new Java_Utility();
		Excel_Utility elib = new Excel_Utility();
		
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
//		c.findElement(By.linkText("Contacts")).click();
		VtigerHomePage home=new VtigerHomePage(driver);
		home.clickcontactLink();
		
		ContactDetailedPage img = new ContactDetailedPage(driver);
		img.clickCampLookUpImg();
		
//		c.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		Random ran = new Random();
		int ranNum = ran.nextInt(1000);


		String firstName=elib.ReadExcelData("Contact", 0, 0) + ranNum;
		String lastName=elib.ReadExcelData("Contact", 1, 0) + ranNum;

		
		CreateContactPage createPage = new CreateContactPage(driver);
		createPage.enterfirstName(firstName);
		createPage.enterlastname(lastName);
		createPage.clickSaveButton();
		
//		c.findElement(By.name("firstname")).sendKeys(firstName);
//		c.findElement(By.name("lastname")).sendKeys(lastName);

//		c.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		
		
		ContactValidationPage validate = new ContactValidationPage(driver);
		validate.validateCamaign(driver, firstName, lastName);
		
//		String FN = c.findElement(By.id("dtlview_First Name")).getText();
//		String LN = c.findElement(By.id("dtlview_Last Name")).getText();
//
//		if(FN.contains(firstName))
//		{
//			System.out.println("firstName created successfully");
//		}
//		else
//		{
//			System.out.println("firstName not created");
//		}
//
//		if(LN.contains(lastName))
//		{
//			System.out.println("lastName created successfully");
//		}
//		else
//		{
//			System.out.println("lastName not created");
//		}
//		c.findElement(By.cssSelector("[src=\"themes/softed/images/user.PNG\"]")).click();
//		c.findElement(By.linkText("Sign Out")).click();
//		home.logoutApp();
//		c.close();
		
		System.out.println("CreateContactsTest ran successfully");
	}

}

