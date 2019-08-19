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

import pages.PersonalInformationPage1;
import factory.Driver;


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
//	@FindBy(css="[type='checkbox']")
	WebElement termsAndAgreementCheckBox;
	
	@FindBy(css="[type='submit']")
	WebElement checkYourRateButton;
	
	public PersonalInformationPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterIndividualInformation() throws Exception {
		firstName.sendKeys("Random");
		lastName.sendKeys("Random");
		streetAddress.sendKeys("Apt# 203 Ballston Common");
		city.sendKeys("Arlington");
		state.sendKeys("Virginia");
		zipCode.sendKeys("22201");
		datteOfBirth.sendKeys("01/01/2000");
		individualIncome.sendKeys("100,000");
		additionalIncome.sendKeys("5,000");
		emailAddress.sendKeys("candidate+1233@upgrade-challenge.com");
		password.sendKeys("1234$#A!");
		termsAndAgreementCheckBox.click();
		checkYourRateButton.submit();
	}

}
