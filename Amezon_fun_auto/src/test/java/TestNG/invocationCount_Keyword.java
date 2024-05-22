package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class invocationCount_Keyword {
	
	@BeforeClass
	public void launchBrowser(){
		System.out.println("BeforeClass");
		
	}
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("BeforeMethod");
		
	}
	
	//invocationCount
	//to execute a test method multiple time
	//bydefault invocation is 1
	//if we set invocation count is less than one then method will not execute
	//we should use invocation count is 2,3,4,5...
	@Test(priority=1,invocationCount=3)
	public void DesigntestCase1(){
		System.out.println("test1");
		
	}
	@Test(priority=2)
	public void DesigntestCase2(){
		System.out.println("test2");
		
	}
	@Test(priority=-2)
	public void DesigntestCase3(){
		System.out.println("test3");
		
	}
	@Test(priority=0)
	public void DesigntestCase0(){
		System.out.println("test0");
		
	}
	@AfterMethod
	public void afterMethod(){
		System.out.println("AfterMethod");
		
	}
	@AfterClass
	public void aferClass(){
		System.out.println("AfterClass");
		
	}

}
