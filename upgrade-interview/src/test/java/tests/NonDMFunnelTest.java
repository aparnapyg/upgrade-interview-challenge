package tests;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import factory.Driver;
import pages.LoginPage;
import pages.NonDMFunnelPage;
import pages.OfferPage;
import pages.PersonalInformationPage1;

/**
 * Registration test class triggered from NonDMFunnel page
 * takes in user information and allows user to shop
 * for a loan at given interest rate and term period.
 * 
 * Grabs a screen shot at the offer-page
 * so screen shots from at the time of registration 
 * can be compared to screen shot of offer-page after 
 * user login.
 * @author Aparna
 *
 */
public class NonDMFunnelTest extends Driver{
	// ========================================
	// INSTANTIATE PAGES TO BE TESTED
	// ============================================
	private NonDMFunnelPage nonDMFunnelPage;    
	/**
	 ** DataProvider: DataProvider is used to return specific data as per the
	 * test method name This is used to specify the source where test data is
	 * * coming from. Ensure all your test data is in the data sheet.
	 * * @return Object array
	*/        

	// ===========================================================================================
	// INITIALIZE THE BROWSER AND ALL PAGE OBJECTS THAT ARE TO USED BY THE TEST
	// CASES
	// ===========================================================================================
	   /**
	   * Run when the test method runs
	   */
	   @BeforeClass
	   public void setup() {
		   Driver.startdriver("firefox");
		   driver.get("https://www.credify.tech/phone/nonDMFunnel");		  
	    }

	// ==========================================================
	// TEST CASES
	// ===========================================================              

		@Test
		public void testEnterLoanCriteria() throws Exception {
		   NonDMFunnelPage nonDMFunnelObject = new NonDMFunnelPage(driver);
		   nonDMFunnelObject.enterLoanAmount("1000");
		   nonDMFunnelObject.enterLoanPurpose(2);
		   nonDMFunnelObject.clickCheckYourRate();
		   
		   PersonalInformationPage1 personalInfoPageObject = new PersonalInformationPage1(driver);
		   personalInfoPageObject.enterIndividualInformation();
		   
		   OfferPage offerObject = new OfferPage(driver);
			  
		   //Grab screen shot of offer page
		   
		   File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	       try {
	           FileUtils.copyFile(src, new File("OfferAfterRegistration.png"));
	       } catch (IOException e) {
	           // TODO Auto-generated catch block
	           e.printStackTrace();
	       }
	      
		   offerObject.clickLogOutLink();
		 }
		
		
		 @AfterClass
		    public void teardown () {
		        driver.quit();
		    }
}
