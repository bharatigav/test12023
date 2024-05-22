package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Keyword {
	
	@BeforeClass
	public void launchBrowser(){
		System.out.println("BeforeClass");
		
	}
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("BeforeMethod");
		
	}
	//used to control/change the execution sequence of test method
	//priority number can be negative or possitive
	//the method having smallest priority number having heigest priority
	//default priority of the test method is zero i.f if dont applay priority by the default it is(priority =0)
	//when priority of same in two method then execution in between those method is based on aplhabetical order of of method name
	
	@Test(priority=1)
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
