package Pages;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase  {

	public HomePage(WebDriver driver) {
		super(driver);
		jae = (JavascriptExecutor) driver;
		action = new Actions(driver);
	}
	@FindBy(linkText="Register")
	WebElement registerlink;

	@FindBy(linkText="Log in")
	WebElement LoginLink;

	@FindBy(linkText = "Contact us")
	WebElement ContactUsBTN;
	@FindBy(id="customerCurrency")
	WebElement customerCurrencyBtn;
	
	
	@FindBy(linkText = "Computers")
	WebElement computerMenu;
	@FindBy(linkText = "Notebooks")
	WebElement notebooks;
	public void openRegistrationPage()
	{

		clickButton(registerlink);

	}

	public void openLoginPage()
	{
		clickButton(LoginLink);	

	}
	public void openContactUspage() {
		scrollToButton();
		clickButton(ContactUsBTN);
	}
	public void ClickOnCurrencyBtn() {
		select = new Select(customerCurrencyBtn);
		select.selectByVisibleText("Euro");
	}
	public void notebooksMenu() {
		action
		.moveToElement(computerMenu)
		.moveToElement(notebooks)
		.click()
		.build()
		.perform();
	}
}
