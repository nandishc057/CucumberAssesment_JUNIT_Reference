package assessment.pages;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import assessment.generic.DriverSetup;

public class LoginPage {
	@FindBy(xpath = "//input[@class='_2zrpKA _1dBPDZ']")
	private WebElement userName;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement userPassword;
	@FindBy(xpath = "//a[@href='/account/login?ret=/']")
	private WebElement clickLogin;

	@FindBy(xpath = "//button[contains(@class,'_2AkmmA _1LctnI _7UHT_c')]")
	private WebElement loginButton;

	String exptactedTitle = "1Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";

	public LoginPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(DriverSetup.getDriver(), this);
	}

	public void navigateToURL(String arg1) {
		// TODO Auto-generated method stub
		DriverSetup.getDriver().get(arg1);
	}

	public void closeAnyChildBrowserOpened() {
		// TODO Auto-generated method stub
		String mainWindow = DriverSetup.getDriver().getWindowHandle();
		Set<String> cWindow = DriverSetup.getDriver().getWindowHandles();
		for (String string : cWindow) {
			if (!(string.equals(mainWindow))) {
				DriverSetup.getDriver().switchTo().window(string).close();
			}

		}
	}

	public void verifyTitle() {
		// TODO Auto-generated method stub
		String aTitle = DriverSetup.getDriver().getTitle();
		assertEquals(aTitle, exptactedTitle);

	}

	public void checkUserInLoginPage() {
		// TODO Auto-generated method stub
		DriverSetup.getDriver().switchTo().window(DriverSetup.getDriver().getWindowHandle());
	}

	public void sendUserName(String arg1) {
		// TODO Auto-generated method stub
		if (userName.isDisplayed()) {
			userName.sendKeys(arg1);
		} else {
			clickLogin.click();
			DriverSetup.wait = new WebDriverWait(DriverSetup.getDriver(), 10);
			DriverSetup.wait.until(ExpectedConditions.visibilityOf(userName)).sendKeys(arg1);
		}
	}

	public void sendPassword(String arg1) {
		// TODO Auto-generated method stub
		userPassword.sendKeys(arg1);
	}

	public void clickLoginButton() {
		// TODO Auto-generated method stub
		loginButton.click();
		
	}
}
