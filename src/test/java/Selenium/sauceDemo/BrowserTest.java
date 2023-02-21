package Selenium.sauceDemo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BrowserTest extends base {

	
	
	@BeforeSuite
	public void setup() {
	base.driver = browserlaunch();
	}
	
	
	
	@AfterSuite
	public void tearDown() {
		driver.close();
	}
}
