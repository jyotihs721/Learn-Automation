package testCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import operations.UIOperations;
import pageObjects.RegisterPage;

public class ExecuteCases extends UIOperations{
	
	RegisterPage reg;
	@BeforeTest
	public void driverInitilization()
	{
		super.driverInitilization();
		reg = new RegisterPage(driver);
	}
	
	@Test
	public void UserRegistrationWithInvalidDetails()
	{
		waitForElementToLoad(20);
		click(reg.getPopupCancel());
		click(reg.getRegisterLink());
		entertext(reg.getFulName(), "123");
		entertext(reg.getEmail(), "12@3.4");
		entertext(reg.getpassword(), "1");
		entertext(reg.getconfirmPassword(), "1");
		click(reg.getAcceptPromotionalEmails());
		click(reg.getAcceptTAndC());
		click(reg.getSignUp());
		getText(reg.getAlertRegistrationMessage());
	}

	@AfterTest
	public void CloseBrowser()
	{
		closeCurrentBroswer();
	}
}
