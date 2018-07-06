package utility;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {

	static WebDriver driver;

	public static void sendkeys(WebDriver driver, WebElement element, int timeout) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));

	}

	public static void checkHeaderText(WebDriver driver, int timeout, String headerText) {

		WebElement heading = new WebDriverWait(driver, timeout)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1")));
		assertEquals(headerText, heading.getText());
	}

}
