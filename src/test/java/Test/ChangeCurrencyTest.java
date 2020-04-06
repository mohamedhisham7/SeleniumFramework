package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.ChangeCurrencyPage;
import Pages.HomePage;

public class ChangeCurrencyTest extends TestBase{
	HomePage homepage;
	ChangeCurrencyPage changeCurrency;
	SearchProductTest searchProductTest;

	@Test
	public void UserCanChangeCurrency() {
		homepage = new HomePage(driver);
		homepage.ClickOnCurrencyBtn();
		searchProductTest = new SearchProductTest();
		searchProductTest.UserCanSearchForProducts();
		changeCurrency = new ChangeCurrencyPage(driver);
		Assert.assertTrue(changeCurrency.priceValue.getText().contains("Ђ"));

	}

}
