package TestNG1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1_Number {
	@Test(dataProvider="getData")
	public void bookTickets(String src,String dest,int persons)
	{
		System.out.println("Book tickets from "+src+" to "+dest+ " With No of persons "+ persons);

	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] obj=new Object[3][3];
		
		obj[0][0]="Bangalore";
		obj[0][1]="Goa";
		obj[0][2]=5;
		

		obj[1][0]="Bangalore";
		obj[1][1]="mysore";
		obj[1][2]=10;

		obj[2][0]="Bangalore";
		obj[2][1]="Chennai";
		obj[2][2]=10;

		return obj;

	}


}
