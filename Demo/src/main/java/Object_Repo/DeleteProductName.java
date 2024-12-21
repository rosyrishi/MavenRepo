package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteProductName {
	public DeleteProductName(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "search_field")
	private WebElement prodName;
	@FindBy(name = "search_text")
	private WebElement searchProdName;
	@FindBy(name="submit")
	private WebElement submit;
	@FindBy(xpath="//input[@name='selected_id']")
	private WebElement selectID;
	@FindBy(xpath="//input[@class='crmbutton small delete']")
	private WebElement delete;
	
	public void enterProdName(String name)
	{
		prodName.sendKeys(name);

	}
	public void clickOnSearchBar(String name)
	{
		searchProdName.sendKeys(name);

	}
	public void clickOnSubmit()
	{
		submit.click();
	}
	public void clickOnID()
	{
		selectID.click();
	}
	public void clickOnDelete()
	{
		delete.click();
	}
	
}
