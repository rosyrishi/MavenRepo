package TestNG;

import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.Excel_Utility;
import Generic_Utilities.File_Utility;
import Generic_Utilities.Java_Utility;
import Generic_Utilities.WebDriver_Utility;
import Object_Repo.CreateProductPage;
import Object_Repo.DeleteProductName;
import Object_Repo.ProductDetailedPage;
import Object_Repo.ProductValidationPage;
import Object_Repo.VtigerHomePage;
import Object_Repo.validatePrdDeleted;


public class DeleteCreatedProductTest extends BaseClass{
	@Test
	public void DeleteCreatedProductTest1() throws Throwable {
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
		home.clickProdLink();
		
		ProductDetailedPage img = new ProductDetailedPage(driver);
		img.clickProdLookUpImg();
		//Ramdomclass is generating the unique values(to avoid duplicate values)
		int ranNum=jlib.getRandomNum();
	
		String P1=elib.ReadExcelData("Products", 0, 0) + ranNum;

		CreateProductPage createPage = new CreateProductPage(driver);
		createPage.enterprodName(P1);
		createPage.clickSaveButton();
		Thread.sleep(4000);
		
		ProductValidationPage validate = new ProductValidationPage(driver);
		validate.validateProduct(driver, P1);
		
		
		home.clickProdLink();
		
		DeleteProductName deleteProd=new DeleteProductName(driver);
		deleteProd.enterProdName("Product Name");
		deleteProd.clickOnSearchBar(P1);
		deleteProd.clickOnSubmit();
		Thread.sleep(4000);
		deleteProd.clickOnID();
		deleteProd.clickOnDelete();
		
		wlib.alertAccept(driver);

		home.clickProdLink();
		deleteProd.enterProdName("Product Name");
		deleteProd.clickOnSearchBar(P1);
		deleteProd.clickOnSubmit();
		
		validatePrdDeleted validateprod=new validatePrdDeleted(driver);
		validateprod.validateDeletedProd(driver, P1);
//		home.logoutApp();
//		c.close();
		
		System.out.println("DeleteCreatedProductTest ran successfully.");
	}

}

