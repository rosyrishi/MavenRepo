package TestNG;

import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.Excel_Utility;
import Generic_Utilities.File_Utility;
import Generic_Utilities.Java_Utility;
import Generic_Utilities.WebDriver_Utility;
import Object_Repo.CreateOrgPage;
import Object_Repo.OrgDetailedPage;
import Object_Repo.OrgValidationPage;
import Object_Repo.VtigerHomePage;


public class CreateOrganizationTest extends BaseClass{
	@Test
	public void CreateOrganizationTest1() throws Throwable {
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
		VtigerHomePage home=new VtigerHomePage(driver);
		home.clickorgLink();
		
		OrgDetailedPage img = new OrgDetailedPage(driver);
		img.clickCampLookUpImg();
		
//		c.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		//Ramdomclass is generating the unique values(to avoid duplicate values)
		int ranNum=jlib.getRandomNum();
		String Orgname=elib.ReadExcelData("Organization", 0, 0) + ranNum;
		String cellNum=elib.ReadExcelDataFormatter("Organization", 1, 0);
		String mailId=elib.ReadExcelData("Organization", 2, 0);
		
		CreateOrgPage createPage = new CreateOrgPage(driver);
		createPage.enterOrgname(Orgname);
		createPage.entercellNum(cellNum);
		createPage.entermailId(mailId);
		createPage.clickSaveButton();
		
//		c.findElement(By.name("accountname")).sendKeys(Orgname);
//		c.findElement(By.id("phone")).sendKeys(cellNum);
//		c.findElement(By.id("email1")).sendKeys(mailId);
//		
//		
//		wlib.saveButton(c);
		Thread.sleep(4000);
		OrgValidationPage validate = new OrgValidationPage(driver);
		validate.validateProduct(driver, Orgname);
//		String accountname = c.findElement(By.id("dtlview_Organization Name")).getText();
//
//		if(accountname.contains(Orgname))
//		{
//			System.out.println("Org created successfully");
//		}
//		else
//		{
//			System.out.println("Org not created");
//		}
//		home.logoutApp();
//		c.close();
		
		System.out.println("CreateOrganizationTest ran successfully.");
	}

}
