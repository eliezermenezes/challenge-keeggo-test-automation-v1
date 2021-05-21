package advantageshopping;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features"},
        glue = {"bdd/glue"},
        tags = "@Scenario",
        publish = true,
        plugin = {"pretty","html:target/cucumber-report/cucumber.html",
                "json:target/cucumber-report/cucumber.json",
                "junit:target/cucumber-report/cucumber.xml"}

)
public class RunCucumberTest extends AppiumServer {

    @AfterClass
    public static void tearDownDriver() {
        service.stop();
    }
}
