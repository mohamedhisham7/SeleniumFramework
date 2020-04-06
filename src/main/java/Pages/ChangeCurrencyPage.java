package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangeCurrencyPage extends PageBase {

	public ChangeCurrencyPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(css="span.price-value-4")
	public WebElement priceValue;
}
