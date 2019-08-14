package factory;

import org.openqa.selenium.WebDriver;

public class BrowserFactory {
	{
	    /**
	     * Factory method to create an instance of the browser web Webdriver 
	     * and pass the page url to the browser.
	     */
		
		public static WebDriver startBrowser(String browserName, String sdriver, String url) {
		Webdriver webDriver = null;
		if(browserName.equalsIgnoreCase("firefox")) {
			webDriver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", sdriver+"\\IEDriverServer.exe");
			DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
			caps.setCapability("ignoreZoomSetting",true);
			caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKNESS_BY_IGNORING_SECURITY_DOMAINS,true);
			InternetExplorerDriverService.builder ies = new InternetExplorerDriverService.Builder();
			File ie_temp = new File(sdriver);
			ies.withExtractPath(ie_temp);
			InternetExplorerDriverService service = ies.build();
			webDriver = new InternetExplorerDriver(service,caps);
		}else if (browserName.equalsIgnoreCase("Safari")) {
			webDriver = new SafariDriver();
		}
		else if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", sdriver);
			webDriver = new ChromeDriver();
		}
		webDriver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		webDriver.manage().window().maximize();
		webDriver.get(url);
		return webDriver;
		}
	}

}
