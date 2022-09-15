package runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features/"},
		glue = {"stepdefination", "hooks"},
		monochrome = true,	
	    tags = "@GuestUser",
		dryRun = false,
		stepNotifications=true,
		plugin = {
                        "pretty",
                        "json:target/cucumber-report/cucumber.json",
                        "html:target/cucumber-report/cucumber.html"}
		         )

public class runner {

}

//CUCUMBER_PUBLISH_TOKEN=e5a3df1c-aa53-4e31-8246-69f7ea912bc1