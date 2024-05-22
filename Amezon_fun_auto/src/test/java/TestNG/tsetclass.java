package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.ForgotPassword;
import Pages.LoginOrSignUpPage;

//import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

public class tsetclass {
	
	WebDriver driver;
	
	private LoginOrSignUpPage loginOrSignUpPage;
	private ForgotPassword forgotPassword;
	@Parameters("browser")
	@BeforeTest
	 public void LaunchBrowser(String browserName) {
			
		 System.out.println("BeforeClass");
		 System.out.println("browserName");//print browser key
		 
		 if(browserName.equals("Chrome"));
		 {
			 driver=new ChromeDriver();
		 }
		 if(browserName.equals("Firefox"));
		 {
			 driver=new FirefoxDriver();
		 }
		 if(browserName.equals("Edge"));
		 {
			 driver=new EdgeDriver();
		 }
		 driver.manage().window().maximize();
		 //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 
		 
		 }
	@BeforeClass 
	 public void beforeclass() {
		
		 System.out.println("BeforeClass");
		 LoginOrSignUpPage loginOrSignUpPage  =new LoginOrSignUpPage(driver);
		 ForgotPassword forgotPassword = new ForgotPassword(driver);
		 }
	 @BeforeMethod
	 public void LaunchForgoatPasswordForm() {
		 System.out.println("beforeMethod");
		 driver.get("https://www.facebook.com");
		 LoginOrSignUpPage loginOrSignUpPage  =new LoginOrSignUpPage(driver);
		 loginOrSignUpPage.sendUserName("bharti");
		 loginOrSignUpPage.sendPassword("12345");
		 loginOrSignUpPage.clickOnforgotPassword();
	 }
	 @Test
	 public void verifyPasswordShouldBeSucessfully() {
		 System.out.println("Test 1");
		 ForgotPassword forgotPassword = new ForgotPassword(driver);
		 //loginOrSignUpPage.clickOnforgotPassword();
		 forgotPassword.SendEmailOrPhoneNo("bharti");
		 forgotPassword.ClickOnSearchButton();
		 
	 }
	 
	 @Test
	 public void verifyErrorMessageWhenPasswordFunctionalityUsed() {
		 System.out.println("Test 1");
		 ForgotPassword forgotPassword = new ForgotPassword(driver);
		 //loginOrSignUpPage.clickOnforgotPassword();
		 forgotPassword.SendEmailOrPhoneNo("hjdhgfhf");
		 forgotPassword.ClickOnCancleButton();
		 
	 }
	 
	 @AfterMethod
	 public void captureScreenshotOfFailtestcase() {
		 System.out.println("AfterMethod"); 
		 System.out.println("take a screen shot");
	 }
	 
	 @AfterClass
	 public void afterClassIE() {
		 System.out.println("AfterClass");
		 driver.close();
	 }

}
