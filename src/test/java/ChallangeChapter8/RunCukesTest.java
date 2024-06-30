package ChallangeChapter8;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"ChallangeChapter8"},
        plugin = {
                "pretty",
                "html:target/report-cucumber.html",
                "json:target/cucumber-json.json"
        }
)

public class RunCukesTest extends AbstractTestNGCucumberTests {
}
