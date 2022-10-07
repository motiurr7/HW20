package BaseUtil;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;

public class BaseClass {
	WebDriver driver;
	protected HomePage homePage;
	
	@BeforeMethod
	public void setUp() {
	
		System.setProperty("webdriver.chrome.driver", "/Users/motiur/eclipse-workspace/HomeWork20/driver/chromedriver");
		//System.setProperty("webdriver.chrome.driver","‪‪/src/chromedriver‬‬");

		
		driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/");		
		homePage = new HomePage(driver);
	}

	
	
	@AfterMethod
	public void tearUp() {
		driver.quit();
	}
	
}
