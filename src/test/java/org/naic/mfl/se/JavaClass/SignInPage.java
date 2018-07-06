package org.naic.mfl.se.JavaClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInPage extends BasePage {

	public SignInPage(WebDriver sdriver) {
		super(sdriver);
	}

	@FindBy(how = How.ID, using = "email_create")
	public WebElement email_1;
	@FindBy(how = How.ID, using = "SubmitCreate")
	public WebElement screate;
	@FindBy(how = How.ID, using = "customer_firstname")
	public WebElement customer_firstname;
	@FindBy(how = How.ID, using = "customer_lastname")
	public WebElement customer_lastname;
	@FindBy(how = How.ID, using = "passwd")
	public WebElement passwd;
	@FindBy(how = How.ID, using = "days")
	public WebElement days;
	@FindBy(how = How.ID, using = "months")
	public WebElement month;
	@FindBy(how = How.ID, using = "years")
	public WebElement year;
	@FindBy(how = How.ID, using = "company")
	public WebElement company;
	@FindBy(how = How.ID, using = "address1")
	public WebElement address1;
	@FindBy(how = How.ID, using = "address2")
	public WebElement address2;
	@FindBy(how = How.ID, using = "city")
	public WebElement city;
	@FindBy(how = How.ID, using = "id_state")
	public WebElement state;
	@FindBy(how = How.ID, using = "postcode")
	public WebElement postcode;
	@FindBy(how = How.ID, using = "other")
	public WebElement other;
	@FindBy(how = How.ID, using = "phone")
	public WebElement phone;
	@FindBy(how = How.ID, using = "phone_mobile")
	public WebElement phone_mobile;

	@FindBy(how = How.ID, using = "alias")
	public WebElement alias;
	@FindBy(how = How.ID, using = "submitAccount")
	public WebElement submitAccount;

}