package Object_Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ContactValidationPage {
	public ContactValidationPage(WebDriver driver)

	{
		PageFactory.initElements(driver,this);
	}
	
	public String validateCamaign(WebDriver driver,String firstName,String lastName)
	{
		String FN = driver.findElement(By.id("dtlview_First Name")).getText();
		String LN = driver.findElement(By.id("dtlview_Last Name")).getText();

		if(FN.contains(FN))
		{
			System.out.println("firstName created successfully");
		}
		else
		{
			System.out.println("firstName not created");
		}

		if(LN.contains(LN))
		{
			System.out.println("lastName created successfully");
		}
		else
		{
			System.out.println("lastName not created");
		}
		return FN;
		
	}
	
}
