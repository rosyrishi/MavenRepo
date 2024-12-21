package TestNG1;

import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;

public class SampleTest2 extends BaseClass {
	
	@Test
	public void m1()
	{
		System.out.println("i Am a good girl");
		
	}

	@Test
	public void m2()
	{
		System.out.println("i Am a good girl1");
		
	}
	
	public class SampleTest2TES extends BaseClass {
		
		@Test
		public void m1()
		{
			System.out.println("i Am a good girl2");
			
		}

		@Test
		public void m2()
		{
			System.out.println("i Am a good girl3");
			
		}
}
}
