package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		publish=true,
		plugin= {"pretty","html:target/sauceDemoReport.html"},
		monochrome=true,
		features= {"src/test/java/features/SauceDemo.feature"},
		glue="steps"
				)
public class Runner extends AbstractTestNGCucumberTests{
	
	}