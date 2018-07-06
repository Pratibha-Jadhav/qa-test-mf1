package utility;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.naic.mfl.se.JavaClass.BasePage;

public class AssertCom {
	public static void assertData(BasePage page, String fullName) {
	
		 assertEquals(page.account.getText(), fullName);

		assertTrue(page.info_account.getText().contains("Welcome to your account."));
		assertTrue(page.logout.isDisplayed());
		assertTrue(BrowserFactory.driver.getCurrentUrl().contains("controller=my-account"));
	}

}
