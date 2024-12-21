package TestNG1;

import org.testng.annotations.Test;

public class Script1 {
    @Test(priority=0)
	public void createProduct()
	{
    	
		System.out.println("Product Created");
	}
    @Test(enabled=false)
	public void modifyProduct()
	
	{
		System.out.println("Product modified");
	}
    @Test(dependsOnMethods="createProduct")
    public void deleteProduct()
	
	{
	System.out.println("Product deleted");
	}
    
    @Test(invocationCount=5)
public void modifyProduct1()
	
	{
		System.out.println("Product modified");
	}
}
