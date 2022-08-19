package DriverManager;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Enum.DriverType;
import Enum.EnvionmentType;
import dataproviders.configReader;
import io.cucumber.java.Before;

public class WebdriverManager  {
	private WebDriver driver;
	private static DriverType DriverType;
	private static EnvionmentType EnvironmentType;
	private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
	private static final String EDGE_DRIVER_PROPERTY = "webdriver.edge.driver";
	configReader cofr;
	public WebdriverManager() throws IOException {
		cofr=new configReader();
		DriverType = cofr.getBrowser();
		EnvironmentType =cofr.getEnvironment();
	}
	public WebDriver getDriver() {
		if(driver == null) driver = createDriver();
		return driver;
	}
	private WebDriver createDriver() {
		   switch (EnvironmentType) {	    
	        case LOCAL : driver = createLocalDriver();
	        	break;
	        case REMOTE : driver = createRemoteDriver();
	        	break;
		   }
		   return driver;
		   
}
	private WebDriver createRemoteDriver() {
		throw new RuntimeException("RemoteWebDriver is not yet implemented");
	}
	private WebDriver createLocalDriver() {
        switch (DriverType) {	    
        case MICROSOFTEDGE : 
        	System.setProperty(EDGE_DRIVER_PROPERTY, cofr.getedgeDriverPath());
        	driver = new EdgeDriver();
	    	break;
        case CHROME: 
        	System.setProperty(CHROME_DRIVER_PROPERTY, cofr.getchromeDriverPath());
        	driver = new ChromeDriver();
    		break;
        }
        if(cofr.getBrowserWindowSize())
        	driver.manage().window().maximize();
		return driver;
	 }
        
      public void closeDriver() {
    		driver.close();
    		driver.quit();
    	}

   
}
