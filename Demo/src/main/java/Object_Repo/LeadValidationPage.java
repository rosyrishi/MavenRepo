package Object_Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LeadValidationPage {
	public LeadValidationPage(WebDriver driver)

	{
		PageFactory.initElements(driver,this);
	}
	
	public String validateProduct(WebDriver driver,String lastname)
	{
		String Lastname = driver.findElement(By.id("dtlview_Last Name")).getText();
		String Company = driver.findElement(By.id("dtlview_Company")).getText();

		if(Lastname.contains(lastname))
		{
			System.out.println("Leads created successfully");
		}
		else
		{
			System.out.println("Leads not created");
		}
		
		if(Company.contains(Company))
		{
			System.out.println("Comp created successfully");
		}
		else
		{
			System.out.println("Comp not created");
		}
		return Lastname;
	}
	
}
