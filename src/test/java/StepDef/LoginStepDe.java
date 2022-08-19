package StepDef;


import java.io.IOException;


import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import utilities.Log;
import Datahandlers.Datahandle;
import DriverManager.WebdriverManager;
import Pagemodels.Login;
import dataproviders.configReader;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
public class LoginStepDe extends Datahandle  {
	WebDriver driver;
	Login log;
	WebdriverManager webDriverManager;
	configReader configReader;
	@Given("Launch browser")
	public void launch_browser() throws IOException {
		webDriverManager=new WebdriverManager();
		driver=webDriverManager.getDriver();
		configReader=new configReader();
		driver.get(configReader.ApplicationUrl());
	    Assert.assertEquals("Login", driver.getTitle());
	}
	@When("^user enters (.+) and (.+) in login field$")
    public void user_enters_and_in_login_field(String username, String password) throws Throwable {
        log=new Login(driver);
        log.LoginUsername(username);
        log.LoginPassword(password);
  
    }
	
	 @When("^user select location and click login$")
	    public void user_select_location_and_click_login() throws Throwable {
	    log.LoginLocation();
		log.LoginButton();
		
		
	}
    @Then("^validate whether home page displayed$")
    public void validate_whether_home_page_displayed() throws Throwable {
    	Assert.assertEquals("Home", driver.getTitle());
    	
    }
    
    @AfterStep
	public void addScreenshot(Scenario scenario) throws IOException{
    	if(scenario.isFailed())
    	screenshot(driver,scenario);
    }
	 
    	
}
	
   
	



	






   

    