package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features/all.feature",
		glue="StepDefinition",
		plugin = {"pretty", "html:target/cucumberReports.html", "junit:target/xmlreport.xml"},
		publish = true,
		monochrome=true
		)

public class TestRunner {

	

}
 