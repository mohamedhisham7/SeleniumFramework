package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddProductReview extends PageBase{

	public AddProductReview(WebDriver driver) {
		super(driver);
	}
	@FindBy(linkText = "Add your review")
	public WebElement addReviewBtn;
	@FindBy(id="AddProductReview_Title")
	WebElement reviewTitleTxt;
	@FindBy(id="AddProductReview_ReviewText")
	WebElement reviewTextTxt;
	@FindBy(id="addproductrating_4")
	WebElement radioBtn;
	@FindBy(css="input.button-1.write-product-review-button")
	WebElement submitBtn;
	@FindBy(css= "div.result")
	public WebElement successMessage;
	
	public void AddReviewButton() {
		clickButton(addReviewBtn);
	}

	public void UserCanAddReview(String reviewTitle , String reviewText ) {
		SetTextElementText(reviewTitleTxt, reviewTitle);
		SetTextElementText(reviewTextTxt, reviewText);
		clickButton(radioBtn);
		clickButton(submitBtn);
	}
}
