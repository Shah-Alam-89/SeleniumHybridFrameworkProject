package com.ibanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ibanking.pageObjects.AddCustomerPage;
import com.ibanking.pageObjects.LoginPage;


public class TC_AddCustomerTest_003 extends BaseClass
{

	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickLoginButton();
		
		Thread.sleep(3000);
		
		AddCustomerPage addCustomer=new AddCustomerPage(driver);
		
		addCustomer.clickAddNewCustomer();
		
		logger.info("Providing Customer Details....");
		
		
		addCustomer.setCustomerName("Shah Alam");
		addCustomer.setCustomerGender("male");
		addCustomer.setCustomerDoB("10","15","1989");
		Thread.sleep(5000);
		addCustomer.setCustomerAddress("Bangladesh");
		addCustomer.setCustomerCity("Dhaka");
		addCustomer.setCustomerState("Malibag");
		addCustomer.setCustomerPIN("116636");
		addCustomer.setCustomerMobileNo("01763019493");
		
		String email=randomeString()+"@gmail.com";
		addCustomer.setCustomerEmailId(email);
		addCustomer.setCustomerPassword("abcdef");
		addCustomer.clickSubmitButton();
		
		Thread.sleep(3000);
		
		logger.info("Validation started....");
		
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test case passed");
			
		}
		else
		{
			logger.info("Test case failed");
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
		}
			
	}
	
	
}
