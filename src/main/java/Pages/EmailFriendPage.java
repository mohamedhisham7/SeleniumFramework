package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailFriendPage extends PageBase {

	public EmailFriendPage(WebDriver driver) {
		super(driver);

	}
	@FindBy(id="FriendEmail")
	WebElement friendsEmailTxt;
	@FindBy(id="PersonalMessage")
	WebElement PersonalMessageTxt;
	@FindBy(css ="input.button-1.send-email-a-friend-button")
	WebElement SendEmailBtn;
	@FindBy(css ="div.result")
	public WebElement SuccessfullyMessage;
	@FindBy(css="div.email-a-friend")
	public WebElement emailFriendBtn; 
	
	public void ClickEmailFriend() {
		clickButton(emailFriendBtn);
	}
	public void SendEmailForFriend(String friendMail, String personalMessage) {
		SetTextElementText(friendsEmailTxt, friendMail );
		SetTextElementText(PersonalMessageTxt, personalMessage);
		clickButton(SendEmailBtn);
	}
}
