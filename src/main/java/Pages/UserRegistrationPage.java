package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage extends PageBase {

	public UserRegistrationPage(WebDriver driver) {
		super(driver);

	}
	@FindBy(id="gender-male")
	WebElement genderRdoBtn;
	@FindBy(id="FirstName")
	WebElement fnTxtBox;
	@FindBy(id="LastName")
	WebElement lnTxtBox;
	@FindBy(id="Email")
	WebElement emailTxtBox;
	@FindBy(id="Password")
	WebElement passwordTxtBox ;
	@FindBy(id="ConfirmPassword")
	WebElement confirmpasswordTxtBox;
	@FindBy(id="register-button")
	WebElement registerBtn;
	@FindBy(css="div.result")
	public WebElement successmessage;

	@FindBy(linkText="Log out")
	public WebElement LogoutLink;

	@FindBy(linkText="My account")
	WebElement MyAccountLink;

	public void UserRegistration(String firstName , String lastName , String email , String password)
	{
		clickButton(genderRdoBtn);	
		SetTextElementText(fnTxtBox, firstName);
		SetTextElementText(lnTxtBox, lastName);
		SetTextElementText(emailTxtBox, email);
		SetTextElementText(passwordTxtBox, password);
		SetTextElementText(confirmpasswordTxtBox, password);
		clickButton(registerBtn);
	}

	public void UserNotRegistration(String firstName , String lastName , String email , String password ,String Password1)
	{
		clickButton(genderRdoBtn);	
		SetTextElementText(fnTxtBox, firstName);
		SetTextElementText(lnTxtBox, lastName);
		SetTextElementText(emailTxtBox, email);
		SetTextElementText(passwordTxtBox, password);
		SetTextElementText(confirmpasswordTxtBox, Password1);
		clickButton(registerBtn);
	}

	public void userLogout()
	{
		clickButton(LogoutLink);	
	}

	public void openMyAccountPage()
	{
		clickButton(MyAccountLink);	

	}
}


