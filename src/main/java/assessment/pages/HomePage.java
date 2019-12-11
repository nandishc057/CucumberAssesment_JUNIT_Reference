package assessment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import assessment.generic.DriverSetup;
import assessment.generic.Utilities;

public class HomePage extends Utilities {
	private WebDriver driver;
	@FindBy(xpath = "//div[@class='Y5-ZPI']")
	private WebElement emptyClick;

	@FindBy(xpath = "(//div[@class='_1jA3uo']/div/div/span/div[@class='_2aUbKa'])[1]")
	private WebElement userMenu;

	@FindBy(xpath = "//ul//li[@class='_1-qoxT'][5]//following-sibling::li[5]")
	private WebElement logOut;

	public HomePage() {
		// TODO Auto-generated constructor stub
		driver=DriverSetup.getDriver();
		PageFactory.initElements(driver, this);
	}

	public void logout() throws InterruptedException {
		// TODO Auto-generated method stub
		DriverSetup.wait = new WebDriverWait(driver, 10);
		Actions action = new Actions(driver);
		// TODO Auto-generated method stub
		emptyClick.isDisplayed();
		driver.navigate().refresh();
		boolean visible = DriverSetup.wait.until(ExpectedConditions.visibilityOf(userMenu)).isDisplayed();
		if (visible) {
			action.moveToElement(userMenu);
			action.perform();
			System.out.println("mouse over action finished");
		}

		Thread.sleep(5000);

		DriverSetup.wait.until(ExpectedConditions.visibilityOf(logOut)).click();
		Thread.sleep(5000);
	}

}
