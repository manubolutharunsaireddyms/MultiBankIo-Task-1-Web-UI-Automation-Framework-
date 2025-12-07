package base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class TestNGBase {

	public WebDriver driver;
	Properties prop = new Properties();

	@BeforeClass
	public void setup() {
		String browserName = getKey("browserName");
		switch (browserName.toLowerCase()) {
        case "chrome":
        	 	System.setProperty("webdriver.chrome.driver", ".//Drivers/chromedriver.exe");
            driver = new ChromeDriver();
            break;
        case "edge":
        		System.setProperty("webdriver.edge.driver", ".//Drivers/msedgedriver.exe");
            driver = new EdgeDriver();
            break;
        case "firefox":
        		System.setProperty("webdriver.gecko.driver", ".//Drivers/geckodriver.exe");
            driver = new FirefoxDriver();
            break;
        default:
            throw new IllegalArgumentException("Invalid Browser: " + browserName);
    }
		driver.get("https://trade.multibank.io/");
		driver.manage().window().maximize();
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	public String getKey(String key) {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(".//testdata//testdata.properties");
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}

}
