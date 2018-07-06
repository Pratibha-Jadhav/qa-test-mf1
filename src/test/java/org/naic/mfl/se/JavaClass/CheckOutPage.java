package org.naic.mfl.se.JavaClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckOutPage extends BasePage {

	public CheckOutPage(WebDriver cdriver) {
		super(cdriver);
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img")
	public WebElement img1;

	@FindBy(how = How.NAME, using = "processCarrier")
	public WebElement processCarrier;

	@FindBy(id = "SubmitLogin")
	public WebElement sub;

	@FindBy(how = How.XPATH, using = "//li[@class='step_done step_done_last four']")
	public static WebElement ord1;
	@FindBy(how = How.XPATH, using = "//li[@id='step_end' and @class='step_current last']")
	public static WebElement ord2;
	@FindBy(how = How.XPATH, using = "//*[@class='cheque-indent']/strong")
	public static WebElement ord3;

	@FindBy(how = How.LINK_TEXT, using = "Women")
	public static WebElement Women;

	@FindBy(how = How.NAME, using = "Submit")
	public static WebElement submit;

	@FindBy(how = How.LINK_TEXT, using = "Proceed to checkout")
	public static WebElement checkout;
	@FindBy(how = How.NAME, using = "processAddress")
	public static WebElement processAddress;
	@FindBy(how = How.ID, using = "uniform")
	public static WebElement uniform;

	@FindBy(how = How.CLASS_NAME, using = "bankwire")
	public static WebElement bankwire;
	@FindBy(how = How.XPATH, using = "//*[@id='cart_navigation']/button")
	public static WebElement navi;
	
	@FindBy(how = How.CLASS_NAME, using = "fancybox-iframe")
	public static WebElement iframe_window;

}
