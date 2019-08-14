package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class NonDMFunnelPage {

	@FindBy(css="[name='desiredAmount']")
	WebElement enterLoanAmount;
	
	@FindBy(css="[class='sc-fAjcbJ.bvkLRg']")
	WebElement loanPurposeDropDown;
	
	@FindBy(css="[role='button']")
	WebElement checkYourRate;
	
	/**
	 * Select dropdown = new Select(testDropDown); 
	 * dropdown.selectByIndex(2); 
	 */
	

	public NonDMFunnel() {
		
	}
	
	
}
