package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.ContactUs;
import Pages.HomePage;

public class ContactUsTest extends TestBase {
	HomePage home;
	ContactUs contactPage;
	String email = "mohamed14@hotmail.com";
	String fullName = "test user";
	String enquiry = "done";

	@Test
	public void UserCanUseContactUs() {
		home = new HomePage(driver);
		home.openContactUspage();
		contactPage = new ContactUs(driver);
		contactPage.contactUs(fullName, email, enquiry);
		Assert.assertTrue(contactPage.successMessage.getText().contains("Your enquiry has been successfully sent to the store owner"));

	}
}

