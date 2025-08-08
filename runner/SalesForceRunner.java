package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/java/salesForceLogin.feature"},
glue="stepDefenition",publish=true)
public class SalesForceRunner extends AbstractTestNGCucumberTests {
	 

}
