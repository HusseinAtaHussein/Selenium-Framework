package Runner;

import Tests.TestBase;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.cucumber.testng.CucumberOptions;

import java.awt.*;
@CucumberOptions(features = "src/test/java/Features/UserRegisteration.feature",
        glue = "steps",
        plugin= {"pretty","html:target/cucumber-html-report"})
public class TestRunner extends TestBase {
}
