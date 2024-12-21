package Object_Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class validatePrdDeleted {
	public validatePrdDeleted(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public String validateDeletedProd(WebDriver driver,String prodName)
	{
		WebElement ele =driver.findElement(By.xpath("//span[@class='genHeaderSmall']"));
		String text = ele.getText();
		System.out.println("Text obtained is"+text);
		if(text.contains("No Product Found !"))
		{
			System.out.println("Product Deleted successfully");
		}
		else
		{
			System.out.println("Product not Deleted");
		}
		return text;
	}
	
}
