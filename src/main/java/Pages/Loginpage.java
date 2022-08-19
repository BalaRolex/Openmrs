package Pages;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;





public class Loginpage  {
	WebDriver driver;
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	By username=By.xpath("//input[@id='username']");
	By password=By.xpath("//input[@id='password']");
	By location=By.xpath("//ul[@id=\"sessionLocation\"]/li");
	By login=By.cssSelector("input[id='loginButton']");

	
	
	public WebElement Username()
	{
		return driver.findElement(username);
	}
	public WebElement Password()
	{
		return driver.findElement(password);
	}
	public List<WebElement> Location()
	{
		return driver.findElements(location);
	}
	
	public WebElement Login()
	{
		return driver.findElement(login);
	}
	
	
	
	
	
	
	
			

}
