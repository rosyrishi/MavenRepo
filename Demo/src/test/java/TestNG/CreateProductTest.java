package TestNG;

import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.Excel_Utility;
import Generic_Utilities.File_Utility;
import Generic_Utilities.Java_Utility;
import Generic_Utilities.WebDriver_Utility;
import Object_Repo.CreateProductPage;
import Object_Repo.ProductDetailedPage;
import Object_Repo.ProductValidationPage;
import Object_Repo.VtigerHomePage;


public class CreateProductTest extends BaseClass {
	@Test
	public void CreateProductTest1() throws Throwable {
//		File_Utility fileb = new File_Utility();
//		WebDriver_Utility wlib = new WebDriver_Utility();
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
//		c.findElement(By.linkText("Products")).click();
		VtigerHomePage home=new VtigerHomePage(driver);
		home.clickProdLink();
		
		ProductDetailedPage img = new ProductDetailedPage(driver);
		img.clickProdLookUpImg();
		
//		c.findElement(By.xpath("//img[@title='Create Product...']")).click();
		//Ramdomclass is generating the unique values(to avoid duplicate values)
		int ranNum=jlib.getRandomNum();
		
		String P1=elib.ReadExcelData("Products", 0, 0) + ranNum;
		
		CreateProductPage createPage = new CreateProductPage(driver);
		createPage.enterprodName(P1);
		createPage.clickSaveButton();

//		c.findElement(By.name("productname")).sendKeys(P1);


//		c.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		
		Thread.sleep(4000);
		
		ProductValidationPage validate = new ProductValidationPage(driver);
		validate.validateProduct(driver, P1);
		
		
//		String productName = c.findElement(By.id("dtlview_Product Name")).getText();
//
//		if(productName.contains(P1))
//		{
//			System.out.println("Product created successfully");
//		}
//		else
//		{
//			System.out.println("Product not created");
//		}
//		c.findElement(By.cssSelector("[src=\"themes/softed/images/user.PNG\"]")).click();
//		c.findElement(By.linkText("Sign Out")).click();
//		home.logoutApp();
//		c.close();
		System.out.println("CreateProductTest ran successfully.");
	}

}