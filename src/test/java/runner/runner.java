package runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features/"},
		glue = {"stepdefination", "hooks"},
		monochrome = true,	
		tags = "@StainlessSteel",
		stepNotifications=true,
		plugin = {"pretty"			
		}
		)


public class runner {

}
