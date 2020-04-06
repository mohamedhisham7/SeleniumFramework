package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends PageBase {

	public ProductDetailsPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(css="strong.current-item")
	public WebElement productNameRedCrumb;
	@FindBy(id="add-to-cart-button-4")
	public WebElement clickAddToCardBtn;
	@FindBy(linkText = "shopping cart")
	public WebElement flicker;
	@FindBy(id="termsofservice")
	public WebElement RadioBtnagree;
	@FindBy(id="checkout")
	public WebElement checkOutBtn;
	
	public void ClickAddToCard() {
		clickButton(clickAddToCardBtn);
		clickButton(flicker);
	}
	public void shoppingPage() {
		clickButton(RadioBtnagree);
	}
	public void checkOutButton() {
		clickButton(checkOutBtn);
	}
}
