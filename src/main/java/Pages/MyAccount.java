package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends PageBase {

	public MyAccount(WebDriver driver) {
		super(driver);


	}
	@FindBy(css="a.ico-account")
	WebElement myAccountBtn;
	@FindBy(linkText="Change password")
	WebElement changePasswordLink;
	@FindBy(id="OldPassword")
	WebElement oldPasswordLink;
	@FindBy(id="NewPassword")
	WebElement newPasswordLink;
	@FindBy(id="ConfirmNewPassword")
	WebElement confirmPasswordLink;
	@FindBy(css="input.button-1.change-password-button")
	WebElement changePasswordBtn;
	@FindBy(css="div.result")
	public WebElement passwordChangedMessage;


	public void openChangePasswordPage()
	{
		clickButton(changePasswordLink);
	}

	public void ChangePassword(String oldPassword, String newPassword, String confirmNewPassword)
	{
		SetTextElementText(oldPasswordLink, oldPassword);
		SetTextElementText(newPasswordLink, newPassword);
		SetTextElementText(confirmPasswordLink, confirmNewPassword);
		clickButton(changePasswordBtn);


	}

	public void openMyAccount() {
		clickButton(myAccountBtn);

	}


}
