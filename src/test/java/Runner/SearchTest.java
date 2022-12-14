package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/AppFeatures",
		glue = {"stepDefinition"},											// tags can also go here.
		plugin = {"pretty" , "json:target/MyReport/report.json",
				"junit:target/MyReport/report.xml"
		}
		
		
		)
public class SearchTest {

}
