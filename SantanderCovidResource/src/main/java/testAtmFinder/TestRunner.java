package testAtmFinder;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/nsarker/eclipse-workspace/SantanderCovidResource/features/covid19Resource.feature",
				glue = "stepDefinations", 
				plugin = "html:result.html", 
				monochrome = true)

public class TestRunner {

}
