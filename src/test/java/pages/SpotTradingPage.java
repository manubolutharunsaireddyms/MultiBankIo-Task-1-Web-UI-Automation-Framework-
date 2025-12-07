package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.SafeActions;

public class SpotTradingPage extends SafeActions {

	@FindBy(xpath = "//span[contains(text(),'Spot')]")
	private WebElement spotHeading;
	@FindBy(xpath = "//button[@class='style_tab__xRtAF']//span")
	private List<WebElement> spotlist;
	@FindBy(xpath = "//div[@class='style_scroller__yxXrE style_scrollbar-hidden__0wuN_']//tr[@class='style_headers__CDSEu']//th//span")
	private List<WebElement> tradingdata;

	private WebDriver driver;

	public SpotTradingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String validateSpotTradeHeading() {
		String spotheadertext = null;
		try {
			spotheadertext = getText(driver, spotHeading);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return spotheadertext;
	}

	public List<String> validateSpotList() {
		List<String> spotitems = new ArrayList<>();
		try {
			for (int i = 0; i < spotlist.size(); i++) {
				spotitems.add(getText(driver, spotlist.get(i)));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return spotitems;
	}

	public List<String> validateSpotDataStructure() {
		List<String> dataitems = new ArrayList<>();
		try {
			for (int i = 0; i < tradingdata.size(); i++) {
				dataitems.add(getText(driver, tradingdata.get(i)));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return dataitems;
	}
}
