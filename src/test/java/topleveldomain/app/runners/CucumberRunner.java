package topleveldomain.app.runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (

        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt" ,
                "json:target/cucumber.json"
        },
        features = "src/test/resources/features" ,
        glue = "topleveldomain/app/step_definitions",
        dryRun = false,
        tags = "@wip",
        publish = true // will publish reports in the browser

)

public class CucumberRunner extends AbstractTestNGCucumberTests {
}
