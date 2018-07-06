package org.naic.mfl.se.JavaClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BasePage {
	
	WebDriver driver;
	public BasePage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(how = How.CLASS_NAME, using = "account")
	public static WebElement account;
	@FindBy(how = How.CLASS_NAME, using = "info-account")
	public static WebElement info_account;

	@FindBy(how = How.CLASS_NAME, using = "logout")
	public static WebElement logout;


}
