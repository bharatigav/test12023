package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOrSignUpPage {
WebDriver driver;  
	
	@FindBy(id = "email")
	private WebElement userName;
	
	@FindBy(id = "pass")
	private WebElement passWord;
	
	@FindBy(id = "loginbutton")
	private WebElement loginButton;
	
	//@FindBy(id = "CancleButton")
	//private WebElement CancleButton;
	
	@FindBy(xpath = "//*[text()='Forgotten password?']")
	private WebElement forgotPassword;
	
	public LoginOrSignUpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void sendUserName(String user) {
		userName.sendKeys(user);
	}
	
	public void sendPassword(String pass) {
		passWord.sendKeys(pass);
	}
	
	public void clickOnLogin() {
		loginButton.click();
	}
	
	public void clickOnforgotPassword() {
		forgotPassword.click();
	}
	


}
