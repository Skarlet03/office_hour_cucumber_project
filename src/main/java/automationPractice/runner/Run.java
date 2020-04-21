package automationPractice.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features",
        glue = "automationPractice/step_definitions",
        dryRun = true,
        tags = "@"
)

public class Run {



}
