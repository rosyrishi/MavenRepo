package TestNG;

import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.Excel_Utility;
import Generic_Utilities.Java_Utility;
import Object_Repo.CampDetailedPage;
import Object_Repo.CampValidationPage;
import Object_Repo.CreateCampPage;
import Object_Repo.VtigerHomePage;

public class CreateCampaignTest extends BaseClass{
	@Test
	public void CreateCampaignTest1() throws Throwable {
		
//		WebDriver_Utility wlib = new WebDriver_Utility();
//		File_Utility fileb = new File_Utility();
		Java_Utility jlib = new Java_Utility();
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

		VtigerHomePage home=new VtigerHomePage(driver);
		home.ClickMoreLink();
		home.clickCampLink();
		
		CampDetailedPage img = new CampDetailedPage(driver);
		img.clickCampLookUpImg();
		int ranNum=jlib.getRandomNum();
	

		String Campaign=elib.ReadExcelData("Campaign", 0, 0) + ranNum;
		
		CreateCampPage createPage = new CreateCampPage(driver);
		createPage.enterCampName(Campaign);
		createPage.clickSaveButton();
		Thread.sleep(4000);
		
		CampValidationPage validate = new CampValidationPage(driver);
		validate.validateCamaign(driver, Campaign);	
//		home.logoutApp();
		
//		c.close();
		
		System.out.println("CreateCampaignTest ran successfully");
	}

}

