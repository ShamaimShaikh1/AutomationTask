package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions (
		features = {".//features/Login.feature",".//features/Logout.feature"},
		glue = "StepDefinition",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:target/cucmber-reports/reports1.html"}
		)

public class Run {
}
