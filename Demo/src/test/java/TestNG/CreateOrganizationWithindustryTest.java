package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.Excel_Utility;
import Generic_Utilities.File_Utility;
import Generic_Utilities.Java_Utility;
import Generic_Utilities.WebDriver_Utility;
import Object_Repo.CreateOrgPage;
import Object_Repo.OrgDetailedPage;
import Object_Repo.VtigerHomePage;


public class CreateOrganizationWithindustryTest extends BaseClass{
	@Test
	public void CreateOrganizationWithindustryTest1() throws Throwable {
		WebDriver_Utility wlib = new WebDriver_Utility();
		File_Utility fileb = new File_Utility();
		Java_Utility jlib = new Java_Utility();
		Excel_Utility elib = new Excel_Utility();
		
//
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
//		c.findElement(By.linkText("Organizations")).click();
		
		VtigerHomePage home=new VtigerHomePage(driver);
		home.clickorgLink();
		
		OrgDetailedPage img = new OrgDetailedPage(driver);
		img.clickCampLookUpImg();
		//Ramdomclass is generating the unique values(to avoid duplicate values)
		int ranNum=jlib.getRandomNum();
	
		String Orgname=elib.ReadExcelData("Organization", 0, 0) + ranNum;
		String cellNum=elib.ReadExcelDataFormatter("Organization", 1, 0);
		String mailId=elib.ReadExcelData("Organization", 2, 0);
		

		CreateOrgPage createPage = new CreateOrgPage(driver);
		createPage.enterOrgname(Orgname);
		createPage.entercellNum(cellNum);
		createPage.entermailId(mailId);
		

		WebElement ele= driver.findElement(By.name("industry"));
		Select industry = new Select(ele);
		industry.selectByIndex(6);

//		c.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		createPage.clickSaveButton();
		Thread.sleep(4000);
		String accountname = driver.findElement(By.id("dtlview_Organization Name")).getText();
		String indsName = driver.findElement(By.id("dtlview_Industry")).getText();
		System.out.println("Industry name is " + indsName);

		if(accountname.contains(Orgname))
		{
			System.out.println("Org created successfully");
		}
		else
		{
			System.out.println("Org not created");
		}
//		c.findElement(By.cssSelector("[src=\"themes/softed/images/user.PNG\"]")).click();
//		c.findElement(By.linkText("Sign Out")).click();
//		home.logoutApp();
//		c.close();
		
		System.out.println("CreateOrganizationWithindustryTest ran successfully.");
	}

}
