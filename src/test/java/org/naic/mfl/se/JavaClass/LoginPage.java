package org.naic.mfl.se.JavaClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver ldriver) {
		super(ldriver);

	}

	@FindBy(how = How.LINK_TEXT, using = "Sign in")
	public WebElement login;
	@FindBy(how = How.ID, using = "email")
	public WebElement email;

	@FindBy(how = How.ID, using = "passwd")
	public WebElement password;

	@FindBy(id = "SubmitLogin")
	public WebElement sub;
}
