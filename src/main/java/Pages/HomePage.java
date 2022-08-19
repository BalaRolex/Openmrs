package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	By search=By.xpath("//a[@id='coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension']");
	
	public WebElement FindPatient()
	{
		return driver.findElement(search);
	}
	
}
