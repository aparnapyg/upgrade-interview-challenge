package tests;

import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

import factory.BrowserFactoryManager;
import pages.LoginPage;


//========================================

// Page classes Imported for this Test Class

//============================================

//public class LoginTest implements IHookable {
public class LoginTest{
// ========================================
// INSTANTIATE PAGES TO BE TESTED
// ============================================
private LoginPage loginPage;    
public WebDriver driver;
/**
 ** DataProvider: DataProvider is used to return specific data as per the
 * test method name This is used to specify the source where test data is
 * * coming from. Ensure all your test data is in the data sheet.
 * * @return Object array
*/

///**
//  * setUp is a @BeforeMethod executed before execution of a @Test
//   *
//* @param browser_
//
//   * @param driver_
//
//   * @param env_
//
//   * @param url_
//
//   */
//
//   @BeforeMethod
//
//   @Parameters({ "Browser_", "Driver_", "Env_", "URL_" })
//
//   public void setUp(@Optional("browser") String browser_,
//
//             @Optional("webDriver") String driver_,
//
//             @Optional("env") String env_, @Optional("url") String url_) {
//
//  boolean error = false;
//
//  browser = browser_;
//
//  webDriver = driver_;
//
//  environment = System.getenv("ENVNAME");
//
//  url = "https://www." + environment + ".bsc.bscal.com/admin/bsc/csr/csr_90.sp";
//
// 
//
//               }
//
// 
//
//               /**
//
//   * @Override run is a hook before @Test method
//
//   */
//
//   /**
//
//   * @Override run is a hook before @Test method
//
//   */
//
//   @Override
//
//   public void run(IHookCallBack callBack, ITestResult testResult) {
//
//                  initBrowser(testResult.getTestName(), testResult.getMethod()
//
//                                                .getMethodName());
//
//                  reportInit(testResult.getTestContext().getName(), browser,
//
//                                                callBack.getParameters()[0].toString(), testResult.getMethod()
//
//                                                                              .getMethodName());
//
//                  softAssert = new SoftAssert();
//
//                  logger.log(LogStatus.INFO, "Starting test " + testResult.getName());
//
//  callBack.runTestMethod(testResult);
//
//  softAssert.assertAll();
//
//  System.out.println("soft assert complete");
//
//               }
            

// ===========================================================================================
// INITIALIZE THE BROWSER AND ALL PAGE OBJECTS THAT ARE TO USED BY THE TEST
// CASES
// ===========================================================================================
   /**
   * Run when the test method runs
   */
   @BeforeClass
   public void setup() {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\Aparna\\Browsers\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get("https://www.credify.tech/portal/login");		  
   }

// ==========================================================
// TEST CASES
// ===========================================================              

	@Test
	public void testlogin() throws Exception {
	   LoginPage loginObject = new LoginPage(driver);
	   loginObject.setUserName("candidate+123@upgrade-challenge.com");
	   loginObject.setPassword("Apa040882");
	   loginObject.signIn();
	   Thread.sleep(5000);
	 }
	
	 @AfterClass
	    public void teardown () {
	        driver.quit();
	    }
}

              

