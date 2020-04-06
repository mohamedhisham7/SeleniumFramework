package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase {

	public SearchPage(WebDriver driver) {
		super(driver);


	}
	@FindBy(id="small-searchterms")
	WebElement searchTxtBox;
	@FindBy(css="input.button-1.search-box-button")
	WebElement searchBtn;
	@FindBy(css="input.button-1.search-button")
	WebElement productBtn;
	@FindBy(id="ui-id-2")
	WebElement productList;
	@FindBy(linkText="Apple MacBook Pro 13-inch")
	WebElement productBtn1;
	
	public void productSearch(String productName) {
		SetTextElementText(searchTxtBox, productName);
		clickButton(searchBtn);
		clickButton(productBtn1);

		  

		

	}


}
