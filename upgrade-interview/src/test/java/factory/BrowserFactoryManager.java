package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactoryManager {
	
	public WebDriver driver;
	
//	private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();
	
//	public static WebDriver getDriver() {
//		return webDriver.get();
//	}
//	
//	public static void setWebDriver(WebDriver driver) {
//		webDriver.set(driver);
//	}
	
	public static WebDriver getWebDriver(WebDriver driver) {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Aparna\\Browsers\\chromedriver.exe");
		  driver = new ChromeDriver();
		  return driver;
	}
	
}
