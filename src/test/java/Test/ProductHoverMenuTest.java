package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;

public class ProductHoverMenuTest extends TestBase{
	HomePage homepage;
	@Test
	public void UserCanChooseNotebooks() {
		homepage = new HomePage(driver);
		homepage.notebooksMenu();
		Assert.assertTrue(driver.getCurrentUrl().contains("notebooks"));
	}
}
