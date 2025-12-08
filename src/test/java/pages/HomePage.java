package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import utils.SafeActions;

public class HomePage extends SafeActions {

	@FindBy(xpath = "//div[@class='style_menu-container__Ha_wV']//a")
	private List<WebElement> navigationItems1;
	@FindBy(xpath = "//div[@id='__next']//div[@class='style_menu-item__SLdA4']")
	private List<WebElement> navigationItems2;
	@FindBy(xpath = "//h1[contains(text(),'Trending assets')]")
	private WebElement marketpageheading;

	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	List<String> items = new ArrayList<>();

	public List<String> navigationItems() {
		try {
			items.add(getText(driver, navigationItems1.get(0)));
			items.add(getText(driver, navigationItems1.get(1)));
			items.add(getText(driver, navigationItems2.get(0)));
			items.add(getText(driver, navigationItems2.get(1)));
			items.add(getText(driver, navigationItems2.get(2)));
			items.add(getText(driver, navigationItems2.get(3)));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return items;
	}

	public String validateNavigation(String title) {
		try {
			click(driver, navigationItems1.get(1));
			waitUntilPageLoaded(driver,title);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver.getTitle();
	}
}
