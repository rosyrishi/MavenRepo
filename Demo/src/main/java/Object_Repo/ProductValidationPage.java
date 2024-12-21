package Object_Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductValidationPage {
	public ProductValidationPage(WebDriver driver)

	{
		PageFactory.initElements(driver,this);
	}
	
	public String validateProduct(WebDriver driver,String prodName)
	{
		String productName = driver.findElement(By.id("dtlview_Product Name")).getText();

		if(productName.contains(prodName))
		{
			System.out.println("Product created successfully");
		}
		else
		{
			System.out.println("Product not created");
		}
		return productName;
	}
	
}
