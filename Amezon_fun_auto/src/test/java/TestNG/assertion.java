package TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class assertion {
	@BeforeClass
	public void launchBrowser(){
		System.out.println("BeforeClass");
		
	}
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("BeforeMethod");
		
	}
	
	@Test(priority=1)
	public void test1(){
		System.out.println("test1");
		String actualUrl="www.facebook.com";
		String expectedUrl="www.facebook.com";
		
		String actualTitle="Facebook";
		String expectedTital="Facebook";
		
		SoftAssert soft=new SoftAssert();
		//compair the iunputs
		///applay(hard assert)/save(soft assert) the result on the test method
		//if actual data is equal to expected data then test method is passed
		//if actual data is equal not to expected data then test method is failed
		soft.assertEquals(actualUrl,expectedUrl);
		
		System.out.println("hello");
		//if actual data is equal not to expected data then test method is passed
		//if actual data is equal to expected data then test method is failed
		soft.assertEquals(actualTitle,expectedTital);
		
		//soft.assertEquals(actualUrl,expectedUrl);
		//soft.assertNotEquals(actualUrl,expectedUrl);		boolean result=actualUrl.equals(expectedUrl);
		
		//if result is equal to true then test method is passed
		//if result is equal to false then test method is false
		//soft.assertTrue(false);
		
		//if result is equal to false then test method is passed
				//if result is equal to true then test method is false
		//soft.assertFalse(false);
		
		//forcefully fail the test method 
		//Assert.fail();
		
		//to take a decision ->passed or failed login in inside the method
		//if(result==true) {
			
			//passed
	    //}
		//else
		//{
			//failed
			//Assert.fail();
		//}
		//to applay the soft assert result on test method
		soft.assertAll();
	






		
		
	}

}
