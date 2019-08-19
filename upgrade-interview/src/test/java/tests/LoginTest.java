package tests;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.Driver;
import pages.LoginPage;
import pages.OfferPage;
import utilities.Users;

//========================================

// Page classes Imported for this Test Class

//============================================
/**
 * Login test class that logs into upgrade application
 * with User object and then grabs a screen shot of the 
 * offer-page.
 * 
 * @author Aparna
 *
 */

public class LoginTest extends Driver{
// ========================================
// INSTANTIATE PAGES TO BE TESTED
// ============================================
private LoginPage loginPage;    
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
	   Driver.startdriver("chrome");
	   driver.get("https://www.credify.tech/portal/login");		  
    }

// ==========================================================
// TEST CASES
// ===========================================================              

	@Test
	public void testlogin() throws Exception {
	   LoginPage loginObject = new LoginPage(driver);
	   loginObject.setUserName(Users.ACCTHOLDR_1.getUserName());
	   loginObject.setPassword(Users.ACCTHOLDR_1.getPassword());
	   loginObject.signIn();
	   
	   //Once on the offer page
	   OfferPage offerObject = new OfferPage(driver);
	  
	   //Grab screen shot of offer page
	   
	   File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       try {
           FileUtils.copyFile(src, new File("OfferAfterLogin.png"));
       } catch (IOException e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
       }
       WebDriverWait wait = new WebDriverWait(driver,40);
       wait.until(ExpectedConditions.urlContains("offer-page"));
       wait.until(ExpectedConditions.elementToBeClickable(offerObject.defaultLoanSelection));
	   offerObject.clickLogOutLink();
	 }
	
	 @AfterClass
	    public void teardown () {
	        driver.quit();
	    }
}

              

