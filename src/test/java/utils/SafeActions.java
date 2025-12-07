package utils;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
			js.executeScript("arguments[0].style.border='3px solid green'", element);
			js.executeScript("arguments[0].style.border=''", element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
