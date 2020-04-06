package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUs extends PageBase {

	public ContactUs(WebDriver driver) {
		super(driver);

	}
	@FindBy(id="FullName")
	WebElement fullNameTxt;
	@FindBy(id="Email")
	WebElement emailTxt;
	@FindBy(id="Enquiry")
	WebElement enquiryTxt;
	@FindBy(css="input.button-1.contact-us-button")
	WebElement submitBtn;
	@FindBy(css="div.result")	
	public WebElement successMessage;

	public void contactUs(String fullName , String email , String enquiry) {
		SetTextElementText(fullNameTxt, fullName);
		SetTextElementText(emailTxt, email);
		SetTextElementText(enquiryTxt, enquiry);
		clickButton(submitBtn);
	}
}

