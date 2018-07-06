package org.naic.mfl.se.challenge;

import org.naic.mfl.se.JavaClass.CheckOutPage;
import org.naic.mfl.se.JavaClass.LoginPage;
import org.naic.mfl.se.JavaClass.SignInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

import utility.BrowserFactory;

public class BaseTest {

	static WebDriver driver;
	LoginPage loginPage;
	WebDriverWait wait;
	

	public void setUp() {
		driver = BrowserFactory.start_Browser("chrome", "http://automationpractice.com/index.php");
		wait = new WebDriverWait(driver, 30);
	}

	public void clickLogin() {
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		String existingUserEmail = "mflsqe@naic.org";
		String existingUserPassword = "mflsqe1234";
		loginPage.login.click();
		loginPage.email.sendKeys(existingUserEmail);
		loginPage.password.sendKeys(existingUserPassword);
		loginPage.sub.click();

	}
	
	@AfterTest
	public void closeWindow() {
		driver.close();
	}

}
