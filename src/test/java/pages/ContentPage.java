package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.SafeActions;

public class ContentPage extends SafeActions {

	@FindBy(xpath = "//img[@alt='Banner image']")
	private WebElement bannerImages;
	@FindBy(xpath = "//div[@class='style_app-button___ydaJ']")
	private List<WebElement> appstore;
	@FindBy(xpath = "//span[@id='platform-selector-text']")
	private WebElement applestrore;
	@FindBy(xpath = "//a[@aria-label='Google Play logo']//span")
	private WebElement googlestrore;
	@FindBy(xpath = "//div[contains(text(),'Why Multibank?')]")
	private WebElement whymultibank;
	private WebDriver driver;
	@FindBy(xpath = "//div[@id='__next']//div[@class='style_menu-item__SLdA4']")
	private List<WebElement> navigationItems;
	@FindBy(xpath = "//div[@class='style_menu-container__Ha_wV']//a")
	private List<WebElement> navigationItems1;

	public ContentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean validateBannerImages() {
		boolean flag = true;
		try {
			scrollToBottom(driver, bannerImages);
			highlightElement(driver, bannerImages);
			if (!bannerImages.isEnabled()) {
				flag = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	public String validateAppleStrore() {
		String text = null;
		try {
			click(driver, appstore.get(0));
			text = switchTo(driver, applestrore);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}

	public String validateGooogleStrore() {
		String text = null;
		try {
			click(driver, appstore.get(1));
			text = switchTo(driver, googlestrore);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
}
