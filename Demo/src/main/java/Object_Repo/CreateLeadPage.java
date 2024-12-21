package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateLeadPage {
	public CreateLeadPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "firstname")
	private WebElement firstName;
	@FindBy(name = "lastname")
	private WebElement lastname;
	@FindBy(name = "company")
	private WebElement comp;
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
	public WebElement getcompanyName() {
		return comp;
	}
	
	public void enterfirstname(String name) {
		firstName.sendKeys(name);
	}
	
	public void enterlastname(String name) {
		lastname.sendKeys(name);
	}
	public void enterCompanyName(String name) {
		comp.sendKeys(name);
	}
	public void clickSaveButton() {
		saveButton.click();;
	}
	
	
	
}
