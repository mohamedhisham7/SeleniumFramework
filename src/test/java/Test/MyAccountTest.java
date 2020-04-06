package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.MyAccount;
import Pages.UserRegistrationPage;

public class MyAccountTest extends TestBase {
	HomePage homeobject;
	UserRegistrationPage registerobject;
	MyAccount myaccountobject;
	LoginPage loginobject ;
    

	@Test(priority=1)
	public void UserCanRegisterSuccessfully()
	{
		homeobject = new HomePage(driver);
		homeobject.openRegistrationPage();
		registerobject = new UserRegistrationPage(driver);
		registerobject.UserRegistration("Mohamed","Hisham","mohamed15@hotmail.com","abcd12345");
		Assert.assertTrue(registerobject.successmessage.getText().contains("Your registration completed"));
	}
	@Test(priority=2)
	public void RegisterUserCanChangedPassword()
	{
		myaccountobject = new MyAccount(driver);
		myaccountobject.openMyAccount();
		myaccountobject.openChangePasswordPage();
		myaccountobject.ChangePassword("abcd12345", "abc12345","abc12345");
		Assert.assertTrue(myaccountobject.passwordChangedMessage.getText().contains("Password was changed"));
	}
	
	@Test(priority=3)
	public void RegisteredUserCanLogout()
	{
		registerobject.userLogout();
	}
	
	@Test(priority=4)
	public void RegisteredUserCanLogin()
	{
		homeobject.openLoginPage();
		loginobject = new LoginPage(driver);
		loginobject.UserLogin("mohamed15@hotmail.com","abc12345");
		//Assert.assertTrue(registerobject.LogoutLink.getText().contains("Log out"));
	}

}


