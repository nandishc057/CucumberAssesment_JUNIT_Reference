package assessment.generic;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;

public class Utilities {

	public static void captureScreenShot(Scenario scenarioStatus) {
		Reporter.loadXMLConfig(new File("./src/test/resources/ReportsConfig.xml"));
		if (scenarioStatus.isFailed()) {
			TakesScreenshot screenshot = (TakesScreenshot) DriverSetup.getDriver();
			byte[] scBytes = screenshot.getScreenshotAs(OutputType.BYTES);
			scenarioStatus.embed(scBytes, "image/png");

		}
	}

	public static void moveToElementClick(WebElement element) throws InterruptedException {
		Actions action = new Actions(DriverSetup.getDriver());
		// TODO Auto-generated method stub
		action.moveToElement(element).perform();
		Thread.sleep(10000);

	}

}
