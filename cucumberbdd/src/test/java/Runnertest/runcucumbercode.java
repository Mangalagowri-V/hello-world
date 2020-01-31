package Runnertest;

//import java.io.File;

//import org.junit.AfterClass;
import org.junit.runner.RunWith;

//import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/BddFeature",glue = {"SeleniumCode"},plugin = {"pretty", "html:target/cucumber-reports","json:target/cucumber-reports/Cucumber.json"},monochrome =true)

public class runcucumbercode {
	
	
	 }

