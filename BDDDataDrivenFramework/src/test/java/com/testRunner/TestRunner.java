package com.testRunner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "FeatureFiles"
		,glue={"com.AutomationFramework.stepDefination"}, tags= {"@shiva"}
		)
public class TestRunner {

}
