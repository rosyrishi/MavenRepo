package TestNG1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	@Test
	public void M1()

	{
		System.out.println("Step1");
		System.out.println("Step2");
		Assert.assertEquals(true, false);

		System.out.println("Step3");
		System.out.println("Step4");
	}
	@Test
	public void M2()
	{
		String expData = "qSpiders";
		String actData = "qSpiders";
		Assert.assertEquals(actData, expData);

	}
	@Test
	public void M3()
	{
		int a=10;
		int b=10;
		Assert.assertEquals(a, b, "Not Equals =");
		System.out.println("It is equal");
	}
	@Test
	public void M4()
	{
		int a=10;
		int b=1;
		Assert.assertNotEquals(a, b ,"It is Equal");
		System.out.println("It is not equal");		
	}
	@Test
	public void M5()
	{
		String s1="Rojalin";
		String s2="Rojalin";
		Assert.assertTrue(s1.equalsIgnoreCase(s2),"False = ");
		System.out.println("== True == ");		
	}
	@Test
	public void M6()
	{
		String s1="Rojalin";
		String s2="Rojali";
		Assert.assertFalse(s1.equalsIgnoreCase(s2),"Equal == ");;
		System.out.println("Data is not Equal");		
	}
	@Test
	public void M7()
	{
		String s=null;
		Assert.assertNull(s, "It is not Null");;
		System.out.println("It is Null");		
	}
	
	@Test
	public void M8()
	{
		String s="Rojalin";
		Assert.assertNull(s, "It is not Null");;
		System.out.println("It is Null");		
	}
	
	@Test
	public void M9()
	{
		String s="Rojalin";
		Assert.assertNotNull(s, "It is Null");;
		System.out.println("It is not Null");		
	}
	@Test
	public void M10()
	{
		String s="Rojali";
		String s1="Rojalin";
		Assert.assertSame(s, s1, "It is not Same");
		System.out.println("It is Same");		
	}
	@Test
	public void M11()
	{
		String s="Rojali";
		String s1="Rojalin";
		Assert.assertNotSame(s, s1, "It is Same");
		System.out.println("It is not Same");		
	}
	
	@Test
	public void M12()
	{
		Assert.fail("I am failing the TestScript");		
	}
	

}
