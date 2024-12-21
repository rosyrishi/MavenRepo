package TestNG1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_Utilities.Excel_Utility;
import Generic_Utilities.Java_Utility;

public class CreateOrgWithDataProviderExcelsheet {
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
		
		Java_Utility jlib = new Java_Utility();
		int ranNum=jlib.getRandomNum();

		c.findElement(By.name("accountname")).sendKeys(Orgname+ranNum);
		c.findElement(By.id("phone")).sendKeys(cellNum);
		c.findElement(By.id("email1")).sendKeys(mailId);

		c.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		Thread.sleep(2000);

		c.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		c.findElement(By.linkText("Sign Out")).click();

		c.quit();
	}
	@DataProvider
	public Object[][] readData() throws Throwable
	{
		Excel_Utility elib=new Excel_Utility();
		
		Object[][] values = elib.readExcelDataForDataProvider("DataProvider");
		
		return values;
		
		
		
		
		
		
		
		
//		Object[][] obj =new Object[3][3];
//
//		Random ran=new Random();
//		int ranNum=	ran.nextInt(1000);
//
//		// step1:- Path setting of the Excel file
//		FileInputStream fis1 = new FileInputStream("./src/test/resources/Test.xlsx");
//
//		// step2:- keep the File in read mode
//		Workbook book = WorkbookFactory.create(fis1);
//
//		// step3:- Navigating to the sheet
//		Sheet sheet = book.getSheet("DataProvider");
//		
//		//Row1
//
//		Row row = sheet.getRow(0);
//		Cell cell = row.getCell(0);
//		String Orgname = cell.getStringCellValue() + ranNum;
//		System.out.println(Orgname);
//		Row row1 = sheet.getRow(0);
//		Cell cell1 = row1.getCell(1);
//		DataFormatter format1 = new DataFormatter();
//		String phnNum = format1.formatCellValue(cell1);
//		System.out.println(phnNum);
//		Row row2 = sheet.getRow(0);
//		Cell cell2 = row2.getCell(2);
//		String emailId = cell2.getStringCellValue();
//		System.out.println(emailId);
//
//		//Row2
//
//		Row row11 = sheet.getRow(1);
//		Cell cell11 = row11.getCell(0);
//		String Orgname1 = cell11.getStringCellValue() + ranNum;
//		System.out.println(Orgname1);
//		Row row12 = sheet.getRow(1);
//		Cell cell12 = row12.getCell(1);
//		DataFormatter format11 = new DataFormatter();
//		String phnNum1 = format11.formatCellValue(cell12);
//		System.out.println(phnNum1);
//		Row row13 = sheet.getRow(1);
//		Cell cell13 = row13.getCell(2);
//		String emailId1 = cell13.getStringCellValue();
//		System.out.println(emailId1);
//
//		//Row3
//		
//		Row row21 = sheet.getRow(2);
//		Cell cell21 = row21.getCell(0);
//		String Orgname2 = cell21.getStringCellValue() + ranNum;
//		System.out.println(Orgname2);
//		Row row22 = sheet.getRow(2);
//		Cell cell22 = row22.getCell(1);
//		DataFormatter format31 = new DataFormatter();
//		String phnNum2 = format31.formatCellValue(cell22);
//		System.out.println(phnNum2);
//		Row row23 = sheet.getRow(2);
//		Cell cell23 = row23.getCell(2);
//		String emailId2 = cell23.getStringCellValue();
//		System.out.println(emailId2);
//		
//		obj[0][0]=Orgname;
//		obj[0][1]=phnNum;
//		obj[0][2]=emailId;
//		
//		obj[1][0]=Orgname1;
//		obj[1][1]=phnNum1;
//		obj[1][2]=emailId1;
//
//		obj[2][0]=Orgname2;
//		obj[2][1]=phnNum2;
//		obj[2][2]=emailId2;
	}
}
