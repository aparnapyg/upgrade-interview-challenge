package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.NonDMFunnelPage;
import factory.Driver;

public class NonDMFunnelPage {

	@FindBy(css="[name='desiredAmount']")
	WebElement enterLoanAmount;
	
	@FindBy(css="[data-auto='dropLoanPurpose']")
	WebElement loanPurpose;
	
	@FindBy(css="[type='submit']")
	WebElement checkYourRate;

	public NonDMFunnelPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterLoanAmount(String loanAmount) {
		enterLoanAmount.click();
		enterLoanAmount.sendKeys(loanAmount);
	}
	
	public void enterLoanPurpose(int dropDownIndex) {
		Select loanPurposeDropDown = new Select(loanPurpose);
		loanPurposeDropDown.selectByIndex(dropDownIndex);
	}
	
	public void clickCheckYourRate() {
		checkYourRate.submit();
	}
	
}
