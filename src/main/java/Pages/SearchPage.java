package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	WebDriver driver;
	public SearchPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	By searchbox=By.xpath("//input[@id='patient-search']");
	
	
	
	public WebElement SearchBox()
	{
		return driver.findElement(searchbox);
	}

}
