package Object_Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwitchingWindowCapmWithProd {

	public SwitchingWindowCapmWithProd(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(css="")
	private WebElement prdPlusImg;

	@FindBy(name="search_text")
	private WebElement productname;

	@FindBy(name="search")
	private WebElement searchBar;

	public void clickPlusSign()
	{
		prdPlusImg.click();
	}
	public void enterProdNameInCamp(String name)
	{
		productname.sendKeys(name);

	}

	public void clickOnSearchBar()
	{
		searchBar.click();

	}
public String clickProductName(WebDriver driver,String PrdName)
{
driver.findElement(By.xpath("//a[text()='"+PrdName+"']")).click();
return PrdName;
	
	}
}
