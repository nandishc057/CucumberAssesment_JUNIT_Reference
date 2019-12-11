package assessment.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverSetup implements AutoConstants {

	private static DriverSetup sDriver;
	public static WebDriverWait wait;
	public static WebDriver driver;

	private DriverSetup() {
		System.setProperty(chromeKey, chromeValue);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void initDriver() {
		if (sDriver == null) {
			sDriver = new DriverSetup();
		}
	}

	public static void tearDown() {
		if (driver != null) {
            driver.close();
            driver.quit();
		}
	sDriver=null;
	}

}
