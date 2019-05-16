package runner;

import cucumber.api.cli.Main;
import org.testng.annotations.Test;

public class TestRunner {
    //Runner for tests
    @Test
    public void testRunner() {
        Main.main(new String[]{"--threads", "3",
                "-p", "pretty",
                "-p", "html:target/cucumber-report",
                "-p", "json:target/cucumber-report/cucumber.json",
                "-g", "stepsDefinition", "src/test/java/features"});
    }
}
