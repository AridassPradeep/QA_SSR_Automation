package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features", 
plugin = {
        "pretty",
        "json:target/cucumber-report/cucumber.json",
        "html:target/cucumber-report/cucumber.html"},
monochrome = true,
tags = "@CartSize",
glue= {"stepDefinations"})
public class runner {
	

}