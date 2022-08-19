package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\Feature",
		glue={"StepDef"}, 
		dryRun = false,    
	    //plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter"}
		plugin= {"pretty","json:target/cucumber/reports/Cucumber.json",
				"html:target/cucumber/reports/report.html",
				"junit:target/cucumber/reports/reports.xml"},
		monochrome=true
		)


public class TestRunner   {


}
