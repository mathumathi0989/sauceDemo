package Selenium.sauceDemo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SendEmail {

	public WebDriver driver;
	
	@Test
	public void email() throws Exception {
		driver = base.driver;
		driver.get("https://automationintesting.online/");
		base b = new base();
		b.scrollTolevel();
		new emailPage(driver).email_Verify("Mathu", "mathu@gmail.com", "20138828322", "request mail", "mail has been sent to");
	
		
	}
	
	
	
}
