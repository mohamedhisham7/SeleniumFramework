package Test;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProductDetailsPage;
import Pages.SearchPage;

public class RegisteredUserCheckoutProduct extends TestBase {
	HomePage homepage;
	LoginPage loginpage;
	MyAccountTest myaccounttest;
	String productName = "Apple MacBook Pro 13-inch";
	SearchPage searchObject;
	ProductDetailsPage productpagedetails;
	@Test
	public void UserCanCheckOut() {
		homepage = new HomePage(driver);
		homepage.openLoginPage();
		loginpage = new LoginPage(driver);
		loginpage.UserLogin("mohamed15@hotmail.com","abc12345");
		searchObject = new SearchPage(driver);
		searchObject.productSearch(productName);
		productpagedetails = new ProductDetailsPage(driver);
		productpagedetails.ClickAddToCard();
		productpagedetails.shoppingPage();




	}
}
