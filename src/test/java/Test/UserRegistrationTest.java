package Test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserRegistrationPage;

public class UserRegistrationTest extends TestBase {
	HomePage homeobject;
	UserRegistrationPage registerobject;
//	UserRegistrationPage notregisterobject;
	LoginPage loginobject ;

	@Test(priority=1,alwaysRun = true)
	public void UserCanRegisterSuccessfully()
	{
		homeobject = new HomePage(driver);
		homeobject.openRegistrationPage();
		registerobject = new UserRegistrationPage(driver);
		registerobject.UserRegistration("Mohamed","Hisham","mohamed7@hotmail.com","abcd12345");
		Assert.assertTrue(registerobject.successmessage.getText().contains("Your registration completed"));
	}
	//@Test(priority=2)
	//public void UserCanNotRegisterSuccessfully()
	//{
		//homeobject = new HomePage(driver);
		//homeobject.openRegistrationPage();
		//notregisterobject = new UserRegistrationPage(driver);
		//notregisterobject.UserNotRegistration("Mohamed","Hisham","abc@yahoo.com","abcd1234","abcd12345");
	//}

	@Test(dependsOnMethods = ("UserCanRegisterSuccessfully"))
	public void RegisteredUserCanLogout()
	{
		registerobject.userLogout();
	}
	
	@Test(dependsOnMethods = ("RegisteredUserCanLogout"))
	public void RegisteredUserCanLogin()
	{
		homeobject.openLoginPage();
		loginobject = new LoginPage(driver);
		loginobject.UserLogin("mohamed7@hotmail.com","abcd1234");
		Assert.assertTrue(registerobject.LogoutLink.getText().contains("Log out"));
	}

}


