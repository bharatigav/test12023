package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class dependsOnMethod_keyword {
	@BeforeClass
	public void launchBrowser(){
		System.out.println("BeforeClass");
		
	}
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("BeforeMethod");
		
	}
	
	//dependOnMethod
	//used to set a dependent method
	//test1 is depends on test3
	//if test3 is passed then test1 will be execute
	//if test3 is failed then test1 will not be execute i.e skip 
	//depend method will be execute after independant method
	// test1 is depend on test2 AND test3
	@Test(priority=1, dependsOnMethods={"test3", "test2"})
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



