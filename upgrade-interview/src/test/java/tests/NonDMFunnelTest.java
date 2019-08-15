package tests;

import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
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
		   Driver.startdriver("chrome");
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
		   Thread.sleep(5000);
		   nonDMFunnelObject.clickCheckYourRate();
		   Thread.sleep(5000);
		 }
		
		 @AfterClass
		    public void teardown () {
		        driver.quit();
		    }
}
