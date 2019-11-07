package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
public WebDriver driver;

	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@id=\"homepage\"]/div[5]/div[2]/div/div/div/span/div/div[7]/div/div/div[2]")
	WebElement popupCancel;
	
	@FindBy(linkText="Register")
	WebElement registerLink;
	
	@FindBy(xpath = "//*[@id = 'user_name']")
	WebElement fullName;
	
	@FindBy(xpath = "//*[@id = 'user_email']")
	WebElement email;
	
	@FindBy(xpath = "//*[@id = 'user_password']")
	WebElement password;
	
	@FindBy(xpath = "//*[@id = 'user_password_confirmation']")
	WebElement confirmPassword;
	
	@FindBy(xpath = "//*[@id = 'user_unsubscribe_from_marketing_emails']")
	WebElement AcceptPromotionalEmails;
	
	@FindBy(xpath = "//*[@id = 'user_agreed_to_terms']")
	WebElement AcceptTAndC;
	
	@FindBy(xpath = "//*[@name = 'commit']")
	WebElement SignUp;
	
	@FindBy(xpath = "//*[@id=\"new_user\"]/div[1]")
	WebElement AlertRegistrationMessage;
	
	public WebElement getAlertRegistrationMessage() {
		return AlertRegistrationMessage;
	}

	public WebElement getPopupCancel() {
		return popupCancel;
	}
	public WebElement getRegisterLink() {
		return registerLink;
	}
	public WebElement getFulName()
	{
		return fullName;
	}
	public WebElement getEmail()
	{
		return email;
	}
	public WebElement getpassword()
	{
		return password;
	}
	public WebElement getconfirmPassword()
	{
		return confirmPassword;
	}
	public WebElement getAcceptPromotionalEmails()
	{
		return AcceptPromotionalEmails;
	}
	public WebElement getAcceptTAndC()
	{
		return AcceptTAndC;
	}
	public WebElement getSignUp()
	{
		return SignUp;
	}
	

}
