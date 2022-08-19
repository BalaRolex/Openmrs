package StepDef;


import java.io.IOException;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import DriverManager.WebdriverManager;
import Pagemodels.Home;
import Pagemodels.Login;
import Pagemodels.Searchbox;
import dataproviders.configReader;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class SearchStepDe  {
    WebDriver driver;
    configReader configReader;
    WebdriverManager webDriverManager;
	Login log;
	Home Hom;
	Searchbox S;
	@Given("^Login into application$")
    public void login_into_application() throws Throwable {
		webDriverManager=new WebdriverManager();
		driver=webDriverManager.getDriver();
		configReader=new configReader();
		driver.get(configReader.ApplicationUrl());
    	 log=new Login(driver);
         log.LoginUsername("admin");
         log.LoginPassword("Admin123");
         log.LoginLocation();
 		 log.LoginButton();
    	 
    }
    @When("^Select patient search option$")
    public void select_patient_search_option() throws Throwable {
    	Hom=new Home(driver);
	    Hom.FindPatient();
    }

    @And("^Enter patient(.+) in search box$")
    public void enter_patient_in_search_box(String name) throws Throwable {
    	S=new Searchbox(driver);
    	S.SearchBox(name);
    }

    @Then("^validate whether patient name is displayed$")
    public void validate_whether_patient_name_is_displayed() throws Throwable {
    	Assert.assertEquals("Home", driver.getTitle());
        
    }
}