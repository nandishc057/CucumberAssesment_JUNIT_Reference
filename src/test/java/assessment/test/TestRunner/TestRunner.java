package assessment.test.TestRunner;

import java.io.File;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "./src/test/java/assessment/test/feature/VerifyUserDetails.feature",
		"./src/test/java/assessment/test/feature/ValidInput.feature",
		"./src/test/java/assessment/test/feature/LaunchAndVerifyTitle.feature" }, glue = {
				"assessment.test.stepDefinition", "assessment.generic" }, plugin = { "html:test-output/Cucumber-report",
						"pretty",
						"com.cucumber.listener.ExtentCucumberFormatter:" },
						strict = true,
						dryRun = false,
						monochrome = true, 
						tags = {})//"@E2E","@smoke"
public class TestRunner {
	// ExtentCucumberFormatter.initiateExtentCucumberFormatter(newFile,false);

	@BeforeClass
	public static void extentReportMth() {
/*		Reporter.loadXMLConfig(new File("./src/test/resources/ReportsConfig.xml"));
 * Is moved to Utilites.class
 * 
 */
		Date date = new Date();
		String dateString = date.toString().replace(":", "_").replace(" ", "_");
		String ExtentReport = "./ExtentReport" + "-" + dateString;


		ExtentProperties extentProperties = ExtentProperties.INSTANCE;
		extentProperties.setReportPath(ExtentReport + ".html");

	}

}
