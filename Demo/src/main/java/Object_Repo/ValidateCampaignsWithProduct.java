package Object_Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ValidateCampaignsWithProduct {
	public ValidateCampaignsWithProduct(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateCampName(WebDriver driver,String CampName)
	{
		String actData = driver.findElement(By.id("dtlview_Campaign Name")).getText();

		if(actData.contains(CampName))
		{
			System.out.println("Campaign Name is Created");
		}
		else
		{
			System.out.println("Campaign Name is not Created");
		}
		return actData;
	}
	public String validatePrdName(WebDriver driver,String prodName)
	{
		String actData1 = driver.findElement(By.xpath("//span[@id='dtlview_Product']")).getText();

		if(actData1.contains(prodName))
		{
			System.out.println("Product Name is created");
		}
		else
		{
			System.out.println("Product Name is not Created");
		}
		return actData1;
	}
}
