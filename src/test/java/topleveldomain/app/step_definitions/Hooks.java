package topleveldomain.app.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import topleveldomain.app.utils.Driver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before("@ui")
    public void setUp() {
        // we put a logic that should apply to every scenario
        //This logic will wait for 10 seconds until the element is found
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @After("@ui")
    public void tearDown(Scenario scenario) {
        // only takes a screenshot if the scenario fails
        if (scenario.isFailed()) {
            // taking a screenshot
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png","screenshot");
        }
        Driver.closeDriver();
    }



}
