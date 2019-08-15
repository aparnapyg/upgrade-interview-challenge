package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OfferPage {
	
	@FindBy(css="[data-auto='getDefaultLoan']")
	WebElement defaultLoanSelection;
	
	@FindBy(css="[label='header-nav-toggle']")
	WebElement menuDropDown;
	
	@FindBy(css="a[href$='/logout']")
	WebElement logOutLink;
	
	
	public OfferPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}


	public void saveDefaultLoanSelection() {
		defaultLoanSelection.submit();
	}

	public void clickLogOutLink() {
		menuDropDown.click();
		logOutLink.click();
	}
}
