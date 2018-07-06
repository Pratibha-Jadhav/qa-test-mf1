package org.naic.mfl.se.challenge;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.AssertCom;
import utility.WaitUtility;

public class LoginTest extends BaseTest {
	
	@BeforeTest
	public void setUp() {
		super.setUp();
	}

	@Test
	public void chekForUser() {
		super.clickLogin();
		WaitUtility.checkHeaderText(driver, 5, "MY ACCOUNT");
		AssertCom.assertData(loginPage, "mfl sqe");
	}

}
