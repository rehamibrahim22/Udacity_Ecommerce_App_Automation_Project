package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\main\\resources\\Features",
        glue = "StepDefinitions",
        tags = "@demo_Ecommerce",
        plugin = {"pretty",
                "html:target/cucumber.html",
                "json:target/cucmber.json",
                "junit:target/cukes.xml",
                "rerun:target/rerun.txt"}
        //monochrome =
)

public class TestRunner extends AbstractTestNGCucumberTests {
}
