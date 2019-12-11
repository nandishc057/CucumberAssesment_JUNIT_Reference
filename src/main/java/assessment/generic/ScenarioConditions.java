package assessment.generic;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ScenarioConditions {

	@Before
	public void preCondition() {
		System.out.println("BEFORE");
//		DriverSetup.initDriver();
	}

	@After
	public void postCondition(Scenario scenarioStatus) throws InterruptedException {
		System.out.println("AFTER");
		Utilities.captureScreenShot(scenarioStatus);
		DriverSetup.tearDown();

	}
}
