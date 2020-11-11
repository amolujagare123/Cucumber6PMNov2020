package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features\\login.feature",
        glue="stepDefinitions",

        plugin={"pretty","html:target/cucumber.html",
                "json:target/cucumber.json"
,"junit:target/cuckes.xml"}

//, dryRun = true
/* ,tags =  "@login"*/)
public class TestRunner {
}
