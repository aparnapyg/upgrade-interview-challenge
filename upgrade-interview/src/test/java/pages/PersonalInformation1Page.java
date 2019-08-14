package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class PersonalInformationPage1 {
	
	@FindBy(css="[role='radio']")
	WebElement individualjointApplicationRadio;
	
	@FindBy(css="[name='borrowerFirstName']")
	WebElement firstName;
	
	@FindBy(css="[name='borrowerLastName']")
	WebElement lastName;
	
	@FindBy(css="[name='borrowerStreet']")
	WebElement streetAddress;
	
	@FindBy(css="[name='borrowerCity']")
	WebElement city;
	
	@FindBy(css="[name='borrowerState']")
	WebElement state;
	
	@FindBy(css="[name='borrowerZipCode']")
	WebElement zipCode;
	
	@FindBy(css="[name='borrowerDateOfBirth']")
	WebElement datteOfBirth;
	
	@FindBy(css="[name='borrowerIncome']")
	WebElement individualIncome;
	
	@FindBy(css="[name='borrowerAdditionalIncome']")
	WebElement additionalIncome;
	
	@FindBy(css="[name='username']")
	WebElement emailAddress;
	
	@FindBy(css="[name='password']")
	WebElement password;
	
	@FindBy(css="[class='sc-kfGgVZ sc-esjQYD fCisXT']")
	WebElement termsAndAgreementCheckBox;
	
	@FindBy(css="[role='button']")
	WebElement checkYourRateButton;
	
	public PersonalInformation1() {
		
	}

}
