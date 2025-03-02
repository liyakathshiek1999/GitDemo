package Stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@CucumberOptions(
		features ="src\\main\\resources\\FeatureFileFolder",
		glue = "Stepdefinition",
		monochrome = true,
		stepNotifications = true,
		plugin= {
				"pretty",
				"html:target/cucumberhtmlreports.html",
				"json:target/cucumberhtmlreports.json",
		}
		
		
		
		)
@RunWith(Cucumber.class)
public class Runner {
	
	

}
