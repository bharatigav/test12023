package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class timeOut_keyword {
	@BeforeClass
	public void launchBrowser(){
		System.out.println("BeforeClass");
		
	}
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("BeforeMethod");
		
	}
	
	//timeOut
	//to set the maximum execution time for any test method
	//if test method is time consuming for execution then we can use timeOut
	//to set the maximum execution time
	@Test(priority=1, enabled=false)
	public void DesigntestCase1(){
		System.out.println("test1");
		
	}
	@Test(priority=2,timeOut=3000)//3sec
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
