package assessment.test.stepDefinition;

import assessment.pages.HomePage;
import assessment.pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VerifyUserDetails {

	LoginPage lp = new LoginPage();
	HomePage hp = new HomePage();

	@Given("^User is in Login Page with given url \"([^\"]*)\"$")
	public void user_is_in_Login_Page_with_given_url(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
/*		lp.navigateToURL(arg1);
		lp.checkUserInLoginPage();
		System.out.println("S2");*/
	}

	@When("^User enters \"([^\"]*)\"$")
	public void user_enters(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
//		lp.sendUserName(arg1);
	}

	@When("^User enters and \"([^\"]*)\"$")
	public void user_enters_and(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
//		lp.sendPassword(arg1);
	}

	@When("^user click on Login button$")
	public void user_click_on_Login_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
//		lp.clickLoginButton();

	}

	@Then("^user can able to navigate homepage$")
	public void user_can_able_to_navigate_homepage() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^Logout from application$")
	public void logout_from_application() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
//		hp.logout();
	}

	@When("^User enters invalid username \"([^\"]*)\"$")
	public void user_enters_invalid_username(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
//		lp.sendUserName(arg1);
	}
	
	@When("^User enters invalid password \"([^\"]*)\"$")
	public void user_enters_invalid_password(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
//		lp.sendPassword(arg1);
	}
	@Then("^User can see error message$")
	public void user_can_see_error_message() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^User cant able to login$")
	public void user_cant_able_to_login() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

}
