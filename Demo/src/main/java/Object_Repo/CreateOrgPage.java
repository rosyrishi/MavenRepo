package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrgPage {
	public CreateOrgPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "accountname")
	private WebElement Orgname;
	@FindBy(id = "phone")
	private WebElement cellNum;
	@FindBy(id = "email1")
	private WebElement mailId;
	@FindBy(css = "[title='Save [Alt+S]']")
	private WebElement saveButton;
	
	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getFirstName() {
		return Orgname;
	}
	
	public WebElement getLastname() {
		return cellNum;
	}
	public WebElement getmailId() {
		return mailId;
	}
	
	public void enterOrgname(String name) {
		Orgname.sendKeys(name);
	}
	
	public void entercellNum(String name) {
		cellNum.sendKeys(name);
	}
	public void entermailId(String name) {
		mailId.sendKeys(name);
	}
	public void clickSaveButton() {
		saveButton.click();;
	}
	
	
	
}
