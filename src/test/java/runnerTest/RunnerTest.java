package runnerTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@Flipkart",  plugin={"json:target/cucumber.json"} , monochrome = true, glue = {
		"testcases" }, features = "src\\test\\resources\\feature")

public class RunnerTest {

}