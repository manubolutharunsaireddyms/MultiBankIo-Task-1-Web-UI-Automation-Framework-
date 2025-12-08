package base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class TestNGBase {

	public WebDriver driver;
	Properties prop = new Properties();

	@Parameters("browser")
	@BeforeClass
	public void setup(String browser) {
		driver = BrowserConfig.getDriver(browser);
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
