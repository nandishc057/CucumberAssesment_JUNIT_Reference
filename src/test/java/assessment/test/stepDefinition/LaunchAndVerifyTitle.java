package assessment.test.stepDefinition;


import assessment.pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LaunchAndVerifyTitle {
	LoginPage  lp = new LoginPage();

	@Given("^Navigate with given url \"([^\"]*)\"$")
	public void navigate_with_given_url(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	/*	System.out.println("S1");
		lp.navigateToURL(arg1);*/
	}

	@When("^application is openned$")
	public void application_is_openned() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^Close any child Browser is opened$")
	public void Close_any_child_Browser_is_opened() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
//		            lp.closeAnyChildBrowserOpened();
	}

	@Then("^Verify title$")
	public void verify_title() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
//		            lp.verifyTitle();
	}
}
