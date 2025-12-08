package utils;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class SafeActions {

	public String getText(WebDriver driver, WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(element));
			Actions actions = new Actions(driver);
			actions.moveToElement(element).perform();
			highlightElement(driver, element);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return element.getText();
	}

	public void click(WebDriver driver, WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(element));
			highlightElement(driver, element);
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void highlightElement(WebDriver driver, WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].style.border='4px solid green'", element);
			js.executeScript("arguments[0].style.border=''", element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void scrollToBottom(WebDriver driver, WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String switchTo(WebDriver driver, WebElement element) {
		String text = null;
		try {
			String crr = driver.getWindowHandle();
			Set<String> brr = driver.getWindowHandles();
			for (String s : brr) {
				if (!s.equals(crr)) {
					driver.switchTo().window(s);
					text = getText(driver, element);
					driver.close();
					break;
				}
			}
			driver.switchTo().window(crr);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	
	public void waitUntilPageLoaded(WebDriver driver, String title)
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.titleContains(title));
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Assert.fail();
		}
	}
}
