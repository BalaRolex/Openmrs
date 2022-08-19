package Datahandlers;

import java.io.File;
import java.io.IOException;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.Scenario;


public class Datahandle 
{
public WebDriver driver;

	public void SendInput(WebElement element, String s)
	{
		element.sendKeys(s);
	}

	public void click(WebElement element)	{
		element.click();
	}
	public void screenshot(WebDriver driver,Scenario scenario) throws IOException
	{
		File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen, new File("C:\\Users\\MyPC\\eclipse-workspace\\OpenMrss\\target\\Screens\\"+scenario.getName()));
	}

	

}
