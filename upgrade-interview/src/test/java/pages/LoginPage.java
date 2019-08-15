package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(css="[name='username']")
	WebElement userEmail;
	
	@FindBy(css="[name='password']")
	WebElement userPassword;
	
	@FindBy(css="[type='submit']")
	WebElement signInToYourAccount;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String userName) {
		userEmail.sendKeys(userName);
	}
	
	public void setPassword(String password) {
		userPassword.sendKeys(password);
	}
	
	public void signIn() {
		signInToYourAccount.submit();
	}
}
