package com.ibanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ibanking.pageObjects.LoginPage;

public class TC_LoginPageTest_001 extends BaseClass {

	@Test
	public void loginTest() throws IOException {

		logger.info("Url is opened");

		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username");

		lp.setPassword(password);
		logger.info("Entered password");

		lp.clickLoginButton();
		logger.info("Clicked on Login button");

		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("Test case passed");

		} 
		else 
		{
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("Test case failed");

		}

	}

}
