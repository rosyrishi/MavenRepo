package TestNG1;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateOrgWithDataProvider {
	@Test(dataProvider="readData")
	public void createorganization(String Orgname,String cellNum,String mailId) throws Throwable
	{
		WebDriver c=new ChromeDriver();
		c.get("http://localhost:8888");
		c.manage().window().maximize();

		c.findElement(By.name("user_name")).sendKeys("admin");
		c.findElement(By.name("user_password")).sendKeys("admin");
		c.findElement(By.id("submitButton")).click();

		c.findElement(By.linkText("Organizations")).click();
		c.findElement(By.xpath("//img[@alt='Create Organization...']")).click();

		c.findElement(By.name("accountname")).sendKeys(Orgname);
		c.findElement(By.id("phone")).sendKeys(cellNum);
		c.findElement(By.id("email1")).sendKeys(mailId);

		c.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		Thread.sleep(2000);

		c.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		c.findElement(By.linkText("Sign Out")).click();

		c.quit();
	}
	@DataProvider
	public Object[][] readData()
	{
		Random ran=new Random();
		int ranNum=	ran.nextInt(1000);
		Object[][] obj =new Object[3][3];	

		obj[0][0]="AAA"+ranNum;
		obj[0][1]="1234567890";
		obj[0][2]="abs@gmail.com";


		obj[1][0]="BBBB"+ranNum;
		obj[1][1]="09988776655";
		obj[1][2]="abs@gmail.com";

		obj[2][0]="CCC"+ranNum;
		obj[2][1]="55677889oo";
		obj[2][2]="abs@gmail.com";
		return obj;
	}
}
