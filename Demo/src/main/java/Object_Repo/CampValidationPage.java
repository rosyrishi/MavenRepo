package Object_Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CampValidationPage {
	public CampValidationPage(WebDriver driver)

	{
		PageFactory.initElements(driver,this);
	}
	
	public String validateCamaign(WebDriver driver,String CampName)
	{
		String CampaignName = driver.findElement(By.id("dtlview_Campaign Name")).getText();

		if(CampaignName.contains(CampName))
		{
			System.out.println("Campaign created successfully");
		}
		else
		{
			System.out.println("Campaign not created");
		}
		return CampaignName;
	}
	
	
	public String validateProduct(WebDriver driver,String PrdName)
	{
	
	String actData1 = driver.findElement(By.xpath("//span[@id='dtlview_Product']")).getText();

	if(actData1.contains(PrdName))
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
