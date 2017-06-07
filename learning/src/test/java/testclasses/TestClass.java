package testclasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("In Before Suite Method...");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("In After Suite Method...");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("In Before Test Method...");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("In After Test Method...");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("In Before Class Method...");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("In After Class Method...");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("In Before Method...");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("In After Method...");
	}
	
	@Test
	public void test1()
	{
		System.out.println("In Test1 Method...");
	}
	
	@Test
	public void test2()
	{
		System.out.println("In Test2 Method...");
	}

	@Test
	public void test3()
	{
		System.out.println("In Test3 Method...");
	}
}
