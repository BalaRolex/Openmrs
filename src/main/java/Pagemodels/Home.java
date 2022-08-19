package Pagemodels;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Datahandlers.Datahandle;
import Pages.HomePage;


public class Home extends Datahandle {
	WebDriver driver;
	HomePage ho;
	
	public Home(WebDriver driver)
	{
		this.driver=driver;
		ho=new HomePage(driver);
	}
	   
	public void FindPatient()
	{
		click(ho.FindPatient());
	}

}
