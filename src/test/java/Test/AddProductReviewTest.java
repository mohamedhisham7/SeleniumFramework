package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.AddProductReview;
import Pages.HomePage;
import Pages.LoginPage;

public class AddProductReviewTest extends TestBase {
	HomePage homepage;
	LoginPage loginpage;
	SearchProductTest searchProductTest;
	AddProductReview addProductPg;
	@Test
	public void UserCanProductReview() {
		homepage = new HomePage(driver);
		homepage.openLoginPage();
		loginpage = new LoginPage(driver);
		loginpage.UserLogin("mohamed15@hotmail.com", "abc12345");
		searchProductTest = new SearchProductTest();
		searchProductTest.UserCanSearchForProducts();	
		addProductPg = new AddProductReview(driver);
		addProductPg.AddReviewButton();
		addProductPg.UserCanAddReview("ccc", "fff");
		Assert.assertTrue(addProductPg.successMessage.getText().contains("Product review is successfully added."));
		
	} 

}
