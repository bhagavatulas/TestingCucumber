package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
	(
		glue        =  {"CRM_StepDefinitions", "Guru_StepDefinitions"},
		features  =  {"FeatureFiles_CRM", "FeatureFiles_Guru"},
		plugin     =  {"pretty", "html:target/cucumber-reports"}
	)

public class RunJUnitTest {

}