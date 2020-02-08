package stepDefinitions;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.Test;

@CucumberOptions(features = "src/test/resources/features",
        format = { "pretty", "json:target/cucumber.json" },
        glue = "stepDefinitions",
        dryRun = false,
        monochrome = true

)
public class TestSuiteRunner {
    @Test(groups = "testSuite", description = "Test Suite")
    public void runCukes() {
        new TestNGCucumberRunner(getClass()).runCukes();
    }

}

