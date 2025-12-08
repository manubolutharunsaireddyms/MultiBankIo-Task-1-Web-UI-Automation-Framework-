package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserConfig {

	public static WebDriver getDriver(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".//Drivers/chromedriver.exe");
			return new ChromeDriver();
		}

		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".//Drivers/geckodriver.exe");
			return new FirefoxDriver();
		}

		if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", ".//Drivers/msedgedriver.exe");
			return new EdgeDriver();
		}

		throw new IllegalArgumentException("Invalid browser: " + browser);
	}
}
