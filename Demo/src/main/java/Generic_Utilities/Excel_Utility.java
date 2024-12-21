package Generic_Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility {
	public String ReadExcelData(String sheetName,int RowNum,int CellNum) throws Throwable
	{
		String path="./src/test/resources/Test.xlsx";
		FileInputStream fis1=new FileInputStream(path);
		Workbook book = WorkbookFactory.create(fis1);
		Sheet s = book.getSheet(sheetName);
		Row row = s.getRow(RowNum);
		Cell cell = row.getCell(CellNum);
		String excelData = cell.getStringCellValue();
		System.out.println(excelData);
		return excelData;
	}
	
	public String ReadExcelDataFormatter(String sheetName,int RowNum,int CellNum) throws Throwable
	{
		String path="./src/test/resources/Test.xlsx";
		FileInputStream fis1=new FileInputStream(path);
		Workbook book = WorkbookFactory.create(fis1);
		Sheet s = book.getSheet(sheetName);
		Row row = s.getRow(RowNum);
		Cell cell = row.getCell(CellNum);
		DataFormatter format=new DataFormatter();
		String excelData = format.formatCellValue(cell);
		System.out.println(excelData);
		return excelData;
		
	}
	public Object[][] readExcelDataForDataProvider(String sheetName) throws Throwable
	{
		String path="./src/test/resources/Test.xlsx";
		FileInputStream fis1=new FileInputStream(path);
		Workbook book = WorkbookFactory.create(fis1);
		Sheet sheet = book.getSheet(sheetName);
		int lastRow = sheet.getLastRowNum() +1;
		int cellNum = sheet.getRow(0).getLastCellNum();
		Object[][] obj = new Object[lastRow][cellNum];
		for(int i=0;i<lastRow;i++)
		{
			for (int j=0;j<cellNum;j++)
			{
				obj[i][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		
		return obj;
		
	}

}
