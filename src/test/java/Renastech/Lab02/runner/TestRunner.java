package Renastech.Lab02.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources", //this is for feature files path
        glue = "Renastech/Lab02/stepDefinitions", //this is for steps path
        tags = "@Lab02",
        dryRun = false // when it is true it will check if there is any undefined steps

)
public class TestRunner {

}
