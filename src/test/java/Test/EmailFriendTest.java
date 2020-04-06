package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.EmailFriendPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.SearchPage;

public class EmailFriendTest extends TestBase {
	EmailFriendPage emailFriendPg;
	HomePage homeobject;
	LoginPage loginobject;
	SearchPage searchpg;

	@Test
	public void UserCanSendEmail() {
		homeobject = new HomePage(driver);
		homeobject.openLoginPage();
		loginobject = new LoginPage(driver);
		loginobject.UserLogin("mohamed15@hotmail.com", "abc12345");
		searchpg = new SearchPage(driver);
		searchpg.productSearch("Apple MacBook Pro 13-inch");
		emailFriendPg = new EmailFriendPage(driver);
		emailFriendPg.ClickEmailFriend();
		emailFriendPg.SendEmailForFriend("yehia@yahoo.com","ABC");
		Assert.assertTrue(emailFriendPg.SuccessfullyMessage.getText().contains("Your message has been sent."));

	}

}
