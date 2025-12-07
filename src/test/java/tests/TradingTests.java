package tests;

import java.util.List;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestNGBase;
import junit.framework.Assert;
import pages.SpotTradingPage;

public class TradingTests extends TestNGBase {
	private SpotTradingPage spotpage = null;

	@BeforeMethod
	public void setUp() {
		spotpage = new SpotTradingPage(driver);
	}

	@Test
	public void testSpotHeading() {
		try {
			Assert.assertEquals(getKey("trade_heading").strip(), spotpage.validateSpotTradeHeading().strip());
			List<String> data = spotpage.validateSpotList();
			String result = String.join(",", data);
			String items = getKey("spot_list");
			Assert.assertEquals(items, result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testSpotDataStructure() {
		try {
			List<String> data = spotpage.validateSpotDataStructure();
			String result = String.join(",", data);
			String items = getKey("spot_data_structure");
			Assert.assertEquals(items, result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
