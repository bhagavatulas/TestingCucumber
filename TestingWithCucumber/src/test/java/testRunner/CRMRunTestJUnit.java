package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
	(
		glue        =  {"CRM_StepDefinitions"},
		features  =  {"FeatureFiles_CRM"},
		plugin     =  {"pretty", "html:target/cucumber-reports"}
	)

public class CRMRunTestJUnit {

}