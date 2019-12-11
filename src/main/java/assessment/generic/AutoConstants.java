package assessment.generic;

import java.util.Properties;

public interface AutoConstants {
	String geckoKey = "webdriver.gecko.driver";
	String geckoValue = "./src/main/resources/geckodriver.exe";
	String chromeKey = "webdriver.chrome.driver";
	String chromeValue = "./src/main/resources/chromedriver.exe";
//	Browser Settings
	String configFilePath = "./src/test/resources/config.properties";
//	Input data
	String dataPropertiesFile="./src/test/resources/data.properties";
	
	Properties config = new Properties();
	
}
