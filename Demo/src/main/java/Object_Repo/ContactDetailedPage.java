package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactDetailedPage {

	public ContactDetailedPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "[alt='Create Contact...']")
	private WebElement lookUpImg;

	
	public WebElement getLookUpImg() {
		return lookUpImg;
	}
	
	/**
	 * 
	 */
	
	public void clickCampLookUpImg()
	{
		lookUpImg.click();
	}
}
