package TestNG;

import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.Excel_Utility;
import Generic_Utilities.Java_Utility;
import Generic_Utilities.WebDriver_Utility;
import Object_Repo.CampDetailedPage;
import Object_Repo.CreateCampPage;
import Object_Repo.CreateProductPage;
import Object_Repo.ProductDetailedPage;
import Object_Repo.SwitchingWindowCapmWithProd;
import Object_Repo.ValidateCampaignsWithProduct;
import Object_Repo.VtigerHomePage;

public class campaignWithProductTest extends BaseClass {
	@Test
	public void campaignWithProductTest1() throws Throwable {
//		WebDriver_Utility wlib = new WebDriver_Utility();
//		File_Utility fileb = new File_Utility();
		Java_Utility jlib = new Java_Utility();
		Excel_Utility elib = new Excel_Utility();
		WebDriver_Utility windowSwitching = new WebDriver_Utility();
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
		//Ramdomclass is generating the unique values(to avoid duplicate values)
		int ranNum=jlib.getRandomNum();
		String P1=elib.ReadExcelData("Products", 0, 0) + ranNum;
		String Campaign=elib.ReadExcelData("Campaign", 0, 0) + ranNum;


		VtigerHomePage home=new VtigerHomePage(driver);
		home.clickProdLink();

		ProductDetailedPage img = new ProductDetailedPage(driver);
		img.clickProdLookUpImg();

		CreateProductPage createPage = new CreateProductPage(driver);
		createPage.enterprodName(P1);
		createPage.clickSaveButton();

		Thread.sleep(4000);

		home.ClickMoreLink();
		home.clickCampLink();
		CampDetailedPage img1 = new CampDetailedPage(driver);
		img1.clickCampLookUpImg();

		CreateCampPage createPage1 = new CreateCampPage(driver);
		createPage1.enterCampName(Campaign);
		createPage1.clickSelectButton();

		Thread.sleep(4000);

		windowSwitching.windowSwitching(driver, "Product&action");

		SwitchingWindowCapmWithProd switchProd=new SwitchingWindowCapmWithProd(driver);
		switchProd.enterProdNameInCamp(P1);
		switchProd.clickOnSearchBar();
		switchProd.clickProductName(driver, P1);


		windowSwitching.windowSwitching(driver, "Campaign&action");
		createPage1.clickSaveButton();

		ValidateCampaignsWithProduct validate=new ValidateCampaignsWithProduct(driver);
		validate.validateCampName(driver, Campaign);
		validate.validatePrdName(driver, P1);
//;;;;

//		home.logoutApp();
//
//		c.close();
		System.out.println("campaignWithProductTest ran successfully");
	}
}









































