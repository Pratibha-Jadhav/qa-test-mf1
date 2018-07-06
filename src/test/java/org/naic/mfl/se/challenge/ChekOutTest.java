package org.naic.mfl.se.challenge;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import utility.PageConstant;
import utility.WaitUtility;

public class ChekOutTest extends BaseTest {

	@Test
	public void checkoutTest() {

		super.clickLogin();
		WaitUtility.checkHeaderText(driver, 5, "MY ACCOUNT");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Women"))).click();
		checkOutPage.img1.click();

		driver.switchTo().frame(checkOutPage.iframe_window);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PageConstant.Submit_Button))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(PageConstant.Check_Out))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(PageConstant.Check_Out))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(PageConstant.Process_Address))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(PageConstant.Uniform_CGV))).click();
		checkOutPage.processCarrier.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(PageConstant.Bankwire))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PageConstant.Cart_Navigation)))
				.click();
		WaitUtility.checkHeaderText(driver, 5, PageConstant.Order_Confirmation);
		assertTrue(checkOutPage.ord1.isDisplayed());
		assertTrue(checkOutPage.ord2.isDisplayed());
		assertTrue(checkOutPage.ord3.getText().contains(PageConstant.Order_Complete));
		assertTrue(driver.getCurrentUrl().contains(PageConstant.Controller_Order_Confirmation));

	}

}
