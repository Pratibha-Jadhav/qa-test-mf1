package org.naic.mfl.se.challenge;

import java.util.Date;

import org.naic.mfl.se.JavaClass.SignInPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.AssertCom;
import utility.BrowserFactory;
import utility.WaitUtility;

public class SignInTest extends BaseTest {

	@Test
	public void signInTest() {
		String fullName = "Firstname Lastname";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("login"))).click();
		String timestamp = String.valueOf(new Date().getTime());
		String email = "hf_challenge_" + timestamp + "@hf" + timestamp.substring(7) + ".com";
		signInPage.email_1.sendKeys(email);
		String name = "Firstname";
		String surname = "Lastname";
		signInPage.screate.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_gender2"))).click();
		signInPage.customer_firstname.sendKeys(name);
		signInPage.customer_lastname.sendKeys(surname);
		signInPage.passwd.sendKeys("Qwerty");
		Select select = new Select(signInPage.days);
		select.selectByValue("1");
		select = new Select(signInPage.month);
		select.selectByValue("1");
		select = new Select(signInPage.year);
		select.selectByValue("2000");
		signInPage.company.sendKeys("Company");
		signInPage.address1.sendKeys("Qwerty, 123");
		signInPage.address2.sendKeys("zxcvb");
		signInPage.city.sendKeys("Qwerty");
		select = new Select(signInPage.state);
		select.selectByVisibleText("Colorado");
		signInPage.postcode.sendKeys("12345");
		signInPage.other.sendKeys("Qwerty");
		signInPage.phone.sendKeys("12345123123");
		signInPage.phone_mobile.sendKeys("12345123123");
		signInPage.alias.sendKeys("hf");
		signInPage.submitAccount.click();
		 WaitUtility.checkHeaderText(driver, 5,"MY ACCOUNT");
		AssertCom.assertData(signInPage, fullName);
	}
	
	
}
