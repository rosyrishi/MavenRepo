package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactPage {
	public CreateContactPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "firstname")
	private WebElement firstName;
	@FindBy(name = "lastname")
	private WebElement lastname;
	@FindBy(css = "[title='Save [Alt+S]']")
	private WebElement saveButton;
	
	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getFirstName() {
		return firstName;
	}
	
	public WebElement getLastname() {
		return lastname;
	}
	
	public void enterfirstName(String name) {
		firstName.sendKeys(name);
	}
	
	public void enterlastname(String name) {
		lastname.sendKeys(name);
	}
	public void clickSaveButton() {
		saveButton.click();;
	}
	
	
	
}
