package tests;

import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
import pages.PersonalInformationPage1;

//========================================

// Page classes Imported for this Test Class

//============================================

public class PersonalInformationPage1Test extends Driver{
// ========================================
// INSTANTIATE PAGES TO BE TESTED
// ============================================
private PersonalInformationPage1 personalIormationPage1;    
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
   public void verifyNonDMFunnelTest() {
	   Driver.startdriver("firefox");
////	   driver.get("https://www.credify.tech/portal/login");		
	   WebDriverWait wait = new WebDriverWait(driver, 20);
	   wait.until(ExpectedConditions.urlContains("https://www.credify.tech/phone/personal-information-1"));
    }

// ==========================================================
// TEST CASES
// ===========================================================              

	@Test
	public void testCompleteUserInformation() throws Exception {
	   PersonalInformationPage1 personalInfoPageObject = new PersonalInformationPage1(driver);
	   personalInfoPageObject.enterIndividualInformation();
	   Thread.sleep(5000);
	 }
	
	 @AfterClass
	    public void teardown () {
	        driver.quit();
	    }
}

              

