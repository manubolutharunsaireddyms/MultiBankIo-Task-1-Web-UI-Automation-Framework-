package tests;

import java.util.List;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.TestNGBase;
import junit.framework.Assert;
import pages.HomePage;

public class NavigationTests extends TestNGBase {

	private HomePage homepage = null;

	@BeforeMethod
	public void setUp() {
		homepage = new HomePage(driver);
	}

	@Test
	public void testNavigtionItems() {
		try {
			List<String> data = homepage.navigationItems();
			String result = String.join(",", data);
			String items = getKey("navigation_items");
			Assert.assertEquals(items, result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testNavigationLinks() {
		try {
			String value = homepage.validateNavigation();
			Assert.assertEquals(getKey("market_page_heading"), value.strip());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
