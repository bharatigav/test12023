package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword {
	WebDriver driver;
	
	@FindBy(id = "email")
	private WebElement emailOrPhoneNo;
	
	@FindBy(id = "did_submit")
	private WebElement searchButton;
	
	@FindBy(id = "CancleButton")
	private WebElement CancleButton;
	
	public ForgotPassword(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void SendEmailOrPhoneNo(String phone) {
		emailOrPhoneNo.sendKeys(phone);
	}
	
	public void ClickOnSearchButton() {
		searchButton.click();
	}
	
	public void ClickOnCancleButton() {
		CancleButton.click();
	}
	

}
