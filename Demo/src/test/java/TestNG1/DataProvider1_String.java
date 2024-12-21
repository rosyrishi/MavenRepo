package TestNG1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1_String {
	@Test(dataProvider="getData")
	public void bookTickets(String src,String dest)
	{
		System.out.println("Book tickets from "+src+" to "+dest);
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] obj=new Object[3][2];
		
		obj[0][0]="Bangalore";
		obj[0][1]="Goa";

		obj[1][0]="Bangalore";
		obj[1][1]="mysore";

		obj[2][0]="Bangalore";
		obj[2][1]="Chennai";

		return obj;

	}


}
