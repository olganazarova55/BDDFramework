package topleveldomain.app.runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "@target/rerun.txt",
        glue = "topleveldomain/app/step_definitions"
)

public class FailedTestsRunner extends AbstractTestNGCucumberTests {
}
