package Object_Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OrgValidationPage {
	public OrgValidationPage(WebDriver driver)

	{
		PageFactory.initElements(driver,this);
	}
	
	public String validateProduct(WebDriver driver,String Orgname)
	{
		String accountname =driver.findElement(By.id("dtlview_Organization Name")).getText();

		if(accountname.contains(Orgname))
		{
			System.out.println("Org created successfully");
		}
		else
		{
			System.out.println("Org not created");
		}
		return accountname;
	}
	
}
