package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestNGBase;
import junit.framework.Assert;
import pages.ContentPage;

public class ContentTest extends TestNGBase {
	private ContentPage contentpage = null;

	@BeforeMethod
	public void setUp() {
		contentpage = new ContentPage(driver);
	}

	@Test
	public void testBannerImage() {
		try {
			boolean flag = contentpage.validateBannerImages();
			Assert.assertEquals(true, flag);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testAppleStore() {
		try {
			String value = contentpage.validateAppleStrore();
			Assert.assertEquals(getKey("applestore").strip(), value.strip());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGoogleStore() {
		try {
			String value = contentpage.validateGooogleStrore();
			Assert.assertEquals(getKey("googlestore").strip(), value.strip());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
