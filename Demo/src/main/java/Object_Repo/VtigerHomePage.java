package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VtigerHomePage {
	//initialization
	public VtigerHomePage(WebDriver driver)

	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(linkText="More")
	private WebElement moreLink;

	@FindBy(linkText="Campaigns")
	private WebElement campLink;
	
	@FindBy(linkText="Products")
	private WebElement prodLink;
	
	@FindBy(linkText="Contacts")
	private WebElement contactLink;
	
	@FindBy(linkText="Leads")
	private WebElement leadsLink;
	
	@FindBy(linkText="Organizations")
	private WebElement orgLink;

	@FindBy(css="[src='themes/softed/images/user.PNG']")
	private WebElement admLink;

	@FindBy(linkText="Sign Out")
	private WebElement signOut;


	public WebElement getMoreLink() {
		return moreLink;
	}

	public WebElement getCampLink() {
		return campLink;
	}
	
	public WebElement getProdLink() {
		return prodLink;
	}
	
	public WebElement getContactLink() {
		return contactLink;
	}

	public WebElement getLeadsLink() {
		return leadsLink;
	}

	public WebElement getOrgLink() {
		return orgLink;
	}

	public WebElement getAdmLink() {
		return admLink;
	}

	public WebElement getSignOut() {
		return signOut;
	}

	/*
	 * Business class
	 */
	public void ClickMoreLink()

	{
		moreLink.click();
	}
	/*
	 * Business class
	 */

	public void clickCampLink()

	{
		campLink.click();
	}
	/*
	 * Business class
	 */
	
	public void clickProdLink()

	{
		prodLink.click();
	}
	/*
	 * Business class
	 */
	
	public void clickcontactLink()

	{
		contactLink.click();
	}
	/*
	 * Business class
	 */
	public void clickleadsLink()

	{
		leadsLink.click();
	}
	/*
	 * Business class
	 */
	public void clickorgLink()

	{
		orgLink.click();
	}
	/*
	 * Business class
	 */

	public void logoutApp()

	{
		admLink.click();
		signOut.click();
	}


}
