package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProductPage {
	public CreateProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "productname")
	private WebElement prodName;

	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveButton;

	//getter methods
	public WebElement getCampName() {
		return prodName;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	/**
	 * 
	 * @param name
	 */
	public void enterprodName(String name) {
		prodName.sendKeys(name);
	}

	public void clickSaveButton()
	{
		saveButton.click();
	}
}
