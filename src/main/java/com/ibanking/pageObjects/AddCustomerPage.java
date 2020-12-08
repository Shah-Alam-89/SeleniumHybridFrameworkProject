package com.ibanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

	WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using ="/html/body/div[3]/div/ul/li[2]/a")
	@CacheLookup
	WebElement lnkNewCustomer;

	@FindBy(how = How.NAME, using = "name")
	@CacheLookup
	WebElement txtCustomerName;

	@FindBy(how = How.NAME, using = "rad1")
	@CacheLookup
	WebElement rdGender;

	@CacheLookup
	@FindBy(how = How.ID_OR_NAME, using = "dob")
	WebElement txtDoB;

	@CacheLookup
	@FindBy(how = How.NAME, using = "addr")
	WebElement txtAddress;

	@CacheLookup
	@FindBy(how = How.NAME, using = "city")
	WebElement txtCity;

	@CacheLookup
	@FindBy(how = How.NAME, using = "state")
	WebElement txtState;

	@CacheLookup
	@FindBy(how = How.NAME, using = "pinno")
	WebElement txtPIN;

	@CacheLookup
	@FindBy(how = How.NAME, using = "telephoneno")
	WebElement txtMobileNo;

	@CacheLookup
	@FindBy(how = How.NAME, using = "emailid")
	WebElement txtEmailId;

	@CacheLookup
	@FindBy(how = How.NAME, using = "password")
	WebElement txtPassword;

	@CacheLookup
	@FindBy(how = How.NAME, using = "sub")
	WebElement btnSubmit;
	
	public void clickAddNewCustomer() {
		lnkNewCustomer.click();
			
	}

	public void setCustomerName(String custName) {
		txtCustomerName.sendKeys(custName);
		
	}

	public void setCustomerGender(String custGender) {
		rdGender.click();
	}

	public void setCustomerDoB(String month,String day,String year) {
		txtDoB.sendKeys(month);
		txtDoB.sendKeys(day);
		txtDoB.sendKeys(year);
		
	}

	public void setCustomerAddress(String custAddress) {
		txtAddress.sendKeys(custAddress);
	}

	public void setCustomerCity(String custCity) {
		txtCity.sendKeys(custCity);
	}

	public void setCustomerState(String custState) {
		txtState.sendKeys(custState);
	}

	public void setCustomerPIN(String custPin) {
		txtPIN.sendKeys(String.valueOf(custPin));
	}

	public void setCustomerMobileNo(String custMobile) {
		txtMobileNo.sendKeys(custMobile);
	}

	public void setCustomerEmailId(String custEmailId) {
		txtEmailId.sendKeys(custEmailId);
	}

	public void setCustomerPassword(String custPassword) {
		txtPassword.sendKeys(custPassword);
	}

	public void clickSubmitButton() {
		btnSubmit.click();
	}
	
	
	
}