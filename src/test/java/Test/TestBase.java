package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;

import Utilities.Helper;

public class TestBase {
	public static WebDriver driver;
	@BeforeSuite
	@org.testng.annotations.Parameters({"browser"})
	public void startdriver(@Optional("chrome")String browserName)
	{

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("fireofox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}



		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.navigate().to("https://demo.nopcommerce.com/register?returnUrl=%2F");
	}

	@AfterSuite
	public void stopdriver()
	{
		driver.quit();	
	}
	@AfterMethod
	public void screenShotOnFailure(ITestResult result)
	{
		if (result.getStatus()==ITestResult.FAILURE) {
			System.out.println("Failure");
			System.out.println("Taking ScreenShot...");
			Helper.captureScreenShot(driver, result.getName());
		}	
	}
}



