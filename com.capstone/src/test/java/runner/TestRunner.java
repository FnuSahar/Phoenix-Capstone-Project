package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import ulitities.CucumberReportingConfig;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features",

		glue = "stepDefinitions", // "src\\test\\java\\stepDefinitions",

		tags = "",
		//@Desktop  passed
		//@LaptopAndNotebook  passed
        //@homePage   passed
		//@Register
		//@Retail   passed, need new account to pass each time
		dryRun = false,

		monochrome = true,

		plugin = { "pretty", "html:target/site/cucumber-pretty", "json:target/cucumber.json" }, publish = true

)

public class TestRunner {

	@AfterClass
	public static void generateReport() {
		CucumberReportingConfig.reportConfig();
	

}
			
			
			
	
	}
