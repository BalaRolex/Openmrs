package Pagemodels;

import org.junit.Assert;

import org.openqa.selenium.WebDriver;

import Datahandlers.Datahandle;
import Pages.SearchPage;


public class Searchbox extends Datahandle {
	WebDriver driver;
	SearchPage sb;
	
	public Searchbox(WebDriver driver)
	{
		this.driver=driver;
		sb=new SearchPage(driver);
	}
	
	public void SearchBox(String searchinput)
	{
		Assert.assertTrue(sb.SearchBox().isDisplayed());
		SendInput(sb.SearchBox(),searchinput);
	}
	

}
