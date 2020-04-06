package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.ProductDetailsPage;
import Pages.SearchPage;

public class SearchProductTest extends TestBase {

	String productName = "Apple MacBook Pro 13-inch";
	SearchPage searchObject;
	ProductDetailsPage detailsObject;
	@Test
	public void UserCanSearchForProducts() {
		searchObject = new SearchPage(driver);
		searchObject.productSearch(productName);
		//detailsObject = new ProductDetailsPage(driver);
		//searchObject.ClickSearchButton();
		//Assert.assertTrue(detailsObject.productNameRedCrumb.getText().equalsIgnoreCase("productName"));
		
	}
}
