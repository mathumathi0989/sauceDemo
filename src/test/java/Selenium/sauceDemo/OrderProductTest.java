package Selenium.sauceDemo;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderProductTest {

	public WebDriver driver;
	
	@Test
	public void product_Order() {
		driver = base.driver;
		driver.get("https://www.saucedemo.com/");
		LoginPage lp = new LoginPage(driver);
		lp.login("standard_user", "secret_sauce");
		new AddToCartPage(driver).addToCart();
		new CheckoutPage(driver).checkout();
		new PersonalInfoPage(driver).personalInfo("Mathu", "Mathi", "07002");
		new BillingPage(driver).billing();
		OrderPage op = new OrderPage(driver);
		op.orderMessage();
		Assert.assertEquals(op.order_Message, "Your order has been dispatched, and will arrive just as fast as the pony can get there!");
		
	}
	
	
	
	
}
