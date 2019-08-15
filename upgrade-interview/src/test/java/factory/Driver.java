package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    public static WebDriver driver=null;
  
    public static WebDriver startdriver(String browser){
        if(browser.equalsIgnoreCase("Chrome"))
        {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aparna\\Browsers\\chromedriver.exe");
	        driver=new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("Firefox"))
        {
        	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Aparna\\Browsers\\geckodriver.exe");
        	driver=new FirefoxDriver();

        }
     return driver;
    }
}
